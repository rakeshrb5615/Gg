package f2;
public final class j implements f2.q {
    public final synthetic android.view.View a;
    public final synthetic java.util.ArrayList b;

    public j(android.view.View p1, java.util.ArrayList p2)
    {
        this.a = p1;
        this.b = p2;
        return;
    }

    public final void a(f2.s p1)
    {
        p1.A(this);
        p1.a(this);
        return;
    }

    public final void b()
    {
        return;
    }

    public final void c(f2.s p1)
    {
        return;
    }

    public final void d()
    {
        return;
    }

    public final void f(f2.s p5)
    {
        p5.A(this);
        this.a.setVisibility(8);
        java.util.ArrayList v5_2 = this.b;
        int v0_1 = v5_2.size();
        int v2 = 0;
        while (v2 < v0_1) {
            ((android.view.View) v5_2.get(v2)).setVisibility(0);
            v2++;
        }
        return;
    }
}
