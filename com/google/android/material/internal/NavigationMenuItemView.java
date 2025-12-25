package com.google.android.material.internal;
public class NavigationMenuItemView extends q3.d implements m.z {
    public static final int[] M;
    public int B;
    public boolean C;
    public boolean D;
    public final boolean E;
    public final android.widget.CheckedTextView F;
    public android.widget.FrameLayout G;
    public m.o H;
    public android.content.res.ColorStateList I;
    public boolean J;
    public android.graphics.drawable.Drawable K;
    public final com.google.android.material.datepicker.k L;

    static NavigationMenuItemView()
    {
        com.google.android.material.internal.NavigationMenuItemView.M = new int[] {16842912});
        return;
    }

    public NavigationMenuItemView(android.content.Context p4, android.util.AttributeSet p5)
    {
        super(p4, p5);
        super.E = 1;
        com.google.android.material.datepicker.k v0_1 = new com.google.android.material.datepicker.k(super, 4);
        super.L = v0_1;
        super.setOrientation(0);
        android.view.LayoutInflater.from(p4).inflate(2131558447, super, 1);
        super.setIconSize(p4.getResources().getDimensionPixelSize(2131165309));
        android.widget.CheckedTextView v4_5 = ((android.widget.CheckedTextView) super.findViewById(2131362014));
        super.F = v4_5;
        q0.q0.n(v4_5, v0_1);
        return;
    }

    private void setActionView(android.view.View p2)
    {
        if (p2 != null) {
            if (this.G == null) {
                this.G = ((android.widget.FrameLayout) ((android.view.ViewStub) this.findViewById(2131362013)).inflate());
            }
            if (p2.getParent() != null) {
                ((android.view.ViewGroup) p2.getParent()).removeView(p2);
            }
            this.G.removeAllViews();
            this.G.addView(p2);
        }
        return;
    }

    public final void a(m.o p7)
    {
        this.H = p7;
        android.widget.FrameLayout v0_0 = p7.a;
        if (v0_0 > null) {
            this.setId(v0_0);
        }
        android.widget.FrameLayout v0_1;
        if (!p7.isVisible()) {
            v0_1 = 8;
        } else {
            v0_1 = 0;
        }
        this.setVisibility(v0_1);
        if (this.getBackground() == null) {
            int v3_3;
            android.widget.FrameLayout v0_4 = new android.util.TypedValue();
            if (!this.getContext().getTheme().resolveAttribute(2130968848, v0_4, 1)) {
                v3_3 = 0;
            } else {
                v3_3 = new android.graphics.drawable.StateListDrawable();
                v3_3.addState(com.google.android.material.internal.NavigationMenuItemView.M, new android.graphics.drawable.ColorDrawable(v0_4.data));
                v3_3.addState(android.view.ViewGroup.EMPTY_STATE_SET, new android.graphics.drawable.ColorDrawable(0));
            }
            this.setBackground(v3_3);
        }
        this.setCheckable(p7.isCheckable());
        this.setChecked(p7.isChecked());
        this.setEnabled(p7.isEnabled());
        this.setTitle(p7.e);
        this.setIcon(p7.getIcon());
        this.setActionView(p7.getActionView());
        this.setContentDescription(p7.q);
        n.g3.a(this, p7.r);
        n.x1 v7_2 = this.H;
        int v3_5 = this.F;
        if ((v7_2.e != null) || ((v7_2.getIcon() != null) || (this.H.getActionView() == null))) {
            v3_5.setVisibility(0);
            n.x1 v7_6 = this.G;
            if (v7_6 != null) {
                n.x1 v7_8 = ((n.x1) v7_6.getLayoutParams());
                v7_8.width = -2;
                this.G.setLayoutParams(v7_8);
            }
        } else {
            v3_5.setVisibility(8);
            n.x1 v7_9 = this.G;
            if (v7_9 != null) {
                n.x1 v7_11 = ((n.x1) v7_9.getLayoutParams());
                v7_11.width = -1;
                this.G.setLayoutParams(v7_11);
                return;
            }
        }
        return;
    }

    public m.o getItemData()
    {
        return this.H;
    }

    public final int[] onCreateDrawableState(int p2)
    {
        int[] v2_2 = super.onCreateDrawableState((p2 + 1));
        int[] v0_2 = this.H;
        if ((v0_2 != null) && ((v0_2.isCheckable()) && (this.H.isChecked()))) {
            android.view.View.mergeDrawableStates(v2_2, com.google.android.material.internal.NavigationMenuItemView.M);
        }
        return v2_2;
    }

    public void setCheckable(boolean p3)
    {
        this.refreshDrawableState();
        if (this.D != p3) {
            this.D = p3;
            this.L.h(this.F, 2048);
        }
        return;
    }

    public void setChecked(boolean p3)
    {
        int v3_2;
        this.refreshDrawableState();
        android.widget.CheckedTextView v0 = this.F;
        v0.setChecked(p3);
        android.graphics.Typeface v1 = v0.getTypeface();
        if ((p3 == 0) || (!this.E)) {
            v3_2 = 0;
        } else {
            v3_2 = 1;
        }
        v0.setTypeface(v1, v3_2);
        return;
    }

    public void setHorizontalPadding(int p3)
    {
        this.setPadding(p3, this.getPaddingTop(), p3, this.getPaddingBottom());
        return;
    }

    public void setIcon(android.graphics.drawable.Drawable p4)
    {
        if (p4 == null) {
            if (this.C) {
                if (this.K == null) {
                    android.graphics.drawable.Drawable v4_1 = this.getResources().getDrawable(2131231344, this.getContext().getTheme());
                    this.K = v4_1;
                    if (v4_1 != null) {
                        v4_1.setBounds(0, 0, this.B, this.B);
                    }
                }
                p4 = this.K;
            }
        } else {
            if (this.J) {
                int v1_4 = p4.getConstantState();
                if (v1_4 != 0) {
                    p4 = v1_4.newDrawable();
                }
                p4 = p4.mutate();
                p4.setTintList(this.I);
            }
            p4.setBounds(0, 0, this.B, this.B);
        }
        this.F.setCompoundDrawablesRelative(p4, 0, 0, 0);
        return;
    }

    public void setIconPadding(int p2)
    {
        this.F.setCompoundDrawablePadding(p2);
        return;
    }

    public void setIconSize(int p1)
    {
        this.B = p1;
        return;
    }

    public void setIconTintList(android.content.res.ColorStateList p1)
    {
        android.graphics.drawable.Drawable v1_1;
        this.I = p1;
        if (p1 == null) {
            v1_1 = 0;
        } else {
            v1_1 = 1;
        }
        this.J = v1_1;
        android.graphics.drawable.Drawable v1_2 = this.H;
        if (v1_2 != null) {
            this.setIcon(v1_2.getIcon());
        }
        return;
    }

    public void setMaxLines(int p2)
    {
        this.F.setMaxLines(p2);
        return;
    }

    public void setNeedsEmptyIcon(boolean p1)
    {
        this.C = p1;
        return;
    }

    public void setTextAppearance(int p2)
    {
        this.F.setTextAppearance(p2);
        return;
    }

    public void setTextColor(android.content.res.ColorStateList p2)
    {
        this.F.setTextColor(p2);
        return;
    }

    public void setTitle(CharSequence p2)
    {
        this.F.setText(p2);
        return;
    }
}
