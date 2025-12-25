package androidx.appcompat.widget;
public class ContentFrameLayout extends android.widget.FrameLayout {
    public android.util.TypedValue a;
    public android.util.TypedValue b;
    public android.util.TypedValue c;
    public android.util.TypedValue d;
    public android.util.TypedValue e;
    public android.util.TypedValue f;
    public final android.graphics.Rect m;
    public n.i1 n;

    public ContentFrameLayout(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3, 0);
        super.m = new android.graphics.Rect();
        return;
    }

    public android.util.TypedValue getFixedHeightMajor()
    {
        if (this.e == null) {
            this.e = new android.util.TypedValue();
        }
        return this.e;
    }

    public android.util.TypedValue getFixedHeightMinor()
    {
        if (this.f == null) {
            this.f = new android.util.TypedValue();
        }
        return this.f;
    }

    public android.util.TypedValue getFixedWidthMajor()
    {
        if (this.c == null) {
            this.c = new android.util.TypedValue();
        }
        return this.c;
    }

    public android.util.TypedValue getFixedWidthMinor()
    {
        if (this.d == null) {
            this.d = new android.util.TypedValue();
        }
        return this.d;
    }

    public android.util.TypedValue getMinWidthMajor()
    {
        if (this.a == null) {
            this.a = new android.util.TypedValue();
        }
        return this.a;
    }

    public android.util.TypedValue getMinWidthMinor()
    {
        if (this.b == null) {
            this.b = new android.util.TypedValue();
        }
        return this.b;
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        n.i1 v0 = this.n;
        if (v0 != null) {
            v0.getClass();
        }
        return;
    }

    public final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        m.m v0_0 = this.n;
        if (v0_0 != null) {
            m.m v0_2 = ((h.r) v0_0).b;
            m.u v1_16 = v0_2.x;
            if (v1_16 != null) {
                m.u v1_17 = ((androidx.appcompat.widget.ActionBarOverlayLayout) v1_16);
                v1_17.k();
                m.u v1_2 = ((n.f3) v1_17.e).a.a;
                if (v1_2 != null) {
                    m.u v1_3 = v1_2.z;
                    if (v1_3 != null) {
                        v1_3.c();
                        m.u v1_4 = v1_3.z;
                        if ((v1_4 != null) && (v1_4.b())) {
                            v1_4.i.dismiss();
                        }
                    }
                }
            }
            if (v0_2.C != null) {
                v0_2.r.getDecorView().removeCallbacks(v0_2.D);
                try {
                    if (v0_2.C.isShowing()) {
                        v0_2.C.dismiss();
                    }
                } catch (IllegalArgumentException) {
                }
                v0_2.C = 0;
            }
            m.u v1_13 = v0_2.E;
            if (v1_13 != null) {
                v1_13.b();
            }
            m.m v0_4 = v0_2.C(0).h;
            if (v0_4 != null) {
                v0_4.c(1);
            }
        }
        return;
    }

    public final void onMeasure(int p17, int p18)
    {
        int v2_2;
        int v1_6 = this.getContext().getResources().getDisplayMetrics();
        int v4 = 1;
        if (v1_6.widthPixels >= v1_6.heightPixels) {
            v2_2 = 0;
        } else {
            v2_2 = 1;
        }
        int v12_3;
        int v13_3;
        int v3_2 = android.view.View$MeasureSpec.getMode(p17);
        int v6_0 = android.view.View$MeasureSpec.getMode(p18);
        android.graphics.Rect v7 = this.m;
        if (v3_2 != -2147483648) {
            v12_3 = p17;
            v13_3 = 0;
        } else {
            int v12_0;
            if (v2_2 == 0) {
                v12_0 = this.c;
            } else {
                v12_0 = this.d;
            }
            if (v12_0 == 0) {
            } else {
                int v13_0 = v12_0.type;
                if (v13_0 == 0) {
                } else {
                    int v12_1;
                    int v12_2;
                    if (v13_0 != 5) {
                        if (v13_0 != 6) {
                            v12_1 = 0;
                        } else {
                            int v13_1 = v1_6.widthPixels;
                            v12_2 = v12_0.getFraction(((float) v13_1), ((float) v13_1));
                            v12_1 = ((int) v12_2);
                        }
                    } else {
                        v12_2 = v12_0.getDimension(v1_6);
                    }
                    if (v12_1 <= 0) {
                    } else {
                        v12_3 = android.view.View$MeasureSpec.makeMeasureSpec(Math.min((v12_1 - (v7.left + v7.right)), android.view.View$MeasureSpec.getSize(p17)), 1073741824);
                        v13_3 = 1;
                    }
                }
            }
        }
        int v6_4;
        if (v6_0 != -2147483648) {
            v6_4 = p18;
        } else {
            int v6_1;
            if (v2_2 == 0) {
                v6_1 = this.f;
            } else {
                v6_1 = this.e;
            }
            if (v6_1 == 0) {
            } else {
                int v14_3 = v6_1.type;
                if (v14_3 == 0) {
                } else {
                    int v6_2;
                    int v6_3;
                    if (v14_3 != 5) {
                        if (v14_3 != 6) {
                            v6_2 = 0;
                        } else {
                            int v14_4 = v1_6.heightPixels;
                            v6_3 = v6_1.getFraction(((float) v14_4), ((float) v14_4));
                            v6_2 = ((int) v6_3);
                        }
                    } else {
                        v6_3 = v6_1.getDimension(v1_6);
                    }
                    if (v6_2 <= 0) {
                    } else {
                        v6_4 = android.view.View$MeasureSpec.makeMeasureSpec(Math.min((v6_2 - (v7.top + v7.bottom)), android.view.View$MeasureSpec.getSize(p18)), 1073741824);
                    }
                }
            }
        }
        super.onMeasure(v12_3, v6_4);
        int v12_6 = this.getMeasuredWidth();
        int v14_0 = android.view.View$MeasureSpec.makeMeasureSpec(v12_6, 1073741824);
        if ((v13_3 != 0) || (v3_2 != -2147483648)) {
            v4 = 0;
        } else {
            int v2_4;
            if (v2_2 == 0) {
                v2_4 = this.a;
            } else {
                v2_4 = this.b;
            }
            if (v2_4 == 0) {
            } else {
                int v3_4 = v2_4.type;
                if (v3_4 == 0) {
                } else {
                    int v1_3;
                    int v1_0;
                    if (v3_4 != 5) {
                        if (v3_4 != 6) {
                            v1_0 = 0;
                        } else {
                            int v1_1 = v1_6.widthPixels;
                            v1_3 = v2_4.getFraction(((float) v1_1), ((float) v1_1));
                            v1_0 = ((int) v1_3);
                        }
                    } else {
                        v1_3 = v2_4.getDimension(v1_6);
                    }
                    if (v1_0 > 0) {
                        v1_0 -= (v7.left + v7.right);
                    }
                    if (v12_6 >= v1_0) {
                    } else {
                        v14_0 = android.view.View$MeasureSpec.makeMeasureSpec(v1_0, 1073741824);
                    }
                }
            }
        }
        if (v4 != 0) {
            super.onMeasure(v14_0, v6_4);
        }
        return;
    }

    public void setAttachListener(n.i1 p1)
    {
        this.n = p1;
        return;
    }
}
