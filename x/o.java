package x;
public abstract class o implements x.d {
    public int a;
    public w.d b;
    public x.l c;
    public int d;
    public final x.g e;
    public int f;
    public boolean g;
    public final x.f h;
    public final x.f i;
    public int j;

    public o(w.d p2)
    {
        this.e = new x.g(this);
        this.f = 0;
        this.g = 0;
        this.h = new x.f(this);
        this.i = new x.f(this);
        this.j = 1;
        this.b = p2;
        return;
    }

    public static void b(x.f p1, x.f p2, int p3)
    {
        p1.l.add(p2);
        p1.f = p3;
        p2.k.add(p1);
        return;
    }

    public static x.f h(w.c p2)
    {
        x.f v2_1 = p2.f;
        if (v2_1 != null) {
            w.d v0 = v2_1.d;
            x.f v2_12 = u.e.c(v2_1.e);
            if (v2_12 == 1) {
                return v0.d.h;
            } else {
                if (v2_12 == 2) {
                    return v0.e.h;
                } else {
                    if (v2_12 == 3) {
                        return v0.d.i;
                    } else {
                        if (v2_12 == 4) {
                            return v0.e.i;
                        } else {
                            if (v2_12 == 5) {
                                return v0.e.k;
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static x.f i(w.c p1, int p2)
    {
        x.f v1_1 = p1.f;
        if (v1_1 != null) {
            x.m v2_1;
            int v0_3 = v1_1.d;
            if (p2 != null) {
                v2_1 = v0_3.e;
            } else {
                v2_1 = v0_3.d;
            }
            x.f v1_6 = u.e.c(v1_1.e);
            if ((v1_6 == 1) || (v1_6 == 2)) {
                return v2_1.h;
            } else {
                if ((v1_6 == 3) || (v1_6 == 4)) {
                    return v2_1.i;
                }
            }
        }
        return 0;
    }

    public final void c(x.f p3, x.f p4, int p5, x.g p6)
    {
        p3.l.add(p4);
        p3.l.add(this.e);
        p3.h = p5;
        p3.i = p6;
        p4.k.add(p3);
        p6.k.add(p3);
        return;
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int p2, int p3)
    {
        if (p3 != 0) {
            int v3_1 = this.b;
            int v0_1 = v3_1.y;
            int v3_6 = Math.max(v3_1.x, p2);
            if (v0_1 > 0) {
                v3_6 = Math.min(v0_1, p2);
            }
            if (v3_6 != p2) {
                return v3_6;
            }
        } else {
            int v3_2 = this.b;
            int v0_0 = v3_2.v;
            int v3_4 = Math.max(v3_2.u, p2);
            if (v0_0 > 0) {
                v3_4 = Math.min(v0_0, p2);
            }
            if (v3_4 != p2) {
                return v3_4;
            }
        }
        return p2;
    }

    public long j()
    {
        long v0_0 = this.e;
        if (!v0_0.j) {
            return 0;
        } else {
            return ((long) v0_0.g);
        }
    }

    public abstract boolean k();

    public final void l(w.c p12, w.c p13, int p14)
    {
        x.f v0 = x.o.h(p12);
        x.f v1 = x.o.h(p13);
        if ((v0.j) && (v1.j)) {
            int v12_2 = (p12.e() + v0.g);
            int v2_0 = (v1.g - p13.e());
            int v13_4 = (v2_0 - v12_2);
            x.g v3 = this.e;
            if ((!v3.j) && (this.d == 3)) {
                int v4_2 = this.a;
                if (v4_2 == 0) {
                    v3.d(this.g(v13_4, p14));
                } else {
                    if (v4_2 == 1) {
                        v3.d(Math.min(this.g(v3.m, p14), v13_4));
                    } else {
                        if (v4_2 == 2) {
                            int v4_7 = this.b;
                            float v6_1 = v4_7.T;
                            if (v6_1 != 0) {
                                float v6_2;
                                if (p14 != 0) {
                                    v6_2 = v6_1.e;
                                } else {
                                    v6_2 = v6_1.d;
                                }
                                float v6_3 = v6_2.e;
                                if (v6_3.j) {
                                    int v4_8;
                                    if (p14 != 0) {
                                        v4_8 = v4_7.z;
                                    } else {
                                        v4_8 = v4_7.w;
                                    }
                                    v3.d(this.g(((int) ((((float) v6_3.g) * v4_8) + 1056964608)), p14));
                                }
                            }
                        } else {
                            if (v4_2 == 3) {
                                int v4_11 = this.b;
                                boolean v8_1 = v4_11.d;
                                if ((v8_1.d == 3) && (v8_1.a == 3)) {
                                    int v9_2 = v4_11.e;
                                    if ((v9_2.d == 3) && (v9_2.a == 3)) {
                                        if (v3.j) {
                                            int v4_17 = v3.g;
                                            float v6_15 = this.i;
                                            boolean v7_2 = this.h;
                                            if (v4_17 != v13_4) {
                                                int v13_1;
                                                if (p14 != 0) {
                                                    v13_1 = this.b.e0;
                                                } else {
                                                    v13_1 = this.b.d0;
                                                }
                                                if (v0 == v1) {
                                                    v12_2 = v0.g;
                                                    v2_0 = v1.g;
                                                    v13_1 = 1056964608;
                                                }
                                                v7_2.d(((int) ((((float) ((v2_0 - v12_2) - v4_17)) * v13_1) + (((float) v12_2) + 1056964608))));
                                                v6_15.d((v7_2.g + v3.g));
                                            } else {
                                                v7_2.d(v12_2);
                                                v6_15.d(v2_0);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                }
                                if (p14 == 0) {
                                    v8_1 = v4_11.e;
                                }
                                float v6_8 = v8_1.e;
                                if (v6_8.j) {
                                    int v4_15;
                                    int v4_12 = v4_11.W;
                                    if (p14 != 1) {
                                        v4_15 = ((int) ((v4_12 * ((float) v6_8.g)) + 1056964608));
                                    } else {
                                        v4_15 = ((int) ((((float) v6_8.g) / v4_12) + 1056964608));
                                    }
                                    v3.d(v4_15);
                                }
                            }
                        }
                    }
                }
            }
        }
        return;
    }
}
