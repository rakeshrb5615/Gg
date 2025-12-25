package androidx.fragment.app;
public abstract class b1 {
    public e.h A;
    public e.h B;
    public java.util.ArrayDeque C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public java.util.ArrayList I;
    public java.util.ArrayList J;
    public java.util.ArrayList K;
    public androidx.fragment.app.f1 L;
    public final androidx.fragment.app.o M;
    public final java.util.ArrayList a;
    public boolean b;
    public final androidx.fragment.app.k1 c;
    public java.util.ArrayList d;
    public java.util.ArrayList e;
    public final androidx.fragment.app.q0 f;
    public c.v g;
    public final androidx.fragment.app.t0 h;
    public final java.util.concurrent.atomic.AtomicInteger i;
    public final java.util.Map j;
    public final java.util.Map k;
    public final androidx.fragment.app.k0 l;
    public final java.util.concurrent.CopyOnWriteArrayList m;
    public final androidx.fragment.app.r0 n;
    public final androidx.fragment.app.r0 o;
    public final androidx.fragment.app.r0 p;
    public final androidx.fragment.app.r0 q;
    public final androidx.fragment.app.u0 r;
    public int s;
    public androidx.fragment.app.o0 t;
    public androidx.fragment.app.m0 u;
    public androidx.fragment.app.e0 v;
    public androidx.fragment.app.e0 w;
    public final androidx.fragment.app.v0 x;
    public final v3.f y;
    public e.h z;

    public b1()
    {
        this.a = new java.util.ArrayList();
        this.c = new androidx.fragment.app.k1();
        this.f = new androidx.fragment.app.q0(this);
        this.h = new androidx.fragment.app.t0(this);
        this.i = new java.util.concurrent.atomic.AtomicInteger();
        this.j = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.k = java.util.Collections.synchronizedMap(new java.util.HashMap());
        java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.l = new androidx.fragment.app.k0(this);
        this.m = new java.util.concurrent.CopyOnWriteArrayList();
        this.n = new androidx.fragment.app.r0(this, 0);
        this.o = new androidx.fragment.app.r0(this, 1);
        this.p = new androidx.fragment.app.r0(this, 2);
        this.q = new androidx.fragment.app.r0(this, 3);
        this.r = new androidx.fragment.app.u0(this);
        this.s = -1;
        this.x = new androidx.fragment.app.v0(this);
        this.y = new v3.f();
        this.C = new java.util.ArrayDeque();
        this.M = new androidx.fragment.app.o(this, 2);
        return;
    }

