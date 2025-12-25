package com.google.android.material.slider;
public class Slider extends x3.e {

    public Slider(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3);
        android.content.res.TypedArray v2_1 = p2.obtainStyledAttributes(p3, new int[] {16842788}));
        if (v2_1.hasValue(0)) {
            super.setValue(v2_1.getFloat(0, 0));
        }
        v2_1.recycle();
        return;
    }

    public CharSequence getAccessibilityClassName()
    {
        return android.widget.SeekBar.getName();
    }

    public int getActiveThumbIndex()
    {
        return this.t0;
    }

    public int getFocusedThumbIndex()
    {
        return this.u0;
    }

    public int getHaloRadius()
    {
        return this.N;
    }

    public android.content.res.ColorStateList getHaloTintList()
    {
        return this.D0;
    }

    public int getLabelBehavior()
    {
        return this.I;
    }

    public float getStepSize()
    {
        return this.v0;
    }

    public float getThumbElevation()
    {
        return this.R0.b.n;
    }

    public int getThumbHeight()
    {
        return this.M;
    }

    public int getThumbRadius()
    {
        return (this.L / 2);
    }

    public android.content.res.ColorStateList getThumbStrokeColor()
    {
        return this.R0.b.e;
    }

    public float getThumbStrokeWidth()
    {
        return this.R0.b.k;
    }

    public android.content.res.ColorStateList getThumbTintList()
    {
        return this.R0.b.d;
    }

    public int getThumbTrackGapSize()
    {
        return this.O;
    }

    public int getThumbWidth()
    {
        return this.L;
    }

    public int getTickActiveRadius()
    {
        return this.y0;
    }

    public android.content.res.ColorStateList getTickActiveTintList()
    {
        return this.E0;
    }

    public int getTickInactiveRadius()
    {
        return this.z0;
    }

    public android.content.res.ColorStateList getTickInactiveTintList()
    {
        return this.F0;
    }

    public android.content.res.ColorStateList getTickTintList()
    {
        if (!this.F0.equals(this.E0)) {
            throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
        } else {
            return this.E0;
        }
    }

    public int getTickVisibilityMode()
    {
        return this.x0;
    }

    public android.content.res.ColorStateList getTrackActiveTintList()
    {
        return this.G0;
    }

    public int getTrackCornerSize()
    {
        int v0_0 = this.S;
        if (v0_0 == -1) {
            v0_0 = (this.J / 2);
        }
        return v0_0;
    }

    public int getTrackHeight()
    {
        return this.J;
    }

    public android.content.res.ColorStateList getTrackIconActiveColor()
    {
        return this.c0;
    }

    public android.graphics.drawable.Drawable getTrackIconActiveEnd()
    {
        return this.a0;
    }

    public android.graphics.drawable.Drawable getTrackIconActiveStart()
    {
        return this.V;
    }

    public android.content.res.ColorStateList getTrackIconInactiveColor()
    {
        return this.h0;
    }

    public android.graphics.drawable.Drawable getTrackIconInactiveEnd()
    {
        return this.f0;
    }

    public android.graphics.drawable.Drawable getTrackIconInactiveStart()
    {
        return this.d0;
    }

    public int getTrackIconSize()
    {
        return this.i0;
    }

    public android.content.res.ColorStateList getTrackInactiveTintList()
    {
        return this.H0;
    }

    public int getTrackInsideCornerSize()
    {
        return this.T;
    }

    public int getTrackSidePadding()
    {
        return this.K;
    }

    public int getTrackStopIndicatorSize()
    {
        return this.R;
    }

    public android.content.res.ColorStateList getTrackTintList()
    {
        if (!this.H0.equals(this.G0)) {
            throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
        } else {
            return this.G0;
        }
    }

    public int getTrackWidth()
    {
        return this.A0;
    }

    public float getValue()
    {
        return ((Float) this.getValues().get(0)).floatValue();
    }

    public float getValueFrom()
    {
        return this.q0;
    }

    public float getValueTo()
    {
        return this.r0;
    }

    public void setCentered(boolean p2)
    {
        if (this.U != p2) {
            this.U = p2;
            if (p2 == 0) {
                this.setValues(new Float[] {Float.valueOf(this.q0)}));
            } else {
                this.setValues(new Float[] {Float.valueOf(((this.q0 + this.r0) / 1073741824))}));
            }
            this.M(1);
            return;
        } else {
            return;
        }
    }

    public void setCustomThumbDrawable(int p2)
    {
        this.setCustomThumbDrawable(this.getResources().getDrawable(p2));
        return;
    }

    public void setCustomThumbDrawable(android.graphics.drawable.Drawable p1)
    {
        java.util.List v1_3 = p1.mutate().getConstantState().newDrawable();
        this.a(v1_3);
        this.S0 = v1_3;
        this.T0.clear();
        this.postInvalidate();
        return;
    }

    public bridge synthetic void setEnabled(boolean p1)
    {
        super.setEnabled(p1);
        return;
    }

    public void setFocusedThumbIndex(int p2)
    {
        if ((p2 < null) || (p2 >= this.s0.size())) {
            throw new IllegalArgumentException("index out of range");
        } else {
            this.u0 = p2;
            this.n.w(p2);
            this.postInvalidate();
            return;
        }
    }

    public void setHaloRadius(int p2)
    {
        if (p2 != this.N) {
            this.N = p2;
            android.graphics.drawable.RippleDrawable v2_2 = this.getBackground();
            if ((!(this.getBackground() instanceof android.graphics.drawable.RippleDrawable)) || (!(v2_2 instanceof android.graphics.drawable.RippleDrawable))) {
                this.postInvalidate();
                return;
            } else {
                ((android.graphics.drawable.RippleDrawable) v2_2).setRadius(this.N);
                return;
            }
        } else {
            return;
        }
    }

    public void setHaloRadiusResource(int p2)
    {
        this.setHaloRadius(this.getResources().getDimensionPixelSize(p2));
        return;
    }

    public void setHaloTintList(android.content.res.ColorStateList p3)
    {
        if (!p3.equals(this.D0)) {
            this.D0 = p3;
            android.graphics.drawable.RippleDrawable v0_4 = this.getBackground();
            if ((!(this.getBackground() instanceof android.graphics.drawable.RippleDrawable)) || (!(v0_4 instanceof android.graphics.drawable.RippleDrawable))) {
                android.graphics.drawable.RippleDrawable v0_1 = this.d;
                v0_1.setColor(this.n(p3));
                v0_1.setAlpha(63);
                this.invalidate();
                return;
            } else {
                ((android.graphics.drawable.RippleDrawable) v0_4).setColor(p3);
                return;
            }
        } else {
            return;
        }
    }

    public void setLabelBehavior(int p2)
    {
        if (this.I != p2) {
            this.I = p2;
            this.M(1);
        }
        return;
    }

    public void setLabelFormatter(x3.f p1)
    {
        this.o0 = p1;
        return;
    }

    public void setOrientation(int p2)
    {
        if (this.F != p2) {
            this.F = p2;
            this.M(1);
            return;
        } else {
            return;
        }
    }

    public void setStepSize(float p6)
    {
        if (p6 < 0) {
            float v1 = this.q0;
            float v2 = this.r0;
            StringBuilder v3_1 = new StringBuilder("The stepSize(");
            v3_1.append(p6);
            v3_1.append(") must be 0, or a factor of the valueFrom(");
            v3_1.append(v1);
            v3_1.append(")-valueTo(");
            v3_1.append(v2);
            v3_1.append(") range");
            throw new IllegalArgumentException(v3_1.toString());
        } else {
            if (this.v0 != p6) {
                this.v0 = p6;
                this.C0 = 1;
                this.postInvalidate();
            }
            return;
        }
    }

    public void setThumbElevation(float p2)
    {
        this.R0.n(p2);
        return;
    }

    public void setThumbElevationResource(int p2)
    {
        this.setThumbElevation(this.getResources().getDimension(p2));
        return;
    }

    public void setThumbHeight(int p4)
    {
        if (p4 != this.M) {
            this.M = p4;
            this.R0.setBounds(0, 0, this.L, p4);
            java.util.Iterator v4_3 = this.S0;
            if (v4_3 != null) {
                this.a(v4_3);
            }
            java.util.Iterator v4_2 = this.T0.iterator();
            while (v4_2.hasNext()) {
                this.a(((android.graphics.drawable.Drawable) v4_2.next()));
            }
            this.M(0);
            return;
        } else {
            return;
        }
    }

    public void setThumbHeightResource(int p2)
    {
        this.setThumbHeight(this.getResources().getDimensionPixelSize(p2));
        return;
    }

    public void setThumbRadius(int p1)
    {
        int v1_1 = (p1 * 2);
        this.setThumbWidth(v1_1);
        this.setThumbHeight(v1_1);
        return;
    }

    public void setThumbRadiusResource(int p2)
    {
        this.setThumbRadius(this.getResources().getDimensionPixelSize(p2));
        return;
    }

    public void setThumbStrokeColor(android.content.res.ColorStateList p2)
    {
        this.R0.r(p2);
        this.postInvalidate();
        return;
    }

    public void setThumbStrokeColorResource(int p2)
    {
        if (p2 != null) {
            this.setThumbStrokeColor(e0.c.getColorStateList(this.getContext(), p2));
        }
        return;
    }

    public void setThumbStrokeWidth(float p3)
    {
        v3.k v0 = this.R0;
        v0.b.k = p3;
        v0.invalidateSelf();
        this.postInvalidate();
        return;
    }

    public void setThumbStrokeWidthResource(int p2)
    {
        if (p2 != 0) {
            this.setThumbStrokeWidth(this.getResources().getDimension(p2));
        }
        return;
    }

    public void setThumbTintList(android.content.res.ColorStateList p3)
    {
        v3.k v0 = this.R0;
        if (!p3.equals(v0.b.d)) {
            v0.o(p3);
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setThumbTrackGapSize(int p2)
    {
        if (this.O != p2) {
            this.O = p2;
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setThumbWidth(int p11)
    {
        if (p11 != this.L) {
            this.L = p11;
            java.util.Iterator v11_2 = new v3.f();
            android.graphics.drawable.Drawable v0_6 = new v3.f();
            int v1_2 = new v3.f();
            v3.f v2_0 = new v3.f();
            v3.p v3_2 = (((float) this.L) / 1073741824);
            j5.t1 v5 = q4.b.j(0);
            v3.a v6_1 = new v3.a(v3_2);
            v3.a v7_1 = new v3.a(v3_2);
            v3.a v8_1 = new v3.a(v3_2);
            v3.a v9_1 = new v3.a(v3_2);
            v3.p v3_4 = new v3.p();
            v3_4.a = v5;
            v3_4.b = v5;
            v3_4.c = v5;
            v3_4.d = v5;
            v3_4.e = v6_1;
            v3_4.f = v7_1;
            v3_4.g = v8_1;
            v3_4.h = v9_1;
            v3_4.i = v11_2;
            v3_4.j = v0_6;
            v3_4.k = v1_2;
            v3_4.l = v2_0;
            java.util.Iterator v11_3 = this.R0;
            v11_3.setShapeAppearanceModel(v3_4);
            v11_3.setBounds(0, 0, this.L, this.M);
            java.util.Iterator v11_4 = this.S0;
            if (v11_4 != null) {
                this.a(v11_4);
            }
            java.util.Iterator v11_6 = this.T0.iterator();
            while (v11_6.hasNext()) {
                this.a(((android.graphics.drawable.Drawable) v11_6.next()));
            }
            this.M(0);
            return;
        } else {
            return;
        }
    }

    public void setThumbWidthResource(int p2)
    {
        this.setThumbWidth(this.getResources().getDimensionPixelSize(p2));
        return;
    }

    public void setTickActiveRadius(int p2)
    {
        if (this.y0 != p2) {
            this.y0 = p2;
            this.f.setStrokeWidth(((float) (p2 * 2)));
            this.M(0);
        }
        return;
    }

    public void setTickActiveTintList(android.content.res.ColorStateList p2)
    {
        if (!p2.equals(this.E0)) {
            this.E0 = p2;
            this.f.setColor(this.n(p2));
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTickInactiveRadius(int p2)
    {
        if (this.z0 != p2) {
            this.z0 = p2;
            this.e.setStrokeWidth(((float) (p2 * 2)));
            this.M(0);
        }
        return;
    }

    public void setTickInactiveTintList(android.content.res.ColorStateList p2)
    {
        if (!p2.equals(this.F0)) {
            this.F0 = p2;
            this.e.setColor(this.n(p2));
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTickTintList(android.content.res.ColorStateList p1)
    {
        this.setTickInactiveTintList(p1);
        this.setTickActiveTintList(p1);
        return;
    }

    public void setTickVisibilityMode(int p2)
    {
        if (this.x0 != p2) {
            this.x0 = p2;
            this.postInvalidate();
        }
        return;
    }

    public void setTickVisible(boolean p1)
    {
        int v1_1;
        if (p1 == 0) {
            v1_1 = 2;
        } else {
            v1_1 = 0;
        }
        this.setTickVisibilityMode(v1_1);
        return;
    }

    public void setTrackActiveTintList(android.content.res.ColorStateList p2)
    {
        if (!p2.equals(this.G0)) {
            this.G0 = p2;
            this.b.setColor(this.n(p2));
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackCornerSize(int p2)
    {
        if (this.S != p2) {
            this.S = p2;
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackHeight(int p2)
    {
        if (this.J != p2) {
            this.J = p2;
            this.a.setStrokeWidth(((float) p2));
            this.b.setStrokeWidth(((float) this.J));
            this.M(0);
        }
        return;
    }

    public void setTrackIconActiveColor(android.content.res.ColorStateList p2)
    {
        if (p2 != this.c0) {
            this.c0 = p2;
            this.J();
            this.I();
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackIconActiveEnd(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = j5.t1.A(this.getContext(), p2);
        }
        this.setTrackIconActiveEnd(v2_1);
        return;
    }

    public void setTrackIconActiveEnd(android.graphics.drawable.Drawable p2)
    {
        if (p2 != this.a0) {
            this.a0 = p2;
            this.b0 = 0;
            this.I();
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackIconActiveStart(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = j5.t1.A(this.getContext(), p2);
        }
        this.setTrackIconActiveStart(v2_1);
        return;
    }

    public void setTrackIconActiveStart(android.graphics.drawable.Drawable p2)
    {
        if (p2 != this.V) {
            this.V = p2;
            this.W = 0;
            this.J();
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackIconInactiveColor(android.content.res.ColorStateList p2)
    {
        if (p2 != this.h0) {
            this.h0 = p2;
            this.L();
            this.K();
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackIconInactiveEnd(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = j5.t1.A(this.getContext(), p2);
        }
        this.setTrackIconInactiveEnd(v2_1);
        return;
    }

    public void setTrackIconInactiveEnd(android.graphics.drawable.Drawable p2)
    {
        if (p2 != this.f0) {
            this.f0 = p2;
            this.g0 = 0;
            this.K();
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackIconInactiveStart(int p2)
    {
        int v2_1;
        if (p2 == 0) {
            v2_1 = 0;
        } else {
            v2_1 = j5.t1.A(this.getContext(), p2);
        }
        this.setTrackIconInactiveStart(v2_1);
        return;
    }

    public void setTrackIconInactiveStart(android.graphics.drawable.Drawable p2)
    {
        if (p2 != this.d0) {
            this.d0 = p2;
            this.e0 = 0;
            this.L();
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackIconSize(int p2)
    {
        if (this.i0 != p2) {
            this.i0 = p2;
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackInactiveTintList(android.content.res.ColorStateList p2)
    {
        if (!p2.equals(this.H0)) {
            this.H0 = p2;
            this.a.setColor(this.n(p2));
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackInsideCornerSize(int p2)
    {
        if (this.T != p2) {
            this.T = p2;
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackStopIndicatorSize(int p2)
    {
        if (this.R != p2) {
            this.R = p2;
            this.m.setStrokeWidth(((float) p2));
            this.invalidate();
            return;
        } else {
            return;
        }
    }

    public void setTrackTintList(android.content.res.ColorStateList p1)
    {
        this.setTrackInactiveTintList(p1);
        this.setTrackActiveTintList(p1);
        return;
    }

    public void setValue(float p1)
    {
        this.setValues(new Float[] {Float.valueOf(p1)}));
        return;
    }

    public void setValueFrom(float p1)
    {
        this.q0 = p1;
        this.C0 = 1;
        this.postInvalidate();
        return;
    }

    public void setValueTo(float p1)
    {
        this.r0 = p1;
        this.C0 = 1;
        this.postInvalidate();
        return;
    }
}
