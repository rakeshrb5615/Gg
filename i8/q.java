package i8;
public class q extends d8.a implements n7.d {
    public final l7.c d;

    public q(l7.c p2, l7.h p3)
    {
        super(p3, 1);
        super.d = p2;
        return;
    }

    public void f(Object p2)
    {
        i8.a.h(d8.f0.r(p2), q4.b.C(this.d));
        return;
    }

    public void g(Object p2)
    {
        this.d.resumeWith(d8.f0.r(p2));
        return;
    }

    public final n7.d getCallerFrame()
    {
        int v0_0 = this.d;
        if (!(v0_0 instanceof n7.d)) {
            return 0;
        } else {
            return ((n7.d) v0_0);
        }
    }

    public final boolean z()
    {
        return 1;
    }
}
