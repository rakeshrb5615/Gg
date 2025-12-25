package w;
public final class e extends w.d {
    public int A0;
    public w.b[] B0;
    public w.b[] C0;
    public int D0;
    public boolean E0;
    public boolean F0;
    public ref.WeakReference G0;
    public ref.WeakReference H0;
    public ref.WeakReference I0;
    public ref.WeakReference J0;
    public final java.util.HashSet K0;
    public final x.b L0;
    public java.util.ArrayList q0;
    public final b8.g r0;
    public final x.e s0;
    public int t0;
    public z.f u0;
    public boolean v0;
    public final u.c w0;
    public int x0;
    public int y0;
    public int z0;

    public e()
    {
        this.q0 = new java.util.ArrayList();
        this.r0 = new b8.g(this);
        x.b v0_10 = new x.e();
        v0_10.b = 1;
        v0_10.c = 1;
        v0_10.e = new java.util.ArrayList();
        new java.util.ArrayList();
        v0_10.f = 0;
        v0_10.g = new x.b();
        v0_10.h = new java.util.ArrayList();
        v0_10.a = this;
        v0_10.d = this;
        this.s0 = v0_10;
        this.u0 = 0;
        this.v0 = 0;
        this.w0 = new u.c();
        this.z0 = 0;
        this.A0 = 0;
        w.b[] v3 = new w.b[4];
        this.B0 = v3;
        int v2_7 = new w.b[4];
        this.C0 = v2_7;
        this.D0 = 257;
        this.E0 = 0;
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = 0;
        this.K0 = new java.util.HashSet();
        this.L0 = new x.b();
        return;
    }

    public static void V(w.d p9, z.f p10, x.b p11)
    {
        if (p10 != 0) {
            float v1_5 = p9.t;
            if ((p9.g0 != 8) && ((!(p9 instanceof w.h)) && (!(p9 instanceof w.a)))) {
                int v0_13;
                int v0_1 = p9.p0;
                p11.a = v0_1[0];
                p11.b = v0_1[1];
                p11.c = p9.q();
                p11.d = p9.k();
                p11.i = 0;
                p11.j = 0;
                if (p11.a != 3) {
                    v0_13 = 0;
                } else {
                    v0_13 = 1;
                }
                int v4_1;
                if (p11.b != 3) {
                    v4_1 = 0;
                } else {
                    v4_1 = 1;
                }
                if ((v0_13 == 0) || (p9.W <= 0)) {
                    float v6_2 = 0;
                } else {
                    v6_2 = 1;
                }
                if ((v4_1 == 0) || (p9.W <= 0)) {
                    int v5_3 = 0;
                } else {
                    v5_3 = 1;
                }
                if ((v0_13 != 0) && ((p9.t(0)) && ((p9.r == 0) && (v6_2 == 0)))) {
                    p11.a = 2;
                    if ((v4_1 != 0) && (p9.s == 0)) {
                        p11.a = 1;
                    }
                    v0_13 = 0;
                }
                if ((v4_1 != 0) && ((p9.t(1)) && ((p9.s == 0) && (v5_3 == 0)))) {
                    p11.b = 2;
                    if ((v0_13 != 0) && (p9.r == 0)) {
                        p11.b = 1;
                    }
                    v4_1 = 0;
                }
                if (p9.A()) {
                    p11.a = 1;
                    v0_13 = 0;
                }
                if (p9.B()) {
                    p11.b = 1;
                    v4_1 = 0;
                }
                if (v6_2 != 0) {
                    if (v1_5[0] != 4) {
                        if (v4_1 == 0) {
                            int v4_4;
                            if (p11.b != 1) {
                                p11.a = 2;
                                p10.b(p9, p11);
                                v4_4 = p11.f;
                            } else {
                                v4_4 = p11.d;
                            }
                            p11.a = 1;
                            p11.c = ((int) (p9.W * ((float) v4_4)));
                        }
                    } else {
                        p11.a = 1;
                    }
                }
                if (v5_3 != 0) {
                    if (v1_5[1] != 4) {
                        if (v0_13 == 0) {
                            int v0_3;
                            if (p11.a != 1) {
                                p11.b = 2;
                                p10.b(p9, p11);
                                v0_3 = p11.e;
                            } else {
                                v0_3 = p11.c;
                            }
                            p11.b = 1;
                            if (p9.X != -1) {
                                p11.d = ((int) (p9.W * ((float) v0_3)));
                            } else {
                                p11.d = ((int) (((float) v0_3) / p9.W));
                            }
                        }
                    } else {
                        p11.b = 1;
                    }
                }
                p10.b(p9, p11);
                p9.O(p11.e);
                p9.L(p11.f);
                p9.E = p11.h;
                p9.I(p11.g);
                p11.j = 0;
                return;
            } else {
                p11.e = 0;
                p11.f = 0;
                return;
            }
        } else {
            return;
        }
    }

    public final void C()
    {
        this.w0.t();
        this.x0 = 0;
        this.y0 = 0;
        this.q0.clear();
        super.C();
        return;
    }

    public final void F(b8.g p4)
    {
        super.F(p4);
        int v0_1 = this.q0.size();
        int v1 = 0;
        while (v1 < v0_1) {
            ((w.d) this.q0.get(v1)).F(p4);
            v1++;
        }
        return;
    }