    public static boolean H(int p1)
    {
        if (!android.util.Log.isLoggable("FragmentManager", p1)) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean I(androidx.fragment.app.e0 p5)
    {
        if ((!p5.mHasMenu) || (!p5.mMenuVisible)) {
            int v5_4 = p5.mChildFragmentManager.c.e();
            int v0_2 = v5_4.size();
            boolean v2 = 0;
            int v3 = 0;
            while (v3 < v0_2) {
                androidx.fragment.app.e0 v4_0 = v5_4.get(v3);
                v3++;
                androidx.fragment.app.e0 v4_1 = ((androidx.fragment.app.e0) v4_0);
                if (v4_1 != null) {
                    v2 = androidx.fragment.app.b1.I(v4_1);
                }
                if (v2) {
                }
            }
            return 0;
        }
        return 1;
    }

    public static boolean K(androidx.fragment.app.e0 p2)
    {
        if (p2 != 0) {
            androidx.fragment.app.b1 v0 = p2.mFragmentManager;
            if ((!p2.equals(v0.w)) || (!androidx.fragment.app.b1.K(v0.v))) {
                return 0;
            }
        }
        return 1;
    }

    public static void Z(androidx.fragment.app.e0 p2)
    {
        if (androidx.fragment.app.b1.H(2)) {
            int v0_7 = new StringBuilder("show: ");
            v0_7.append(p2);
            android.util.Log.v("FragmentManager", v0_7.toString());
        }
        if (p2.mHidden) {
            p2.mHidden = 0;
            p2.mHiddenChanged = (p2.mHiddenChanged ^ 1);
        }
        return;
    }

    public final androidx.fragment.app.e0 A(int p6)
    {
        java.util.Iterator v0_0 = this.c;
        androidx.fragment.app.e0 v1_0 = v0_0.a;
        int v2_2 = (v1_0.size() - 1);
        while (v2_2 >= 0) {
            androidx.fragment.app.e0 v3_1 = ((androidx.fragment.app.e0) v1_0.get(v2_2));
            if ((v3_1 == null) || (v3_1.mFragmentId != p6)) {
                v2_2--;
            } else {
                return v3_1;
            }
        }
        java.util.Iterator v0_1 = v0_0.b.values().iterator();
        while (v0_1.hasNext()) {
            androidx.fragment.app.e0 v1_3 = ((androidx.fragment.app.j1) v0_1.next());
            if (v1_3 != null) {
                androidx.fragment.app.e0 v1_4 = v1_3.c;
                if (v1_4.mFragmentId == p6) {
                    return v1_4;
                }
            }
        }
        return 0;
    }

    public final androidx.fragment.app.e0 B(String p6)
    {
        java.util.Iterator v0_0 = this.c;
        androidx.fragment.app.e0 v1_0 = v0_0.a;
        if (p6 != 0) {
            boolean v2_2 = (v1_0.size() - 1);
            while (v2_2) {
                androidx.fragment.app.e0 v3_1 = ((androidx.fragment.app.e0) v1_0.get(v2_2));
                if ((v3_1 == null) || (!p6.equals(v3_1.mTag))) {
                    v2_2--;
                } else {
                    return v3_1;
                }
            }
        }
        if (p6 != 0) {
            java.util.Iterator v0_2 = v0_0.b.values().iterator();
            while (v0_2.hasNext()) {
                androidx.fragment.app.e0 v1_3 = ((androidx.fragment.app.j1) v0_2.next());
                if (v1_3 != null) {
                    androidx.fragment.app.e0 v1_4 = v1_3.c;
                    if (p6.equals(v1_4.mTag)) {
                        return v1_4;
                    }
                }
            }
        }
        return 0;
    }

    public final void C()
    {
        java.util.Iterator v0_1 = this.e().iterator();
        while (v0_1.hasNext()) {
            androidx.fragment.app.n v1_0 = ((androidx.fragment.app.n) v0_1.next());
            if (v1_0.e) {
                if (androidx.fragment.app.b1.H(2)) {
                    android.util.Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                v1_0.e = 0;
                v1_0.d();
            }
        }
        return;
    }

    public final android.view.ViewGroup D(androidx.fragment.app.e0 p2)
    {
        boolean v0_0 = p2.mContainer;
        if (!v0_0) {
            if ((p2.mContainerId > 0) && (this.u.c())) {
                android.view.ViewGroup v2_1 = this.u.b(p2.mContainerId);
                if ((v2_1 instanceof android.view.ViewGroup)) {
                    return ((android.view.ViewGroup) v2_1);
                }
            }
            return 0;
        } else {
            return v0_0;
        }
    }

    public final androidx.fragment.app.v0 E()
    {
        androidx.fragment.app.v0 v0_0 = this.v;
        if (v0_0 == null) {
            return this.x;
        } else {
            return v0_0.mFragmentManager.E();
        }
    }

    public final v3.f F()
    {
        v3.f v0_0 = this.v;
        if (v0_0 == null) {
            return this.y;
        } else {
            return v0_0.mFragmentManager.F();
        }
    }

    public final void G(androidx.fragment.app.e0 p3)
    {
        if (androidx.fragment.app.b1.H(2)) {
            int v0_6 = new StringBuilder("hide: ");
            v0_6.append(p3);
            android.util.Log.v("FragmentManager", v0_6.toString());
        }
        if (!p3.mHidden) {
            p3.mHidden = 1;
            p3.mHiddenChanged = (1 ^ p3.mHiddenChanged);
            this.Y(p3);
        }
        return;
    }

    public final boolean J()
    {
        int v0_0 = this.v;
        if (v0_0 != 0) {
            if ((!v0_0.isAdded()) || (!this.v.getParentFragmentManager().J())) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final void L(int p6, boolean p7)
    {
        if ((this.t == null) && (p6 != -1)) {
            throw new IllegalStateException("No activity");
        } else {
            if ((p7 != 0) || (p6 != this.s)) {
                this.s = p6;
                androidx.fragment.app.j0 v6_1 = this.c;
                int v7_1 = v6_1.b;
                int v0_1 = v6_1.a;
                String v1_0 = v0_1.size();
                android.os.Bundle v3_0 = 0;
                while (v3_0 < v1_0) {
                    String v4_3 = v0_1.get(v3_0);
                    v3_0++;
                    String v4_7 = ((androidx.fragment.app.j1) v7_1.get(((androidx.fragment.app.e0) v4_3).mWho));
                    if (v4_7 != null) {
                        v4_7.k();
                    }
                }
                int v7_3 = v7_1.values().iterator();
                while (v7_3.hasNext()) {
                    int v0_7 = ((androidx.fragment.app.j1) v7_3.next());
                    if (v0_7 != 0) {
                        v0_7.k();
                        String v1_4 = v0_7.c;
                        if ((v1_4.mRemoving) && (!v1_4.isInBackStack())) {
                            if ((v1_4.mBeingSaved) && (!v6_1.c.containsKey(v1_4.mWho))) {
                                v6_1.i(v0_7.n(), v1_4.mWho);
                            }
                            v6_1.h(v0_7);
                        }
                    }
                }
                androidx.fragment.app.j0 v6_2 = v6_1.d();
                int v7_4 = v6_2.size();
                int v0_4 = 0;
                while (v0_4 < v7_4) {
                    String v1_1 = v6_2.get(v0_4);
                    v0_4++;
                    String v1_2 = ((androidx.fragment.app.j1) v1_1);
                    android.os.Bundle v3_1 = v1_2.c;
                    if (v3_1.mDeferStart) {
                        if (!this.b) {
                            v3_1.mDeferStart = 0;
                            v1_2.k();
                        } else {
                            this.H = 1;
                        }
                    }
                }
                if (this.D) {
                    androidx.fragment.app.j0 v6_4 = this.t;
                    if ((v6_4 != null) && (this.s == 7)) {
                        ((androidx.fragment.app.i0) v6_4).e.invalidateMenu();
                        this.D = 0;
                    }
                }
            }
            return;
        }
    }

    public final void M()
    {
        if (this.t != null) {
            this.E = 0;
            this.F = 0;
            this.L.g = 0;
            java.util.Iterator v0_1 = this.c.f().iterator();
            while (v0_1.hasNext()) {
                androidx.fragment.app.e0 v1_2 = ((androidx.fragment.app.e0) v0_1.next());
                if (v1_2 != null) {
                    v1_2.noteStateNotSaved();
                }
            }
        }
        return;
    }

    public final boolean N()
    {
        return this.O(-1, 0);
    }

    public final boolean O(int p9, int p10)
    {
        this.x(0);
        this.w(1);
        java.util.ArrayList v2_4 = this.w;
        if ((v2_4 == null) || ((p9 >= null) || (!v2_4.getChildFragmentManager().N()))) {
            Throwable v9_1 = this.P(this.I, this.J, p9, p10);
            if (v9_1 != null) {
                this.b = 1;
                try {
                    this.R(this.I, this.J);
                    this.d();
                } catch (Throwable v9_2) {
                    this.d();
                    throw v9_2;
                }
            }
            this.b0();
            java.util.ArrayList v2_3 = this.c;
            if (this.H) {
                this.H = 0;
                java.util.Collection v10_3 = v2_3.d();
                int v3_1 = v10_3.size();
                int v4 = 0;
                while (v4 < v3_1) {
                    androidx.fragment.app.j1 v5_0 = v10_3.get(v4);
                    v4++;
                    androidx.fragment.app.j1 v5_1 = ((androidx.fragment.app.j1) v5_0);
                    androidx.fragment.app.e0 v6 = v5_1.c;
                    if (v6.mDeferStart) {
                        if (!this.b) {
                            v6.mDeferStart = 0;
                            v5_1.k();
                        } else {
                            this.H = 1;
                        }
                    }
                }
            }
            v2_3.b.values().removeAll(java.util.Collections.singleton(0));
            return v9_1;
        } else {
            return 1;
        }
    }

    public final boolean P(java.util.ArrayList p6, java.util.ArrayList p7, int p8, int p9)
    {
        int v9_4;
        if ((p9 & 1) == 0) {
            v9_4 = 0;
        } else {
            v9_4 = 1;
        }
        int v2_5 = this.d;
        int v3 = -1;
        if ((v2_5 != 0) && (!v2_5.isEmpty())) {
            if (p8 >= 0) {
                int v2_3 = (this.d.size() - 1);
                while (v2_3 >= 0) {
                    Object vtmp8 = this.d.get(v2_3);
                    if ((p8 >= 0) && (p8 == ((androidx.fragment.app.a) vtmp8).s)) {
                        break;
                    }
                    v2_3--;
                }
                if (v2_3 >= 0) {
                    if (v9_4 == 0) {
                        if (v2_3 != (this.d.size() - 1)) {
                            v3 = (v2_3 + 1);
                        }
                    } else {
                        v3 = v2_3;
                        while (v3 > 0) {
                            int v9_3 = this.d.get((v3 - 1));
                            if ((p8 < 0) || (p8 != ((androidx.fragment.app.a) v9_3).s)) {
                                break;
                            }
                            v3--;
                        }
                    }
                } else {
                    v3 = v2_3;
                }
            } else {
                if (v9_4 == 0) {
                    v3 = (this.d.size() - 1);
                } else {
                    v3 = 0;
                }
            }
        }
        if (v3 >= 0) {
            int v8_8 = (this.d.size() - 1);
            while (v8_8 >= v3) {
                p6.add(((androidx.fragment.app.a) this.d.remove(v8_8)));
                p7.add(Boolean.TRUE);
                v8_8--;
            }
            return 1;
        } else {
            return 0;
        }
    }

    public final void Q(androidx.fragment.app.e0 p4)
    {
        if (androidx.fragment.app.b1.H(2)) {
            int v1_4 = new StringBuilder("remove: ");
            v1_4.append(p4);
            v1_4.append(" nesting=");
            v1_4.append(p4.mBackStackNesting);
            android.util.Log.v("FragmentManager", v1_4.toString());
        }
        boolean v0_1 = p4.isInBackStack();
        if ((p4.mDetached) && (v0_1)) {
            return;
        } else {
            this.c.a.remove(p4);
            p4.mAdded = 0;
            if (androidx.fragment.app.b1.I(p4)) {
                this.D = 1;
            }
            p4.mRemoving = 1;
            this.Y(p4);
            return;
        }
    }

    public final void R(java.util.ArrayList p5, java.util.ArrayList p6)
    {
        if (!p5.isEmpty()) {
            if (p5.size() != p6.size()) {
                throw new IllegalStateException("Internal error with the back stack records");
            } else {
                int v0_1 = p5.size();
                int v1_0 = 0;
                int v2 = 0;
                while (v1_0 < v0_1) {
                    if (!((androidx.fragment.app.a) p5.get(v1_0)).p) {
                        if (v2 != v1_0) {
                            this.z(p5, p6, v2, v1_0);
                        }
                        v2 = (v1_0 + 1);
                        if (((Boolean) p6.get(v1_0)).booleanValue()) {
                            while ((v2 < v0_1) && ((((Boolean) p6.get(v2)).booleanValue()) && (!((androidx.fragment.app.a) p5.get(v2)).p))) {
                                v2++;
                            }
                        }
                        this.z(p5, p6, v1_0, v2);
                        v1_0 = (v2 - 1);
                    }
                    v1_0++;
                }
                if (v2 != v0_1) {
                    this.z(p5, p6, v2, v0_1);
                }
            }
        }
        return;
    }

    public final void S(android.os.Bundle p22)
    {
        int v2_10 = p22.keySet().iterator();
        while (v2_10.hasNext()) {
            String v3_5 = ((String) v2_10.next());
            if (v3_5.startsWith("result_")) {
                java.util.ArrayList v4_20 = p22.getBundle(v3_5);
                if (v4_20 != null) {
                    v4_20.setClassLoader(this.t.b.getClassLoader());
                    this.k.put(v3_5.substring(7), v4_20);
                }
            }
        }
        int v2_0 = new java.util.HashMap();
        String v3_1 = p22.keySet().iterator();
        while (v3_1.hasNext()) {
            java.util.ArrayList v4_16 = ((String) v3_1.next());
            if (v4_16.startsWith("fragment_")) {
                java.io.PrintWriter v5_10 = p22.getBundle(v4_16);
                if (v5_10 != null) {
                    v5_10.setClassLoader(this.t.b.getClassLoader());
                    v2_0.put(v4_16.substring(9), v5_10);
                }
            }
        }
        String v3_2 = this.c;
        java.util.ArrayList v4_13 = v3_2.c;
        java.io.PrintWriter v5_6 = v3_2.b;
        v4_13.clear();
        v4_13.putAll(v2_0);
        java.util.ArrayList v1_4 = ((androidx.fragment.app.d1) p22.getParcelable("state"));
        if (v1_4 != null) {
            v5_6.clear();
            java.util.ArrayList v4_14 = v1_4.a;
            String v6_6 = v4_14.size();
            androidx.fragment.app.e0 v8_16 = 0;
            do {
                int[] v9_6 = this.l;
                if (v8_16 >= v6_6) {
                    int v2_6 = this.L;
                    v2_6.getClass();
                    java.util.ArrayList v4_22 = new java.util.ArrayList(v2_6.b.values());
                    int v2_9 = v4_22.size();
                    String v6_5 = 0;
                    while (v6_5 < v2_9) {
                        int v12_4 = v4_22.get(v6_5);
                        v6_5++;
                        int v12_5 = ((androidx.fragment.app.e0) v12_4);
                        if (v5_6.get(v12_5.mWho) == null) {
                            if (androidx.fragment.app.b1.H(2)) {
                                androidx.fragment.app.l1 v14_8 = new StringBuilder("Discarding retained Fragment ");
                                v14_8.append(v12_5);
                                v14_8.append(" that was not found in the set of active Fragments ");
                                v14_8.append(v1_4.a);
                                android.util.Log.v("FragmentManager", v14_8.toString());
                            }
                            this.L.g(v12_5);
                            v12_5.mFragmentManager = this;
                            androidx.fragment.app.l1 v14_12 = new androidx.fragment.app.j1(v9_6, v3_2, v12_5);
                            v14_12.e = 1;
                            v14_12.k();
                            v12_5.mRemoving = 1;
                            v14_12.k();
                        }
                    }
                    int v2_11 = v1_4.b;
                    v3_2.a.clear();
                    if (v2_11 != 0) {
                        java.util.ArrayList v4_24 = v2_11.size();
                        java.io.PrintWriter v5_7 = 0;
                        while (v5_7 < v4_24) {
                            String v6_2 = v2_11.get(v5_7);
                            v5_7++;
                            String v6_3 = ((String) v6_2);
                            int[] v9_2 = v3_2.b(v6_3);
                            if (v9_2 == null) {
                                throw new IllegalStateException(v1.a.l("No instantiated fragment for (", v6_3, ")"));
                            } else {
                                if (androidx.fragment.app.b1.H(2)) {
                                    int v12_3 = new StringBuilder("restoreSaveState: added (");
                                    v12_3.append(v6_3);
                                    v12_3.append("): ");
                                    v12_3.append(v9_2);
                                    android.util.Log.v("FragmentManager", v12_3.toString());
                                }
                                v3_2.a(v9_2);
                            }
                        }
                    }
                    androidx.fragment.app.e0 v8_18;
                    if (v1_4.c == null) {
                        v8_18 = 0;
                        this.d = 0;
                    } else {
                        this.d = new java.util.ArrayList(v1_4.c.length);
                        int v2_1 = 0;
                        while(true) {
                            java.util.ArrayList v4_27 = v1_4.c;
                            if (v2_1 >= v4_27.length) {
                                break;
                            }
                            java.util.ArrayList v4_1 = v4_27[v2_1];
                            java.io.PrintWriter v5_1 = v4_1.b;
                            String v6_1 = new androidx.fragment.app.a(this);
                            int[] v9_0 = v4_1.a;
                            int v10_0 = 0;
                            int v12_0 = 0;
                            while (v10_0 < v9_0.length) {
                                androidx.fragment.app.l1 v14_2 = new androidx.fragment.app.l1();
                                int v15_0 = (v10_0 + 1);
                                v14_2.a = v9_0[v10_0];
                                if (androidx.fragment.app.b1.H(2)) {
                                    androidx.fragment.app.e0 v7_19 = new StringBuilder("Instantiate ");
                                    v7_19.append(v6_1);
                                    v7_19.append(" op #");
                                    v7_19.append(v12_0);
                                    v7_19.append(" base fragment #");
                                    v7_19.append(v9_0[v15_0]);
                                    android.util.Log.v("FragmentManager", v7_19.toString());
                                }
                                androidx.fragment.app.e0 v8_13;
                                v14_2.h = androidx.lifecycle.o.values()[v4_1.c[v12_0]];
                                v14_2.i = androidx.lifecycle.o.values()[v4_1.d[v12_0]];
                                androidx.fragment.app.e0 v7_25 = (v10_0 + 2);
                                if (v9_0[v15_0] == 0) {
                                    v8_13 = 0;
                                } else {
                                    v8_13 = 1;
                                }
                                v14_2.c = v8_13;
                                androidx.fragment.app.e0 v8_14 = (v10_0 + 3);
                                androidx.fragment.app.e0 v7_26 = v9_0[v7_25];
                                v14_2.d = v7_26;
                                int v15_1 = (v10_0 + 4);
                                androidx.fragment.app.e0 v8_15 = v9_0[v8_14];
                                v14_2.e = v8_15;
                                int v18_0 = (v10_0 + 5);
                                int v15_2 = v9_0[v15_1];
                                v14_2.f = v15_2;
                                v10_0 += 6;
                                int[] v19_0 = v9_0;
                                int[] v9_1 = v19_0[v18_0];
                                v14_2.g = v9_1;
                                v6_1.b = v7_26;
                                v6_1.c = v8_15;
                                v6_1.d = v15_2;
                                v6_1.e = v9_1;
                                v6_1.b(v14_2);
                                v12_0++;
                                v9_0 = v19_0;
                            }
                            v6_1.f = v4_1.e;
                            v6_1.i = v4_1.f;
                            v6_1.g = 1;
                            v6_1.j = v4_1.n;
                            v6_1.k = v4_1.o;
                            v6_1.l = v4_1.p;
                            v6_1.m = v4_1.q;
                            v6_1.n = v4_1.r;
                            v6_1.o = v4_1.s;
                            v6_1.p = v4_1.t;
                            v6_1.s = v4_1.m;
                            java.util.ArrayList v4_3 = 0;
                            while (v4_3 < v5_1.size()) {
                                androidx.fragment.app.e0 v7_14 = ((String) v5_1.get(v4_3));
                                if (v7_14 != null) {
                                    ((androidx.fragment.app.l1) v6_1.a.get(v4_3)).b = v3_2.b(v7_14);
                                }
                                v4_3++;
                            }
                            v6_1.d(1);
                            if (androidx.fragment.app.b1.H(2)) {
                                java.util.ArrayList v4_6 = v1.a.p("restoreAllState: back stack #", v2_1, " (index ");
                                v4_6.append(v6_1.s);
                                v4_6.append("): ");
                                v4_6.append(v6_1);
                                android.util.Log.v("FragmentManager", v4_6.toString());
                                java.io.PrintWriter v5_5 = new java.io.PrintWriter(new androidx.fragment.app.w1());
                                v6_1.g("  ", v5_5, 0);
                                v5_5.close();
                            }
                            this.d.add(v6_1);
                            v2_1++;
                        }
                        v8_18 = 0;
                    }
                    this.i.set(v1_4.d);
                    int v2_16 = v1_4.e;
                    if (v2_16 != 0) {
                        int v2_17 = v3_2.b(v2_16);
                        this.w = v2_17;
                        this.q(v2_17);
                    }
                    int v2_18 = v1_4.f;
                    if (v2_18 != 0) {
                        androidx.fragment.app.e0 v7_0 = v8_18;
                        while (v7_0 < v2_18.size()) {
                            this.j.put(((String) v2_18.get(v7_0)), ((androidx.fragment.app.c) this));
                            v7_0++;
                        }
                    }
                    this.C = new java.util.ArrayDeque(v1_4.n);
                    return;
                } else {
                    androidx.fragment.app.l1 v14_13 = v4_14.get(v8_16);
                    v8_16++;
                    int v10_1 = v3_2.i(0, ((String) v14_13));
                }
            } while(v10_1 == 0);
            String v22_1;
            int v12_7;
            int[] v9_7;
            androidx.fragment.app.l1 v14_19 = ((androidx.fragment.app.e0) this.L.b.get(((androidx.fragment.app.h1) v10_1.getParcelable("state")).b));
            if (v14_19 == null) {
                v22_1 = 2;
                android.os.Bundle v20 = v10_1;
                v9_7 = v20;
                v12_7 = new androidx.fragment.app.j1(this.l, this.c, this.t.b.getClassLoader(), this.E(), v20);
            } else {
                if (!androidx.fragment.app.b1.H(2)) {
                    v22_1 = 2;
                } else {
                    v22_1 = 2;
                    int v15_12 = new StringBuilder("restoreSaveState: re-attaching retained ");
                    v15_12.append(v14_19);
                    android.util.Log.v("FragmentManager", v15_12.toString());
                }
                v12_7 = new androidx.fragment.app.j1(v9_6, v3_2, v14_19, v10_1);
                v9_7 = v10_1;
            }
            int v10_3 = v12_7.c;
            v10_3.mSavedFragmentState = v9_7;
            v10_3.mFragmentManager = this;
            if (androidx.fragment.app.b1.H(v22_1)) {
                int[] v9_10 = new StringBuilder("restoreSaveState: active (");
                v9_10.append(v10_3.mWho);
                v9_10.append("): ");
                v9_10.append(v10_3);
                android.util.Log.v("FragmentManager", v9_10.toString());
            }
            v12_7.l(this.t.b.getClassLoader());
            v3_2.g(v12_7);
            v12_7.e = this.s;
        } else {
            return;
        }
    }

    public final android.os.Bundle T()
    {
        Throwable v0_1 = new android.os.Bundle();
        this.C();
        String v1_7 = this.e().iterator();
        while (v1_7.hasNext()) {
            ((androidx.fragment.app.n) v1_7.next()).g();
        }
        this.x(1);
        this.E = 1;
        this.L.g = 1;
        String v1_1 = this.c;
        v1_1.getClass();
        android.os.Bundle v3_10 = v1_1.b;
        java.util.Iterator v2_18 = new java.util.ArrayList(v3_10.size());
        android.os.Bundle v3_12 = v3_10.values().iterator();
        while (v3_12.hasNext()) {
            String v4_6 = ((androidx.fragment.app.j1) v3_12.next());
            if (v4_6 != null) {
                java.util.ArrayList v6_0 = v4_6.c;
                v1_1.i(v4_6.n(), v6_0.mWho);
                v2_18.add(v6_0.mWho);
                if (androidx.fragment.app.b1.H(2)) {
                    java.util.Map v5_2 = new StringBuilder("Saved state of ");
                    v5_2.append(v6_0);
                    v5_2.append(": ");
                    v5_2.append(v6_0.mSavedFragmentState);
                    android.util.Log.v("FragmentManager", v5_2.toString());
                }
            }
        }
        String v1_5 = this.c.c;
        if (!v1_5.isEmpty()) {
            android.os.Bundle v3_14 = this.c;
            java.util.ArrayList v6_5;
            int v7_0 = 0;
            if (!v3_14.a.isEmpty()) {
                v6_5 = new java.util.ArrayList(v3_14.a.size());
                android.os.Bundle v3_15 = v3_14.a;
                String v9_6 = v3_15.size();
                String v10_6 = 0;
                while (v10_6 < v9_6) {
                    Object v11_3 = v3_15.get(v10_6);
                    v10_6++;
                    Object v11_4 = ((androidx.fragment.app.e0) v11_3);
                    v6_5.add(v11_4.mWho);
                    if (androidx.fragment.app.b1.H(2)) {
                        StringBuilder v13_1 = new StringBuilder();
                        v13_1.append("saveAllState: adding fragment (");
                        v13_1.append(v11_4.mWho);
                        v13_1.append("): ");
                        v13_1.append(v11_4);
                        android.util.Log.v("FragmentManager", v13_1.toString());
                    }
                }
            } else {
                v6_5 = 0;
            }
            String v4_13;
            android.os.Bundle v3_16 = this.d;
            if (v3_16 == null) {
                v4_13 = 0;
            } else {
                android.os.Bundle v3_17 = v3_16.size();
                if (v3_17 <= null) {
                } else {
                    v4_13 = new androidx.fragment.app.b[v3_17];
                    while (v7_0 < v3_17) {
                        v4_13[v7_0] = new androidx.fragment.app.b(((androidx.fragment.app.a) this.d.get(v7_0)));
                        if (androidx.fragment.app.b1.H(2)) {
                            String v10_4 = v1.a.p("saveAllState: adding back stack #", v7_0, ": ");
                            v10_4.append(this.d.get(v7_0));
                            android.util.Log.v("FragmentManager", v10_4.toString());
                        }
                        v7_0++;
                    }
                }
            }
            android.os.Bundle v3_19 = new androidx.fragment.app.d1();
            v3_19.e = 0;
            java.util.Map v5_6 = new java.util.ArrayList();
            v3_19.f = v5_6;
            int v7_5 = new java.util.ArrayList();
            v3_19.m = v7_5;
            v3_19.a = v2_18;
            v3_19.b = v6_5;
            v3_19.c = v4_13;
            v3_19.d = this.i.get();
            java.util.Iterator v2_1 = this.w;
            if (v2_1 != null) {
                v3_19.e = v2_1.mWho;
            }
            v5_6.addAll(this.j.keySet());
            v7_5.addAll(this.j.values());
            v3_19.n = new java.util.ArrayList(this.C);
            v0_1.putParcelable("state", v3_19);
            java.util.Iterator v2_12 = this.k.keySet().iterator();
            while (v2_12.hasNext()) {
                android.os.Bundle v3_7 = ((String) v2_12.next());
                v0_1.putBundle(g2.g.l("result_", v3_7), ((android.os.Bundle) this.k.get(v3_7)));
            }
            java.util.Iterator v2_15 = v1_5.keySet().iterator();
            while (v2_15.hasNext()) {
                android.os.Bundle v3_3 = ((String) v2_15.next());
                v0_1.putBundle(g2.g.l("fragment_", v3_3), ((android.os.Bundle) v1_5.get(v3_3)));
            }
        } else {
            if (androidx.fragment.app.b1.H(2)) {
                android.util.Log.v("FragmentManager", "saveAllState: no fragments!");
                return v0_1;
            }
        }
        return v0_1;
    }

    public final void U()
    {
        if (this.a.size() == 1) {
            this.t.c.removeCallbacks(this.M);
            this.t.c.post(this.M);
            this.b0();
        }
        return;
    }

    public final void V(androidx.fragment.app.e0 p2, boolean p3)
    {
        androidx.fragment.app.FragmentContainerView v2_1 = this.D(p2);
        if ((v2_1 != null) && ((v2_1 instanceof androidx.fragment.app.FragmentContainerView))) {
            ((androidx.fragment.app.FragmentContainerView) v2_1).setDrawDisappearingViewsLast((p3 ^ 1));
        }
        return;
    }

    public final void W(androidx.fragment.app.e0 p3, androidx.lifecycle.o p4)
    {
        if ((!p3.equals(this.c.b(p3.mWho))) || ((p3.mHost != null) && (p3.mFragmentManager != this))) {
            androidx.fragment.app.b1 v0_2 = new StringBuilder("Fragment ");
            v0_2.append(p3);
            v0_2.append(" is not an active fragment of FragmentManager ");
            v0_2.append(this);
            throw new IllegalArgumentException(v0_2.toString());
        } else {
            p3.mMaxState = p4;
            return;
        }
    }

    public final void X(androidx.fragment.app.e0 p4)
    {
        if ((p4 != null) && ((!p4.equals(this.c.b(p4.mWho))) || ((p4.mHost != null) && (p4.mFragmentManager != this)))) {
            StringBuilder v1_1 = new StringBuilder("Fragment ");
            v1_1.append(p4);
            v1_1.append(" is not an active fragment of FragmentManager ");
            v1_1.append(this);
            throw new IllegalArgumentException(v1_1.toString());
        } else {
            androidx.fragment.app.b1 v0_4 = this.w;
            this.w = p4;
            this.q(v0_4);
            this.q(this.w);
            return;
        }
    }

    public final void Y(androidx.fragment.app.e0 p4)
    {
        androidx.fragment.app.e0 v0_0 = this.D(p4);
        if ((v0_0 != null) && ((p4.getPopExitAnim() + (p4.getPopEnterAnim() + (p4.getExitAnim() + p4.getEnterAnim()))) > 0)) {
            if (v0_0.getTag(2131362602) == null) {
                v0_0.setTag(2131362602, p4);
            }
            ((androidx.fragment.app.e0) v0_0.getTag(2131362602)).setPopDirection(p4.getPopDirection());
        }
        return;
    }

    public final androidx.fragment.app.j1 a(androidx.fragment.app.e0 p4)
    {
        androidx.fragment.app.j1 v0_0 = p4.mPreviousWho;
        if (v0_0 != null) {
            k1.c.c(p4, v0_0);
        }
        if (androidx.fragment.app.b1.H(2)) {
            androidx.fragment.app.j1 v0_6 = new StringBuilder("add: ");
            v0_6.append(p4);
            android.util.Log.v("FragmentManager", v0_6.toString());
        }
        androidx.fragment.app.j1 v0_2 = this.f(p4);
        p4.mFragmentManager = this;
        int v1_1 = this.c;
        v1_1.g(v0_2);
        if (!p4.mDetached) {
            v1_1.a(p4);
            p4.mRemoving = 0;
            if (p4.mView == null) {
                p4.mHiddenChanged = 0;
            }
            if (androidx.fragment.app.b1.I(p4)) {
                this.D = 1;
            }
        }
        return v0_2;
    }

    public final void a0(IllegalStateException p8)
    {
        android.util.Log.e("FragmentManager", p8.getMessage());
        android.util.Log.e("FragmentManager", "Activity state:");
        java.io.PrintWriter v2_1 = new java.io.PrintWriter(new androidx.fragment.app.w1());
        Exception v0_1 = this.t;
        if (v0_1 == null) {
            try {
                Exception v0_2 = new String[0];
                this.u("  ", 0, v2_1, v0_2);
            } catch (Exception v0_3) {
                android.util.Log.e("FragmentManager", "Failed dumping state", v0_3);
            }
        } else {
            try {
                String[] v4_1 = new String[0];
                ((androidx.fragment.app.i0) v0_1).e.dump("  ", 0, v2_1, v4_1);
            } catch (Exception v0_6) {
                android.util.Log.e("FragmentManager", "Failed dumping state", v0_6);
            }
        }
        throw p8;
    }

    public final void b(androidx.fragment.app.o0 p5, androidx.fragment.app.m0 p6, androidx.fragment.app.e0 p7)
    {
        if (this.t != null) {
            throw new IllegalStateException("Already attached");
        } else {
            this.t = p5;
            this.u = p6;
            this.v = p7;
            androidx.fragment.app.u0 v6_24 = this.m;
            if (p7 == null) {
                if ((p5 instanceof androidx.fragment.app.g1)) {
                    v6_24.add(((androidx.fragment.app.g1) p5));
                }
            } else {
                v6_24.add(new androidx.fragment.app.w0(p7));
            }
            if (this.v != null) {
                this.b0();
            }
            if ((p5 instanceof c.w)) {
                androidx.fragment.app.u0 v6_17 = ((c.w) p5);
                androidx.fragment.app.x0 v0_17 = ((c.w) p5).getOnBackPressedDispatcher();
                this.g = v0_17;
                if (p7 != null) {
                    v6_17 = p7;
                }
                v0_17.a(this.h, v6_17);
            }
            androidx.fragment.app.u0 v6_19 = 0;
            if (p7 == null) {
                if (!(p5 instanceof androidx.lifecycle.b1)) {
                    this.L = new androidx.fragment.app.f1(0);
                } else {
                    this.L = ((androidx.fragment.app.f1) new androidx.lifecycle.z0(((androidx.lifecycle.b1) p5).getViewModelStore(), androidx.fragment.app.f1.h).a(androidx.fragment.app.f1));
                }
            } else {
                q0.l v5_22 = p7.mFragmentManager.L;
                androidx.fragment.app.x0 v0_21 = v5_22.c;
                androidx.fragment.app.s0 v1_12 = ((androidx.fragment.app.f1) v0_21.get(p7.mWho));
                if (v1_12 == null) {
                    v1_12 = new androidx.fragment.app.f1(v5_22.e);
                    v0_21.put(p7.mWho, v1_12);
                }
                this.L = v1_12;
            }
            q0.l v5_25 = this.L;
            if ((this.E) || (this.F)) {
                v6_19 = 1;
            }
            v5_25.g = v6_19;
            this.c.d = v5_25;
            q0.l v5_26 = this.t;
            if (((v5_26 instanceof b2.g)) && (p7 == null)) {
                q0.l v5_28 = ((b2.g) v5_26).getSavedStateRegistry();
                v5_28.c("android:support:fragments", new androidx.fragment.app.f0(this, 1));
                q0.l v5_29 = v5_28.a("android:support:fragments");
                if (v5_29 != null) {
                    this.S(v5_29);
                }
            }
            q0.l v5_30 = this.t;
            if ((v5_30 instanceof e.j)) {
                androidx.fragment.app.u0 v6_1;
                q0.l v5_32 = ((e.j) v5_30).getActivityResultRegistry();
                if (p7 == null) {
                    v6_1 = "";
                } else {
                    v6_1 = v1.a.n(new StringBuilder(), p7.mWho, ":");
                }
                androidx.fragment.app.u0 v6_2 = g2.g.l("FragmentManager:", v6_1);
                this.z = v5_32.d(g2.g.d(v6_2, "StartActivityForResult"), new androidx.fragment.app.x0(3), new androidx.fragment.app.s0(this, 1));
                this.A = v5_32.d(g2.g.d(v6_2, "StartIntentSenderForResult"), new androidx.fragment.app.x0(0), new androidx.fragment.app.s0(this, 2));
                this.B = v5_32.d(g2.g.d(v6_2, "RequestPermissions"), new androidx.fragment.app.x0(1), new androidx.fragment.app.s0(this, 0));
            }
            q0.l v5_2 = this.t;
            if ((v5_2 instanceof e0.d)) {
                ((e0.d) v5_2).addOnConfigurationChangedListener(this.n);
            }
            q0.l v5_4 = this.t;
            if ((v5_4 instanceof e0.e)) {
                ((e0.e) v5_4).addOnTrimMemoryListener(this.o);
            }
            q0.l v5_6 = this.t;
            if ((v5_6 instanceof d0.y)) {
                ((d0.y) v5_6).addOnMultiWindowModeChangedListener(this.p);
            }
            q0.l v5_8 = this.t;
            if ((v5_8 instanceof d0.z)) {
                ((d0.z) v5_8).addOnPictureInPictureModeChangedListener(this.q);
            }
            q0.l v5_10 = this.t;
            if (((v5_10 instanceof q0.l)) && (p7 == null)) {
                ((q0.l) v5_10).addMenuProvider(this.r);
            }
            return;
        }
    }

    public final void b0()
    {
        int v2 = 1;
        if (this.a.isEmpty()) {
            boolean v1_1;
            androidx.fragment.app.t0 v0 = this.h;
            boolean v1_7 = this.d;
            if (!v1_7) {
                v1_1 = 0;
            } else {
                v1_1 = v1_7.size();
            }
            if ((v1_1) || (!androidx.fragment.app.b1.K(this.v))) {
                v2 = 0;
            }
            v0.a(v2);
            return;
        } else {
            this.h.a(1);
            return;
        }
    }

    public final void c(androidx.fragment.app.e0 p5)
    {
        if (androidx.fragment.app.b1.H(2)) {
            String v1_8 = new StringBuilder("attach: ");
            v1_8.append(p5);
            android.util.Log.v("FragmentManager", v1_8.toString());
        }
        if (p5.mDetached) {
            p5.mDetached = 0;
            if (!p5.mAdded) {
                this.c.a(p5);
                if (androidx.fragment.app.b1.H(2)) {
                    String v0_3 = new StringBuilder("add from attach: ");
                    v0_3.append(p5);
                    android.util.Log.v("FragmentManager", v0_3.toString());
                }
                if (androidx.fragment.app.b1.I(p5)) {
                    this.D = 1;
                }
            }
        }
        return;
    }

    public final void d()
    {
        this.b = 0;
        this.J.clear();
        this.I.clear();
        return;
    }

    public final java.util.HashSet e()
    {
        java.util.HashSet v0_1 = new java.util.HashSet();
        java.util.ArrayList v1_1 = this.c.d();
        int v2 = v1_1.size();
        int v3 = 0;
        while (v3 < v2) {
            android.view.ViewGroup v4_0 = v1_1.get(v3);
            v3++;
            android.view.ViewGroup v4_3 = ((androidx.fragment.app.j1) v4_0).c.mContainer;
            if (v4_3 != null) {
                androidx.fragment.app.n v6_3;
                kotlin.jvm.internal.j.e(this.F(), "factory");
                androidx.fragment.app.n v6_1 = v4_3.getTag(2131362430);
                if (!(v6_1 instanceof androidx.fragment.app.n)) {
                    v6_3 = new androidx.fragment.app.n(v4_3);
                    v4_3.setTag(2131362430, v6_3);
                } else {
                    v6_3 = ((androidx.fragment.app.n) v6_1);
                }
                v0_1.add(v6_3);
            }
        }
        return v0_1;
    }

    public final androidx.fragment.app.j1 f(androidx.fragment.app.e0 p4)
    {
        androidx.fragment.app.k1 v1 = this.c;
        androidx.fragment.app.j1 v0_2 = ((androidx.fragment.app.j1) v1.b.get(p4.mWho));
        if (v0_2 == null) {
            androidx.fragment.app.j1 v0_4 = new androidx.fragment.app.j1(this.l, v1, p4);
            v0_4.l(this.t.b.getClassLoader());
            v0_4.e = this.s;
            return v0_4;
        } else {
            return v0_2;
        }
    }

    public final void g(androidx.fragment.app.e0 p5)
    {
        if (androidx.fragment.app.b1.H(2)) {
            int v2_5 = new StringBuilder("detach: ");
            v2_5.append(p5);
            android.util.Log.v("FragmentManager", v2_5.toString());
        }
        if (!p5.mDetached) {
            p5.mDetached = 1;
            if (p5.mAdded) {
                if (androidx.fragment.app.b1.H(2)) {
                    java.util.ArrayList v1_3 = new StringBuilder("remove from detach: ");
                    v1_3.append(p5);
                    android.util.Log.v("FragmentManager", v1_3.toString());
                }
                this.c.a.remove(p5);
                p5.mAdded = 0;
                if (androidx.fragment.app.b1.I(p5)) {
                    this.D = 1;
                }
                this.Y(p5);
                return;
            }
        }
        return;
    }

    public final void h(boolean p4, android.content.res.Configuration p5)
    {
        if ((p4 != 0) && ((this.t instanceof e0.d))) {
            this.a0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw 0;
        } else {
            java.util.Iterator v0_3 = this.c.f().iterator();
            while (v0_3.hasNext()) {
                androidx.fragment.app.b1 v1_2 = ((androidx.fragment.app.e0) v0_3.next());
                if (v1_2 != null) {
                    v1_2.performConfigurationChanged(p5);
                    if (p4 != 0) {
                        v1_2.mChildFragmentManager.h(1, p5);
                    }
                }
            }
            return;
        }
    }

    public final boolean i(android.view.MenuItem p5)
    {
        if (this.s >= 1) {
            java.util.Iterator v0_3 = this.c.f().iterator();
            while (v0_3.hasNext()) {
                boolean v3_2 = ((androidx.fragment.app.e0) v0_3.next());
                if ((v3_2) && (v3_2.performContextItemSelected(p5))) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public final boolean j(android.view.Menu p8, android.view.MenuInflater p9)
    {
        int v1 = 0;
        if (this.s >= 1) {
            java.util.Iterator v0_3 = this.c.f().iterator();
            java.util.ArrayList v3_1 = 0;
            int v4 = 0;
            while (v0_3.hasNext()) {
                androidx.fragment.app.e0 v5_2 = ((androidx.fragment.app.e0) v0_3.next());
                if ((v5_2 != null) && ((v5_2.isMenuVisible()) && (v5_2.performCreateOptionsMenu(p8, p9)))) {
                    if (v3_1 == null) {
                        v3_1 = new java.util.ArrayList();
                    }
                    v3_1.add(v5_2);
                    v4 = 1;
                }
            }
            if (this.e != null) {
                while (v1 < this.e.size()) {
                    androidx.fragment.app.e0 v8_6 = ((androidx.fragment.app.e0) this.e.get(v1));
                    if ((v3_1 == null) || (!v3_1.contains(v8_6))) {
                        v8_6.onDestroyOptionsMenu();
                    }
                    v1++;
                }
            }
            this.e = v3_1;
            return v4;
        } else {
            return 0;
        }
    }

    public final void k()
    {
        this.G = 1;
        this.x(1);
        q0.l v1_19 = this.e().iterator();
        while (v1_19.hasNext()) {
            ((androidx.fragment.app.n) v1_19.next()).g();
        }
        q0.l v1_2;
        q0.l v1_0 = this.t;
        c.r v3_0 = this.c;
        if (!(v1_0 instanceof androidx.lifecycle.b1)) {
            q0.l v1_1 = v1_0.b;
            if (v1_1 == null) {
                v1_2 = 1;
            } else {
                v1_2 = (v1_1.isChangingConfigurations() ^ 1);
            }
        } else {
            v1_2 = v3_0.d.f;
        }
        int v2_3 = 0;
        if (v1_2 != null) {
            q0.l v1_7 = this.j.values().iterator();
            while (v1_7.hasNext()) {
                java.util.ArrayList v4_2 = ((androidx.fragment.app.c) v1_7.next()).a;
                java.util.Iterator v5_0 = v4_2.size();
                Thread v6_7 = 0;
                while (v6_7 < v5_0) {
                    boolean v7_7 = v4_2.get(v6_7);
                    v6_7++;
                    v3_0.d.e(((String) v7_7), 0);
                }
            }
        }
        this.t(-1);
        q0.l v1_9 = this.t;
        if ((v1_9 instanceof e0.e)) {
            ((e0.e) v1_9).removeOnTrimMemoryListener(this.o);
        }
        q0.l v1_12 = this.t;
        if ((v1_12 instanceof e0.d)) {
            ((e0.d) v1_12).removeOnConfigurationChangedListener(this.n);
        }
        q0.l v1_14 = this.t;
        if ((v1_14 instanceof d0.y)) {
            ((d0.y) v1_14).removeOnMultiWindowModeChangedListener(this.p);
        }
        q0.l v1_16 = this.t;
        if ((v1_16 instanceof d0.z)) {
            ((d0.z) v1_16).removeOnPictureInPictureModeChangedListener(this.q);
        }
        q0.l v1_18 = this.t;
        if (((v1_18 instanceof q0.l)) && (this.v == null)) {
            ((q0.l) v1_18).removeMenuProvider(this.r);
        }
        this.t = 0;
        this.u = 0;
        this.v = 0;
        if (this.g != null) {
            c.r v3_13 = this.h;
            java.util.ArrayList v4_4 = v3_13.a;
            c.r v3_14 = v3_13.c;
            java.util.Iterator v5_1 = v3_14.iterator();
            kotlin.jvm.internal.j.d(v5_1, "iterator(...)");
            while (v5_1.hasNext()) {
                Thread v6_1 = ((AutoCloseable) v5_1.next());
                if (!(v6_1 instanceof AutoCloseable)) {
                    if (!(v6_1 instanceof java.util.concurrent.ExecutorService)) {
                        if (!(v6_1 instanceof android.content.res.TypedArray)) {
                            if (!(v6_1 instanceof android.media.MediaMetadataRetriever)) {
                                if (!(v6_1 instanceof android.media.MediaDrm)) {
                                    throw new IllegalArgumentException();
                                } else {
                                    ((android.media.MediaDrm) v6_1).release();
                                }
                            } else {
                                ((android.media.MediaMetadataRetriever) v6_1).release();
                            }
                        } else {
                            ((android.content.res.TypedArray) v6_1).recycle();
                        }
                    } else {
                        Thread v6_5 = ((java.util.concurrent.ExecutorService) v6_1);
                        if (v6_5 != java.util.concurrent.ForkJoinPool.commonPool()) {
                            boolean v7_6 = v6_5.isTerminated();
                            if (!v7_6) {
                                v6_5.shutdown();
                                IllegalArgumentException v8_0 = 0;
                                while (!v7_6) {
                                    try {
                                        v7_6 = v6_5.awaitTermination(1, java.util.concurrent.TimeUnit.DAYS);
                                    } catch (InterruptedException) {
                                        if (v8_0 == null) {
                                            v6_5.shutdownNow();
                                            v8_0 = 1;
                                        }
                                    }
                                }
                                if (v8_0 != null) {
                                    Thread.currentThread().interrupt();
                                }
                            }
                        }
                    }
                } else {
                    v6_1.close();
                }
            }
            v3_14.clear();
            IllegalArgumentException v0_3 = v4_4.size();
            while (v2_3 < v0_3) {
                c.r v3_15 = v4_4.get(v2_3);
                v2_3++;
                ((c.r) v3_15).a();
            }
            v4_4.clear();
            this.g = 0;
        }
        IllegalArgumentException v0_4 = this.z;
        if (v0_4 != null) {
            v0_4.b();
            this.A.b();
            this.B.b();
        }
        return;
    }

    public final void l(boolean p4)
    {
        if ((p4 != 0) && ((this.t instanceof e0.e))) {
            this.a0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw 0;
        } else {
            String v0_3 = this.c.f().iterator();
            while (v0_3.hasNext()) {
                androidx.fragment.app.b1 v1_2 = ((androidx.fragment.app.e0) v0_3.next());
                if (v1_2 != null) {
                    v1_2.performLowMemory();
                    if (p4 != 0) {
                        v1_2.mChildFragmentManager.l(1);
                    }
                }
            }
            return;
        }
    }

    public final void m(boolean p4, boolean p5)
    {
        if ((p5 != null) && ((this.t instanceof d0.y))) {
            this.a0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw 0;
        } else {
            java.util.Iterator v0_3 = this.c.f().iterator();
            while (v0_3.hasNext()) {
                androidx.fragment.app.b1 v1_2 = ((androidx.fragment.app.e0) v0_3.next());
                if (v1_2 != null) {
                    v1_2.performMultiWindowModeChanged(p4);
                    if (p5 != null) {
                        v1_2.mChildFragmentManager.m(p4, 1);
                    }
                }
            }
            return;
        }
    }

    public final void n()
    {
        java.util.ArrayList v0_1 = this.c.e();
        int v1 = v0_1.size();
        int v2 = 0;
        while (v2 < v1) {
            androidx.fragment.app.b1 v3_2 = v0_1.get(v2);
            v2++;
            androidx.fragment.app.b1 v3_0 = ((androidx.fragment.app.e0) v3_2);
            if (v3_0 != null) {
                v3_0.onHiddenChanged(v3_0.isHidden());
                v3_0.mChildFragmentManager.n();
            }
        }
        return;
    }

    public final boolean o(android.view.MenuItem p5)
    {
        if (this.s >= 1) {
            java.util.Iterator v0_3 = this.c.f().iterator();
            while (v0_3.hasNext()) {
                boolean v3_2 = ((androidx.fragment.app.e0) v0_3.next());
                if ((v3_2) && (v3_2.performOptionsItemSelected(p5))) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public final void p(android.view.Menu p3)
    {
        if (this.s >= 1) {
            java.util.Iterator v0_3 = this.c.f().iterator();
            while (v0_3.hasNext()) {
                androidx.fragment.app.e0 v1_2 = ((androidx.fragment.app.e0) v0_3.next());
                if (v1_2 != null) {
                    v1_2.performOptionsMenuClosed(p3);
                }
            }
        }
        return;
    }

    public final void q(androidx.fragment.app.e0 p3)
    {
        if ((p3 != null) && (p3.equals(this.c.b(p3.mWho)))) {
            p3.performPrimaryNavigationFragmentChanged();
        }
        return;
    }

    public final void r(boolean p4, boolean p5)
    {
        if ((p5 != null) && ((this.t instanceof d0.z))) {
            this.a0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw 0;
        } else {
            java.util.Iterator v0_3 = this.c.f().iterator();
            while (v0_3.hasNext()) {
                androidx.fragment.app.b1 v1_2 = ((androidx.fragment.app.e0) v0_3.next());
                if (v1_2 != null) {
                    v1_2.performPictureInPictureModeChanged(p4);
                    if (p5 != null) {
                        v1_2.mChildFragmentManager.r(p4, 1);
                    }
                }
            }
            return;
        }
    }

    public final boolean s(android.view.Menu p6)
    {
        int v1 = 0;
        if (this.s >= 1) {
            java.util.Iterator v0_3 = this.c.f().iterator();
            while (v0_3.hasNext()) {
                boolean v3_2 = ((androidx.fragment.app.e0) v0_3.next());
                if ((v3_2) && ((v3_2.isMenuVisible()) && (v3_2.performPrepareOptionsMenu(p6)))) {
                    v1 = 1;
                }
            }
            return v1;
        } else {
            return 0;
        }
    }

    public final void t(int p5)
    {
        try {
            this.b = 1;
            androidx.fragment.app.n v2_6 = this.c.b.values().iterator();
        } catch (java.util.Iterator v5_3) {
            this.b = 0;
            throw v5_3;
        }
        while (v2_6.hasNext()) {
            androidx.fragment.app.j1 v3_2 = ((androidx.fragment.app.j1) v2_6.next());
            if (v3_2 != null) {
                v3_2.e = p5;
            }
        }
        this.L(p5, 0);
        java.util.Iterator v5_2 = this.e().iterator();
        while (v5_2.hasNext()) {
            ((androidx.fragment.app.n) v5_2.next()).g();
        }
        this.b = 0;
        this.x(1);
        return;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder(128);
        v0_1.append("FragmentManager{");
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        v0_1.append(" in ");
        String v1_2 = this.v;
        if (v1_2 == null) {
            String v1_3 = this.t;
            if (v1_3 == null) {
                v0_1.append("null");
            } else {
                v0_1.append(v1_3.getClass().getSimpleName());
                v0_1.append("{");
                v0_1.append(Integer.toHexString(System.identityHashCode(this.t)));
                v0_1.append("}");
            }
        } else {
            v0_1.append(v1_2.getClass().getSimpleName());
            v0_1.append("{");
            v0_1.append(Integer.toHexString(System.identityHashCode(this.v)));
            v0_1.append("}");
        }
        v0_1.append("}}");
        return v0_1.toString();
    }

    public final void u(String p6, java.io.FileDescriptor p7, java.io.PrintWriter p8, String[] p9)
    {
        int v0_1 = g2.g.d(p6, "    ");
        androidx.fragment.app.z0 v1_9 = this.c;
        String v2_9 = v1_9.a;
        int v3_10 = g2.g.d(p6, "    ");
        androidx.fragment.app.z0 v1_13 = v1_9.b;
        if (!v1_13.isEmpty()) {
            p8.print(p6);
            p8.println("Active Fragments:");
            androidx.fragment.app.z0 v1_7 = v1_13.values().iterator();
            while (v1_7.hasNext()) {
                String v4_5 = ((androidx.fragment.app.j1) v1_7.next());
                p8.print(p6);
                if (v4_5 == null) {
                    p8.println("null");
                } else {
                    String v4_7 = v4_5.c;
                    p8.println(v4_7);
                    v4_7.dump(v3_10, p7, p8, p9);
                }
            }
        }
        boolean v7_6 = v2_9.size();
        int v9_1 = 0;
        if (v7_6) {
            p8.print(p6);
            p8.println("Added Fragments:");
            androidx.fragment.app.z0 v1_6 = 0;
            while (v1_6 < v7_6) {
                int v3_7 = ((androidx.fragment.app.e0) v2_9.get(v1_6));
                p8.print(p6);
                p8.print("  #");
                p8.print(v1_6);
                p8.print(": ");
                p8.println(v3_7.toString());
                v1_6++;
            }
        }
        boolean v7_7 = this.e;
        if (v7_7) {
            boolean v7_8 = v7_7.size();
            if (v7_8) {
                p8.print(p6);
                p8.println("Fragments Created Menus:");
                androidx.fragment.app.z0 v1_4 = 0;
                while (v1_4 < v7_8) {
                    String v2_7 = ((androidx.fragment.app.e0) this.e.get(v1_4));
                    p8.print(p6);
                    p8.print("  #");
                    p8.print(v1_4);
                    p8.print(": ");
                    p8.println(v2_7.toString());
                    v1_4++;
                }
            }
        }
        boolean v7_9 = this.d;
        if (v7_9) {
            boolean v7_10 = v7_9.size();
            if (v7_10) {
                p8.print(p6);
                p8.println("Back Stack:");
                androidx.fragment.app.z0 v1_3 = 0;
                while (v1_3 < v7_10) {
                    String v2_4 = ((androidx.fragment.app.a) this.d.get(v1_3));
                    p8.print(p6);
                    p8.print("  #");
                    p8.print(v1_3);
                    p8.print(": ");
                    p8.println(v2_4.toString());
                    v2_4.g(v0_1, p8, 1);
                    v1_3++;
                }
            }
        }
        p8.print(p6);
        boolean v7_12 = new StringBuilder("Back Stack Index: ");
        v7_12.append(this.i.get());
        p8.println(v7_12.toString());
        int v0_6 = this.a.size();
        if (v0_6 > 0) {
            p8.print(p6);
            p8.println("Pending Actions:");
            while (v9_1 < v0_6) {
                androidx.fragment.app.z0 v1_2 = ((androidx.fragment.app.z0) this.a.get(v9_1));
                p8.print(p6);
                p8.print("  #");
                p8.print(v9_1);
                p8.print(": ");
                p8.println(v1_2);
                v9_1++;
            }
        }
        p8.print(p6);
        p8.println("FragmentManager misc state:");
        p8.print(p6);
        p8.print("  mHost=");
        p8.println(this.t);
        p8.print(p6);
        p8.print("  mContainer=");
        p8.println(this.u);
        if (this.v != null) {
            p8.print(p6);
            p8.print("  mParent=");
            p8.println(this.v);
        }
        p8.print(p6);
        p8.print("  mCurState=");
        p8.print(this.s);
        p8.print(" mStateSaved=");
        p8.print(this.E);
        p8.print(" mStopped=");
        p8.print(this.F);
        p8.print(" mDestroyed=");
        p8.println(this.G);
        if (this.D) {
            p8.print(p6);
            p8.print("  mNeedMenuInvalidate=");
            p8.println(this.D);
        }
        return;
    }

    public final void v(androidx.fragment.app.z0 p3, boolean p4)
    {
        if (p4 == null) {
            if (this.t != null) {
                if ((this.E) || (this.F)) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
            } else {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                } else {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
            }
        }
        if (this.t != null) {
            this.a.add(p3);
            this.U();
            return;
        } else {
            if (p4 == null) {
                throw new IllegalStateException("Activity has been destroyed");
            } else {
                return;
            }
        }
    }

    public final void w(boolean p3)
    {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else {
            if (this.t != null) {
                if (android.os.Looper.myLooper() != this.t.c.getLooper()) {
                    throw new IllegalStateException("Must be called from main thread of fragment host");
                } else {
                    if ((p3 == null) && ((this.E) || (this.F))) {
                        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                    } else {
                        if (this.I == null) {
                            this.I = new java.util.ArrayList();
                            this.J = new java.util.ArrayList();
                        }
                        return;
                    }
                }
            } else {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                } else {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
            }
        }
    }

    public final boolean x(boolean p9)
    {
        this.w(p9);
        android.os.Handler v0_2 = 0;
        do {
            java.util.Set v1_4 = this.I;
            java.util.ArrayList v2_1 = this.J;
            androidx.fragment.app.e0 v6_0;
            if (!this.a.isEmpty()) {
                try {
                    int v4_1 = this.a.size();
                    androidx.fragment.app.j1 v5_0 = 0;
                    v6_0 = 0;
                } catch (Throwable v9_2) {
                    this.a.clear();
                    this.t.c.removeCallbacks(this.M);
                    throw v9_2;
                }
                while (v5_0 < v4_1) {
                    v6_0 |= ((androidx.fragment.app.z0) this.a.get(v5_0)).a(v1_4, v2_1);
                    v5_0++;
                }
                this.a.clear();
                this.t.c.removeCallbacks(this.M);
            } else {
                v6_0 = 0;
            }
            if (v6_0 == null) {
                this.b0();
            } else {
                this.b = 1;
                try {
                    this.R(this.I, this.J);
                    this.d();
                    v0_2 = 1;
                } catch (Throwable v9_7) {
                    this.d();
                    throw v9_7;
                }
            }
        } while(!this.H);
        this.c.b.values().removeAll(java.util.Collections.singleton(0));
        return v0_2;
    }

    public final void y(androidx.fragment.app.a p8, boolean p9)
    {
        if ((p9 == null) || ((this.t != null) && (!this.G))) {
            this.w(p9);
            p8.a(this.I, this.J);
            this.b = 1;
            try {
                this.R(this.I, this.J);
                this.d();
                this.b0();
                androidx.fragment.app.k1 v0_2 = this.c;
            } catch (java.util.Collection v8_1) {
                this.d();
                throw v8_1;
            }
            if (this.H) {
                this.H = 0;
                java.util.ArrayList v1 = v0_2.d();
                int v2 = v1.size();
                int v3 = 0;
                while (v3 < v2) {
                    androidx.fragment.app.j1 v4_0 = v1.get(v3);
                    v3++;
                    androidx.fragment.app.j1 v4_1 = ((androidx.fragment.app.j1) v4_0);
                    androidx.fragment.app.e0 v5 = v4_1.c;
                    if (v5.mDeferStart) {
                        if (!this.b) {
                            v5.mDeferStart = 0;
                            v4_1.k();
                        } else {
                            this.H = 1;
                        }
                    }
                }
            }
            v0_2.b.values().removeAll(java.util.Collections.singleton(0));
            return;
        } else {
            return;
        }
    }

    public final void z(java.util.ArrayList p24, java.util.ArrayList p25, int p26, int p27)
    {
        int v5_12 = ((androidx.fragment.app.a) p24.get(p26)).p;
        androidx.fragment.app.a v6_23 = this.K;
        if (v6_23 != null) {
            v6_23.clear();
        } else {
            this.K = new java.util.ArrayList();
        }
        int v7_7 = this.c;
        this.K.addAll(v7_7.f());
        androidx.fragment.app.a v6_6 = this.w;
        int v9_10 = p26;
        androidx.fragment.app.n v10_10 = 0;
        while(true) {
            int v12_2 = 1;
            if (v9_10 >= p27) {
                break;
            }
            int v20_0;
            int v17_1;
            int v19_0;
            int v13_24 = ((androidx.fragment.app.a) p24.get(v9_10));
            if (((Boolean) p25.get(v9_10)).booleanValue()) {
                v17_1 = v5_12;
                v20_0 = v9_10;
                v19_0 = v10_10;
                int v5_7 = 1;
                int v3_7 = this.K;
                int v8_7 = v13_24.a;
                int v9_18 = (v8_7.size() - 1);
                while (v9_18 >= 0) {
                    androidx.fragment.app.n v10_27 = ((androidx.fragment.app.l1) v8_7.get(v9_18));
                    int v11_9 = v10_27.a;
                    if (v11_9 == v5_7) {
                        v3_7.remove(v10_27.b);
                    } else {
                        if (v11_9 != 3) {
                            switch (v11_9) {
                                case 6:
                                    break;
                                case 8:
                                    v6_6 = 0;
                                    break;
                                case 9:
                                    v6_6 = v10_27.b;
                                    break;
                                case 10:
                                    v10_27.i = v10_27.h;
                                    break;
                                default:
                            }
                            v9_18--;
                            v5_7 = 1;
                        }
                        v3_7.add(v10_27.b);
                    }
                }
            } else {
                int v14_17 = this.K;
                int v11_10 = v13_24.a;
                int v8_8 = 0;
                while (v8_8 < v11_10.size()) {
                    int v20_1;
                    int v17_2;
                    int v5_13;
                    int v19_1;
                    int v15_9 = ((androidx.fragment.app.l1) v11_10.get(v8_8));
                    int v3_11 = v15_9.a;
                    if (v3_11 == v12_2) {
                        v17_2 = v5_12;
                        v5_13 = v12_2;
                        v20_1 = v9_10;
                        v19_1 = v10_10;
                        v14_17.add(v15_9.b);
                    } else {
                        v17_2 = v5_12;
                        if (v3_11 == 2) {
                            int v3_13 = v15_9.b;
                            int v12_6 = v3_13.mContainerId;
                            int v5_15 = (v14_17.size() - 1);
                            int v18_2 = 0;
                            while (v5_15 >= 0) {
                                int v19_2;
                                int v21 = v5_15;
                                int v5_17 = ((androidx.fragment.app.e0) v14_17.get(v5_15));
                                int v20_3 = v9_10;
                                if (v5_17.mContainerId != v12_6) {
                                    v19_2 = v10_10;
                                } else {
                                    if (v5_17 != v3_13) {
                                        int v9_20;
                                        if (v5_17 != v6_6) {
                                            v19_2 = v10_10;
                                            v9_20 = 0;
                                        } else {
                                            v19_2 = v10_10;
                                            v9_20 = 0;
                                            v11_10.add(v8_8, new androidx.fragment.app.l1(v5_17, 9, 0));
                                            v8_8++;
                                            v6_6 = 0;
                                        }
                                        int v22 = v6_6;
                                        androidx.fragment.app.n v10_30 = new androidx.fragment.app.l1(v5_17, 3, v9_20);
                                        v10_30.d = v15_9.d;
                                        v10_30.f = v15_9.f;
                                        v10_30.e = v15_9.e;
                                        v10_30.g = v15_9.g;
                                        v11_10.add(v8_8, v10_30);
                                        v14_17.remove(v5_17);
                                        v8_8++;
                                        v6_6 = v22;
                                    } else {
                                        v19_2 = v10_10;
                                        v18_2 = 1;
                                    }
                                }
                                v5_15 = (v21 - 1);
                                v10_10 = v19_2;
                                v9_10 = v20_3;
                            }
                            v20_1 = v9_10;
                            v19_1 = v10_10;
                            v5_13 = 1;
                            if (v18_2 == 0) {
                                v15_9.a = 1;
                                v15_9.c = 1;
                                v14_17.add(v3_13);
                            } else {
                                v11_10.remove(v8_8);
                                v8_8--;
                            }
                        } else {
                            if ((v3_11 == 3) || (v3_11 == 6)) {
                                v14_17.remove(v15_9.b);
                                int v3_16 = v15_9.b;
                                if (v3_16 == v6_6) {
                                    v11_10.add(v8_8, new androidx.fragment.app.l1(v3_16, 9));
                                    v8_8++;
                                    v20_1 = v9_10;
                                    v19_1 = v10_10;
                                    v5_13 = 1;
                                    v6_6 = 0;
                                    v8_8 += v5_13;
                                    v12_2 = v5_13;
                                    v5_12 = v17_2;
                                    v10_10 = v19_1;
                                    v9_10 = v20_1;
                                }
                            } else {
                                if (v3_11 == 7) {
                                    v5_13 = 1;
                                } else {
                                    if (v3_11 == 8) {
                                        v11_10.add(v8_8, new androidx.fragment.app.l1(v6_6, 9, 0));
                                        v15_9.c = 1;
                                        v8_8++;
                                        v6_6 = v15_9.b;
                                    }
                                }
                            }
                            v20_1 = v9_10;
                            v19_1 = v10_10;
                            v5_13 = 1;
                        }
                    }
                }
                v17_1 = v5_12;
                v20_0 = v9_10;
                v19_0 = v10_10;
            }
            if ((v19_0 == 0) && (!v13_24.g)) {
                v10_10 = 0;
            } else {
                v10_10 = 1;
            }
            v9_10 = (v20_0 + 1);
            v5_12 = v17_1;
        }
        int v17_0 = v5_12;
        this.K.clear();
        if ((v17_0 == 0) && (this.s >= 1)) {
            int v3_5 = p26;
            while (v3_5 < p27) {
                int v5_5 = ((androidx.fragment.app.a) p24.get(v3_5)).a;
                androidx.fragment.app.a v6_7 = v5_5.size();
                int v8_6 = 0;
                while (v8_6 < v6_7) {
                    int v9_13 = v5_5.get(v8_6);
                    v8_6++;
                    int v9_15 = ((androidx.fragment.app.l1) v9_13).b;
                    if ((v9_15 != 0) && (v9_15.mFragmentManager != null)) {
                        v7_7.g(this.f(v9_15));
                    }
                }
                v3_5++;
            }
        }
        int v3_1 = p26;
        while (v3_1 < p27) {
            androidx.fragment.app.a v6_4 = ((androidx.fragment.app.a) p24.get(v3_1));
            if (!((Boolean) p25.get(v3_1)).booleanValue()) {
                v6_4.d(1);
                int v5_0 = v6_4.q;
                int v7_6 = v6_4.a;
                int v9_9 = v7_6.size();
                int v12_1 = 0;
                while (v12_1 < v9_9) {
                    androidx.fragment.app.n v10_2 = ((androidx.fragment.app.l1) v7_6.get(v12_1));
                    int v11_0 = v10_2.b;
                    if (v11_0 != 0) {
                        v11_0.mBeingSaved = 0;
                        v11_0.setPopDirection(0);
                        v11_0.setNextTransition(v6_4.f);
                        v11_0.setSharedElementNames(v6_4.n, v6_4.o);
                    }
                    switch (v10_2.a) {
                        case 1:
                            v11_0.setAnimations(v10_2.d, v10_2.e, v10_2.f, v10_2.g);
                            v5_0.V(v11_0, 0);
                            v5_0.a(v11_0);
                            break;
                        case 2:
                        default:
                            String v2_2 = new StringBuilder("Unknown cmd: ");
                            v2_2.append(v10_2.a);
                            throw new IllegalArgumentException(v2_2.toString());
                            break;
                        case 3:
                            v11_0.setAnimations(v10_2.d, v10_2.e, v10_2.f, v10_2.g);
                            v5_0.Q(v11_0);
                            break;
                        case 4:
                            v11_0.setAnimations(v10_2.d, v10_2.e, v10_2.f, v10_2.g);
                            v5_0.G(v11_0);
                            break;
                        case 5:
                            v11_0.setAnimations(v10_2.d, v10_2.e, v10_2.f, v10_2.g);
                            v5_0.V(v11_0, 0);
                            androidx.fragment.app.b1.Z(v11_0);
                            break;
                        case 6:
                            v11_0.setAnimations(v10_2.d, v10_2.e, v10_2.f, v10_2.g);
                            v5_0.g(v11_0);
                            break;
                        case 7:
                            v11_0.setAnimations(v10_2.d, v10_2.e, v10_2.f, v10_2.g);
                            v5_0.V(v11_0, 0);
                            v5_0.c(v11_0);
                            break;
                        case 8:
                            v5_0.X(v11_0);
                            break;
                        case 9:
                            v5_0.X(0);
                            break;
                        case 10:
                            v5_0.W(v11_0, v10_2.i);
                            break;
                    }
                    v12_1++;
                }
            } else {
                v6_4.d(-1);
                int v5_1 = v6_4.q;
                int v7_8 = v6_4.a;
                androidx.fragment.app.n v10_11 = 1;
                int v9_12 = (v7_8.size() - 1);
                while (v9_12 >= 0) {
                    int v11_2 = ((androidx.fragment.app.l1) v7_8.get(v9_12));
                    int v12_3 = v11_2.b;
                    if (v12_3 != 0) {
                        v12_3.mBeingSaved = 0;
                        v12_3.setPopDirection(v10_11);
                        androidx.fragment.app.n v10_12 = v6_4.f;
                        int v13_15 = 8194;
                        int v14_7 = 4097;
                        if (v10_12 != 4097) {
                            if (v10_12 != 8194) {
                                v13_15 = 4100;
                                v14_7 = 8197;
                                if (v10_12 == 8197) {
                                    v12_3.setNextTransition(v13_15);
                                    v12_3.setSharedElementNames(v6_4.o, v6_4.n);
                                    switch (v11_2.a) {
                                        case 1:
                                            v12_3.setAnimations(v11_2.d, v11_2.e, v11_2.f, v11_2.g);
                                            v10_11 = 1;
                                            v5_1.V(v12_3, 1);
                                            v5_1.Q(v12_3);
                                            break;
                                        case 2:
                                        default:
                                            String v2_5 = new StringBuilder("Unknown cmd: ");
                                            v2_5.append(v11_2.a);
                                            throw new IllegalArgumentException(v2_5.toString());
                                            break;
                                        case 3:
                                            v12_3.setAnimations(v11_2.d, v11_2.e, v11_2.f, v11_2.g);
                                            v5_1.a(v12_3);
                                            v10_11 = 1;
                                            break;
                                        case 4:
                                            v12_3.setAnimations(v11_2.d, v11_2.e, v11_2.f, v11_2.g);
                                            v5_1.getClass();
                                            androidx.fragment.app.b1.Z(v12_3);
                                            break;
                                        case 5:
                                            v12_3.setAnimations(v11_2.d, v11_2.e, v11_2.f, v11_2.g);
                                            v5_1.V(v12_3, 1);
                                            v5_1.G(v12_3);
                                            break;
                                        case 6:
                                            v12_3.setAnimations(v11_2.d, v11_2.e, v11_2.f, v11_2.g);
                                            v5_1.c(v12_3);
                                            break;
                                        case 7:
                                            v12_3.setAnimations(v11_2.d, v11_2.e, v11_2.f, v11_2.g);
                                            v5_1.V(v12_3, 1);
                                            v5_1.g(v12_3);
                                            break;
                                        case 8:
                                            v5_1.X(0);
                                            break;
                                        case 9:
                                            v5_1.X(v12_3);
                                            break;
                                        case 10:
                                            v5_1.W(v12_3, v11_2.h);
                                            break;
                                    }
                                    v9_12--;
                                } else {
                                    if (v10_12 == 4099) {
                                        v13_15 = 4099;
                                    } else {
                                        if (v10_12 != 4100) {
                                            v13_15 = 0;
                                        }
                                    }
                                }
                            }
                            v13_15 = v14_7;
                        }
                    }
                }
            }
            v3_1++;
        }
        int v3_14 = ((Boolean) p25.get((p27 - 1))).booleanValue();
        androidx.fragment.app.a v6_1 = p26;
        while (v6_1 < p27) {
            int v7_1 = ((androidx.fragment.app.a) p24.get(v6_1));
            if (v3_14 == 0) {
                int v7_2 = v7_1.a;
                int v8_0 = v7_2.size();
                int v12_0 = 0;
                while (v12_0 < v8_0) {
                    int v9_0 = v7_2.get(v12_0);
                    v12_0++;
                    int v9_2 = ((androidx.fragment.app.l1) v9_0).b;
                    if (v9_2 != 0) {
                        this.f(v9_2).k();
                    }
                }
            } else {
                int v8_3 = (v7_1.a.size() - 1);
                while (v8_3 >= 0) {
                    int v9_7 = ((androidx.fragment.app.l1) v7_1.a.get(v8_3)).b;
                    if (v9_7 != 0) {
                        this.f(v9_7).k();
                    }
                    v8_3--;
                }
            }
            v6_1++;
        }
        this.L(this.s, 1);
        androidx.fragment.app.a v6_19 = new java.util.HashSet();
        int v7_9 = p26;
        while (v7_9 < p27) {
            int v8_11 = ((androidx.fragment.app.a) p24.get(v7_9)).a;
            int v9_22 = v8_11.size();
            int v12_12 = 0;
            while (v12_12 < v9_22) {
                androidx.fragment.app.n v10_32 = v8_11.get(v12_12);
                v12_12++;
                androidx.fragment.app.n v10_34 = ((androidx.fragment.app.l1) v10_32).b;
                if (v10_34 != null) {
                    androidx.fragment.app.n v10_35 = v10_34.mContainer;
                    if (v10_35 != null) {
                        v6_19.add(androidx.fragment.app.n.h(v10_35, this));
                    }
                }
            }
            v7_9++;
        }
        androidx.fragment.app.a v6_20 = v6_19.iterator();
        while (v6_20.hasNext()) {
            int v7_16 = ((androidx.fragment.app.n) v6_20.next());
            v7_16.d = v3_14;
            v7_16.i();
            v7_16.d();
        }
        int v3_22 = p26;
        while (v3_22 < p27) {
            androidx.fragment.app.a v6_22 = ((androidx.fragment.app.a) p24.get(v3_22));
            if ((((Boolean) p25.get(v3_22)).booleanValue()) && (v6_22.s >= 0)) {
                v6_22.s = -1;
            }
            v6_22.getClass();
            v3_22++;
        }
        return;
    }
}
