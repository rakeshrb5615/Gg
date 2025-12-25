package androidx.fragment.app;
public final class h extends androidx.fragment.app.i {
    public final boolean c;
    public boolean d;
    public androidx.fragment.app.k0 e;

    public h(androidx.fragment.app.y1 p1, m0.d p2, boolean p3)
    {
        super(p1, p2);
        super.c = p3;
        return;
    }

    public final androidx.fragment.app.k0 c(android.content.Context p9)
    {
        if (!this.d) {
            int v0_1;
            int v0_2 = this.a;
            int v1_1 = v0_2.c;
            if (v0_2.a != 2) {
                v0_1 = 0;
            } else {
                v0_1 = 1;
            }
            int v5_1;
            androidx.fragment.app.k0 v2_2 = v1_1.getNextTransition();
            if (!this.c) {
                if (v0_1 == 0) {
                    v5_1 = v1_1.getExitAnim();
                } else {
                    v5_1 = v1_1.getEnterAnim();
                }
            } else {
                if (v0_1 == 0) {
                    v5_1 = v1_1.getPopExitAnim();
                } else {
                    v5_1 = v1_1.getPopEnterAnim();
                }
            }
            v1_1.setAnimations(0, 0, 0, 0);
            android.view.animation.Animation v3_0 = v1_1.mContainer;
            androidx.fragment.app.k0 v6_1 = 0;
            if ((v3_0 != null) && (v3_0.getTag(2131362602) != null)) {
                v1_1.mContainer.setTag(2131362602, 0);
            }
            android.view.animation.Animation v3_3 = v1_1.mContainer;
            if ((v3_3 == null) || (v3_3.getLayoutTransition() == null)) {
                android.view.animation.Animation v3_5 = v1_1.onCreateAnimation(v2_2, v0_1, v5_1);
                if (v3_5 == null) {
                    int v1_2 = v1_1.onCreateAnimator(v2_2, v0_1, v5_1);
                    if (v1_2 == 0) {
                        if ((v5_1 == 0) && (v2_2 != null)) {
                            int v0_4;
                            if (v2_2 == 4097) {
                                if (v0_1 == 0) {
                                    v0_4 = 2130837514;
                                } else {
                                    v0_4 = 2130837513;
                                }
                            } else {
                                if (v2_2 == 8194) {
                                    if (v0_1 == 0) {
                                        v0_4 = 2130837510;
                                    } else {
                                        v0_4 = 2130837509;
                                    }
                                } else {
                                    if (v2_2 == 8197) {
                                        if (v0_1 == 0) {
                                            v0_4 = c4.b.f0(p9, 16842939);
                                        } else {
                                            v0_4 = c4.b.f0(p9, 16842938);
                                        }
                                    } else {
                                        if (v2_2 == 4099) {
                                            if (v0_1 == 0) {
                                                v0_4 = 2130837512;
                                            } else {
                                                v0_4 = 2130837511;
                                            }
                                        } else {
                                            if (v2_2 == 4100) {
                                                if (v0_1 == 0) {
                                                    v0_4 = c4.b.f0(p9, 16842937);
                                                } else {
                                                    v0_4 = c4.b.f0(p9, 16842936);
                                                }
                                            } else {
                                                v0_4 = -1;
                                            }
                                        }
                                    }
                                }
                            }
                            v5_1 = v0_4;
                        }
                        if (v5_1 != 0) {
                            androidx.fragment.app.k0 v2_1;
                            int v0_11 = "anim".equals(p9.getResources().getResourceTypeName(v5_1));
                            if (v0_11 == 0) {
                                try {
                                    int v1_10 = android.animation.AnimatorInflater.loadAnimator(p9, v5_1);
                                } catch (int v1_0) {
                                    if (v0_11 != 0) {
                                        throw v1_0;
                                    } else {
                                        android.view.animation.Animation v9_1 = android.view.animation.AnimationUtils.loadAnimation(p9, v5_1);
                                        if (v9_1 == null) {
                                            this.e = v6_1;
                                            this.d = 1;
                                            return v6_1;
                                        } else {
                                            v6_1 = new androidx.fragment.app.k0(v9_1);
                                            this.e = v6_1;
                                            this.d = 1;
                                            return v6_1;
                                        }
                                    }
                                }
                                if (v1_10 == 0) {
                                    this.e = v6_1;
                                    this.d = 1;
                                    return v6_1;
                                } else {
                                    v2_1 = new androidx.fragment.app.k0(v1_10);
                                }
                            } else {
                                try {
                                    int v1_9 = android.view.animation.AnimationUtils.loadAnimation(p9, v5_1);
                                } catch (android.view.animation.Animation v9_2) {
                                    throw v9_2;
                                }
                                if (v1_9 == 0) {
                                    this.e = v6_1;
                                    this.d = 1;
                                    return v6_1;
                                } else {
                                    v2_1 = new androidx.fragment.app.k0(v1_9);
                                }
                            }
                            v6_1 = v2_1;
                        }
                    } else {
                        v6_1 = new androidx.fragment.app.k0(v1_2);
                    }
                } else {
                    v6_1 = new androidx.fragment.app.k0(v3_5);
                }
            }
            this.e = v6_1;
            this.d = 1;
            return v6_1;
        } else {
            return this.e;
        }
    }
}
