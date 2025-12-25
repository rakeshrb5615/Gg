package d8;
public abstract class x0 extends d8.a0 {
    public static final synthetic int f;
    public long c;
    public boolean d;
    public i7.g e;

    public final void A(boolean p5)
    {
        long v2_0;
        if (p5 == 0) {
            v2_0 = 1;
        } else {
            v2_0 = 4294967296;
        }
        this.c = (v2_0 + this.c);
        if (p5 == 0) {
            this.d = 1;
        }
        return;
    }

    public abstract long B();

    public final boolean C()
    {
        int v0_0 = this.e;
        if (v0_0 != 0) {
            int v0_2;
            if (!v0_0.isEmpty()) {
                v0_2 = v0_0.removeFirst();
            } else {
                v0_2 = 0;
            }
            int v0_3 = ((d8.m0) v0_2);
            if (v0_3 != 0) {
                v0_3.run();
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public void D(long p2, d8.u0 p4)
    {
        d8.g0.p.I(p2, p4);
        return;
    }

    public abstract void shutdown();

    public final void y(boolean p5)
    {
        long v2_0;
        if (!p5) {
            v2_0 = 1;
        } else {
            v2_0 = 4294967296;
        }
        long v0_1 = (this.c - v2_0);
        this.c = v0_1;
        if ((v0_1 <= 0) && (this.d)) {
            this.shutdown();
        }
        return;
    }

    public abstract Thread z();
}
