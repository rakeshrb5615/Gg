package n;
public class d0 extends android.widget.RadioButton implements t0.j {
    public final n.t a;
    public final n.p b;
    public final n.x0 c;
    public n.x d;

    public d0(android.content.Context p2, android.util.AttributeSet p3)
    {
        n.u2.a(p2);
        super(p2, p3, 2130969663);
        n.t2.a(super, super.getContext());
        n.x v2_8 = new n.t(super);
        super.a = v2_8;
        v2_8.c(p3, 2130969663);
        n.x v2_2 = new n.p(super);
        super.b = v2_2;
        v2_2.q(p3, 2130969663);
        n.x v2_4 = new n.x0(super);
        super.c = v2_4;
        v2_4.f(p3, 2130969663);
        super.getEmojiTextViewHelper().b(p3, 2130969663);
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
        n.x0 v0_0 = this.b;
        if (v0_0 != null) {
            v0_0.a();
        }
        n.x0 v0_1 = this.c;
        if (v0_1 != null) {
            v0_1.b();
        }
        return;
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

    public android.content.res.ColorStateList getSupportButtonTintList()
    {
        int v0_0 = this.a;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.a;
        }
    }

    public android.graphics.PorterDuff$Mode getSupportButtonTintMode()
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

    public void setButtonDrawable(int p2)
    {
        this.setButtonDrawable(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setButtonDrawable(android.graphics.drawable.Drawable p2)
    {
        super.setButtonDrawable(p2);
        n.t v2_1 = this.a;
        if (v2_1 != null) {
            if (!v2_1.e) {
                v2_1.e = 1;
                v2_1.a();
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

    public void setSupportButtonTintList(android.content.res.ColorStateList p2)
    {
        n.t v0 = this.a;
        if (v0 != null) {
            v0.a = p2;
            v0.c = 1;
            v0.a();
        }
        return;
    }

    public void setSupportButtonTintMode(android.graphics.PorterDuff$Mode p2)
    {
        n.t v0 = this.a;
        if (v0 != null) {
            v0.b = p2;
            v0.d = 1;
            v0.a();
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
}
