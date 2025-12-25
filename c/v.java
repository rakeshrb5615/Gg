package c;
public final class v {
    public final Runnable a;
    public final s1.c b;
    public final c.t c;

    public v(Runnable p3)
    {
        this.a = p3;
        s1.c v3_2 = new s1.c(new a5.a(this, 1));
        this.b = v3_2;
        c.t v0_3 = new c.t();
        this.c = v0_3;
        v3_2.a(v0_3);
        return;
    }

    public final void a(androidx.fragment.app.t0 p5, androidx.lifecycle.u p6)
    {
        kotlin.jvm.internal.j.e(p5, "onBackPressedCallback");
        String v0_2 = p6.getLifecycle();
        if (((androidx.lifecycle.w) v0_2).c != androidx.lifecycle.o.a) {
            IllegalArgumentException v6_2 = new c.r(p5, new c.s(p5, p6));
            p5.a.add(v6_2);
            v6_2.b(0);
            c.u v1_3 = this.b;
            v1_3.getClass();
            if (v1_3.c.add(v6_2)) {
                s1.f v2_2 = v1_3.b;
                v2_2.getClass();
                if (v6_2.c != null) {
                    String v5_2 = new StringBuilder("Handler \'");
                    v5_2.append(v6_2);
                    v5_2.append("\' is already registered with a dispatcher");
                    throw new IllegalArgumentException(v5_2.toString().toString());
                } else {
                    v2_2.e.addFirst(v6_2);
                    v6_2.c = v1_3;
                    v2_2.b();
                }
            }
            c.u v1_6 = new c.u(v6_2, p5, this, v0_2);
            v0_2.a(v1_6);
            p5.c.add(v1_6);
            return;
        } else {
            return;
        }
    }

    public final void b(android.window.OnBackInvokedDispatcher p5)
    {
        s1.c v3 = this.b;
        v3.b(new s1.j(p5, 0), 1);
        v3.b(new s1.j(p5, 1000000), 0);
        return;
    }
}
