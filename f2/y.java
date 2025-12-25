package f2;
public class y extends f2.s {
    public java.util.ArrayList H;
    public boolean I;
    public int J;
    public boolean K;
    public int L;
    public f2.s[] M;

    public y()
    {
        this.H = new java.util.ArrayList();
        this.I = 1;
        this.K = 0;
        this.L = 0;
        return;
    }

    public final f2.s A(f2.q p1)
    {
        super.A(p1);
        return this;
    }

    public final void B(android.view.View p3)
    {
        java.util.ArrayList v0_0 = 0;
        while (v0_0 < this.H.size()) {
            ((f2.s) this.H.get(v0_0)).B(p3);
            v0_0++;
        }
        this.f.remove(p3);
        return;
    }

    public final void C(android.view.View p6)
    {
        super.C(p6);
        f2.s[] v0_0 = this.M;
        this.M = 0;
        if (v0_0 == null) {
            v0_0 = new f2.s[this.H.size()];
        }
        f2.s[] v0_2 = ((f2.s[]) this.H.toArray(v0_0));
        int v2_1 = this.H.size();
        int v3 = 0;
        while (v3 < v2_1) {
            v0_2[v3].C(p6);
            v3++;
        }
        java.util.Arrays.fill(v0_2, 0);
        this.M = v0_2;
        return;
    }

    public final void D()
    {
        if (!this.H.isEmpty()) {
            f2.s v0_11 = new f2.x();
            v0_11.b = this;
            f2.s v1_6 = this.H;
            f2.s v2_6 = v1_6.size();
            int v3 = 0;
            f2.x v4_0 = 0;
            while (v4_0 < v2_6) {
                f2.s v5_0 = v1_6.get(v4_0);
                v4_0++;
                ((f2.s) v5_0).a(v0_11);
            }
            this.J = this.H.size();
            if (this.I) {
                f2.s v0_4 = this.H;
                f2.s v1_0 = v0_4.size();
                while (v3 < v1_0) {
                    f2.s v2_0 = v0_4.get(v3);
                    v3++;
                    ((f2.s) v2_0).D();
                }
            } else {
                f2.s v0_6 = 1;
                while (v0_6 < this.H.size()) {
                    ((f2.s) this.H.get((v0_6 - 1))).a(new f2.x(((f2.s) this.H.get(v0_6))));
                    v0_6++;
                }
                f2.s v0_9 = ((f2.s) this.H.get(0));
                if (v0_9 != null) {
                    v0_9.D();
                    return;
                }
            }
            return;
        } else {
            this.K();
            this.p();
            return;
        }
    }

    public final void E(long p4)
    {
        this.c = p4;
        if (p4 >= 0) {
            int v0_2 = this.H;
            if (v0_2 != 0) {
                int v0_3 = v0_2.size();
                int v1 = 0;
                while (v1 < v0_3) {
                    ((f2.s) this.H.get(v1)).E(p4);
                    v1++;
                }
            }
        }
        return;
    }

    public final void F(a.a p4)
    {
        this.B = p4;
        this.L = (this.L | 8);
        int v0_3 = this.H.size();
        int v1 = 0;
        while (v1 < v0_3) {
            ((f2.s) this.H.get(v1)).F(p4);
            v1++;
        }
        return;
    }

    public final void G(android.animation.TimeInterpolator p4)
    {
        this.L = (this.L | 1);
        int v0_2 = this.H;
        if (v0_2 != 0) {
            int v0_3 = v0_2.size();
            int v1 = 0;
            while (v1 < v0_3) {
                ((f2.s) this.H.get(v1)).G(p4);
                v1++;
            }
        }
        this.d = p4;
        return;
    }

    public final void H(a6.e p3)
    {
        super.H(p3);
        this.L = (this.L | 4);
        if (this.H != null) {
            int v0_1 = 0;
            while (v0_1 < this.H.size()) {
                ((f2.s) this.H.get(v0_1)).H(p3);
                v0_1++;
            }
        }
        return;
    }

    public final void I()
    {
        this.L = (this.L | 2);
        int v0_3 = this.H.size();
        int v1 = 0;
        while (v1 < v0_3) {
            ((f2.s) this.H.get(v1)).I();
            v1++;
        }
        return;
    }

    public final void J(long p1)
    {
        this.b = p1;
        return;
    }

