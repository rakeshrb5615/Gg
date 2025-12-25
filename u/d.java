package u;
public final class d extends u.b {
    public u.f[] f;
    public u.f[] g;
    public int h;
    public n0.a i;

    public final u.f d(boolean[] p10)
    {
        int v1 = 0;
        int v2 = -1;
        while (v1 < this.h) {
            float v3_0 = this.f;
            int v4_0 = v3_0[v1];
            if (p10[v4_0.b] == null) {
                n0.a v5_2 = this.i;
                v5_2.b = v4_0;
                int v4_1 = 8;
                if (v2 != -1) {
                    while (v4_1 >= 0) {
                        float v6_1 = v3_0[v2].n[v4_1];
                        float v7_3 = ((u.f) v5_2.b).n[v4_1];
                        if (v7_3 != v6_1) {
                            if (v7_3 >= v6_1) {
                                break;
                            }
                        } else {
                            v4_1--;
                        }
                    }
                    v1++;
                } else {
                    while (v4_1 >= 0) {
                        float v3_7 = ((u.f) v5_2.b).n[v4_1];
                        if (v3_7 > 0) {
                            break;
                        }
                        if (v3_7 >= 0) {
                            v4_1--;
                        }
                    }
                }
                v2 = v1;
            }
        }
        if (v2 != -1) {
            return this.f[v2];
        } else {
            return 0;
        }
    }

    public final boolean e()
    {
        if (this.h != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void i(u.c p19, u.b p20, boolean p21)
    {
        u.f v2 = p20.a;
        if (v2 != null) {
            float[] v3 = v2.n;
            u.a v4 = p20.d;
            int v5 = v4.d();
            int v7 = 0;
            while (v7 < v5) {
                float v8_0 = v4.e(v7);
                float v9 = v4.f(v7);
                u.f v10_0 = this.i;
                v10_0.b = v8_0;
                if (!v8_0.a) {
                    int v11_1 = 0;
                    while (v11_1 < 9) {
                        int v15_0 = v3[v11_1];
                        if (v15_0 == 0) {
                            ((u.f) v10_0.b).n[v11_1] = 0;
                        } else {
                            int v15_1 = (v15_0 * v9);
                            if (Math.abs(v15_1) < 953267991) {
                                v15_1 = 0;
                            }
                            ((u.f) v10_0.b).n[v11_1] = v15_1;
                        }
                        v11_1++;
                    }
                    this.j(v8_0);
                } else {
                    float v8_1 = 1;
                    int v11_2 = 0;
                    while (v11_2 < 9) {
                        int v15_4 = ((u.f) v10_0.b).n;
                        float v17_2 = ((v3[v11_2] * v9) + v15_4[v11_2]);
                        v15_4[v11_2] = v17_2;
                        if (Math.abs(v17_2) >= 953267991) {
                            v8_1 = 0;
                        } else {
                            ((u.f) v10_0.b).n[v11_2] = 0;
                        }
                        v11_2++;
                    }
                    if (v8_1 != 0) {
                        ((u.d) v10_0.c).k(((u.f) v10_0.b));
                    }
                }
                this.b = ((p20.b * v9) + this.b);
                v7++;
            }
            this.k(v2);
            return;
        } else {
            return;
        }
    }

    public final void j(u.f p7)
    {
        u.f[] v2_5 = this.f;
        if ((this.h + 1) > v2_5.length) {
            int v0_1 = ((u.f[]) java.util.Arrays.copyOf(v2_5, (v2_5.length * 2)));
            this.f = v0_1;
            this.g = ((u.f[]) java.util.Arrays.copyOf(v0_1, (v0_1.length * 2)));
        }
        int v0_4 = this.f;
        u.f[] v2_2 = this.h;
        v0_4[v2_2] = p7;
        u.f v3_0 = (v2_2 + 1);
        this.h = v3_0;
        if ((v3_0 > 1) && (v0_4[v2_2].b > p7.b)) {
            int v0_8 = 0;
            u.f[] v2_4 = 0;
            while(true) {
                u.f v3_1 = this.h;
                if (v2_4 >= v3_1) {
                    break;
                }
                this.g[v2_4] = this.f[v2_4];
                v2_4++;
            }
            java.util.Arrays.sort(this.g, 0, v3_1, new a2.q(3));
            while (v0_8 < this.h) {
                this.f[v0_8] = this.g[v0_8];
                v0_8++;
            }
        }
        p7.a = 1;
        p7.a(this);
        return;
    }

    public final void k(u.f p6)
    {
        int v1 = 0;
        while (v1 < this.h) {
            if (this.f[v1] != p6) {
                v1++;
            }
            while(true) {
                int v2_5 = this.h;
                if (v1 >= (v2_5 - 1)) {
                    break;
                }
                int v2_1 = this.f;
                int v3_1 = (v1 + 1);
                v2_1[v1] = v2_1[v3_1];
                v1 = v3_1;
            }
            this.h = (v2_5 - 1);
            p6.a = 0;
            return;
        }
        return;
    }

    public final String toString()
    {
        n0.a v0 = this.i;
        String v1_3 = new StringBuilder(" goal -> (");
        v1_3.append(this.b);
        v1_3.append(") : ");
        String v1_2 = v1_3.toString();
        int v2_0 = 0;
        while (v2_0 < this.h) {
            v0.b = this.f[v2_0];
            StringBuilder v3_4 = new StringBuilder();
            v3_4.append(v1_2);
            v3_4.append(v0);
            v3_4.append(" ");
            v1_2 = v3_4.toString();
            v2_0++;
        }
        return v1_2;
    }
}
