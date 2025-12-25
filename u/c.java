package u;
public final class c {
    public static boolean q = False;
    public int a;
    public boolean b;
    public int c;
    public final u.d d;
    public int e;
    public int f;
    public u.b[] g;
    public boolean h;
    public boolean[] i;
    public int j;
    public int k;
    public int l;
    public final b8.g m;
    public u.f[] n;
    public int o;
    public u.b p;

    public c()
    {
        this.a = 1000;
        this.b = 0;
        this.c = 0;
        this.e = 32;
        this.f = 32;
        this.h = 0;
        u.f[] v3_0 = new boolean[32];
        this.i = v3_0;
        this.j = 1;
        this.k = 0;
        this.l = 32;
        b8.g v0_1 = new u.f[1000];
        this.n = v0_1;
        this.o = 0;
        b8.g v0_2 = new u.b[32];
        this.g = v0_2;
        this.s();
        b8.g v0_4 = new b8.g(16);
        v0_4.b = new p0.c();
        v0_4.c = new p0.c();
        u.d v2_0 = new u.f[32];
        v0_4.d = v2_0;
        this.m = v0_4;
        u.d v2_2 = new u.d(v0_4);
        u.f[] v4 = new u.f[128];
        v2_2.f = v4;
        u.f[] v3_8 = new u.f[128];
        v2_2.g = v3_8;
        v2_2.h = 0;
        v2_2.i = new n0.a(v2_2);
        this.d = v2_2;
        this.p = new u.b(v0_4);
        return;
    }

    public static int n(Object p1)
    {
        int v1_2 = ((w.c) p1).i;
        if (v1_2 == 0) {
            return 0;
        } else {
            return ((int) (v1_2.e + 1056964608));
        }
    }

    public final u.f a(int p6)
    {
        int v0_2 = ((p0.c) this.m.c);
        int v1_0 = v0_2.b;
        u.f v2_0 = 0;
        if (v1_0 > 0) {
            int v1_2 = (v1_0 - 1);
            Object[] v3 = v0_2.a;
            Object v4 = v3[v1_2];
            v3[v1_2] = 0;
            v0_2.b = v1_2;
            v2_0 = v4;
        }
        u.f v2_1 = ((u.f) v2_0);
        if (v2_1 != null) {
            v2_1.c();
            v2_1.r = p6;
        } else {
            v2_1 = new u.f(p6);
            v2_1.r = p6;
        }
        int v0_3 = this.a;
        if (this.o >= v0_3) {
            int v0_4 = (v0_3 * 2);
            this.a = v0_4;
            this.n = ((u.f[]) java.util.Arrays.copyOf(this.n, v0_4));
        }
        u.f[] v6_5 = this.n;
        int v0_5 = this.o;
        this.o = (v0_5 + 1);
        v6_5[v0_5] = v2_1;
        return v2_1;
    }

    public final void b(u.f p7, u.f p8, int p9, float p10, u.f p11, u.f p12, int p13, int p14)
    {
        u.b v0 = this.l();
        if (p8 != p11) {
            if (p10 != 1056964608) {
                if (p10 > 0) {
                    if (p10 < 1065353216) {
                        float v4 = (1065353216 - p10);
                        v0.d.g(p7, (v4 * 1065353216));
                        v0.d.g(p8, (v4 * -1082130432));
                        v0.d.g(p11, (-1082130432 * p10));
                        v0.d.g(p12, (1065353216 * p10));
                        if ((p9 > 0) || (p13 > 0)) {
                            v0.b = ((((float) p13) * p10) + (((float) (- p9)) * v4));
                        }
                    } else {
                        v0.d.g(p12, -1082130432);
                        v0.d.g(p11, 1065353216);
                        v0.b = ((float) (- p13));
                    }
                } else {
                    v0.d.g(p7, -1082130432);
                    v0.d.g(p8, 1065353216);
                    v0.b = ((float) p9);
                }
            } else {
                v0.d.g(p7, 1065353216);
                v0.d.g(p8, -1082130432);
                v0.d.g(p11, -1082130432);
                v0.d.g(p12, 1065353216);
                if ((p9 > 0) || (p13 > 0)) {
                    v0.b = ((float) ((- p9) + p13));
                }
            }
        } else {
            v0.d.g(p7, 1065353216);
            v0.d.g(p12, 1065353216);
            v0.d.g(p8, -1073741824);
        }
        if (p14 != 8) {
            v0.a(this, p14);
        }
        this.c(v0);
        return;
    }

