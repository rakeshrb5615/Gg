package q5;
public final class d {
    public static final synthetic z7.g[] d;
    public final String a;
    public final ThreadLocal b;
    public final e1.d c;

    static d()
    {
        kotlin.jvm.internal.m v0_1 = new kotlin.jvm.internal.m(kotlin.jvm.internal.c.NO_RECEIVER, q5.d, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
        kotlin.jvm.internal.s.a.getClass();
        z7.g[] v1_0 = new z7.g[1];
        v1_0[0] = v0_1;
        q5.d.d = v1_0;
        return;
    }

    public d(android.content.Context p10, String p11)
    {
        kotlin.jvm.internal.j.e(p10, "context");
        kotlin.jvm.internal.j.e(p11, "name");
        this.a = p11;
        this.b = new ThreadLocal();
        l6.c v0_1 = new l6.c(new q5.a(this, 0), 7);
        java.util.List v1_3 = new q5.a(this, 1);
        i8.c v4_0 = k8.d.c;
        d1.a v5_1 = new d8.x1();
        v4_0.getClass();
        i8.c v4_2 = d8.f0.b(q4.b.L(v4_0, v5_1));
        d1.a v5_3 = new d1.a(p11, v0_1, v1_3, v4_2);
        kotlin.jvm.internal.j.e(q5.d.d[0], "property");
        e1.d v11_3 = v5_3.c;
        if (v11_3 == null) {
            if (v5_3.c == null) {
                e1.d v10_1 = p10.getApplicationContext();
                kotlin.jvm.internal.j.d(v10_1, "applicationContext");
                v5_3.c = new e1.d(new e1.d(new a1.g0(new a1.l0(e1.h.a, a1.j0.a, new a1.k0(new c1.a(v10_1, v5_3, 1), 2)), a.a.G(new a1.d(((java.util.List) v1_3.invoke(v10_1)), 0, 0)), v0_1, v4_2)));
            }
            e1.d v10_7 = v5_3.c;
            kotlin.jvm.internal.j.b(v10_7);
            v11_3 = v10_7;
        }
        this.c = v11_3;
        return;
    }

    public final void a(u7.l p4)
    {
        d8.f0.t(new a1.d(this, p4, 0, 8));
        return;
    }
}
