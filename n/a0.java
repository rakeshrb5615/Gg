package n;
public final class a0 extends android.widget.MultiAutoCompleteTextView {
    public static final int[] d;
    public final n.p a;
    public final n.x0 b;
    public final n.c0 c;

    static a0()
    {
        n.a0.d = new int[] {16843126});
        return;
    }

    public a0(android.content.Context p5, android.util.AttributeSet p6)
    {
        n.u2.a(p5);
        super(p5, p6, 2130968648);
        n.t2.a(super, super.getContext());
        android.text.method.KeyListener v5_1 = b8.g.p(super.getContext(), p6, n.a0.d, 2130968648);
        if (((android.content.res.TypedArray) v5_1.c).hasValue(0)) {
            super.setDropDownBackgroundDrawable(v5_1.i(0));
        }
        v5_1.r();
        android.text.method.KeyListener v5_3 = new n.p(super);
        super.a = v5_3;
        v5_3.q(p6, 2130968648);
        android.text.method.KeyListener v5_5 = new n.x0(super);
        super.b = v5_5;
        v5_5.f(p6, 2130968648);
        v5_5.b();
        android.text.method.KeyListener v5_7 = new n.c0(super);
        super.c = v5_7;
        v5_7.b(p6, 2130968648);
        android.text.method.KeyListener v6_1 = super.getKeyListener();
        if (!(v6_1 instanceof android.text.method.NumberKeyListener)) {
            boolean v0_2 = super.isFocusable();
            boolean v1_4 = super.isClickable();
            boolean v2_1 = super.isLongClickable();
            int v3 = super.getInputType();
            android.text.method.KeyListener v5_9 = v5_7.a(v6_1);
            if (v5_9 != v6_1) {
                super.setKeyListener(v5_9);
                super.setRawInputType(v3);
                super.setFocusable(v0_2);
                super.setClickable(v1_4);
                super.setLongClickable(v2_1);
            }
        }
        return;
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

    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p3)
    {
        android.view.inputmethod.InputConnection v0 = super.onCreateInputConnection(p3);
        a.a.M(p3, v0, this);
        return this.c.c(v0, p3);
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

    public void setDropDownBackgroundResource(int p2)
    {
        this.setDropDownBackgroundDrawable(j5.t1.A(this.getContext(), p2));
        return;
    }

    public void setEmojiCompatEnabled(boolean p2)
    {
        this.c.d(p2);
        return;
    }

    public void setKeyListener(android.text.method.KeyListener p2)
    {
        super.setKeyListener(this.c.a(p2));
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
}