    public final void P(boolean p4, boolean p5)
    {
        super.P(p4, p5);
        int v0_1 = this.q0.size();
        int v1 = 0;
        while (v1 < v0_1) {
            ((w.d) this.q0.get(v1)).P(p4, p5);
            v1++;
        }
        return;
    }

    public final void R(w.d p6, int p7)
    {
        if (p7 != null) {
            if (p7 == 1) {
                int v1_5 = this.B0;
                if ((this.A0 + 1) >= v1_5.length) {
                    this.B0 = ((w.b[]) java.util.Arrays.copyOf(v1_5, (v1_5.length * 2)));
                }
                int v1_0 = this.A0;
                this.B0[v1_0] = new w.b(p6, 1, this.v0);
                this.A0 = (v1_0 + 1);
            }
            return;
        } else {
            int v1_2 = this.C0;
            if ((this.z0 + 1) >= v1_2.length) {
                this.C0 = ((w.b[]) java.util.Arrays.copyOf(v1_2, (v1_2.length * 2)));
            }
            int v1_3 = this.z0;
            this.C0[v1_3] = new w.b(p6, 0, this.v0);
            this.z0 = (v1_3 + 1);
            return;
        }
    }

    public final void S(u.c p13)
    {
        int v0_1 = this.W(64);
        this.b(p13, v0_1);
        w.d v1_3 = this.q0.size();
        int v3_1 = 0;
        int v4_2 = 0;
        while (v3_1 < v1_3) {
            w.e v6_8 = ((w.d) this.q0.get(v3_1));
            boolean v7_10 = v6_8.S;
            v7_10[0] = 0;
            v7_10[1] = 0;
            if ((v6_8 instanceof w.a)) {
                v4_2 = 1;
            }
            v3_1++;
        }
        if (v4_2 != 0) {
            int v4_0 = 0;
            while (v4_0 < v1_3) {
                w.e v6_4 = ((w.d) this.q0.get(v4_0));
                if ((v6_4 instanceof w.a)) {
                    w.e v6_5 = ((w.a) v6_4);
                    boolean v7_9 = 0;
                    while (v7_9 < v6_5.r0) {
                        boolean[] v8_7 = v6_5.q0[v7_9];
                        if ((v6_5.t0) || (v8_7.c())) {
                            int v9_4 = v6_5.s0;
                            if ((v9_4 != 0) && (v9_4 != 1)) {
                                if ((v9_4 == 2) || (v9_4 == 3)) {
                                    v8_7.S[1] = 1;
                                }
                            } else {
                                v8_7.S[0] = 1;
                            }
                        }
                        v7_9++;
                    }
                }
                v4_0++;
            }
        }
        int v4_1 = this.K0;
        v4_1.clear();
        w.e v6_1 = 0;
        while (v6_1 < v1_3) {
            boolean v7_7 = ((w.d) this.q0.get(v6_1));
            v7_7.getClass();
            boolean[] v8_4 = (v7_7 instanceof w.g);
            if ((v8_4 != null) || ((v7_7 instanceof w.h))) {
                if (v8_4 == null) {
                    v7_7.b(p13, v0_1);
                } else {
                    v4_1.add(v7_7);
                }
            }
            v6_1++;
        }
        while (v4_1.size() > 0) {
            w.e v6_15 = v4_1.size();
            boolean v7_0 = v4_1.iterator();
            while (v7_0.hasNext()) {
                boolean[] v8_3 = ((w.g) ((w.d) v7_0.next()));
                int v9_0 = 0;
                while (v9_0 < v8_3.r0) {
                    if (!v4_1.contains(v8_3.q0[v9_0])) {
                        v9_0++;
                    } else {
                        v8_3.b(p13, v0_1);
                        v4_1.remove(v8_3);
                    }
                    if (v6_15 == v4_1.size()) {
                        w.e v6_0 = v4_1.iterator();
                        while (v6_0.hasNext()) {
                            ((w.d) v6_0.next()).b(p13, v0_1);
                        }
                        v4_1.clear();
                    }
                    w.e v6_11;
                    boolean[] v8_10;
                    if (!u.c.q) {
                        v6_11 = this;
                        v8_10 = p13;
                        int v13_1 = 0;
                        while (v13_1 < v1_3) {
                            int v4_6 = ((w.d) this.q0.get(v13_1));
                            if (!(v4_6 instanceof w.e)) {
                                w.j.b(this, p13, v4_6);
                                if ((!(v4_6 instanceof w.g)) && (!(v4_6 instanceof w.h))) {
                                    v4_6.b(p13, v0_1);
                                }
                            } else {
                                boolean v7_14 = v4_6.p0;
                                int v9_5 = v7_14[0];
                                boolean v7_15 = v7_14[1];
                                if (v9_5 == 2) {
                                    v4_6.M(1);
                                }
                                if (v7_15 == 2) {
                                    v4_6.N(1);
                                }
                                v4_6.b(p13, v0_1);
                                if (v9_5 == 2) {
                                    v4_6.M(v9_5);
                                }
                                if (v7_15 == 2) {
                                    v4_6.N(v7_15);
                                }
                            }
                            v13_1++;
                        }
                    } else {
                        int v9_7 = new java.util.HashSet();
                        int v4_7 = 0;
                        while (v4_7 < v1_3) {
                            w.e v6_14 = ((w.d) this.q0.get(v4_7));
                            v6_14.getClass();
                            if ((!(v6_14 instanceof w.g)) && (!(v6_14 instanceof w.h))) {
                                v9_7.add(v6_14);
                            }
                            v4_7++;
                        }
                        int v10_5;
                        if (this.p0[0] != 2) {
                            v10_5 = 1;
                        } else {
                            v10_5 = 0;
                        }
                        v6_11 = this;
                        v8_10 = p13;
                        this.a(this, p13, v9_7, v10_5, 0);
                        int v13_2 = v9_7.iterator();
                        while (v13_2.hasNext()) {
                            w.d v1_6 = ((w.d) v13_2.next());
                            w.j.b(this, p13, v1_6);
                            v1_6.b(p13, v0_1);
                        }
                    }
                    if (v6_11.z0 > 0) {
                        w.j.a(this, v8_10, 0, 0);
                    }
                    if (v6_11.A0 > 0) {
                        w.j.a(this, v8_10, 0, 1);
                    }
                    return;
                }
            }
        }
    }

