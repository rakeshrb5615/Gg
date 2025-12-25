package y2;
public final synthetic class e implements y2.f {
    public final synthetic long a;
    public final synthetic r2.j b;

    public synthetic e(long p1, r2.j p3)
    {
        this.a = p1;
        this.b = p3;
        return;
    }

    public final Object apply(Object p8)
    {
        android.content.ContentValues v0_1 = new android.content.ContentValues();
        v0_1.put("next_request_ms", Long.valueOf(this.a));
        Integer v1_4 = this.b;
        o2.d v3 = v1_4.c;
        if (((android.database.sqlite.SQLiteDatabase) p8).update("transport_contexts", v0_1, "backend_name = ? and priority = ?", new String[] {v1_4.a, String.valueOf(b3.a.a(v3))})) < 1) {
            v0_1.put("backend_name", v1_4.a);
            v0_1.put("priority", Integer.valueOf(b3.a.a(v3)));
            ((android.database.sqlite.SQLiteDatabase) p8).insert("transport_contexts", 0, v0_1);
        }
        return 0;
    }
}