    public final String L(String p6)
    {
        String v0_0 = super.L(p6);
        int v1 = 0;
        while (v1 < this.H.size()) {
            StringBuilder v2_3 = new StringBuilder();
            v2_3.append(v0_0);
            v2_3.append("\n");
            String v0_4 = ((f2.s) this.H.get(v1));
            String v3_1 = new StringBuilder();
            v3_1.append(p6);
            v3_1.append("  ");
            v2_3.append(v0_4.L(v3_1.toString()));
            v0_0 = v2_3.toString();
            v1++;
        }
        return v0_0;
    }

    public final void M(f2.s p5)
    {
        this.H.add(p5);
        p5.o = this;
        a.a v0_10 = this.c;
        if (v0_10 >= 0) {
            p5.E(v0_10);
        }
        if ((this.L & 1) != 0) {
            p5.G(this.d);
        }
        if ((this.L & 2) != 0) {
            p5.I();
        }
        if ((this.L & 4) != 0) {
            p5.H(this.C);
        }
        if ((this.L & 8) != 0) {
            p5.F(this.B);
        }
        return;
    }

    public final void b(android.view.View p3)
    {
        java.util.ArrayList v0_0 = 0;
        while (v0_0 < this.H.size()) {
            ((f2.s) this.H.get(v0_0)).b(p3);
            v0_0++;
        }
        this.f.add(p3);
        return;
    }

    public final void cancel()
    {
        super.cancel();
        f2.s[] v0_0 = this.M;
        this.M = 0;
        if (v0_0 == null) {
            v0_0 = new f2.s[this.H.size()];
        }
        f2.s[] v0_2 = ((f2.s[]) this.H.toArray(v0_0));
        int v2_1 = this.H.size();
        int v3 = 0;
        while (v3 < v2_1) {
            v0_2[v3].cancel();
            v3++;
        }
        java.util.Arrays.fill(v0_2, 0);
        this.M = v0_2;
        return;
    }

    public final bridge synthetic Object clone()
    {
        return this.m();
    }

    public final void e(f2.a0 p7)
    {
        android.view.View v0 = p7.b;
        if (this.w(v0)) {
            java.util.ArrayList v1_1 = this.H;
            int v2 = v1_1.size();
            int v3 = 0;
            while (v3 < v2) {
                f2.s v4_0 = v1_1.get(v3);
                v3++;
                f2.s v4_1 = ((f2.s) v4_0);
                if (v4_1.w(v0)) {
                    v4_1.e(p7);
                    p7.c.add(v4_1);
                }
            }
        }
        return;
    }

    public final void h(f2.a0 p4)
    {
        int v0_1 = this.H.size();
        int v1 = 0;
        while (v1 < v0_1) {
            ((f2.s) this.H.get(v1)).h(p4);
            v1++;
        }
        return;
    }

    public final void j(f2.a0 p7)
    {
        android.view.View v0 = p7.b;
        if (this.w(v0)) {
            java.util.ArrayList v1_1 = this.H;
            int v2 = v1_1.size();
            int v3 = 0;
            while (v3 < v2) {
                f2.s v4_0 = v1_1.get(v3);
                v3++;
                f2.s v4_1 = ((f2.s) v4_0);
                if (v4_1.w(v0)) {
                    v4_1.j(p7);
                    p7.c.add(v4_1);
                }
            }
        }
        return;
    }

    public final f2.s m()
    {
        f2.y v0_1 = ((f2.y) super.m());
        v0_1.H = new java.util.ArrayList();
        int v1_3 = this.H.size();
        int v2 = 0;
        while (v2 < v1_3) {
            f2.s v3_3 = ((f2.s) this.H.get(v2)).m();
            v0_1.H.add(v3_3);
            v3_3.o = v0_1;
            v2++;
        }
        return v0_1;
    }

    public final void o(android.view.ViewGroup p12, j6.s p13, j6.s p14, java.util.ArrayList p15, java.util.ArrayList p16)
    {
        long v0 = this.b;
        int v2_1 = this.H.size();
        int v3 = 0;
        while (v3 < v2_1) {
            f2.s v5_1 = ((f2.s) this.H.get(v3));
            if ((v0 > 0) && ((this.I) || (v3 == 0))) {
                long v8_0 = v5_1.b;
                if (v8_0 <= 0) {
                    v5_1.J(v0);
                } else {
                    v5_1.J((v8_0 + v0));
                }
            }
            v5_1.o(p12, p13, p14, p15, p16);
            v3++;
        }
        return;
    }

    public final void z(android.view.View p4)
    {
        super.z(p4);
        int v0_1 = this.H.size();
        int v1 = 0;
        while (v1 < v0_1) {
            ((f2.s) this.H.get(v1)).z(p4);
            v1++;
        }
        return;
    }
}
