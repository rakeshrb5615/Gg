package androidx.fragment.app;
public final class n {
    public final android.view.ViewGroup a;
    public final java.util.ArrayList b;
    public final java.util.ArrayList c;
    public boolean d;
    public boolean e;

    public n(android.view.ViewGroup p2)
    {
        kotlin.jvm.internal.j.e(p2, "container");
        this.a = p2;
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        return;
    }

    public static void a(android.view.View p4, java.util.ArrayList p5)
    {
        if (!(p4 instanceof android.view.ViewGroup)) {
            if (!p5.contains(p4)) {
                p5.add(p4);
            }
        } else {
            if (!((android.view.ViewGroup) p4).isTransitionGroup()) {
                int v4_1 = ((android.view.ViewGroup) p4).getChildCount();
                int v1_1 = 0;
                while (v1_1 < v4_1) {
                    android.view.View v2 = ((android.view.ViewGroup) p4).getChildAt(v1_1);
                    if (v2.getVisibility() == 0) {
                        androidx.fragment.app.n.a(v2, p5);
                    }
                    v1_1++;
                }
            } else {
                if (!p5.contains(p4)) {
                    p5.add(p4);
                    return;
                }
            }
        }
        return;
    }

    public static void e(r.e p4, android.view.View p5)
    {
        int v0_0 = q0.i0.e(p5);
        if (v0_0 != 0) {
            p4.put(v0_0, p5);
        }
        if ((p5 instanceof android.view.ViewGroup)) {
            int v0_2 = ((android.view.ViewGroup) p5).getChildCount();
            int v1 = 0;
            while (v1 < v0_2) {
                android.view.View v2 = ((android.view.ViewGroup) p5).getChildAt(v1);
                if (v2.getVisibility() == 0) {
                    androidx.fragment.app.n.e(p4, v2);
                }
                v1++;
            }
        }
        return;
    }

    public static final androidx.fragment.app.n h(android.view.ViewGroup p2, androidx.fragment.app.b1 p3)
    {
        kotlin.jvm.internal.j.e(p2, "container");
        kotlin.jvm.internal.j.e(p3, "fragmentManager");
        kotlin.jvm.internal.j.d(p3.F(), "fragmentManager.specialEffectsControllerFactory");
        androidx.fragment.app.n v0_1 = p2.getTag(2131362430);
        if (!(v0_1 instanceof androidx.fragment.app.n)) {
            androidx.fragment.app.n v0_3 = new androidx.fragment.app.n(p2);
            p2.setTag(2131362430, v0_3);
            return v0_3;
        } else {
            return ((androidx.fragment.app.n) v0_1);
        }
    }

    public static void j(r.e p2, java.util.Collection p3)
    {
        java.util.Iterator v2_1 = p2.entrySet();
        a1.d0 v0_1 = new a1.d0(p3, 2);
        java.util.Iterator v2_3 = ((androidx.datastore.preferences.protobuf.z0) v2_1).iterator();
        while (v2_3.hasNext()) {
            if (!((Boolean) v0_1.invoke(v2_3.next())).booleanValue()) {
                v2_3.remove();
            }
        }
        return;
    }

    public final void b(int p5, int p6, androidx.fragment.app.j1 p7)
    {
        try {
            m0.d v1_1 = new m0.d();
            androidx.fragment.app.y1 v2_1 = p7.c;
            kotlin.jvm.internal.j.d(v2_1, "fragmentStateManager.fragment");
            androidx.fragment.app.y1 v2_2 = this.f(v2_1);
        } catch (androidx.fragment.app.x1 v5_6) {
            throw v5_6;
        }
        if (v2_2 == null) {
            androidx.fragment.app.y1 v2_0 = new androidx.fragment.app.y1(p5, p6, p7, v1_1);
            this.b.add(v2_0);
            v2_0.d.add(new androidx.fragment.app.x1(this, v2_0, 0));
            v2_0.d.add(new androidx.fragment.app.x1(this, v2_0, 1));
            return;
        } else {
            v2_2.c(p5, p6);
            return;
        }
    }