    public final void c(u.b p18)
    {
        if (((this.k + 1) >= this.l) || ((this.j + 1) >= this.f)) {
            this.o();
        }
        int v4_6;
        if (p18.e) {
            v4_6 = 0;
            if (v4_6 == 0) {
                this.h(p18);
            }
        } else {
            int v2_7 = p18.c;
            if (this.g.length != 0) {
                b8.g v5_11 = 0;
                while (v5_11 == null) {
                    int v7_2 = p18.d.d();
                    int v8_7 = 0;
                    while (v8_7 < v7_2) {
                        u.f v9_12 = p18.d.e(v8_7);
                        if ((v9_12.c != -1) || (v9_12.f)) {
                            v2_7.add(v9_12);
                        }
                        v8_7++;
                    }
                    int v7_3 = v2_7.size();
                    if (v7_3 <= 0) {
                        v5_11 = 1;
                    } else {
                        int v8_8 = 0;
                        while (v8_8 < v7_3) {
                            u.f v9_8 = ((u.f) v2_7.get(v8_8));
                            if (!v9_8.f) {
                                p18.i(this, this.g[v9_8.c], 1);
                            } else {
                                p18.h(this, v9_8, 1);
                            }
                            v8_8++;
                        }
                        v2_7.clear();
                    }
                    return;
                }
                if ((p18.a != null) && (p18.d.d() == 0)) {
                    p18.e = 1;
                    this.b = 1;
                }
            }
            if (!p18.e()) {
                int v2_23 = p18.b;
                b8.g v5_16 = 0;
                if (v2_23 < 0) {
                    p18.b = (v2_23 * -1082130432);
                    int v2_26 = p18.d;
                    int v7_0 = v2_26.h;
                    int v8_6 = 0;
                    while ((v7_0 != -1) && (v8_6 < v2_26.a)) {
                        u.f v9_5 = v2_26.g;
                        v9_5[v7_0] = (v9_5[v7_0] * -1082130432);
                        v7_0 = v2_26.f[v7_0];
                        v8_6++;
                    }
                }
                int v2_29 = p18.d.d();
                u.a v11_1 = 0;
                float v13 = 0;
                u.f v9_4 = 0;
                float v10_2 = 0;
                int v8_5 = 0;
                int v12 = 0;
                int v14 = 0;
                while (v8_5 < v2_29) {
                    float v15_1 = p18.d.f(v8_5);
                    int v4_12 = p18.d.e(v8_5);
                    int v16_0 = v5_16;
                    if (v4_12.r != 1) {
                        if ((v9_4 == null) && (v15_1 < v16_0)) {
                            if (v10_2 != 0) {
                                if (v13 <= v15_1) {
                                    if ((v14 != 0) || (v4_12.q > 1)) {
                                        v8_5++;
                                        v5_16 = v16_0;
                                    } else {
                                        v14 = 1;
                                    }
                                } else {
                                    if (v4_12.q > 1) {
                                        v14 = 0;
                                    }
                                }
                            } else {
                                if (v4_12.q > 1) {
                                }
                            }
                            v10_2 = v4_12;
                            v13 = v15_1;
                        }
                    } else {
                        if (v9_4 != null) {
                            if (v11_1 <= v15_1) {
                                if ((v12 != 0) || (v4_12.q > 1)) {
                                } else {
                                    v12 = 1;
                                }
                            } else {
                                if (v4_12.q > 1) {
                                    v12 = 0;
                                }
                            }
                        } else {
                            if (v4_12.q > 1) {
                            }
                        }
                        v9_4 = v4_12;
                        v11_1 = v15_1;
                    }
                }
                int v16_1 = v5_16;
                if (v9_4 == null) {
                    v9_4 = v10_2;
                }
                int v2_30;
                if (v9_4 != null) {
                    p18.g(v9_4);
                    v2_30 = 0;
                } else {
                    v2_30 = 1;
                }
                if (p18.d.d() == 0) {
                    p18.e = 1;
                }
                if (v2_30 == 0) {
                    v4_6 = 0;
                } else {
                    if ((this.j + 1) >= this.f) {
                        this.o();
                    }
                    int v2_3 = this.a(3);
                    int v4_3 = (this.c + 1);
                    this.c = v4_3;
                    this.j = (this.j + 1);
                    v2_3.b = v4_3;
                    b8.g v5_2 = this.m;
                    ((u.f[]) v5_2.d)[v4_3] = v2_3;
                    p18.a = v2_3;
                    int v4_4 = this.k;
                    this.h(p18);
                    if (this.k != (v4_4 + 1)) {
                    } else {
                        int v4_7 = this.p;
                        v4_7.a = 0;
                        v4_7.d.b();
                        int v8_4 = 0;
                        while (v8_4 < p18.d.d()) {
                            v4_7.d.a(p18.d.e(v8_4), p18.d.f(v8_4), 1);
                            v8_4++;
                        }
                        this.r(this.p);
                        if (v2_3.c == -1) {
                            if (p18.a == v2_3) {
                                int v2_5 = p18.f(0, v2_3);
                                if (v2_5 != 0) {
                                    p18.g(v2_5);
                                }
                            }
                            if (!p18.e) {
                                p18.a.e(this, p18);
                            }
                            ((p0.c) v5_2.b).b(p18);
                            this.k = (this.k - 1);
                        }
                        v4_6 = 1;
                    }
                }
                int v2_13 = p18.a;
                if ((v2_13 != 0) && ((v2_13.r == 1) || (p18.b >= v16_1))) {
                }
            }
        }
        return;
    }

