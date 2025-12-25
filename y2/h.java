package y2;
public final class h implements y2.d, z2.c, y2.c {
    public static final o2.c f;
    public final y2.j a;
    public final a3.a b;
    public final a3.a c;
    public final y2.a d;
    public final g7.a e;

    static h()
    {
        y2.h.f = new o2.c("proto");
        return;
    }

    public h(a3.a p1, a3.a p2, y2.a p3, y2.j p4, g7.a p5)
    {
        this.a = p4;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = p5;
        return;
    }

    public static Object A(android.database.Cursor p0, y2.f p1)
    {
        try {
            Throwable v1_1 = p1.apply(p0);
            p0.close();
            return v1_1;
        } catch (Throwable v1_2) {
            p0.close();
            throw v1_2;
        }
    }

    public static Long f(android.database.sqlite.SQLiteDatabase p11, r2.j p12)
    {
        long v0_1 = new StringBuilder("backend_name = ? and priority = ?");
        java.util.ArrayList v1_1 = new java.util.ArrayList(java.util.Arrays.asList(new String[] {p12.a, String.valueOf(b3.a.a(p12.c))})));
        Long v12_1 = p12.b;
        if (v12_1 == null) {
            v0_1.append(" and extras is null");
        } else {
            v0_1.append(" and extras = ?");
            v1_1.add(android.util.Base64.encodeToString(v12_1, 0));
        }
        Long v12_5 = new String[0];
        android.database.Cursor v11_1 = p11.query("transport_contexts", new String[] {"_id"}), v0_1.toString(), ((String[]) v1_1.toArray(v12_5)), 0, 0, 0);
        try {
            Long v12_8;
            if (v11_1.moveToNext()) {
                v12_8 = Long.valueOf(v11_1.getLong(0));
            } else {
                v12_8 = 0;
            }
        } catch (long v0_3) {
            Long v12_9 = v0_3;
            v11_1.close();
            throw v12_9;
        }
        v11_1.close();
        return v12_8;
    }

    public static String z(Iterable p3)
    {
        StringBuilder v0_1 = new StringBuilder("(");
        String v3_2 = p3.iterator();
        while (v3_2.hasNext()) {
            v0_1.append(((y2.b) v3_2.next()).a);
            if (v3_2.hasNext()) {
                v0_1.append(44);
            }
        }
        v0_1.append(41);
        return v0_1.toString();
    }

    public final android.database.sqlite.SQLiteDatabase c()
    {
        z2.a v0_0 = this.a;
        java.util.Objects.requireNonNull(v0_0);
        String v1_1 = this.c;
        long v2 = v1_1.b();
        try {
            while(true) {
                v0_0 = v0_0.getWritableDatabase();
                return v0_0;
                android.os.SystemClock.sleep(50);
            }
            throw new z2.a("Timed out while trying to open db.", long v4_1);
        } catch (long v4_1) {
            if (v1_1.b() < (((long) this.d.c) + v2)) {
            }
        }
    }

    public final void close()
    {
        this.a.close();
        return;
    }

    public final Object i(y2.f p2)
    {
        android.database.sqlite.SQLiteDatabase v0 = this.c();
        v0.beginTransaction();
        try {
            Throwable v2_1 = p2.apply(v0);
            v0.setTransactionSuccessful();
            v0.endTransaction();
            return v2_1;
        } catch (Throwable v2_2) {
            v0.endTransaction();
            throw v2_2;
        }
    }

    public final java.util.ArrayList s(android.database.sqlite.SQLiteDatabase p24, r2.j p25, int p26)
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        android.database.Cursor v1_1 = y2.h.f(p24, p25);
        if (v1_1 != null) {
            y2.h v4 = "timestamp_ms";
            String v6 = "payload_encoding";
            String v8 = "code";
            String v10 = "product_id";
            y2.h.A(p24.query("events", new String[] {"_id", "experiment_ids_encrypted_blob"}), "context_id = ?", new String[] {v1_1.toString()}), 0, 0, 0, String.valueOf(p26)), new h5.a(this, v0_1, p25, 8));
            return v0_1;
        } else {
            return v0_1;
        }
    }

    public final void x(long p2, u2.c p4, String p5)
    {
        this.i(new d5.a(p5, p4, p2));
        return;
    }

    public final Object y(z2.b p10)
    {
        String v0_0 = this.c();
        a3.a v1 = this.c;
        long v2 = v1.b();
        try {
            while(true) {
                v0_0.beginTransaction();
                Throwable v10_3 = p10.b();
                v0_0.setTransactionSuccessful();
                v0_0.endTransaction();
                return v10_3;
                android.os.SystemClock.sleep(50);
            }
            throw new z2.a("Timed out while trying to acquire the lock.", long v4_1);
        } catch (long v4_1) {
            if (v1.b() < (((long) this.d.c) + v2)) {
            }
        }
        try {
            v10_3 = p10.b();
            v0_0.setTransactionSuccessful();
            v0_0.endTransaction();
            return v10_3;
        } catch (Throwable v10_4) {
            v0_0.endTransaction();
            throw v10_4;
        }
    }
}
