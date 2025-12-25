package h;
public final class q implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic h.c0 b;

    public synthetic q(h.c0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                h.s v0_2 = this.b;
                if ((v0_2.g0 & 1) != 0) {
                    v0_2.y(0);
                }
                if ((v0_2.g0 & 4096) != 0) {
                    v0_2.y(108);
                }
                v0_2.f0 = 0;
                v0_2.g0 = 0;
                return;
            default:
                h.s v0_1 = this.b;
                v0_1.C.showAtLocation(v0_1.B, 55, 0, 0);
                q0.t0 v1_2 = v0_1.E;
                if (v1_2 != null) {
                    v1_2.b();
                }
                if (!v0_1.G) {
                    v0_1.B.setAlpha(1065353216);
                    v0_1.B.setVisibility(0);
                } else {
                    q0.t0 v1_4 = v0_1.H;
                    if ((v1_4 == null) || (!v1_4.isLaidOut())) {
                    } else {
                        v0_1.B.setAlpha(0);
                        q0.t0 v1_11 = q0.q0.b(v0_1.B);
                        v1_11.a(1065353216);
                        v0_1.E = v1_11;
                        v1_11.d(new h.s(this, 0));
                    }
                }
                return;
        }
    }
}
