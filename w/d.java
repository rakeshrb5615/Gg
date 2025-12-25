package w;
public class d {
    public int A;
    public float B;
    public final int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public final w.c I;
    public final w.c J;
    public final w.c K;
    public final w.c L;
    public final w.c M;
    public final w.c N;
    public final w.c O;
    public final w.c P;
    public final w.c[] Q;
    public final java.util.ArrayList R;
    public final boolean[] S;
    public w.d T;
    public int U;
    public int V;
    public float W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public x.c b;
    public int b0;
    public x.c c;
    public int c0;
    public x.k d;
    public float d0;
    public x.m e;
    public float e0;
    public final boolean[] f;
    public android.view.View f0;
    public boolean g;
    public int g0;
    public int h;
    public String h0;
    public int i;
    public int i0;
    public String j;
    public int j0;
    public boolean k;
    public final float[] k0;
    public boolean l;
    public final w.d[] l0;
    public boolean m;
    public final w.d[] m0;
    public boolean n;
    public int n0;
    public int o;
    public int o0;
    public int p;
    public final int[] p0;
    public int q;
    public int r;
    public int s;
    public final int[] t;
    public int u;
    public int v;
    public float w;
    public int x;
    public int y;
    public float z;

    public d()
    {
        this.a = 0;
        this.d = 0;
        this.e = 0;
        int v3_1 = new boolean[2];
        v3_1 = {1, 1};
        this.f = v3_1;
        this.g = 1;
        this.h = -1;
        this.i = -1;
        new java.util.HashMap();
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        this.o = -1;
        this.p = -1;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        w.c v5_1 = new int[2];
        this.t = v5_1;
        this.u = 0;
        this.v = 0;
        this.w = 1065353216;
        this.x = 0;
        this.y = 0;
        this.z = 1065353216;
        this.A = -1;
        this.B = 1065353216;
        this.C = new int[] {2147483647, 2147483647});
        this.D = 2143289344;
        this.E = 0;
        this.F = 0;
        this.G = 0;
        this.H = 0;
        w.c v6_1 = new w.c(this, 2);
        this.I = v6_1;
        w.c v8_1 = new w.c(this, 3);
        this.J = v8_1;
        w.c v7_1 = new w.c(this, 4);
        this.K = v7_1;
        w.c v9_1 = new w.c(this, 5);
        this.L = v9_1;
        w.c v10_1 = new w.c(this, 6);
        this.M = v10_1;
        w.c v5_11 = new w.c(this, 8);
        this.N = v5_11;
        w.c v12_1 = new w.c(this, 9);
        this.O = v12_1;
        w.c v11_3 = new w.c(this, 7);
        this.P = v11_3;
        this.Q = new w.c[] {v6_1, v11_3});
        java.util.ArrayList v13_3 = new java.util.ArrayList();
        this.R = v13_3;
        boolean[] v14 = new boolean[2];
        this.S = v14;
        this.p0 = new int[] {1, 1});
        this.T = 0;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.d0 = 1056964608;
        this.e0 = 1056964608;
        this.g0 = 0;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        w.d[] v0_1 = new float[2];
        v0_1 = {-1082130432, -1082130432};
        this.k0 = v0_1;
        this.l0 = new w.d[] {0, 0});
        this.m0 = new w.d[] {0, 0});
        this.n0 = -1;
        this.o0 = -1;
        v13_3.add(v6_1);
        v13_3.add(v8_1);
        v13_3.add(v7_1);
        v13_3.add(v9_1);
        v13_3.add(v5_11);
        v13_3.add(v12_1);
        v13_3.add(v11_3);
        v13_3.add(v10_1);
        return;
    }

    public static void G(int p0, int p1, String p2, StringBuilder p3)
    {
        if (p0 != p1) {
            p3.append(p2);
            p3.append(" :   ");
            p3.append(p0);
            p3.append(",\n");
            return;
        } else {
            return;
        }
    }

    public static void H(StringBuilder p0, String p1, float p2, float p3)
    {
        if (p2 != p3) {
            p0.append(p1);
            p0.append(" :   ");
            p0.append(p2);
            p0.append(",\n");
            return;
        } else {
            return;
        }
    }

    public static void o(StringBuilder p0, String p1, int p2, int p3, int p4, int p5, int p6, float p7, int p8)
    {
        String v1_2;
        p0.append(p1);
        p0.append(" :  {\n");
        if (p8 == 1) {
            v1_2 = "FIXED";
        } else {
            if (p8 == 2) {
                v1_2 = "WRAP_CONTENT";
            } else {
                if (p8 == 3) {
                    v1_2 = "MATCH_CONSTRAINT";
                } else {
                    if (p8 != 4) {
                        throw 0;
                    } else {
                        v1_2 = "MATCH_PARENT";
                    }
                }
            }
        }
        if (!"FIXED".equals(v1_2)) {
            p0.append("      behavior");
            p0.append(" :   ");
            p0.append(v1_2);
            p0.append(",\n");
        }
        w.d.G(p2, 0, "      size", p0);
        w.d.G(p3, 0, "      min", p0);
        w.d.G(p4, 2147483647, "      max", p0);
        w.d.G(p5, 0, "      matchMin", p0);
        w.d.G(p6, 0, "      matchDef", p0);
        w.d.H(p0, "      matchPercent", p7, 1065353216);
        p0.append("    },\n");
        return;
    }

    public static void p(StringBuilder p2, String p3, w.c p4)
    {
        if (p4.f != null) {
            p2.append("    ");
            p2.append(p3);
            p2.append(" : [ \'");
            p2.append(p4.f);
            p2.append("\'");
            if ((p4.h != -2147483648) || (p4.g != 0)) {
                p2.append(",");
                p2.append(p4.g);
                if (p4.h != -2147483648) {
                    p2.append(",");
                    p2.append(p4.h);
                    p2.append(",");
                }
            }
            p2.append(" ] ,\n");
            return;
        } else {
            return;
        }
    }

    public boolean A()
    {
        if ((!this.k) && ((!this.I.c) || (!this.K.c))) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean B()
    {
        if ((!this.l) && ((!this.J.c) || (!this.L.c))) {
            return 0;
        } else {
            return 1;
        }
    }

    public void C()
    {
        this.I.j();
        this.J.j();
        this.K.j();
        this.L.j();
        this.M.j();
        this.N.j();
        this.O.j();
        this.P.j();
        this.T = 0;
        this.D = 2143289344;
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = -1;
        this.Y = 0;
        this.Z = 0;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = 1056964608;
        this.e0 = 1056964608;
        int v3_1 = this.p0;
        v3_1[0] = 1;
        v3_1[1] = 1;
        this.f0 = 0;
        this.g0 = 0;
        this.i0 = 0;
        this.j0 = 0;
        int[] v0_7 = this.k0;
        v0_7[0] = -1082130432;
        v0_7[1] = -1082130432;
        this.o = -1;
        this.p = -1;
        int[] v0_8 = this.C;
        v0_8[0] = 2147483647;
        v0_8[1] = 2147483647;
        this.r = 0;
        this.s = 0;
        this.w = 1065353216;
        this.z = 1065353216;
        this.v = 2147483647;
        this.y = 2147483647;
        this.u = 0;
        this.x = 0;
        this.A = -1;
        this.B = 1065353216;
        int[] v0_11 = this.f;
        v0_11[0] = 1;
        v0_11[1] = 1;
        this.F = 0;
        int[] v0_12 = this.S;
        v0_12[0] = 0;
        v0_12[1] = 0;
        this.g = 1;
        int[] v0_13 = this.t;
        v0_13[0] = 0;
        v0_13[1] = 0;
        this.h = -1;
        this.i = -1;
        return;
    }

    public final void D()
    {
        w.e v0_0 = this.T;
        if ((v0_0 != null) && ((v0_0 instanceof w.e))) {
            ((w.e) v0_0).getClass();
        }
        w.e v0_2 = this.R;
        int v1_1 = v0_2.size();
        int v2 = 0;
        while (v2 < v1_1) {
            ((w.c) v0_2.get(v2)).j();
            v2++;
        }
        return;
    }

    public final void E()
    {
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0;
        java.util.ArrayList v1 = this.R;
        int v2 = v1.size();
        int v3 = 0;
        while (v3 < v2) {
            w.c v4_1 = ((w.c) v1.get(v3));
            v4_1.c = 0;
            v4_1.b = 0;
            v3++;
        }
        return;
    }

    public void F(b8.g p1)
    {
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.M.k();
        this.P.k();
        this.N.k();
        this.O.k();
        return;
    }

    public final void I(int p1)
    {
        int v1_1;
        this.a0 = p1;
        if (p1 <= 0) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.E = v1_1;
        return;
    }

    public final void J(int p2, int p3)
    {
        if (!this.k) {
            this.I.l(p2);
            this.K.l(p3);
            this.Y = p2;
            this.U = (p3 - p2);
            this.k = 1;
            return;
        } else {
            return;
        }
    }

    public final void K(int p2, int p3)
    {
        if (!this.l) {
            this.J.l(p2);
            this.L.l(p3);
            this.Z = p2;
            this.V = (p3 - p2);
            if (this.E) {
                this.M.l((p2 + this.a0));
            }
            this.l = 1;
            return;
        } else {
            return;
        }
    }

    public final void L(int p2)
    {
        this.V = p2;
        int v0 = this.c0;
        if (p2 < v0) {
            this.V = v0;
        }
        return;
    }

    public final void M(int p3)
    {
        this.p0[0] = p3;
        return;
    }

    public final void N(int p3)
    {
        this.p0[1] = p3;
        return;
    }

    public final void O(int p2)
    {
        this.U = p2;
        int v0 = this.b0;
        if (p2 < v0) {
            this.U = v0;
        }
        return;
    }

    public void P(boolean p8, boolean p9)
    {
        int v0_0 = this.d;
        int v8_1 = (p8 & v0_0.g);
        int v1_3 = this.e;
        int v9_1 = (p9 & v1_3.g);
        int v2_0 = v0_0.h.g;
        int[] v3_0 = v1_3.h.g;
        int v0_2 = v0_0.i.g;
        int v1_2 = v1_3.i.g;
        if (((v0_2 - v2_0) < 0) || (((v1_2 - v3_0) < 0) || ((v2_0 == -2147483648) || ((v2_0 == 2147483647) || ((v3_0 == -2147483648) || ((v3_0 == 2147483647) || ((v0_2 == -2147483648) || ((v0_2 == 2147483647) || ((v1_2 == -2147483648) || (v1_2 == 2147483647)))))))))) {
            v0_2 = 0;
            v1_2 = 0;
            v2_0 = 0;
            v3_0 = 0;
        }
        int v0_3 = (v0_2 - v2_0);
        int v1_4 = (v1_2 - v3_0);
        if (v8_1 != 0) {
            this.Y = v2_0;
        }
        if (v9_1 != 0) {
            this.Z = v3_0;
        }
        if (this.g0 != 8) {
            int[] v3_2 = this.p0;
            if (v8_1 != 0) {
                if (v3_2[0] == 1) {
                    int v8_3 = this.U;
                    if (v0_3 < v8_3) {
                        v0_3 = v8_3;
                    }
                }
                this.U = v0_3;
                int v8_4 = this.b0;
                if (v0_3 < v8_4) {
                    this.U = v8_4;
                }
            }
            if (v9_1 != 0) {
                if (v3_2[1] == 1) {
                    int v8_6 = this.V;
                    if (v1_4 < v8_6) {
                        v1_4 = v8_6;
                    }
                }
                this.V = v1_4;
                int v8_7 = this.c0;
                if (v1_4 < v8_7) {
                    this.V = v8_7;
                }
            }
            return;
        } else {
            this.U = 0;
            this.V = 0;
            return;
        }
    }

    public void Q(u.c p7, boolean p8)
    {
        p7.getClass();
        int v7_3 = u.c.n(this.I);
        int v0_0 = u.c.n(this.J);
        int v1_0 = u.c.n(this.K);
        int v2_1 = u.c.n(this.L);
        if (p8 != 0) {
            int v3_0 = this.d;
            if (v3_0 != 0) {
                int v4_0 = v3_0.h;
                if (v4_0.j) {
                    int v3_1 = v3_0.i;
                    if (v3_1.j) {
                        v7_3 = v4_0.g;
                        v1_0 = v3_1.g;
                    }
                }
            }
        }
        if (p8 != 0) {
            int v8_1 = this.e;
            if (v8_1 != 0) {
                int v3_2 = v8_1.h;
                if (v3_2.j) {
                    int v8_2 = v8_1.i;
                    if (v8_2.j) {
                        v0_0 = v3_2.g;
                        v2_1 = v8_2.g;
                    }
                }
            }
        }
        if (((v1_0 - v7_3) < 0) || (((v2_1 - v0_0) < 0) || ((v7_3 == -2147483648) || ((v7_3 == 2147483647) || ((v0_0 == -2147483648) || ((v0_0 == 2147483647) || ((v1_0 == -2147483648) || ((v1_0 == 2147483647) || ((v2_1 == -2147483648) || (v2_1 == 2147483647)))))))))) {
            v7_3 = 0;
            v0_0 = 0;
            v1_0 = 0;
            v2_1 = 0;
        }
        int v1_1 = (v1_0 - v7_3);
        int v2_2 = (v2_1 - v0_0);
        this.Y = v7_3;
        this.Z = v0_0;
        if (this.g0 != 8) {
            int v7_5 = this.p0;
            int v8_6 = v7_5[0];
            if (v8_6 == 1) {
                int v3_5 = this.U;
                if (v1_1 < v3_5) {
                    v1_1 = v3_5;
                }
            }
            if (v7_5[1] == 1) {
                int v3_7 = this.V;
                if (v2_2 < v3_7) {
                    v2_2 = v3_7;
                }
            }
            this.U = v1_1;
            this.V = v2_2;
            int v3_8 = this.c0;
            if (v2_2 < v3_8) {
                this.V = v3_8;
            }
            int v3_9 = this.b0;
            if (v1_1 < v3_9) {
                this.U = v3_9;
            }
            int v3_10 = this.v;
            if ((v3_10 > 0) && (v8_6 == 3)) {
                this.U = Math.min(this.U, v3_10);
            }
            int v8_9 = this.y;
            if ((v8_9 > 0) && (v7_5[1] == 3)) {
                this.V = Math.min(this.V, v8_9);
            }
            int v7_9 = this.U;
            if (v1_1 != v7_9) {
                this.h = v7_9;
            }
            int v7_2 = this.V;
            if (v2_2 != v7_2) {
                this.i = v7_2;
            }
            return;
        } else {
            this.U = 0;
            this.V = 0;
            return;
        }
    }

    public final void a(w.e p8, u.c p9, java.util.HashSet p10, int p11, boolean p12)
    {
        if (!p12) {
            if (p11 != 0) {
                w.d v0_1 = this.J.a;
                if (v0_1 != null) {
                    java.util.Iterator v6_0 = v0_1.iterator();
                    while (v6_0.hasNext()) {
                        ((w.c) v6_0.next()).d.a(p8, p9, p10, p11, 1);
                    }
                }
                w.d v0_5 = this.L.a;
                if (v0_5 != null) {
                    java.util.Iterator v6_1 = v0_5.iterator();
                    while (v6_1.hasNext()) {
                        ((w.c) v6_1.next()).d.a(p8, p9, p10, p11, 1);
                    }
                }
                w.d v0_8 = this.M.a;
                if (v0_8 != null) {
                    java.util.Iterator v6_2 = v0_8.iterator();
                    while (v6_2.hasNext()) {
                        ((w.c) v6_2.next()).d.a(p8, p9, p10, p11, 1);
                    }
                }
            } else {
                w.d v0_21 = this.I.a;
                if (v0_21 != null) {
                    java.util.Iterator v6_3 = v0_21.iterator();
                    while (v6_3.hasNext()) {
                        ((w.c) v6_3.next()).d.a(p8, p9, p10, p11, 1);
                    }
                }
                w.d v0_24 = this.K.a;
                if (v0_24 != null) {
                    java.util.Iterator v6_4 = v0_24.iterator();
                    while (v6_4.hasNext()) {
                        ((w.c) v6_4.next()).d.a(p8, p9, p10, p11, 1);
                    }
                }
            }
        } else {
            if (p10.contains(this)) {
                w.j.b(p8, p9, this);
                p10.remove(this);
                this.b(p9, p8.W(64));
            }
        }
        return;
    }

    public void b(u.c p59, boolean p60)
    {
        int v17_0;
        int v12_28;
        int v14_17;
        u.c v1_0 = p59;
        int v2_0 = this.I;
        u.f v3_0 = p59.k(v2_0);
        float v4_12 = this.K;
        u.f v5_3 = p59.k(v4_12);
        u.f v6_13 = this.J;
        int v7_0 = p59.k(v6_13);
        int v8_0 = this.L;
        double v9_0 = p59.k(v8_0);
        w.c v10_0 = this.M;
        w.c v11_0 = p59.k(v10_0);
        int v12_10 = this.T;
        if (v12_10 == 0) {
            v17_0 = 0;
            v12_28 = v17_0;
            v14_17 = v12_28;
        } else {
            int v12_24 = v12_10.p0;
            v17_0 = 0;
            if (v12_24[0] != 2) {
                v14_17 = 0;
            } else {
                v14_17 = 1;
            }
            int v18_1;
            if (v12_24[1] != 2) {
                v18_1 = 0;
            } else {
                v18_1 = 1;
            }
            int v12_27 = this.q;
            if (v12_27 == 1) {
                v12_28 = 0;
            } else {
                if (v12_27 == 2) {
                    v14_17 = 0;
                } else {
                    if (v12_27 == 3) {
                    }
                }
                v12_28 = v18_1;
            }
        }
        int v22_0;
        int v15_1 = this.S;
        double v20_1 = v12_28;
        if (this.g0 != 8) {
            v22_0 = v14_17;
        } else {
            int v13_33 = this.R;
            int v12_30 = v13_33.size();
            v22_0 = v14_17;
            int v14_29 = v17_0;
            while (v14_29 < v12_30) {
                int v12_36 = ((w.c) v13_33.get(v14_29)).a;
                if ((v12_36 == 0) || (v12_36.size() <= 0)) {
                    v14_29++;
                }
            }
            if ((v15_1[v17_0] == 0) && (v15_1[1] == 0)) {
                return;
            }
        }
        int v12_40 = this.k;
        if ((v12_40 != 0) || (this.l)) {
            if (v12_40 != 0) {
                p59.d(v3_0, this.Y);
                p59.d(v5_3, (this.Y + this.U));
                if (v22_0 != 0) {
                    int v12_45 = this.T;
                    if (v12_45 != 0) {
                        int v12_48 = ((w.e) v12_45);
                        int v13_38 = v12_48.H0;
                        if ((v13_38 == 0) || ((v13_38.get() == null) || (v2_0.d() > ((w.c) v12_48.H0.get()).d()))) {
                            v12_48.H0 = new ref.WeakReference(v2_0);
                        }
                        int v13_1 = v12_48.J0;
                        if ((v13_1 == 0) || ((v13_1.get() == null) || (v4_12.d() > ((w.c) v12_48.J0.get()).d()))) {
                            v12_48.J0 = new ref.WeakReference(v4_12);
                        }
                    }
                }
            }
            if (this.l) {
                p59.d(v7_0, this.Z);
                p59.d(v9_0, (this.Z + this.V));
                int v12_4 = v10_0.a;
                if ((v12_4 != 0) && (v12_4.size() > 0)) {
                    p59.d(v11_0, (this.Z + this.a0));
                }
                if (v20_1 != 0) {
                    int v12_8 = this.T;
                    if (v12_8 != 0) {
                        int v12_9 = ((w.e) v12_8);
                        int v13_8 = v12_9.G0;
                        if ((v13_8 == 0) || ((v13_8.get() == null) || (v6_13.d() > ((w.c) v12_9.G0.get()).d()))) {
                            v12_9.G0 = new ref.WeakReference(v6_13);
                        }
                        int v13_13 = v12_9.I0;
                        if ((v13_13 == 0) || ((v13_13.get() == null) || (v8_0.d() > ((w.c) v12_9.I0.get()).d()))) {
                            v12_9.I0 = new ref.WeakReference(v8_0);
                        }
                    }
                }
            }
            if ((this.k) && (this.l)) {
                int v12_51 = v17_0;
                this.k = v12_51;
                this.l = v12_51;
                return;
            }
        }
        int v24_0;
        u.f v23_0;
        int v12_13 = this.f;
        if (!p60) {
            v23_0 = v10_0;
            v24_0 = v12_13;
        } else {
            int v13_19 = this.d;
            if (v13_19 == 0) {
            } else {
                int v14_12 = this.e;
                if (v14_12 == 0) {
                } else {
                    v23_0 = v10_0;
                    w.c v10_1 = v13_19.h;
                    v24_0 = v12_13;
                    if ((v10_1.j) && ((v13_19.i.j) && ((v14_12.h.j) && (v14_12.i.j)))) {
                        int v12_50;
                        p59.d(v3_0, v10_1.g);
                        p59.d(v5_3, this.d.i.g);
                        p59.d(v7_0, this.e.h.g);
                        p59.d(v9_0, this.e.i.g);
                        p59.d(v11_0, this.e.k.g);
                        if (this.T == null) {
                            v12_50 = 0;
                        } else {
                            if ((v22_0 != 0) && ((v24_0[0] != 0) && (!this.x()))) {
                                v1_0.f(v1_0.k(this.T.K), v5_3, 0, 8);
                            }
                            if ((v20_1 == 0) || ((v24_0[1] == 0) || (this.y()))) {
                            } else {
                                v12_50 = 0;
                                v1_0.f(v1_0.k(this.T.L), v9_0, 0, 8);
                            }
                        }
                        this.k = v12_50;
                        this.l = v12_50;
                        return;
                    }
                }
            }
        }
        int v25_0;
        float v4_0;
        double v20_0;
        int v12_22;
        int v2_1;
        if (this.T == null) {
            v25_0 = v2_0;
            v2_1 = v4_12;
            v4_0 = v20_1;
            v12_22 = 0;
            v20_0 = 0;
        } else {
            int v12_23;
            w.c v10_4;
            if (!this.w(0)) {
                v10_4 = this.x();
                v12_23 = 1;
            } else {
                ((w.e) this.T).R(this, 0);
                v10_4 = 1;
                v12_23 = 1;
            }
            int v12_25;
            if (!this.w(v12_23)) {
                v12_25 = this.y();
            } else {
                ((w.e) this.T).R(this, v12_23);
                v12_25 = 1;
            }
            if ((v10_4 != null) || ((v22_0 == 0) || ((this.g0 == 8) || ((v2_0.f != null) || (v4_12.f != null))))) {
                v25_0 = v2_0;
            } else {
                v25_0 = v2_0;
                v1_0.f(v1_0.k(this.T.K), v5_3, 0, 1);
            }
            if ((v12_25 == 0) && ((v20_1 != 0) && ((this.g0 != 8) && ((v6_13.f == null) && ((v8_0.f == null) && (v23_0 == null)))))) {
                v1_0.f(v1_0.k(this.T.L), v9_0, 0, 1);
            }
            v2_1 = v4_12;
            v4_0 = v20_1;
            v20_0 = v12_25;
            v12_22 = v10_4;
        }
        w.c v10_7 = this.U;
        int v13_30 = this.b0;
        if (v10_7 >= v13_30) {
            v13_30 = v10_7;
        }
        int v27_0;
        int v14_19 = this.V;
        float v26_0 = v2_1;
        int v2_9 = this.c0;
        if (v14_19 >= v2_9) {
            v27_0 = v14_19;
        } else {
            v27_0 = v2_9;
        }
        int v30_0;
        int[] v28 = this.p0;
        int v2_11 = v28[0];
        boolean v29_0 = v4_0;
        if (v2_11 == 3) {
            v30_0 = 0;
        } else {
            v30_0 = 1;
        }
        int v32_0;
        int v31_0 = v6_13;
        u.f v6_0 = v28[1];
        if (v6_0 == 3) {
            v32_0 = 0;
        } else {
            v32_0 = 1;
        }
        int v31_1;
        int v39;
        int v40;
        int v30_1;
        int v2_12;
        int v7_5;
        u.f v23_1;
        float v4_2 = this.X;
        this.A = v4_2;
        u.a v33_0 = v7_0;
        int v7_1 = this.W;
        this.B = v7_1;
        boolean v34_0 = v7_1;
        u.f v35_0 = this.r;
        int v37 = this.s;
        if (v34_0 <= 0) {
            v39 = v8_0;
            v40 = v9_0;
            v2_12 = v23_0;
            v30_1 = v27_0;
            v7_5 = v35_0;
            v23_1 = v37;
            v31_1 = 0;
        } else {
            v39 = v8_0;
            if (this.g0 == 8) {
            } else {
                if ((v2_11 != 3) || (v35_0 != null)) {
                    int v8_2 = v35_0;
                } else {
                    v8_2 = 3;
                }
                if ((v6_0 != 3) || (v37 != 0)) {
                    v40 = v9_0;
                    double v9_1 = v37;
                } else {
                    v40 = v9_0;
                    v9_1 = 3;
                }
                if ((v2_11 != 3) || ((v6_0 != 3) || ((v8_2 != 3) || (v9_1 != 3)))) {
                    if ((v2_11 != 3) || (v8_2 != 3)) {
                        if ((v6_0 != 3) || (v9_1 != 3)) {
                            v7_5 = v8_2;
                            v2_12 = v23_0;
                            v30_1 = v27_0;
                            v31_1 = 1;
                        } else {
                            this.A = 1;
                            if (v4_2 == -1) {
                                this.B = (1065353216 / v34_0);
                            }
                            v30_1 = ((int) (this.B * ((float) v10_7)));
                            if (v2_11 == 3) {
                                v7_5 = v8_2;
                                v2_12 = v23_0;
                            } else {
                                v7_5 = v8_2;
                                v2_12 = v23_0;
                                v23_1 = 4;
                            }
                        }
                    } else {
                        this.A = 0;
                        v13_30 = ((int) (v34_0 * ((float) v14_19)));
                        if (v6_0 == 3) {
                        } else {
                            v2_12 = v23_0;
                            v30_1 = v27_0;
                            v7_5 = 4;
                            v31_1 = 0;
                        }
                    }
                } else {
                    if (v4_2 == -1) {
                        if ((v30_0 == 0) || (v32_0 != 0)) {
                            if ((v30_0 == 0) && (v32_0 != 0)) {
                                this.A = 1;
                                if (v4_2 == -1) {
                                    this.B = (1065353216 / v34_0);
                                }
                            }
                        } else {
                            this.A = 0;
                        }
                    }
                    if ((this.A != 0) || ((v31_0.h()) && (v39.h()))) {
                        if ((this.A == 1) && ((!v25_0.h()) || (!v26_0.h()))) {
                            this.A = 0;
                        }
                    } else {
                        this.A = 1;
                    }
                    if ((this.A == -1) && ((!v31_0.h()) || ((!v39.h()) || ((!v25_0.h()) || (!v26_0.h()))))) {
                        if ((!v31_0.h()) || (!v39.h())) {
                            if ((v25_0.h()) && (v26_0.h())) {
                                this.B = (1065353216 / this.B);
                                this.A = 1;
                            }
                        } else {
                            this.A = 0;
                        }
                    }
                    if (this.A != -1) {
                    } else {
                        int v2_35 = this.u;
                        if ((v2_35 <= 0) || (this.x != 0)) {
                            if ((v2_35 != 0) || (this.x <= 0)) {
                            } else {
                                this.B = (1065353216 / this.B);
                                this.A = 1;
                            }
                        } else {
                            this.A = 0;
                        }
                    }
                }
                v23_1 = v9_1;
            }
        }
        float v4_11;
        u.f v6_3;
        float v4_9 = this.t;
        v4_9[0] = v7_5;
        v4_9[1] = v23_1;
        if (v31_1 == 0) {
            v6_3 = -1;
            v4_11 = 0;
        } else {
            float v4_10 = this.A;
            v6_3 = -1;
            if ((v4_10 != 0) && (v4_10 != -1)) {
            } else {
                v4_11 = 1;
            }
        }
        int v32_1;
        if (v31_1 == 0) {
            v32_1 = 0;
        } else {
            int v8_3 = this.A;
            if ((v8_3 != 1) && (v8_3 != v6_3)) {
            } else {
                v32_1 = 1;
            }
        }
        if ((v28[0] != 2) || (!(this instanceof w.e))) {
            double v9_2 = 0;
        } else {
            v9_2 = 1;
        }
        if (v9_2 != 0) {
            v13_30 = 0;
        }
        int v41;
        int v54;
        int v49;
        float v4_23;
        u.b v46;
        w.d v55;
        int v22_1;
        boolean v29_1;
        u.f v50;
        int v52;
        u.f v3_1;
        u.f v53;
        int v19_0;
        u.f v51;
        u.f v6_6 = this.P;
        int v27_1 = (v6_6.h() ^ 1);
        boolean v21_0 = v15_1[0];
        boolean v34_1 = v15_1[1];
        w.c v10_8 = this.C;
        u.f v35_1 = 0;
        if ((this.o == 2) || (this.k)) {
            v55 = v2_12;
            v49 = v3_0;
            v50 = v5_3;
            v41 = v6_6;
            v46 = v10_8;
            v53 = v11_0;
            v19_0 = v12_22;
            v3_1 = v22_0;
            v4_23 = v29_0;
            v51 = v33_0;
            v54 = v39;
            v52 = v40;
            v22_1 = v7_5;
            v29_1 = v24_0;
        } else {
            if (p60) {
                int v8_8 = this.d;
                if (v8_8 != 0) {
                    int v14_28 = v8_8.h;
                    if ((v14_28.j) && (v8_8.i.j)) {
                        if (!p60) {
                        } else {
                            p59.d(v3_0, v14_28.g);
                            p59.d(v5_3, this.d.i.g);
                            if ((this.T == null) || ((v22_0 == 0) || ((v24_0[0] == 0) || (this.x())))) {
                            } else {
                                v1_0.f(v1_0.k(this.T.K), v5_3, 0, 8);
                            }
                        }
                    }
                }
            }
            int v8_12;
            int v8_11 = this.T;
            if (v8_11 == 0) {
                v8_12 = 0;
            } else {
                v8_12 = p59.k(v8_11.K);
            }
            int v15_5;
            int v15_4 = this.T;
            if (v15_4 == 0) {
                v15_5 = 0;
            } else {
                v15_5 = p59.k(v15_4.I);
            }
            v3_1 = v22_0;
            v22_1 = v7_5;
            v19_0 = v12_22;
            v41 = v6_6;
            int v18_5 = 1;
            if (v28[1] != 3) {
                v18_5 = 0;
            }
            v46 = v10_8;
            v49 = v3_0;
            v4_23 = v29_0;
            v51 = v33_0;
            v50 = v5_3;
            v54 = v39;
            v52 = v40;
            v55 = v2_12;
            v53 = v11_0;
            v29_1 = v24_0;
            v1_0 = p59;
            this.d(p59, 1, v3_1, v4_23, v24_0[0], v15_5, v8_12, v28[0], v9_2, this.I, this.K, this.Y, v13_30, this.b0, v10_8[0], this.d0, v4_11, v18_5, v19_0, v20_0, v21_0, v22_1, v23_1, this.u, this.v, this.w, v27_1);
        }
        u.f v5_2;
        int v7_17;
        u.f v6_9;
        int v14_32;
        int v15_8;
        int v8_15;
        int v18_6;
        if (!p60) {
            v5_2 = v51;
            v6_9 = v52;
            v7_17 = v53;
            v8_15 = 0;
            v14_32 = 8;
            v18_6 = 1;
            v15_8 = 1;
        } else {
            int v2_41 = this.e;
            if (v2_41 == 0) {
            } else {
                u.f v5_1 = v2_41.h;
                if ((!v5_1.j) || (!v2_41.i.j)) {
                } else {
                    v5_2 = v51;
                    v1_0.d(v5_2, v5_1.g);
                    v6_9 = v52;
                    v1_0.d(v6_9, this.e.i.g);
                    v7_17 = v53;
                    v1_0.d(v7_17, this.e.k.g);
                    int v2_51 = this.T;
                    if ((v2_51 == 0) || ((v20_0 != 0) || (v4_23 == 0))) {
                        v8_15 = 0;
                        v14_32 = 8;
                        v18_6 = 1;
                    } else {
                        v18_6 = 1;
                        if (!v29_1[1]) {
                            v8_15 = 0;
                            v14_32 = 8;
                        } else {
                            v8_15 = 0;
                            v14_32 = 8;
                            v1_0.f(v1_0.k(v2_51.L), v6_9, 0, 8);
                        }
                    }
                    v15_8 = v8_15;
                }
            }
        }
        if (this.p == 2) {
            v15_8 = v8_15;
        }
        if ((v15_8 == 0) || (this.l)) {
            u.a v56 = v5_2;
            u.a v57 = v6_9;
        } else {
            if ((v28[v18_6] != 2) || (!(this instanceof w.e))) {
                int v15_9 = v8_15;
            } else {
                v15_9 = v18_6;
            }
            int v13_35;
            if (v15_9 == 0) {
                v13_35 = v30_1;
            } else {
                v13_35 = v8_15;
            }
            w.c v10_14;
            w.c v10_13 = this.T;
            if (v10_13 == null) {
                v10_14 = 0;
            } else {
                v10_14 = v1_0.k(v10_13.L);
            }
            w.c v11_2 = this.T;
            if (v11_2 != null) {
                v35_1 = v1_0.k(v11_2.J);
            }
            w.c v11_4 = this.a0;
            if ((v11_4 > null) || (this.g0 == v14_32)) {
                int v12_39 = v55;
                if (v12_39.f == null) {
                    if (this.g0 != v14_32) {
                        v1_0.e(v7_17, v5_2, v11_4, v14_32);
                    } else {
                        v1_0.e(v7_17, v5_2, v12_39.e(), v14_32);
                    }
                } else {
                    v1_0.e(v7_17, v5_2, v11_4, v14_32);
                    v1_0.e(v7_17, v1_0.k(v12_39.f), v12_39.e(), v14_32);
                    if (v4_23 != 0) {
                        v1_0.f(v10_14, v1_0.k(v54), v8_15, 5);
                    }
                    v27_1 = v8_15;
                }
            }
            int v7_20 = v29_1[v18_6];
            int v17_7 = v8_15;
            int v8_17 = v28[v18_6];
            double v9_9 = v46[v18_6];
            if (v28[v17_7] != 3) {
                v18_6 = v17_7;
            }
            v57 = v6_9;
            v56 = v5_2;
            v1_0 = p59;
            this.d(p59, 0, v4_23, v3_1, v7_20, v35_1, v10_14, v8_17, v15_9, this.J, this.L, this.Z, v13_35, this.c0, v9_9, this.e0, v32_1, v18_6, v20_0, v19_0, v34_1, v23_1, v22_1, this.x, this.y, this.z, v27_1);
        }
        if (v31_1 != 0) {
            if (this.A != 1) {
                double v9_11 = v49;
                int v8_18 = v50;
                u.f v5_5 = v56;
                u.f v6_11 = v57;
                int v2_60 = this.B;
                float v4_25 = v1_0.l();
                v4_25.d.g(v8_18, -1082130432);
                v4_25.d.g(v9_11, 1065353216);
                v4_25.d.g(v6_11, v2_60);
                v4_25.d.g(v5_5, (- v2_60));
                v1_0.c(v4_25);
            } else {
                int v2_62 = this.B;
                float v4_26 = v1_0.l();
                v4_26.d.g(v57, -1082130432);
                v4_26.d.g(v56, 1065353216);
                v4_26.d.g(v50, v2_62);
                v4_26.d.g(v49, (- v2_62));
                v1_0.c(v4_26);
            }
        }
        if (v41.h()) {
            int v2_65 = v41;
            u.f v3_11 = v2_65.f.d;
            float v4_31 = ((float) Math.toRadians(((double) (this.D + 1119092736))));
            int v2_66 = v2_65.e();
            u.f v5_10 = v1_0.k(this.i(2));
            u.f v6_15 = v1_0.k(this.i(3));
            double v9_14 = v1_0.k(this.i(4));
            w.c v11_9 = v1_0.k(this.i(5));
            int v12_47 = v1_0.k(v3_11.i(2));
            int v7_26 = v1_0.k(v3_11.i(3));
            int v8_22 = v1_0.k(v3_11.i(4));
            u.f v3_13 = v1_0.k(v3_11.i(5));
            w.c v10_19 = v1_0.l();
            int v13_39 = ((double) v4_31);
            int v17_13 = v13_39;
            int v19_3 = ((double) v2_66);
            int v2_67 = ((float) (Math.sin(v13_39) * v19_3));
            v10_19.d.g(v7_26, 1056964608);
            v10_19.d.g(v3_13, 1056964608);
            v10_19.d.g(v6_15, -1090519040);
            v10_19.d.g(v11_9, -1090519040);
            v10_19.b = (- v2_67);
            v1_0.c(v10_19);
            int v2_69 = v1_0.l();
            u.f v3_16 = ((float) (Math.cos(v17_13) * v19_3));
            v2_69.d.g(v12_47, 1056964608);
            v2_69.d.g(v8_22, 1056964608);
            v2_69.d.g(v5_10, -1090519040);
            v2_69.d.g(v9_14, -1090519040);
            v2_69.b = (- v3_16);
            v1_0.c(v2_69);
        }
        this.k = 0;
        this.l = 0;
        return;
    }

    public boolean c()
    {
        if (this.g0 == 8) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d(u.c p30, boolean p31, boolean p32, boolean p33, boolean p34, u.f p35, u.f p36, int p37, boolean p38, w.c p39, w.c p40, int p41, int p42, int p43, int p44, float p45, boolean p46, boolean p47, boolean p48, boolean p49, boolean p50, int p51, int p52, int p53, int p54, float p55, boolean p56)
    {
        int v18;
        int v1_0 = p30;
        int v4_17 = p53;
        int v5_9 = p54;
        int v7_0 = p30.k(p39);
        int v8_0 = p30.k(p40);
        int v9_1 = p30.k(p39.f);
        int v15_6 = p30.k(p40.f);
        int v16_0 = p39.h();
        int v17_0 = p40.h();
        w.d v11_2 = this.P.h();
        if (v17_0 == 0) {
            v18 = v16_0;
        } else {
            v18 = (v16_0 + 1);
        }
        if (v11_2 != null) {
            v18++;
        }
        int v3_7;
        int v19_1 = v11_2;
        w.d v11_3 = v18;
        if (p46 == null) {
            v3_7 = p51;
        } else {
            v3_7 = 3;
        }
        int v10_12;
        w.c v13_8 = u.e.c(p37);
        int v20_1 = v15_6;
        if ((v13_8 == null) || ((v13_8 == 1) || ((v13_8 != 2) || (v3_7 == 4)))) {
            v10_12 = 0;
        } else {
            v10_12 = 1;
        }
        int v42_1;
        w.c v13_10 = this.h;
        if ((v13_10 == -1) || (!p31)) {
            v13_10 = p42;
            v42_1 = v10_12;
        } else {
            this.h = -1;
            v42_1 = 0;
        }
        int v10_17;
        int v10_14 = this.i;
        if ((v10_14 == -1) || (p31)) {
            v10_17 = v42_1;
        } else {
            this.i = -1;
            v13_10 = v10_14;
            v10_17 = 0;
        }
        w.c v13_15;
        int v15_0;
        if (this.g0 != 8) {
            v15_0 = v13_10;
            v13_15 = v10_17;
        } else {
            v13_15 = 0;
            v15_0 = 0;
        }
        int v24;
        w.c v13_16;
        if (!p56) {
            v24 = v13_15;
            v13_16 = 8;
        } else {
            if ((v16_0 != 0) || ((v17_0 != 0) || (v19_1 != 0))) {
                if ((v16_0 != 0) && (v17_0 == 0)) {
                    v24 = v13_15;
                    v13_16 = 8;
                    p30.e(v7_0, v9_1, p39.e(), 8);
                    w.c v13_1;
                    int v10_1;
                    if (v24 != 0) {
                        if ((v11_3 == 2) || ((p46 != null) || ((v3_7 != 1) && (v3_7 != 0)))) {
                            if (p53 == -2) {
                                v4_17 = v15_0;
                            }
                            if (p54 == -2) {
                                v5_9 = v15_0;
                            }
                            if ((v15_0 > 0) && (v3_7 != 1)) {
                                v15_0 = 0;
                            }
                            if (v4_17 > 0) {
                                p30.f(v8_0, v7_0, v4_17, 8);
                                v15_0 = Math.max(v15_0, v4_17);
                            }
                            if (v5_9 > 0) {
                                if ((!p32) || (v3_7 != 1)) {
                                    p30.g(v8_0, v7_0, v5_9, 8);
                                }
                                v15_0 = Math.min(v15_0, v5_9);
                            }
                            if (v3_7 != 1) {
                                if (v3_7 != 2) {
                                    v13_1 = v4_17;
                                    v10_1 = 1;
                                } else {
                                    int v10_4;
                                    int v2_5;
                                    w.c v13_2 = p39.e;
                                    if ((v13_2 != 3) && (v13_2 != 5)) {
                                        v2_5 = p30.k(this.T.i(2));
                                        v10_4 = p30.k(this.T.i(4));
                                    } else {
                                        v2_5 = p30.k(this.T.i(3));
                                        v10_4 = p30.k(this.T.i(5));
                                    }
                                    int v15_4 = p30.l();
                                    w.d v38_2 = v4_17;
                                    v15_4.d.g(v8_0, -1082130432);
                                    v15_4.d.g(v7_0, 1065353216);
                                    v15_4.d.g(v10_4, p55);
                                    v15_4.d.g(v2_5, (- p55));
                                    p30.c(v15_4);
                                    if (p32) {
                                        v24 = 0;
                                    }
                                    v10_1 = p34;
                                    v13_1 = v38_2;
                                }
                            } else {
                                if (!p32) {
                                    if (p48 == 0) {
                                        p30.e(v8_0, v7_0, v15_0, 5);
                                        p30.g(v8_0, v7_0, v15_0, 8);
                                        v10_1 = p34;
                                        v13_1 = v4_17;
                                    } else {
                                        p30.e(v8_0, v7_0, v15_0, 5);
                                        p30.g(v8_0, v7_0, v15_0, 8);
                                    }
                                } else {
                                    p30.e(v8_0, v7_0, v15_0, 8);
                                }
                            }
                        } else {
                            int v2_10 = Math.max(p53, v15_0);
                            if (p54 > 0) {
                                v2_10 = Math.min(p54, v2_10);
                            }
                            p30.e(v8_0, v7_0, v2_10, 8);
                            v10_1 = p34;
                            v13_1 = p53;
                            v24 = 0;
                        }
                    } else {
                        if (p38 == null) {
                            p30.e(v8_0, v7_0, v15_0, v13_16);
                        } else {
                            p30.e(v8_0, v7_0, 0, 3);
                            if (p43 > 0) {
                                p30.f(v8_0, v7_0, p43, v13_16);
                            }
                            if (p44 >= 2147483647) {
                            } else {
                                p30.g(v8_0, v7_0, p44, v13_16);
                            }
                        }
                    }
                    if ((p56) && (p48 == 0)) {
                        if ((v16_0 != 0) || ((v17_0 != 0) || (v19_1 != 0))) {
                            if ((v16_0 == 0) || (v17_0 != 0)) {
                                if ((v16_0 != 0) || (v17_0 == 0)) {
                                    int v6_3 = v20_1;
                                    if ((v16_0 != 0) && (v17_0 != 0)) {
                                        int v25;
                                        int v7_1;
                                        int v5_0;
                                        int v9_2;
                                        int v3_0;
                                        int v8_1;
                                        int v17_1;
                                        int v2_13;
                                        int v20_0;
                                        int v19_0;
                                        int v23;
                                        w.d v11_0 = p39.f.d;
                                        int v4_5 = p40.f.d;
                                        int v34_1 = v10_1;
                                        int v10_8 = this.T;
                                        int v16_1 = 6;
                                        if (v24 == 0) {
                                            v17_1 = v3_7;
                                            if ((!v9_1.f) || (!v6_3.f)) {
                                                v1_0 = p30;
                                                v3_0 = p36;
                                                v2_13 = v7_0;
                                                v7_1 = v8_0;
                                                v5_0 = v9_1;
                                                v9_2 = 6;
                                                v8_1 = 5;
                                                v19_0 = 4;
                                                v20_0 = 1;
                                                v23 = 1;
                                                v25 = 0;
                                            } else {
                                                int v52_1 = v8_0;
                                                p30.b(v7_0, v9_1, p39.e(), p45, v6_3, v52_1, p40.e(), 8);
                                                int v7_2 = v52_1;
                                                if ((!p32) || (v34_1 == 0)) {
                                                    return;
                                                } else {
                                                    int v15_8;
                                                    if (p40.f == null) {
                                                        v15_8 = 0;
                                                    } else {
                                                        v15_8 = p40.e();
                                                    }
                                                    if (v6_3 == p36) {
                                                        return;
                                                    } else {
                                                        p30.f(p36, v7_2, v15_8, 5);
                                                        return;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (v3_7 != 0) {
                                                if (v3_7 != 2) {
                                                    if (v3_7 != 1) {
                                                        if (v3_7 != 3) {
                                                            v17_1 = v3_7;
                                                            v1_0 = p30;
                                                            v3_0 = p36;
                                                            v2_13 = v7_0;
                                                            v7_1 = v8_0;
                                                            v5_0 = v9_1;
                                                            v9_2 = 6;
                                                            v8_1 = 5;
                                                            v19_0 = 4;
                                                            v20_0 = 0;
                                                            v23 = 0;
                                                        } else {
                                                            v17_1 = v3_7;
                                                            if (this.A != -1) {
                                                                int v1_9;
                                                                if (p46 == null) {
                                                                    if (v5_9 <= 0) {
                                                                        if ((v5_9 != 0) || (v13_1 != null)) {
                                                                            v1_0 = p30;
                                                                            v3_0 = p36;
                                                                            v2_13 = v7_0;
                                                                            v7_1 = v8_0;
                                                                            v5_0 = v9_1;
                                                                            v9_2 = 6;
                                                                            v8_1 = 5;
                                                                            v19_0 = 4;
                                                                            v20_0 = 1;
                                                                            v23 = 1;
                                                                            v25 = 1;
                                                                            if ((v23 == 0) || ((v5_0 != v6_3) || (v11_0 == v10_8))) {
                                                                                int v26_0 = 1;
                                                                            } else {
                                                                                v23 = 0;
                                                                                v26_0 = 0;
                                                                            }
                                                                            w.c v37_1;
                                                                            int v14_1;
                                                                            int v20_3;
                                                                            w.c v13_9;
                                                                            u.c v12_1;
                                                                            if (v20_0 == 0) {
                                                                                v12_1 = v4_5;
                                                                                v37_1 = v13_1;
                                                                                v14_1 = v17_1;
                                                                                v13_9 = p40;
                                                                                v20_3 = p32;
                                                                            } else {
                                                                                if ((v24 != 0) || ((p47 != null) || ((p49 != 0) || ((v5_0 != p35) || (v6_3 != v3_0))))) {
                                                                                    v20_3 = p32;
                                                                                    int v27 = v26_0;
                                                                                    int v26_1 = v8_1;
                                                                                } else {
                                                                                    v9_2 = 8;
                                                                                    v20_3 = 0;
                                                                                    v26_1 = 8;
                                                                                    v27 = 0;
                                                                                }
                                                                                int v3_8 = v5_0;
                                                                                v37_1 = v13_1;
                                                                                v14_1 = v17_1;
                                                                                v12_1 = v4_5;
                                                                                v13_9 = p40;
                                                                                v1_0.b(v2_13, v3_8, p39.e(), p45, v6_3, v7_1, p40.e(), v9_2);
                                                                                v5_0 = v3_8;
                                                                                v8_1 = v26_1;
                                                                                v26_0 = v27;
                                                                            }
                                                                            if (this.g0 == 8) {
                                                                                int v3_10 = v13_9.a;
                                                                                if ((v3_10 == 0) || (v3_10.size() <= 0)) {
                                                                                    return;
                                                                                }
                                                                            }
                                                                            if (v23 != 0) {
                                                                                if ((v20_3 != 0) && ((v5_0 != v6_3) && ((v24 == 0) && (((v11_0 instanceof w.a)) || ((v12_1 instanceof w.a)))))) {
                                                                                    v8_1 = 6;
                                                                                }
                                                                                v1_0.f(v2_13, v5_0, p39.e(), v8_1);
                                                                                v1_0.g(v7_1, v6_3, (- v13_9.e()), v8_1);
                                                                            }
                                                                            if ((v20_3 == 0) || ((p50 == 0) || (((v11_0 instanceof w.a)) || (((v12_1 instanceof w.a)) || (v12_1 == v10_8))))) {
                                                                                int v3_19 = v19_0;
                                                                                int v21_0 = v26_0;
                                                                            } else {
                                                                                v3_19 = 6;
                                                                                v8_1 = 6;
                                                                                v21_0 = 1;
                                                                            }
                                                                            if (v21_0 != 0) {
                                                                                if ((v25 != 0) && ((p49 == 0) || (p33))) {
                                                                                    if ((v11_0 != v10_8) && (v12_1 != v10_8)) {
                                                                                        v16_1 = v3_19;
                                                                                    }
                                                                                    if (((v11_0 instanceof w.h)) || ((v12_1 instanceof w.h))) {
                                                                                        v16_1 = 5;
                                                                                    }
                                                                                    if (((v11_0 instanceof w.a)) || ((v12_1 instanceof w.a))) {
                                                                                        v16_1 = 5;
                                                                                    }
                                                                                    int v4_13;
                                                                                    if (p49 == 0) {
                                                                                        v4_13 = v16_1;
                                                                                    } else {
                                                                                        v4_13 = 5;
                                                                                    }
                                                                                    v3_19 = Math.max(v4_13, v3_19);
                                                                                }
                                                                                int v10_13;
                                                                                if (v20_3 == 0) {
                                                                                    v10_13 = v3_19;
                                                                                } else {
                                                                                    v3_19 = Math.min(v8_1, v3_19);
                                                                                    if ((p46 == null) || ((p49 != 0) || ((v11_0 != v10_8) && (v12_1 != v10_8)))) {
                                                                                    } else {
                                                                                        v10_13 = 4;
                                                                                    }
                                                                                }
                                                                                v1_0.e(v2_13, v5_0, p39.e(), v10_13);
                                                                                v1_0.e(v7_1, v6_3, (- v13_9.e()), v10_13);
                                                                            }
                                                                            if (v20_3 != 0) {
                                                                                int v3_23;
                                                                                if (p35 != v5_0) {
                                                                                    v3_23 = 0;
                                                                                } else {
                                                                                    v3_23 = p39.e();
                                                                                }
                                                                                if (v5_0 != p35) {
                                                                                    v1_0.f(v2_13, p35, v3_23, 5);
                                                                                }
                                                                            }
                                                                            if ((v20_3 != 0) && ((v24 != 0) && ((p43 == 0) && (v37_1 == null)))) {
                                                                                if ((v24 == 0) || (v14_1 != 3)) {
                                                                                    int v4_15 = 5;
                                                                                    v1_0.f(v7_1, v2_13, 0, 5);
                                                                                    int v10_18 = v4_15;
                                                                                    if ((v20_3 != 0) && (v34_1 != 0)) {
                                                                                        int v15_12;
                                                                                        if (v13_9.f == null) {
                                                                                            v15_12 = 0;
                                                                                        } else {
                                                                                            v15_12 = v13_9.e();
                                                                                        }
                                                                                        if (v6_3 != p36) {
                                                                                            v1_0.f(p36, v7_1, v15_12, v10_18);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    return;
                                                                                } else {
                                                                                    v1_0.f(v7_1, v2_13, 0, 8);
                                                                                }
                                                                            }
                                                                            v4_15 = 5;
                                                                        } else {
                                                                            if (p49 != 0) {
                                                                                if ((v11_0 == v10_8) || (v4_5 == v10_8)) {
                                                                                    v1_9 = 5;
                                                                                } else {
                                                                                    v1_9 = 4;
                                                                                }
                                                                                v3_0 = p36;
                                                                                v2_13 = v7_0;
                                                                                v7_1 = v8_0;
                                                                                v5_0 = v9_1;
                                                                                v9_2 = 6;
                                                                                v19_0 = 4;
                                                                                v20_0 = 1;
                                                                                v23 = 1;
                                                                                v25 = 1;
                                                                            } else {
                                                                                v1_0 = p30;
                                                                                v3_0 = p36;
                                                                                v2_13 = v7_0;
                                                                                v7_1 = v8_0;
                                                                                v5_0 = v9_1;
                                                                                v9_2 = 6;
                                                                                v8_1 = 5;
                                                                                v19_0 = 8;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        v1_0 = p30;
                                                                        v3_0 = p36;
                                                                        v2_13 = v7_0;
                                                                        v7_1 = v8_0;
                                                                        v5_0 = v9_1;
                                                                        v9_2 = 6;
                                                                        v8_1 = 5;
                                                                        v19_0 = 5;
                                                                    }
                                                                } else {
                                                                    if ((p52 != 2) && (p52 != 1)) {
                                                                        v1_9 = 8;
                                                                        int v3_6 = 5;
                                                                    } else {
                                                                        v1_9 = 5;
                                                                        v3_6 = 4;
                                                                    }
                                                                    v19_0 = v3_6;
                                                                    v2_13 = v7_0;
                                                                    v7_1 = v8_0;
                                                                    v5_0 = v9_1;
                                                                    v9_2 = 6;
                                                                    v20_0 = 1;
                                                                    v23 = 1;
                                                                    v25 = 1;
                                                                    v3_0 = p36;
                                                                }
                                                                v8_1 = v1_9;
                                                                v1_0 = p30;
                                                            } else {
                                                                if (p49 == 0) {
                                                                    v1_0 = p30;
                                                                    v3_0 = p36;
                                                                    v2_13 = v7_0;
                                                                    v7_1 = v8_0;
                                                                    v5_0 = v9_1;
                                                                    v8_1 = 8;
                                                                    v9_2 = 8;
                                                                } else {
                                                                    v1_0 = p30;
                                                                    v3_0 = p36;
                                                                    v2_13 = v7_0;
                                                                    v7_1 = v8_0;
                                                                    v5_0 = v9_1;
                                                                    v8_1 = 8;
                                                                    if (!p32) {
                                                                        v9_2 = 4;
                                                                    } else {
                                                                        v9_2 = 5;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        v1_0 = p30;
                                                        v17_1 = v3_7;
                                                        v2_13 = v7_0;
                                                        v7_1 = v8_0;
                                                        v5_0 = v9_1;
                                                        v9_2 = 6;
                                                        v8_1 = 8;
                                                        v19_0 = 4;
                                                    }
                                                } else {
                                                    if ((!(v11_0 instanceof w.a)) && (!(v4_5 instanceof w.a))) {
                                                        v1_0 = p30;
                                                        v17_1 = v3_7;
                                                        v2_13 = v7_0;
                                                        v7_1 = v8_0;
                                                        v5_0 = v9_1;
                                                        v9_2 = 6;
                                                        v8_1 = 5;
                                                        v19_0 = 5;
                                                    } else {
                                                        v1_0 = p30;
                                                        v17_1 = v3_7;
                                                        v2_13 = v7_0;
                                                        v7_1 = v8_0;
                                                        v5_0 = v9_1;
                                                        v9_2 = 6;
                                                        v8_1 = 5;
                                                    }
                                                }
                                                v20_0 = 1;
                                                v23 = 1;
                                                v25 = 0;
                                            } else {
                                                if ((v5_9 != 0) || (v13_1 != null)) {
                                                    int v5_1 = 5;
                                                    int v17_2 = 5;
                                                    int v19_2 = 1;
                                                    int v20_2 = 0;
                                                    v23 = 1;
                                                } else {
                                                    if ((!v9_1.f) || (!v6_3.f)) {
                                                        v5_1 = 8;
                                                        v17_2 = 8;
                                                        v19_2 = 0;
                                                        v20_2 = 1;
                                                        v23 = 0;
                                                    } else {
                                                        p30.e(v7_0, v9_1, p39.e(), 8);
                                                        p30.e(v8_0, v6_3, (- p40.e()), 8);
                                                        return;
                                                    }
                                                }
                                                if ((!(v11_0 instanceof w.a)) && (!(v4_5 instanceof w.a))) {
                                                    v1_0 = p30;
                                                    v2_13 = v7_0;
                                                    v7_1 = v8_0;
                                                    v25 = v20_2;
                                                    v8_1 = v5_1;
                                                    v5_0 = v9_1;
                                                    v9_2 = 6;
                                                    v20_0 = v19_2;
                                                    v19_0 = v17_2;
                                                    v17_1 = v3_7;
                                                } else {
                                                    v1_0 = p30;
                                                    v17_1 = v3_7;
                                                    v2_13 = v7_0;
                                                    v7_1 = v8_0;
                                                    v25 = v20_2;
                                                    v3_0 = p36;
                                                    v8_1 = v5_1;
                                                    v5_0 = v9_1;
                                                    v9_2 = 6;
                                                    v20_0 = v19_2;
                                                    v19_0 = 4;
                                                }
                                            }
                                            v3_0 = p36;
                                        }
                                    }
                                } else {
                                    v6_3 = v20_1;
                                    p30.e(v8_0, v6_3, (- p40.e()), 8);
                                    if (p32) {
                                        p30.f(v7_0, p35, 0, 5);
                                        v13_9 = p40;
                                        v4_15 = 5;
                                        v7_1 = v8_0;
                                        v34_1 = v10_1;
                                        v20_3 = p32;
                                    }
                                }
                                v13_9 = p40;
                                v7_1 = v8_0;
                                v34_1 = v10_1;
                                v4_15 = 5;
                            } else {
                                if ((!p32) || (!(p39.f.d instanceof w.a))) {
                                    int v2_24 = 5;
                                } else {
                                    v2_24 = 8;
                                }
                                v13_9 = p40;
                                v7_1 = v8_0;
                                v34_1 = v10_1;
                                v6_3 = v20_1;
                                v20_3 = p32;
                                v10_18 = v2_24;
                            }
                        } else {
                            v13_9 = p40;
                            v7_1 = v8_0;
                            v34_1 = v10_1;
                            v6_3 = v20_1;
                        }
                    } else {
                        int v7_3 = v8_0;
                        if ((v11_3 < 2) && ((p32) && (v10_1 != 0))) {
                            int v10_22;
                            p30.f(v7_0, p35, 0, 8);
                            int v2_27 = this.M;
                            if ((!p31) && (v2_27.f != null)) {
                                v10_22 = 0;
                            } else {
                                v10_22 = 1;
                            }
                            if (!p31) {
                                int v2_28 = v2_27.f;
                                if (v2_28 != 0) {
                                    int v2_29 = v2_28.d;
                                    if (v2_29.W != 0) {
                                        int v2_30 = v2_29.p0;
                                        if ((v2_30[0] == 3) && (v2_30[1] == 3)) {
                                            v10_22 = 1;
                                            if (v10_22 != 0) {
                                                p30.f(p36, v7_3, 0, 8);
                                            }
                                            return;
                                        }
                                    }
                                    v10_22 = 0;
                                }
                            }
                        }
                    }
                    return;
                }
            } else {
                p30.d(v7_0, p41);
            }
            v24 = v13_15;
            v13_16 = 8;
        }
    }

    public final void e(int p11, w.d p12, int p13, int p14)
    {
        if (p11 != 7) {
            if ((p11 != 8) || ((p13 != 2) && (p13 != 4))) {
                if ((p11 != 9) || ((p13 != 3) && (p13 != 5))) {
                    if ((p11 != 8) || (p13 != 8)) {
                        if ((p11 != 9) || (p13 != 9)) {
                            w.c v6_0 = this.i(p11);
                            w.c v12_11 = p12.i(p13);
                            if (v6_0.i(v12_11)) {
                                if (p11 != 6) {
                                    if ((p11 != 3) && (p11 != 5)) {
                                        if ((p11 == 2) || (p11 == 4)) {
                                            w.c v13_7 = this.i(7);
                                            if (v13_7.f != v12_11) {
                                                v13_7.j();
                                            }
                                            w.c v11_15 = this.i(p11).f();
                                            w.c v13_8 = this.i(8);
                                            if (v13_8.h()) {
                                                v11_15.j();
                                                v13_8.j();
                                            }
                                        }
                                    } else {
                                        w.c v13_9 = this.i(6);
                                        if (v13_9 != null) {
                                            v13_9.j();
                                        }
                                        w.c v13_10 = this.i(7);
                                        if (v13_10.f != v12_11) {
                                            v13_10.j();
                                        }
                                        w.c v11_17 = this.i(p11).f();
                                        w.c v13_11 = this.i(9);
                                        if (v13_11.h()) {
                                            v11_17.j();
                                            v13_11.j();
                                        }
                                    }
                                } else {
                                    w.c v11_18 = this.i(3);
                                    w.c v13_12 = this.i(5);
                                    if (v11_18 != null) {
                                        v11_18.j();
                                    }
                                    if (v13_12 != null) {
                                        v13_12.j();
                                    }
                                }
                                v6_0.a(v12_11, p14);
                            }
                        } else {
                            this.i(3).a(p12.i(3), 0);
                            this.i(5).a(p12.i(5), 0);
                            this.i(9).a(p12.i(p13), 0);
                            return;
                        }
                    } else {
                        this.i(2).a(p12.i(2), 0);
                        this.i(4).a(p12.i(4), 0);
                        this.i(8).a(p12.i(p13), 0);
                        return;
                    }
                } else {
                    w.c v11_2 = p12.i(p13);
                    this.i(3).a(v11_2, 0);
                    this.i(5).a(v11_2, 0);
                    this.i(9).a(v11_2, 0);
                    return;
                }
            } else {
                w.c v11_3 = this.i(2);
                w.c v12_5 = p12.i(p13);
                w.c v13_1 = this.i(4);
                v11_3.a(v12_5, 0);
                v13_1.a(v12_5, 0);
                this.i(8).a(v12_5, 0);
                return;
            }
        } else {
            if (p13 != 7) {
                if ((p13 != 2) && (p13 != 4)) {
                    if ((p13 == 3) || (p13 == 5)) {
                        this.e(3, p12, p13, 0);
                        this.e(5, p12, p13, 0);
                        this.i(7).a(p12.i(p13), 0);
                        return;
                    }
                } else {
                    this.e(2, p12, p13, 0);
                    this.e(4, p12, p13, 0);
                    this.i(7).a(p12.i(p13), 0);
                    return;
                }
            } else {
                w.c v11_10;
                w.c v11_7 = this.i(2);
                w.c v13_2 = this.i(4);
                w.c v14_2 = this.i(3);
                w.c v8 = this.i(5);
                w.c v9 = 1;
                if (((v11_7 == null) || (!v11_7.h())) && ((v13_2 == null) || (!v13_2.h()))) {
                    this.e(2, p12, 2, 0);
                    this.e(4, p12, 4, 0);
                    v11_10 = 1;
                } else {
                    v11_10 = 0;
                }
                if (((v14_2 == null) || (!v14_2.h())) && ((v8 == null) || (!v8.h()))) {
                    this.e(3, p12, 3, 0);
                    this.e(5, p12, 5, 0);
                } else {
                    v9 = 0;
                }
                if ((v11_10 == null) || (v9 == null)) {
                    if (v11_10 == null) {
                        if (v9 != null) {
                            this.i(9).a(p12.i(9), 0);
                            return;
                        }
                    } else {
                        this.i(8).a(p12.i(8), 0);
                        return;
                    }
                } else {
                    this.i(7).a(p12.i(7), 0);
                    return;
                }
            }
        }
        return;
    }

    public final void f(w.c p2, w.c p3, int p4)
    {
        if (p2.d == this) {
            this.e(p2.e, p3.d, p3.e, p4);
        }
        return;
    }

    public final void g(u.c p2)
    {
        p2.k(this.I);
        p2.k(this.J);
        p2.k(this.K);
        p2.k(this.L);
        if (this.a0 > 0) {
            p2.k(this.M);
        }
        return;
    }

    public final void h()
    {
        if (this.d == null) {
            x.m v0_5 = new x.k(this);
            v0_5.h.e = 4;
            v0_5.i.e = 5;
            v0_5.f = 0;
            this.d = v0_5;
        }
        if (this.e == null) {
            x.m v0_3 = new x.m(this);
            int v1_2 = new x.f(v0_3);
            v0_3.k = v1_2;
            v0_3.l = 0;
            v0_3.h.e = 6;
            v0_3.i.e = 7;
            v1_2.e = 8;
            v0_3.f = 1;
            this.e = v0_3;
        }
        return;
    }

    public w.c i(int p2)
    {
        switch (u.e.c(p2)) {
            case 0:
                return 0;
            case 1:
                return this.I;
            case 2:
                return this.J;
            case 3:
                return this.K;
            case 4:
                return this.L;
            case 5:
                return this.M;
            case 6:
                return this.P;
            case 7:
                return this.N;
            case 8:
                return this.O;
            default:
                throw new AssertionError(g2.g.m(p2));
        }
    }

    public final int j(int p4)
    {
        int[] v1 = this.p0;
        if (p4 != 0) {
            if (p4 != 1) {
                return 0;
            } else {
                return v1[1];
            }
        } else {
            return v1[0];
        }
    }

    public final int k()
    {
        if (this.g0 != 8) {
            return this.V;
        } else {
            return 0;
        }
    }

    public final w.d l(int p3)
    {
        if (p3 != null) {
            if (p3 == 1) {
                w.d v3_4 = this.L;
                w.c v0_2 = v3_4.f;
                if ((v0_2 != null) && (v0_2.f == v3_4)) {
                    return v0_2.d;
                }
            }
        } else {
            w.d v3_1 = this.K;
            w.c v0_1 = v3_1.f;
            if ((v0_1 != null) && (v0_1.f == v3_1)) {
                return v0_1.d;
            }
        }
        return 0;
    }

    public final w.d m(int p3)
    {
        if (p3 != null) {
            if (p3 == 1) {
                w.d v3_4 = this.J;
                w.c v0_2 = v3_4.f;
                if ((v0_2 != null) && (v0_2.f == v3_4)) {
                    return v0_2.d;
                }
            }
        } else {
            w.d v3_1 = this.I;
            w.c v0_1 = v3_1.f;
            if ((v0_1 != null) && (v0_1.f == v3_1)) {
                return v0_1.d;
            }
        }
        return 0;
    }

    public void n(StringBuilder p14)
    {
        String v1_13 = new StringBuilder("  ");
        v1_13.append(this.j);
        v1_13.append(":{\n");
        p14.append(v1_13.toString());
        String v1_8 = new StringBuilder("    actualWidth:");
        v1_8.append(this.U);
        p14.append(v1_8.toString());
        p14.append("\n");
        int v2_8 = new StringBuilder("    actualHeight:");
        v2_8.append(this.V);
        p14.append(v2_8.toString());
        p14.append("\n");
        int v2_12 = new StringBuilder("    actualLeft:");
        v2_12.append(this.Y);
        p14.append(v2_12.toString());
        p14.append("\n");
        int v2_15 = new StringBuilder("    actualTop:");
        v2_15.append(this.Z);
        p14.append(v2_15.toString());
        p14.append("\n");
        w.d.p(p14, "left", this.I);
        w.d.p(p14, "top", this.J);
        w.d.p(p14, "right", this.K);
        w.d.p(p14, "bottom", this.L);
        w.d.p(p14, "baseline", this.M);
        w.d.p(p14, "centerX", this.N);
        w.d.p(p14, "centerY", this.O);
        int[] v9 = this.C;
        int[] v11 = this.p0;
        w.d.o(p14, "    width", this.U, this.b0, v9[0], this.u, this.r, this.w, v11[0]);
        StringBuilder v0_1 = 1;
        w.d.o(p14, "    height", this.V, this.c0, v9[v0_1], this.x, this.s, this.z, v11[v0_1]);
        String v1_24 = this.W;
        int v2_27 = this.X;
        if (v1_24 != 0) {
            p14.append("    dimensionRatio");
            p14.append(" :  [");
            p14.append(v1_24);
            p14.append(",");
            p14.append(v2_27);
            p14.append("");
            p14.append("],\n");
        }
        w.d.H(p14, "    horizontalBias", this.d0, 1056964608);
        w.d.H(p14, "    verticalBias", this.e0, 1056964608);
        w.d.G(this.i0, 0, "    horizontalChainStyle", p14);
        w.d.G(this.j0, 0, "    verticalChainStyle", p14);
        p14.append("  }");
        return;
    }

    public final int q()
    {
        if (this.g0 != 8) {
            return this.U;
        } else {
            return 0;
        }
    }

    public final int r()
    {
        int v0_0 = this.T;
        if ((v0_0 == 0) || (!(v0_0 instanceof w.e))) {
            return this.Y;
        } else {
            return (((w.e) v0_0).x0 + this.Y);
        }
    }

    public final int s()
    {
        int v0_0 = this.T;
        if ((v0_0 == 0) || (!(v0_0 instanceof w.e))) {
            return this.Z;
        } else {
            return (((w.e) v0_0).y0 + this.Z);
        }
    }

    public final boolean t(int p5)
    {
        if (p5 != 0) {
            int v5_9;
            if (this.J.f == null) {
                v5_9 = 0;
            } else {
                v5_9 = 1;
            }
            int v3_1;
            if (this.L.f == null) {
                v3_1 = 0;
            } else {
                v3_1 = 1;
            }
            int v3_4;
            if (this.M.f == null) {
                v3_4 = 0;
            } else {
                v3_4 = 1;
            }
            if (((v5_9 + v3_1) + v3_4) < 2) {
                return 1;
            }
        } else {
            int v5_5;
            if (this.I.f == null) {
                v5_5 = 0;
            } else {
                v5_5 = 1;
            }
            int v3_7;
            if (this.K.f == null) {
                v3_7 = 0;
            } else {
                v3_7 = 1;
            }
            if ((v5_5 + v3_7) < 2) {
                return 1;
            }
        }
        return 0;
    }

    public String toString()
    {
        String v0_0 = "";
        StringBuilder v1 = u.e.b("");
        if (this.h0 != null) {
            v0_0 = v1.a.n(new StringBuilder("id: "), this.h0, " ");
        }
        v1.append(v0_0);
        v1.append("(");
        v1.append(this.Y);
        v1.append(", ");
        v1.append(this.Z);
        v1.append(") - (");
        v1.append(this.U);
        v1.append(" x ");
        v1.append(this.V);
        v1.append(")");
        return v1.toString();
    }

    public final boolean u(int p4, int p5)
    {
        if (p4 != 0) {
            int v4_1 = this.J;
            int v0_3 = v4_1.f;
            if ((v0_3 != 0) && (v0_3.c)) {
                int v0_11 = this.L;
                int v1_7 = v0_11.f;
                if ((v1_7 != 0) && ((v1_7.c) && (((v1_7.d() - v0_11.e()) - (v4_1.e() + v4_1.f.d())) >= p5))) {
                    return 1;
                }
            }
        } else {
            int v4_4 = this.I;
            int v0_4 = v4_4.f;
            if ((v0_4 != 0) && (v0_4.c)) {
                int v0_6 = this.K;
                int v1_3 = v0_6.f;
                if ((v1_3 != 0) && ((v1_3.c) && (((v1_3.d() - v0_6.e()) - (v4_4.e() + v4_4.f.d())) >= p5))) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public final void v(int p1, int p2, int p3, int p4, w.d p5)
    {
        this.i(p1).b(p5.i(p2), p3, p4, 1);
        return;
    }

    public final boolean w(int p4)
    {
        w.c v4_1 = (p4 * 2);
        w.c v0_0 = this.Q;
        int v1_0 = v0_0[v4_1];
        w.c v2_0 = v1_0.f;
        if ((v2_0 != null) && (v2_0.f != v1_0)) {
            w.c v4_4 = v0_0[(v4_1 + 1)];
            w.c v0_1 = v4_4.f;
            if ((v0_1 != null) && (v0_1.f == v4_4)) {
                return 1;
            }
        }
        return 0;
    }

    public final boolean x()
    {
        int v0_0 = this.I;
        w.c v1_0 = v0_0.f;
        if ((v1_0 == null) || (v1_0.f != v0_0)) {
            int v0_3 = this.K;
            w.c v1_2 = v0_3.f;
            if ((v1_2 == null) || (v1_2.f != v0_3)) {
                return 0;
            }
        }
        return 1;
    }

    public final boolean y()
    {
        int v0_0 = this.J;
        w.c v1_0 = v0_0.f;
        if ((v1_0 == null) || (v1_0.f != v0_0)) {
            int v0_3 = this.L;
            w.c v1_2 = v0_3.f;
            if ((v1_2 == null) || (v1_2.f != v0_3)) {
                return 0;
            }
        }
        return 1;
    }

    public final boolean z()
    {
        if ((!this.g) || (this.g0 == 8)) {
            return 0;
        } else {
            return 1;
        }
    }
}
