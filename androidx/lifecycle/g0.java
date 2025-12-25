package androidx.lifecycle;
public final synthetic class g0 implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic g0(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    private final void a()
    {
        boolean v0_1 = ((i5.n) this.b);
        Throwable v2_2 = 0;
        ((java.util.concurrent.atomic.AtomicReference) v0_1.c).set(0);
        if (((java.util.concurrent.atomic.AtomicMarkableReference) v0_1.b).isMarked()) {
            v2_2 = java.util.Collections.unmodifiableMap(new java.util.HashMap(((i5.d) ((java.util.concurrent.atomic.AtomicMarkableReference) v0_1.b).getReference()).a));
            java.util.concurrent.atomic.AtomicMarkableReference v1_6 = ((java.util.concurrent.atomic.AtomicMarkableReference) v0_1.b);
            v1_6.set(((i5.d) v1_6.getReference()), 0);
        }
        if (v2_2 != null) {
            java.util.concurrent.atomic.AtomicMarkableReference v1_10 = ((m5.c) v0_1.d);
            ((i5.g) v1_10.c).h(((String) v1_10.b), v2_2, v0_1.a);
        }
        return;
    }

    private final void b()
    {
        android.content.SharedPreferences$Editor v0_1 = ((a2.b) this.b);
        try {
            android.content.SharedPreferences$Editor v2_2 = ((android.content.SharedPreferences) v0_1.b).edit();
            String v3_1 = ((String) v0_1.c);
            StringBuilder v4_1 = new StringBuilder();
            java.util.Iterator v5_2 = ((java.util.ArrayDeque) v0_1.e).iterator();
        } catch (android.content.SharedPreferences$Editor v0_4) {
            throw v0_4;
        }
        while (v5_2.hasNext()) {
            v4_1.append(((String) v5_2.next()));
            v4_1.append(((String) v0_1.d));
        }
        v2_2.putString(v3_1, v4_1.toString()).commit();
        return;
    }

    public final void run()
    {
        Object v4_19 = 0;
        switch (this.a) {
            case 0:
                Object v4_31;
                ClassCastException v0_64 = ((androidx.lifecycle.j0) this.b);
                java.util.ArrayList v2_59 = v0_64.f;
                if (v0_64.b != 0) {
                    v4_31 = 1;
                } else {
                    v4_31 = 1;
                    v0_64.c = 1;
                    v2_59.e(androidx.lifecycle.n.ON_PAUSE);
                }
                if ((v0_64.a == 0) && (v0_64.c)) {
                    v2_59.e(androidx.lifecycle.n.ON_STOP);
                    v0_64.d = v4_31;
                }
                return;
            case 1:
                ClassCastException v0_62 = ((c.k) this.b);
                java.util.ArrayList v2_58 = v0_62.b;
                if (v2_58 != null) {
                    v2_58.run();
                    v0_62.b = 0;
                }
                return;
            case 2:
                c.p.a(((c.p) this.b));
                return;
            case 3:
                java.util.ArrayList v2_56 = ((android.app.Activity) this.b);
                if (!v2_56.isFinishing()) {
                    Object v4_30 = d0.c.g;
                    ClassCastException v0_51 = d0.c.f;
                    int v5_11 = android.os.Build$VERSION.SDK_INT;
                    if (v5_11 < 28) {
                        try {
                            if ((((v5_11 != 26) && (v5_11 != 27)) || (v0_51 != null)) && ((d0.c.e != null) || (d0.c.d != null))) {
                                int v13_5 = d0.c.c.get(v2_56);
                                if (v13_5 != 0) {
                                    Object v8_5 = d0.c.b.get(v2_56);
                                    if (v8_5 != null) {
                                        int v5_12;
                                        android.app.Application v9 = v2_56.getApplication();
                                        d0.b v10_2 = new d0.b(v2_56);
                                        v9.registerActivityLifecycleCallbacks(v10_2);
                                        v4_30.post(new b5.l(1, v10_2, v13_5));
                                        if ((v5_11 != 26) && (v5_11 != 27)) {
                                            v5_12 = 0;
                                        } else {
                                            v5_12 = 1;
                                        }
                                        if (v5_12 == 0) {
                                            v2_56.recreate();
                                        } else {
                                            Integer.valueOf(0);
                                            double v19 = 0;
                                            int v15 = 0;
                                            v0_51.invoke(v8_5, new Object[] {v13_5, Boolean.FALSE}));
                                        }
                                        v4_30.post(new b5.l(2, v9, v10_2));
                                        return;
                                    } else {
                                    }
                                } else {
                                }
                            }
                        } catch (Throwable) {
                        }
                        v2_56.recreate();
                    } else {
                        v2_56.recreate();
                    }
                }
                return;
            case 4:
                ClassCastException v0_40 = ((f1.d) ((f1.d) this.b).c.b);
                c4.b v6_3 = android.os.SystemClock.uptimeMillis();
                int v3_14 = v0_40.b;
                Object v8_0 = android.os.SystemClock.uptimeMillis();
                d0.b v10_0 = 0;
                while (v10_0 < v3_14.size()) {
                    int v26_1;
                    b5.l v11_2 = ((f1.g) v3_14.get(v10_0));
                    if (v11_2 != null) {
                        int v12_1 = v0_40.a;
                        int v13_1 = ((Long) v12_1.get(v11_2));
                        if (v13_1 != 0) {
                            if (v13_1.longValue() >= v8_0) {
                                v26_1 = v3_14;
                                v10_0++;
                                v3_14 = v26_1;
                                v4_19 = 0;
                            } else {
                                v12_1.remove(v11_2);
                            }
                        }
                        int v12_2 = v11_2.f;
                        if (v12_2 != 0) {
                            int v12_6;
                            int v12_3 = (v6_3 - v12_2);
                            v11_2.f = v6_3;
                            double v14_2 = f1.g.b().g;
                            if (v14_2 != 0) {
                                v12_6 = ((long) (((float) v12_3) / v14_2));
                            } else {
                                v12_6 = 2147483647;
                            }
                            long v23 = v12_6;
                            java.util.ArrayList v2_46;
                            if (!v11_2.l) {
                                v26_1 = v3_14;
                                if (v11_2.k == 2139095039) {
                                    java.util.ArrayList v2_31 = v11_2.j.a(((double) v11_2.b), ((double) v11_2.a), v23);
                                    v11_2.b = v2_31.a;
                                    v11_2.a = v2_31.b;
                                } else {
                                    long v32 = (v23 / 2);
                                    java.util.ArrayList v2_34 = v11_2.j.a(((double) v11_2.b), ((double) v11_2.a), v32);
                                    int v3_27 = v11_2.j;
                                    v3_27.i = ((double) v11_2.k);
                                    v11_2.k = 2139095039;
                                    java.util.ArrayList v2_36 = v3_27.a(((double) v2_34.a), ((double) v2_34.b), v32);
                                    v11_2.b = v2_36.a;
                                    v11_2.a = v2_36.b;
                                }
                                java.util.ArrayList v2_40 = Math.max(v11_2.b, -8388609);
                                v11_2.b = v2_40;
                                java.util.ArrayList v2_42 = Math.min(v2_40, 2139095039);
                                v11_2.b = v2_42;
                                int v3_30 = v11_2.a;
                                Object v4_18 = v11_2.j;
                                v4_18.getClass();
                                if ((((double) Math.abs(v3_30)) >= v4_18.e) || (((double) Math.abs((v2_42 - ((float) v4_18.i)))) >= v4_18.d)) {
                                    v2_46 = 0;
                                } else {
                                    v11_2.b = ((float) v11_2.j.i);
                                    v11_2.a = 0;
                                    v2_46 = 1;
                                }
                            } else {
                                int v12_17 = v11_2.k;
                                if (v12_17 == 2139095039) {
                                    v26_1 = v3_14;
                                } else {
                                    v26_1 = v3_14;
                                    v11_2.j.i = ((double) v12_17);
                                    v11_2.k = 2139095039;
                                }
                                v11_2.b = ((float) v11_2.j.i);
                                v11_2.a = 0;
                                v11_2.l = v4_19;
                            }
                            int v3_34 = Math.min(v11_2.b, 2139095039);
                            v11_2.b = v3_34;
                            int v3_35 = Math.max(v3_34, -8388609);
                            v11_2.b = v3_35;
                            v11_2.c(v3_35);
                            if (v2_46 != null) {
                                java.util.ArrayList v2_53 = v11_2.h;
                                v11_2.e = 0;
                                int v3_36 = f1.g.b();
                                v3_36.a.remove(v11_2);
                                Object v4_25 = v3_36.b;
                                int v5_9 = v4_25.indexOf(v11_2);
                                if (v5_9 >= 0) {
                                    v4_25.set(v5_9, 0);
                                    v3_36.f = 1;
                                }
                                v11_2.f = 0;
                                int v3_38 = 0;
                                while (v3_38 < v2_53.size()) {
                                    if (v2_53.get(v3_38) != null) {
                                        v2_53.get(v3_38).getClass();
                                        throw new ClassCastException();
                                    } else {
                                        v3_38++;
                                    }
                                }
                                int v3_40 = (v2_53.size() - 1);
                                while (v3_40 >= 0) {
                                    if (v2_53.get(v3_40) == null) {
                                        v2_53.remove(v3_40);
                                    }
                                    v3_40--;
                                }
                            }
                        } else {
                            v11_2.f = v6_3;
                            v11_2.c(v11_2.b);
                        }
                    }
                }
                int v3_15;
                int v26_0 = v3_14;
                if (!v0_40.f) {
                    v3_15 = v26_0;
                } else {
                    java.util.ArrayList v2_18 = (v26_0.size() - 1);
                    while (v2_18 >= null) {
                        int v3_19 = v26_0;
                        if (v3_19.get(v2_18) == null) {
                            v3_19.remove(v2_18);
                        }
                        v2_18--;
                        v26_0 = v3_19;
                    }
                    v3_15 = v26_0;
                    if ((v3_15.size() == 0) && (android.os.Build$VERSION.SDK_INT >= 33)) {
                        v0_40.h.a();
                    }
                    v0_40.f = 0;
                }
                if (v3_15.size() > 0) {
                    ((android.view.Choreographer) v0_40.e.b).postFrameCallback(new f1.c(v0_40.d));
                }
                return;
            case 5:
                java.util.ArrayList v2_12 = ((g1.p) this.b);
                if (v2_12.h != null) {
                    try {
                        int v5_5 = v2_12.c();
                        c4.b v6_0 = v5_5.e;
                    } catch (ClassCastException v0_32) {
                        Object v4_9 = v2_12.h;
                        if (v4_9 != null) {
                            v4_9.H(v0_32);
                        }
                        v2_12.b();
                    }
                    if (v6_0 == 2) {
                    }
                    if (v6_0 != null) {
                        Object v4_4 = new StringBuilder("fetchFonts result is not OK. (");
                        v4_4.append(v6_0);
                        v4_4.append(")");
                        throw new RuntimeException(v4_4.toString());
                    } else {
                        android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        int v3_9 = v2_12.a;
                        v2_12.c.getClass();
                        ClassCastException v0_22 = new n0.i[] {v5_5});
                        j5.t1.c("TypefaceCompat.createFromFontInfo");
                        ClassCastException v0_24 = h0.e.a.s(v3_9, v0_22, 0);
                        android.os.Trace.endSection();
                        int v3_11 = j5.t1.N(v2_12.a, v5_5.a);
                        if ((v3_11 == 0) || (v0_24 == null)) {
                            throw new RuntimeException("Unable to open file.");
                        } else {
                            try {
                                android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                Object v4_8 = new j6.s(v0_24, c4.b.R(v3_11));
                            } catch (ClassCastException v0_28) {
                                android.os.Trace.endSection();
                                throw v0_28;
                            }
                            android.os.Trace.endSection();
                            android.os.Trace.endSection();
                            ClassCastException v0_30 = v2_12.h;
                            if (v0_30 != null) {
                                v0_30.K(v4_8);
                            }
                            v2_12.b();
                        }
                    }
                } else {
                }
                return;
            case 6:
                ClassCastException v0_11 = ((com.chilllive.chillwallpaperproject.MainActivity) this.b);
                v0_11.T.K1 = 1;
                v0_11.r.postDelayed(v0_11.s, ((long) 1181376512));
                return;
            case 7:
                com.google.android.material.button.MaterialButton.a(((com.google.android.material.button.MaterialButton) this.b));
                return;
            case 8:
                this.a();
                return;
            case 9:
                ((com.google.android.material.carousel.CarouselLayoutManager) this.b).o0();
                return;
            case 10:
                this.b();
                return;
            case 11:
                ClassCastException v0_3 = ((j6.e0) this.b);
                Object v4_1 = new StringBuilder("Service took too long to process intent: ");
                v4_1.append(v0_3.a.getAction());
                v4_1.append(" finishing.");
                android.util.Log.w("FirebaseMessaging", v4_1.toString());
                v0_3.b.trySetResult(0);
                return;
            case 12:
                java.util.ArrayList v2_57 = "";
                ClassCastException v0_58 = ((l2.a0) ((a2.m) this.b).b);
                c4.b v6_6 = v0_58.p;
                if (v6_6 != null) {
                    if (v6_6 != 1) {
                        if (v6_6 != 2) {
                            if (v6_6 != 3) {
                                if (v6_6 != 4) {
                                    if (v6_6 != 5) {
                                        if (v6_6 != 6) {
                                            if (v6_6 != 7) {
                                                if (v6_6 != 8) {
                                                    if (v6_6 != 9) {
                                                        v4_19 = 1;
                                                    } else {
                                                        v2_57 = v0_58.j0;
                                                    }
                                                } else {
                                                    v2_57 = v0_58.i0;
                                                    v4_19 = v0_58.s1;
                                                }
                                            } else {
                                                v2_57 = v0_58.h0;
                                            }
                                        } else {
                                            v2_57 = v0_58.g0;
                                        }
                                    } else {
                                        v2_57 = v0_58.f0;
                                        v4_19 = v0_58.r1;
                                    }
                                } else {
                                    v2_57 = v0_58.e0;
                                    v4_19 = v0_58.q1;
                                }
                            } else {
                                v2_57 = v0_58.c0;
                                v4_19 = v0_58.p1;
                            }
                        } else {
                            v2_57 = v0_58.d0;
                            v4_19 = v0_58.o1;
                        }
                    } else {
                        v2_57 = v0_58.b0;
                    }
                } else {
                    v2_57 = v0_58.a0;
                }
                if (v4_19 == null) {
                    java.util.ArrayList v2_61 = u.e.b(v2_57);
                    v2_61.append(v0_58.D1);
                    v2_57 = v2_61.toString();
                }
                v0_58.f2.setText(v2_57);
                if (v0_58.p != 0) {
                    i2.y.g(v0_58.q2, 250);
                    i2.y.g(v0_58.r2, 250);
                } else {
                    i2.y.f(v0_58.q2);
                    i2.y.f(v0_58.r2);
                }
                java.util.ArrayList v2_7 = v0_58.v.getBoolean(v0_58.getString(2131951838), 1);
                v0_58.q2.setSelected(v2_7);
                v0_58.r2.setSelected((v2_7 ^ 1));
                return;
            case 13:
                ClassCastException v0_44 = ((h3.e) this.b);
                v0_44.c = 0;
                java.util.ArrayList v2_41 = ((com.google.android.material.sidesheet.SideSheetBehavior) v0_44.e);
                Object v4_20 = v2_41.i;
                if ((v4_20 == null) || (!v4_20.f())) {
                    if (v2_41.h == 2) {
                        v2_41.w(v0_44.b);
                    }
                } else {
                    v0_44.a(v0_44.b);
                }
                return;
            case 14:
                ClassCastException v0_41 = ((j6.s) this.b);
                ((y2.h) ((z2.c) v0_41.e)).y(new a5.a(v0_41, 25));
                return;
            case 15:
                ClassCastException v0_23 = ((com.google.android.material.slider.Slider) this.b);
                v0_23.setActiveThumbIndex(-1);
                v0_23.invalidate();
                return;
            case 16:
                ((z3.d) this.b).s(1);
                return;
            case 17:
                ClassCastException v0_69 = ((z3.k) this.b);
                java.util.ArrayList v2_5 = v0_69.h.isPopupShowing();
                v0_69.s(v2_5);
                v0_69.m = v2_5;
                return;
            default:
                ((com.google.android.material.textfield.TextInputLayout) this.b).e.requestLayout();
                return;
        }
    }
}