    public final void c(java.util.ArrayList p41, boolean p42)
    {
        java.util.ArrayList v0_0 = p41;
        Boolean v3_11 = p41.size();
        String v4_2 = 0;
        while (v4_2 < v3_11) {
            androidx.fragment.app.y1 v13_0 = p41.get(v4_2);
            v4_2++;
            java.util.ArrayList v14_1 = ((androidx.fragment.app.y1) v13_0);
            int v15_7 = v14_1.c.mView;
            kotlin.jvm.internal.j.d(v15_7, "operation.fragment.mView");
            if ((v15_7.getAlpha() != 0) || (v15_7.getVisibility() != 0)) {
                int v15_16 = v15_7.getVisibility();
                if (v15_16 == 0) {
                    if (v14_1.a != 2) {
                    }
                } else {
                    if ((v15_16 != 4) && (v15_16 != 8)) {
                        throw new IllegalArgumentException(g2.g.c(v15_16, "Unknown visibility "));
                    }
                }
            }
            androidx.fragment.app.y1 v13_1 = ((androidx.fragment.app.y1) v13_0);
            Boolean v3_9 = p41.listIterator(p41.size());
            while (v3_9.hasPrevious()) {
                String v4_15 = v3_9.previous();
                java.util.ArrayList v14_14 = ((androidx.fragment.app.y1) v4_15);
                int v15_25 = v14_14.c.mView;
                kotlin.jvm.internal.j.d(v15_25, "operation.fragment.mView");
                if ((v15_25.getAlpha() != 0) || (v15_25.getVisibility() != 0)) {
                    int v15_27 = v15_25.getVisibility();
                    if (v15_27 != 0) {
                        if ((v15_27 != 4) && (v15_27 != 8)) {
                            throw new IllegalArgumentException(g2.g.c(v15_27, "Unknown visibility "));
                        }
                    }
                }
                if (v14_14.a == 2) {
                }
                androidx.fragment.app.y1 v7_12 = ((androidx.fragment.app.y1) v4_15);
                java.util.ArrayList v14_2 = "FragmentManager";
                if (androidx.fragment.app.b1.H(2)) {
                    Boolean v3_25 = new StringBuilder("Executing operations from ");
                    v3_25.append(v13_1);
                    v3_25.append(" to ");
                    v3_25.append(v7_12);
                    android.util.Log.v("FragmentManager", v3_25.toString());
                }
                int v15_31 = new java.util.ArrayList();
                Boolean v3_22 = new java.util.ArrayList();
                String v4_53 = i7.i.l0(p41);
                androidx.fragment.app.y1 v5_8 = ((androidx.fragment.app.y1) i7.i.d0(p41)).c;
                r.e v10_20 = p41.size();
                int v17_2 = 2;
                String v12_9 = 0;
                while (v12_9 < v10_20) {
                    Object v18 = p41.get(v12_9);
                    v12_9++;
                    android.view.ViewGroup v9_9 = ((androidx.fragment.app.y1) v18).c.mAnimationInfo;
                    Boolean v6_3 = v5_8.mAnimationInfo;
                    int v19_2 = v5_8;
                    v9_9.b = v6_3.b;
                    v9_9.c = v6_3.c;
                    v9_9.d = v6_3.d;
                    v9_9.e = v6_3.e;
                    v5_8 = v19_2;
                }
                androidx.fragment.app.y1 v5_2 = p41.size();
                Boolean v6_0 = 0;
                while (v6_0 < v5_2) {
                    String v12_8;
                    r.e v10_4 = v0_0.get(v6_0);
                    v6_0++;
                    r.e v10_5 = ((androidx.fragment.app.y1) v10_4);
                    String v12_7 = new m0.d();
                    v10_5.d();
                    android.view.ViewGroup v9_2 = v10_5.e;
                    v9_2.add(v12_7);
                    v15_31.add(new androidx.fragment.app.h(v10_5, v12_7, p42));
                    java.util.ArrayList v0_11 = new m0.d();
                    v10_5.d();
                    v9_2.add(v0_11);
                    if (p42 == null) {
                        if (v10_5 != v7_12) {
                            v12_8 = 0;
                        } else {
                            v12_8 = 1;
                        }
                    } else {
                        if (v10_5 != v13_1) {
                        }
                    }
                    v3_22.add(new androidx.fragment.app.j(v10_5, v0_11, p42, v12_8));
                    v10_5.d.add(new androidx.fragment.app.d(v4_53, v10_5, this));
                    v0_0 = p41;
                }
                int v19_0 = 1;
                Boolean v6_2 = new java.util.LinkedHashMap();
                java.util.ArrayList v0_12 = new java.util.ArrayList();
                androidx.fragment.app.y1 v5_4 = v3_22.size();
                android.view.ViewGroup v9_1 = 0;
                while (v9_1 < v5_4) {
                    r.e v10_3 = v3_22.get(v9_1);
                    v9_1++;
                    if (!((androidx.fragment.app.j) v10_3).b()) {
                        v0_12.add(v10_3);
                    }
                }
                androidx.fragment.app.y1 v5_10 = new java.util.ArrayList();
                android.view.ViewGroup v9_10 = v0_12.size();
                r.e v10_2 = 0;
                while (v10_2 < v9_10) {
                    String v12_2 = v0_12.get(v10_2);
                    v10_2++;
                    if (((androidx.fragment.app.j) v12_2).c() != null) {
                        v5_10.add(v12_2);
                    }
                }
                java.util.ArrayList v0_6 = v5_10.size();
                android.view.ViewGroup v9_0 = 0;
                r.e v10_1 = 0;
                while (v9_0 < v0_6) {
                    String v12_0 = v5_10.get(v9_0);
                    v9_0++;
                    String v12_1 = ((androidx.fragment.app.j) v12_0);
                    java.util.ArrayList v41_1 = v0_6;
                    java.util.ArrayList v0_1 = v12_1.c();
                    if ((v10_1 != null) && (v0_1 != v10_1)) {
                        java.util.ArrayList v0_3 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                        v0_3.append(v12_1.a.c);
                        v0_3.append(" returned Transition ");
                        v0_3.append(v12_1.c);
                        v0_3.append(" which uses a different Transition type than other Fragments.");
                        throw new IllegalArgumentException(v0_3.toString().toString());
                    } else {
                        v10_1 = v0_1;
                        v0_6 = v41_1;
                    }
                }
                androidx.fragment.app.y1 v37_1;
                Object v27;
                r.e v26;
                java.util.ArrayList v0_19;
                String v12_13;
                int v15_11;
                android.view.ViewGroup v9_11 = this.a;
                if (v10_1 != null) {
                    java.util.ArrayList v0_18 = new android.view.View(v9_11.getContext());
                    androidx.fragment.app.y1 v5_13 = new android.graphics.Rect();
                    String v12_12 = new java.util.ArrayList();
                    String v1_3 = new java.util.ArrayList();
                    v26 = " to ";
                    v27 = v15_31;
                    int v8_1 = new r.e(0);
                    int v15_1 = v3_22.size();
                    java.util.ArrayList v29_0 = v4_53;
                    int v31 = "operation.fragment.mView";
                    String v4_0 = 0;
                    java.util.ArrayList v11_2 = 0;
                    int v28 = 0;
                    android.view.View v30 = 0;
                    while (v4_0 < v15_1) {
                        androidx.fragment.app.y1 v34_5;
                        int v33_1;
                        String v1_5;
                        String v4_24;
                        r.e v32_1 = (v4_0 + 1);
                        String v4_23 = ((androidx.fragment.app.j) v3_22.get(v4_0)).e;
                        if ((v4_23 == null) || (v13_1 == null)) {
                            v4_24 = v1_3;
                            v34_5 = v3_22;
                            v1_5 = v10_1;
                            v33_1 = v15_1;
                            v10_1 = v1_5;
                            v1_3 = v4_24;
                        } else {
                            v33_1 = v15_1;
                            int v15_26 = v13_1.c;
                            if (v7_12 == null) {
                                v4_24 = v1_3;
                                v34_5 = v3_22;
                                v1_5 = v10_1;
                            } else {
                                java.util.ArrayList v11_7 = v7_12.c;
                                String v4_26 = v10_1.r(v10_1.f(v4_23));
                                v34_5 = v3_22;
                                Boolean v3_17 = v11_7.getSharedElementSourceNames();
                                Boolean v35_2 = v6_2;
                                kotlin.jvm.internal.j.d(v3_17, "lastIn.fragment.sharedElementSourceNames");
                                Boolean v6_5 = v15_26.getSharedElementSourceNames();
                                java.util.ArrayList v36_2 = v0_18;
                                kotlin.jvm.internal.j.d(v6_5, "firstOut.fragment.sharedElementSourceNames");
                                java.util.ArrayList v0_23 = v15_26.getSharedElementTargetNames();
                                androidx.fragment.app.y1 v37_4 = v5_13;
                                kotlin.jvm.internal.j.d(v0_23, "firstOut.fragment.sharedElementTargetNames");
                                androidx.fragment.app.y1 v5_28 = v0_23.size();
                                String v25_3 = v1_3;
                                java.util.ArrayList v21_3 = v4_26;
                                String v1_6 = 0;
                                while (v1_6 < v5_28) {
                                    r.e v20_16 = v5_28;
                                    androidx.fragment.app.y1 v5_40 = v3_17.indexOf(v0_23.get(v1_6));
                                    if (v5_40 != -1) {
                                        v3_17.set(v5_40, v6_5.get(v1_6));
                                    }
                                    v1_6++;
                                    v5_28 = v20_16;
                                }
                                String v1_9;
                                java.util.ArrayList v0_24 = v11_7.getSharedElementTargetNames();
                                kotlin.jvm.internal.j.d(v0_24, "lastIn.fragment.sharedElementTargetNames");
                                if (p42 != null) {
                                    v15_26.getEnterTransitionCallback();
                                    v11_7.getExitTransitionCallback();
                                    v1_9 = new h7.f(0, 0);
                                } else {
                                    v15_26.getExitTransitionCallback();
                                    v11_7.getEnterTransitionCallback();
                                    v1_9 = new h7.f(0, 0);
                                }
                                if (v1_9.a != null) {
                                    throw new ClassCastException();
                                } else {
                                    if (v1_9.b != null) {
                                        throw new ClassCastException();
                                    } else {
                                        String v1_12 = v3_17.size();
                                        androidx.fragment.app.y1 v5_32 = 0;
                                        while (v5_32 < v1_12) {
                                            v8_1.put(((String) v3_17.get(v5_32)), ((String) v0_24.get(v5_32)));
                                            v5_32++;
                                        }
                                        if (androidx.fragment.app.b1.H(2)) {
                                            android.util.Log.v("FragmentManager", ">>> entering view names <<<");
                                            String v1_15 = v0_24.size();
                                            String v4_28 = 0;
                                            while (v4_28 < v1_15) {
                                                Boolean v6_14 = v0_24.get(v4_28);
                                                v4_28++;
                                                Boolean v6_15 = ((String) v6_14);
                                                r.e v20_14 = v1_15;
                                                String v1_31 = new StringBuilder("Name: ");
                                                v1_31.append(v6_15);
                                                android.util.Log.v("FragmentManager", v1_31.toString());
                                                v1_15 = v20_14;
                                            }
                                            android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
                                            String v1_17 = v3_17.size();
                                            String v4_29 = 0;
                                            while (v4_29 < v1_17) {
                                                Boolean v6_12 = v3_17.get(v4_29);
                                                v4_29++;
                                                Boolean v6_13 = ((String) v6_12);
                                                r.e v20_13 = v1_17;
                                                String v1_28 = new StringBuilder("Name: ");
                                                v1_28.append(v6_13);
                                                android.util.Log.v("FragmentManager", v1_28.toString());
                                                v1_17 = v20_13;
                                            }
                                        }
                                        String v1_19 = new r.e(0);
                                        androidx.fragment.app.y1 v5_35 = v15_26.mView;
                                        kotlin.jvm.internal.j.d(v5_35, "firstOut.fragment.mView");
                                        androidx.fragment.app.n.e(v1_19, v5_35);
                                        v1_19.m(v3_17);
                                        v8_1.m(v1_19.keySet());
                                        androidx.fragment.app.y1 v5_38 = new r.e(0);
                                        String v4_31 = v11_7.mView;
                                        kotlin.jvm.internal.j.d(v4_31, "lastIn.fragment.mView");
                                        androidx.fragment.app.n.e(v5_38, v4_31);
                                        v5_38.m(v0_24);
                                        v5_38.m(v8_1.values());
                                        String v4_34 = (v8_1.c - 1);
                                        while (-1 < v4_34) {
                                            if (!v5_38.containsKey(((String) v8_1.j(v4_34)))) {
                                                v8_1.h(v4_34);
                                            }
                                            v4_34--;
                                        }
                                        androidx.fragment.app.n.j(v1_19, v8_1.keySet());
                                        androidx.fragment.app.n.j(v5_38, v8_1.values());
                                        if (!v8_1.isEmpty()) {
                                            if (p42 == null) {
                                                v11_7.getEnterTransitionCallback();
                                            } else {
                                                v15_26.getEnterTransitionCallback();
                                            }
                                            Boolean v3_18;
                                            int v15_28;
                                            q0.v.a(v9_11, new androidx.fragment.app.g(v7_12, v13_1, p42, v5_38));
                                            v12_12.addAll(v1_19.values());
                                            if (v3_17.isEmpty()) {
                                                v3_18 = v21_3;
                                                v15_28 = 0;
                                            } else {
                                                v15_28 = 0;
                                                String v1_21 = ((android.view.View) v1_19.get(((String) v3_17.get(0))));
                                                v3_18 = v21_3;
                                                v10_1.m(v1_21, v3_18);
                                                v30 = v1_21;
                                            }
                                            String v4_42 = v25_3;
                                            v4_42.addAll(v5_38.values());
                                            if (v0_24.isEmpty()) {
                                                v5_13 = v37_4;
                                            } else {
                                                java.util.ArrayList v0_34 = ((android.view.View) v5_38.get(((String) v0_24.get(v15_28))));
                                                if (v0_34 == null) {
                                                } else {
                                                    v5_13 = v37_4;
                                                    q0.v.a(v9_11, new androidx.fragment.app.d(v10_1, v0_34, v5_13));
                                                    v28 = 1;
                                                }
                                            }
                                            v0_18 = v36_2;
                                            v10_1.p(v3_18, v0_18, v12_12);
                                            java.util.ArrayList v21_4 = v3_18;
                                            r.e v20_11 = v10_1;
                                            v20_11.l(v21_4, 0, 0, v3_18, v4_42);
                                            String v1_26 = v20_11;
                                            Boolean v3_21 = Boolean.TRUE;
                                            v6_2 = v35_2;
                                            v6_2.put(v13_1, v3_21);
                                            v6_2.put(v7_12, v3_21);
                                            v10_1 = v1_26;
                                            v1_3 = v4_42;
                                            v11_2 = v21_4;
                                        } else {
                                            v12_12.clear();
                                            v25_3.clear();
                                            v1_3 = v25_3;
                                            v4_0 = v32_1;
                                            v15_1 = v33_1;
                                            v3_22 = v34_5;
                                            v6_2 = v35_2;
                                            v0_18 = v36_2;
                                            v5_13 = v37_4;
                                            v11_2 = 0;
                                        }
                                    }
                                }
                            }
                        }
                        v4_0 = v32_1;
                        v15_1 = v33_1;
                        v3_22 = v34_5;
                    }
                    String v4_1 = v1_3;
                    androidx.fragment.app.y1 v34_0 = v3_22;
                    String v1_4 = v10_1;
                    int v2_12 = new java.util.ArrayList();
                    Boolean v3_0 = v34_0.size();
                    r.e v32_0 = v8_1;
                    int v8_2 = 0;
                    r.e v10_6 = 0;
                    int v15_2 = 0;
                    while (v15_2 < v3_0) {
                        Boolean v35_1;
                        String v42_4 = v3_0;
                        Boolean v3_10 = v34_0;
                        int v33_0 = (v15_2 + 1);
                        int v15_23 = ((androidx.fragment.app.j) v3_10.get(v15_2));
                        androidx.fragment.app.y1 v34_4 = v12_12;
                        String v12_24 = v15_23.a;
                        if (!v15_23.b()) {
                            r.e v20_7;
                            v35_1 = v4_1;
                            String v4_14 = v1_4.f(v15_23.c);
                            if ((v11_2 == null) || ((v12_24 != v13_1) && (v12_24 != v7_12))) {
                                v20_7 = 0;
                            } else {
                                v20_7 = v19_0;
                            }
                            if (v4_14 != null) {
                                java.util.ArrayList v36_1 = v14_2;
                                java.util.ArrayList v14_9 = new java.util.ArrayList();
                                androidx.fragment.app.y1 v37_3 = v7_12;
                                androidx.fragment.app.y1 v7_5 = v12_24.c;
                                androidx.fragment.app.e0 v38_1 = v3_10;
                                Boolean v3_12 = v7_5.mView;
                                androidx.fragment.app.e0 v39 = v11_2;
                                java.util.ArrayList v11_3 = v31;
                                kotlin.jvm.internal.j.d(v3_12, v11_3);
                                androidx.fragment.app.n.a(v3_12, v14_9);
                                if (v20_7 != null) {
                                    if (v12_24 != v13_1) {
                                        v14_9.removeAll(i7.i.n0(v35_1));
                                    } else {
                                        v14_9.removeAll(i7.i.n0(v34_4));
                                    }
                                }
                                Boolean v3_16;
                                r.e v20_9;
                                java.util.ArrayList v0_21;
                                String v4_16;
                                if (!v14_9.isEmpty()) {
                                    v1_4.b(v4_14, v14_9);
                                    java.util.ArrayList v21_2 = v4_14;
                                    int v23_1 = v14_9;
                                    v1_4.l(v21_2, v4_14, v23_1, 0, 0);
                                    v3_16 = v21_2;
                                    v4_16 = v23_1;
                                    v20_9 = v0_18;
                                    if (v12_24.a != 3) {
                                        v31 = v11_3;
                                        v0_21 = v29_0;
                                    } else {
                                        v0_21 = v29_0;
                                        v0_21.remove(v12_24);
                                        java.util.ArrayList v14_13 = new java.util.ArrayList(v4_16);
                                        v31 = v11_3;
                                        v14_13.remove(v7_5.mView);
                                        v1_4.k(v3_16, v7_5.mView, v14_13);
                                        q0.v.a(v9_11, new androidx.fragment.app.t(v4_16, v19_0));
                                    }
                                } else {
                                    v1_4.a(v0_18, v4_14);
                                    v20_9 = v0_18;
                                    v3_16 = v4_14;
                                    v31 = v11_3;
                                    v4_16 = v14_9;
                                }
                                String v4_17;
                                if (v12_24.a != v17_2) {
                                    v4_17 = v30;
                                    v1_4.m(v4_17, v3_16);
                                } else {
                                    v2_12.addAll(v4_16);
                                    if (v28 != 0) {
                                        v1_4.n(v3_16, v5_13);
                                    }
                                    v4_17 = v30;
                                }
                                v6_2.put(v12_24, Boolean.TRUE);
                                if (!v15_23.d) {
                                    v8_2 = v1_4.j(v8_2, v3_16);
                                } else {
                                    v10_6 = v1_4.j(v10_6, v3_16);
                                }
                                v3_0 = v42_4;
                                v29_0 = v0_21;
                                v30 = v4_17;
                                v0_18 = v20_9;
                                v15_2 = v33_0;
                                v12_12 = v34_4;
                                v4_1 = v35_1;
                                v14_2 = v36_1;
                                v7_12 = v37_3;
                                v34_0 = v38_1;
                                v11_2 = v39;
                                v17_2 = 2;
                                v19_0 = 1;
                            } else {
                                if (v20_7 == null) {
                                    v6_2.put(v12_24, Boolean.FALSE);
                                    v15_23.a();
                                }
                            }
                        } else {
                            v35_1 = v4_1;
                            v6_2.put(v12_24, Boolean.FALSE);
                            v15_23.a();
                        }
                        v15_2 = v33_0;
                        v12_12 = v34_4;
                        v4_1 = v35_1;
                        v34_0 = v3_10;
                        v3_0 = v42_4;
                    }
                    Boolean v35_0 = v4_1;
                    androidx.fragment.app.y1 v37_0 = v7_12;
                    java.util.ArrayList v36_0 = v14_2;
                    v0_19 = v29_0;
                    androidx.fragment.app.e0 v38_0 = v34_0;
                    androidx.fragment.app.y1 v34_1 = v12_12;
                    Boolean v3_1 = v1_4.i(v10_6, v8_2, v11_2);
                    if (v3_1 != null) {
                        String v4_4 = new java.util.ArrayList();
                        androidx.fragment.app.y1 v5_14 = v38_0.size();
                        int v15_3 = 0;
                        while (v15_3 < v5_14) {
                            androidx.fragment.app.y1 v7_4 = v38_0;
                            int v8_18 = v7_4.get(v15_3);
                            v15_3++;
                            if (!((androidx.fragment.app.j) v8_18).b()) {
                                v4_4.add(v8_18);
                            }
                            v38_0 = v7_4;
                        }
                        androidx.fragment.app.y1 v5_15 = v4_4.size();
                        int v15_4 = 0;
                        while (v15_4 < v5_15) {
                            java.util.ArrayList v14_4;
                            androidx.fragment.app.y1 v7_2 = v4_4.get(v15_4);
                            v15_4++;
                            androidx.fragment.app.y1 v7_3 = ((androidx.fragment.app.j) v7_2);
                            r.e v10_13 = v7_3.a;
                            String v12_23 = v37_0;
                            if ((v11_2 == null) || ((v10_13 != v13_1) && (v10_13 != v12_23))) {
                                v14_4 = 0;
                            } else {
                                v14_4 = 1;
                            }
                            if ((v7_3.c == null) && (v14_4 == null)) {
                                String v42_3 = v4_4;
                                java.util.ArrayList v14_5 = v36_0;
                            } else {
                                if (v9_11.isLaidOut()) {
                                    v14_5 = v36_0;
                                    v42_3 = v4_4;
                                    v1_4.o(v3_1, v7_3.b, new androidx.fragment.app.d(v7_3, v10_13));
                                } else {
                                    if (!androidx.fragment.app.b1.H(2)) {
                                        v14_5 = v36_0;
                                    } else {
                                        int v8_16 = new StringBuilder("SpecialEffectsController: Container ");
                                        v8_16.append(v9_11);
                                        v8_16.append(" has not been laid out. Completing operation ");
                                        v8_16.append(v10_13);
                                        v14_5 = v36_0;
                                        android.util.Log.v(v14_5, v8_16.toString());
                                    }
                                    v7_3.a();
                                    v42_3 = v4_4;
                                }
                            }
                            v4_4 = v42_3;
                            v37_0 = v12_23;
                            v36_0 = v14_5;
                        }
                        v14_2 = v36_0;
                        v12_13 = v37_0;
                        if (v9_11.isLaidOut()) {
                            androidx.fragment.app.n1.a(4, v2_12);
                            String v4_8 = new java.util.ArrayList();
                            androidx.fragment.app.y1 v5_16 = v35_0.size();
                            int v15_6 = 0;
                            while (v15_6 < v5_16) {
                                int v8_10 = ((android.view.View) v35_0.get(v15_6));
                                v4_8.add(q0.i0.e(v8_10));
                                q0.i0.k(v8_10, 0);
                                v15_6++;
                            }
                            androidx.fragment.app.y1 v5_18;
                            androidx.fragment.app.y1 v7_0 = v35_0;
                            if (!androidx.fragment.app.b1.H(2)) {
                                v37_1 = v12_13;
                                v5_18 = v34_1;
                            } else {
                                android.util.Log.v(v14_2, ">>>>> Beginning transition <<<<<");
                                android.util.Log.v(v14_2, ">>>>> SharedElementFirstOutViews <<<<<");
                                androidx.fragment.app.y1 v5_21 = v34_1.size();
                                int v15_8 = 0;
                                while (v15_8 < v5_21) {
                                    String v42_2 = v5_21;
                                    androidx.fragment.app.y1 v37_2 = v12_13;
                                    String v12_21 = v34_1.get(v15_8);
                                    Object v16_5 = (v15_8 + 1);
                                    kotlin.jvm.internal.j.d(v12_21, "sharedElementFirstOutViews");
                                    String v12_22 = ((android.view.View) v12_21);
                                    int v15_20 = new StringBuilder("View: ");
                                    v15_20.append(v12_22);
                                    v15_20.append(" Name: ");
                                    v15_20.append(q0.i0.e(v12_22));
                                    android.util.Log.v(v14_2, v15_20.toString());
                                    v15_8 = v16_5;
                                    v12_13 = v37_2;
                                    v5_21 = v42_2;
                                }
                                v37_1 = v12_13;
                                v5_18 = v34_1;
                                android.util.Log.v(v14_2, ">>>>> SharedElementLastInViews <<<<<");
                                String v12_15 = v7_0.size();
                                int v15_9 = 0;
                                while (v15_9 < v12_15) {
                                    String v42_1 = v12_15;
                                    String v12_17 = v7_0.get(v15_9);
                                    Object v16_4 = (v15_9 + 1);
                                    kotlin.jvm.internal.j.d(v12_17, "sharedElementLastInViews");
                                    String v12_18 = ((android.view.View) v12_17);
                                    int v15_15 = new StringBuilder("View: ");
                                    v15_15.append(v12_18);
                                    v15_15.append(" Name: ");
                                    v15_15.append(q0.i0.e(v12_18));
                                    android.util.Log.v(v14_2, v15_15.toString());
                                    v12_15 = v42_1;
                                    v15_9 = v16_4;
                                }
                            }
                            v1_4.c(v9_11, v3_1);
                            Boolean v3_2 = v7_0.size();
                            int v8_5 = new java.util.ArrayList();
                            int v15_10 = 0;
                            while (v15_10 < v3_2) {
                                java.util.ArrayList v21_1;
                                String v25_1;
                                r.e v10_10;
                                androidx.fragment.app.y1 v34_3;
                                r.e v10_9 = ((android.view.View) v5_18.get(v15_10));
                                String v12_16 = q0.i0.e(v10_9);
                                v8_5.add(v12_16);
                                if (v12_16 != null) {
                                    v34_3 = v5_18;
                                    q0.i0.k(v10_9, 0);
                                    v10_10 = v32_0;
                                    v25_1 = v8_5;
                                    int v8_6 = 0;
                                    while(true) {
                                        v21_1 = v3_2;
                                        if (v8_6 < v3_2) {
                                            if (((String) v10_10.get(v12_16)).equals(v4_8.get(v8_6))) {
                                                break;
                                            }
                                            v8_6++;
                                            v3_2 = v21_1;
                                        }
                                    }
                                    q0.i0.k(((android.view.View) v7_0.get(v8_6)), v12_16);
                                } else {
                                    v21_1 = v3_2;
                                    v34_3 = v5_18;
                                    v25_1 = v8_5;
                                    v10_10 = v32_0;
                                }
                                v15_10++;
                                v32_0 = v10_10;
                                v3_2 = v21_1;
                                v8_5 = v25_1;
                                v5_18 = v34_3;
                            }
                            int v22_0 = v7_0;
                            java.util.ArrayList v24_0 = v5_18;
                            String v4_9 = v22_0;
                            androidx.fragment.app.y1 v5_22 = v24_0;
                            q0.v.a(v9_11, new androidx.fragment.app.t1(v3_2, v22_0, v4_8, v24_0, v8_5));
                            v15_11 = 0;
                            androidx.fragment.app.n1.a(0, v2_12);
                            v1_4.q(v11_2, v5_22, v4_9);
                        } else {
                            v37_1 = v12_13;
                            v15_11 = 0;
                        }
                    } else {
                        v14_2 = v36_0;
                        v12_13 = v37_0;
                    }
                } else {
                    java.util.ArrayList v0_35 = v3_22.size();
                    int v2_1 = 0;
                    while (v2_1 < v0_35) {
                        androidx.fragment.app.y1 v5_0 = v3_22.get(v2_1);
                        v2_1++;
                        androidx.fragment.app.y1 v5_1 = ((androidx.fragment.app.j) v5_0);
                        v6_2.put(v5_1.a, Boolean.FALSE);
                        v5_1.a();
                    }
                    v0_19 = v4_53;
                    v12_13 = v7_12;
                    v26 = " to ";
                    v27 = v15_31;
                }
                androidx.fragment.app.y1 v7_15 = v6_2.containsValue(Boolean.TRUE);
                int v8_20 = v9_11.getContext();
                r.e v10_18 = new java.util.ArrayList();
                java.util.ArrayList v11_8 = v27.size();
                String v1_1 = v15_11;
                int v2_0 = v1_1;
                while (v2_0 < v11_8) {
                    String v42_6;
                    String v4_59 = v27;
                    Object v16_9 = (v2_0 + 1);
                    androidx.fragment.app.y1 v5_48 = ((androidx.fragment.app.h) v4_59.get(v2_0));
                    if (!v5_48.b()) {
                        kotlin.jvm.internal.j.d(v8_20, "context");
                        int v2_22 = v5_48.c(v8_20);
                        if (v2_22 != 0) {
                            int v2_24 = ((android.animation.Animator) v2_22.b);
                            if (v2_24 != 0) {
                                v27 = v4_59;
                                String v4_60 = v5_48.a;
                                Boolean v3_32 = v4_60.c;
                                v42_6 = v1_1;
                                if (!kotlin.jvm.internal.j.a(v6_2.get(v4_60), Boolean.TRUE)) {
                                    String v1_38;
                                    if (v4_60.a != 3) {
                                        v1_38 = 0;
                                    } else {
                                        v1_38 = 1;
                                    }
                                    if (v1_38 != null) {
                                        v0_19.remove(v4_60);
                                    }
                                    Boolean v3_33 = v3_32.mView;
                                    v9_11.startViewTransition(v3_33);
                                    java.util.ArrayList v29_2 = v0_19;
                                    int v15_34 = v2_24;
                                    int v2_25 = v3_33;
                                    v15_34.addListener(new androidx.fragment.app.k(this, v2_25, v1_38, v4_60, v5_48));
                                    v15_34.setTarget(v2_25);
                                    v15_34.start();
                                    if (androidx.fragment.app.b1.H(2)) {
                                        java.util.ArrayList v0_51 = new StringBuilder("Animator from operation ");
                                        v0_51.append(v4_60);
                                        v0_51.append(" has started.");
                                        android.util.Log.v(v14_2, v0_51.toString());
                                    }
                                    v5_48.b.a(new androidx.fragment.app.e(v15_34, v4_60));
                                    v2_0 = v16_9;
                                    v0_19 = v29_2;
                                    v1_1 = 1;
                                } else {
                                    if (androidx.fragment.app.b1.H(2)) {
                                        String v1_42 = new StringBuilder("Ignoring Animator set on ");
                                        v1_42.append(v3_32);
                                        v1_42.append(" as this Fragment was involved in a Transition.");
                                        android.util.Log.v(v14_2, v1_42.toString());
                                    }
                                    v5_48.a();
                                }
                            } else {
                                v10_18.add(v5_48);
                                v42_6 = v1_1;
                                v27 = v4_59;
                            }
                        } else {
                            v5_48.a();
                        }
                    } else {
                        v5_48.a();
                    }
                    v1_1 = v42_6;
                    v2_0 = v16_9;
                }
                java.util.ArrayList v29_1 = v0_19;
                String v42_5 = v1_1;
                java.util.ArrayList v0_36 = v10_18.size();
                int v15_29 = 0;
                while (v15_29 < v0_36) {
                    int v2_19 = v10_18.get(v15_29);
                    v15_29++;
                    int v2_20 = ((androidx.fragment.app.h) v2_19);
                    String v4_49 = v2_20.a;
                    androidx.fragment.app.y1 v5_42 = v4_49.c;
                    if (v7_15 == null) {
                        if (v42_5 == null) {
                            androidx.fragment.app.y1 v5_43 = v5_42.mView;
                            kotlin.jvm.internal.j.d(v8_20, "context");
                            Boolean v6_20 = v2_20.c(v8_20);
                            if (v6_20 == null) {
                                throw new IllegalStateException("Required value was null.");
                            } else {
                                Boolean v6_22 = ((android.view.animation.Animation) v6_20.a);
                                if (v6_22 == null) {
                                    throw new IllegalStateException("Required value was null.");
                                } else {
                                    java.util.ArrayList v41_2 = v0_36;
                                    if (v4_49.a == 1) {
                                        v9_11.startViewTransition(v5_43);
                                        java.util.ArrayList v11_12 = new androidx.fragment.app.l0(v6_22, v9_11, v5_43);
                                        v11_12.setAnimationListener(new androidx.fragment.app.m(v5_43, v2_20, this, v4_49));
                                        v5_43.startAnimation(v11_12);
                                        if (androidx.fragment.app.b1.H(2)) {
                                            Boolean v6_27 = new StringBuilder("Animation from operation ");
                                            v6_27.append(v4_49);
                                            v6_27.append(" has started.");
                                            android.util.Log.v(v14_2, v6_27.toString());
                                        }
                                    } else {
                                        v5_43.startAnimation(v6_22);
                                        v2_20.a();
                                    }
                                    v2_20.b.a(new androidx.fragment.app.f(v5_43, v2_20, this, v4_49));
                                    v0_36 = v41_2;
                                }
                            }
                        } else {
                            if (androidx.fragment.app.b1.H(2)) {
                                String v4_52 = new StringBuilder("Ignoring Animation set on ");
                                v4_52.append(v5_42);
                                v4_52.append(" as Animations cannot run alongside Animators.");
                                android.util.Log.v(v14_2, v4_52.toString());
                            }
                            v2_20.a();
                        }
                    } else {
                        if (androidx.fragment.app.b1.H(2)) {
                            String v4_57 = new StringBuilder("Ignoring Animation set on ");
                            v4_57.append(v5_42);
                            v4_57.append(" as Animations cannot run alongside Transitions.");
                            android.util.Log.v(v14_2, v4_57.toString());
                        }
                        v2_20.a();
                    }
                }
                java.util.ArrayList v0_37 = v29_1.size();
                Boolean v6_18 = 0;
                while (v6_18 < v0_37) {
                    Object vtmp105 = v29_1.get(v6_18);
                    v6_18++;
                    Boolean v3_29 = ((androidx.fragment.app.y1) vtmp105);
                    String v4_48 = v3_29.c.mView;
                    Boolean v3_30 = v3_29.a;
                    kotlin.jvm.internal.j.d(v4_48, "view");
                    v1.a.a(v4_48, v3_30);
                }
                v29_1.clear();
                if (androidx.fragment.app.b1.H(2)) {
                    java.util.ArrayList v0_40 = new StringBuilder("Completed executing operations from ");
                    v0_40.append(v13_1);
                    v0_40.append(v26);
                    v0_40.append(v37_1);
                    android.util.Log.v(v14_2, v0_40.toString());
                }
                return;
            }
            v4_15 = 0;
        }
        v13_0 = 0;
    }

