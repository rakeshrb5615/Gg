package d5;
public final synthetic class a implements c6.a, com.google.android.gms.tasks.Continuation, z2.b, y2.f {
    public final synthetic long a;
    public final synthetic Object b;
    public final synthetic Object c;

    public synthetic a(Object p1, long p2, Object p4)
    {
        this.b = p1;
        this.a = p2;
        this.c = p4;
        return;
    }

    public synthetic a(Object p1, Object p2, long p3)
    {
        this.b = p1;
        this.c = p2;
        this.a = p3;
        return;
    }

    public void a(c6.b p5)
    {
        ((d5.b) p5.get()).d(((String) this.b), this.a, ((j5.k1) this.c));
        return;
    }

    public Object apply(Object p8)
    {
        String[] v0_1 = ((String) this.b);
        String v1_5 = ((u2.c) this.c).a;
        int v2_0 = ((android.database.sqlite.SQLiteDatabase) p8).rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[] {v0_1, Integer.toString(v1_5)}));
        try {
            String v3_2;
            if (v2_0.getCount() <= 0) {
                v3_2 = 0;
            } else {
                v3_2 = 1;
            }
        } catch (Throwable v8_1) {
            v2_0.close();
            throw v8_1;
        }
        v2_0.close();
        String v4_0 = this.a;
        if (v3_2 != null) {
            String v3_4 = new StringBuilder("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ");
            v3_4.append(v4_0);
            v3_4.append(" WHERE log_source = ? AND reason = ?");
            ((android.database.sqlite.SQLiteDatabase) p8).execSQL(v3_4.toString(), new String[] {v0_1, Integer.toString(v1_5)}));
            return 0;
        } else {
            String v3_7 = new android.content.ContentValues();
            v3_7.put("log_source", v0_1);
            v3_7.put("reason", Integer.valueOf(v1_5));
            v3_7.put("events_dropped_count", Long.valueOf(v4_0));
            ((android.database.sqlite.SQLiteDatabase) p8).insert("log_event_dropped", 0, v3_7);
            return 0;
        }
    }

    public Object b()
    {
        int v0_1 = ((o5.d) this.b);
        r2.j v1_1 = ((r2.j) this.c);
        y2.h v2_2 = ((y2.d) v0_1.c);
        long v3_0 = (((a3.a) v0_1.g).b() + this.a);
        y2.h v2_0 = ((y2.h) v2_2);
        v2_0.getClass();
        v2_0.i(new y2.e(v3_0, v1_1));
        return 0;
    }

    public Object then(com.google.android.gms.tasks.Task p5)
    {
        return ((n6.i) this.b).b(p5, this.a, ((java.util.HashMap) this.c));
    }
}
