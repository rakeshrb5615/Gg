package n;
public final class h0 extends n.c0 {
    public final n.g0 e;
    public android.graphics.drawable.Drawable f;
    public android.content.res.ColorStateList g;
    public android.graphics.PorterDuff$Mode h;
    public boolean i;
    public boolean j;

    public h0(n.g0 p2)
    {
        super(p2);
        super.g = 0;
        super.h = 0;
        super.i = 0;
        super.j = 0;
        super.e = p2;
        return;
    }

    public final void b(android.util.AttributeSet p8, int p9)
    {
        super.b(p8, 2130969700);
        android.content.res.ColorStateList v0_0 = this.e;
        int[] v2_4 = g.a.g;
        b8.g v9_1 = b8.g.p(v0_0.getContext(), p8, v2_4, 2130969700);
        android.content.res.TypedArray v6_0 = ((android.content.res.TypedArray) v9_1.c);
        q0.q0.m(v0_0, v0_0.getContext(), v2_4, p8, ((android.content.res.TypedArray) v9_1.c), 2130969700);
        int v8_2 = v9_1.j(0);
        if (v8_2 != 0) {
            v0_0.setThumb(v8_2);
        }
        boolean v1_1 = v9_1.i(1);
        int[] v2_0 = this.f;
        if (v2_0 != null) {
            v2_0.setCallback(0);
        }
        this.f = v1_1;
        if (v1_1) {
            v1_1.setCallback(v0_0);
            v1_1.setLayoutDirection(v0_0.getLayoutDirection());
            if (v1_1.isStateful()) {
                v1_1.setState(v0_0.getDrawableState());
            }
            this.f();
        }
        v0_0.invalidate();
        if (v6_0.hasValue(3)) {
            this.h = n.n1.c(v6_0.getInt(3, -1), this.h);
            this.j = 1;
        }
        if (v6_0.hasValue(2)) {
            this.g = v9_1.h(2);
            this.i = 1;
        }
        v9_1.r();
        this.f();
        return;
    }

    public final void f()
    {
        android.graphics.drawable.Drawable v0_0 = this.f;
        if ((v0_0 != null) && ((this.i) || (this.j))) {
            android.graphics.drawable.Drawable v0_6 = v0_0.mutate();
            this.f = v0_6;
            if (this.i) {
                v0_6.setTintList(this.g);
            }
            if (this.j) {
                this.f.setTintMode(this.h);
            }
            if (this.f.isStateful()) {
                this.f.setState(this.e.getDrawableState());
            }
        }
        return;
    }

    public final void g(android.graphics.Canvas p8)
    {
        if (this.f != null) {
            int v0_1 = this.e;
            int v1 = v0_1.getMax();
            float v2_0 = 1;
            if (v1 > 1) {
                int v3_0;
                int v3_6 = this.f.getIntrinsicWidth();
                int v4_1 = this.f.getIntrinsicHeight();
                if (v3_6 < 0) {
                    v3_0 = 1;
                } else {
                    v3_0 = (v3_6 / 2);
                }
                if (v4_1 >= 0) {
                    v2_0 = (v4_1 / 2);
                }
                this.f.setBounds((- v3_0), (- v2_0), v3_0, v2_0);
                float v2_5 = (((float) ((v0_1.getWidth() - v0_1.getPaddingLeft()) - v0_1.getPaddingRight())) / ((float) v1));
                int v3_4 = p8.save();
                p8.translate(((float) v0_1.getPaddingLeft()), ((float) (v0_1.getHeight() / 2)));
                int v0_5 = 0;
                while (v0_5 <= v1) {
                    this.f.draw(p8);
                    p8.translate(v2_5, 0);
                    v0_5++;
                }
                p8.restoreToCount(v3_4);
            }
        }
        return;
    }
}
