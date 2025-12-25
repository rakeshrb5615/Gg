package n;
public class t1 extends android.widget.ListView {
    public final android.graphics.Rect a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public n.r1 m;
    public boolean n;
    public final boolean o;
    public boolean p;
    public t0.d q;
    public a2.l r;

    public t1(android.content.Context p3, boolean p4)
    {
        super(p3, 0, 2130969042);
        super.a = new android.graphics.Rect();
        super.b = 0;
        super.c = 0;
        super.d = 0;
        super.e = 0;
        super.o = p4;
        super.setCacheColorHint(0);
        return;
    }

    public final int a(int p12, int p13)
    {
        int v0_0 = this.getListPaddingTop();
        int v1_1 = this.getListPaddingBottom();
        int v2 = this.getDividerHeight();
        int v3_1 = this.getDivider();
        android.widget.ListAdapter v4 = this.getAdapter();
        if (v4 != null) {
            int v0_1 = (v0_0 + v1_1);
            if ((v2 <= 0) || (v3_1 == 0)) {
                v2 = 0;
            }
            int v3_0 = v4.getCount();
            int v6 = 0;
            int v7 = 0;
            android.view.View v8 = 0;
            while (v6 < v3_0) {
                int v9_0 = v4.getItemViewType(v6);
                if (v9_0 != v7) {
                    v8 = 0;
                    v7 = v9_0;
                }
                v8 = v4.getView(v6, v8, this);
                int v9_1 = v8.getLayoutParams();
                if (v9_1 == 0) {
                    v9_1 = this.generateDefaultLayoutParams();
                    v8.setLayoutParams(v9_1);
                }
                int v9_3;
                int v9_2 = v9_1.height;
                if (v9_2 <= 0) {
                    v9_3 = android.view.View$MeasureSpec.makeMeasureSpec(0, 0);
                } else {
                    v9_3 = android.view.View$MeasureSpec.makeMeasureSpec(v9_2, 1073741824);
                }
                v8.measure(p12, v9_3);
                v8.forceLayout();
                if (v6 > 0) {
                    v0_1 += v2;
                }
                v0_1 += v8.getMeasuredHeight();
                if (v0_1 < p13) {
                    v6++;
                } else {
                    return p13;
                }
            }
            return v0_1;
        } else {
            return (v0_0 + v1_1);
        }
    }

