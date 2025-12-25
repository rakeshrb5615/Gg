package androidx.core.widget;
public class NestedScrollView extends android.widget.FrameLayout implements q0.s {
    public static final float I;
    public static final com.google.android.material.datepicker.h J;
    public static final int[] K;
    public final int[] A;
    public int B;
    public int C;
    public t0.g D;
    public final a2.o0 E;
    public final q0.q F;
    public float G;
    public final q0.h H;
    public final float a;
    public long b;
    public final android.graphics.Rect c;
    public final android.widget.OverScroller d;
    public final android.widget.EdgeEffect e;
    public final android.widget.EdgeEffect f;
    public q0.y m;
    public int n;
    public boolean o;
    public boolean p;
    public android.view.View q;
    public boolean r;
    public android.view.VelocityTracker s;
    public boolean t;
    public boolean u;
    public final int v;
    public final int w;
    public final int x;
    public int y;
    public final int[] z;

    static NestedScrollView()
    {
        androidx.core.widget.NestedScrollView.I = ((float) (Math.log(4605200834963974390) / Math.log(4606281698874543309)));
        androidx.core.widget.NestedScrollView.J = new com.google.android.material.datepicker.h(3);
        androidx.core.widget.NestedScrollView.K = new int[] {16843130});
        return;
    }

    public NestedScrollView(android.content.Context p7, android.util.AttributeSet p8)
    {
        android.widget.EdgeEffect v5_2;
        super(p7, p8, 2130969579);
        super.c = new android.graphics.Rect();
        super.o = 1;
        super.p = 0;
        super.q = 0;
        super.r = 0;
        super.u = 1;
        super.y = -1;
        int v4_0 = new int[2];
        super.z = v4_0;
        int[] v3_2 = new int[2];
        super.A = v3_2;
        super.H = new q0.h(super.getContext(), new j6.o(super, 16));
        int[] v3_5 = android.os.Build$VERSION.SDK_INT;
        if (v3_5 < 31) {
            v5_2 = new android.widget.EdgeEffect(p7);
        } else {
            v5_2 = t0.c.a(p7, p8);
        }
        int[] v3_7;
        super.e = v5_2;
        if (v3_5 < 31) {
            v3_7 = new android.widget.EdgeEffect(p7);
        } else {
            v3_7 = t0.c.a(p7, p8);
        }
        super.f = v3_7;
        super.a = (((p7.getResources().getDisplayMetrics().density * 1126170624) * 1136724797) * 1062668861);
        super.d = new android.widget.OverScroller(super.getContext());
        super.setFocusable(1);
        super.setDescendantFocusability(262144);
        super.setWillNotDraw(0);
        int[] v3_18 = android.view.ViewConfiguration.get(super.getContext());
        super.v = v3_18.getScaledTouchSlop();
        super.w = v3_18.getScaledMinimumFlingVelocity();
        super.x = v3_18.getScaledMaximumFlingVelocity();
        com.google.android.material.datepicker.h v7_1 = p7.obtainStyledAttributes(p8, androidx.core.widget.NestedScrollView.K, 2130969579, 0);
        super.setFillViewport(v7_1.getBoolean(0, 0));
        v7_1.recycle();
        super.E = new a2.o0();
        super.F = new q0.q(super);
        super.setNestedScrollingEnabled(1);
        q0.q0.n(super, androidx.core.widget.NestedScrollView.J);
        return;
    }

    private q0.y getScrollFeedbackProvider()
    {
        if (this.m == null) {
            this.m = new q0.y(this);
        }
        return this.m;
    }

    public static boolean l(android.view.View p1, androidx.core.widget.NestedScrollView p2)
    {
        if (p1 != p2) {
            int v1_2 = p1.getParent();
            if ((!(v1_2 instanceof android.view.ViewGroup)) || (!androidx.core.widget.NestedScrollView.l(((android.view.View) v1_2), p2))) {
                return 0;
            }
        }
        return 1;
    }

    public final void a(android.view.View p1, android.view.View p2, int p3, int p4)
    {
        q0.q v2_0 = this.E;
        if (p4 != 1) {
            v2_0.a = p3;
        } else {
            v2_0.b = p3;
        }
        this.F.g(2, p4);
        return;
    }

    public final void addView(android.view.View p2)
    {
        if (this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(p2);
            return;
        }
    }

    public final void addView(android.view.View p2, int p3)
    {
        if (this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(p2, p3);
            return;
        }
    }

    public final void addView(android.view.View p2, int p3, android.view.ViewGroup$LayoutParams p4)
    {
        if (this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(p2, p3, p4);
            return;
        }
    }

    public final void addView(android.view.View p2, android.view.ViewGroup$LayoutParams p3)
    {
        if (this.getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        } else {
            super.addView(p2, p3);
            return;
        }
    }

    public final void b(android.view.View p3, int p4)
    {
        a2.o0 v0 = this.E;
        if (p4 != 1) {
            v0.a = 0;
        } else {
            v0.b = 0;
        }
        this.w(p4);
        return;
    }

    public final void c(android.view.View p7, int p8, int p9, int[] p10, int p11)
    {
        this.F.c(p8, p9, p11, p10, 0);
        return;
    }

    public final int computeHorizontalScrollExtent()
    {
        return super.computeHorizontalScrollExtent();
    }

    public final int computeHorizontalScrollOffset()
    {
        return super.computeHorizontalScrollOffset();
    }

    public final int computeHorizontalScrollRange()
    {
        return super.computeHorizontalScrollRange();
    }

    public final void computeScroll()
    {
        if (!this.d.isFinished()) {
            int v3_3;
            this.d.computeScrollOffset();
            int v1_5 = this.d.getCurrY();
            int v2_3 = (v1_5 - this.C);
            int v3_0 = this.getHeight();
            android.widget.EdgeEffect v4 = this.e;
            android.widget.EdgeEffect v5 = this.f;
            if ((v2_3 <= 0) || (a.a.u(v4) == 0)) {
                if ((v2_3 < 0) && (a.a.u(v5) != 0)) {
                    int v3_1 = ((float) v3_0);
                    v3_3 = Math.round((a.a.N(v5, ((((float) v2_3) * 1082130432) / v3_1), 1056964608) * (v3_1 / 1082130432)));
                    if (v3_3 == v2_3) {
                        v2_3 -= v3_3;
                    } else {
                        v5.finish();
                    }
                }
            } else {
                v3_3 = Math.round((a.a.N(v4, ((((float) (- v2_3)) * 1082130432) / ((float) v3_0)), 1056964608) * (((float) (- v3_0)) / 1082130432)));
                if (v3_3 == v2_3) {
                } else {
                    v4.finish();
                }
            }
            int v8_2 = v2_3;
            this.C = v1_5;
            int v10_0 = this.A;
            v10_0[1] = 0;
            this.F.c(0, v8_2, 1, v10_0, 0);
            int[] v16 = v10_0;
            int v8_0 = (v8_2 - v16[1]);
            int v3_8 = this.getScrollRange();
            if (android.os.Build$VERSION.SDK_INT >= 35) {
                t0.e.a(this, Math.abs(this.d.getCurrVelocity()));
            }
            if (v8_0 != 0) {
                int v6_10 = this.getScrollY();
                this.p(v8_0, this.getScrollX(), v6_10, v3_8);
                int v11_1 = (this.getScrollY() - v6_10);
                int v13 = (v8_0 - v11_1);
                v16[1] = 0;
                this.F.d(0, v11_1, 0, v13, this.z, 1, v16);
                v8_0 = (v13 - v16[1]);
            }
            if (v8_0 != 0) {
                int v2_1 = this.getOverScrollMode();
                if ((v2_1 == 0) || ((v2_1 == 1) && (v3_8 > 0))) {
                    if (v8_0 >= 0) {
                        if (v5.isFinished()) {
                            v5.onAbsorb(((int) this.d.getCurrVelocity()));
                        }
                    } else {
                        if (v4.isFinished()) {
                            v4.onAbsorb(((int) this.d.getCurrVelocity()));
                        }
                    }
                }
                this.d.abortAnimation();
                this.w(1);
            }
            if (this.d.isFinished()) {
                this.w(1);
                return;
            } else {
                this.postInvalidateOnAnimation();
                return;
            }
        } else {
            return;
        }
    }

    public final int computeVerticalScrollExtent()
    {
        return super.computeVerticalScrollExtent();
    }

    public final int computeVerticalScrollOffset()
    {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public final int computeVerticalScrollRange()
    {
        int v0_0 = this.getChildCount();
        int v1_3 = ((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop());
        if (v0_0 != 0) {
            int v2_0 = this.getChildAt(0);
            int v2_2 = (v2_0.getBottom() + ((android.widget.FrameLayout$LayoutParams) v2_0.getLayoutParams()).bottomMargin);
            int v3_3 = this.getScrollY();
            int v0_2 = Math.max(0, (v2_2 - v1_3));
            if (v3_3 >= 0) {
                if (v3_3 <= v0_2) {
                    return v2_2;
                } else {
                    return ((v3_3 - v0_2) + v2_2);
                }
            } else {
                return (v2_2 - v3_3);
            }
        } else {
            return v1_3;
        }
    }

    public final void d(android.view.View p1, int p2, int p3, int p4, int p5, int p6, int[] p7)
    {
        this.n(p5, p6, p7);
        return;
    }

    public final boolean dispatchKeyEvent(android.view.KeyEvent p2)
    {
        if ((!super.dispatchKeyEvent(p2)) && (!this.i(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean dispatchNestedFling(float p2, float p3, boolean p4)
    {
        return this.F.a(p2, p3, p4);
    }

    public final boolean dispatchNestedPreFling(float p2, float p3)
    {
        return this.F.b(p2, p3);
    }

    public final boolean dispatchNestedPreScroll(int p7, int p8, int[] p9, int[] p10)
    {
        return this.F.c(p7, p8, 0, p9, p10);
    }

    public final boolean dispatchNestedScroll(int p9, int p10, int p11, int p12, int[] p13)
    {
        return this.F.d(p9, p10, p11, p12, p13, 0, 0);
    }

    public final void draw(android.graphics.Canvas p11)
    {
        super.draw(p11);
        boolean v0_0 = this.getScrollY();
        boolean v1_0 = this.e;
        int v3_0 = 0;
        if (!v1_0.isFinished()) {
            int v7_1;
            int v2_3 = p11.save();
            int v4_0 = this.getWidth();
            int v5_0 = this.getHeight();
            int v6_0 = Math.min(0, v0_0);
            if (!this.getClipToPadding()) {
                v7_1 = 0;
            } else {
                v4_0 -= (this.getPaddingRight() + this.getPaddingLeft());
                v7_1 = this.getPaddingLeft();
            }
            if (this.getClipToPadding()) {
                v5_0 -= (this.getPaddingBottom() + this.getPaddingTop());
                v6_0 += this.getPaddingTop();
            }
            p11.translate(((float) v7_1), ((float) v6_0));
            v1_0.setSize(v4_0, v5_0);
            if (v1_0.draw(p11)) {
                this.postInvalidateOnAnimation();
            }
            p11.restoreToCount(v2_3);
        }
        boolean v1_2 = this.f;
        if (!v1_2.isFinished()) {
            int v2_2 = p11.save();
            int v4_1 = this.getWidth();
            int v5_1 = this.getHeight();
            boolean v0_2 = (Math.max(this.getScrollRange(), v0_0) + v5_1);
            if (this.getClipToPadding()) {
                v4_1 -= (this.getPaddingRight() + this.getPaddingLeft());
                v3_0 = this.getPaddingLeft();
            }
            if (this.getClipToPadding()) {
                v5_1 -= (this.getPaddingBottom() + this.getPaddingTop());
                v0_2 -= this.getPaddingBottom();
            }
            p11.translate(((float) (v3_0 - v4_1)), ((float) v0_2));
            p11.rotate(1127481344, ((float) v4_1), 0);
            v1_2.setSize(v4_1, v5_1);
            if (v1_2.draw(p11)) {
                this.postInvalidateOnAnimation();
            }
            p11.restoreToCount(v2_2);
        }
        return;
    }

    public final void e(android.view.View p1, int p2, int p3, int p4, int p5, int p6)
    {
        this.n(p5, p6, 0);
        return;
    }

    public final boolean f(android.view.View p1, android.view.View p2, int p3, int p4)
    {
        if ((p3 & 2) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean g(int p11)
    {
        int v1_0 = this.findFocus();
        if (v1_0 == this) {
            v1_0 = 0;
        }
        int v7 = v1_0;
        android.view.View v8 = android.view.FocusFinder.getInstance().findNextFocus(this, v7, p11);
        int v1_1 = this.getMaxScrollAmount();
        if ((v8 == null) || (!this.m(v8, v1_1, this.getHeight()))) {
            if ((p11 != 33) || (this.getScrollY() >= v1_1)) {
                if ((p11 == 130) && (this.getChildCount() > 0)) {
                    int v2_5 = this.getChildAt(0);
                    v1_1 = Math.min(((v2_5.getBottom() + ((android.widget.FrameLayout$LayoutParams) v2_5.getLayoutParams()).bottomMargin) - ((this.getHeight() + this.getScrollY()) - this.getPaddingBottom())), v1_1);
                }
            } else {
                v1_1 = this.getScrollY();
            }
            if (v1_1 != 0) {
                if (p11 != 130) {
                    v1_1 = (- v1_1);
                }
                this.s(v1_1, -1, 0, 0, 1, 1);
            } else {
                return 0;
            }
        } else {
            int v1_3 = this.c;
            v8.getDrawingRect(v1_3);
            this.offsetDescendantRectToMyCoords(v8, v1_3);
            this.s(this.h(v1_3), -1, 0, 0, 1, 1);
            v8.requestFocus(p11);
        }
        if ((v7 != 0) && ((v7.isFocused()) && (!this.m(v7, 0, this.getHeight())))) {
            int v2_14 = this.getDescendantFocusability();
            this.setDescendantFocusability(131072);
            this.requestFocus();
            this.setDescendantFocusability(v2_14);
        }
        return 1;
    }

    public float getBottomFadingEdgeStrength()
    {
        if (this.getChildCount() != 0) {
            int v0_10 = this.getChildAt(0);
            float v1_4 = ((android.widget.FrameLayout$LayoutParams) v0_10.getLayoutParams());
            int v2 = this.getVerticalFadingEdgeLength();
            int v0_4 = (((v0_10.getBottom() + v1_4.bottomMargin) - this.getScrollY()) - (this.getHeight() - this.getPaddingBottom()));
            if (v0_4 >= v2) {
                return 1065353216;
            } else {
                return (((float) v0_4) / ((float) v2));
            }
        } else {
            return 0;
        }
    }

    public int getMaxScrollAmount()
    {
        return ((int) (((float) this.getHeight()) * 1056964608));
    }

    public int getNestedScrollAxes()
    {
        int v0_0 = this.E;
        return (v0_0.b | v0_0.a);
    }

    public int getScrollRange()
    {
        if (this.getChildCount() <= 0) {
            return 0;
        } else {
            int v0_6 = this.getChildAt(0);
            int v2_5 = ((android.widget.FrameLayout$LayoutParams) v0_6.getLayoutParams());
            return Math.max(0, (((v0_6.getHeight() + v2_5.topMargin) + v2_5.bottomMargin) - ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom())));
        }
    }

    public float getTopFadingEdgeStrength()
    {
        if (this.getChildCount() != 0) {
            int v0_3 = this.getVerticalFadingEdgeLength();
            float v1_2 = this.getScrollY();
            if (v1_2 >= v0_3) {
                return 1065353216;
            } else {
                return (((float) v1_2) / ((float) v0_3));
            }
        } else {
            return 0;
        }
    }

    public float getVerticalScrollFactorCompat()
    {
        if (this.G == 0) {
            IllegalStateException v0_7 = new android.util.TypedValue();
            String v1_4 = this.getContext();
            if (!v1_4.getTheme().resolveAttribute(16842829, v0_7, 1)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            } else {
                this.G = v0_7.getDimension(v1_4.getResources().getDisplayMetrics());
            }
        }
        return this.G;
    }

    public final int h(android.graphics.Rect p11)
    {
        if (this.getChildCount() != 0) {
            int v0_1 = this.getHeight();
            int v2_0 = this.getScrollY();
            int v3_2 = (v2_0 + v0_1);
            int v4_0 = this.getVerticalFadingEdgeLength();
            if (p11.top > 0) {
                v2_0 += v4_0;
            }
            int v4_1;
            android.view.View v5_1 = this.getChildAt(0);
            android.widget.FrameLayout$LayoutParams v6_1 = ((android.widget.FrameLayout$LayoutParams) v5_1.getLayoutParams());
            if (p11.bottom >= ((v5_1.getHeight() + v6_1.topMargin) + v6_1.bottomMargin)) {
                v4_1 = v3_2;
            } else {
                v4_1 = (v3_2 - v4_0);
            }
            int v7_1 = p11.bottom;
            if ((v7_1 <= v4_1) || (p11.top <= v2_0)) {
                if ((p11.top >= v2_0) || (v7_1 >= v4_1)) {
                    return 0;
                } else {
                    int v1_1;
                    if (p11.height() <= v0_1) {
                        v1_1 = (0 - (v2_0 - p11.top));
                    } else {
                        v1_1 = (0 - (v4_1 - p11.bottom));
                    }
                    return Math.max(v1_1, (- this.getScrollY()));
                }
            } else {
                int v11_7;
                if (p11.height() <= v0_1) {
                    v11_7 = (p11.bottom - v4_1);
                } else {
                    v11_7 = (p11.top - v2_0);
                }
                return Math.min(v11_7, ((v5_1.getBottom() + v6_1.bottomMargin) - v3_2));
            }
        } else {
            return 0;
        }
    }

    public final boolean hasNestedScrollingParent()
    {
        return this.F.f(0);
    }

    public final boolean i(android.view.KeyEvent p6)
    {
        this.c.setEmpty();
        int v1 = 130;
        if (this.getChildCount() <= 0) {
            if ((this.isFocused()) && (p6.getKeyCode() != 4)) {
                int v6_2 = this.findFocus();
                if (v6_2 == this) {
                    v6_2 = 0;
                }
                int v6_3 = android.view.FocusFinder.getInstance().findNextFocus(this, v6_2, 130);
                if ((v6_3 != 0) && ((v6_3 != this) && (v6_3.requestFocus(130)))) {
                    return 1;
                }
            }
        } else {
            android.view.FocusFinder v0_10 = this.getChildAt(0);
            int v3_1 = ((android.widget.FrameLayout$LayoutParams) v0_10.getLayoutParams());
            if (((v0_10.getHeight() + v3_1.topMargin) + v3_1.bottomMargin) <= ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom())) {
            } else {
                if (p6.getAction() == 0) {
                    android.view.FocusFinder v0_9 = p6.getKeyCode();
                    if (v0_9 == 19) {
                        if (!p6.isAltPressed()) {
                            return this.g(33);
                        } else {
                            return this.k(33);
                        }
                    } else {
                        if (v0_9 == 20) {
                            if (!p6.isAltPressed()) {
                                return this.g(130);
                            } else {
                                return this.k(130);
                            }
                        } else {
                            if (v0_9 == 62) {
                                if (p6.isShiftPressed()) {
                                    v1 = 33;
                                }
                                this.q(v1);
                                return 0;
                            } else {
                                if (v0_9 == 92) {
                                    return this.k(33);
                                } else {
                                    if (v0_9 == 93) {
                                        return this.k(130);
                                    } else {
                                        if (v0_9 == 122) {
                                            this.q(33);
                                            return 0;
                                        } else {
                                            if (v0_9 == 123) {
                                                this.q(130);
                                                return 0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return 0;
    }

    public final boolean isNestedScrollingEnabled()
    {
        return this.F.d;
    }

    public final void j(int p13)
    {
        if (this.getChildCount() > 0) {
            this.d.fling(this.getScrollX(), this.getScrollY(), 0, p13, 0, 0, -2147483648, 2147483647, 0, 0);
            this.F.g(2, 1);
            this.C = this.getScrollY();
            this.postInvalidateOnAnimation();
            if (android.os.Build$VERSION.SDK_INT >= 35) {
                t0.e.a(this, Math.abs(this.d.getCurrVelocity()));
            }
        }
        return;
    }

    public final boolean k(int p6)
    {
        int v0_7;
        if (p6 != 130) {
            v0_7 = 0;
        } else {
            v0_7 = 1;
        }
        int v3 = this.getHeight();
        android.graphics.Rect v4 = this.c;
        v4.top = 0;
        v4.bottom = v3;
        if (v0_7 != 0) {
            int v0_1 = this.getChildCount();
            if (v0_1 > 0) {
                int v0_3 = this.getChildAt((v0_1 - 1));
                int v1_5 = (this.getPaddingBottom() + (v0_3.getBottom() + ((android.widget.FrameLayout$LayoutParams) v0_3.getLayoutParams()).bottomMargin));
                v4.bottom = v1_5;
                v4.top = (v1_5 - v3);
            }
        }
        return this.r(p6, v4.top, v4.bottom);
    }

    public final boolean m(android.view.View p3, int p4, int p5)
    {
        android.graphics.Rect v0 = this.c;
        p3.getDrawingRect(v0);
        this.offsetDescendantRectToMyCoords(p3, v0);
        if (((v0.bottom + p4) < this.getScrollY()) || ((v0.top - p4) > (this.getScrollY() + p5))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void measureChild(android.view.View p3, int p4, int p5)
    {
        p3.measure(android.view.ViewGroup.getChildMeasureSpec(p4, (this.getPaddingRight() + this.getPaddingLeft()), p3.getLayoutParams().width), android.view.View$MeasureSpec.makeMeasureSpec(0, 0));
        return;
    }

    public final void measureChildWithMargins(android.view.View p2, int p3, int p4, int p5, int p6)
    {
        int v5_3 = ((android.view.ViewGroup$MarginLayoutParams) p2.getLayoutParams());
        p2.measure(android.view.ViewGroup.getChildMeasureSpec(p3, ((((this.getPaddingRight() + this.getPaddingLeft()) + v5_3.leftMargin) + v5_3.rightMargin) + p4), v5_3.width), android.view.View$MeasureSpec.makeMeasureSpec((v5_3.topMargin + v5_3.bottomMargin), 0));
        return;
    }

    public final void n(int p11, int p12, int[] p13)
    {
        int v0_0 = this.getScrollY();
        this.scrollBy(0, p11);
        int v4 = (this.getScrollY() - v0_0);
        if (p13 != null) {
            p13[1] = (p13[1] + v4);
        }
        this.F.d(0, v4, 0, (p11 - v4), 0, p12, p13);
        return;
    }

    public final void o(android.view.MotionEvent p4)
    {
        int v0_0 = p4.getActionIndex();
        if (p4.getPointerId(v0_0) == this.y) {
            int v0_1;
            if (v0_0 != 0) {
                v0_1 = 0;
            } else {
                v0_1 = 1;
            }
            this.n = ((int) p4.getY(v0_1));
            this.y = p4.getPointerId(v0_1);
            android.view.VelocityTracker v4_2 = this.s;
            if (v4_2 != null) {
                v4_2.clear();
            }
        }
        return;
    }

    public final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        this.p = 0;
        return;
    }

    public final boolean onGenericMotionEvent(android.view.MotionEvent p13)
    {
        if ((p13.getAction() == 8) && (!this.r)) {
            int v9;
            int v7;
            int v1_2;
            if (!a.a.C(p13, 2)) {
                if (!a.a.C(p13, 4194304)) {
                    v7 = 0;
                    v9 = 0;
                    v1_2 = 0;
                } else {
                    v9 = (this.getWidth() / 2);
                    v7 = 26;
                    v1_2 = p13.getAxisValue(26);
                }
            } else {
                v1_2 = p13.getAxisValue(9);
                v7 = 9;
                v9 = ((int) p13.getX());
            }
            if (v1_2 != 0) {
                this.s((- ((int) (this.getVerticalScrollFactorCompat() * v1_2))), v7, p13, v9, 1, a.a.C(p13, 8194));
                if (v7 != 0) {
                    this.H.a(p13, v7);
                }
                return 1;
            }
        }
        return 0;
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent p13)
    {
        android.widget.OverScroller v0_0 = p13.getAction();
        int v1_3 = 1;
        if ((v0_0 != 2) || (!this.r)) {
            android.widget.OverScroller v0_12 = (v0_0 & 255);
            if (v0_12 == null) {
                android.widget.OverScroller v0_6 = ((int) p13.getY());
                int v5_2 = ((int) p13.getX());
                if (this.getChildCount() > 0) {
                    int v6_2 = this.getScrollY();
                    int v7_1 = this.getChildAt(0);
                    if ((v0_6 >= (v7_1.getTop() - v6_2)) && ((v0_6 < (v7_1.getBottom() - v6_2)) && ((v5_2 >= v7_1.getLeft()) && (v5_2 < v7_1.getRight())))) {
                        this.n = v0_6;
                        this.y = p13.getPointerId(0);
                        android.widget.OverScroller v0_8 = this.s;
                        if (v0_8 != null) {
                            v0_8.clear();
                        } else {
                            this.s = android.view.VelocityTracker.obtain();
                        }
                        this.s.addMovement(p13);
                        this.d.computeScrollOffset();
                        if ((!this.v(p13)) && (this.d.isFinished())) {
                            v1_3 = 0;
                        }
                        this.r = v1_3;
                        this.F.g(2, 0);
                        return this.r;
                    }
                }
                if ((!this.v(p13)) && (this.d.isFinished())) {
                    v1_3 = 0;
                }
                this.r = v1_3;
                q0.q v13_11 = this.s;
                if (v13_11 != null) {
                    v13_11.recycle();
                    this.s = 0;
                }
            } else {
                if (v0_12 != 1) {
                    if (v0_12 == 2) {
                        android.widget.OverScroller v0_13 = this.y;
                        if (v0_13 != -1) {
                            int v3_2 = p13.findPointerIndex(v0_13);
                            if (v3_2 != -1) {
                                android.widget.OverScroller v0_15 = ((int) p13.getY(v3_2));
                                if ((Math.abs((v0_15 - this.n)) <= this.v) || ((2 & this.getNestedScrollAxes()) != 0)) {
                                    return this.r;
                                } else {
                                    this.r = 1;
                                    this.n = v0_15;
                                    if (this.s == null) {
                                        this.s = android.view.VelocityTracker.obtain();
                                    }
                                    this.s.addMovement(p13);
                                    this.B = 0;
                                    q0.q v13_1 = this.getParent();
                                    if (v13_1 == null) {
                                        return this.r;
                                    } else {
                                        v13_1.requestDisallowInterceptTouchEvent(1);
                                        return this.r;
                                    }
                                }
                            } else {
                                q0.q v13_3 = new StringBuilder("Invalid pointerId=");
                                v13_3.append(v0_13);
                                v13_3.append(" in onInterceptTouchEvent");
                                android.util.Log.e("NestedScrollView", v13_3.toString());
                                return this.r;
                            }
                        }
                    } else {
                        if (v0_12 != 3) {
                            if (v0_12 == 6) {
                                this.o(p13);
                            }
                            return this.r;
                        }
                    }
                }
                this.r = 0;
                this.y = -1;
                q0.q v13_5 = this.s;
                if (v13_5 != null) {
                    v13_5.recycle();
                    this.s = 0;
                }
                if (this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                    this.postInvalidateOnAnimation();
                }
                this.w(0);
            }
            return this.r;
        } else {
            return 1;
        }
    }

    public final void onLayout(boolean p3, int p4, int p5, int p6, int p7)
    {
        this = super.onLayout(p3, p4, p5, p6, p7);
        int v4_1 = 0;
        this.o = 0;
        int v6_7 = this.q;
        if ((v6_7 != 0) && (androidx.core.widget.NestedScrollView.l(v6_7, this))) {
            int v6_10 = this.q;
            int v0_0 = this.c;
            v6_10.getDrawingRect(v0_0);
            this.offsetDescendantRectToMyCoords(v6_10, v0_0);
            int v6_1 = this.h(v0_0);
            if (v6_1 != 0) {
                this.scrollBy(0, v6_1);
            }
        }
        this.q = 0;
        if (!this.p) {
            if (this.D != null) {
                this.scrollTo(this.getScrollX(), this.D.a);
                this.D = 0;
            }
            int v6_4;
            if (this.getChildCount() <= 0) {
                v6_4 = 0;
            } else {
                int v6_5 = this.getChildAt(0);
                int v0_5 = ((android.widget.FrameLayout$LayoutParams) v6_5.getLayoutParams());
                v6_4 = ((v6_5.getMeasuredHeight() + v0_5.topMargin) + v0_5.bottomMargin);
            }
            int v7_3 = (((p7 - p5) - this.getPaddingTop()) - this.getPaddingBottom());
            int v5_3 = this.getScrollY();
            if ((v7_3 < v6_4) && (v5_3 >= 0)) {
                if ((v7_3 + v5_3) <= v6_4) {
                    v4_1 = v5_3;
                } else {
                    v4_1 = (v6_4 - v7_3);
                }
            }
            if (v4_1 != v5_3) {
                this.scrollTo(this.getScrollX(), v4_1);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.p = 1;
        return;
    }

    public final void onMeasure(int p5, int p6)
    {
        super.onMeasure(p5, p6);
        if ((this.t) && ((android.view.View$MeasureSpec.getMode(p6) != 0) && (this.getChildCount() > 0))) {
            android.view.View v6_1 = this.getChildAt(0);
            int v0_2 = ((android.widget.FrameLayout$LayoutParams) v6_1.getLayoutParams());
            int v1_0 = v6_1.getMeasuredHeight();
            int v2_4 = ((((this.getMeasuredHeight() - this.getPaddingTop()) - this.getPaddingBottom()) - v0_2.topMargin) - v0_2.bottomMargin);
            if (v1_0 < v2_4) {
                v6_1.measure(android.view.ViewGroup.getChildMeasureSpec(p5, (((this.getPaddingRight() + this.getPaddingLeft()) + v0_2.leftMargin) + v0_2.rightMargin), v0_2.width), android.view.View$MeasureSpec.makeMeasureSpec(v2_4, 1073741824));
            }
        }
        return;
    }

    public final boolean onNestedFling(android.view.View p1, float p2, float p3, boolean p4)
    {
        if (p4) {
            return 0;
        } else {
            this.dispatchNestedFling(0, p3, 1);
            this.j(((int) p3));
            return 1;
        }
    }

    public final boolean onNestedPreFling(android.view.View p1, float p2, float p3)
    {
        return this.F.b(p2, p3);
    }

    public final void onNestedPreScroll(android.view.View p7, int p8, int p9, int[] p10)
    {
        this.F.c(p8, p9, 0, p10, 0);
        return;
    }

    public final void onNestedScroll(android.view.View p1, int p2, int p3, int p4, int p5)
    {
        this.n(p5, 0, 0);
        return;
    }

    public final void onNestedScrollAccepted(android.view.View p2, android.view.View p3, int p4)
    {
        this.a(p2, p3, p4, 0);
        return;
    }

    public final void onOverScrolled(int p1, int p2, boolean p3, boolean p4)
    {
        super.scrollTo(p1, p2);
        return;
    }

    public final boolean onRequestFocusInDescendants(int p4, android.graphics.Rect p5)
    {
        if (p4 != 2) {
            if (p4 == 1) {
                p4 = 33;
            }
        } else {
            p4 = 130;
        }
        android.view.View v0_1;
        if (p5 != null) {
            v0_1 = android.view.FocusFinder.getInstance().findNextFocusFromRect(this, p5, p4);
        } else {
            v0_1 = android.view.FocusFinder.getInstance().findNextFocus(this, 0, p4);
        }
        if ((v0_1 != null) && (this.m(v0_1, 0, this.getHeight()))) {
            return v0_1.requestFocus(p4, p5);
        } else {
            return 0;
        }
    }

    public final void onRestoreInstanceState(android.os.Parcelable p2)
    {
        if ((p2 instanceof t0.g)) {
            super.onRestoreInstanceState(((t0.g) p2).getSuperState());
            this.D = ((t0.g) p2);
            this.requestLayout();
            return;
        } else {
            super.onRestoreInstanceState(p2);
            return;
        }
    }

    public final android.os.Parcelable onSaveInstanceState()
    {
        t0.g v1_1 = new t0.g(super.onSaveInstanceState());
        v1_1.a = this.getScrollY();
        return v1_1;
    }

    public final void onScrollChanged(int p1, int p2, int p3, int p4)
    {
        super.onScrollChanged(p1, p2, p3, p4);
        return;
    }

    public final void onSizeChanged(int p1, int p2, int p3, int p4)
    {
        super.onSizeChanged(p1, p2, p3, p4);
        int v1_2 = this.findFocus();
        if ((v1_2 != 0) && ((this != v1_2) && (this.m(v1_2, 0, p4)))) {
            boolean v3_3 = this.c;
            v1_2.getDrawingRect(v3_3);
            this.offsetDescendantRectToMyCoords(v1_2, v3_3);
            int v1_1 = this.h(v3_3);
            if (v1_1 != 0) {
                if (!this.u) {
                    this.scrollBy(0, v1_1);
                } else {
                    this.u(0, 0, v1_1);
                    return;
                }
            }
        }
        return;
    }

    public final boolean onStartNestedScroll(android.view.View p2, android.view.View p3, int p4)
    {
        return this.f(p2, p3, p4, 0);
    }

    public final void onStopNestedScroll(android.view.View p2)
    {
        this.b(p2, 0);
        return;
    }

    public final boolean onTouchEvent(android.view.MotionEvent p21)
    {
        if (this.s == null) {
            this.s = android.view.VelocityTracker.obtain();
        }
        int v1_35 = p21.getActionMasked();
        if (v1_35 == 0) {
            this.B = 0;
        }
        android.view.MotionEvent v7 = android.view.MotionEvent.obtain(p21);
        int v5_2 = 0;
        v7.offsetLocation(0, ((float) this.B));
        int v4_12 = this.F;
        if (v1_35 == 0) {
            if (this.getChildCount() != 0) {
                if (this.r) {
                    int v1_24 = this.getParent();
                    if (v1_24 != 0) {
                        v1_24.requestDisallowInterceptTouchEvent(1);
                    }
                }
                if (!this.d.isFinished()) {
                    this.d.abortAnimation();
                    this.w(1);
                }
                int v1_29 = ((int) p21.getY());
                float v3_2 = p21.getPointerId(0);
                this.n = v1_29;
                this.y = v3_2;
                v4_12.g(2, 0);
            } else {
                return 0;
            }
        } else {
            android.widget.EdgeEffect v11 = this.e;
            android.widget.EdgeEffect v12 = this.f;
            if (v1_35 == 1) {
                int v1_31 = this.s;
                v1_31.computeCurrentVelocity(1000, ((float) this.x));
                int v1_33 = ((int) v1_31.getYVelocity(this.y));
                if (Math.abs(v1_33) < this.w) {
                    if (this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                        this.postInvalidateOnAnimation();
                    }
                } else {
                    if (a.a.u(v11) == 0) {
                        if (a.a.u(v12) == 0) {
                            int v1_36 = (- v1_33);
                            float v3_11 = ((float) v1_36);
                            if (!v4_12.b(0, v3_11)) {
                                this.dispatchNestedFling(0, v3_11, 1);
                                this.j(v1_36);
                            }
                        } else {
                            int v1_37 = (- v1_33);
                            if (!this.t(v12, v1_37)) {
                                this.j(v1_37);
                            } else {
                                v12.onAbsorb(v1_37);
                            }
                        }
                    } else {
                        if (!this.t(v11, v1_33)) {
                            this.j((- v1_33));
                        } else {
                            v11.onAbsorb(v1_33);
                        }
                    }
                }
                this.y = -1;
                this.r = 0;
                int v1_1 = this.s;
                if (v1_1 != 0) {
                    v1_1.recycle();
                    this.s = 0;
                }
                this.w(0);
                v11.onRelease();
                v12.onRelease();
            } else {
                if (v1_35 == 2) {
                    int v1_3 = p21.findPointerIndex(this.y);
                    if (v1_3 != -1) {
                        int v4_3;
                        int v9_0 = ((int) p21.getY(v1_3));
                        int v2_2 = (this.n - v9_0);
                        int v4_1 = (p21.getX(v1_3) / ((float) this.getWidth()));
                        int v6_3 = (((float) v2_2) / ((float) this.getHeight()));
                        if (a.a.u(v11) == 0) {
                            if (a.a.u(v12) != 0) {
                                v4_3 = a.a.N(v12, v6_3, (1065353216 - v4_1));
                                if (a.a.u(v12) != 0) {
                                    v5_2 = v4_3;
                                } else {
                                    v12.onRelease();
                                }
                            }
                        } else {
                            v4_3 = (- a.a.N(v11, (- v6_3), v4_1));
                            if (a.a.u(v11) != 0) {
                            } else {
                                v11.onRelease();
                            }
                        }
                        int v4_8 = Math.round((v5_2 * ((float) this.getHeight())));
                        if (v4_8 != 0) {
                            this.invalidate();
                        }
                        int v2_3 = (v2_2 - v4_8);
                        if ((!this.r) && (Math.abs(v2_3) > this.v)) {
                            int v4_11 = this.getParent();
                            if (v4_11 != 0) {
                                v4_11.requestDisallowInterceptTouchEvent(1);
                            }
                            this.r = 1;
                            if (v2_3 <= 0) {
                                v2_3 += this.v;
                            } else {
                                v2_3 -= this.v;
                            }
                        }
                        if (this.r) {
                            int v1_6 = this.s(v2_3, 1, p21, ((int) p21.getX(v1_3)), 0, 0);
                            this.n = (v9_0 - v1_6);
                            this.B = (androidx.core.widget.NestedScrollView v0.B + v1_6);
                        }
                    } else {
                        int v1_9 = new StringBuilder("Invalid pointerId=");
                        v1_9.append(this.y);
                        v1_9.append(" in onTouchEvent");
                        android.util.Log.e("NestedScrollView", v1_9.toString());
                    }
                } else {
                    if (v1_35 == 3) {
                        if ((this.r) && ((this.getChildCount() > 0) && (this.d.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())))) {
                            this.postInvalidateOnAnimation();
                        }
                        this.y = -1;
                        this.r = 0;
                        int v1_15 = this.s;
                        if (v1_15 != 0) {
                            v1_15.recycle();
                            this.s = 0;
                        }
                        this.w(0);
                        v11.onRelease();
                        v12.onRelease();
                    } else {
                        if (v1_35 == 5) {
                            int v1_16 = p21.getActionIndex();
                            this.n = ((int) p21.getY(v1_16));
                            this.y = p21.getPointerId(v1_16);
                        } else {
                            if (v1_35 == 6) {
                                this.o(p21);
                                this.n = ((int) p21.getY(p21.findPointerIndex(this.y)));
                            }
                        }
                    }
                }
            }
        }
        int v1_23 = this.s;
        if (v1_23 != 0) {
            v1_23.addMovement(v7);
        }
        v7.recycle();
        return 1;
    }

    public final boolean p(int p10, int p11, int p12, int p13)
    {
        int v3;
        int v11_1;
        this.getOverScrollMode();
        int vtmp2 = super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        this.computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int v12_2 = (p12 + p10);
        if ((p11 <= 0) && (p11 >= 0)) {
            v3 = p11;
            v11_1 = 0;
        } else {
            v3 = 0;
            v11_1 = 1;
        }
        int v4;
        int v12_1;
        if (v12_2 <= p13) {
            if (v12_2 >= 0) {
                v4 = v12_2;
                v12_1 = 0;
            } else {
                v4 = 0;
                v12_1 = 1;
            }
        } else {
            v4 = p13;
        }
        if ((v12_1 != 0) && (!this.F.f(1))) {
            this.d.springBack(v3, v4, 0, 0, 0, this.getScrollRange());
        }
        super.scrollTo(v3, v4);
        if ((v11_1 == 0) && (v12_1 == 0)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void q(int p6)
    {
        int v0_12;
        if (p6 != 130) {
            v0_12 = 0;
        } else {
            v0_12 = 1;
        }
        int v3_1 = this.getHeight();
        android.graphics.Rect v4 = this.c;
        if (v0_12 == 0) {
            int v0_2 = (this.getScrollY() - v3_1);
            v4.top = v0_2;
            if (v0_2 < 0) {
                v4.top = 0;
            }
        } else {
            v4.top = (this.getScrollY() + v3_1);
            int v0_5 = this.getChildCount();
            if (v0_5 > 0) {
                int v0_7 = this.getChildAt((v0_5 - 1));
                int v1_5 = (this.getPaddingBottom() + (v0_7.getBottom() + ((android.widget.FrameLayout$LayoutParams) v0_7.getLayoutParams()).bottomMargin));
                if ((v4.top + v3_1) > v1_5) {
                    v4.top = (v1_5 - v3_1);
                }
            }
        }
        int v0_13 = v4.top;
        int v3_0 = (v3_1 + v0_13);
        v4.bottom = v3_0;
        this.r(p6, v0_13, v3_0);
        return;
    }

    public final boolean r(int p19, int p20, int p21)
    {
        int v5_0;
        int v3_0 = this.getHeight();
        int v4 = this.getScrollY();
        int v3_1 = (v3_0 + v4);
        if (p19 != 33) {
            v5_0 = 0;
        } else {
            v5_0 = 1;
        }
        java.util.ArrayList v8_1 = this.getFocusables(2);
        android.view.View v10_0 = v8_1.size();
        int v11_0 = 0;
        int v12_0 = 0;
        int v13_0 = 0;
        while (v12_0 < v10_0) {
            int v14_2 = ((android.view.View) v8_1.get(v12_0));
            int v15_1 = v14_2.getTop();
            int v6_1 = v14_2.getBottom();
            if ((p20 < v6_1) && (v15_1 < p21)) {
                if ((p20 >= v15_1) || (v6_1 >= p21)) {
                    int v17 = 0;
                } else {
                    v17 = 1;
                }
                if (v11_0 != 0) {
                    if (((v5_0 == 0) || (v15_1 >= v11_0.getTop())) && ((v5_0 != 0) || (v6_1 <= v11_0.getBottom()))) {
                        int v6_2 = 0;
                    } else {
                        v6_2 = 1;
                    }
                    if (v13_0 == 0) {
                        if (v17 == 0) {
                            if (v6_2 == 0) {
                                v12_0++;
                            }
                        } else {
                            v11_0 = v14_2;
                            v13_0 = 1;
                        }
                    } else {
                        if ((v17 == 0) || (v6_2 == 0)) {
                        }
                    }
                    v11_0 = v14_2;
                } else {
                    v11_0 = v14_2;
                    v13_0 = v17;
                }
            }
        }
        int v6_0;
        if (v11_0 != 0) {
            v6_0 = v11_0;
        } else {
            v6_0 = this;
        }
        if ((p20 < v4) || (p21 > v3_1)) {
            android.view.View v1_1;
            if (v5_0 == 0) {
                v1_1 = (p21 - v3_1);
            } else {
                v1_1 = (p20 - v4);
            }
            this.s(v1_1, -1, 0, 0, 1, 1);
            int v16 = 1;
        } else {
            v16 = 0;
        }
        if (v6_0 != this.findFocus()) {
            v6_0.requestFocus(p19);
        }
        return v16;
    }

    public final void requestChildFocus(android.view.View p3, android.view.View p4)
    {
        if (this.o) {
            this.q = p4;
        } else {
            int v0_1 = this.c;
            p4.getDrawingRect(v0_1);
            this.offsetDescendantRectToMyCoords(p4, v0_1);
            int v0_2 = this.h(v0_1);
            if (v0_2 != 0) {
                this.scrollBy(0, v0_2);
            }
        }
        super.requestChildFocus(p3, p4);
        return;
    }

    public final boolean requestChildRectangleOnScreen(android.view.View p3, android.graphics.Rect p4, boolean p5)
    {
        int v0_1;
        p4.offset((p3.getLeft() - p3.getScrollX()), (p3.getTop() - p3.getScrollY()));
        int v3_1 = this.h(p4);
        if (v3_1 == 0) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        if (v0_1 != 0) {
            if (!p5) {
                this.u(0, 0, v3_1);
            } else {
                this.scrollBy(0, v3_1);
                return v0_1;
            }
        }
        return v0_1;
    }

    public final void requestDisallowInterceptTouchEvent(boolean p2)
    {
        if (p2) {
            int v0_0 = this.s;
            if (v0_0 != 0) {
                v0_0.recycle();
                this.s = 0;
            }
        }
        super.requestDisallowInterceptTouchEvent(p2);
        return;
    }

    public final void requestLayout()
    {
        this.o = 1;
        super.requestLayout();
        return;
    }

    public final int s(int p21, int p22, android.view.MotionEvent p23, int p24, int p25, boolean p26)
    {
        int v10_0 = this.F;
        if (p25 == 1) {
            v10_0.g(2, p25);
        }
        int v14_0;
        int v15_0;
        int[] v12 = this.z;
        android.widget.EdgeEffect v4_1 = this.A;
        if (!this.F.c(0, p21, p25, this.A, this.z)) {
            v14_0 = p21;
            v15_0 = 0;
        } else {
            v14_0 = (p21 - v4_1[1]);
            v15_0 = v12[1];
        }
        int v16;
        int v3_9 = this.getScrollY();
        android.widget.EdgeEffect v5_2 = this.getScrollRange();
        int v6_7 = this.getOverScrollMode();
        if (((v6_7 != 0) && ((v6_7 != 1) || (this.getScrollRange() <= 0))) || (p26)) {
            v16 = 0;
        } else {
            v16 = 1;
        }
        if ((!this.p(v14_0, 0, v3_9, v5_2)) || (v10_0.f(p25))) {
            int v17 = 0;
        } else {
            v17 = 1;
        }
        int v6_12 = (this.getScrollY() - v3_9);
        if ((p23 != null) && (v6_12 != 0)) {
            this.getScrollFeedbackProvider().a.onScrollProgress(p23.getDeviceId(), p23.getSource(), p22, v6_12);
        }
        int v7_0;
        int v7_4 = (v14_0 - v6_12);
        v4_1[1] = 0;
        int v18 = v3_9;
        int v10_3 = v4_1;
        int v13_2 = v5_2;
        this.F.d(0, v6_12, 0, v7_4, this.z, p25, v10_3);
        int v15_1 = (v15_0 + v12[1]);
        int v14_1 = (v14_0 - v10_3[1]);
        int v3_14 = (v18 + v14_1);
        android.widget.EdgeEffect v4_3 = this.f;
        android.widget.EdgeEffect v5_4 = this.e;
        if (v3_14 >= 0) {
            if ((v3_14 <= v13_2) || (v16 == 0)) {
                v7_0 = 0;
            } else {
                a.a.N(v4_3, (((float) v14_1) / ((float) this.getHeight())), (1065353216 - (((float) p24) / ((float) this.getWidth()))));
                if (p23 == null) {
                    v7_0 = 0;
                } else {
                    v7_0 = 0;
                    this.getScrollFeedbackProvider().a.onScrollLimit(p23.getDeviceId(), p23.getSource(), p22, 0);
                }
                if (!v5_4.isFinished()) {
                    v5_4.onRelease();
                }
            }
        } else {
            if (v16 == 0) {
            } else {
                a.a.N(v5_4, (((float) (- v14_1)) / ((float) this.getHeight())), (((float) p24) / ((float) this.getWidth())));
                if (p23 != null) {
                    this.getScrollFeedbackProvider().a.onScrollLimit(p23.getDeviceId(), p23.getSource(), p22, 1);
                }
                if (v4_3.isFinished()) {
                } else {
                    v4_3.onRelease();
                }
            }
        }
        if ((v5_4.isFinished()) && (v4_3.isFinished())) {
            int v13_0 = v17;
        } else {
            this.postInvalidateOnAnimation();
            v13_0 = v7_0;
        }
        if ((v13_0 != 0) && (p25 == 0)) {
            android.view.VelocityTracker v1_5 = this.s;
            if (v1_5 != null) {
                v1_5.clear();
            }
        }
        if (p25 == 1) {
            this.w(p25);
            v5_4.onRelease();
            v4_3.onRelease();
        }
        return v15_1;
    }

    public final void scrollTo(int p8, int p9)
    {
        if (this.getChildCount() > 0) {
            int v1_3 = this.getChildAt(0);
            int v2_3 = ((android.widget.FrameLayout$LayoutParams) v1_3.getLayoutParams());
            int v3_2 = ((this.getWidth() - this.getPaddingLeft()) - this.getPaddingRight());
            int v4_4 = ((v1_3.getWidth() + v2_3.leftMargin) + v2_3.rightMargin);
            int v5_4 = ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom());
            int v1_2 = ((v1_3.getHeight() + v2_3.topMargin) + v2_3.bottomMargin);
            if ((v3_2 < v4_4) && (p8 >= 0)) {
                if ((v3_2 + p8) > v4_4) {
                    p8 = (v4_4 - v3_2);
                }
            } else {
                p8 = 0;
            }
            if ((v5_4 < v1_2) && (p9 >= 0)) {
                if ((v5_4 + p9) > v1_2) {
                    p9 = (v1_2 - v5_4);
                }
            } else {
                p9 = 0;
            }
            if ((p8 != this.getScrollX()) || (p9 != this.getScrollY())) {
                super.scrollTo(p8, p9);
            }
        }
        return;
    }

    public void setFillViewport(boolean p2)
    {
        if (p2 != this.t) {
            this.t = p2;
            this.requestLayout();
        }
        return;
    }

    public void setNestedScrollingEnabled(boolean p4)
    {
        q0.q v0 = this.F;
        if (v0.d) {
            q0.i0.l(v0.c);
        }
        v0.d = p4;
        return;
    }

    public void setOnScrollChangeListener(t0.f p1)
    {
        return;
    }

    public void setSmoothScrollingEnabled(boolean p1)
    {
        this.u = p1;
        return;
    }

    public final boolean shouldDelayChildPressedState()
    {
        return 1;
    }

    public final boolean startNestedScroll(int p3)
    {
        return this.F.g(p3, 0);
    }

    public final void stopNestedScroll()
    {
        this.w(0);
        return;
    }

    public final boolean t(android.widget.EdgeEffect p10, int p11)
    {
        if (p11 <= 0) {
            float v2_1 = (this.a * 1014350479);
            double v5_0 = ((double) androidx.core.widget.NestedScrollView.I);
            if (((float) (Math.exp(((v5_0 / (v5_0 - 4607182418800017408)) * Math.log(((double) ((((float) Math.abs((- p11))) * 1051931443) / v2_1))))) * ((double) v2_1))) >= (a.a.u(p10) * ((float) this.getHeight()))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    public final void u(int p10, boolean p11, int p12)
    {
        if (this.getChildCount() != 0) {
            if ((android.view.animation.AnimationUtils.currentAnimationTimeMillis() - this.b) <= 250) {
                if (!this.d.isFinished()) {
                    this.d.abortAnimation();
                    this.w(1);
                }
                this.scrollBy(p10, p12);
            } else {
                int v0_1 = this.getChildAt(0);
                int v2_1 = ((android.widget.FrameLayout$LayoutParams) v0_1.getLayoutParams());
                int v0_4 = ((v0_1.getHeight() + v2_1.topMargin) + v2_1.bottomMargin);
                int v2_5 = ((this.getHeight() - this.getPaddingTop()) - this.getPaddingBottom());
                int v5 = this.getScrollY();
                this.d.startScroll(this.getScrollX(), v5, 0, (Math.max(0, Math.min((p12 + v5), Math.max(0, (v0_4 - v2_5)))) - v5), 250);
                if (p11 == null) {
                    this.w(1);
                } else {
                    this.F.g(2, 1);
                }
                this.C = this.getScrollY();
                this.postInvalidateOnAnimation();
            }
            this.b = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            return;
        } else {
            return;
        }
    }

    public final boolean v(android.view.MotionEvent p6)
    {
        float v0_1;
        float v0_0 = this.e;
        if (a.a.u(v0_0) == 0) {
            v0_1 = 0;
        } else {
            a.a.N(v0_0, 0, (p6.getX() / ((float) this.getWidth())));
            v0_1 = 1;
        }
        android.widget.EdgeEffect v1_1 = this.f;
        if (a.a.u(v1_1) == 0) {
            return v0_1;
        } else {
            a.a.N(v1_1, 0, (1065353216 - (p6.getX() / ((float) this.getWidth()))));
            return 1;
        }
    }

    public final void w(int p2)
    {
        this.F.h(p2);
        return;
    }
}