    public final void d()
    {
        if (!this.e) {
            if (this.a.isAttachedToWindow()) {
                if (!this.b.isEmpty()) {
                    String v2_2 = i7.i.l0(this.c);
                    this.c.clear();
                    boolean v3_1 = v2_2.size();
                    int v4_0 = 0;
                    while (v4_0 < v3_1) {
                        androidx.fragment.app.y1 v6_2 = v2_2.get(v4_0);
                        v4_0++;
                        androidx.fragment.app.y1 v6_3 = ((androidx.fragment.app.y1) v6_2);
                        if (androidx.fragment.app.b1.H(2)) {
                            String v7_1 = new StringBuilder();
                            v7_1.append("SpecialEffectsController: Cancelling operation ");
                            v7_1.append(v6_3);
                            android.util.Log.v("FragmentManager", v7_1.toString());
                        }
                        v6_3.a();
                        if (!v6_3.g) {
                            this.c.add(v6_3);
                        }
                    }
                    this.k();
                    String v2_4 = i7.i.l0(this.b);
                    this.b.clear();
                    this.c.addAll(v2_4);
                    if (androidx.fragment.app.b1.H(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    boolean v3_6 = v2_4.size();
                    int v4_2 = 0;
                    while (v4_2 < v3_6) {
                        androidx.fragment.app.y1 v6_0 = v2_4.get(v4_2);
                        v4_2++;
                        ((androidx.fragment.app.y1) v6_0).d();
                    }
                    this.c(v2_4, this.d);
                    this.d = 0;
                    if (androidx.fragment.app.b1.H(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
                return;
            } else {
                this.g();
                this.d = 0;
                return;
            }
        } else {
            return;
        }
    }

    public final androidx.fragment.app.y1 f(androidx.fragment.app.e0 p7)
    {
        java.util.ArrayList v0 = this.b;
        int v1 = v0.size();
        int v2 = 0;
        while (v2 < v1) {
            androidx.fragment.app.y1 v3_1 = v0.get(v2);
            v2++;
            boolean v4_0 = ((androidx.fragment.app.y1) v3_1);
            if ((kotlin.jvm.internal.j.a(v4_0.c, p7)) && (!v4_0.f)) {
            }
            return ((androidx.fragment.app.y1) v3_1);
        }
        v3_1 = 0;
        return ((androidx.fragment.app.y1) v3_1);
    }

    public final void g()
    {
        if (androidx.fragment.app.b1.H(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean v1_0 = this.a.isAttachedToWindow();
        this.k();
        java.util.ArrayList v3_0 = this.b;
        int v4_0 = v3_0.size();
        int v5 = 0;
        androidx.fragment.app.y1 v6_0 = 0;
        while (v6_0 < v4_0) {
            String v7_9 = v3_0.get(v6_0);
            v6_0++;
            ((androidx.fragment.app.y1) v7_9).d();
        }
        java.util.ArrayList v3_2 = i7.i.l0(this.c);
        int v4_1 = v3_2.size();
        androidx.fragment.app.y1 v6_1 = 0;
        while (v6_1 < v4_1) {
            String v7_7 = v3_2.get(v6_1);
            v6_1++;
            String v7_8 = ((androidx.fragment.app.y1) v7_7);
            if (androidx.fragment.app.b1.H(2)) {
                String v8_7;
                if (!v1_0) {
                    String v8_6 = new StringBuilder();
                    v8_6.append("Container ");
                    v8_6.append(this.a);
                    v8_6.append(" is not attached to window. ");
                    v8_7 = v8_6.toString();
                } else {
                    v8_7 = "";
                }
                String v10_2 = new StringBuilder();
                v10_2.append("SpecialEffectsController: ");
                v10_2.append(v8_7);
                v10_2.append("Cancelling running operation ");
                v10_2.append(v7_8);
                android.util.Log.v("FragmentManager", v10_2.toString());
            }
            v7_8.a();
        }
        java.util.ArrayList v3_4 = i7.i.l0(this.b);
        int v4_2 = v3_4.size();
        while (v5 < v4_2) {
            androidx.fragment.app.y1 v6_2 = v3_4.get(v5);
            v5++;
            androidx.fragment.app.y1 v6_3 = ((androidx.fragment.app.y1) v6_2);
            if (androidx.fragment.app.b1.H(2)) {
                String v7_4;
                if (!v1_0) {
                    String v7_3 = new StringBuilder();
                    v7_3.append("Container ");
                    v7_3.append(this.a);
                    v7_3.append(" is not attached to window. ");
                    v7_4 = v7_3.toString();
                } else {
                    v7_4 = "";
                }
                StringBuilder v9_1 = new StringBuilder();
                v9_1.append("SpecialEffectsController: ");
                v9_1.append(v7_4);
                v9_1.append("Cancelling pending operation ");
                v9_1.append(v6_3);
                android.util.Log.v("FragmentManager", v9_1.toString());
            }
            v6_3.a();
        }
        return;
    }

    public final void i()
    {
        this.k();
        IllegalArgumentException v1_0 = this.b;
        IllegalArgumentException v1_5 = v1_0.listIterator(v1_0.size());
        do {
            String v2_0;
            String v3_1 = 0;
            if (!v1_5.hasPrevious()) {
                v2_0 = 0;
            } else {
                v2_0 = v1_5.previous();
                int v4_1 = ((androidx.fragment.app.y1) v2_0);
                int v5_1 = v4_1.c.mView;
                kotlin.jvm.internal.j.d(v5_1, "operation.fragment.mView");
                int v8 = 4;
                if ((v5_1.getAlpha() != 0) || (v5_1.getVisibility() != 0)) {
                    int v5_2 = v5_1.getVisibility();
                    if (v5_2 == 0) {
                        v8 = 2;
                    } else {
                        if (v5_2 != 4) {
                            if (v5_2 != 8) {
                                String v2_3 = new StringBuilder("Unknown visibility ");
                                v2_3.append(v5_2);
                                throw new IllegalArgumentException(v2_3.toString());
                            } else {
                                v8 = 3;
                            }
                        }
                    }
                } else {
                }
            }
            String v2_5 = ((androidx.fragment.app.y1) v2_0);
            if (v2_5 != null) {
                v3_1 = v2_5.c;
            }
            IllegalArgumentException v1_3;
            if (v3_1 == null) {
                v1_3 = 0;
            } else {
                v1_3 = v3_1.isPostponed();
            }
            this.e = v1_3;
            return;
        } while((v4_1.a != 2) || (v8 == 2));
    }

    public final void k()
    {
        IllegalArgumentException v0_0 = this.b;
        String v1_0 = v0_0.size();
        int v2 = 0;
        while (v2 < v1_0) {
            androidx.fragment.app.y1 v3_0 = v0_0.get(v2);
            v2++;
            androidx.fragment.app.y1 v3_1 = ((androidx.fragment.app.y1) v3_0);
            int v5_0 = 2;
            if (v3_1.b == 2) {
                int v4_2 = v3_1.c.requireView();
                kotlin.jvm.internal.j.d(v4_2, "fragment.requireView()");
                int v4_3 = v4_2.getVisibility();
                if (v4_3 != 0) {
                    v5_0 = 4;
                    if (v4_3 != 4) {
                        if (v4_3 != 8) {
                            throw new IllegalArgumentException(g2.g.c(v4_3, "Unknown visibility "));
                        } else {
                            v5_0 = 3;
                        }
                    }
                }
                v3_1.c(v5_0, 1);
            }
        }
        return;
    }
}