    public final void d(u.f p5, int p6)
    {
        u.b v0_0 = p5.c;
        if (v0_0 != -1) {
            if (v0_0 == -1) {
                u.b v0_3 = this.l();
                v0_3.a = p5;
                p5.e = ((float) p6);
                v0_3.b = ((float) p6);
                v0_3.e = 1;
                this.c(v0_3);
                return;
            } else {
                u.b v0_1 = this.g[v0_0];
                if (!v0_1.e) {
                    if (v0_1.d.d() != 0) {
                        u.b v0_2 = this.l();
                        if (p6 >= null) {
                            v0_2.b = ((float) p6);
                            v0_2.d.g(p5, -1082130432);
                        } else {
                            v0_2.b = ((float) (p6 * -1));
                            v0_2.d.g(p5, 1065353216);
                        }
                        this.c(v0_2);
                        return;
                    } else {
                        v0_1.e = 1;
                        v0_1.b = ((float) p6);
                        return;
                    }
                } else {
                    v0_1.b = ((float) p6);
                    return;
                }
            }
        } else {
            p5.d(this, ((float) p6));
            float v5_3 = 0;
            while (v5_3 < (this.c + 1)) {
                v5_3++;
            }
            return;
        }
    }

    public final void e(u.f p5, u.f p6, int p7, int p8)
    {
        if ((p8 != 8) || ((!p6.f) || (p5.c != -1))) {
            int v1_2 = this.l();
            u.a v2_0 = 0;
            if (p7 != 0) {
                if (p7 < 0) {
                    p7 *= -1;
                    v2_0 = 1;
                }
                v1_2.b = ((float) p7);
            }
            if (v2_0 != null) {
                v1_2.d.g(p5, 1065353216);
                v1_2.d.g(p6, -1082130432);
            } else {
                v1_2.d.g(p5, -1082130432);
                v1_2.d.g(p6, 1065353216);
            }
            if (p8 != 8) {
                v1_2.a(this, p8);
            }
            this.c(v1_2);
            return;
        } else {
            p5.d(this, (p6.e + ((float) p7)));
            return;
        }
    }

    public final void f(u.f p4, u.f p5, int p6, int p7)
    {
        u.b v0 = this.l();
        u.f v1 = this.m();
        v1.d = 0;
        v0.b(p4, p5, v1, p6);
        if (p7 != 8) {
            v0.d.g(this.j(p7), ((float) ((int) (v0.d.c(v1) * -1082130432))));
        }
        this.c(v0);
        return;
    }

