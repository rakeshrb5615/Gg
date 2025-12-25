package androidx.appcompat.widget;
public class ActionBarContainer extends android.widget.FrameLayout {
    public boolean a;
    public android.view.View b;
    public android.view.View c;
    public android.graphics.drawable.Drawable d;
    public android.graphics.drawable.Drawable e;
    public android.graphics.drawable.Drawable f;
    public final boolean m;
    public boolean n;
    public final int o;

    public ActionBarContainer(android.content.Context p4, android.util.AttributeSet p5)
    {
        super(p4, p5);
        super.setBackground(new n.b(super));
        android.graphics.drawable.Drawable v4_5 = p4.obtainStyledAttributes(p5, g.a.a);
        int v5_1 = 0;
        super.d = v4_5.getDrawable(0);
        super.e = v4_5.getDrawable(2);
        super.o = v4_5.getDimensionPixelSize(13, -1);
        if (super.getId() == 2131362433) {
            super.m = 1;
            super.f = v4_5.getDrawable(1);
        }
        v4_5.recycle();
        if (!super.m) {
            if ((super.d == null) && (super.e == null)) {
                v5_1 = 1;
            }
        } else {
            if (super.f == null) {
            }
        }
        super.setWillNotDraw(v5_1);
        return;
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable v0_0 = this.d;
        if ((v0_0 != null) && (v0_0.isStateful())) {
            this.d.setState(this.getDrawableState());
        }
        android.graphics.drawable.Drawable v0_1 = this.e;
        if ((v0_1 != null) && (v0_1.isStateful())) {
            this.e.setState(this.getDrawableState());
        }
        android.graphics.drawable.Drawable v0_4 = this.f;
        if ((v0_4 != null) && (v0_4.isStateful())) {
            this.f.setState(this.getDrawableState());
        }
        return;
    }

    public android.view.View getTabContainer()
    {
        return 0;
    }

    public final void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable v0_0 = this.d;
        if (v0_0 != null) {
            v0_0.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable v0_1 = this.e;
        if (v0_1 != null) {
            v0_1.jumpToCurrentState();
        }
        android.graphics.drawable.Drawable v0_2 = this.f;
        if (v0_2 != null) {
            v0_2.jumpToCurrentState();
        }
        return;
    }

    public final void onFinishInflate()
    {
        super.onFinishInflate();
        this.b = this.findViewById(2131361846);
        this.c = this.findViewById(2131361854);
        return;
    }

