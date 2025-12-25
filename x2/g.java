package x2;
public final synthetic class g implements z2.b {
    public final synthetic int a;
    public final synthetic o5.d b;
    public final synthetic r2.j c;

    public synthetic g(o5.d p1, r2.j p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final Object b()
    {
        switch (this.a) {
            case 0:
                Throwable v0_4 = this.c;
                Throwable v1_9 = ((y2.h) ((y2.d) this.b.c));
                android.database.sqlite.SQLiteDatabase v2_1 = v1_9.c();
                v2_1.beginTransaction();
                try {
                    Throwable v0_6;
                    Throwable v0_1 = y2.h.f(v2_1, v0_4);
                } catch (Throwable v0_7) {
                    v2_1.endTransaction();
                    throw v0_7;
                }
                if (v0_1 != null) {
                    Throwable v0_5 = v1_9.c().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[] {v0_1.toString()}));
                    try {
                        Throwable v1_2 = Boolean.valueOf(v0_5.moveToNext());
                    } catch (Throwable v1_3) {
                        v0_5.close();
                        throw v1_3;
                    }
                    v0_5.close();
                    v0_6 = v1_2;
                } else {
                    v0_6 = Boolean.FALSE;
                }
                v2_1.setTransactionSuccessful();
                v2_1.endTransaction();
                return v0_6;
            default:
                Throwable v0_11 = ((y2.h) ((y2.d) this.b.c));
                v0_11.getClass();
                return ((Iterable) v0_11.i(new a5.u(12, v0_11, this.c)));
        }
    }
}