    public final void g(u.f p4, u.f p5, int p6, int p7)
    {
        u.b v0 = this.l();
        u.f v1 = this.m();
        v1.d = 0;
        v0.c(p4, p5, v1, p6);
        if (p7 != 8) {
            v0.d.g(this.j(p7), ((float) ((int) (v0.d.c(v1) * -1082130432))));
        }
        this.c(v0);
        return;
    }

    public final void h(u.b p8)
    {
        if (!p8.e) {
            u.b[] v1_6 = this.k;
            this.g[v1_6] = p8;
            int v0_4 = p8.a;
            v0_4.c = v1_6;
            this.k = (v1_6 + 1);
            v0_4.e(this, p8);
        } else {
            p8.a.d(this, p8.b);
        }
        if (this.b) {
            int v0_2 = 0;
            while (v0_2 < this.k) {
                if (this.g[v0_2] == null) {
                    System.out.println("WTF");
                }
                u.b[] v1_5 = this.g[v0_2];
                if ((v1_5 != null) && (v1_5.e)) {
                    v1_5.a.d(this, v1_5.b);
                    ((p0.c) this.m.b).b(v1_5);
                    this.g[v0_2] = 0;
                    u.b[] v1_8 = (v0_2 + 1);
                    int v3_1 = v1_8;
                    while(true) {
                        int v4_0 = this.k;
                        if (v1_8 >= v4_0) {
                            break;
                        }
                        int v3_2 = this.g;
                        int v4_2 = (v1_8 - 1);
                        int v5_0 = v3_2[v1_8];
                        v3_2[v4_2] = v5_0;
                        int v3_3 = v5_0.a;
                        if (v3_3.c == v1_8) {
                            v3_3.c = v4_2;
                        }
                        v3_1 = v1_8;
                        v1_8++;
                    }
                    if (v3_1 < v4_0) {
                        this.g[v3_1] = 0;
                    }
                    this.k = (v4_0 - 1);
                    v0_2--;
                }
                v0_2++;
            }
            this.b = 0;
        }
        return;
    }

    public final void i()
    {
        int v0 = 0;
        while (v0 < this.k) {
            float v1_2 = this.g[v0];
            v1_2.a.e = v1_2.b;
            v0++;
        }
        return;
    }

    public final u.f j(int p5)
    {
        if ((this.j + 1) >= this.f) {
            this.o();
        }
        u.f v0_3 = this.a(4);
        float[] v1_1 = v0_3.n;
        int v2_0 = (this.c + 1);
        this.c = v2_0;
        this.j = (this.j + 1);
        v0_3.b = v2_0;
        v0_3.d = p5;
        ((u.f[]) this.m.d)[v2_0] = v0_3;
        u.d v5_4 = this.d;
        v5_4.i.b = v0_3;
        java.util.Arrays.fill(v1_1, 0);
        v1_1[v0_3.d] = 1065353216;
        v5_4.j(v0_3);
        return v0_3;
    }

    public final u.f k(Object p6)
    {
        if (p6 != 0) {
            if ((this.j + 1) >= this.f) {
                this.o();
            }
            if ((p6 instanceof w.c)) {
                u.f v0_1 = ((w.c) p6).i;
                if (v0_1 == null) {
                    ((w.c) p6).k();
                    v0_1 = ((w.c) p6).i;
                }
                int v6_1 = v0_1.b;
                b8.g v3 = this.m;
                if ((v6_1 != -1) && ((v6_1 <= this.c) && (((u.f[]) v3.d)[v6_1] != null))) {
                    return v0_1;
                } else {
                    if (v6_1 != -1) {
                        v0_1.c();
                    }
                    int v6_3 = (this.c + 1);
                    this.c = v6_3;
                    this.j = (this.j + 1);
                    v0_1.b = v6_3;
                    v0_1.r = 1;
                    ((u.f[]) v3.d)[v6_3] = v0_1;
                    return v0_1;
                }
            }
        }
        return 0;
    }

