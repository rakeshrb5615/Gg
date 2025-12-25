package n;
public class q extends android.widget.Button {
    public final n.p a;
    public final n.x0 b;
    public n.x c;

    public q(android.content.Context p1, android.util.AttributeSet p2, int p3)
    {
        n.u2.a(p1);
        super(p1, p2, p3);
        n.t2.a(super, super.getContext());
        n.x v1_5 = new n.p(super);
        super.a = v1_5;
        v1_5.q(p2, p3);
        n.x v1_1 = new n.x0(super);
        super.b = v1_1;
        v1_1.f(p2, p3);
        v1_1.b();
        super.getEmojiTextViewHelper().b(p2, p3);
        return;
    }

    private n.x getEmojiTextViewHelper()
    {
        if (this.c == null) {
            this.c = new n.x(this);
        }
        return this.c;
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        n.x0 v0_0 = this.a;
        if (v0_0 != null) {
            v0_0.a();
        }
        n.x0 v0_1 = this.b;
        if (v0_1 != null) {
            v0_1.b();
        }
        return;
    }

    public int getAutoSizeMaxTextSize()
    {
        if (!n.k3.c) {
            int v0_2 = this.b;
            if (v0_2 == 0) {
                return -1;
            } else {
                return Math.round(v0_2.i.e);
            }
        } else {
            return super.getAutoSizeMaxTextSize();
        }
    }

    public int getAutoSizeMinTextSize()
    {
        if (!n.k3.c) {
            int v0_2 = this.b;
            if (v0_2 == 0) {
                return -1;
            } else {
                return Math.round(v0_2.i.d);
            }
        } else {
            return super.getAutoSizeMinTextSize();
        }
    }

    public int getAutoSizeStepGranularity()
    {
        if (!n.k3.c) {
            int v0_2 = this.b;
            if (v0_2 == 0) {
                return -1;
            } else {
                return Math.round(v0_2.i.c);
            }
        } else {
            return super.getAutoSizeStepGranularity();
        }
    }

    public int[] getAutoSizeTextAvailableSizes()
    {
        if (!n.k3.c) {
            int[] v0_2 = this.b;
            if (v0_2 == null) {
                int[] v0_4 = new int[0];
                return v0_4;
            } else {
                return v0_2.i.f;
            }
        } else {
            return super.getAutoSizeTextAvailableSizes();
        }
    }

    public int getAutoSizeTextType()
    {
        if (!n.k3.c) {
            int v0_2 = this.b;
            if (v0_2 == 0) {
                return 0;
            } else {
                return v0_2.i.a;
            }
        } else {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public android.view.ActionMode$Callback getCustomSelectionActionModeCallback()
    {
        return c4.b.h0(super.getCustomSelectionActionModeCallback());
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.o();
        }
    }

    public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.p();
        }
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList()
    {
        return this.b.d();
    }

    public android.graphics.PorterDuff$Mode getSupportCompoundDrawablesTintMode()
    {
        return this.b.e();
    }

    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p2)
    {
        super.onInitializeAccessibilityEvent(p2);
        p2.setClassName(android.widget.Button.getName());
        return;
    }

    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p2)
    {
        super.onInitializeAccessibilityNodeInfo(p2);
        p2.setClassName(android.widget.Button.getName());
        return;
    }

    public void onLayout(boolean p1, int p2, int p3, int p4, int p5)
    {
        n.g1 v2_1 = super.onLayout(p1, p2, p3, p4, p5).b;
        if ((v2_1 != null) && (!n.k3.c)) {
            v2_1.i.a();
        }
        return;
    }

    public void onTextChanged(CharSequence p1, int p2, int p3, int p4)
    {
        super.onTextChanged(p1, p2, p3, p4);
        n.g1 v1_1 = this.b;
        if (v1_1 != null) {
            n.g1 v1_2 = v1_1.i;
            if ((!n.k3.c) && (v1_2.f())) {
                v1_2.a();
            }
        }
        return;
    }

    public void setAllCaps(boolean p2)
    {
        super.setAllCaps(p2);
        this.getEmojiTextViewHelper().c(p2);
        return;
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int p2, int p3, int p4, int p5)
    {
        if (!n.k3.c) {
            n.x0 v0_1 = this.b;
            if (v0_1 != null) {
                v0_1.i(p2, p3, p4, p5);
            }
            return;
        } else {
            super.setAutoSizeTextTypeUniformWithConfiguration(p2, p3, p4, p5);
            return;
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] p2, int p3)
    {
        if (!n.k3.c) {
            n.x0 v0_1 = this.b;
            if (v0_1 != null) {
                v0_1.j(p2, p3);
            }
            return;
        } else {
            super.setAutoSizeTextTypeUniformWithPresetSizes(p2, p3);
            return;
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int p2)
    {
        if (!n.k3.c) {
            n.x0 v0_1 = this.b;
            if (v0_1 != null) {
                v0_1.k(p2);
            }
            return;
        } else {
            super.setAutoSizeTextTypeWithDefaults(p2);
            return;
        }
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable p1)
    {
        super.setBackgroundDrawable(p1);
        n.p v1_1 = this.a;
        if (v1_1 != null) {
            v1_1.r();
        }
        return;
    }

    public void setBackgroundResource(int p2)
    {
        super.setBackgroundResource(p2);
        n.p v0 = this.a;
        if (v0 != null) {
            v0.s(p2);
        }
        return;
    }

    public void setCustomSelectionActionModeCallback(android.view.ActionMode$Callback p1)
    {
        super.setCustomSelectionActionModeCallback(c4.b.i0(p1, this));
        return;
    }

    public void setEmojiCompatEnabled(boolean p2)
    {
        this.getEmojiTextViewHelper().d(p2);
        return;
    }

    public void setFilters(android.text.InputFilter[] p2)
    {
        super.setFilters(this.getEmojiTextViewHelper().a(p2));
        return;
    }

    public void setSupportAllCaps(boolean p2)
    {
        android.widget.TextView v0_0 = this.b;
        if (v0_0 != null) {
            v0_0.a.setAllCaps(p2);
        }
        return;
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList p2)
    {
        n.p v0 = this.a;
        if (v0 != null) {
            v0.u(p2);
        }
        return;
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.p v0 = this.a;
        if (v0 != null) {
            v0.v(p2);
        }
        return;
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList p2)
    {
        n.x0 v0 = this.b;
        v0.l(p2);
        v0.b();
        return;
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.x0 v0 = this.b;
        v0.m(p2);
        v0.b();
        return;
    }

    public final void setTextAppearance(android.content.Context p2, int p3)
    {
        super.setTextAppearance(p2, p3);
        n.x0 v0 = this.b;
        if (v0 != null) {
            v0.g(p2, p3);
        }
        return;
    }

    public final void setTextSize(int p3, float p4)
    {
        boolean v0_0 = n.k3.c;
        if (!v0_0) {
            n.g1 v1_0 = this.b;
            if (v1_0 != null) {
                n.g1 v1_1 = v1_0.i;
                if ((!v0_0) && (!v1_1.f())) {
                    v1_1.g(p3, p4);
                }
            }
            return;
        } else {
            super.setTextSize(p3, p4);
            return;
        }
    }
}
