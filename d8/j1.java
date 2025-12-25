package d8;
public final class j1 extends d8.n {
    public final d8.r1 o;

    public j1(d8.r1 p2, l7.c p3)
    {
        super(1, p3);
        super.o = p2;
        return;
    }

    public final Throwable p(d8.r1 p3)
    {
        d8.w v0_0 = this.o;
        v0_0.getClass();
        d8.w v0_2 = d8.r1.a.get(v0_0);
        if ((v0_2 instanceof d8.l1)) {
            boolean v1_0 = ((d8.l1) v0_2).b();
            if (v1_0) {
                return v1_0;
            }
        }
        if (!(v0_2 instanceof d8.w)) {
            return p3.getCancellationException();
        } else {
            return ((d8.w) v0_2).a;
        }
    }

    public final String x()
    {
        return "AwaitContinuation";
    }
}
