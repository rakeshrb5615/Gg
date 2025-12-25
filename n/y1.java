package n;
public abstract class y1 extends android.view.ViewGroup {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float m;
    public boolean n;
    public int[] o;
    public int[] p;
    public android.graphics.drawable.Drawable q;
    public int r;
    public int s;
    public int t;
    public int u;

    public y1(android.content.Context p10, android.util.AttributeSet p11, int p12)
    {
        super(p10, p11, 0);
        super.a = 1;
        super.b = -1;
        super.c = 0;
        super.e = 8388659;
        int[] v2 = g.a.n;
        b8.g v8 = b8.g.p(p10, p11, v2, 0);
        q0.q0.m(super, p10, v2, p11, ((android.content.res.TypedArray) v8.c), 0);
        int v10_2 = ((android.content.res.TypedArray) v8.c);
        int v11_1 = v10_2.getInt(1, -1);
        if (v11_1 >= 0) {
            super.setOrientation(v11_1);
        }
        int v11_2 = v10_2.getInt(0, -1);
        if (v11_2 >= 0) {
            super.setGravity(v11_2);
        }
        int v11_4 = v10_2.getBoolean(2, 1);
        if (v11_4 == 0) {
            super.setBaselineAligned(v11_4);
        }
        super.m = v10_2.getFloat(4, -1082130432);
        super.b = v10_2.getInt(3, -1);
        super.n = v10_2.getBoolean(7, 0);
        super.setDividerDrawable(v8.i(5));
        super.t = v10_2.getInt(8, 0);
        super.u = v10_2.getDimensionPixelSize(6, 0);
        v8.r();
        return;
    }

    public boolean checkLayoutParams(android.view.ViewGroup$LayoutParams p1)
    {
        return (p1 instanceof n.x1);
    }

    public final void d(android.graphics.Canvas p5, int p6)
    {
        this.q.setBounds((this.getPaddingLeft() + this.u), p6, ((this.getWidth() - this.getPaddingRight()) - this.u), (this.s + p6));
        this.q.draw(p5);
        return;
    }

    public final void e(android.graphics.Canvas p6, int p7)
    {
        this.q.setBounds(p7, (this.getPaddingTop() + this.u), (this.r + p7), ((this.getHeight() - this.getPaddingBottom()) - this.u));
        this.q.draw(p6);
        return;
    }

    public n.x1 f()
    {
        int v0_0 = this.d;
        if (v0_0 != 0) {
            if (v0_0 != 1) {
                return 0;
            } else {
                return new n.x1(-1, -2);
            }
        } else {
            return new n.x1(-2, -2);
        }
    }

    public n.x1 g(android.util.AttributeSet p3)
    {
        return new n.x1(this.getContext(), p3);
    }

    public bridge synthetic android.view.ViewGroup$LayoutParams generateDefaultLayoutParams()
    {
        return this.f();
    }