    public final u.b l()
    {
        u.b v5_2;
        int v0_0 = this.m;
        p0.c v1_1 = ((p0.c) v0_0.b);
        int v2_0 = v1_1.b;
        if (v2_0 <= 0) {
            v5_2 = 0;
        } else {
            int v2_1 = (v2_0 - 1);
            Object[] v4 = v1_1.a;
            v5_2 = v4[v2_1];
            v4[v2_1] = 0;
            v1_1.b = v2_1;
        }
        u.b v5_0 = ((u.b) v5_2);
        if (v5_0 != null) {
            v5_0.a = 0;
            v5_0.d.b();
            v5_0.b = 0;
            v5_0.e = 0;
        } else {
            v5_0 = new u.b(v0_0);
        }
        return v5_0;
    }

    public final u.f m()
    {
        if ((this.j + 1) >= this.f) {
            this.o();
        }
        u.f v0_3 = this.a(3);
        int v1_2 = (this.c + 1);
        this.c = v1_2;
        this.j = (this.j + 1);
        v0_3.b = v1_2;
        ((u.f[]) this.m.d)[v1_2] = v0_3;
        return v0_3;
    }

    public final void o()
    {
        int v0_1 = (this.e * 2);
        this.e = v0_1;
        this.g = ((u.b[]) java.util.Arrays.copyOf(this.g, v0_1));
        int v0_5 = this.m;
        v0_5.d = ((u.f[]) java.util.Arrays.copyOf(((u.f[]) v0_5.d), this.e));
        int v0_2 = this.e;
        boolean[] v1_3 = new boolean[v0_2];
        this.i = v1_3;
        this.f = v0_2;
        this.l = v0_2;
        return;
    }

    public final void p()
    {
        u.d v0 = this.d;
        if (!v0.e()) {
            if (!this.h) {
                this.q(v0);
                return;
            } else {
                int v1_0 = 0;
                while (v1_0 < this.k) {
                    if (this.g[v1_0].e) {
                        v1_0++;
                    } else {
                        this.q(v0);
                        return;
                    }
                }
                this.i();
                return;
            }
        } else {
            this.i();
            return;
        }
    }

    public final void q(u.d p19)
    {
        int v2_0 = 0;
        while (v2_0 < this.k) {
            int v3_5 = this.g[v2_0];
            float v5_0 = 1;
            if (v3_5.a.r != 1) {
                int v4_0 = 0;
                if (v3_5.b < 0) {
                    int v2_1 = 0;
                    int v3_2 = 0;
                    while (v2_1 == 0) {
                        v3_2 += v5_0;
                        float v7_0 = 2139095039;
                        int v9 = -1;
                        int v10 = -1;
                        int v8 = 0;
                        int v11 = 0;
                        while (v8 < this.k) {
                            u.b v12_2 = this.g[v8];
                            if ((v12_2.a.r != v5_0) && ((!v12_2.e) && (v12_2.b < v4_0))) {
                                int v13_6 = v12_2.d.d();
                                int v14 = 0;
                                while (v14 < v13_6) {
                                    u.f v15_1 = v12_2.d.e(v14);
                                    float v1_5 = v12_2.d.c(v15_1);
                                    if (v1_5 > v4_0) {
                                        int v4_9 = 0;
                                        while (v4_9 < 9) {
                                            float v5_4 = (v15_1.m[v4_9] / v1_5);
                                            if (((v5_4 < v7_0) && (v4_9 == v11)) || (v4_9 > v11)) {
                                                v11 = v4_9;
                                                v10 = v15_1.b;
                                                v9 = v8;
                                                v7_0 = v5_4;
                                            }
                                            v4_9++;
                                        }
                                    }
                                    v14++;
                                    v4_0 = 0;
                                }
                            }
                            v8++;
                            v4_0 = 0;
                            v5_0 = 1;
                        }
                        if (v9 == -1) {
                            v2_1 = 1;
                        } else {
                            float v1_1 = this.g[v9];
                            v1_1.a.c = -1;
                            v1_1.g(((u.f[]) this.m.d)[v10]);
                            int v4_6 = v1_1.a;
                            v4_6.c = v9;
                            v4_6.e(this, v1_1);
                        }
                        if (v3_2 > (this.j / 2)) {
                            v2_1 = 1;
                        }
                        v4_0 = 0;
                        v5_0 = 1;
                    }
                }
            }
            v2_0++;
        }
        this.r(p19);
        this.i();
        return;
    }

