package com.google.android.material.materialswitch;
public class MaterialSwitch extends androidx.appcompat.widget.SwitchCompat {
    public static final int[] p0;
    public android.graphics.drawable.Drawable c0;
    public android.graphics.drawable.Drawable d0;
    public int e0;
    public android.graphics.drawable.Drawable f0;
    public android.graphics.drawable.Drawable g0;
    public android.content.res.ColorStateList h0;
    public android.content.res.ColorStateList i0;
    public android.graphics.PorterDuff$Mode j0;
    public android.content.res.ColorStateList k0;
    public android.content.res.ColorStateList l0;
    public android.graphics.PorterDuff$Mode m0;
    public int[] n0;
    public int[] o0;

    static MaterialSwitch()
    {
        com.google.android.material.materialswitch.MaterialSwitch.p0 = new int[] {2130969799});
        return;
    }

    public MaterialSwitch(android.content.Context p8, android.util.AttributeSet p9)
    {
        super(a4.a.a(p8, p9, 2130969483, 2132018202), p9, 2130969483);
        super.e0 = -1;
        int v1_13 = super.getContext();
        super.c0 = super.getThumbDrawable();
        super.h0 = super.getThumbTintList();
        super.setThumbTintList(0);
        super.f0 = super.getTrackDrawable();
        super.k0 = super.getTrackTintList();
        super.setTrackTintList(0);
        int[] v6 = new int[0];
        q3.k.a(v1_13, p9, 2130969483, 2132018202);
        android.graphics.PorterDuff$Mode v3_0 = c3.a.t;
        q3.k.b(v1_13, p9, v3_0, 2130969483, 2132018202, v6);
        android.content.res.TypedArray v2_3 = v1_13.obtainStyledAttributes(p9, v3_0, 2130969483, 2132018202);
        b8.g v9_2 = new b8.g(v1_13, v2_3);
        super.d0 = v9_2.i(0);
        super.e0 = v2_3.getDimensionPixelSize(1, -1);
        super.i0 = v9_2.h(2);
        android.graphics.PorterDuff$Mode v3_1 = android.graphics.PorterDuff$Mode.SRC_IN;
        super.j0 = q3.k.g(v2_3.getInt(3, -1), v3_1);
        super.g0 = v9_2.i(4);
        super.l0 = v9_2.h(5);
        super.m0 = q3.k.g(v2_3.getInt(6, -1), v3_1);
        v9_2.r();
        super.setEnforceSwitchWidth(0);
        super.e();
        super.f();
        return;
    }

    public static void g(android.graphics.drawable.Drawable p1, android.content.res.ColorStateList p2, int[] p3, int[] p4, float p5)
    {
        if ((p1 != null) && (p2 != 0)) {
            p1.setTint(h0.a.d(p2.getColorForState(p3, 0), p2.getColorForState(p4, 0), p5));
        }
        return;
    }

    public final void e()
    {
        this.c0 = f2.b0.b(this.c0, this.h0, this.getThumbTintMode());
        this.d0 = f2.b0.b(this.d0, this.i0, this.j0);
        this.h();
        super.setThumbDrawable(f2.b0.a(this.c0, this.d0, this.e0, this.e0));
        this.refreshDrawableState();
        return;
    }

    public final void f()
    {
        this.f0 = f2.b0.b(this.f0, this.k0, this.getTrackTintMode());
        this.g0 = f2.b0.b(this.g0, this.l0, this.m0);
        this.h();
        android.graphics.drawable.Drawable v0_2 = this.f0;
        if ((v0_2 == null) || (this.g0 == null)) {
            if (v0_2 == null) {
                v0_2 = this.g0;
            }
        } else {
            v0_2 = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[] {this.f0, this.g0}));
        }
        if (v0_2 != null) {
            this.setSwitchMinWidth(v0_2.getIntrinsicWidth());
        }
        super.setTrackDrawable(v0_2);
        return;
    }

    public android.graphics.drawable.Drawable getThumbDrawable()
    {
        return this.c0;
    }

    public android.graphics.drawable.Drawable getThumbIconDrawable()
    {
        return this.d0;
    }

    public int getThumbIconSize()
    {
        return this.e0;
    }

    public android.content.res.ColorStateList getThumbIconTintList()
    {
        return this.i0;
    }

    public android.graphics.PorterDuff$Mode getThumbIconTintMode()
    {
        return this.j0;
    }

    public android.content.res.ColorStateList getThumbTintList()
    {
        return this.h0;
    }

    public android.graphics.drawable.Drawable getTrackDecorationDrawable()
    {
        return this.g0;
    }

    public android.content.res.ColorStateList getTrackDecorationTintList()
    {
        return this.l0;
    }

    public android.graphics.PorterDuff$Mode getTrackDecorationTintMode()
    {
        return this.m0;
    }

    public android.graphics.drawable.Drawable getTrackDrawable()
    {
        return this.f0;
    }

    public android.content.res.ColorStateList getTrackTintList()
    {
        return this.k0;
    }

    public final void h()
    {
        if ((this.h0 != null) || ((this.i0 != null) || ((this.k0 != null) || (this.l0 != null)))) {
            android.content.res.ColorStateList v0_4 = this.getThumbPosition();
            android.content.res.ColorStateList v1_0 = this.h0;
            if (v1_0 != null) {
                com.google.android.material.materialswitch.MaterialSwitch.g(this.c0, v1_0, this.n0, this.o0, v0_4);
            }
            android.content.res.ColorStateList v1_1 = this.i0;
            if (v1_1 != null) {
                com.google.android.material.materialswitch.MaterialSwitch.g(this.d0, v1_1, this.n0, this.o0, v0_4);
            }
            android.content.res.ColorStateList v1_2 = this.k0;
            if (v1_2 != null) {
                com.google.android.material.materialswitch.MaterialSwitch.g(this.f0, v1_2, this.n0, this.o0, v0_4);
            }
            android.content.res.ColorStateList v1_3 = this.l0;
            if (v1_3 != null) {
                com.google.android.material.materialswitch.MaterialSwitch.g(this.g0, v1_3, this.n0, this.o0, v0_4);
            }
        }
        return;
    }

    public final void invalidate()
    {
        this.h();
        super.invalidate();
        return;
    }

    public final int[] onCreateDrawableState(int p7)
    {
        int[] v7_2 = super.onCreateDrawableState((p7 + 1));
        if (this.d0 != null) {
            android.view.View.mergeDrawableStates(v7_2, com.google.android.material.materialswitch.MaterialSwitch.p0);
        }
        int[] v0_4 = new int[v7_2.length];
        int v1 = v7_2.length;
        int v2 = 0;
        int v3 = 0;
        while (v2 < v1) {
            int v4 = v7_2[v2];
            if (v4 != 16842912) {
                int v5_1 = (v3 + 1);
                v0_4[v3] = v4;
                v3 = v5_1;
            }
            v2++;
        }
        this.n0 = v0_4;
        this.o0 = f2.b0.c(v7_2);
        return v7_2;
    }

    public void setThumbDrawable(android.graphics.drawable.Drawable p1)
    {
        this.c0 = p1;
        this.e();
        return;
    }

    public void setThumbIconDrawable(android.graphics.drawable.Drawable p1)
    {
        this.d0 = p1;
        this.e();
        return;
    }

    public void setThumbIconResource(int p2)
    {
        this.setThumbIconDrawable(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setThumbIconSize(int p2)
    {
        if (this.e0 != p2) {
            this.e0 = p2;
            this.e();
        }
        return;
    }

    public void setThumbIconTintList(android.content.res.ColorStateList p1)
    {
        this.i0 = p1;
        this.e();
        return;
    }

    public void setThumbIconTintMode(android.graphics.PorterDuff$Mode p1)
    {
        this.j0 = p1;
        this.e();
        return;
    }

    public void setThumbTintList(android.content.res.ColorStateList p1)
    {
        this.h0 = p1;
        this.e();
        return;
    }

    public void setThumbTintMode(android.graphics.PorterDuff$Mode p1)
    {
        super.setThumbTintMode(p1);
        this.e();
        return;
    }

    public void setTrackDecorationDrawable(android.graphics.drawable.Drawable p1)
    {
        this.g0 = p1;
        this.f();
        return;
    }

    public void setTrackDecorationResource(int p2)
    {
        this.setTrackDecorationDrawable(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setTrackDecorationTintList(android.content.res.ColorStateList p1)
    {
        this.l0 = p1;
        this.f();
        return;
    }

    public void setTrackDecorationTintMode(android.graphics.PorterDuff$Mode p1)
    {
        this.m0 = p1;
        this.f();
        return;
    }

    public void setTrackDrawable(android.graphics.drawable.Drawable p1)
    {
        this.f0 = p1;
        this.f();
        return;
    }

    public void setTrackTintList(android.content.res.ColorStateList p1)
    {
        this.k0 = p1;
        this.f();
        return;
    }

    public void setTrackTintMode(android.graphics.PorterDuff$Mode p1)
    {
        super.setTrackTintMode(p1);
        this.f();
        return;
    }
}
