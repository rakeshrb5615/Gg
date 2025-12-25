package a2;
public final class l implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic l(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                long v4_18;
                RuntimeException v0_26 = ((a2.p) this.b);
                android.view.View v2_28 = v0_26.z;
                a2.e v3_13 = v0_26.A;
                if (v3_13 == 1) {
                    v4_18 = 2;
                    v2_28.cancel();
                    v0_26.A = 3;
                    a2.e v3_15 = new float[v4_18];
                    v3_15[0] = ((Float) v2_28.getAnimatedValue()).floatValue();
                    v3_15[1] = 0;
                    v2_28.setFloatValues(v3_15);
                    v2_28.setDuration(((long) 500));
                    v2_28.start();
                } else {
                    v4_18 = 2;
                    if (v3_13 == 2) {
                    }
                }
                return;
            case 1:
                int v6_7;
                RuntimeException v0_24 = ((androidx.recyclerview.widget.RecyclerView) this.b);
                int v8_0 = v0_24.P;
                if (v8_0 == 0) {
                    v6_7 = 0;
                } else {
                    int v8_1 = ((a2.k) v8_0);
                    long v9 = v8_1.d;
                    java.util.ArrayList v11 = v8_1.h;
                    int v12_0 = v11.isEmpty();
                    int v13_0 = v8_1.j;
                    int v14_0 = v13_0.isEmpty();
                    int v15_0 = v8_1.k;
                    boolean v16 = v15_0.isEmpty();
                    a2.e v3_10 = v8_1.i;
                    long v4_5 = v3_10.isEmpty();
                    if ((v12_0 == 0) || ((v14_0 == 0) || ((v4_5 == 0) || (!v16)))) {
                        java.util.WeakHashMap v5_4 = v11.size();
                        int v6_5 = 0;
                        while (v6_5 < v5_4) {
                            int v6_9 = (v6_5 + 1);
                            java.util.WeakHashMap v7_2 = ((a2.k1) v11.get(v6_5));
                            android.view.View v2_26 = v7_2.a;
                            long v20_1 = v4_5;
                            long v4_17 = v2_26.animate();
                            int v21 = v5_4;
                            v8_1.q.add(v7_2);
                            int v22 = v6_9;
                            v4_17.setDuration(v9).alpha(0).setListener(new a2.f(v8_1, v7_2, v4_17, v2_26)).start();
                            v4_5 = v20_1;
                            v5_4 = v21;
                            v6_5 = v22;
                        }
                        long v20_0 = v4_5;
                        v11.clear();
                        if (v14_0 == 0) {
                            android.view.View v2_10 = new java.util.ArrayList();
                            v2_10.addAll(v13_0);
                            v8_1.m.add(v2_10);
                            v13_0.clear();
                            long v4_8 = new a2.e(v8_1, v2_10, 0);
                            if (v12_0 != 0) {
                                v4_8.run();
                            } else {
                                ((a2.j) v2_10.get(0)).a.a.postOnAnimationDelayed(v4_8, v9);
                            }
                        }
                        if (!v16) {
                            android.view.View v2_16 = new java.util.ArrayList();
                            v2_16.addAll(v15_0);
                            v8_1.n.add(v2_16);
                            v15_0.clear();
                            long v4_11 = new a2.e(v8_1, v2_16, 1);
                            if (v12_0 != 0) {
                                v4_11.run();
                            } else {
                                ((a2.i) v2_16.get(0)).a.a.postOnAnimationDelayed(v4_11, v9);
                            }
                        }
                        if (v20_0 == 0) {
                            android.view.View v2_22 = new java.util.ArrayList();
                            v2_22.addAll(v3_10);
                            v8_1.l.add(v2_22);
                            v3_10.clear();
                            a2.e v3_12 = new a2.e(v8_1, v2_22, 2);
                            if ((v12_0 != 0) && ((v14_0 != 0) && (v16))) {
                                v3_12.run();
                            } else {
                                if (v12_0 != 0) {
                                    v9 = 0;
                                }
                                long v4_14;
                                if (v14_0 != 0) {
                                    v4_14 = 0;
                                } else {
                                    v4_14 = v8_1.e;
                                }
                                int v6_8;
                                if (v16) {
                                    v6_8 = 0;
                                } else {
                                    v6_8 = v8_1.f;
                                }
                                v6_7 = 0;
                                ((a2.k1) v2_22.get(0)).a.postOnAnimationDelayed(v3_12, (Math.max(v4_14, v6_8) + v9));
                                v0_24.q0 = v6_7;
                                return;
                            }
                        }
                        v6_7 = 0;
                    }
                }
                v0_24.q0 = v6_7;
                return;
            case 2:
                ((androidx.recyclerview.widget.StaggeredGridLayoutManager) this.b).D0();
                return;
            case 3:
                RuntimeException v0_19 = ((h3.e) this.b);
                v0_19.c = 0;
                android.view.View v2_7 = ((com.google.android.material.bottomsheet.BottomSheetBehavior) v0_19.e);
                a2.e v3_6 = v2_7.O;
                if ((v3_6 == null) || (!v3_6.f())) {
                    if (v2_7.N == 2) {
                        v2_7.I(v0_19.b);
                    }
                } else {
                    v0_19.a(v0_19.b);
                }
                return;
            case 4:
                RuntimeException v0_17 = ((n.t1) this.b);
                v0_17.r = 0;
                v0_17.drawableStateChanged();
                return;
            case 5:
                RuntimeException v0_15 = ((androidx.appcompat.widget.SearchView$SearchAutoComplete) this.b);
                if (v0_15.f) {
                    ((android.view.inputmethod.InputMethodManager) v0_15.getContext().getSystemService("input_method")).showSoftInput(v0_15, 0);
                    v0_15.f = 0;
                }
                return;
            case 6:
                RuntimeException v0_12 = ((androidx.appcompat.widget.Toolbar) this.b).a;
                if (v0_12 != null) {
                    RuntimeException v0_13 = v0_12.z;
                    if (v0_13 != null) {
                        v0_13.l();
                    }
                }
                return;
            case 7:
                android.view.View v2_31 = ((n6.l) this.b);
                RuntimeException v0_41 = v2_31.a();
                if (v0_41 != null) {
                    v2_31.b = 1;
                }
                if (v0_41 != null) {
                    if (!new java.util.Date(v2_31.p.currentTimeMillis()).before(v2_31.q.c().b)) {
                        RuntimeException v0_6 = ((d6.c) v2_31.k);
                        a2.e v3_2 = v0_6.d();
                        RuntimeException v0_7 = v0_6.c();
                        RuntimeException v0_9 = com.google.android.gms.tasks.Tasks.whenAllComplete(new com.google.android.gms.tasks.Task[] {v3_2, v0_7})).continueWithTask(v2_31.h, new h5.a(v2_31, v3_2, v0_7, 4));
                        com.google.android.gms.tasks.Tasks.whenAllComplete(new com.google.android.gms.tasks.Task[] {v0_9})).continueWith(v2_31.h, new a5.u(8, v2_31, v0_9));
                    } else {
                        v2_31.h();
                    }
                }
                return;
            case 8:
                RuntimeException v0_8 = ((t0.d) this.b);
                android.view.View v2_0 = v0_8.c;
                java.util.WeakHashMap v5_3 = v0_8.a;
                if (v0_8.u) {
                    if (v0_8.s) {
                        v0_8.s = 0;
                        int v8_2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                        v5_3.e = v8_2;
                        v5_3.g = -1;
                        v5_3.f = v8_2;
                        v5_3.h = 1056964608;
                    }
                    if (((v5_3.g <= 0) || (android.view.animation.AnimationUtils.currentAnimationTimeMillis() <= (v5_3.g + ((long) v5_3.i)))) && (v0_8.e())) {
                        if (v0_8.t) {
                            v0_8.t = 0;
                            int v8_5 = android.os.SystemClock.uptimeMillis();
                            int v6_19 = android.view.MotionEvent.obtain(v8_5, v8_5, 3, 0, 0, 0);
                            v2_0.onTouchEvent(v6_19);
                            v6_19.recycle();
                        }
                        if (v5_3.f == 0) {
                            throw new RuntimeException("Cannot compute scroll delta before calling start()");
                        } else {
                            a2.e v3_18 = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
                            int v6_21 = v5_3.a(v3_18);
                            int v6_23 = ((v6_21 * 1082130432) + ((-1065353216 * v6_21) * v6_21));
                            java.util.WeakHashMap v7_8 = (v3_18 - v5_3.f);
                            v5_3.f = v3_18;
                            v0_8.w.scrollListBy(((int) ((((float) v7_8) * v6_23) * v5_3.d)));
                            v2_0.postOnAnimation(this);
                        }
                    } else {
                        v0_8.u = 0;
                    }
                }
                return;
            case 9:
                ((y0.e) this.b).n(0);
                return;
            default:
                RuntimeException v0_34 = ((com.google.android.material.textfield.TextInputLayout) this.b).c.m;
                v0_34.performClick();
                v0_34.jumpDrawablesToCurrentState();
                return;
        }
    }
}