    public final boolean onHoverEvent(android.view.MotionEvent p1)
    {
        super.onHoverEvent(p1);
        return 1;
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent p2)
    {
        if ((!this.a) && (!super.onInterceptTouchEvent(p2))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void onLayout(boolean p4, int p5, int p6, int p7, int p8)
    {
        this = super.onLayout(p4, p5, p6, p7, p8);
        int v6_1 = 1;
        if (!this.m) {
            if (this.d == null) {
                v6_1 = 0;
            } else {
                if (this.b.getVisibility() != 0) {
                    android.graphics.drawable.Drawable v5_2 = this.c;
                    if ((v5_2 == null) || (v5_2.getVisibility() != 0)) {
                        this.d.setBounds(0, 0, 0, 0);
                    } else {
                        this.d.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                    }
                } else {
                    this.d.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
                }
            }
            this.n = 0;
        } else {
            android.graphics.drawable.Drawable v5_8 = this.f;
            if (v5_8 == null) {
                v6_1 = 0;
            } else {
                v5_8.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
            }
        }
        if (v6_1 != 0) {
            this.invalidate();
        }
        return;
    }

    public final void onMeasure(int p3, int p4)
    {
        if ((this.b == null) && (android.view.View$MeasureSpec.getMode(p4) == -2147483648)) {
            int v0_2 = this.o;
            if (v0_2 >= 0) {
                p4 = android.view.View$MeasureSpec.makeMeasureSpec(Math.min(v0_2, android.view.View$MeasureSpec.getSize(p4)), -2147483648);
            }
        }
        super.onMeasure(p3, p4);
        if (this.b != null) {
            android.view.View$MeasureSpec.getMode(p4);
            return;
        } else {
            return;
        }
    }

    public final boolean onTouchEvent(android.view.MotionEvent p1)
    {
        super.onTouchEvent(p1);
        return 1;
    }

    public void setPrimaryBackground(android.graphics.drawable.Drawable p5)
    {
        int v0_0 = this.d;
        if (v0_0 != 0) {
            v0_0.setCallback(0);
            this.unscheduleDrawable(this.d);
        }
        this.d = p5;
        if (p5 != null) {
            p5.setCallback(this);
            android.graphics.drawable.Drawable v5_6 = this.b;
            if (v5_6 != null) {
                this.d.setBounds(v5_6.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
            }
        }
        int v0_2 = 0;
        if (!this.m) {
            if ((this.d == null) && (this.e == null)) {
                v0_2 = 1;
            }
        } else {
            if (this.f == null) {
            }
        }
        this.setWillNotDraw(v0_2);
        this.invalidate();
        this.invalidateOutline();
        return;
    }

    public void setSplitBackground(android.graphics.drawable.Drawable p5)
    {
        android.graphics.drawable.Drawable v0_0 = this.f;
        if (v0_0 != null) {
            v0_0.setCallback(0);
            this.unscheduleDrawable(this.f);
        }
        this.f = p5;
        android.graphics.drawable.Drawable v0_5 = this.m;
        android.graphics.drawable.Drawable v1_1 = 0;
        if (p5 != null) {
            p5.setCallback(this);
            if (v0_5 != null) {
                android.graphics.drawable.Drawable v5_1 = this.f;
                if (v5_1 != null) {
                    v5_1.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                }
            }
        }
        if (v0_5 == null) {
            if ((this.d == null) && (this.e == null)) {
                v1_1 = 1;
            }
        } else {
            if (this.f == null) {
            }
        }
        this.setWillNotDraw(v1_1);
        this.invalidate();
        this.invalidateOutline();
        return;
    }

    public void setStackedBackground(android.graphics.drawable.Drawable p3)
    {
        int v0_0 = this.e;
        if (v0_0 != 0) {
            v0_0.setCallback(0);
            this.unscheduleDrawable(this.e);
        }
        this.e = p3;
        if (p3 != null) {
            p3.setCallback(this);
            if ((this.n) && (this.e != null)) {
                throw 0;
            }
        }
        int v0_1 = 0;
        if (!this.m) {
            if ((this.d == null) && (this.e == null)) {
                v0_1 = 1;
            }
        } else {
            if (this.f == null) {
            }
        }
        this.setWillNotDraw(v0_1);
        this.invalidate();
        this.invalidateOutline();
        return;
    }

    public void setTabContainer(n.q2 p1)
    {
        return;
    }

    public void setTransitioning(boolean p1)
    {
        int v1_1;
        this.a = p1;
        if (p1 == 0) {
            v1_1 = 262144;
        } else {
            v1_1 = 393216;
        }
        this.setDescendantFocusability(v1_1);
        return;
    }

    public void setVisibility(int p3)
    {
        int v3_1;
        super.setVisibility(p3);
        if (p3 != 0) {
            v3_1 = 0;
        } else {
            v3_1 = 1;
        }
        android.graphics.drawable.Drawable v1_1 = this.d;
        if (v1_1 != null) {
            v1_1.setVisible(v3_1, 0);
        }
        android.graphics.drawable.Drawable v1_2 = this.e;
        if (v1_2 != null) {
            v1_2.setVisible(v3_1, 0);
        }
        android.graphics.drawable.Drawable v1_0 = this.f;
        if (v1_0 != null) {
            v1_0.setVisible(v3_1, 0);
        }
        return;
    }

    public final android.view.ActionMode startActionModeForChild(android.view.View p1, android.view.ActionMode$Callback p2)
    {
        return 0;
    }

    public final android.view.ActionMode startActionModeForChild(android.view.View p1, android.view.ActionMode$Callback p2, int p3)
    {
        if (p3 == 0) {
            return 0;
        } else {
            return super.startActionModeForChild(p1, p2, p3);
        }
    }

    public final boolean verifyDrawable(android.graphics.drawable.Drawable p3)
    {
        boolean v1 = this.m;
        if (((p3 != this.d) || (v1)) && (((p3 != this.e) || (!this.n)) && (((p3 != this.f) || (!v1)) && (!super.verifyDrawable(p3))))) {
            return 0;
        } else {
            return 1;
        }
    }
}
