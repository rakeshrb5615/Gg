package androidx.fragment.app;
public final synthetic class l implements java.lang.Runnable {
    public final synthetic int a;
    public final synthetic Object b;
    public final synthetic Object c;
    public final synthetic Object d;

    public synthetic l(Object p1, Object p2, Object p3, int p4)
    {
        this.a = p4;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        return;
    }

    public final void run()
    {
        switch (this.a) {
            case 0:
                Throwable v0_34 = ((androidx.fragment.app.n) this.b);
                boolean v1_10 = ((android.view.View) this.c);
                boolean v2_84 = ((androidx.fragment.app.h) this.d);
                kotlin.jvm.internal.j.e(v0_34, "this$0");
                kotlin.jvm.internal.j.e(v2_84, "$animationInfo");
                v0_34.a.endViewTransition(v1_10);
                v2_84.a();
                return;
            case 1:
                boolean v1_8 = ((q4.b) this.c);
                boolean v2_80 = ((java.util.concurrent.ThreadPoolExecutor) this.d);
                try {
                    Throwable v0_25 = j5.t1.k(((c4.f) this.b).a);
                } catch (Throwable v0_32) {
                    v1_8.H(v0_32);
                    v2_80.shutdown();
                    return;
                }
                if (v0_25 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } else {
                    ((g1.p) ((g1.h) v0_25.b)).f = v2_80;
                    ((g1.h) v0_25.b).a(new g1.k(v1_8, v2_80));
                    return;
                }
            case 2:
                Throwable v0_44 = ((com.chilllive.chillwallpaperproject.MainActivity) this.b);
                int v3_25 = ((String) this.c);
                String v4_5 = ((android.content.SharedPreferences) this.d);
                v0_44.T.c(v3_25);
                if (((!v3_25.contains(v0_44.E)) || (v4_5.getInt(v0_44.E, 0) != 100)) && ((!v3_25.contains(v0_44.F)) || (v4_5.getInt(v0_44.F, 1) != 100))) {
                    if ((v3_25.contains(v0_44.E)) && (v4_5.getInt(v0_44.E, 0) == 7)) {
                        v0_44.T.k2 = 1;
                    }
                    if ((!v3_25.equals(v0_44.u)) && (!v3_25.equals(v0_44.C))) {
                        if (!v3_25.equals(v0_44.v)) {
                            if (!v3_25.equals(v0_44.x)) {
                                if (!v3_25.equals(v0_44.w)) {
                                    if (v3_25.equals(v0_44.getString(2131952499))) {
                                        v0_44.m.w.E = v4_5.getBoolean(v0_44.getString(2131952499), 1);
                                    }
                                } else {
                                    boolean v2_9 = v0_44.m;
                                    boolean vtmp24 = v4_5.getBoolean(v0_44.w, 1);
                                    boolean v2_10 = v2_9.m;
                                    if (v2_10) {
                                        v2_10.s = vtmp24;
                                    }
                                }
                            } else {
                                boolean v2_11 = v0_44.m;
                                boolean vtmp20 = v4_5.getBoolean(v0_44.x, 1);
                                boolean v2_12 = v2_11.s;
                                if (v2_12) {
                                    v2_12.E = vtmp20;
                                }
                            }
                        } else {
                            boolean v2_13 = v0_44.m;
                            boolean vtmp16 = v4_5.getBoolean(v0_44.v, 1);
                            boolean v2_14 = v2_13.o;
                            if (v2_14) {
                                v2_14.W = vtmp16;
                            }
                        }
                    } else {
                        int v5_12 = v0_44.m;
                        int v6_1 = v4_5.getBoolean(v0_44.u, 1);
                        int v8_0 = v5_12.n;
                        if (v8_0 != 0) {
                            v8_0.B = v6_1;
                            int v5_13 = v5_12.v;
                            v5_13.M = v6_1;
                            v5_13.m0(0, 0);
                        }
                    }
                    boolean v2_16 = v0_44.m.r;
                    if (!v3_25.equals(v0_44.getString(2131952342))) {
                        if (!v3_25.equals(v0_44.getString(2131951784))) {
                            if (!v3_25.equals(v0_44.getString(2131952379))) {
                                if (v3_25.equalsIgnoreCase(v0_44.getString(2131951819))) {
                                    int v5_22 = v4_5.getBoolean(v3_25, 1);
                                    int v6_6 = v0_44.m;
                                    int v8_1 = v6_6.u;
                                    int v6_7 = v6_6.p;
                                    if (v8_1 != 0) {
                                        v8_1.v = v5_22;
                                    }
                                    if (v2_16) {
                                        int v8_3;
                                        v2_16.k0 = v5_22;
                                        if ((!v2_16.j0) || (v5_22 == 0)) {
                                            v8_3 = v2_16.z0;
                                        } else {
                                            v8_3 = v2_16.y0;
                                        }
                                        v2_16.A0 = v8_3;
                                    }
                                    if (v6_7 != 0) {
                                        v6_7.l0(v5_22);
                                    }
                                }
                            } else {
                                v0_44.T.b2 = (((float) v4_5.getInt(v3_25, 40)) * 1022739087);
                            }
                        } else {
                            int v6_12 = v0_44.m;
                            if (v6_12 != 0) {
                                int v6_13 = v6_12.h;
                                if (v6_13 != 0) {
                                    v6_13.c0 = v4_5.getBoolean(v0_44.getString(2131951784), 1);
                                }
                            }
                        }
                    } else {
                        int v6_14 = v0_44.m;
                        if (v6_14 != 0) {
                            int v6_15 = v6_14.h;
                            if (v6_15 != 0) {
                                v6_15.b0 = v4_5.getBoolean(v0_44.getString(2131952342), 1);
                            }
                        }
                    }
                    if (v0_44.m != null) {
                        if (v2_16) {
                            v2_16.G = v4_5.getBoolean(v0_44.y, 1);
                        }
                        boolean v2_21 = v0_44.m.x;
                        if (v2_21) {
                            v2_21.G = v4_5.getBoolean(v0_44.z, 1);
                        }
                        boolean v2_22 = v0_44.m;
                        if (v2_22.q != null) {
                            v2_22.p0((((float) v4_5.getInt(v0_44.K, 0)) * 1008981770));
                        }
                    }
                    if ((v3_25.equals(v0_44.t)) || ((v3_25.contains(v0_44.A)) || ((v3_25.contains(v0_44.P)) || (v3_25.contains(v0_44.O))))) {
                        v0_44.T.J1 = 1;
                    }
                    if (v3_25.contains(v0_44.getString(2131951876))) {
                        v0_44.T.J1 = 1;
                    }
                    if (v3_25.equals(v0_44.N)) {
                        v0_44.T.I1 = 1;
                        v0_44.T.J1 = 1;
                    }
                    if (!v3_25.contains(v0_44.F)) {
                        if (!v3_25.contains(v0_44.G)) {
                            if ((!v3_25.contains(v0_44.H)) && (!v3_25.contains(v0_44.E))) {
                                if (!v3_25.contains(v0_44.I)) {
                                    if (!v3_25.contains(v0_44.B)) {
                                        if ((!v3_25.contains(v0_44.C)) && ((!v3_25.contains(v0_44.D)) && (!v3_25.contains("waterParam")))) {
                                            if (!v3_25.contains(v0_44.J)) {
                                                if (v3_25.contains(v0_44.getString(2131951753))) {
                                                    Throwable v0_8 = v0_44.m.l;
                                                    if (v0_8 != null) {
                                                        v0_8.m0 = v4_5.getBoolean(v3_25, 1);
                                                    }
                                                }
                                            } else {
                                                v0_44.T.I1 = 1;
                                                v0_44.T.J1 = 1;
                                                Throwable v0_9 = v0_44.T;
                                                try {
                                                    v0_9.h();
                                                    v0_9.A();
                                                    v0_9.B();
                                                    v0_9.b();
                                                } catch (Throwable v0_10) {
                                                    throw v0_10;
                                                }
                                            }
                                        } else {
                                            v0_44.T.v();
                                        }
                                    } else {
                                        boolean v2_68 = v0_44.T.h;
                                        int v3_6 = v2_68.h.getInt(v2_68.k, 50);
                                        v2_68.x = v3_6;
                                        v2_68.a.v1 = v3_6;
                                        v0_44.T.J1 = 1;
                                    }
                                } else {
                                    v0_44.T.N1 = 1;
                                    v0_44.T.J1 = 1;
                                    v0_44.T.K1 = 1;
                                    v0_44.T.L1 = 1;
                                    v0_44.T.M1 = 1;
                                }
                            } else {
                                v0_44.T.I1 = 1;
                                v0_44.T.J1 = 1;
                                v0_44.T.K1 = 1;
                                v0_44.T.L1 = 1;
                            }
                        } else {
                            try {
                                v0_44.T.z();
                                v0_44.T.n(0, 0);
                                v0_44.T.I1 = 1;
                                v0_44.T.K1 = 1;
                            } catch (Throwable v0_17) {
                                throw v0_17;
                            }
                        }
                    } else {
                        v0_44.j();
                        if ((v3_25.contains(v0_44.F)) && (v0_44.S.getInt(v0_44.F, 1) == 5)) {
                            v0_44.T.l2 = 1;
                        }
                        v0_44.T.y();
                    }
                }
                return;
            case 3:
                Throwable v0_28 = ((com.chilllive.chillwallpaperproject.MainActivity) this.b);
                int v3_23 = ((androidx.fragment.app.e0) this.d);
                ((i2.e) this.c).run();
                Throwable v0_41 = v0_28.getSupportFragmentManager();
                v0_41.x(1);
                v0_41.C();
                v3_23.getView().setAlpha(1065353216);
                return;
            case 4:
                int v3_4 = ((com.google.android.gms.tasks.TaskCompletionSource) this.d);
                try {
                    ((j6.g) this.b).b(((android.content.Intent) this.c));
                    v3_4.setResult(0);
                    return;
                } catch (Throwable v0_15) {
                    v3_4.setResult(0);
                    throw v0_15;
                }
            case 5:
                ((com.google.android.gms.common.util.BiConsumer) this.b).accept(((String) this.c), ((n6.f) this.d));
                return;
            case 6:
                boolean v1_15 = ((z8.g) this.c);
                Throwable v0_2 = ((z8.n) ((n0.a) this.b).c);
                if (!v0_2.b.isCanceled()) {
                    v1_15.d(v0_2, ((z8.q0) this.d));
                } else {
                    v1_15.b(v0_2, new java.io.IOException("Canceled"));
                }
                return;
            default:
                ((z8.g) this.c).b(((z8.n) ((n0.a) this.b).c), ((Throwable) this.d));
                return;
        }
    }
}
