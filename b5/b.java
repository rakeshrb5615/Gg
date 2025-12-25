package b5;
public final synthetic class b implements b5.h, z2.b {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic long c;
    public final synthetic Object d;
    public final synthetic Object e;

    public synthetic b(b5.g p1, Object p2, long p3, java.util.concurrent.TimeUnit p5, int p6)
    {
        this.a = p6;
        this.b = p1;
        this.e = p2;
        this.c = p3;
        this.d = p5;
        return;
    }

    public synthetic b(o5.d p2, Iterable p3, r2.j p4, long p5)
    {
        this.a = 2;
        this.b = p2;
        this.e = p3;
        this.d = p4;
        this.c = p5;
        return;
    }

    public java.util.concurrent.ScheduledFuture a(l6.c p7)
    {
        switch (this.a) {
            case 0:
                long v0_6 = ((b5.g) this.b);
                return v0_6.b.schedule(new b5.e(v0_6, ((Runnable) this.e), p7, 1), this.c, ((java.util.concurrent.TimeUnit) this.d));
            default:
                long v0_3 = ((b5.g) this.b);
                return v0_3.b.schedule(new b5.f(v0_3, ((java.util.concurrent.Callable) this.e), p7), this.c, ((java.util.concurrent.TimeUnit) this.d));
        }
    }

    public Object b()
    {
        Throwable v0_1 = ((o5.d) this.b);
        android.database.sqlite.SQLiteStatement v1_4 = ((Iterable) this.e);
        r2.j v2_1 = ((r2.j) this.d);
        y2.h v3_2 = ((y2.h) ((y2.d) v0_1.c));
        v3_2.getClass();
        if (v1_4.iterator().hasNext()) {
            u2.c v4_3 = new StringBuilder("UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ");
            v4_3.append(y2.h.z(v1_4));
            android.database.sqlite.SQLiteStatement v1_2 = v4_3.toString();
            long v6_1 = v3_2.c();
            v6_1.beginTransaction();
            try {
                v6_1.compileStatement(v1_2).execute();
                android.database.sqlite.SQLiteStatement v1_5 = v6_1.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", 0);
                try {
                    while (v1_5.moveToNext()) {
                        v3_2.x(((long) v1_5.getInt(0)), u2.c.f, v1_5.getString(1));
                    }
                } catch (Throwable v0_2) {
                    v1_5.close();
                    throw v0_2;
                }
                v1_5.close();
                v6_1.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                v6_1.setTransactionSuccessful();
                v6_1.endTransaction();
            } catch (Throwable v0_3) {
                v6_1.endTransaction();
                throw v0_3;
            }
        }
        v3_2.i(new y2.e((((a3.a) v0_1.g).b() + this.c), v2_1));
        return 0;
    }
}
