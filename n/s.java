package n;
public final class s extends android.widget.CheckedTextView {
    public final n.t a;
    public final n.p b;
    public final n.x0 c;
    public n.x d;

    public s(android.content.Context p8, android.util.AttributeSet p9)
    {
        n.u2.a(p8);
        super(p8, p9, 2130968781);
        n.t2.a(super, super.getContext());
        n.x v8_9 = new n.x0(super);
        super.c = v8_9;
        v8_9.f(p9, 2130968781);
        v8_9.b();
        n.x v8_2 = new n.p(super);
        super.b = v8_2;
        v8_2.q(p9, 2130968781);
        super.a = new n.t(super);
        int v3_0 = g.a.l;
        n.x v8_6 = b8.g.p(super.getContext(), p9, v3_0, 2130968781);
        int v0_1 = ((android.content.res.TypedArray) v8_6.c);
        q0.q0.m(super, super.getContext(), v3_0, p9, ((android.content.res.TypedArray) v8_6.c), 2130968781);
        try {
            if (!v0_1.hasValue(1)) {
                if (v0_1.hasValue(0)) {
                    android.graphics.PorterDuff$Mode v9_5 = v0_1.getResourceId(0, 0);
                    if (v9_5 != null) {
                        super.setCheckMarkDrawable(j5.t1.A(super.getContext(), v9_5));
                    }
                }
            } else {
                android.graphics.PorterDuff$Mode v9_2 = v0_1.getResourceId(1, 0);
                if (v9_2 == null) {
                } else {
                    super.setCheckMarkDrawable(j5.t1.A(super.getContext(), v9_2));
                }
            }
        } catch (int v0_3) {
            android.graphics.PorterDuff$Mode v9_12 = v0_3;
            v8_6.r();
            throw v9_12;
        }
        if (v0_1.hasValue(2)) {
            super.setCheckMarkTintList(v8_6.h(2));
        }
        if (v0_1.hasValue(3)) {
            super.setCheckMarkTintMode(n.n1.c(v0_1.getInt(3, -1), 0));
        }
        v8_6.r();
        super.getEmojiTextViewHelper().b(p9, 2130968781);
        return;
    }

    private n.x getEmojiTextViewHelper()
    {
        if (this.d == null) {
            this.d = new n.x(this);
        }
        return this.d;
    }

    public final void drawableStateChanged()
    {
        super.drawableStateChanged();
        n.t v0_0 = this.c;
        if (v0_0 != null) {
            v0_0.b();
        }
        n.t v0_1 = this.b;
        if (v0_1 != null) {
            v0_1.a();
        }
        n.t v0_2 = this.a;
        if (v0_2 != null) {
            v0_2.b();
        }
        return;
    }

    public android.view.ActionMode$Callback getCustomSelectionActionModeCallback()
    {
        return c4.b.h0(super.getCustomSelectionActionModeCallback());
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList()
    {
        int v0_0 = this.b;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.o();
        }
    }

    public android.graphics.PorterDuff$Mode getSupportBackgroundTintMode()
    {
        int v0_0 = this.b;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.p();
        }
    }

    public android.content.res.ColorStateList getSupportCheckMarkTintList()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.a;
        }
    }

    public android.graphics.PorterDuff$Mode getSupportCheckMarkTintMode()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.b;
        }
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList()
    {
        return this.c.d();
    }

    public android.graphics.PorterDuff$Mode getSupportCompoundDrawablesTintMode()
    {
        return this.c.e();
    }

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p2)
    {
        android.view.inputmethod.InputConnection v0 = super.onCreateInputConnection(p2);
        a.a.M(p2, v0, this);
        return v0;
    }

    public void setAllCaps(boolean p2)
    {
        super.setAllCaps(p2);
        this.getEmojiTextViewHelper().c(p2);
        return;
    }

    public void setBackgroundDrawable(android.graphics.drawable.Drawable p1)
    {
        super.setBackgroundDrawable(p1);
        n.p v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.r();
        }
        return;
    }

    public void setBackgroundResource(int p2)
    {
        super.setBackgroundResource(p2);
        n.p v0 = this.b;
        if (v0 != null) {
            v0.s(p2);
        }
        return;
    }

    public void setCheckMarkDrawable(int p2)
    {
        this.setCheckMarkDrawable(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setCheckMarkDrawable(android.graphics.drawable.Drawable p2)
    {
        super.setCheckMarkDrawable(p2);
        n.t v2_1 = this.a;
        if (v2_1 != null) {
            if (!v2_1.e) {
                v2_1.e = 1;
                v2_1.b();
            } else {
                v2_1.e = 0;
                return;
            }
        }
        return;
    }

    public final void setCompoundDrawables(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        super.setCompoundDrawables(p1, p2, p3, p4);
        n.x0 v1_1 = this.c;
        if (v1_1 != null) {
            v1_1.b();
        }
        return;
    }

    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        super.setCompoundDrawablesRelative(p1, p2, p3, p4);
        n.x0 v1_1 = this.c;
        if (v1_1 != null) {
            v1_1.b();
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

    public void setSupportBackgroundTintList(android.content.res.ColorStateList p2)
    {
        n.p v0 = this.b;
        if (v0 != null) {
            v0.u(p2);
        }
        return;
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.p v0 = this.b;
        if (v0 != null) {
            v0.v(p2);
        }
        return;
    }

    public void setSupportCheckMarkTintList(android.content.res.ColorStateList p2)
    {
        n.t v0 = this.a;
        if (v0 != null) {
            v0.a = p2;
            v0.c = 1;
            v0.b();
        }
        return;
    }

    public void setSupportCheckMarkTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.t v0 = this.a;
        if (v0 != null) {
            v0.b = p2;
            v0.d = 1;
            v0.b();
        }
        return;
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList p2)
    {
        n.x0 v0 = this.c;
        v0.l(p2);
        v0.b();
        return;
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.x0 v0 = this.c;
        v0.m(p2);
        v0.b();
        return;
    }

    public final void setTextAppearance(android.content.Context p2, int p3)
    {
        super.setTextAppearance(p2, p3);
        n.x0 v0 = this.c;
        if (v0 != null) {
            v0.g(p2, p3);
        }
        return;
    }
}
