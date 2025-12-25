package q0;
public class f1 extends q0.i1 {
    public final android.view.WindowInsets$Builder c;

    public f1()
    {
        this.c = q0.e1.a();
        return;
    }

    public f1(q0.s1 p1)
    {
        android.view.WindowInsets$Builder v1_2;
        super(p1);
        android.view.WindowInsets$Builder v1_1 = p1.f();
        if (v1_1 == null) {
            v1_2 = q0.e1.a();
        } else {
            v1_2 = q0.e1.b(v1_1);
        }
        super.c = v1_2;
        return;
    }

    public q0.s1 b()
    {
        this.a();
        q0.s1 v0_2 = q0.s1.g(0, this.c.build());
        v0_2.a.o(this.b);
        return v0_2;
    }

    public void d(h0.b p2)
    {
        this.c.setMandatorySystemGestureInsets(p2.d());
        return;
    }

    public void e(h0.b p2)
    {
        this.c.setStableInsets(p2.d());
        return;
    }

    public void f(h0.b p2)
    {
        this.c.setSystemGestureInsets(p2.d());
        return;
    }

    public void g(h0.b p2)
    {
        this.c.setSystemWindowInsets(p2.d());
        return;
    }

    public void h(h0.b p2)
    {
        this.c.setTappableElementInsets(p2.d());
        return;
    }
}
