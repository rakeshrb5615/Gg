package l2;
public final synthetic class i implements i3.g {
    public final synthetic int a;
    public final synthetic l2.a0 b;

    public synthetic i(l2.a0 p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public final void a(int p6, boolean p7)
    {
        switch (this.a) {
            case 0:
                l2.a0 v0_1 = this.b;
                if (p7 == 0) {
                    v0_1.getClass();
                } else {
                    int v7_15 = v0_1.v.getBoolean(v0_1.H0, 0);
                    boolean vtmp2 = v0_1.v.getBoolean(v0_1.I0, 0);
                    if (v7_15 != 0) {
                        if ((vtmp2) || ((!v0_1.B2.isVisible()) && (!v0_1.D2.isVisible()))) {
                            if ((p6 != 2131362350) || (v0_1.n1)) {
                                if ((p6 != 2131362347) || ((v0_1.j1) || (v0_1.n1))) {
                                    int v6_1;
                                    if (p6 != 2131362350) {
                                        if (p6 != 2131362347) {
                                            if (p6 != 2131362345) {
                                                if (p6 != 2131362346) {
                                                    if (p6 != 2131362348) {
                                                        v6_1 = 240;
                                                    } else {
                                                        v6_1 = 180;
                                                    }
                                                } else {
                                                    v6_1 = 120;
                                                }
                                            } else {
                                                v6_1 = 60;
                                            }
                                        } else {
                                            v6_1 = 30;
                                        }
                                    } else {
                                        v6_1 = 5;
                                    }
                                    v0_1.v.edit().putInt(v0_1.J0, v6_1).apply();
                                    if (v0_1.B2.isVisible()) {
                                        v0_1.B2.f();
                                    }
                                    if (v0_1.D2.isVisible()) {
                                        v0_1.D2.f();
                                    }
                                } else {
                                    v0_1.I();
                                }
                            } else {
                                v0_1.I();
                            }
                        } else {
                            android.widget.Toast.makeText(v0_1.a, 2131952458, 0).show();
                        }
                    } else {
                        v0_1.H();
                    }
                }
                return;
            default:
                l2.a0 v0_2 = this.b;
                if ((!v0_2.O2) && (p7 != 0)) {
                    String v1_12;
                    int v7_14 = v0_2.C2.b;
                    boolean v2_3 = 1;
                    if (p6 != 2131362315) {
                        if (p6 != 2131362311) {
                            v1_12 = 0;
                            v2_3 = 0;
                        } else {
                            v1_12 = 0;
                        }
                    } else {
                        v1_12 = 1;
                        v2_3 = 0;
                    }
                    v7_14[0].setEnabled(v2_3);
                    v0_2.v.edit().putBoolean(v0_2.P0, v1_12).putBoolean(v0_2.Q0, v2_3).apply();
                    v0_2.g(v0_2.n2, p6);
                    v0_2.i(v7_14);
                }
                return;
        }
    }
}
