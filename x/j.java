package x;
public final class j extends x.o {

    public final void a(x.d p10)
    {
        int v10_1 = ((w.a) this.b);
        int v0 = v10_1.s0;
        x.f v1 = this.h;
        int v2_1 = v1.l;
        int v3 = v2_1.size();
        int v5_1 = 0;
        int v7_1 = -1;
        int v6 = 0;
        while (v6 < v3) {
            int v8_0 = v2_1.get(v6);
            v6++;
            int v8_2 = ((x.f) v8_0).g;
            if ((v7_1 == -1) || (v8_2 < v7_1)) {
                v7_1 = v8_2;
            }
            if (v5_1 < v8_2) {
                v5_1 = v8_2;
            }
        }
        if ((v0 != 0) && (v0 != 2)) {
            v1.d((v5_1 + v10_1.u0));
            return;
        } else {
            v1.d((v7_1 + v10_1.u0));
            return;
        }
    }

    public final void d()
    {
        x.f v0_0 = this.b;
        if ((v0_0 instanceof w.a)) {
            x.f v1_1 = this.h;
            v1_1.b = 1;
            java.util.ArrayList v3 = v1_1.l;
            x.f v0_16 = ((w.a) v0_0);
            java.util.ArrayList v4_7 = v0_16.s0;
            boolean v5 = v0_16.t0;
            int v7 = 0;
            if (v4_7 == null) {
                v1_1.e = 4;
                while (v7 < v0_16.r0) {
                    x.f v2_7 = v0_16.q0[v7];
                    if ((v5) || (v2_7.g0 != 8)) {
                        x.f v2_9 = v2_7.d.h;
                        v2_9.k.add(v1_1);
                        v3.add(v2_9);
                    }
                    v7++;
                }
                this.m(this.b.d.h);
                this.m(this.b.d.i);
            } else {
                if (v4_7 == 1) {
                    v1_1.e = 5;
                    while (v7 < v0_16.r0) {
                        x.f v2_14 = v0_16.q0[v7];
                        if ((v5) || (v2_14.g0 != 8)) {
                            x.f v2_16 = v2_14.d.i;
                            v2_16.k.add(v1_1);
                            v3.add(v2_16);
                        }
                        v7++;
                    }
                    this.m(this.b.d.h);
                    this.m(this.b.d.i);
                    return;
                } else {
                    if (v4_7 == 2) {
                        v1_1.e = 6;
                        while (v7 < v0_16.r0) {
                            x.f v2_21 = v0_16.q0[v7];
                            if ((v5) || (v2_21.g0 != 8)) {
                                x.f v2_23 = v2_21.e.h;
                                v2_23.k.add(v1_1);
                                v3.add(v2_23);
                            }
                            v7++;
                        }
                        this.m(this.b.e.h);
                        this.m(this.b.e.i);
                        return;
                    } else {
                        if (v4_7 == 3) {
                            v1_1.e = 7;
                            while (v7 < v0_16.r0) {
                                x.f v2_1 = v0_16.q0[v7];
                                if ((v5) || (v2_1.g0 != 8)) {
                                    x.f v2_3 = v2_1.e.i;
                                    v2_3.k.add(v1_1);
                                    v3.add(v2_3);
                                }
                                v7++;
                            }
                            this.m(this.b.e.h);
                            this.m(this.b.e.i);
                            return;
                        }
                    }
                }
            }
        }
        return;
    }

    public final void e()
    {
        w.d v0 = this.b;
        if ((v0 instanceof w.a)) {
            int v1_5 = ((w.a) v0).s0;
            x.f v2 = this.h;
            if ((v1_5 != 0) && (v1_5 != 1)) {
                v0.Z = v2.g;
                return;
            } else {
                v0.Y = v2.g;
            }
        }
        return;
    }

    public final void f()
    {
        this.c = 0;
        this.h.c();
        return;
    }

    public final boolean k()
    {
        return 0;
    }

    public final void m(x.f p3)
    {
        x.f v0 = this.h;
        v0.k.add(p3);
        p3.l.add(v0);
        return;
    }
}
