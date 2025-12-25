package n;
public final class h1 extends android.widget.ToggleButton {
    public final n.p a;
    public final n.x0 b;
    public n.x c;

    public h1(android.content.Context p2, android.util.AttributeSet p3)
    {
        super(p2, p3, 16842827);
        n.t2.a(super, super.getContext());
        n.x v2_5 = new n.p(super);
        super.a = v2_5;
        v2_5.q(p3, 16842827);
        n.x v2_1 = new n.x0(super);
        super.b = v2_1;
        v2_1.f(p3, 16842827);
        super.getEmojiTextViewHelper().b(p3, 16842827);
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

    public void setAllCaps(boolean p2)
    {
        super.setAllCaps(p2);
        this.getEmojiTextViewHelper().c(p2);
        return;
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

    public final void setCompoundDrawables(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        super.setCompoundDrawables(p1, p2, p3, p4);
        n.x0 v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.b();
        }
        return;
    }

    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3, android.graphics.drawable.Drawable p4)
    {
        super.setCompoundDrawablesRelative(p1, p2, p3, p4);
        n.x0 v1_1 = this.b;
        if (v1_1 != null) {
            v1_1.b();
        }
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
}
