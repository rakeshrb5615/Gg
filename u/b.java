package u;
public class b {
    public u.f a;
    public float b;
    public final java.util.ArrayList c;
    public final u.a d;
    public boolean e;

    public b(b8.g p2)
    {
        this.a = 0;
        this.b = 0;
        this.c = new java.util.ArrayList();
        this.e = 0;
        this.d = new u.a(this, p2);
        return;
    }

    public final void a(u.c p4, int p5)
    {
        this.d.g(p4.j(p5), 1065353216);
        this.d.g(p4.j(p5), -1082130432);
        return;
    }

    public final void b(u.f p3, u.f p4, u.f p5, int p6)
    {
        u.a v0_0 = 0;
        if (p6 != 0) {
            if (p6 < 0) {
                p6 *= -1;
                v0_0 = 1;
            }
            this.b = ((float) p6);
        }
        if (v0_0 != null) {
            this.d.g(p3, 1065353216);
            this.d.g(p4, -1082130432);
            this.d.g(p5, -1082130432);
            return;
        } else {
            this.d.g(p3, -1082130432);
            this.d.g(p4, 1065353216);
            this.d.g(p5, 1065353216);
            return;
        }
    }

    public final void c(u.f p3, u.f p4, u.f p5, int p6)
    {
        u.a v0_0 = 0;
        if (p6 != 0) {
            if (p6 < 0) {
                p6 *= -1;
                v0_0 = 1;
            }
            this.b = ((float) p6);
        }
        if (v0_0 != null) {
            this.d.g(p3, 1065353216);
            this.d.g(p4, -1082130432);
            this.d.g(p5, 1065353216);
            return;
        } else {
            this.d.g(p3, -1082130432);
            this.d.g(p4, 1065353216);
            this.d.g(p5, -1082130432);
            return;
        }
    }

    public u.f d(boolean[] p2)
    {
        return this.f(p2, 0);
    }

    public boolean e()
    {
        if ((this.a != null) || ((this.b != 0) || (this.d.d() != 0))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final u.f f(boolean[] p10, u.f p11)
    {
        int v0_1 = this.d.d();
        u.f v2 = 0;
        int v3 = 0;
        float v4 = 0;
        while (v3 < v0_1) {
            float v5_0 = this.d.f(v3);
            if (v5_0 < 0) {
                u.f v6_2 = this.d.e(v3);
                if (((p10 == null) || (!p10[v6_2.b])) && (v6_2 != p11)) {
                    float v7_2 = v6_2.r;
                    if (((v7_2 == 3) || (v7_2 == 4)) && (v5_0 < v4)) {
                        v4 = v5_0;
                        v2 = v6_2;
                    }
                }
            }
            v3++;
        }
        return v2;
    }

    public final void g(u.f p6)
    {
        float v0_0 = this.a;
        if (v0_0 != 0) {
            this.d.g(v0_0, -1082130432);
            this.a.c = -1;
            this.a = 0;
        }
        float v0_3 = (this.d.h(p6, 1) * -1082130432);
        this.a = p6;
        if (v0_3 != 1065353216) {
            this.b = (this.b / v0_3);
            u.a v6_5 = this.d;
            int v1_1 = v6_5.h;
            int v2_1 = 0;
            while ((v1_1 != -1) && (v2_1 < v6_5.a)) {
                int[] v3_2 = v6_5.g;
                v3_2[v1_1] = (v3_2[v1_1] / v0_3);
                v1_1 = v6_5.f[v1_1];
                v2_1++;
            }
            return;
        } else {
            return;
        }
    }

    public final void h(u.c p4, u.f p5, boolean p6)
    {
        if (p5.f) {
            this.b = ((p5.e * this.d.c(p5)) + this.b);
            this.d.h(p5, p6);
            if (p6) {
                p5.b(this);
            }
            if (this.d.d() == 0) {
                this.e = 1;
                p4.b = 1;
            }
        }
        return;
    }

    public void i(u.c p8, u.b p9, boolean p10)
    {
        float v0_0 = this.d;
        v0_0.getClass();
        float v1_1 = v0_0.c(p9.a);
        v0_0.h(p9.a, p10);
        float v2_4 = p9.d;
        int v3 = v2_4.d();
        int v4 = 0;
        while (v4 < v3) {
            u.f v5 = v2_4.e(v4);
            v0_0.a(v5, (v2_4.c(v5) * v1_1), p10);
            v4++;
        }
        this.b = ((p9.b * v1_1) + this.b);
        if (p10) {
            p9.a.b(this);
        }
        if ((this.a != null) && (this.d.d() == 0)) {
            this.e = 1;
            p8.b = 1;
        }
        return;
    }

    public String toString()
    {
        String v0_6;
        if (this.a != null) {
            String v0_4 = new StringBuilder("");
            v0_4.append(this.a);
            v0_6 = v0_4.toString();
        } else {
            v0_6 = "0";
        }
        int v1_3;
        String v0_1 = g2.g.d(v0_6, " = ");
        int v3 = 0;
        if (this.b == 0) {
            v1_3 = 0;
        } else {
            String v0_3 = u.e.b(v0_1);
            v0_3.append(this.b);
            v0_1 = v0_3.toString();
            v1_3 = 1;
        }
        int v5_1 = this.d.d();
        while (v3 < v5_1) {
            String v6_1 = this.d.e(v3);
            if (v6_1 != null) {
                float v7_1 = this.d.f(v3);
                float v8 = v7_1 cmp 0;
                if (v8 != 0) {
                    String v6_2 = v6_1.toString();
                    if (v1_3 != 0) {
                        if (v8 <= 0) {
                            v0_1 = g2.g.d(v0_1, " - ");
                            v7_1 *= -1082130432;
                        } else {
                            v0_1 = g2.g.d(v0_1, " + ");
                        }
                    } else {
                        if (v7_1 < 0) {
                            v0_1 = g2.g.d(v0_1, "- ");
                        }
                    }
                    if (v7_1 != 1065353216) {
                        int v1_15 = new StringBuilder();
                        v1_15.append(v0_1);
                        v1_15.append(v7_1);
                        v1_15.append(" ");
                        v1_15.append(v6_2);
                        v0_1 = v1_15.toString();
                    } else {
                        v0_1 = g2.g.d(v0_1, v6_2);
                    }
                    v1_3 = 1;
                }
            }
            v3++;
        }
        if (v1_3 == 0) {
            v0_1 = g2.g.d(v0_1, "0.0");
        }
        return v0_1;
    }
}
