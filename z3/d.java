package z3;
public final class d extends z3.p {
    public final int e;
    public final int f;
    public final android.animation.TimeInterpolator g;
    public final android.animation.TimeInterpolator h;
    public android.widget.EditText i;
    public final com.google.android.material.datepicker.o j;
    public final z3.a k;
    public android.animation.AnimatorSet l;
    public android.animation.ValueAnimator m;

    public d(z3.o p4)
    {
        super(p4);
        super.j = new com.google.android.material.datepicker.o(super, 2);
        super.k = new z3.a(super, 0);
        super.e = j5.t1.P(p4.getContext(), 2130969532, 100);
        super.f = j5.t1.P(p4.getContext(), 2130969532, 150);
        super.g = j5.t1.Q(p4.getContext(), 2130969541, d3.a.a);
        super.h = j5.t1.Q(p4.getContext(), 2130969539, d3.a.d);
        return;
    }

    public final void a()
    {
        if (this.b.v == null) {
            this.s(this.t());
            return;
        } else {
            return;
        }
    }

    public final int c()
    {
        return 2131951744;
    }

    public final int d()
    {
        return 2131231322;
    }

    public final android.view.View$OnFocusChangeListener e()
    {
        return this.k;
    }

    public final android.view.View$OnClickListener f()
    {
        return this.j;
    }

    public final android.view.View$OnFocusChangeListener g()
    {
        return this.k;
    }

    public final void l(android.widget.EditText p2)
    {
        this.i = p2;
        this.a.setEndIconVisible(this.t());
        return;
    }

    public final void o(boolean p2)
    {
        if (this.b.v != null) {
            this.s(p2);
            return;
        } else {
            return;
        }
    }

    public final void q()
    {
        z3.c v1_0 = new float[2];
        v1_0 = {1061997773, 1065353216};
        z3.c v1_2 = android.animation.ValueAnimator.ofFloat(v1_0);
        v1_2.setInterpolator(this.h);
        v1_2.setDuration(((long) this.f));
        v1_2.addUpdateListener(new z3.b(this, 1));
        z3.c v2_2 = new float[2];
        v2_2 = {0, 1065353216};
        z3.c v2_3 = android.animation.ValueAnimator.ofFloat(v2_2);
        android.animation.TimeInterpolator v4 = this.g;
        v2_3.setInterpolator(v4);
        int v5 = this.e;
        v2_3.setDuration(((long) v5));
        v2_3.addUpdateListener(new z3.b(this, 0));
        android.animation.AnimatorSet v6_4 = new android.animation.AnimatorSet();
        this.l = v6_4;
        android.animation.Animator[] v8 = new android.animation.Animator[2];
        v8[0] = v1_2;
        v8[1] = v2_3;
        v6_4.playTogether(v8);
        this.l.addListener(new z3.c(this, 0));
        android.animation.ValueAnimator v0_1 = new float[2];
        v0_1 = {1065353216, 0};
        android.animation.ValueAnimator v0_2 = android.animation.ValueAnimator.ofFloat(v0_1);
        v0_2.setInterpolator(v4);
        v0_2.setDuration(((long) v5));
        v0_2.addUpdateListener(new z3.b(this, 0));
        this.m = v0_2;
        v0_2.addListener(new z3.c(this, 1));
        return;
    }

    public final void r()
    {
        android.widget.EditText v0 = this.i;
        if (v0 != null) {
            v0.post(new androidx.lifecycle.g0(this, 16));
        }
        return;
    }

    public final void s(boolean p3)
    {
        int v0_2;
        if (this.b.d() != p3) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        if ((p3 == null) || (this.l.isRunning())) {
            if (p3 == null) {
                this.l.cancel();
                this.m.start();
                if (v0_2 != 0) {
                    this.m.end();
                }
            }
        } else {
            this.m.cancel();
            this.l.start();
            if (v0_2 != 0) {
                this.l.end();
                return;
            }
        }
        return;
    }

    public final boolean t()
    {
        int v0_0 = this.i;
        if (((v0_0 == 0) || ((!v0_0.hasFocus()) && (!this.d.hasFocus()))) || (this.i.getText().length() <= 0)) {
            return 0;
        } else {
            return 1;
        }
    }
}
