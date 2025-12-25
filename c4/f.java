package c4;
public final class f implements g1.h {
    public android.content.Context a;

    public f(android.content.Context p1, int p2)
    {
        switch (p2) {
            case 1:
                this.a = p1.getApplicationContext();
                return;
            default:
                this.a = p1;
                return;
        }
    }

    public void a(q4.b p9)
    {
        java.util.concurrent.ThreadPoolExecutor v0_1 = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), new g1.a("EmojiCompatInitializer"));
        v0_1.allowCoreThreadTimeOut(1);
        v0_1.execute(new androidx.fragment.app.l(this, p9, v0_1, 1));
        return;
    }

    public r2.k b()
    {
        IllegalStateException v0_0 = this.a;
        if (v0_0 == null) {
            String v1_4 = new StringBuilder();
            v1_4.append(android.content.Context.getCanonicalName());
            v1_4.append(" must be set");
            throw new IllegalStateException(v1_4.toString());
        } else {
            String v1_2 = new r2.k();
            v1_2.a = t2.a.a(r2.n.a);
            String v2_3 = new k4.i(v0_0, 3);
            v1_2.b = v2_3;
            v1_2.c = t2.a.a(new n0.a(9, v2_3, new j6.o(v2_3, 15)));
            IllegalStateException v0_6 = v1_2.b;
            v1_2.d = new r6.j0(v0_6, 2);
            g7.a v7_0 = t2.a.a(new n0.a(11, v1_2.d, t2.a.a(new r6.j0(v0_6, 1))));
            v1_2.e = v7_0;
            String v2_10 = v1_2.b;
            b8.g v8_1 = new b8.g(v2_10, v7_0, new v3.f(), 18);
            g7.a v6_0 = v1_2.a;
            g7.a v9_0 = v7_0;
            g7.a v7_1 = v1_2.c;
            int v10_0 = v9_0;
            g7.a v9_1 = v8_1;
            b8.g v8_2 = v10_0;
            int v10_1 = v6_0;
            g7.a v9_2 = v8_2;
            v1_2.f = t2.a.a(new b8.g(new a2.b(v6_0, v7_1, v8_1, v9_0, v10_0, 6), new m5.c(v2_10, v7_1, v8_2, v9_1, v10_1, v9_0, v9_0, 3), new j6.s(v10_1, v9_2, v9_1, v9_2, 14), 12));
            return v1_2;
        }
    }
}