    public final boolean b(android.view.MotionEvent p18, int p19)
    {
        int v0_0;
        long v3_9 = p18.getActionMasked();
        int v5_2 = 0;
        if (v3_9 == 1) {
            v0_0 = 0;
            float v6_0 = p18.findPointerIndex(p19);
            if (v6_0 >= 0) {
                float v7_1 = ((int) p18.getX(v6_0));
                float v6_2 = ((int) p18.getY(v6_0));
                int v8 = this.pointToPosition(v7_1, v6_2);
                if (v8 != -1) {
                    android.view.View v10 = this.getChildAt((v8 - this.getFirstVisiblePosition()));
                    float v7_2 = ((float) v7_1);
                    float v6_3 = ((float) v6_2);
                    this.p = 1;
                    n.o1.a(this, v7_2, v6_3);
                    if (!this.isPressed()) {
                        this.setPressed(1);
                    }
                    this.layoutChildren();
                    android.graphics.drawable.Drawable v11_1 = this.f;
                    if (v11_1 != -1) {
                        android.graphics.drawable.Drawable v11_3 = this.getChildAt((v11_1 - this.getFirstVisiblePosition()));
                        if ((v11_3 != null) && ((v11_3 != v10) && (v11_3.isPressed()))) {
                            v11_3.setPressed(0);
                        }
                    }
                    this.f = v8;
                    n.o1.a(v10, (v7_2 - ((float) v10.getLeft())), (v6_3 - ((float) v10.getTop())));
                    if (!v10.isPressed()) {
                        v10.setPressed(1);
                    }
                    int v12_9;
                    android.graphics.drawable.Drawable v11_8 = this.getSelector();
                    if ((v11_8 == null) || (v8 == -1)) {
                        v12_9 = 0;
                    } else {
                        v12_9 = 1;
                    }
                    if (v12_9 != 0) {
                        v11_8.setVisible(0, 0);
                    }
                    int v0_2;
                    int v5_3 = this.a;
                    v5_3.set(v10.getLeft(), v10.getTop(), v10.getRight(), v10.getBottom());
                    v5_3.left = (v5_3.left - this.b);
                    v5_3.top = (v5_3.top - this.c);
                    v5_3.right = (v5_3.right + this.d);
                    v5_3.bottom = (v5_3.bottom + this.e);
                    if (android.os.Build$VERSION.SDK_INT < 33) {
                        int v0_1 = n.s1.a;
                        if (v0_1 != 0) {
                            try {
                                v0_2 = v0_1.getBoolean(this);
                            } catch (int v0_3) {
                                v0_3.printStackTrace();
                            }
                            if (v10.isEnabled() != v0_2) {
                                int v0_4 = (v0_2 ^ 1);
                                if (android.os.Build$VERSION.SDK_INT < 33) {
                                    int v4_1 = n.s1.a;
                                    if (v4_1 != 0) {
                                        try {
                                            v4_1.set(this, Boolean.valueOf(v0_4));
                                        } catch (int v0_6) {
                                            v0_6.printStackTrace();
                                        }
                                    }
                                } else {
                                    n.q1.b(this, v0_4);
                                }
                                if (v8 != -1) {
                                    this.refreshDrawableState();
                                }
                            }
                            if (v12_9 != 0) {
                                int v5_1;
                                int v0_7 = v5_3.exactCenterX();
                                int v4_2 = v5_3.exactCenterY();
                                if (this.getVisibility() != 0) {
                                    v5_1 = 0;
                                } else {
                                    v5_1 = 1;
                                }
                                v11_8.setVisible(v5_1, 0);
                                v11_8.setHotspot(v0_7, v4_2);
                            }
                            int v0_8 = this.getSelector();
                            if ((v0_8 != 0) && (v8 != -1)) {
                                v0_8.setHotspot(v7_2, v6_3);
                            }
                            int v0_9 = this.m;
                            if (v0_9 != 0) {
                                v0_9.b = 0;
                            }
                            this.refreshDrawableState();
                            if (v3_9 == 1) {
                                this.performItemClick(v10, v8, this.getItemIdAtPosition(v8));
                            }
                            v0_0 = 1;
                            v5_2 = 0;
                            if ((v0_0 == 0) || (v5_2 != 0)) {
                                this.p = 0;
                                this.setPressed(0);
                                this.drawableStateChanged();
                                long v3_3 = this.getChildAt((this.f - this.getFirstVisiblePosition()));
                                if (v3_3 != 0) {
                                    v3_3.setPressed(0);
                                }
                            }
                            if (v0_0 == 0) {
                                t0.d v2_1 = this.q;
                                if (v2_1 != null) {
                                    if (v2_1.v) {
                                        v2_1.d();
                                    }
                                    v2_1.v = 0;
                                }
                            } else {
                                if (this.q == null) {
                                    this.q = new t0.d(this);
                                }
                                long v3_8 = this.q;
                                v3_8.v = 1;
                                v3_8.onTouch(this, p18);
                            }
                            return v0_0;
                        }
                        v0_2 = 0;
                    } else {
                        v0_2 = n.q1.a(this);
                    }
                } else {
                    v5_2 = 1;
                }
            } else {
                v0_0 = 0;
            }
        } else {
            if (v3_9 == 2) {
                v0_0 = 1;
            } else {
                if (v3_9 == 3) {
                } else {
                    v0_0 = 1;
                }
            }
        }
    }

    public final void dispatchDraw(android.graphics.Canvas p3)
    {
        android.graphics.Rect v0 = this.a;
        if (!v0.isEmpty()) {
            android.graphics.drawable.Drawable v1_1 = this.getSelector();
            if (v1_1 != null) {
                v1_1.setBounds(v0);
                v1_1.draw(p3);
            }
        }
        super.dispatchDraw(p3);
        return;
    }

