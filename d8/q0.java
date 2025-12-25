package d8;
public final class q0 extends d8.i1 {
    public final synthetic int e;
    public final Object f;

    public q0(d8.r1 p2)
    {
        this.e = 2;
        this.f = p2;
        return;
    }

    public synthetic q0(Object p1, int p2)
    {
        this.e = p2;
        this.f = p1;
        return;
    }

    public final boolean j()
    {
        switch (this.e) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 0;
            default:
                return 0;
        }
    }

    public final void k(Throwable p3)
    {
        switch (this.e) {
            case 0:
                ((d8.p0) this.f).a();
                return;
            case 1:
                ((u7.l) this.f).invoke(p3);
                return;
            case 2:
                int v3_6 = ((d8.r1) this.f);
                v3_6.getClass();
                d8.r1.a.get(v3_6);
                throw 0;
                break;
            default:
                int v3_4 = ((d8.j1) this.f);
                Object v0_3 = d8.r1.a.get(this.i());
                if (!(v0_3 instanceof d8.w)) {
                    v3_4.resumeWith(d8.f0.v(v0_3));
                } else {
                    v3_4.resumeWith(c4.b.p(((d8.w) v0_3).a));
                }
                return;
        }
    }
}