    public final boolean T(int p18, boolean p19)
    {
        int v2_0 = this.s0;
        java.util.ArrayList v3 = v2_0.e;
        w.e v4 = v2_0.a;
        int v6 = v4.j(0);
        int v7_8 = v4.p0;
        int v9 = v4.j(1);
        boolean v10_6 = v4.r();
        boolean v11_10 = v4.s();
        if ((p19) && ((v6 == 2) || (v9 == 2))) {
            int v13 = v3.size();
            int v14 = 0;
            while (v14 < v13) {
                x.o v15_0 = v3.get(v14);
                v14++;
                x.o v15_1 = ((x.o) v15_0);
                if ((v15_1.f == p18) && (!v15_1.k())) {
                    int v5_1 = 0;
                }
                if (p18 != 0) {
                    if ((v5_1 != 0) && (v9 == 2)) {
                        v4.N(1);
                        v4.L(v2_0.d(v4, 1));
                        v4.e.e.d(v4.k());
                    }
                } else {
                    if ((v5_1 != 0) && (v6 == 2)) {
                        v4.M(1);
                        v4.O(v2_0.d(v4, 0));
                        v4.d.e.d(v4.q());
                    }
                }
            }
            v5_1 = p19;
        }
        int v16;
        int v5_15;
        if (p18 != 0) {
            v16 = 0;
            int v7_2 = v7_8[1];
            if ((v7_2 != 1) && (v7_2 != 4)) {
                v5_15 = v16;
            } else {
                int v5_13 = (v4.k() + v11_10);
                v4.e.i.d(v5_13);
                v4.e.e.d((v5_13 - v11_10));
                v5_15 = 1;
            }
        } else {
            v16 = 0;
            int v7_7 = v7_8[0];
            if ((v7_7 != 1) && (v7_7 != 4)) {
            } else {
                int v5_17 = (v4.q() + v10_6);
                v4.d.i.d(v5_17);
                v4.d.e.d((v5_17 - v10_6));
            }
        }
        v2_0.g();
        int v2_1 = v3.size();
        int v7_1 = v16;
        while (v7_1 < v2_1) {
            boolean v10_4 = v3.get(v7_1);
            v7_1++;
            boolean v10_5 = ((x.o) v10_4);
            if ((v10_5.f == p18) && ((v10_5.b != v4) || (v10_5.g))) {
                v10_5.e();
            }
        }
        int v2_2 = v3.size();
        int v7_0 = v16;
        while (v7_0 < v2_2) {
            boolean v10_0 = v3.get(v7_0);
            v7_0++;
            boolean v10_1 = ((x.o) v10_0);
            if (((v10_1.f == p18) && ((v5_15 != 0) || (v10_1.b != v4))) && ((!v10_1.h.j) || ((!v10_1.i.j) || ((!(v10_1 instanceof x.c)) && (!v10_1.e.j))))) {
                int v5_0 = v16;
            }
            v4.M(v6);
            v4.N(v9);
            return v5_0;
        }
        v5_0 = 1;
        v4.M(v6);
        v4.N(v9);
        return v5_0;
    }

