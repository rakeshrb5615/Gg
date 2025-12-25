package q3;
public abstract class d extends n.y1 {
    public boolean A;
    public android.graphics.drawable.Drawable v;
    public final android.graphics.Rect w;
    public final android.graphics.Rect x;
    public int y;
    public final boolean z;

    public d(android.content.Context p9, android.util.AttributeSet p10)
    {
        super(p9, p10, 0);
        super.w = new android.graphics.Rect();
        super.x = new android.graphics.Rect();
        super.y = 119;
        super.z = 1;
        super.A = 0;
        int[] v7 = new int[0];
        q3.k.a(p9, p10, 0, 0);
        int[] v4 = c3.a.h;
        q3.k.b(p9, p10, v4, 0, 0, v7);
        android.content.res.TypedArray v9_1 = p9.obtainStyledAttributes(p10, v4, 0, 0);
        super.y = v9_1.getInt(1, super.y);
        boolean v10_3 = v9_1.getDrawable(0);
        if (v10_3) {
            super.setForeground(v10_3);
        }
        super.z = v9_1.getBoolean(2, 1);
        v9_1.recycle();
        return;
    }

    public final void draw(android.graphics.Canvas p8)
    {
        super.draw(p8);
        android.graphics.drawable.Drawable v0 = this.v;
        if (v0 != null) {
            if (this.A) {
                this.A = 0;
                int v2_0 = (this.getRight() - this.getLeft());
                int v3_2 = (this.getBottom() - this.getTop());
                android.graphics.Rect v5 = this.w;
                if (!this.z) {
                    v5.set(this.getPaddingLeft(), this.getPaddingTop(), (v2_0 - this.getPaddingRight()), (v3_2 - this.getPaddingBottom()));
                } else {
                    v5.set(0, 0, v2_0, v3_2);
                }
                android.graphics.Rect v4_3 = this.x;
                android.view.Gravity.apply(this.y, v0.getIntrinsicWidth(), v0.getIntrinsicHeight(), v5, v4_3);
                v0.setBounds(v4_3);
            }
            v0.draw(p8);
        }
        return;
    }

    public final void drawableHotspotChanged(float p2, float p3)
    {
        super.drawableHotspotChanged(p2, p3);
        android.graphics.drawable.Drawable v0 = this.v;
        if (v0 != null) {
            v0.setHotspot(p2, p3);
        }
        return;
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        android.graphics.drawable.Drawable v0_0 = this.v;
        if ((v0_0 != null) && (v0_0.isStateful())) {
            this.v.setState(this.getDrawableState());
        }
        return;
    }

    public android.graphics.drawable.Drawable getForeground()
    {
        return this.v;
    }

    public int getForegroundGravity()
    {
        return this.y;
    }

    public final void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        android.graphics.drawable.Drawable v0 = this.v;
        if (v0 != null) {
            v0.jumpToCurrentState();
        }
        return;
    }

    public final void onLayout(boolean p1, int p2, int p3, int p4, int p5)
    {
        void v1_1 = super.onLayout(p1, p2, p3, p4, p5);
        v1_1.A = (p1 | v1_1.A);
        return;
    }

    public final void onSizeChanged(int p1, int p2, int p3, int p4)
    {
        super.onSizeChanged(p1, p2, p3, p4);
        this.A = 1;
        return;
    }

    public void setForeground(android.graphics.drawable.Drawable p3)
    {
        android.graphics.Rect v0_0 = this.v;
        if (v0_0 != p3) {
            if (v0_0 != null) {
                v0_0.setCallback(0);
                this.unscheduleDrawable(this.v);
            }
            this.v = p3;
            this.A = 1;
            if (p3 == null) {
                this.setWillNotDraw(1);
            } else {
                this.setWillNotDraw(0);
                p3.setCallback(this);
                if (p3.isStateful()) {
                    p3.setState(this.getDrawableState());
                }
                if (this.y == 119) {
                    p3.getPadding(new android.graphics.Rect());
                }
            }
            this.requestLayout();
            this.invalidate();
        }
        return;
    }

    public void setForegroundGravity(int p2)
    {
        if (this.y != p2) {
            if ((8388615 & p2) == 0) {
                p2 |= 8388611;
            }
            if ((p2 & 112) == 0) {
                p2 |= 48;
            }
            this.y = p2;
            if ((p2 == 119) && (this.v != null)) {
                this.v.getPadding(new android.graphics.Rect());
            }
            this.requestLayout();
        }
        return;
    }

    public final boolean verifyDrawable(android.graphics.drawable.Drawable p2)
    {
        if ((!super.verifyDrawable(p2)) && (p2 != this.v)) {
            return 0;
        } else {
            return 1;
        }
    }
}