    public final void drawableStateChanged()
    {
        if (this.r == null) {
            super.drawableStateChanged();
            android.graphics.drawable.Drawable v0_1 = this.m;
            if (v0_1 != null) {
                v0_1.b = 1;
            }
            android.graphics.drawable.Drawable v0_2 = this.getSelector();
            if ((v0_2 != null) && ((this.p) && (this.isPressed()))) {
                v0_2.setState(this.getDrawableState());
            }
        }
        return;
    }

    public final boolean hasFocus()
    {
        if ((!this.o) && (!super.hasFocus())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean hasWindowFocus()
    {
        if ((!this.o) && (!super.hasWindowFocus())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isFocused()
    {
        if ((!this.o) && (!super.isFocused())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean isInTouchMode()
    {
        if (((!this.o) || (!this.n)) && (!super.isInTouchMode())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void onDetachedFromWindow()
    {
        this.r = 0;
        super.onDetachedFromWindow();
        return;
    }

    public boolean onHoverEvent(android.view.MotionEvent p7)
    {
        Object[] v1_0 = p7.getActionMasked();
        if ((v1_0 == 10) && (this.r == null)) {
            a2.l v2_4 = new a2.l(this, 4);
            this.r = v2_4;
            this.post(v2_4);
        }
        a2.l v2_0 = super.onHoverEvent(p7);
        if ((v1_0 != 9) && (v1_0 != 7)) {
            this.setSelection(-1);
            return v2_0;
        } else {
            reflect.InvocationTargetException v7_3 = this.pointToPosition(((int) p7.getX()), ((int) p7.getY()));
            if ((v7_3 != -1) && (v7_3 != this.getSelectedItemPosition())) {
                Object[] v1_6 = this.getChildAt((v7_3 - this.getFirstVisiblePosition()));
                if (v1_6.isEnabled()) {
                    this.requestFocus();
                    if ((android.os.Build$VERSION.SDK_INT < 30) || (!n.p1.d)) {
                        this.setSelectionFromTop(v7_3, (v1_6.getTop() - this.getTop()));
                    } else {
                        try {
                            n.p1.a.invoke(this, new Object[] {Integer.valueOf(v7_3), v1_6, Boolean.FALSE, Integer.valueOf(-1), Integer.valueOf(-1)}));
                            n.p1.b.invoke(this, new Object[] {Integer.valueOf(v7_3)}));
                            n.p1.c.invoke(this, new Object[] {Integer.valueOf(v7_3)}));
                        } catch (reflect.InvocationTargetException v7_7) {
                            v7_7.printStackTrace();
                        } catch (reflect.InvocationTargetException v7_6) {
                            v7_6.printStackTrace();
                        }
                    }
                }
                reflect.InvocationTargetException v7_8 = this.getSelector();
                if ((v7_8 != null) && ((this.p) && (this.isPressed()))) {
                    v7_8.setState(this.getDrawableState());
                }
            }
            return v2_0;
        }
    }

    public final boolean onTouchEvent(android.view.MotionEvent p4)
    {
        if (p4.getAction() == 0) {
            this.f = this.pointToPosition(((int) p4.getX()), ((int) p4.getY()));
        }
        a2.l v0_2 = this.r;
        if (v0_2 != null) {
            n.t1 v1_1 = ((n.t1) v0_2.b);
            v1_1.r = 0;
            v1_1.removeCallbacks(v0_2);
        }
        return super.onTouchEvent(p4);
    }

    public void setListSelectionHidden(boolean p1)
    {
        this.n = p1;
        return;
    }

    public void setSelector(android.graphics.drawable.Drawable p4)
    {
        android.graphics.Rect v0_0;
        if (p4 == 0) {
            v0_0 = 0;
        } else {
            v0_0 = new n.r1();
            int v1_1 = v0_0.a;
            if (v1_1 != 0) {
                v1_1.setCallback(0);
            }
            v0_0.a = p4;
            if (p4 != 0) {
                p4.setCallback(v0_0);
            }
            v0_0.b = 1;
        }
        this.m = v0_0;
        super.setSelector(v0_0);
        android.graphics.Rect v0_2 = new android.graphics.Rect();
        if (p4 != 0) {
            p4.getPadding(v0_2);
        }
        this.b = v0_2.left;
        this.c = v0_2.top;
        this.d = v0_2.right;
        this.e = v0_2.bottom;
        return;
    }
}
