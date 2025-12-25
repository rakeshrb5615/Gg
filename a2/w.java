package a2;
public final class w {
    public a2.e0 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public w()
    {
        this.d();
        return;
    }

    public final void a()
    {
        int v0_2;
        if (!this.d) {
            v0_2 = this.a.k();
        } else {
            v0_2 = this.a.g();
        }
        this.c = v0_2;
        return;
    }

    public final void b(android.view.View p4, int p5)
    {
        if (!this.d) {
            this.c = this.a.e(p4);
        } else {
            int v0_2;
            int v4_2 = this.a.b(p4);
            int v0_6 = this.a;
            if (-2147483648 != v0_6.a) {
                v0_2 = (v0_6.l() - v0_6.a);
            } else {
                v0_2 = 0;
            }
            this.c = (v0_2 + v4_2);
        }
        this.b = p5;
        return;
    }

    public final void c(android.view.View p5, int p6)
    {
        a2.e0 v1_6;
        a2.e0 v0_0 = this.a;
        if (-2147483648 != v0_0.a) {
            v1_6 = (v0_0.l() - v0_0.a);
        } else {
            v1_6 = 0;
        }
        if (v1_6 < null) {
            this.b = p6;
            if (!this.d) {
                int v6_3 = this.a.e(p5);
                a2.e0 v0_3 = (v6_3 - this.a.k());
                this.c = v6_3;
                if (v0_3 > null) {
                    int v5_5 = ((this.a.g() - Math.min(0, ((this.a.g() - v1_6) - this.a.b(p5)))) - (this.a.c(p5) + v6_3));
                    if (v5_5 < 0) {
                        this.c = (this.c - Math.min(v0_3, (- v5_5)));
                    }
                }
            } else {
                int v6_14 = ((this.a.g() - v1_6) - this.a.b(p5));
                this.c = (this.a.g() - v6_14);
                if (v6_14 > 0) {
                    a2.e0 v1_4 = (this.c - this.a.c(p5));
                    a2.e0 v0_13 = this.a.k();
                    a2.e0 v1_5 = (v1_4 - (Math.min((this.a.e(p5) - v0_13), 0) + v0_13));
                    if (v1_5 < null) {
                        this.c = (Math.min(v6_14, (- v1_5)) + this.c);
                        return;
                    }
                }
            }
            return;
        } else {
            this.b(p5, p6);
            return;
        }
    }

    public final void d()
    {
        this.b = -1;
        this.c = -2147483648;
        this.d = 0;
        this.e = 0;
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("AnchorInfo{mPosition=");
        v0_1.append(this.b);
        v0_1.append(", mCoordinate=");
        v0_1.append(this.c);
        v0_1.append(", mLayoutFromEnd=");
        v0_1.append(this.d);
        v0_1.append(", mValid=");
        v0_1.append(this.e);
        v0_1.append(125);
        return v0_1.toString();
    }
}
