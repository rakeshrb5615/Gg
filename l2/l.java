package l2;
public final synthetic class l implements android.view.View$OnClickListener {
    public final synthetic int a;
    public final synthetic l2.a0 b;
    public final synthetic android.view.View c;

    public synthetic l(l2.a0 p1, android.view.View p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final void onClick(android.view.View p19)
    {
        switch (this.a) {
            case 0:
                l2.f0 v1_19 = this.b;
                v1_19.f();
                v1_19.v.getInt(v1_19.J0, 240);
                android.content.SharedPreferences$Editor v3_0 = v1_19.a;
                v1_19.v1.getClass();
                String v2_12 = ((android.net.ConnectivityManager) v3_0.getSystemService("connectivity"));
                if (v2_12 == null) {
                    v1_19.k();
                    android.widget.Toast.makeText(v1_19.a, 2131952456, 0).show();
                } else {
                    String v2_22 = v2_12.getActiveNetworkInfo();
                    if ((v2_22 == null) || (!v2_22.isConnectedOrConnecting())) {
                    } else {
                        if ((!v1_19.j1) && ((!v1_19.k1) && ((!v1_19.l1) && ((!v1_19.m1) && (!v1_19.n1))))) {
                            v1_19.k();
                            android.widget.Toast.makeText(v1_19.a, 2131952206, 0).show();
                        } else {
                            String v2_44 = v1_19.Z.b();
                            if (((!c4.b.H(v2_44)) && ((!c4.b.I(v2_44)) && (!c4.b.J(v2_44)))) || (!v1_19.v.getBoolean(v1_19.H0, 0))) {
                                v1_19.k();
                                v1_19.H();
                                return;
                            } else {
                                String v2_50 = v1_19.v.getBoolean(v1_19.I0, 0);
                                v1_19.v.edit().putBoolean(v1_19.I0, (v2_50 ^ 1)).apply();
                                String v5_17 = this.c;
                                if (v2_50 != null) {
                                    v5_17.setSelected(0);
                                    v1_19.k();
                                } else {
                                    v5_17.setSelected(1);
                                }
                            }
                        }
                        long v12;
                        String v2_52 = v1_19.v.getString(v1_19.E1, 0);
                        String v5_20 = v1_19.v.getString(v1_19.F1, 0);
                        if (v2_52 == null) {
                            v12 = 4651998512748167168;
                        } else {
                            v12 = Double.parseDouble(v2_52);
                        }
                        long v14;
                        if (v5_20 == null) {
                            v14 = 4651998512748167168;
                        } else {
                            v14 = Double.parseDouble(v5_20);
                        }
                        String v2_1 = v1_19.v.getBoolean(v1_19.I0, 0);
                        String v5_2 = v1_19.v.getBoolean(v1_19.H0, 0);
                        if ((v2_1 == null) || (v5_2 == null)) {
                            if (v5_2 == null) {
                                v1_19.k();
                                v1_19.H();
                            }
                        } else {
                            String v5_6;
                            String v2_4 = v1_19.v.getString(v1_19.n0, v1_19.getString(2131951825));
                            if ((!v1_19.k1) && (!v1_19.n1)) {
                                v5_6 = 10;
                            } else {
                                v5_6 = 1;
                            }
                            String v2_9;
                            v1_19.w1.getClass();
                            boolean v9_5 = m2.a.f(v5_6, v2_4);
                            if ((!v2_4.equals("failed")) && ((v12 == 4651998512748167168) || (v14 == 4651998512748167168))) {
                                v2_9 = 0;
                            } else {
                                v2_9 = 1;
                            }
                            if ((!v9_5) || (v2_9 == null)) {
                                String v4_2;
                                String v2_14 = u.e.b(v1.a.n(new StringBuilder(), v1_19.L0, " "));
                                if (v5_6 != 1) {
                                    String v4_1 = new StringBuilder();
                                    v4_1.append(v5_6);
                                    v4_1.append(v1_19.M0);
                                    v4_2 = v4_1.toString();
                                } else {
                                    v4_2 = "";
                                }
                                v2_14.append(v4_2);
                                android.widget.Toast.makeText(v1_19.a, v2_14.toString(), 0).show();
                                String v2_18 = v1_19.v.getString(v1_19.R0, 0);
                                android.content.SharedPreferences$Editor v3_4 = v1_19.v.edit();
                                v3_4.putString(v1_19.k0, v2_18);
                                v3_4.apply();
                            } else {
                                v1_19.u1.c(v12, v14, 1, new i2.m(v1_19, 1));
                            }
                        }
                        v1_19.w();
                        v1_19.B2.f();
                        v1_19.D2.f();
                    }
                }
                return;
            default:
                l2.f0 v1_2 = this.c;
                i2.y.b(v1_2);
                if (!v1_2.isSelected()) {
                    String v2_29;
                    String v5_8 = this.b;
                    String v4_5 = 0;
                    if (v1_2.getId() != 2131362523) {
                        if (v1_2.getId() != 2131362533) {
                            if (v1_2.getId() != 2131362536) {
                                if (v1_2.getId() != 2131362534) {
                                    if (v1_2.getId() != 2131362543) {
                                        v2_29 = 0;
                                    } else {
                                        v2_29 = v5_8.e2;
                                    }
                                } else {
                                    v2_29 = v5_8.b2;
                                }
                            } else {
                                v2_29 = v5_8.c2;
                            }
                        } else {
                            v2_29 = v5_8.a2;
                        }
                    } else {
                        v2_29 = v5_8.d2;
                    }
                    if (v2_29 != null) {
                        v5_8.A.setSelected(0);
                        v5_8.B.setSelected(0);
                        v5_8.C.setSelected(0);
                        v5_8.z.setSelected(0);
                        v5_8.D.setSelected(0);
                        v1_2.setSelected(1);
                        int v6_1 = v5_8.getChildFragmentManager();
                        String v8_1 = v6_1.B(v2_29);
                        v5_8.K2 = v8_1;
                        if (v8_1 != null) {
                            String v7_2 = ((androidx.fragment.app.e0) v6_1.c.f().stream().filter(new i2.g0()).findFirst().orElse(0));
                            if (v7_2 != null) {
                                v4_5 = v7_2.getView();
                            }
                            l2.f0 v1_10 = v4_5;
                            String v2_34 = v8_1.getView();
                            if (v7_2 != null) {
                                i2.y.g(v5_8.d, 200);
                            }
                            String v4_8 = new i2.e(v5_8, v6_1, v7_2, v8_1, 3);
                            if (v2_34 != null) {
                                v2_34.setAlpha(0);
                                if (v1_10 == null) {
                                    v4_8.run();
                                    v2_34.animate().alpha(1065353216).setDuration(((long) 400)).start();
                                } else {
                                    v1_10.animate().alpha(0).setDuration((((long) 400) / 2)).withEndAction(new g5.r(v4_8, v2_34, ((long) 400))).start();
                                }
                            }
                        }
                        v5_8.r();
                    }
                }
                return;
        }
    }
}
