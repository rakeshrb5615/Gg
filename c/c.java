package c;
public final synthetic class c implements u7.a {
    public final synthetic int a;
    public final synthetic c.n b;

    public synthetic c(c.n p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final Object invoke()
    {
        switch (this.a) {
            case 0:
                this.b.reportFullyDrawn();
                return h7.l.a;
            case 1:
                return c.n.c(this.b);
            case 2:
                androidx.lifecycle.t0 v0_3 = new s1.a();
                this.b.getNavigationEventDispatcher().a(v0_3);
                return v0_3;
            case 3:
                int v3_1;
                androidx.lifecycle.p v1_2 = this.b;
                c.d v2_4 = v1_2.getApplication();
                if (v1_2.getIntent() == null) {
                    v3_1 = 0;
                } else {
                    v3_1 = v1_2.getIntent().getExtras();
                }
                return new androidx.lifecycle.t0(v2_4, v1_2, v3_1);
            default:
                int v3_2 = this.b;
                androidx.lifecycle.t0 v0_10 = new c.v(new c.b(v3_2, 1));
                if (android.os.Build$VERSION.SDK_INT >= 33) {
                    if (kotlin.jvm.internal.j.a(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
                        v3_2.getLifecycle().a(new c.d(0, v0_10, v3_2));
                    } else {
                        new android.os.Handler(android.os.Looper.getMainLooper()).post(new a5.i(4, v3_2, v0_10));
                    }
                }
                return v0_10;
        }
    }
}