    public bridge synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.util.AttributeSet p1)
    {
        return this.g(p1);
    }

    public bridge synthetic android.view.ViewGroup$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams p1)
    {
        return this.h(p1);
    }

    public int getBaseline()
    {
        if (this.b >= 0) {
            String v1_1 = this.b;
            if (this.getChildCount() <= v1_1) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            } else {
                int v0_1 = this.getChildAt(v1_1);
                String v1_0 = v0_1.getBaseline();
                if (v1_0 != -1) {
                    int v2_1 = this.c;
                    if (this.d == 1) {
                        int v3_2 = (this.e & 112);
                        if (v3_2 != 48) {
                            if (v3_2 == 16) {
                                v2_1 += (((((this.getBottom() - this.getTop()) - this.getPaddingTop()) - this.getPaddingBottom()) - this.f) / 2);
                            } else {
                                if (v3_2 == 80) {
                                    v2_1 = (((this.getBottom() - this.getTop()) - this.getPaddingBottom()) - this.f);
                                }
                            }
                        }
                    }
                    return ((v2_1 + ((n.x1) v0_1.getLayoutParams()).topMargin) + v1_0);
                } else {
                    if (this.b != 0) {
                        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline.");
                    } else {
                        return -1;
                    }
                }
            }
        } else {
            return super.getBaseline();
        }
    }

    public int getBaselineAlignedChildIndex()
    {
        return this.b;
    }

    public android.graphics.drawable.Drawable getDividerDrawable()
    {
        return this.q;
    }

    public int getDividerPadding()
    {
        return this.u;
    }

    public int getDividerWidth()
    {
        return this.r;
    }

    public int getGravity()
    {
        return this.e;
    }

    public int getOrientation()
    {
        return this.d;
    }

    public int getShowDividers()
    {
        return this.t;
    }

    public int getVirtualChildCount()
    {
        return this.getChildCount();
    }

    public float getWeightSum()
    {
        return this.m;
    }

    public n.x1 h(android.view.ViewGroup$LayoutParams p2)
    {
        if (!(p2 instanceof n.x1)) {
            if (!(p2 instanceof android.view.ViewGroup$MarginLayoutParams)) {
                return new n.x1(p2);
            } else {
                return new n.x1(((android.view.ViewGroup$MarginLayoutParams) p2));
            }
        } else {
            return new n.x1(((n.x1) p2));
        }
    }

    public final boolean i(int p5)
    {
        if (p5 != 0) {
            if (p5 != this.getChildCount()) {
                if ((this.t & 2) != 0) {
                    int v5_1 = (p5 - 1);
                    while (v5_1 >= 0) {
                        if (this.getChildAt(v5_1).getVisibility() == 8) {
                            v5_1--;
                        } else {
                            return 1;
                        }
                    }
                }
                return 0;
            } else {
                if ((this.t & 4) == 0) {
                    return 0;
                } else {
                    return 1;
                }
            }
        } else {
            if ((this.t & 1) == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public final void onDraw(android.graphics.Canvas p8)
    {
        if (this.q != null) {
            int v2 = 0;
            if (this.d != 1) {
                int v4_4;
                int v0_11 = this.getVirtualChildCount();
                if (this.getLayoutDirection() != 1) {
                    v4_4 = 0;
                } else {
                    v4_4 = 1;
                }
                while (v2 < v0_11) {
                    int v5_6 = this.getChildAt(v2);
                    if ((v5_6 != 0) && ((v5_6.getVisibility() != 8) && (this.i(v2)))) {
                        int v5_9;
                        int v6_3 = ((n.x1) v5_6.getLayoutParams());
                        if (v4_4 == 0) {
                            v5_9 = ((v5_6.getLeft() - v6_3.leftMargin) - this.r);
                        } else {
                            v5_9 = (v5_6.getRight() + v6_3.rightMargin);
                        }
                        this.e(p8, v5_9);
                    }
                    v2++;
                }
                if (this.i(v0_11)) {
                    int v0_5;
                    int v0_7;
                    int v1_6;
                    int v0_3 = this.getChildAt((v0_11 - 1));
                    if (v0_3 != 0) {
                        int v1_2 = ((n.x1) v0_3.getLayoutParams());
                        if (v4_4 == 0) {
                            v0_5 = (v0_3.getRight() + v1_2.rightMargin);
                        } else {
                            v0_7 = (v0_3.getLeft() - v1_2.leftMargin);
                            v1_6 = this.r;
                            v0_5 = (v0_7 - v1_6);
                        }
                    } else {
                        if (v4_4 == 0) {
                            v0_7 = (this.getWidth() - this.getPaddingRight());
                            v1_6 = this.r;
                        } else {
                            v0_5 = this.getPaddingLeft();
                        }
                    }
                    this.e(p8, v0_5);
                }
            } else {
                int v0_9 = this.getVirtualChildCount();
                while (v2 < v0_9) {
                    int v4_5 = this.getChildAt(v2);
                    if ((v4_5 != 0) && ((v4_5.getVisibility() != 8) && (this.i(v2)))) {
                        this.d(p8, ((v4_5.getTop() - ((n.x1) v4_5.getLayoutParams()).topMargin) - this.s));
                    }
                    v2++;
                }
                if (this.i(v0_9)) {
                    int v0_14;
                    int v0_12 = this.getChildAt((v0_9 - 1));
                    if (v0_12 != 0) {
                        v0_14 = (v0_12.getBottom() + ((n.x1) v0_12.getLayoutParams()).bottomMargin);
                    } else {
                        v0_14 = ((this.getHeight() - this.getPaddingBottom()) - this.s);
                    }
                    this.d(p8, v0_14);
                    return;
                }
            }
        }
        return;
    }

    public final void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
    {
        super.onInitializeAccessibilityEvent(p2);
        p2.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
        return;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p2)
    {
        super.onInitializeAccessibilityNodeInfo(p2);
        p2.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
        return;
    }

    public void onLayout(boolean p23, int p24, int p25, int p26, int p27)
    {
        int v3_18 = 8;
        int v8_9 = 2;
        if (this.d != 1) {
            int v1_4;
            if (this.getLayoutDirection() != 1) {
                v1_4 = 0;
            } else {
                v1_4 = 1;
            }
            int v2_6;
            int v3_7 = this.getPaddingTop();
            int v8_0 = (p27 - p25);
            int v10_4 = (v8_0 - this.getPaddingBottom());
            int v8_10 = ((v8_0 - v3_7) - this.getPaddingBottom());
            int v11_3 = this.getVirtualChildCount();
            int v12_2 = this.e;
            int v12_3 = (v12_2 & 112);
            int v13_5 = this.a;
            int v14_4 = this.o;
            n.x1 v15_2 = this.p;
            int v4_10 = android.view.Gravity.getAbsoluteGravity((8388615 & v12_2), this.getLayoutDirection());
            if (v4_10 == 1) {
                v2_6 = (this.getPaddingLeft() + (((p26 - p24) - this.f) / 2));
            } else {
                if (v4_10 == 5) {
                    v2_6 = (((this.getPaddingLeft() + p26) - p24) - this.f);
                } else {
                    v2_6 = this.getPaddingLeft();
                }
            }
            int v7_3;
            int v1_3;
            if (v1_4 == 0) {
                v7_3 = 1;
                v1_3 = 0;
            } else {
                v1_3 = (v11_3 - 1);
                v7_3 = -1;
            }
            int v9_0 = 0;
            while (v9_0 < v11_3) {
                int v19_0;
                int v25_1;
                int v5_9 = ((v7_3 * v9_0) + v1_3);
                int v6_6 = this.getChildAt(v5_9);
                if (v6_6 != 0) {
                    v25_1 = v1_3;
                    if (v6_6.getVisibility() == 8) {
                        v19_0 = v3_7;
                    } else {
                        int v3_20;
                        int v4_16 = v6_6.getMeasuredWidth();
                        int v16 = v6_6.getMeasuredHeight();
                        int v1_8 = ((n.x1) v6_6.getLayoutParams());
                        int v27_1 = v2_6;
                        if (v13_5 == 0) {
                            v19_0 = v3_7;
                            v3_20 = -1;
                        } else {
                            v19_0 = v3_7;
                            if (v1_8.height == -1) {
                            } else {
                                v3_20 = v6_6.getBaseline();
                            }
                        }
                        int v2_13 = v1_8.gravity;
                        if (v2_13 < 0) {
                            v2_13 = v12_3;
                        }
                        int v2_3;
                        int v3_1;
                        int v2_14 = (v2_13 & 112);
                        int v20 = v4_16;
                        if (v2_14 == 16) {
                            v2_3 = ((((v8_10 - v16) / 2) + v19_0) + v1_8.topMargin);
                            v3_1 = v1_8.bottomMargin;
                            v2_3 -= v3_1;
                        } else {
                            if (v2_14 == 48) {
                                v2_3 = (v19_0 + v1_8.topMargin);
                                if (v3_20 != -1) {
                                    v2_3 = ((v14_4[1] - v3_20) + v2_3);
                                }
                            } else {
                                if (v2_14 == 80) {
                                    v2_3 = ((v10_4 - v16) - v1_8.bottomMargin);
                                    if (v3_20 != -1) {
                                        v3_1 = (v15_2[2] - (v6_6.getMeasuredHeight() - v3_20));
                                    }
                                } else {
                                    v2_3 = v19_0;
                                }
                            }
                        }
                        int v3_4;
                        if (!this.i(v5_9)) {
                            v3_4 = v27_1;
                        } else {
                            v3_4 = (v27_1 + this.r);
                        }
                        int v3_6 = (v3_4 + v1_8.leftMargin);
                        v6_6.layout(v3_6, v2_3, (v3_6 + v20), (v2_3 + v16));
                        v2_6 = ((v20 + v1_8.rightMargin) + v3_6);
                    }
                } else {
                    v25_1 = v1_3;
                }
                v9_0++;
                v1_3 = v25_1;
                v3_7 = v19_0;
                int v6 = 16;
            }
        } else {
            int v5_3;
            int v1_5 = this.getPaddingLeft();
            int v10_0 = (p26 - p24);
            int v11_1 = (v10_0 - this.getPaddingRight());
            int v10_2 = ((v10_0 - v1_5) - this.getPaddingRight());
            int v12_1 = this.getVirtualChildCount();
            int v13_0 = this.e;
            int v14_0 = (v13_0 & 112);
            int v7_0 = (8388615 & v13_0);
            if (v14_0 == 16) {
                v5_3 = (this.getPaddingTop() + (((p27 - p25) - this.f) / 2));
            } else {
                if (v14_0 == 80) {
                    v5_3 = (((this.getPaddingTop() + p27) - p25) - this.f);
                } else {
                    v5_3 = this.getPaddingTop();
                }
            }
            int v4_8 = 0;
            while (v4_8 < v12_1) {
                int v23_1;
                int v6_4 = this.getChildAt(v4_8);
                if ((v6_4 == 0) || (v6_4.getVisibility() == v3_18)) {
                    v23_1 = v8_9;
                } else {
                    int v13_3 = v6_4.getMeasuredWidth();
                    int v14_1 = v6_4.getMeasuredHeight();
                    n.x1 v15_1 = ((n.x1) v6_4.getLayoutParams());
                    v23_1 = v8_9;
                    int v8_1 = v15_1.gravity;
                    if (v8_1 < 0) {
                        v8_1 = v7_0;
                    }
                    int v8_3;
                    int v3_15;
                    int v3_14;
                    int v3_10 = (android.view.Gravity.getAbsoluteGravity(v8_1, this.getLayoutDirection()) & 7);
                    if (v3_10 == 1) {
                        v3_14 = ((((v10_2 - v13_3) / 2) + v1_5) + v15_1.leftMargin);
                        v8_3 = v15_1.rightMargin;
                        v3_15 = (v3_14 - v8_3);
                    } else {
                        if (v3_10 == 5) {
                            v3_14 = (v11_1 - v13_3);
                            v8_3 = v15_1.rightMargin;
                        } else {
                            v3_15 = (v15_1.leftMargin + v1_5);
                        }
                    }
                    if (this.i(v4_8)) {
                        v5_3 += this.s;
                    }
                    int v5_7 = (v5_3 + v15_1.topMargin);
                    v6_4.layout(v3_15, v5_7, (v13_3 + v3_15), (v5_7 + v14_1));
                    v5_3 = ((v14_1 + v15_1.bottomMargin) + v5_7);
                }
                v4_8++;
                v8_9 = v23_1;
                v3_18 = 8;
            }
        }
        return;
    }

    public void onMeasure(int p39, int p40)
    {
        n.y1 v0 = this;
        n.x1 v7_1 = -2;
        int v9_0 = 0;
        int v10_9 = 1073741824;
        int v11_0 = 8;
        if (this.d != 1) {
            int v2_3 = p39;
            this.f = 0;
            int v6_1 = this.getVirtualChildCount();
            n.x1 v7_3 = android.view.View$MeasureSpec.getMode(p39);
            int v8_1 = android.view.View$MeasureSpec.getMode(p40);
            if ((this.o == null) || (this.p == null)) {
                int v1_34 = new int[4];
                this.o = v1_34;
                int v1_40 = new int[4];
                this.p = v1_40;
            }
            float v16_0;
            int v10_11 = this.o;
            int v11_10 = this.p;
            v10_11[3] = -1;
            int v13_13 = 2;
            v10_11[2] = -1;
            v10_11[1] = -1;
            v10_11[0] = -1;
            v11_10[3] = -1;
            v11_10[2] = -1;
            v11_10[1] = -1;
            v11_10[0] = -1;
            int v14_13 = this.a;
            int v15_22 = this.n;
            if (v7_3 != 1073741824) {
                v16_0 = 0;
            } else {
                v16_0 = 1;
            }
            float v28_1 = 0;
            int v29_1 = 1;
            int v1_63 = 0;
            int v3_27 = 0;
            int v4_4 = 0;
            int v5_40 = 0;
            int v9_8 = 0;
            int v12_5 = 0;
            int v19_1 = 0;
            int v22_6 = 0;
            while (v1_63 < v6_1) {
                int v1_84;
                int v34_1;
                int v32_1;
                int v33_1;
                int v35_0;
                int v31_1;
                int v30_2 = v13_13;
                int v13_35 = this.getChildAt(v1_63);
                if (v13_35 != 0) {
                    int v31_0 = v3_27;
                    if (v13_35.getVisibility() != 8) {
                        if (this.i(v1_63)) {
                            this.f = (this.f + this.r);
                        }
                        int v11_13;
                        int v36_0;
                        int v10_15;
                        int v1_69;
                        int v13_36;
                        int v14_22;
                        int v2_9 = ((n.x1) v13_35.getLayoutParams());
                        int v3_22 = v2_9.weight;
                        v28_1 += v3_22;
                        int v32_0 = v1_63;
                        if ((v7_3 != 1073741824) || ((v2_9.width != 0) || (v3_22 <= 0))) {
                            if ((v2_9.width != 0) || (v3_22 <= 0)) {
                                int v1_58 = -2147483648;
                            } else {
                                v2_9.width = -2;
                                v1_58 = 0;
                            }
                            int v3_24;
                            if (v28_1 != 0) {
                                v3_24 = 0;
                            } else {
                                v3_24 = this.f;
                            }
                            v32_1 = v11_10;
                            v11_13 = v5_40;
                            v33_1 = v32_0;
                            v34_1 = v14_13;
                            v35_0 = v15_22;
                            int v15_24 = v1_58;
                            v14_22 = v2_9;
                            int v1_60 = v13_35;
                            v13_36 = v31_0;
                            v2_3 = p39;
                            v31_1 = v10_11;
                            v10_15 = v4_4;
                            this.measureChildWithMargins(v1_60, p39, v3_24, p40, 0);
                            if (v15_24 != -2147483648) {
                                v14_22.width = v15_24;
                            }
                            int v3_26 = v1_60.getMeasuredWidth();
                            if (v16_0 == 0) {
                                v36_0 = v1_60;
                                int v1_61 = this.f;
                                this.f = Math.max(v1_61, (((v1_61 + v3_26) + v14_22.leftMargin) + v14_22.rightMargin));
                            } else {
                                v36_0 = v1_60;
                                this.f = (((v14_22.leftMargin + v3_26) + v14_22.rightMargin) + this.f);
                            }
                            if (v35_0 == 0) {
                                v1_69 = 1073741824;
                            } else {
                                v9_8 = Math.max(v3_26, v9_8);
                            }
                        } else {
                            if (v16_0 == 0) {
                                int v1_65 = this.f;
                                this.f = Math.max(v1_65, ((v2_9.leftMargin + v1_65) + v2_9.rightMargin));
                            } else {
                                this.f = ((v2_9.leftMargin + v2_9.rightMargin) + this.f);
                            }
                            if (v14_13 == 0) {
                                v36_0 = v13_35;
                                v34_1 = v14_13;
                                v35_0 = v15_22;
                                v22_6 = 1;
                                v13_36 = v31_0;
                                v33_1 = v32_0;
                                v1_69 = 1073741824;
                                v14_22 = v2_9;
                                v31_1 = v10_11;
                                v32_1 = v11_10;
                                v2_3 = p39;
                                v10_15 = v4_4;
                                v11_13 = v5_40;
                            } else {
                                v13_35.measure(android.view.View$MeasureSpec.makeMeasureSpec(0, 0), android.view.View$MeasureSpec.makeMeasureSpec(0, 0));
                                v36_0 = v13_35;
                                v34_1 = v14_13;
                                v35_0 = v15_22;
                                v13_36 = v31_0;
                                v33_1 = v32_0;
                                v14_22 = v2_9;
                                v31_1 = v10_11;
                                v32_1 = v11_10;
                                v2_3 = p39;
                                v10_15 = v4_4;
                                v11_13 = v5_40;
                            }
                        }
                        if ((v8_1 == v1_69) || (v14_22.height != -1)) {
                            int v1_72 = 0;
                        } else {
                            v1_72 = 1;
                            v19_1 = 1;
                        }
                        int v36_1;
                        int v3_38 = (v14_22.topMargin + v14_22.bottomMargin);
                        int v5_43 = (v36_0.getMeasuredHeight() + v3_38);
                        v12_5 = android.view.View.combineMeasuredStates(v12_5, v36_0.getMeasuredState());
                        if (v34_1 == 0) {
                            v36_1 = v1_72;
                        } else {
                            int v15_32 = v36_0.getBaseline();
                            v36_1 = v1_72;
                            if (v15_32 != -1) {
                                int v1_74 = v14_22.gravity;
                                if (v1_74 < 0) {
                                    v1_74 = this.e;
                                }
                                int v37 = ((((v1_74 & 112) >> 4) & -2) >> 1);
                                v31_1[v37] = Math.max(v31_1[v37], v15_32);
                                v32_1[v37] = Math.max(v32_1[v37], (v5_43 - v15_32));
                            }
                        }
                        int v13_38;
                        int v1_83 = Math.max(v13_36, v5_43);
                        if ((v29_1 == 0) || (v14_22.height != -1)) {
                            v13_38 = 0;
                        } else {
                            v13_38 = 1;
                        }
                        int v3_39;
                        if (v14_22.weight <= 0) {
                            if (v36_1 == 0) {
                                v3_38 = v5_43;
                            }
                            v3_39 = Math.max(v10_15, v3_38);
                            v5_40 = v11_13;
                        } else {
                            if (v36_1 == 0) {
                                v3_38 = v5_43;
                            }
                            v5_40 = Math.max(v11_13, v3_38);
                            v3_39 = v10_15;
                        }
                        v3_27 = v1_83;
                        v1_84 = v3_39;
                        v29_1 = v13_38;
                    } else {
                        v2_3 = p39;
                        v33_1 = v1_63;
                        v1_84 = v4_4;
                        v32_1 = v11_10;
                        v34_1 = v14_13;
                        v35_0 = v15_22;
                        v3_27 = v31_0;
                        v31_1 = v10_11;
                    }
                } else {
                    this.f = this.f;
                    v33_1 = v1_63;
                    v1_84 = v4_4;
                    v31_1 = v10_11;
                    v32_1 = v11_10;
                    v34_1 = v14_13;
                    v35_0 = v15_22;
                }
                v4_4 = v1_84;
                v1_63 = (v33_1 + 1);
                v13_13 = v30_2;
                v10_11 = v31_1;
                v11_10 = v32_1;
                v14_13 = v34_1;
                v15_22 = v35_0;
            }
            int v31_2 = v10_11;
            int v32_2 = v11_10;
            int v30_3 = v13_13;
            int v34_2 = v14_13;
            int v35_1 = v15_22;
            int v13_40 = v3_27;
            int v10_14 = v4_4;
            int v11_14 = v5_40;
            if ((this.f > 0) && (this.i(v6_1))) {
                this.f = (this.f + this.r);
            }
            int v3_10;
            int v1_92 = v31_2[1];
            if ((v1_92 == -1) && ((v31_2[0] == -1) && ((v31_2[v30_3] == -1) && (v31_2[3] == -1)))) {
                v3_10 = v13_40;
            } else {
                v3_10 = Math.max(v13_40, (Math.max(v32_2[3], Math.max(v32_2[0], Math.max(v32_2[1], v32_2[v30_3]))) + Math.max(v31_2[3], Math.max(v31_2[0], Math.max(v1_92, v31_2[v30_3])))));
            }
            if ((v35_1 != 0) && ((v7_3 == -2147483648) || (v7_3 == null))) {
                this.f = 0;
                int v1_19 = 0;
                while (v1_19 < v6_1) {
                    int v5_28 = this.getChildAt(v1_19);
                    if (v5_28 != 0) {
                        if (v5_28.getVisibility() != 8) {
                            int v5_30 = ((n.x1) v5_28.getLayoutParams());
                            if (v16_0 == 0) {
                                int v13_33 = this.f;
                                this.f = Math.max(v13_33, (((v13_33 + v9_8) + v5_30.leftMargin) + v5_30.rightMargin));
                            } else {
                                this.f = (((v5_30.leftMargin + v9_8) + v5_30.rightMargin) + this.f);
                            }
                        }
                    } else {
                        this.f = this.f;
                    }
                    v1_19++;
                }
            }
            int v21_0;
            int v22_1;
            int v17_1;
            int v5_14;
            int v13_5 = ((this.getPaddingRight() + this.getPaddingLeft()) + this.f);
            this.f = v13_5;
            int v1_23 = android.view.View.resolveSizeAndState(Math.max(v13_5, this.getSuggestedMinimumWidth()), v2_3, 0);
            int v5_13 = ((v1_23 & 16777215) - this.f);
            if ((v22_6 == 0) && ((v5_13 == 0) || (v28_1 <= 0))) {
                v5_14 = Math.max(v10_14, v11_14);
                if ((v35_1 != 0) && (v7_3 != 1073741824)) {
                    n.x1 v7_2 = 0;
                    while (v7_2 < v6_1) {
                        int v10_10 = this.getChildAt(v7_2);
                        if ((v10_10 != 0) && ((v10_10.getVisibility() != 8) && (((n.x1) v10_10.getLayoutParams()).weight > 0))) {
                            v10_10.measure(android.view.View$MeasureSpec.makeMeasureSpec(v9_8, 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(v10_10.getMeasuredHeight(), 1073741824));
                        }
                        v7_2++;
                    }
                }
                v22_1 = v1_23;
                v17_1 = -16777216;
                v21_0 = 0;
            } else {
                int v3_11 = this.m;
                if (v3_11 > 0) {
                    v28_1 = v3_11;
                }
                v31_2[3] = -1;
                v31_2[v30_3] = -1;
                v31_2[1] = -1;
                v31_2[0] = -1;
                v32_2[3] = -1;
                v32_2[v30_3] = -1;
                v32_2[1] = -1;
                v32_2[0] = -1;
                this.f = 0;
                v3_10 = -1;
                int v9_2 = 0;
                while (v9_2 < v6_1) {
                    int v22_2;
                    int v11_9 = this.getChildAt(v9_2);
                    if ((v11_9 != 0) && (v11_9.getVisibility() != 8)) {
                        int v14_9 = ((n.x1) v11_9.getLayoutParams());
                        int v15_6 = v14_9.weight;
                        if (v15_6 <= 0) {
                            v22_2 = v1_23;
                        } else {
                            int v15_12;
                            int v13_11 = ((int) ((((float) v5_13) * v15_6) / v28_1));
                            v28_1 -= v15_6;
                            v5_13 -= v13_11;
                            v22_2 = v1_23;
                            int v1_42 = android.view.ViewGroup.getChildMeasureSpec(p40, (((this.getPaddingBottom() + this.getPaddingTop()) + v14_9.topMargin) + v14_9.bottomMargin), v14_9.height);
                            if (v14_9.width != 0) {
                                v15_12 = 1073741824;
                                int v13_14 = (v11_9.getMeasuredWidth() + v13_11);
                                if (v13_14 < 0) {
                                    v13_14 = 0;
                                }
                                v11_9.measure(android.view.View$MeasureSpec.makeMeasureSpec(v13_14, v15_12), v1_42);
                            } else {
                                v15_12 = 1073741824;
                                if (v7_3 == 1073741824) {
                                    if (v13_11 <= 0) {
                                        v13_11 = 0;
                                    }
                                    v11_9.measure(android.view.View$MeasureSpec.makeMeasureSpec(v13_11, 1073741824), v1_42);
                                }
                            }
                            v12_5 = android.view.View.combineMeasuredStates(v12_5, (v11_9.getMeasuredState() & -16777216));
                        }
                        if (v16_0 == 0) {
                            int v1_45 = this.f;
                            this.f = Math.max(v1_45, (((v11_9.getMeasuredWidth() + v1_45) + v14_9.leftMargin) + v14_9.rightMargin));
                        } else {
                            this.f = (((v11_9.getMeasuredWidth() + v14_9.leftMargin) + v14_9.rightMargin) + this.f);
                        }
                        if ((v8_1 == 1073741824) || (v14_9.height != -1)) {
                            int v1_50 = 0;
                        } else {
                            v1_50 = 1;
                        }
                        int v13_25 = (v14_9.topMargin + v14_9.bottomMargin);
                        int v15_20 = (v11_9.getMeasuredHeight() + v13_25);
                        v3_10 = Math.max(v3_10, v15_20);
                        if (v1_50 == 0) {
                            v13_25 = v15_20;
                        }
                        int v10_13;
                        int v13_26;
                        int v1_51 = Math.max(v10_14, v13_25);
                        if (v29_1 == 0) {
                            v13_26 = -1;
                            v10_13 = 0;
                        } else {
                            v13_26 = -1;
                            if (v14_9.height != -1) {
                            } else {
                                v10_13 = 1;
                            }
                        }
                        if (v34_2 != 0) {
                            int v11_11 = v11_9.getBaseline();
                            if (v11_11 != v13_26) {
                                int v13_27 = v14_9.gravity;
                                if (v13_27 < 0) {
                                    v13_27 = this.e;
                                }
                                int v13_31 = ((((v13_27 & 112) >> 4) & -2) >> 1);
                                v31_2[v13_31] = Math.max(v31_2[v13_31], v11_11);
                                v32_2[v13_31] = Math.max(v32_2[v13_31], (v15_20 - v11_11));
                            }
                        }
                        v29_1 = v10_13;
                        v10_14 = v1_51;
                    } else {
                        v22_2 = v1_23;
                        int v25 = -2;
                    }
                    v9_2++;
                    v1_23 = v22_2;
                }
                v22_1 = v1_23;
                v17_1 = -16777216;
                this.f = ((this.getPaddingRight() + this.getPaddingLeft()) + this.f);
                int v1_26 = v31_2[1];
                if ((v1_26 == -1) && ((v31_2[0] == -1) && ((v31_2[v30_3] == -1) && (v31_2[3] == -1)))) {
                    v21_0 = 0;
                } else {
                    v21_0 = 0;
                    v3_10 = Math.max(v3_10, (Math.max(v32_2[3], Math.max(v32_2[0], Math.max(v32_2[1], v32_2[v30_3]))) + Math.max(v31_2[3], Math.max(v31_2[0], Math.max(v1_26, v31_2[v30_3])))));
                }
                v5_14 = v10_14;
            }
            if ((v29_1 == 0) && (v8_1 != 1073741824)) {
                v3_10 = v5_14;
            }
            this.setMeasuredDimension((v22_1 | (v12_5 & v17_1)), android.view.View.resolveSizeAndState(Math.max(((this.getPaddingBottom() + this.getPaddingTop()) + v3_10), this.getSuggestedMinimumHeight()), p40, (v12_5 << 16)));
            if (v19_1 != 0) {
                int v4_2 = android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);
                int v9_7 = v21_0;
                while (v9_7 < v6_1) {
                    int v1_39 = v0.getChildAt(v9_7);
                    if (v1_39.getVisibility() != 8) {
                        n.x1 v7_11 = ((n.x1) v1_39.getLayoutParams());
                        if (v7_11.height == -1) {
                            int v8_2 = v7_11.width;
                            v7_11.width = v1_39.getMeasuredWidth();
                            v0.measureChildWithMargins(v1_39, v2_3, 0, v4_2, 0);
                            v7_11.width = v8_2;
                        }
                    }
                    v9_7++;
                    v0 = this;
                    v2_3 = p39;
                }
            }
        } else {
            this.f = 0;
            int v15_35 = this.getVirtualChildCount();
            int v1_18 = android.view.View$MeasureSpec.getMode(p39);
            int v2_2 = android.view.View$MeasureSpec.getMode(p40);
            int v3_9 = this.b;
            int v4_1 = this.n;
            int v5_7 = 0;
            int v6_0 = 0;
            int v8_0 = 0;
            int v19_0 = 0;
            int v22_0 = 0;
            int v23 = 0;
            int v24_0 = 1;
            float v16_1 = 0;
            int v14_0 = 0;
            while (v5_7 < v15_35) {
                int v13_1;
                int v12_0;
                float v28_0;
                n.x1 v7_0;
                int v29_0;
                v25 = v1_18;
                int v1_105 = this.getChildAt(v5_7);
                if (v1_105 != 0) {
                    if (v1_105.getVisibility() != v11_0) {
                        if (this.i(v5_7)) {
                            this.f = (this.f + this.s);
                        }
                        int v30_0;
                        int v11_28 = ((n.x1) v1_105.getLayoutParams());
                        int v12_11 = v11_28.weight;
                        v16_1 += v12_11;
                        if ((v2_2 != v10_9) || ((v11_28.height != 0) || (v12_11 <= 0))) {
                            if ((v11_28.height != 0) || (v12_11 <= 0)) {
                                int v10_36 = -2147483648;
                            } else {
                                v11_28.height = v7_1;
                                v10_36 = 0;
                            }
                            int v5_59;
                            int v12_13;
                            if (v16_1 != 0) {
                                v12_13 = v5_7;
                                v5_59 = 0;
                            } else {
                                v12_13 = v5_7;
                                v5_59 = this.f;
                            }
                            v29_0 = v2_2;
                            v28_0 = v4_1;
                            v7_0 = v3_9;
                            v13_1 = v12_13;
                            v12_0 = v25;
                            this.measureChildWithMargins(v1_105, p39, 0, p40, v5_59);
                            if (v10_36 != -2147483648) {
                                v11_28.height = v10_36;
                            }
                            int v3_3 = v1_105.getMeasuredHeight();
                            int v5_0 = this.f;
                            v30_0 = v1_105;
                            this.f = Math.max(v5_0, (((v5_0 + v3_3) + v11_28.topMargin) + v11_28.bottomMargin));
                            if (v28_0 != 0) {
                                v14_0 = Math.max(v3_3, v14_0);
                            }
                        } else {
                            int v10_3 = this.f;
                            this.f = Math.max(v10_3, ((v11_28.topMargin + v10_3) + v11_28.bottomMargin));
                            v30_0 = v1_105;
                            v29_0 = v2_2;
                            v7_0 = v3_9;
                            v28_0 = v4_1;
                            v13_1 = v5_7;
                            v19_0 = 1;
                            v12_0 = v25;
                            int v4 = p40;
                        }
                        if ((v7_0 >= null) && (v7_0 == (v13_1 + 1))) {
                            this.c = this.f;
                        }
                        if ((v13_1 < v7_0) && (v11_28.weight > 0)) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex.");
                        } else {
                            if ((v12_0 == 1073741824) || (v11_28.width != -1)) {
                                int v1_12 = 0;
                            } else {
                                v1_12 = 1;
                                v23 = 1;
                            }
                            int v1_16;
                            int v3_6 = (v11_28.leftMargin + v11_28.rightMargin);
                            int v5_5 = (v30_0.getMeasuredWidth() + v3_6);
                            v9_0 = Math.max(v9_0, v5_5);
                            int v30_1 = v1_12;
                            int v1_14 = android.view.View.combineMeasuredStates(v22_0, v30_0.getMeasuredState());
                            if (v24_0 == 0) {
                                v22_0 = v1_14;
                                v1_16 = 0;
                            } else {
                                v22_0 = v1_14;
                                if (v11_28.width != -1) {
                                } else {
                                    v1_16 = 1;
                                }
                            }
                            if (v11_28.weight <= 0) {
                                if (v30_1 == 0) {
                                    v3_6 = v5_5;
                                }
                                v6_0 = Math.max(v6_0, v3_6);
                            } else {
                                if (v30_1 == 0) {
                                    v3_6 = v5_5;
                                }
                                v8_0 = Math.max(v8_0, v3_6);
                            }
                            v24_0 = v1_16;
                        }
                    } else {
                        v29_0 = v2_2;
                        v7_0 = v3_9;
                        v28_0 = v4_1;
                        v13_1 = v5_7;
                        v12_0 = v25;
                        v4 = p40;
                    }
                } else {
                    this.f = this.f;
                }
                v5_7 = (v13_1 + 1);
                v3_9 = v7_0;
                v1_18 = v12_0;
                v4_1 = v28_0;
                v2_2 = v29_0;
                v7_1 = -2;
                v10_9 = 1073741824;
                v11_0 = 8;
            }
            int v12_6 = v1_18;
            int v29_3 = v2_2;
            float v28_2 = v4_1;
            int v1_85 = v22_0;
            int v4_6 = p40;
            if ((this.f > 0) && (this.i(v15_35))) {
                this.f = (this.f + this.s);
            }
            int v3_44 = v29_3;
            if ((v28_2 != 0) && ((v3_44 == -2147483648) || (v3_44 == 0))) {
                this.f = 0;
                int v5_47 = 0;
                while (v5_47 < v15_35) {
                    n.x1 v7_25 = this.getChildAt(v5_47);
                    if (v7_25 != null) {
                        if (v7_25.getVisibility() != 8) {
                            n.x1 v7_27 = ((n.x1) v7_25.getLayoutParams());
                            int v10_31 = this.f;
                            this.f = Math.max(v10_31, (((v10_31 + v14_0) + v7_27.topMargin) + v7_27.bottomMargin));
                        }
                    } else {
                        this.f = this.f;
                    }
                    v5_47++;
                }
            }
            int v10_19 = ((this.getPaddingBottom() + this.getPaddingTop()) + this.f);
            this.f = v10_19;
            int v5_51 = android.view.View.resolveSizeAndState(Math.max(v10_19, this.getSuggestedMinimumHeight()), p40, 0);
            n.x1 v7_15 = ((v5_51 & 16777215) - this.f);
            if ((v19_0 == 0) && ((v7_15 == null) || (v16_1 <= 0))) {
                v6_0 = Math.max(v6_0, v8_0);
                if ((v28_2 != 0) && (v3_44 != 1073741824)) {
                    int v3_45 = 0;
                    while (v3_45 < v15_35) {
                        n.x1 v7_17 = this.getChildAt(v3_45);
                        if ((v7_17 != null) && ((v7_17.getVisibility() != 8) && (((n.x1) v7_17.getLayoutParams()).weight > 0))) {
                            v7_17.measure(android.view.View$MeasureSpec.makeMeasureSpec(v7_17.getMeasuredWidth(), 1073741824), android.view.View$MeasureSpec.makeMeasureSpec(v14_0, 1073741824));
                        }
                        v3_45++;
                    }
                }
            } else {
                int v8_10 = this.m;
                if (v8_10 > 0) {
                    v16_1 = v8_10;
                }
                this.f = 0;
                int v8_12 = v1_85;
                int v1_90 = 0;
                while (v1_90 < v15_35) {
                    int v17_5;
                    int v10_24 = this.getChildAt(v1_90);
                    if (v10_24.getVisibility() != 8) {
                        int v11_20 = ((n.x1) v10_24.getLayoutParams());
                        int v13_44 = v11_20.weight;
                        if (v13_44 <= 0) {
                            v17_5 = v1_90;
                        } else {
                            int v13_50;
                            int v14_30 = ((int) ((((float) v7_15) * v13_44) / v16_1));
                            v16_1 -= v13_44;
                            v7_15 -= v14_30;
                            v17_5 = v1_90;
                            int v1_97 = android.view.ViewGroup.getChildMeasureSpec(p39, (((this.getPaddingRight() + this.getPaddingLeft()) + v11_20.leftMargin) + v11_20.rightMargin), v11_20.width);
                            if (v11_20.height != 0) {
                                v13_50 = 1073741824;
                                int v14_32 = (v10_24.getMeasuredHeight() + v14_30);
                                if (v14_32 < 0) {
                                    v14_32 = 0;
                                }
                                v10_24.measure(v1_97, android.view.View$MeasureSpec.makeMeasureSpec(v14_32, v13_50));
                            } else {
                                v13_50 = 1073741824;
                                if (v3_44 == 1073741824) {
                                    if (v14_30 <= 0) {
                                        v14_30 = 0;
                                    }
                                    v10_24.measure(v1_97, android.view.View$MeasureSpec.makeMeasureSpec(v14_30, 1073741824));
                                }
                            }
                            v8_12 = android.view.View.combineMeasuredStates(v8_12, (v10_24.getMeasuredState() & -256));
                        }
                        int v1_102;
                        int v1_101 = (v11_20.leftMargin + v11_20.rightMargin);
                        int v13_53 = (v10_24.getMeasuredWidth() + v1_101);
                        v9_0 = Math.max(v9_0, v13_53);
                        if (v12_6 == 1073741824) {
                            v1_102 = -1;
                        } else {
                            v1_102 = -1;
                            if (v11_20.width == -1) {
                                v13_53 = v1_101;
                            }
                        }
                        int v1_103;
                        v6_0 = Math.max(v6_0, v13_53);
                        if ((v24_0 == 0) || (v11_20.width != v1_102)) {
                            v1_103 = 0;
                        } else {
                            v1_103 = 1;
                        }
                        int v13_55 = this.f;
                        this.f = Math.max(v13_55, (((v10_24.getMeasuredHeight() + v13_55) + v11_20.topMargin) + v11_20.bottomMargin));
                        v24_0 = v1_103;
                    } else {
                        v17_5 = v1_90;
                    }
                    v1_90 = (v17_5 + 1);
                }
                this.f = ((this.getPaddingBottom() + this.getPaddingTop()) + this.f);
                v1_85 = v8_12;
            }
            if ((v24_0 != 0) || (v12_6 == 1073741824)) {
                v6_0 = v9_0;
            }
            this.setMeasuredDimension(android.view.View.resolveSizeAndState(Math.max(((this.getPaddingRight() + this.getPaddingLeft()) + v6_0), this.getSuggestedMinimumWidth()), p39, v1_85), v5_51);
            if (v23 != 0) {
                int v2_11 = android.view.View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
                int v9_9 = 0;
                while (v9_9 < v15_35) {
                    int v1_95 = this.getChildAt(v9_9);
                    if (v1_95.getVisibility() != 8) {
                        int v6_3 = ((n.x1) v1_95.getLayoutParams());
                        if (v6_3.width == -1) {
                            n.x1 v7_24 = v6_3.height;
                            v6_3.height = v1_95.getMeasuredHeight();
                            this.measureChildWithMargins(v1_95, v2_11, 0, v4_6, 0);
                            v6_3.height = v7_24;
                        }
                    }
                    v9_9++;
                    v4_6 = p40;
                }
            }
        }
        return;
    }

    public void setBaselineAligned(boolean p1)
    {
        this.a = p1;
        return;
    }

    public void setBaselineAlignedChildIndex(int p3)
    {
        if ((p3 < null) || (p3 >= this.getChildCount())) {
            String v0_3 = new StringBuilder("base aligned child index out of range (0, ");
            v0_3.append(this.getChildCount());
            v0_3.append(")");
            throw new IllegalArgumentException(v0_3.toString());
        } else {
            this.b = p3;
            return;
        }
    }

    public void setDividerDrawable(android.graphics.drawable.Drawable p3)
    {
        if (p3 != this.q) {
            this.q = p3;
            int v0_1 = 0;
            if (p3 == null) {
                this.r = 0;
                this.s = 0;
            } else {
                this.r = p3.getIntrinsicWidth();
                this.s = p3.getIntrinsicHeight();
            }
            if (p3 == null) {
                v0_1 = 1;
            }
            this.setWillNotDraw(v0_1);
            this.requestLayout();
            return;
        } else {
            return;
        }
    }

    public void setDividerPadding(int p1)
    {
        this.u = p1;
        return;
    }

    public void setGravity(int p2)
    {
        if (this.e != p2) {
            if ((8388615 & p2) == 0) {
                p2 |= 8388611;
            }
            if ((p2 & 112) == 0) {
                p2 |= 48;
            }
            this.e = p2;
            this.requestLayout();
        }
        return;
    }

    public void setHorizontalGravity(int p3)
    {
        int v3_1 = (p3 & 8388615);
        int v1 = this.e;
        if ((8388615 & v1) != v3_1) {
            this.e = (v3_1 | (-8388616 & v1));
            this.requestLayout();
        }
        return;
    }

    public void setMeasureWithLargestChildEnabled(boolean p1)
    {
        this.n = p1;
        return;
    }

    public void setOrientation(int p2)
    {
        if (this.d != p2) {
            this.d = p2;
            this.requestLayout();
        }
        return;
    }

    public void setShowDividers(int p2)
    {
        if (p2 != this.t) {
            this.requestLayout();
        }
        this.t = p2;
        return;
    }

    public void setVerticalGravity(int p3)
    {
        int v3_1 = (p3 & 112);
        int v0_0 = this.e;
        if ((v0_0 & 112) != v3_1) {
            this.e = (v3_1 | (v0_0 & -113));
            this.requestLayout();
        }
        return;
    }

    public void setWeightSum(float p2)
    {
        this.m = Math.max(0, p2);
        return;
    }

    public final boolean shouldDelayChildPressedState()
    {
        return 0;
    }
}
