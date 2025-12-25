package i3;
public abstract class e extends android.widget.LinearLayout {
    public final java.util.ArrayList a;
    public final java.util.ArrayList b;
    public final l6.c c;
    public final i3.d d;
    public Integer[] e;
    public v3.b0 f;
    public v3.d0 m;
    public int n;
    public v3.f0 o;
    public boolean p;

    public e(android.content.Context p13, android.util.AttributeSet p14)
    {
        super(a4.a.a(p13, p14, 2130969442, 2132018251), p14, 2130969442);
        super.a = new java.util.ArrayList();
        super.b = new java.util.ArrayList();
        super.c = new l6.c(((com.google.android.material.button.MaterialButtonToggleGroup) super), 28);
        super.d = new i3.d(((com.google.android.material.button.MaterialButtonToggleGroup) super));
        super.p = 1;
        Throwable v1_2 = super.getContext();
        v3.d0 v6_5 = new int[0];
        android.content.res.TypedArray v14_1 = q3.k.f(v1_2, p14, c3.a.k, 2130969442, 2132018251, v6_5);
        v3.d0 v6_1 = 0;
        if (v14_1.hasValue(2)) {
            Throwable v0_20;
            Throwable v0_18 = v14_1.getResourceId(2, 0);
            try {
                if ((v0_18 != null) && (v1_2.getResources().getResourceTypeName(v0_18).equals("xml"))) {
                    android.util.AttributeSet v8_8 = v1_2.getResources().getXml(v0_18);
                    try {
                        v0_20 = new v3.f0();
                        android.content.res.Resources$Theme v10_2 = new int[][10];
                        v0_20.c = v10_2;
                        int v9_5 = new j6.o[10];
                        v0_20.d = v9_5;
                        int v9_6 = android.util.Xml.asAttributeSet(v8_8);
                    } catch (Throwable v0_23) {
                        int v9_7 = v0_23;
                        if (v8_8 != null) {
                            try {
                                v8_8.close();
                            } catch (Throwable v0_24) {
                                v9_7.addSuppressed(v0_24);
                            }
                        }
                        throw v9_7;
                    }
                    while(true) {
                        android.content.res.Resources$Theme v10_3 = v8_8.next();
                        if ((v10_3 == 2) || (v10_3 == 1)) {
                            break;
                        }
                    }
                    if (v10_3 != 2) {
                        throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                    } else {
                        if (v8_8.getName().equals("selector")) {
                            v0_20.a(v1_2, v8_8, v9_6, v1_2.getTheme());
                        }
                        v8_8.close();
                    }
                } else {
                    v0_20 = 0;
                }
            } catch (android.content.res.Resources$NotFoundException) {
            }
            super.o = v0_20;
        }
        if (v14_1.hasValue(4)) {
            android.util.AttributeSet v8_10 = v3.d0.b(v1_2, v14_1, 4);
            super.m = v8_10;
            if (v8_10 == null) {
                android.util.AttributeSet v8_0 = new v3.c0(v3.p.a(v1_2, v14_1.getResourceId(4, 0), v14_1.getResourceId(5, 0), new v3.a(((float) 0))).a());
                if (v8_0.a != 0) {
                    v6_1 = new v3.d0(v8_0);
                }
                super.m = v6_1;
            }
        }
        if (v14_1.hasValue(3)) {
            Throwable v0_9;
            v3.d0 v6_4 = new v3.a(0);
            android.util.AttributeSet v8_2 = v14_1.getResourceId(3, 0);
            if (v8_2 != null) {
                if (v1_2.getResources().getResourceTypeName(v8_2).equals("xml")) {
                    try {
                        android.content.res.XmlResourceParser v5_1 = v1_2.getResources().getXml(v8_2);
                        try {
                            v0_9 = new v3.b0();
                            android.util.AttributeSet v8_3 = android.util.Xml.asAttributeSet(v5_1);
                        } catch (Throwable v0_12) {
                            Throwable v1_1 = v0_12;
                            if (v5_1 != null) {
                                try {
                                    v5_1.close();
                                } catch (Throwable v0_13) {
                                    v1_1.addSuppressed(v0_13);
                                }
                            }
                            throw v1_1;
                        }
                        while(true) {
                            int v9_3 = v5_1.next();
                            if ((v9_3 == 2) || (v9_3 == 1)) {
                                break;
                            }
                        }
                        if (v9_3 != 2) {
                            throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
                        } else {
                            if (v5_1.getName().equals("selector")) {
                                v0_9.d(v1_2, v5_1, v8_3, v1_2.getTheme());
                            }
                            v5_1.close();
                        }
                    } catch (android.content.res.Resources$NotFoundException) {
                        v0_9 = v3.b0.b(v6_4);
                    }
                } else {
                    v0_9 = v3.b0.b(v3.p.c(v14_1, 3, v6_4));
                }
            } else {
                v0_9 = v3.b0.b(v3.p.c(v14_1, 3, v6_4));
            }
            super.f = v0_9;
        }
        super.n = v14_1.getDimensionPixelSize(1, 0);
        super.setChildrenDrawingOrderEnabled(1);
        super.setEnabled(v14_1.getBoolean(0, 1));
        v14_1.recycle();
        return;
    }

