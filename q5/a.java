package q5;
public final synthetic class a implements u7.l {
    public final synthetic int a;
    public final synthetic q5.d b;

    public synthetic a(q5.d p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object invoke(Object p8)
    {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(((a1.b) p8), "ex");
                int v0_8 = kotlin.jvm.internal.s.a(q5.d).b();
                String v1_1 = new StringBuilder("CorruptionException in ");
                v1_1.append(this.b.a);
                v1_1.append(" DataStore running in process ");
                v1_1.append(android.os.Process.myPid());
                android.util.Log.w(v0_8, v1_1.toString(), ((a1.b) p8));
                return new e1.b(1);
            default:
                kotlin.jvm.internal.j.e(((android.content.Context) p8), "it");
                String v3 = this.b.a;
                e1.b v8_6 = d1.j.a;
                kotlin.jvm.internal.j.e(v3, "sharedPreferencesName");
                kotlin.jvm.internal.j.e(v8_6, "keysToMigrate");
                return a.a.G(new c1.d(((android.content.Context) p8), v3, c1.e.a, new a1.p(v8_6, 0, 1), new d1.i(3, 0)));
        }
    }
}
