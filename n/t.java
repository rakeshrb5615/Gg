package n;
public final class t {
    public android.content.res.ColorStateList a;
    public android.graphics.PorterDuff$Mode b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final android.widget.TextView f;

    public synthetic t(android.widget.TextView p2)
    {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.f = p2;
        return;
    }

    public void a()
    {
        android.widget.CompoundButton v0_1 = ((android.widget.CompoundButton) this.f);
        android.graphics.drawable.Drawable v1_1 = v0_1.getButtonDrawable();
        if ((v1_1 != null) && ((this.c) || (this.d))) {
            android.graphics.drawable.Drawable v1_0 = v1_1.mutate();
            if (this.c) {
                v1_0.setTintList(this.a);
            }
            if (this.d) {
                v1_0.setTintMode(this.b);
            }
            if (v1_0.isStateful()) {
                v1_0.setState(v0_1.getDrawableState());
            }
            v0_1.setButtonDrawable(v1_0);
        }
        return;
    }

    public void b()
    {
        n.s v0_1 = ((n.s) this.f);
        android.graphics.drawable.Drawable v1_1 = v0_1.getCheckMarkDrawable();
        if ((v1_1 != null) && ((this.c) || (this.d))) {
            android.graphics.drawable.Drawable v1_0 = v1_1.mutate();
            if (this.c) {
                v1_0.setTintList(this.a);
            }
            if (this.d) {
                v1_0.setTintMode(this.b);
            }
            if (v1_0.isStateful()) {
                v1_0.setState(v0_1.getDrawableState());
            }
            v0_1.setCheckMarkDrawable(v1_0);
        }
        return;
    }

    public void c(android.util.AttributeSet p9, int p10)
    {
        android.widget.CompoundButton v1_1 = ((android.widget.CompoundButton) this.f);
        int[] v3 = g.a.m;
        b8.g v7 = b8.g.p(v1_1.getContext(), p9, v3, p10);
        Throwable v0_4 = ((android.content.res.TypedArray) v7.c);
        q0.q0.m(v1_1, v1_1.getContext(), v3, p9, ((android.content.res.TypedArray) v7.c), p10);
        try {
            if (!v0_4.hasValue(1)) {
                if (v0_4.hasValue(0)) {
                    android.graphics.PorterDuff$Mode v9_5 = v0_4.getResourceId(0, 0);
                    if (v9_5 != null) {
                        v1_1.setButtonDrawable(j5.t1.A(v1_1.getContext(), v9_5));
                    }
                }
            } else {
                android.graphics.PorterDuff$Mode v9_2 = v0_4.getResourceId(1, 0);
                if (v9_2 == null) {
                } else {
                    v1_1.setButtonDrawable(j5.t1.A(v1_1.getContext(), v9_2));
                }
            }
        } catch (Throwable v0_2) {
            android.graphics.PorterDuff$Mode v9_12 = v0_2;
            v7.r();
            throw v9_12;
        }
        if (v0_4.hasValue(2)) {
            v1_1.setButtonTintList(v7.h(2));
        }
        if (v0_4.hasValue(3)) {
            v1_1.setButtonTintMode(n.n1.c(v0_4.getInt(3, -1), 0));
        }
        v7.r();
        return;
    }
}