    public final void U()
    {
        w.d v22_1;
        int v2_0 = 0;
        this.Y = 0;
        this.Z = 0;
        this.E0 = 0;
        this.F0 = 0;
        int v3_16 = this.q0.size();
        int v0_1 = Math.max(0, this.q());
        int v4_7 = Math.max(0, this.k());
        w.d v5_28 = this.p0;
        x.n v7_0 = v5_28[1];
        int v8_0 = v5_28[0];
        java.util.ArrayList v11_1 = this.J;
        int v12_1 = this.I;
        if ((this.t0 != 0) || (!w.j.c(this.D0, 1))) {
            v22_1 = v5_28;
        } else {
            z.f v9_3 = this.u0;
            int v14_25 = v5_28[0];
            int v15_19 = v5_28[1];
            this.E();
            int v10_4 = this.q0;
            int v13_1 = v10_4.size();
            while (v2_0 < v13_1) {
                ((w.d) v10_4.get(v2_0)).E();
                v2_0++;
            }
            int v2_23 = this.v0;
            if (v14_25 != 1) {
                v12_1.l(0);
                this.Y = 0;
            } else {
                this.J(0, this.q());
            }
            int v6_32 = 0;
            int v14_19 = 0;
            int v19_1 = 0;
            while (v6_32 < v13_1) {
                int v23_1;
                w.d v22_0 = v5_28;
                w.d v5_23 = ((w.d) v10_4.get(v6_32));
                int v21_2 = v6_32;
                if (!(v5_23 instanceof w.h)) {
                    v23_1 = v14_19;
                    if ((!(v5_23 instanceof w.a)) || (((w.a) v5_23).U() != 0)) {
                        v14_19 = v23_1;
                    } else {
                        v14_19 = v23_1;
                        v19_1 = 1;
                    }
                } else {
                    w.d v5_26 = ((w.h) v5_23);
                    v23_1 = v14_19;
                    if (v5_26.u0 != 1) {
                    } else {
                        int v6_21 = v5_26.r0;
                        if (v6_21 == -1) {
                            if ((v5_26.s0 == -1) || (!this.A())) {
                                if (this.A()) {
                                    v5_26.R(((int) ((v5_26.q0 * ((float) this.q())) + 1056964608)));
                                }
                            } else {
                                v5_26.R((this.q() - v5_26.s0));
                            }
                        } else {
                            v5_26.R(v6_21);
                        }
                        v23_1 = 1;
                    }
                }
                v6_32 = (v21_2 + 1);
                v5_28 = v22_0;
            }
            v22_1 = v5_28;
            if (v14_19 != 0) {
                w.d v5_21 = 0;
                while (v5_21 < v13_1) {
                    int v21_0;
                    int v6_15 = ((w.d) v10_4.get(v5_21));
                    if (!(v6_15 instanceof w.h)) {
                        v21_0 = v5_21;
                    } else {
                        int v6_16 = ((w.h) v6_15);
                        v21_0 = v5_21;
                        if (v6_16.u0 == 1) {
                            x.h.c(0, v6_16, v9_3, v2_23);
                        }
                    }
                    v5_21 = (v21_0 + 1);
                }
            }
            x.h.c(0, this, v9_3, v2_23);
            if (v19_1 != 0) {
                w.d v5_18 = 0;
                while (v5_18 < v13_1) {
                    int v6_12 = ((w.d) v10_4.get(v5_18));
                    if ((v6_12 instanceof w.a)) {
                        int v6_13 = ((w.a) v6_12);
                        if ((v6_13.U() == 0) && (v6_13.T())) {
                            x.h.c(1, v6_13, v9_3, v2_23);
                        }
                    }
                    v5_18++;
                }
            }
            if (v15_19 != 1) {
                v11_1.l(0);
                this.Z = 0;
            } else {
                this.K(0, this.k());
            }
            w.d v5_17 = 0;
            int v6_10 = 0;
            int v14_11 = 0;
            while (v5_17 < v13_1) {
                int v15_5 = ((w.d) v10_4.get(v5_17));
                int v19_0 = v5_17;
                if (!(v15_5 instanceof w.h)) {
                    if (((v15_5 instanceof w.a)) && (((w.a) v15_5).U() == 1)) {
                        v14_11 = 1;
                    }
                } else {
                    int v15_8 = ((w.h) v15_5);
                    if (v15_8.u0 == 0) {
                        w.d v5_7 = v15_8.r0;
                        if (v5_7 == -1) {
                            if ((v15_8.s0 == -1) || (!this.B())) {
                                if (this.B()) {
                                    v15_8.R(((int) ((v15_8.q0 * ((float) this.k())) + 1056964608)));
                                }
                            } else {
                                v15_8.R((this.k() - v15_8.s0));
                            }
                        } else {
                            v15_8.R(v5_7);
                        }
                        v6_10 = 1;
                    }
                }
                v5_17 = (v19_0 + 1);
            }
            if (v6_10 != 0) {
                w.d v5_2 = 0;
                while (v5_2 < v13_1) {
                    int v6_4 = ((w.d) v10_4.get(v5_2));
                    if ((v6_4 instanceof w.h)) {
                        int v6_5 = ((w.h) v6_4);
                        if (v6_5.u0 == 0) {
                            x.h.i(1, v6_5, v9_3);
                        }
                    }
                    v5_2++;
                }
            }
            x.h.i(0, this, v9_3);
            if (v14_11 != 0) {
                w.d v5_1 = 0;
                while (v5_1 < v13_1) {
                    int v6_1 = ((w.d) v10_4.get(v5_1));
                    if ((v6_1 instanceof w.a)) {
                        int v6_2 = ((w.a) v6_1);
                        if ((v6_2.U() == 1) && (v6_2.T())) {
                            x.h.i(1, v6_2, v9_3);
                        }
                    }
                    v5_1++;
                }
            }
            w.d v5_0 = 0;
            while (v5_0 < v13_1) {
                int v6_98 = ((w.d) v10_4.get(v5_0));
                if ((v6_98.z()) && (x.h.a(v6_98))) {
                    w.e.V(v6_98, v9_3, x.h.a);
                    if (!(v6_98 instanceof w.h)) {
                        x.h.c(0, v6_98, v9_3, v2_23);
                        x.h.i(0, v6_98, v9_3);
                    } else {
                        if (((w.h) v6_98).u0 != 0) {
                            x.h.c(0, v6_98, v9_3, v2_23);
                        } else {
                            x.h.i(0, v6_98, v9_3);
                        }
                    }
                }
                v5_0++;
            }
            int v2_29 = 0;
            while (v2_29 < v3_16) {
                w.d v5_68 = ((w.d) this.q0.get(v2_29));
                if ((v5_68.z()) && ((!(v5_68 instanceof w.h)) && ((!(v5_68 instanceof w.a)) && ((!(v5_68 instanceof w.g)) && (!v5_68.F))))) {
                    z.f v9_5 = v5_68.j(0);
                    int v6_93 = v5_68.j(1);
                    if ((v9_5 != 3) || ((v5_68.r == 1) || ((v6_93 != 3) || (v5_68.s == 1)))) {
                        w.e.V(v5_68, this.u0, new x.b());
                    }
                }
                v2_29++;
            }
        }
        int v25;
        int v24_0;
        int v2_1;
        w.d v5_39;
        int v23_0;
        int v4_27;
        int v0_6;
        int v3_0;
        z.f v9_4 = this.w0;
        if (((v3_16 <= 2) || ((v8_0 != 2) && (v7_0 != 2))) || (!w.j.c(this.D0, 1024))) {
            v24_0 = v3_16;
            v5_39 = v4_7;
            v4_27 = v7_0;
            v2_1 = v8_0;
            v23_0 = v11_1;
            v25 = v12_1;
            v3_0 = v0_1;
            v0_6 = 0;
        } else {
            int v10_0 = this.u0;
            int v13_0 = this.q0;
            int v14_12 = v13_0.size();
            int v15_9 = 0;
            while (v15_9 < v14_12) {
                int v2_27 = ((w.d) v13_0.get(v15_9));
                int v24_1 = v2_27.p0;
                v25 = v12_1;
                if ((x.h.h(v22_1[0], v22_1[1], v24_1[0], v24_1[1])) && (!(v2_27 instanceof w.g))) {
                    v15_9++;
                    v12_1 = v25;
                } else {
                    boolean v29_0 = v0_1;
                    v24_0 = v3_16;
                    w.d v26_0 = v4_7;
                    int v28_0 = v7_0;
                    int v31_0 = v8_0;
                    v23_0 = v11_1;
                }
                v5_39 = v26_0;
                v4_27 = v28_0;
                v3_0 = v29_0;
                v2_1 = v31_0;
            }
            v25 = v12_1;
            v24_0 = v3_16;
            v23_0 = v11_1;
            int v2_2 = 0;
            int v3_1 = 0;
            w.d v5_27 = 0;
            int v6_29 = 0;
            java.util.ArrayList v11_0 = 0;
            int v12_0 = 0;
            int v15_10 = 0;
            while (v2_2 < v14_12) {
                int v27_0 = v2_2;
                int v2_25 = ((w.d) v13_0.get(v2_2));
                w.d v26_2 = v4_7;
                int v28_1 = v7_0;
                boolean v29_1 = v0_1;
                int[] v30 = v2_25.p0;
                int v31_1 = v8_0;
                if (!x.h.h(v22_1[0], v22_1[1], v30[0], v30[1])) {
                    w.e.V(v2_25, v10_0, this.L0);
                }
                int v0_11 = (v2_25 instanceof w.h);
                if (v0_11 != 0) {
                    int v4_43 = ((w.h) v2_25);
                    if (v4_43.u0 == 0) {
                        if (v12_0 == 0) {
                            v12_0 = new java.util.ArrayList();
                        }
                        v12_0.add(v4_43);
                    }
                    if (v4_43.u0 == 1) {
                        if (v5_27 == null) {
                            v5_27 = new java.util.ArrayList();
                        }
                        v5_27.add(v4_43);
                    }
                }
                if ((v2_25 instanceof w.i)) {
                    if (!(v2_25 instanceof w.a)) {
                        int v4_47 = ((w.i) v2_25);
                        if (v6_29 == 0) {
                            v6_29 = new java.util.ArrayList();
                        }
                        v6_29.add(v4_47);
                        if (v15_10 == 0) {
                            v15_10 = new java.util.ArrayList();
                        }
                        v15_10.add(v4_47);
                    } else {
                        int v4_49 = ((w.a) v2_25);
                        if (v4_49.U() == 0) {
                            if (v6_29 == 0) {
                                v6_29 = new java.util.ArrayList();
                            }
                            v6_29.add(v4_49);
                        }
                        if (v4_49.U() == 1) {
                            if (v15_10 == 0) {
                                v15_10 = new java.util.ArrayList();
                            }
                            v15_10.add(v4_49);
                        }
                    }
                }
                if ((v2_25.I.f == null) && ((v2_25.K.f == null) && ((v0_11 == 0) && (!(v2_25 instanceof w.a))))) {
                    if (v11_0 == null) {
                        v11_0 = new java.util.ArrayList();
                    }
                    v11_0.add(v2_25);
                }
                if ((v2_25.J.f == null) && ((v2_25.L.f == null) && ((v2_25.M.f == null) && ((v0_11 == 0) && (!(v2_25 instanceof w.a)))))) {
                    if (v3_1 == 0) {
                        v3_1 = new java.util.ArrayList();
                    }
                    v3_1.add(v2_25);
                }
                v2_2 = (v27_0 + 1);
                v4_7 = v26_2;
                v7_0 = v28_1;
                v0_1 = v29_1;
                v8_0 = v31_1;
            }
            v29_0 = v0_1;
            v26_0 = v4_7;
            v28_0 = v7_0;
            v31_0 = v8_0;
            int v0_3 = new java.util.ArrayList();
            if (v5_27 != null) {
                int v2_3 = v5_27.size();
                int v4_0 = 0;
                while (v4_0 < v2_3) {
                    x.n v7_10 = v5_27.get(v4_0);
                    v4_0++;
                    x.h.b(((w.h) v7_10), 0, v0_3, 0);
                }
            }
            if (v6_29 != 0) {
                int v2_4 = v6_29.size();
                int v4_1 = 0;
                while (v4_1 < v2_4) {
                    w.d v5_58 = v6_29.get(v4_1);
                    v4_1++;
                    w.d v5_59 = ((w.i) v5_58);
                    x.n v7_9 = x.h.b(v5_59, 0, v0_3, 0);
                    v5_59.R(0, v0_3, v7_9);
                    v7_9.a(v0_3);
                }
            }
            int v2_6 = this.i(2).a;
            if (v2_6 != 0) {
                int v2_7 = v2_6.iterator();
                while (v2_7.hasNext()) {
                    x.h.b(((w.c) v2_7.next()).d, 0, v0_3, 0);
                }
            }
            int v2_10 = this.i(4).a;
            if (v2_10 != 0) {
                int v2_11 = v2_10.iterator();
                while (v2_11.hasNext()) {
                    x.h.b(((w.c) v2_11.next()).d, 0, v0_3, 0);
                }
            }
            int v4_8 = this.i(7).a;
            if (v4_8 != 0) {
                int v4_9 = v4_8.iterator();
                while (v4_9.hasNext()) {
                    x.h.b(((w.c) v4_9.next()).d, 0, v0_3, 0);
                }
            }
            if (v11_0 != null) {
                int v4_10 = v11_0.size();
                w.d v5_30 = 0;
                while (v5_30 < v4_10) {
                    int v6_45 = v11_0.get(v5_30);
                    v5_30++;
                    x.h.b(((w.d) v6_45), 0, v0_3, 0);
                }
            }
            if (v12_0 != 0) {
                int v4_11 = v12_0.size();
                w.d v5_31 = 0;
                while (v5_31 < v4_11) {
                    int v6_43 = v12_0.get(v5_31);
                    v5_31++;
                    x.h.b(((w.h) v6_43), 1, v0_3, 0);
                }
            }
            if (v15_10 != 0) {
                int v4_12 = v15_10.size();
                w.d v5_32 = 0;
                while (v5_32 < v4_12) {
                    int v6_41 = v15_10.get(v5_32);
                    v5_32++;
                    int v6_42 = ((w.i) v6_41);
                    int v10_5 = x.h.b(v6_42, 1, v0_3, 0);
                    v6_42.R(1, v0_3, v10_5);
                    v10_5.a(v0_3);
                }
            }
            int v4_14 = this.i(3).a;
            if (v4_14 != 0) {
                int v4_15 = v4_14.iterator();
                while (v4_15.hasNext()) {
                    x.h.b(((w.c) v4_15.next()).d, 1, v0_3, 0);
                }
            }
            int v4_18 = this.i(6).a;
            if (v4_18 != 0) {
                int v4_19 = v4_18.iterator();
                while (v4_19.hasNext()) {
                    x.h.b(((w.c) v4_19.next()).d, 1, v0_3, 0);
                }
            }
            int v4_21 = this.i(5).a;
            if (v4_21 != 0) {
                int v4_22 = v4_21.iterator();
                while (v4_22.hasNext()) {
                    x.h.b(((w.c) v4_22.next()).d, 1, v0_3, 0);
                }
            }
            int v2_14 = this.i(7).a;
            if (v2_14 != 0) {
                int v2_15 = v2_14.iterator();
                while (v2_15.hasNext()) {
                    x.h.b(((w.c) v2_15.next()).d, 1, v0_3, 0);
                }
            }
            if (v3_1 != 0) {
                int v2_16 = v3_1.size();
                int v4_24 = 0;
                while (v4_24 < v2_16) {
                    w.d v5_44 = v3_1.get(v4_24);
                    v4_24++;
                    x.h.b(((w.d) v5_44), 1, v0_3, 0);
                }
            }
            int v15_11 = 1;
            int v2_17 = 0;
            while (v2_17 < v14_12) {
                int v3_12 = ((w.d) v13_0.get(v2_17));
                int v4_28 = v3_12.p0;
                if ((v4_28[0] == 3) && (v4_28[v15_11] == 3)) {
                    int v4_30 = v3_12.n0;
                    w.d v5_41 = v0_3.size();
                    int v6_37 = 0;
                    while (v6_37 < v5_41) {
                        x.n v7_5 = ((x.n) v0_3.get(v6_37));
                        if (v4_30 != v7_5.b) {
                            v6_37++;
                        }
                        int v3_13 = v3_12.o0;
                        int v4_31 = v0_3.size();
                        w.d v5_42 = 0;
                        while (v5_42 < v4_31) {
                            int v6_38 = ((x.n) v0_3.get(v5_42));
                            if (v3_13 != v6_38.b) {
                                v5_42++;
                            }
                            if ((v7_5 != null) && (v6_38 != 0)) {
                                v7_5.c(0, v6_38);
                                v6_38.c = 2;
                                v0_3.remove(v7_5);
                            }
                        }
                        v6_38 = 0;
                    }
                    v7_5 = 0;
                }
                v2_17++;
                v15_11 = 1;
            }
            if (v0_3.size() > 1) {
                int v15_13;
                w.d v5_37;
                if (v22_1[0] != 2) {
                    v15_13 = 1;
                    v5_37 = 0;
                } else {
                    int v2_20 = v0_3.size();
                    int v3_3 = 0;
                    int v4_25 = 0;
                    v5_37 = 0;
                    while (v4_25 < v2_20) {
                        int v6_35 = v0_3.get(v4_25);
                        v4_25++;
                        int v6_36 = ((x.n) v6_35);
                        if (v6_36.c != 1) {
                            x.n v7_4 = v6_36.b(v9_4, 0);
                            if (v7_4 > v3_3) {
                                v5_37 = v6_36;
                                v3_3 = v7_4;
                            }
                        }
                    }
                    v15_13 = 1;
                    if (v5_37 == null) {
                    } else {
                        this.M(1);
                        this.O(v3_3);
                    }
                }
                int v6_34;
                if (v22_1[v15_13] != 2) {
                    v6_34 = 0;
                } else {
                    int v2_22 = v0_3.size();
                    int v3_5 = 0;
                    int v4_26 = 0;
                    v6_34 = 0;
                    while (v4_26 < v2_22) {
                        x.n v7_1 = v0_3.get(v4_26);
                        v4_26++;
                        x.n v7_2 = ((x.n) v7_1);
                        if (v7_2.c != 0) {
                            int v8_2 = v7_2.b(v9_4, 1);
                            if (v8_2 > v3_5) {
                                v6_34 = v7_2;
                                v3_5 = v8_2;
                            }
                        }
                    }
                    if (v6_34 == 0) {
                    } else {
                        this.N(1);
                        this.L(v3_5);
                    }
                }
                if ((v5_37 != null) || (v6_34 != 0)) {
                    v2_1 = v31_0;
                    int v0_5;
                    int v3_7;
                    if (v2_1 != 2) {
                        v3_7 = v29_0;
                        v0_5 = v3_7;
                    } else {
                        v3_7 = v29_0;
                        if ((v3_7 >= this.q()) || (v3_7 <= 0)) {
                            v0_5 = this.q();
                        } else {
                            this.O(v3_7);
                            this.E0 = 1;
                        }
                    }
                    v4_27 = v28_0;
                    w.d v5_38;
                    int v3_10;
                    if (v4_27 != 2) {
                        v5_38 = v26_0;
                        v3_10 = v5_38;
                    } else {
                        v5_38 = v26_0;
                        if ((v5_38 >= this.k()) || (v5_38 <= null)) {
                            v3_10 = this.k();
                        } else {
                            this.L(v5_38);
                            this.F0 = 1;
                        }
                    }
                    v5_39 = v3_10;
                    v3_0 = v0_5;
                    v0_6 = 1;
                    if ((!this.W(64)) && (!this.W(128))) {
                        x.n v7_20 = 0;
                    } else {
                        v7_20 = 1;
                    }
                    int v15_29;
                    v9_4.getClass();
                    v9_4.h = 0;
                    if ((this.D0 == 0) || (v7_20 == null)) {
                        v15_29 = 1;
                    } else {
                        v15_29 = 1;
                        v9_4.h = 1;
                    }
                    int v8_24;
                    x.n v7_21 = this.q0;
                    if ((v22_1[0] != 2) && (v22_1[v15_29] != 2)) {
                        v8_24 = 0;
                    } else {
                        v8_24 = 1;
                    }
                    this.z0 = 0;
                    this.A0 = 0;
                    java.util.ArrayList v11_4 = v24_0;
                    int v10_10 = 0;
                    while (v10_10 < v11_4) {
                        int v12_14 = ((w.d) this.q0.get(v10_10));
                        if ((v12_14 instanceof w.e)) {
                            ((w.e) v12_14).U();
                        }
                        v10_10++;
                    }
                    int v10_11 = this.W(64);
                    int v12_4 = v0_6;
                    int v0_14 = 0;
                    int v13_2 = 1;
                    while (v13_2 != 0) {
                        int v14_28 = (v0_14 + 1);
                        int v24_3;
                        v9_4.t();
                        this.z0 = 0;
                        this.A0 = 0;
                        this.g(v9_4);
                        int v0_16 = 0;
                        while (v0_16 < v11_4) {
                            ((w.d) this.q0.get(v0_16)).g(v9_4);
                            v0_16++;
                        }
                        this.S(v9_4);
                        try {
                            int v15_31;
                            int v0_17 = this.G0;
                        } catch (int v0_18) {
                            v15_31 = v23_0;
                            v23_0 = v8_24;
                            v13_2 = 1;
                            v0_18.printStackTrace();
                            v24_3 = v12_4;
                            int v8_32 = new StringBuilder("EXCEPTION : ");
                            v8_32.append(v0_18);
                            System.out.println(v8_32.toString());
                            int v27_1;
                            int v16;
                            int v0_43 = w.j.a;
                            if (v13_2 == 0) {
                                v27_1 = v0_43;
                                this.Q(v9_4, v10_11);
                                int v0_44 = 0;
                                while (v0_44 < v11_4) {
                                    ((w.d) this.q0.get(v0_44)).Q(v9_4, v10_11);
                                    v0_44++;
                                }
                                v16 = 0;
                            } else {
                                v0_43[2] = 0;
                                int v8_33 = this.W(64);
                                this.Q(v9_4, v8_33);
                                int v12_7 = this.q0.size();
                                int v13_7 = 0;
                                v16 = 0;
                                while (v13_7 < v12_7) {
                                    int v6_86 = ((w.d) this.q0.get(v13_7));
                                    v6_86.Q(v9_4, v8_33);
                                    if ((v6_86.h != -1) || (v6_86.i != -1)) {
                                        v16 = 1;
                                    }
                                    v13_7++;
                                }
                                v27_1 = v0_43;
                            }
                            if ((v23_0 != 0) && ((v14_28 < 8) && (v27_1[2] != 0))) {
                                int v6_72 = 0;
                                int v12_8 = 0;
                                int v13_8 = 0;
                                while (v6_72 < v11_4) {
                                    int v8_39 = ((w.d) this.q0.get(v6_72));
                                    v12_8 = Math.max(v12_8, (v8_39.q() + v8_39.Y));
                                    v13_8 = Math.max(v13_8, (v8_39.k() + v8_39.Z));
                                    v6_72++;
                                    int v8 = -1;
                                }
                                int v0_47 = Math.max(this.b0, v12_8);
                                int v6_74 = Math.max(this.c0, v13_8);
                                if ((v2_1 == 2) && (this.q() < v0_47)) {
                                    this.O(v0_47);
                                    v22_1[0] = 2;
                                    v16 = 1;
                                    v24_3 = 1;
                                }
                                if ((v4_27 == 2) && (this.k() < v6_74)) {
                                    this.L(v6_74);
                                    v22_1[1] = 2;
                                    v16 = 1;
                                    v24_3 = 1;
                                }
                            }
                            int v18_6;
                            int v8_35;
                            int v0_50 = Math.max(this.b0, this.q());
                            if (v0_50 <= this.q()) {
                                v8_35 = 1;
                                v18_6 = v24_3;
                            } else {
                                this.O(v0_50);
                                v8_35 = 1;
                                v22_1[0] = 1;
                                v16 = 1;
                                v18_6 = 1;
                            }
                            int v0_53;
                            int v0_52 = Math.max(this.c0, this.k());
                            if (v0_52 <= this.k()) {
                                v0_53 = v18_6;
                            } else {
                                this.L(v0_52);
                                v22_1[v8_35] = v8_35;
                                v0_53 = v8_35;
                                v16 = v0_53;
                            }
                            int v6_83;
                            if (v0_53 != 0) {
                                v6_83 = v16;
                            } else {
                                if ((v22_1[0] == 2) && ((v3_0 > 0) && (this.q() > v3_0))) {
                                    this.E0 = v8_35;
                                    v22_1[0] = v8_35;
                                    this.O(v3_0);
                                    v0_53 = v8_35;
                                    v16 = v0_53;
                                }
                                if ((v22_1[v8_35] != 2) || ((v5_39 <= null) || (this.k() <= v5_39))) {
                                } else {
                                    this.F0 = v8_35;
                                    v22_1[v8_35] = v8_35;
                                    this.L(v5_39);
                                    v0_53 = 1;
                                    v6_83 = 1;
                                }
                            }
                            if (v14_28 <= 8) {
                                v13_2 = v6_83;
                            } else {
                                v13_2 = 0;
                            }
                            v12_4 = v0_53;
                            v0_14 = v14_28;
                            v8_24 = v23_0;
                            v23_0 = v15_31;
                        }
                        if ((v0_17 == 0) || (v0_17.get() == null)) {
                            v15_31 = v23_0;
                            v23_0 = v8_24;
                        } else {
                            v15_31 = v23_0;
                            v23_0 = v8_24;
                            v8_24 = 0;
                            v9_4.f(v9_4.k(((w.c) this.G0.get())), v9_4.k(v15_31), 0, 5);
                            this.G0 = 0;
                        }
                        int v0_24 = this.I0;
                        if ((v0_24 != 0) && (v0_24.get() != null)) {
                            v9_4.f(v9_4.k(this.L), v9_4.k(((w.c) this.I0.get())), 0, 5);
                            this.I0 = 0;
                        }
                        int v0_30 = this.H0;
                        if ((v0_30 != 0) && (v0_30.get() != null)) {
                            int v6_60 = v25;
                            v25 = v6_60;
                            v9_4.f(v9_4.k(((w.c) this.H0.get())), v9_4.k(v6_60), 0, 5);
                            this.H0 = 0;
                        }
                        int v0_36 = this.J0;
                        if ((v0_36 == 0) || (v0_36.get() == null)) {
                            v8 = 5;
                        } else {
                            v9_4.f(v9_4.k(this.K), v9_4.k(((w.c) this.J0.get())), 0, 5);
                            this.J0 = 0;
                        }
                        v9_4.p();
                        v24_3 = v12_4;
                        v13_2 = 1;
                    }
                    int v24_2 = v12_4;
                    this.q0 = v7_21;
                    if (v24_2 != 0) {
                        v22_1[0] = v2_1;
                        v22_1[1] = v4_27;
                    }
                    this.F(v9_4.m);
                    return;
                }
            }
        }
    }

    public final boolean W(int p2)
    {
        if ((this.D0 & p2) != p2) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void n(StringBuilder p5)
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.j);
        v0_1.append(":{\n");
        p5.append(v0_1.toString());
        String v0_2 = new StringBuilder("  actualWidth:");
        v0_2.append(this.U);
        p5.append(v0_2.toString());
        p5.append("\n");
        int v1_4 = new StringBuilder("  actualHeight:");
        v1_4.append(this.V);
        p5.append(v1_4.toString());
        p5.append("\n");
        String v0_5 = this.q0;
        int v1_6 = v0_5.size();
        int v2_2 = 0;
        while (v2_2 < v1_6) {
            String v3_0 = v0_5.get(v2_2);
            v2_2++;
            ((w.d) v3_0).n(p5);
            p5.append(",\n");
        }
        p5.append("}");
        return;
    }
}