    public final void r(u.b p17)
    {
        int v2_0 = 0;
        int v3_1 = 0;
        while (v3_1 < this.j) {
            this.i[v3_1] = 0;
            v3_1++;
        }
        int v3_0 = 0;
        int v4_0 = 0;
        while (v3_0 == 0) {
            int v5_11 = 1;
            v4_0++;
            if (v4_0 >= (this.j * 2)) {
                break;
            }
            u.f v6_2 = p17.a;
            if (v6_2 != null) {
                this.i[v6_2.b] = 1;
            }
            u.f v6_5 = p17.d(this.i);
            if (v6_5 != null) {
                int v7_1 = this.i;
                int v8_0 = v6_5.b;
                if (v7_1[v8_0] != 0) {
                    break;
                }
                v7_1[v8_0] = 1;
            }
            if (v6_5 == null) {
                v3_0 = 1;
            } else {
                int v8_1 = 2139095039;
                int v9_1 = v2_0;
                int v10 = -1;
                while (v9_1 < this.k) {
                    u.b v11_2 = this.g[v9_1];
                    if ((v11_2.a.r != v5_11) && (!v11_2.e)) {
                        int v14_1;
                        u.a v12_3 = v11_2.d;
                        int v13 = v12_3.h;
                        if (v13 != -1) {
                            int v2_3 = 0;
                            while ((v13 != -1) && (v2_3 < v12_3.a)) {
                                if (v12_3.e[v13] != v6_5.b) {
                                    v13 = v12_3.f[v13];
                                    v2_3++;
                                } else {
                                    v14_1 = 1;
                                }
                            }
                            v14_1 = 0;
                        }
                        if (v14_1 != 0) {
                            int v2_5 = v11_2.d.c(v6_5);
                            if (v2_5 < 0) {
                                int v5_10 = ((- v11_2.b) / v2_5);
                                if (v5_10 < v8_1) {
                                    v8_1 = v5_10;
                                    v10 = v9_1;
                                }
                            }
                        }
                    }
                    v9_1++;
                    v5_11 = 1;
                }
                if (v10 > -1) {
                    int v2_2 = this.g[v10];
                    v2_2.a.c = -1;
                    v2_2.g(v6_5);
                    int v5_1 = v2_2.a;
                    v5_1.c = v10;
                    v5_1.e(this, v2_2);
                }
            }
            v2_0 = 0;
        }
        return;
    }

    public final void s()
    {
        int v0 = 0;
        while (v0 < this.k) {
            u.b[] v1_3 = this.g[v0];
            if (v1_3 != null) {
                ((p0.c) this.m.b).b(v1_3);
            }
            this.g[v0] = 0;
            v0++;
        }
        return;
    }

    public final void t()
    {
        int v1_0 = 0;
        while(true) {
            u.f v2_0 = this.m;
            u.b v3_5 = ((u.f[]) v2_0.d);
            if (v1_0 >= v3_5.length) {
                break;
            }
            u.f v2_1 = v3_5[v1_0];
            if (v2_1 != null) {
                v2_1.c();
            }
            v1_0++;
        }
        int v1_7 = ((p0.c) v2_0.c);
        u.b v3_6 = this.n;
        int v4_0 = this.o;
        v1_7.getClass();
        if (v4_0 > v3_6.length) {
            v4_0 = v3_6.length;
        }
        int v5_1 = 0;
        while (v5_1 < v4_0) {
            int v7_0 = v1_7.b;
            Object[] v8 = v1_7.a;
            if (v7_0 < v8.length) {
                v8[v7_0] = v3_6[v5_1];
                v1_7.b = (v7_0 + 1);
            }
            v5_1++;
        }
        this.o = 0;
        java.util.Arrays.fill(((u.f[]) v2_0.d), 0);
        this.c = 0;
        int v1_3 = this.d;
        v1_3.h = 0;
        v1_3.b = 0;
        this.j = 1;
        int v1_5 = 0;
        while (v1_5 < this.k) {
            v1_5++;
        }
        this.s();
        this.k = 0;
        this.p = new u.b(v2_0);
        return;
    }
}
