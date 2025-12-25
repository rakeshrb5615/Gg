package f2;
public abstract class s implements java.lang.Cloneable {
    public static final android.animation.Animator[] D;
    public static final int[] E;
    public static final a6.e F;
    public static final ThreadLocal G;
    public java.util.ArrayList A;
    public a.a B;
    public a6.e C;
    public final String a;
    public long b;
    public long c;
    public android.animation.TimeInterpolator d;
    public final java.util.ArrayList e;
    public final java.util.ArrayList f;
    public j6.s m;
    public j6.s n;
    public f2.y o;
    public final int[] p;
    public java.util.ArrayList q;
    public java.util.ArrayList r;
    public f2.q[] s;
    public final java.util.ArrayList t;
    public android.animation.Animator[] u;
    public int v;
    public boolean w;
    public boolean x;
    public f2.s y;
    public java.util.ArrayList z;

    static s()
    {
        ThreadLocal v0_1 = new android.animation.Animator[0];
        f2.s.D = v0_1;
        f2.s.E = new int[] {2, 1, 3, 4});
        f2.s.F = new a6.e();
        f2.s.G = new ThreadLocal();
        return;
    }

    public s()
    {
        this.a = this.getClass().getName();
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = new java.util.ArrayList();
        this.f = new java.util.ArrayList();
        this.m = new j6.s(5);
        this.n = new j6.s(5);
        this.o = 0;
        this.p = f2.s.E;
        this.t = new java.util.ArrayList();
        this.u = f2.s.D;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.A = new java.util.ArrayList();
        this.C = f2.s.F;
        return;
    }

    public static void d(j6.s p11, android.view.View p12, f2.a0 p13)
    {
        long v1_1 = ((r.e) p11.e);
        boolean v2_2 = ((android.util.SparseArray) p11.c);
        r.g v11_2 = ((r.g) p11.d);
        ((r.e) p11.b).put(p12, p13);
        int v13_1 = p12.getId();
        if (v13_1 >= 0) {
            if (v2_2.indexOfKey(v13_1) < 0) {
                v2_2.put(v13_1, p12);
            } else {
                v2_2.put(v13_1, 0);
            }
        }
        int v13_2 = q0.i0.e(p12);
        if (v13_2 != 0) {
            if (!v1_1.containsKey(v13_2)) {
                v1_1.put(v13_2, p12);
            } else {
                v1_1.put(v13_2, 0);
            }
        }
        if ((p12.getParent() instanceof android.widget.ListView)) {
            int v13_6 = ((android.widget.ListView) p12.getParent());
            if (v13_6.getAdapter().hasStableIds()) {
                long v1_5 = v13_6.getItemIdAtPosition(v13_6.getPositionForView(p12));
                if (v11_2.a) {
                    int v13_8 = v11_2.d;
                    int v4_0 = v11_2.b;
                    Object[] v5 = v11_2.c;
                    int v6 = 0;
                    int v7 = 0;
                    while (v6 < v13_8) {
                        Object v8 = v5[v6];
                        if (v8 != r.h.a) {
                            if (v6 != v7) {
                                v4_0[v7] = v4_0[v6];
                                v5[v7] = v8;
                                v5[v6] = 0;
                            }
                            v7++;
                        }
                        v6++;
                    }
                    v11_2.a = 0;
                    v11_2.d = v7;
                }
                if (s.a.b(v11_2.b, v11_2.d, v1_5) < 0) {
                    p12.setHasTransientState(1);
                    v11_2.e(v1_5, p12);
                } else {
                    android.view.View v12_2 = ((android.view.View) v11_2.b(v1_5));
                    if (v12_2 != null) {
                        v12_2.setHasTransientState(0);
                        v11_2.e(v1_5, 0);
                        return;
                    }
                }
            }
        }
        return;
    }

    public static r.e s()
    {
        ThreadLocal v0 = f2.s.G;
        r.e v1_1 = ((r.e) v0.get());
        if (v1_1 == null) {
            v1_1 = new r.e(0);
            v0.set(v1_1);
        }
        return v1_1;
    }

    public static boolean x(f2.a0 p0, f2.a0 p1, String p2)
    {
        int v0_5 = p0.a.get(p2);
        Object v1_2 = p1.a.get(p2);
        if ((v0_5 != 0) || (v1_2 != null)) {
            if ((v0_5 != 0) && (v1_2 != null)) {
                return (v0_5.equals(v1_2) ^ 1);
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public f2.s A(f2.q p2)
    {
        f2.s v0_0 = this.z;
        if (v0_0 != null) {
            if (!v0_0.remove(p2)) {
                f2.s v0_2 = this.y;
                if (v0_2 != null) {
                    v0_2.A(p2);
                }
            }
            if (this.z.size() == 0) {
                this.z = 0;
            }
        }
        return this;
    }

    public void B(android.view.View p2)
    {
        this.f.remove(p2);
        return;
    }

    public void C(android.view.View p4)
    {
        if (this.w) {
            if (!this.x) {
                a5.t v4_5 = this.t;
                int v0_1 = v4_5.size();
                a5.t v4_1 = ((android.animation.Animator[]) v4_5.toArray(this.u));
                this.u = f2.s.D;
                int v0_0 = (v0_1 - 1);
                while (v0_0 >= 0) {
                    int v1_1 = v4_1[v0_0];
                    v4_1[v0_0] = 0;
                    v1_1.resume();
                    v0_0--;
                }
                this.u = v4_1;
                this.y(this, f2.r.k);
            }
            this.w = 0;
        }
        return;
    }

    public void D()
    {
        this.K();
        java.util.ArrayList v0_0 = f2.s.s();
        java.util.ArrayList v1 = this.A;
        int v2 = v1.size();
        int v3 = 0;
        while (v3 < v2) {
            android.animation.Animator v4_0 = v1.get(v3);
            v3++;
            android.animation.Animator v4_1 = ((android.animation.Animator) v4_0);
            if (v0_0.containsKey(v4_1)) {
                this.K();
                if (v4_1 != null) {
                    v4_1.addListener(new f2.n(this, v0_0));
                    f2.o v5_3 = this.c;
                    if (v5_3 >= 0) {
                        v4_1.setDuration(v5_3);
                    }
                    f2.o v5_4 = this.b;
                    if (v5_4 >= 0) {
                        v4_1.setStartDelay((v4_1.getStartDelay() + v5_4));
                    }
                    f2.o v5_5 = this.d;
                    if (v5_5 != null) {
                        v4_1.setInterpolator(v5_5);
                    }
                    v4_1.addListener(new f2.o(this, 0));
                    v4_1.start();
                }
            }
        }
        this.A.clear();
        this.p();
        return;
    }

    public void E(long p1)
    {
        this.c = p1;
        return;
    }

    public void F(a.a p1)
    {
        this.B = p1;
        return;
    }

    public void G(android.animation.TimeInterpolator p1)
    {
        this.d = p1;
        return;
    }

    public void H(a6.e p1)
    {
        if (p1 != null) {
            this.C = p1;
            return;
        } else {
            this.C = f2.s.F;
            return;
        }
    }

    public void I()
    {
        return;
    }

    public void J(long p1)
    {
        this.b = p1;
        return;
    }

    public final void K()
    {
        if (this.v == 0) {
            this.y(this, f2.r.g);
            this.x = 0;
        }
        this.v = (this.v + 1);
        return;
    }

    public String L(String p8)
    {
        StringBuilder v0_1 = new StringBuilder(p8);
        v0_1.append(this.getClass().getSimpleName());
        v0_1.append("@");
        v0_1.append(Integer.toHexString(this.hashCode()));
        v0_1.append(": ");
        if (this.c != -1) {
            v0_1.append("dur(");
            v0_1.append(this.c);
            v0_1.append(") ");
        }
        if (this.b != -1) {
            v0_1.append("dly(");
            v0_1.append(this.b);
            v0_1.append(") ");
        }
        if (this.d != null) {
            v0_1.append("interp(");
            v0_1.append(this.d);
            v0_1.append(") ");
        }
        Object v8_12 = this.e;
        java.util.ArrayList v2_1 = this.f;
        if ((v8_12.size() > 0) || (v2_1.size() > 0)) {
            v0_1.append("tgts(");
            int v4 = 0;
            if (v8_12.size() > 0) {
                int v1_6 = 0;
                while (v1_6 < v8_12.size()) {
                    if (v1_6 > 0) {
                        v0_1.append(", ");
                    }
                    v0_1.append(v8_12.get(v1_6));
                    v1_6++;
                }
            }
            if (v2_1.size() > 0) {
                while (v4 < v2_1.size()) {
                    if (v4 > 0) {
                        v0_1.append(", ");
                    }
                    v0_1.append(v2_1.get(v4));
                    v4++;
                }
            }
            v0_1.append(")");
        }
        return v0_1.toString();
    }

    public void a(f2.q p2)
    {
        if (this.z == null) {
            this.z = new java.util.ArrayList();
        }
        this.z.add(p2);
        return;
    }

    public void b(android.view.View p2)
    {
        this.f.add(p2);
        return;
    }

    public void cancel()
    {
        a5.t v0_0 = this.t;
        int v1_1 = v0_0.size();
        a5.t v0_3 = ((android.animation.Animator[]) v0_0.toArray(this.u));
        this.u = f2.s.D;
        int v1_0 = (v1_1 - 1);
        while (v1_0 >= 0) {
            android.animation.Animator v2_0 = v0_3[v1_0];
            v0_3[v1_0] = 0;
            v2_0.cancel();
            v1_0--;
        }
        this.u = v0_3;
        this.y(this, f2.r.i);
        return;
    }

    public bridge synthetic Object clone()
    {
        return this.m();
    }

    public abstract void e();

    public final void g(android.view.View p3, boolean p4)
    {
        if (p3 != null) {
            p3.getId();
            if ((p3.getParent() instanceof android.view.ViewGroup)) {
                int v0_5 = new f2.a0(p3);
                if (!p4) {
                    this.e(v0_5);
                } else {
                    this.j(v0_5);
                }
                v0_5.c.add(this);
                this.h(v0_5);
                if (!p4) {
                    f2.s.d(this.n, p3, v0_5);
                } else {
                    f2.s.d(this.m, p3, v0_5);
                }
            }
            if ((p3 instanceof android.view.ViewGroup)) {
                int v0_1 = 0;
                while (v0_1 < ((android.view.ViewGroup) p3).getChildCount()) {
                    this.g(((android.view.ViewGroup) p3).getChildAt(v0_1), p4);
                    v0_1++;
                }
            }
        }
        return;
    }

    public void h(f2.a0 p1)
    {
        return;
    }

    public abstract void j();

    public final void k(android.view.ViewGroup p8, boolean p9)
    {
        this.l(p9);
        f2.a0 v0_0 = this.e;
        java.util.ArrayList v2 = this.f;
        if ((v0_0.size() <= 0) && (v2.size() <= 0)) {
            this.g(p8, p9);
            return;
        } else {
            int v1_0 = 0;
            j6.s v3_0 = 0;
            while (v3_0 < v0_0.size()) {
                android.view.View v4_4 = p8.findViewById(((Integer) v0_0.get(v3_0)).intValue());
                if (v4_4 != null) {
                    f2.a0 v5_1 = new f2.a0(v4_4);
                    if (!p9) {
                        this.e(v5_1);
                    } else {
                        this.j(v5_1);
                    }
                    v5_1.c.add(this);
                    this.h(v5_1);
                    if (!p9) {
                        f2.s.d(this.n, v4_4, v5_1);
                    } else {
                        f2.s.d(this.m, v4_4, v5_1);
                    }
                }
                v3_0++;
            }
            while (v1_0 < v2.size()) {
                android.view.View v8_3 = ((android.view.View) v2.get(v1_0));
                f2.a0 v0_2 = new f2.a0(v8_3);
                if (!p9) {
                    this.e(v0_2);
                } else {
                    this.j(v0_2);
                }
                v0_2.c.add(this);
                this.h(v0_2);
                if (!p9) {
                    f2.s.d(this.n, v8_3, v0_2);
                } else {
                    f2.s.d(this.m, v8_3, v0_2);
                }
                v1_0++;
            }
            return;
        }
    }

    public final void l(boolean p1)
    {
        if (p1 == null) {
            ((r.e) this.n.b).clear();
            ((android.util.SparseArray) this.n.c).clear();
            ((r.g) this.n.d).a();
            return;
        } else {
            ((r.e) this.m.b).clear();
            ((android.util.SparseArray) this.m.c).clear();
            ((r.g) this.m.d).a();
            return;
        }
    }

    public f2.s m()
    {
        try {
            CloneNotSupportedException v0_1 = ((f2.s) super.clone());
            v0_1.A = new java.util.ArrayList();
            v0_1.m = new j6.s(5);
            v0_1.n = new j6.s(5);
            v0_1.q = 0;
            v0_1.r = 0;
            v0_1.y = this;
            v0_1.z = 0;
            return v0_1;
        } catch (CloneNotSupportedException v0_2) {
            throw new RuntimeException(v0_2);
        }
    }

    public android.animation.Animator n(android.view.ViewGroup p1, f2.a0 p2, f2.a0 p3)
    {
        return 0;
    }

    public void o(android.view.ViewGroup p20, j6.s p21, j6.s p22, java.util.ArrayList p23, java.util.ArrayList p24)
    {
        r.e v1 = f2.s.s();
        android.util.SparseIntArray v2_1 = new android.util.SparseIntArray();
        String v3_7 = p23.size();
        this.r().getClass();
        boolean v5_0 = 0;
        while (v5_0 < v3_7) {
            android.view.View v7_5 = ((f2.a0) p23.get(v5_0));
            boolean v9_5 = ((f2.a0) p24.get(v5_0));
            if ((v7_5 != null) && (!v7_5.c.contains(this))) {
                v7_5 = 0;
            }
            if ((v9_5) && (!v9_5.c.contains(this))) {
                v9_5 = 0;
            }
            if (((v7_5 == null) && (!v9_5)) || ((v7_5 != null) && ((v9_5) && (!this.v(v7_5, v9_5))))) {
                android.animation.Animator v16 = v3_7;
                int v17_0 = v5_0;
            } else {
                android.animation.Animator v12 = this.n(p20, v7_5, v9_5);
                if (v12 == null) {
                } else {
                    android.view.View v7_6;
                    int v10_2;
                    String v13 = this.a;
                    if (!v9_5) {
                        v16 = v3_7;
                        v17_0 = v5_0;
                        v7_6 = v7_5.b;
                        v10_2 = 0;
                    } else {
                        f2.a0 v14_1;
                        int v10_1;
                        v7_6 = v9_5.b;
                        boolean v9_6 = this.t();
                        if ((!v9_6) || (v9_6.length <= 0)) {
                            v16 = v3_7;
                            v17_0 = v5_0;
                            v10_1 = v12;
                            v14_1 = 0;
                        } else {
                            v14_1 = new f2.a0(v7_6);
                            int v4_4 = ((f2.a0) ((r.e) p22.b).get(v7_6));
                            v16 = v3_7;
                            if (v4_4 != 0) {
                                int v10_0 = 0;
                                while (v10_0 < v9_6.length) {
                                    String v3_6 = v9_6[v10_0];
                                    int v17_1 = v5_0;
                                    int v18 = v4_4;
                                    v14_1.a.put(v3_6, v4_4.a.get(v3_6));
                                    v10_0++;
                                    v5_0 = v17_1;
                                    v4_4 = v18;
                                }
                            }
                            v17_0 = v5_0;
                            int v4_0 = 0;
                            while (v4_0 < v1.c) {
                                boolean v5_4 = ((f2.p) v1.get(((android.animation.Animator) v1.g(v4_0))));
                                if ((v5_4.c == null) || ((v5_4.a != v7_6) || ((!v5_4.b.equals(v13)) || (!v5_4.c.equals(v14_1))))) {
                                    v4_0++;
                                } else {
                                    v10_1 = 0;
                                }
                            }
                            v10_1 = v12;
                        }
                        v12 = v10_1;
                        v10_2 = v14_1;
                    }
                    if (v12 != null) {
                        int v4_1 = p20.getWindowId();
                        String v3_4 = new f2.p();
                        v3_4.a = v7_6;
                        v3_4.b = v13;
                        v3_4.c = v10_2;
                        v3_4.d = v4_1;
                        v3_4.e = this;
                        v3_4.f = v12;
                        v1.put(v12, v3_4);
                        this.A.add(v12);
                    }
                }
            }
            v5_0 = (v17_0 + 1);
            v3_7 = v16;
        }
        if (v2_1.size() != 0) {
            int v4_2 = 0;
            while (v4_2 < v2_1.size()) {
                String v3_13 = ((f2.p) v1.get(((android.animation.Animator) this.A.get(v2_1.keyAt(v4_2)))));
                v3_13.f.setStartDelay((v3_13.f.getStartDelay() + (((long) v2_1.valueAt(v4_2)) - 9223372036854775807)));
                v4_2++;
            }
        }
        return;
    }

    public final void p()
    {
        int v0_1 = (this.v - 1);
        this.v = v0_1;
        if (v0_1 == 0) {
            this.y(this, f2.r.h);
            int v2_1 = 0;
            while (v2_1 < ((r.g) this.m.d).g()) {
                android.view.View v3_16 = ((android.view.View) ((r.g) this.m.d).h(v2_1));
                if (v3_16 != null) {
                    v3_16.setHasTransientState(0);
                }
                v2_1++;
            }
            int v2_0 = 0;
            while (v2_0 < ((r.g) this.n.d).g()) {
                android.view.View v3_11 = ((android.view.View) ((r.g) this.n.d).h(v2_0));
                if (v3_11 != null) {
                    v3_11.setHasTransientState(0);
                }
                v2_0++;
            }
            this.x = 1;
        }
        return;
    }

    public final f2.a0 q(android.view.View p5, boolean p6)
    {
        java.util.ArrayList v0_0 = this.o;
        if (v0_0 == null) {
            java.util.ArrayList v0_1;
            if (!p6) {
                v0_1 = this.r;
            } else {
                v0_1 = this.q;
            }
            if (v0_1 != null) {
                int v1 = v0_1.size();
                int v2 = 0;
                while (v2 < v1) {
                    android.view.View v3_1 = ((f2.a0) v0_1.get(v2));
                    if (v3_1 != null) {
                        if (v3_1.b != p5) {
                            v2++;
                        }
                    } else {
                        return 0;
                    }
                    if (v2 >= 0) {
                        f2.a0 v5_1;
                        if (!p6) {
                            v5_1 = this.q;
                        } else {
                            v5_1 = this.r;
                        }
                        return ((f2.a0) v5_1.get(v2));
                    }
                }
                v2 = -1;
            }
            return 0;
        } else {
            return v0_0.q(p5, p6);
        }
    }

    public final f2.s r()
    {
        f2.s v0_0 = this.o;
        if (v0_0 == null) {
            return this;
        } else {
            return v0_0.r();
        }
    }

    public String[] t()
    {
        return 0;
    }

    public final String toString()
    {
        return this.L("");
    }

    public final f2.a0 u(android.view.View p2, boolean p3)
    {
        f2.y v0 = this.o;
        if (v0 == null) {
            r.e v3_1;
            if (p3 == null) {
                v3_1 = this.n;
            } else {
                v3_1 = this.m;
            }
            return ((f2.a0) ((r.e) v3_1.b).get(p2));
        } else {
            return v0.u(p2, p3);
        }
    }

    public boolean v(f2.a0 p6, f2.a0 p7)
    {
        if ((p6 != 0) && (p7 != null)) {
            java.util.Iterator v1_1 = this.t();
            if (v1_1 == null) {
                java.util.Iterator v1_0 = p6.a.keySet().iterator();
                while (v1_0.hasNext()) {
                    if (f2.s.x(p6, p7, ((String) v1_0.next()))) {
                    }
                }
                return 0;
            } else {
                int v3 = 0;
                while (v3 < v1_1.length) {
                    if (!f2.s.x(p6, p7, v1_1[v3])) {
                        v3++;
                    }
                }
                return 0;
            }
            return 1;
        }
        return 0;
    }

    public final boolean w(android.view.View p6)
    {
        boolean v0_0 = p6.getId();
        java.util.ArrayList v1 = this.e;
        java.util.ArrayList v4 = this.f;
        if ((v1.size() != 0) || (v4.size() != 0)) {
            if ((!v1.contains(Integer.valueOf(v0_0))) && (!v4.contains(p6))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final void y(f2.s p6, f2.r p7)
    {
        int v0_0 = this.y;
        if (v0_0 != 0) {
            v0_0.y(p6, p7);
        }
        int v0_2 = this.z;
        if ((v0_2 != 0) && (!v0_2.isEmpty())) {
            int v0_1 = this.z.size();
            f2.q[] v1_0 = this.s;
            if (v1_0 == null) {
                v1_0 = new f2.q[v0_1];
            }
            this.s = 0;
            f2.q[] v1_2 = ((f2.q[]) this.z.toArray(v1_0));
            int v3_1 = 0;
            while (v3_1 < v0_1) {
                p7.b(v1_2[v3_1], p6);
                v1_2[v3_1] = 0;
                v3_1++;
            }
            this.s = v1_2;
        }
        return;
    }

    public void z(android.view.View p5)
    {
        if (!this.x) {
            a5.t v5_2 = this.t;
            int v0_1 = v5_2.size();
            a5.t v5_4 = ((android.animation.Animator[]) v5_2.toArray(this.u));
            this.u = f2.s.D;
            int v0_0 = (v0_1 - 1);
            while (v0_0 >= 0) {
                android.animation.Animator v2 = v5_4[v0_0];
                v5_4[v0_0] = 0;
                v2.pause();
                v0_0--;
            }
            this.u = v5_4;
            this.y(this, f2.r.j);
            this.w = 1;
        }
        return;
    }
}
