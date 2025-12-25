package f2;
public final class v implements android.view.ViewTreeObserver$OnPreDrawListener, android.view.View$OnAttachStateChangeListener {
    public f2.s a;
    public android.view.ViewGroup b;

    public final boolean onPreDraw()
    {
        f2.s v1 = this.a;
        android.view.ViewGroup v2 = this.b;
        v2.getViewTreeObserver().removeOnPreDrawListener(this);
        v2.removeOnAttachStateChangeListener(this);
        boolean v7_0 = 1;
        if (f2.w.c.remove(v2)) {
            java.util.ArrayList v6_10;
            f2.a0 v3_0 = f2.w.b();
            a5.t v4_5 = ((java.util.ArrayList) v3_0.get(v2));
            if (v4_5 != null) {
                if (v4_5.size() <= 0) {
                    v6_10 = 0;
                } else {
                    v6_10 = new java.util.ArrayList(v4_5);
                }
            } else {
                v4_5 = new java.util.ArrayList();
                v3_0.put(v2, v4_5);
            }
            v4_5.add(v1);
            v1.a(new f2.u(this, v3_0));
            f2.a0 v3_16 = 0;
            v1.k(v2, 0);
            if (v6_10 != null) {
                a5.t v4_13 = v6_10.size();
                f2.s v8_1 = 0;
                while (v8_1 < v4_13) {
                    Object v9_2 = v6_10.get(v8_1);
                    v8_1++;
                    ((f2.s) v9_2).C(v2);
                }
            }
            v1.q = new java.util.ArrayList();
            v1.r = new java.util.ArrayList();
            a5.t v4_18 = v1.m;
            java.util.ArrayList v6_17 = v1.n;
            f2.s v8_3 = new r.e(((r.e) v4_18.b));
            Object v9_7 = new r.e(((r.e) v6_17.b));
            r.e v10_6 = 0;
            while(true) {
                f2.a0 v11_7 = v1.p;
                if (v10_6 >= v11_7.length) {
                    break;
                }
                f2.a0 v18_1;
                java.util.ArrayList v5_0;
                f2.a0 v11_1 = v11_7[v10_6];
                if (v11_1 == v7_0) {
                    v5_0 = v6_17;
                    v18_1 = v7_0;
                    java.util.ArrayList v0_4 = (v8_3.c - 1);
                    while (v0_4 >= null) {
                        f2.a0 v3_9 = ((android.view.View) v8_3.g(v0_4));
                        if ((v3_9 != null) && (v1.w(v3_9))) {
                            f2.a0 v3_11 = ((f2.a0) v9_7.remove(v3_9));
                            if ((v3_11 != null) && (v1.w(v3_11.b))) {
                                v1.q.add(((f2.a0) v8_3.h(v0_4)));
                                v1.r.add(v3_11);
                            }
                        }
                        v0_4--;
                    }
                } else {
                    if (v11_1 == 2) {
                        v5_0 = v6_17;
                        v18_1 = v7_0;
                        java.util.ArrayList v0_6 = ((r.e) v4_18.e);
                        f2.a0 v3_13 = ((r.e) v5_0.e);
                        java.util.ArrayList v6_9 = v0_6.c;
                        boolean v7_9 = 0;
                        while (v7_9 < v6_9) {
                            f2.a0 v11_3 = ((android.view.View) v0_6.j(v7_9));
                            if ((v11_3 != null) && (v1.w(v11_3))) {
                                f2.a0 v12_7 = ((android.view.View) v3_13.get(((String) v0_6.g(v7_9))));
                                if ((v12_7 != null) && (v1.w(v12_7))) {
                                    java.util.ArrayList v13_2 = ((f2.a0) v8_3.get(v11_3));
                                    f2.a0 v14_1 = ((f2.a0) v9_7.get(v12_7));
                                    if ((v13_2 != null) && (v14_1 != null)) {
                                        v1.q.add(v13_2);
                                        v1.r.add(v14_1);
                                        v8_3.remove(v11_3);
                                        v9_7.remove(v12_7);
                                    }
                                }
                            }
                            v7_9++;
                        }
                    } else {
                        if (v11_1 == 3) {
                            v18_1 = v7_0;
                            f2.a0 v3_15 = ((android.util.SparseArray) v4_18.c);
                            v5_0 = v6_17;
                            java.util.ArrayList v6_12 = ((android.util.SparseArray) v5_0.c);
                            boolean v7_10 = v3_15.size();
                            f2.a0 v11_4 = 0;
                            while (v11_4 < v7_10) {
                                f2.a0 v12_10 = ((android.view.View) v3_15.valueAt(v11_4));
                                if ((v12_10 != null) && (v1.w(v12_10))) {
                                    java.util.ArrayList v13_7 = ((android.view.View) v6_12.get(v3_15.keyAt(v11_4)));
                                    if ((v13_7 != null) && (v1.w(v13_7))) {
                                        f2.a0 v14_4 = ((f2.a0) v8_3.get(v12_10));
                                        java.util.ArrayList v15_2 = ((f2.a0) v9_7.get(v13_7));
                                        if ((v14_4 != null) && (v15_2 != null)) {
                                            v1.q.add(v14_4);
                                            v1.r.add(v15_2);
                                            v8_3.remove(v12_10);
                                            v9_7.remove(v13_7);
                                        }
                                    }
                                }
                                v11_4++;
                            }
                        } else {
                            if (v11_1 == 4) {
                                f2.a0 v11_6 = ((r.g) v4_18.d);
                                f2.a0 v12_13 = ((r.g) v6_17.d);
                                java.util.ArrayList v13_8 = v11_6.g();
                                f2.a0 v14_5 = v3_16;
                                while (v14_5 < v13_8) {
                                    java.util.ArrayList v17_1;
                                    f2.a0 v18_3;
                                    java.util.ArrayList v15_4 = ((android.view.View) v11_6.h(v14_5));
                                    if ((v15_4 == null) || (!v1.w(v15_4))) {
                                        v17_1 = v6_17;
                                        v18_3 = v7_0;
                                    } else {
                                        v17_1 = v6_17;
                                        java.util.ArrayList v5_3 = ((android.view.View) v12_13.b(v11_6.d(v14_5)));
                                        if ((v5_3 == null) || (!v1.w(v5_3))) {
                                        } else {
                                            java.util.ArrayList v6_15 = ((f2.a0) v8_3.get(v15_4));
                                            f2.a0 v3_18 = ((f2.a0) v9_7.get(v5_3));
                                            if ((v6_15 == null) || (v3_18 == null)) {
                                            } else {
                                                v18_3 = v7_0;
                                                v1.q.add(v6_15);
                                                v1.r.add(v3_18);
                                                v8_3.remove(v15_4);
                                                v9_7.remove(v5_3);
                                            }
                                        }
                                    }
                                    v14_5++;
                                    v6_17 = v17_1;
                                    v7_0 = v18_3;
                                }
                                v18_1 = v7_0;
                                v5_0 = v6_17;
                            } else {
                                v5_0 = v6_17;
                                v18_1 = v7_0;
                            }
                        }
                    }
                }
                v10_6++;
                v6_17 = v5_0;
                v7_0 = v18_1;
                v3_16 = 0;
            }
            f2.a0 v18_0 = v7_0;
            java.util.ArrayList v0_2 = 0;
            while (v0_2 < v8_3.c) {
                f2.a0 v3_6 = ((f2.a0) v8_3.j(v0_2));
                if (v1.w(v3_6.b)) {
                    v1.q.add(v3_6);
                    v1.r.add(0);
                }
                v0_2++;
            }
            java.util.ArrayList v0_1 = 0;
            while (v0_1 < v9_7.c) {
                f2.a0 v3_3 = ((f2.a0) v9_7.j(v0_1));
                if (v1.w(v3_3.b)) {
                    v1.r.add(v3_3);
                    v1.q.add(0);
                }
                v0_1++;
            }
            java.util.ArrayList v0_9 = f2.s.s();
            f2.a0 v3_22 = v0_9.c;
            a5.t v4_19 = v2.getWindowId();
            java.util.ArrayList v5_5 = new java.util.ArrayList();
            f2.a0 v3_1 = (v3_22 - 1);
            while (v3_1 >= null) {
                java.util.ArrayList v6_0 = ((android.animation.Animator) v0_9.g(v3_1));
                if (v6_0 != null) {
                    boolean v7_2 = ((f2.p) v0_9.get(v6_0));
                    if (v7_2) {
                        f2.s v8_0 = v7_2.e;
                        Object v9_0 = v7_2.a;
                        if ((v9_0 != null) && (v4_19.equals(v7_2.d))) {
                            boolean v7_3 = v7_2.c;
                            r.e v10_2 = v18_0;
                            f2.a0 v11_0 = v1.u(v9_0, v10_2);
                            f2.a0 v12_0 = v1.q(v9_0, v10_2);
                            if ((v11_0 == null) && (v12_0 == null)) {
                                v12_0 = ((f2.a0) ((r.e) v1.n.b).get(v9_0));
                            }
                            if (((v11_0 != null) || (v12_0 != null)) && (v8_0.v(v7_3, v12_0))) {
                                v8_0.r().getClass();
                                if ((!v6_0.isRunning()) && (!v6_0.isStarted())) {
                                    v0_9.h(v3_1);
                                } else {
                                    v6_0.cancel();
                                }
                            }
                        }
                    }
                }
                v3_1--;
                v18_0 = 1;
            }
            f2.a0 v3_24 = 0;
            while (v3_24 < v5_5.size()) {
                java.util.ArrayList v0_12 = ((f2.s) v5_5.get(v3_24));
                v0_12.y(v0_12, f2.r.i);
                if (!v0_12.x) {
                    v0_12.x = 1;
                    v0_12.y(v0_12, f2.r.h);
                }
                v3_24++;
            }
            v1.o(v2, v1.m, v1.n, v1.q, v1.r);
            v1.D();
            return 1;
        } else {
            return 1;
        }
    }

    public final void onViewAttachedToWindow(android.view.View p1)
    {
        return;
    }

    public final void onViewDetachedFromWindow(android.view.View p5)
    {
        f2.s v5_0 = this.b;
        v5_0.getViewTreeObserver().removeOnPreDrawListener(this);
        v5_0.removeOnAttachStateChangeListener(this);
        f2.w.c.remove(v5_0);
        int v0_1 = ((java.util.ArrayList) f2.w.b().get(v5_0));
        if ((v0_1 != 0) && (v0_1.size() > 0)) {
            int v1_1 = v0_1.size();
            int v2 = 0;
            while (v2 < v1_1) {
                f2.s v3_0 = v0_1.get(v2);
                v2++;
                ((f2.s) v3_0).C(v5_0);
            }
        }
        this.a.l(1);
        return;
    }
}