    private int getFirstVisibleChildIndex()
    {
        int v0_0 = this.getChildCount();
        int v1 = 0;
        while (v1 < v0_0) {
            if (!this.c(v1)) {
                v1++;
            } else {
                return v1;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex()
    {
        int v0_1 = (this.getChildCount() - 1);
        while (v0_1 >= 0) {
            if (!this.c(v0_1)) {
                v0_1--;
            } else {
                return v0_1;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(com.google.android.material.button.MaterialButton p3)
    {
        if (p3.getId() == -1) {
            p3.setId(android.view.View.generateViewId());
        }
        return;
    }

    public final void a()
    {
        android.widget.LinearLayout$LayoutParams v0_0 = this.getFirstVisibleChildIndex();
        if (v0_0 != -1) {
            int v2_1 = (v0_0 + 1);
            while (v2_1 < this.getChildCount()) {
                int v7_1;
                com.google.android.material.button.MaterialButton v3_1 = ((com.google.android.material.button.MaterialButton) this.getChildAt(v2_1));
                int v6_2 = ((com.google.android.material.button.MaterialButton) this.getChildAt((v2_1 - 1)));
                if (this.n > 0) {
                    v3_1.setShouldDrawSurfaceColorStroke(0);
                    v6_2.setShouldDrawSurfaceColorStroke(0);
                    v7_1 = 0;
                } else {
                    v7_1 = Math.min(v3_1.getStrokeWidth(), v6_2.getStrokeWidth());
                    v3_1.setShouldDrawSurfaceColorStroke(1);
                    v6_2.setShouldDrawSurfaceColorStroke(1);
                }
                android.widget.LinearLayout$LayoutParams v4_2;
                android.widget.LinearLayout$LayoutParams v4_0 = v3_1.getLayoutParams();
                if (!(v4_0 instanceof android.widget.LinearLayout$LayoutParams)) {
                    v4_2 = new android.widget.LinearLayout$LayoutParams(v4_0.width, v4_0.height);
                } else {
                    v4_2 = ((android.widget.LinearLayout$LayoutParams) v4_0);
                }
                if (this.getOrientation() != 0) {
                    v4_2.bottomMargin = 0;
                    v4_2.topMargin = (this.n - v7_1);
                    v4_2.setMarginStart(0);
                } else {
                    v4_2.setMarginEnd(0);
                    v4_2.setMarginStart((this.n - v7_1));
                    v4_2.topMargin = 0;
                }
                v3_1.setLayoutParams(v4_2);
                v2_1++;
            }
            if ((this.getChildCount() != 0) && (v0_0 != -1)) {
                android.widget.LinearLayout$LayoutParams v0_4 = ((android.widget.LinearLayout$LayoutParams) ((com.google.android.material.button.MaterialButton) this.getChildAt(v0_0)).getLayoutParams());
                if (this.getOrientation() != 1) {
                    v0_4.setMarginEnd(0);
                    v0_4.setMarginStart(0);
                    v0_4.leftMargin = 0;
                    v0_4.rightMargin = 0;
                } else {
                    v0_4.topMargin = 0;
                    v0_4.bottomMargin = 0;
                    return;
                }
            }
        }
        return;
    }

    public void addView(android.view.View p2, int p3, android.view.ViewGroup$LayoutParams p4)
    {
        if ((p2 instanceof com.google.android.material.button.MaterialButton)) {
            this.d();
            this.p = 1;
            super.addView(p2, p3, p4);
            this.setGeneratedIdIfNeeded(((com.google.android.material.button.MaterialButton) p2));
            ((com.google.android.material.button.MaterialButton) p2).setOnPressedChangeListenerInternal(this.c);
            this.a.add(((com.google.android.material.button.MaterialButton) p2).getShapeAppearanceModel());
            this.b.add(((com.google.android.material.button.MaterialButton) p2).getStateListShapeAppearanceModel());
            ((com.google.android.material.button.MaterialButton) p2).setEnabled(this.isEnabled());
            return;
        } else {
            android.util.Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
    }

    public final void b()
    {
        if ((this.o != null) && (this.getChildCount() != 0)) {
            int v0_2 = this.getFirstVisibleChildIndex();
            int v1 = this.getLastVisibleChildIndex();
            int v2 = 2147483647;
            int v3_0 = v0_2;
            while (v3_0 <= v1) {
                if (this.c(v3_0)) {
                    int v5_0 = 0;
                    if ((this.c(v3_0)) && (this.o != null)) {
                        int v6_0 = this.o;
                        int v4_10 = ((com.google.android.material.button.MaterialButton) this.getChildAt(v3_0)).getWidth();
                        com.google.android.material.button.MaterialButton v7_1 = (- v4_10);
                        int v8_0 = 0;
                        while (v8_0 < v6_0.a) {
                            com.google.android.material.button.MaterialButton v7_0;
                            int v9_5 = ((v3.e0) v6_0.d[v8_0].b);
                            boolean v10_1 = v9_5.a;
                            int v9_6 = v9_5.b;
                            if (v10_1 != 2) {
                                if (v10_1 == 1) {
                                    v7_0 = Math.max(((float) v7_1), (((float) v4_10) * v9_6));
                                    v7_1 = ((int) v7_0);
                                }
                            } else {
                                v7_0 = Math.max(((float) v7_1), v9_6);
                            }
                            v8_0++;
                        }
                        int v4_11 = Math.max(0, v7_1);
                        int v6_1 = (v3_0 - 1);
                        while(true) {
                            int v6_2;
                            com.google.android.material.button.MaterialButton v7_2 = 0;
                            if (v6_1 < 0) {
                                break;
                            }
                            if (!this.c(v6_1)) {
                                v6_1--;
                            } else {
                                v6_2 = ((com.google.android.material.button.MaterialButton) this.getChildAt(v6_1));
                            }
                            int v6_4;
                            if (v6_2 != 0) {
                                v6_4 = v6_2.getAllowedWidthDecrease();
                            } else {
                                v6_4 = 0;
                            }
                            int v8_2 = this.getChildCount();
                            int v9_1 = (v3_0 + 1);
                            while (v9_1 < v8_2) {
                                if (!this.c(v9_1)) {
                                    v9_1++;
                                } else {
                                    v7_2 = ((com.google.android.material.button.MaterialButton) this.getChildAt(v9_1));
                                    break;
                                }
                            }
                            if (v7_2 != null) {
                                v5_0 = v7_2.getAllowedWidthDecrease();
                            }
                            v5_0 = Math.min(v4_11, (v6_4 + v5_0));
                        }
                        v6_2 = 0;
                    }
                    if ((v3_0 != v0_2) && (v3_0 != v1)) {
                        v5_0 /= 2;
                    }
                    v2 = Math.min(v2, v5_0);
                }
                v3_0++;
            }
            int v3_1 = v0_2;
            while (v3_1 <= v1) {
                if (this.c(v3_1)) {
                    int v5_2;
                    ((com.google.android.material.button.MaterialButton) this.getChildAt(v3_1)).setSizeChange(this.o);
                    android.view.View vtmp11 = this.getChildAt(v3_1);
                    if ((v3_1 != v0_2) && (v3_1 != v1)) {
                        v5_2 = (v2 * 2);
                    } else {
                        v5_2 = v2;
                    }
                    ((com.google.android.material.button.MaterialButton) vtmp11).setWidthChangeMax(v5_2);
                }
                v3_1++;
            }
        }
        return;
    }

    public final boolean c(int p2)
    {
        if (this.getChildAt(p2).getVisibility() == 8) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void d()
    {
        int v0 = 0;
        while (v0 < this.getChildCount()) {
            com.google.android.material.button.MaterialButton v1_2 = ((com.google.android.material.button.MaterialButton) this.getChildAt(v0));
            int v2_2 = v1_2.B;
            if (v2_2 != 0) {
                v1_2.setLayoutParams(v2_2);
                v1_2.B = 0;
                v1_2.y = -1082130432;
            }
            v0++;
        }
        return;
    }

    public final void dispatchDraw(android.graphics.Canvas p7)
    {
        Integer[] v0_3 = new java.util.TreeMap(this.d);
        Integer[] v1_2 = this.getChildCount();
        int v3 = 0;
        while (v3 < v1_2) {
            v0_3.put(((com.google.android.material.button.MaterialButton) this.getChildAt(v3)), Integer.valueOf(v3));
            v3++;
        }
        Integer[] v1_1 = new Integer[0];
        this.e = ((Integer[]) v0_3.values().toArray(v1_1));
        super.dispatchDraw(p7);
        return;
    }

    public final void e()
    {
        if (((this.f != null) || (this.m != null)) && (this.p)) {
            this.p = 0;
            int v2 = this.getChildCount();
            int v3 = this.getFirstVisibleChildIndex();
            int v4 = this.getLastVisibleChildIndex();
            int v5 = 0;
            while (v5 < v2) {
                com.google.android.material.button.MaterialButton v6_1 = ((com.google.android.material.button.MaterialButton) this.getChildAt(v5));
                if (v6_1.getVisibility() != 8) {
                    boolean v8_3;
                    if (v5 != v3) {
                        v8_3 = 0;
                    } else {
                        v8_3 = 1;
                    }
                    int v9_4;
                    if (v5 != v4) {
                        v9_4 = 0;
                    } else {
                        v9_4 = 1;
                    }
                    v3.c0 v10_0 = this.m;
                    if ((v10_0 == null) || ((!v8_3) && (v9_4 == 0))) {
                        v10_0 = ((v3.d0) this.b.get(v5));
                    }
                    v3.c0 v10_3;
                    if (v10_0 != null) {
                        int v11_1 = new v3.c0();
                        int v12_0 = v10_0.a;
                        v11_1.a = v12_0;
                        v11_1.b = v10_0.b;
                        int[][] v13_1 = v10_0.c;
                        int[][] v14_1 = new int[][v13_1.length];
                        v11_1.c = v14_1;
                        v3.p[] v15 = v10_0.d;
                        v3.p v7_8 = new v3.p[v15.length];
                        v11_1.d = v7_8;
                        System.arraycopy(v13_1, 0, v14_1, 0, v12_0);
                        System.arraycopy(v15, 0, v11_1.d, 0, v11_1.a);
                        v11_1.e = v10_0.e;
                        v11_1.f = v10_0.f;
                        v11_1.g = v10_0.g;
                        v11_1.h = v10_0.h;
                        v10_3 = v11_1;
                    } else {
                        v10_3 = new v3.c0(((v3.p) this.a.get(v5)));
                    }
                    v3.p v7_15;
                    if (this.getOrientation() != 0) {
                        v7_15 = 0;
                    } else {
                        v7_15 = 1;
                    }
                    int v12_3;
                    if (this.getLayoutDirection() != 1) {
                        v12_3 = 0;
                    } else {
                        v12_3 = 1;
                    }
                    v3.p v7_0;
                    if (v7_15 == null) {
                        if (!v8_3) {
                            v7_0 = 0;
                        } else {
                            v7_0 = 3;
                        }
                        if (v9_4 != 0) {
                            v7_0 |= 12;
                        }
                    } else {
                        if (!v8_3) {
                            v7_0 = 0;
                        } else {
                            v7_0 = 5;
                        }
                        if (v9_4 != 0) {
                            v7_0 |= 10;
                        }
                        if (v12_3 != 0) {
                            v7_0 = (((v7_0 & 10) >> 1) | ((v7_0 & 5) << 1));
                        }
                    }
                    v3.p v7_1 = (~ v7_0);
                    boolean v8_0 = this.f;
                    if ((v7_1 | 1) == v7_1) {
                        v10_3.e = v8_0;
                    }
                    if ((v7_1 | 2) == v7_1) {
                        v10_3.f = v8_0;
                    }
                    if ((v7_1 | 4) == v7_1) {
                        v10_3.g = v8_0;
                    }
                    if ((v7_1 | 8) == v7_1) {
                        v10_3.h = v8_0;
                    }
                    v3.p v7_4;
                    if (v10_3.a != 0) {
                        v7_4 = new v3.d0(v10_3);
                    } else {
                        v7_4 = 0;
                    }
                    if (!v7_4.d()) {
                        v6_1.setShapeAppearanceModel(v7_4.c());
                    } else {
                        v6_1.setStateListShapeAppearanceModel(v7_4);
                    }
                }
                v5++;
            }
        }
        return;
    }

    public v3.f0 getButtonSizeChange()
    {
        return this.o;
    }

    public final int getChildDrawingOrder(int p2, int p3)
    {
        int v2_0 = this.e;
        if ((v2_0 != 0) && (p3 < v2_0.length)) {
            return v2_0[p3].intValue();
        } else {
            android.util.Log.w("MButtonGroup", "Child order wasn\'t updated");
            return p3;
        }
    }

    public v3.d getInnerCornerSize()
    {
        return this.f.b;
    }

    public v3.b0 getInnerCornerSizeStateList()
    {
        return this.f;
    }

    public v3.p getShapeAppearance()
    {
        v3.p v0_0 = this.m;
        if (v0_0 != null) {
            return v0_0.c();
        } else {
            return 0;
        }
    }

    public int getSpacing()
    {
        return this.n;
    }

    public v3.d0 getStateListShapeAppearance()
    {
        return this.m;
    }

    public final void onLayout(boolean p1, int p2, int p3, int p4, int p5)
    {
        this = super.onLayout(p1, p2, p3, p4, p5);
        if (p1) {
            this.d();
            this.b();
        }
        return;
    }

    public final void onMeasure(int p1, int p2)
    {
        this.e();
        this.a();
        super.onMeasure(p1, p2);
        return;
    }

    public final void onViewRemoved(android.view.View p3)
    {
        super.onViewRemoved(p3);
        if ((p3 instanceof com.google.android.material.button.MaterialButton)) {
            ((com.google.android.material.button.MaterialButton) p3).setOnPressedChangeListenerInternal(0);
        }
        int v3_2 = this.indexOfChild(p3);
        if (v3_2 >= 0) {
            this.a.remove(v3_2);
            this.b.remove(v3_2);
        }
        this.p = 1;
        this.e();
        this.d();
        this.a();
        return;
    }

    public void setButtonSizeChange(v3.f0 p2)
    {
        if (this.o != p2) {
            this.o = p2;
            this.b();
            this.requestLayout();
            this.invalidate();
        }
        return;
    }

    public void setEnabled(boolean p3)
    {
        super.setEnabled(p3);
        int v0 = 0;
        while (v0 < this.getChildCount()) {
            ((com.google.android.material.button.MaterialButton) this.getChildAt(v0)).setEnabled(p3);
            v0++;
        }
        return;
    }

    public void setInnerCornerSize(v3.d p1)
    {
        this.f = v3.b0.b(p1);
        this.p = 1;
        this.e();
        this.invalidate();
        return;
    }

    public void setInnerCornerSizeStateList(v3.b0 p1)
    {
        this.f = p1;
        this.p = 1;
        this.e();
        this.invalidate();
        return;
    }

    public void setOrientation(int p2)
    {
        if (this.getOrientation() != p2) {
            this.p = 1;
        }
        super.setOrientation(p2);
        return;
    }

    public void setShapeAppearance(v3.p p2)
    {
        int v2_3;
        v3.c0 v0_1 = new v3.c0(p2);
        if (v0_1.a != 0) {
            v2_3 = new v3.d0(v0_1);
        } else {
            v2_3 = 0;
        }
        this.m = v2_3;
        this.p = 1;
        this.e();
        this.invalidate();
        return;
    }

    public void setSpacing(int p1)
    {
        this.n = p1;
        this.invalidate();
        this.requestLayout();
        return;
    }

    public void setStateListShapeAppearance(v3.d0 p1)
    {
        this.m = p1;
        this.p = 1;
        this.e();
        this.invalidate();
        return;
    }
}
