package n;
public final class o0 extends n.g2 implements n.q0 {
    public CharSequence I;
    public n.l0 J;
    public final android.graphics.Rect K;
    public int L;
    public final synthetic n.r0 M;

    public o0(n.r0 p3, android.content.Context p4, android.util.AttributeSet p5)
    {
        this.M = p3;
        super(p4, p5, 2130969761, 0);
        super.K = new android.graphics.Rect();
        super.u = p3;
        super.E = 1;
        super.F.setFocusable(1);
        super.v = new n.m0(super, 0);
        return;
    }

    public final void g(CharSequence p1)
    {
        this.I = p1;
        return;
    }

    public final void j(int p1)
    {
        this.L = p1;
        return;
    }

    public final void l(int p6, int p7)
    {
        n.b0 v0 = this.F;
        int v1_0 = v0.isShowing();
        this.s();
        v0.setInputMethodMode(2);
        this.c();
        n.t1 v2_2 = this.c;
        v2_2.setChoiceMode(1);
        v2_2.setTextDirection(p6);
        v2_2.setTextAlignment(p7);
        n.n0 v6_1 = this.M;
        m.d v7_1 = v6_1.getSelectedItemPosition();
        n.t1 v2_0 = this.c;
        if ((v0.isShowing()) && (v2_0 != null)) {
            v2_0.setListSelectionHidden(0);
            v2_0.setSelection(v7_1);
            if (v2_0.getChoiceMode() != 0) {
                v2_0.setItemChecked(v7_1, 1);
            }
        }
        if (v1_0 == 0) {
            n.n0 v6_2 = v6_1.getViewTreeObserver();
            if (v6_2 != null) {
                m.d v7_3 = new m.d(this, 3);
                v6_2.addOnGlobalLayoutListener(v7_3);
                v0.setOnDismissListener(new n.n0(this, v7_3));
            }
        }
        return;
    }

    public final CharSequence o()
    {
        return this.I;
    }

    public final void p(android.widget.ListAdapter p1)
    {
        super.p(p1);
        this.J = ((n.l0) p1);
        return;
    }

    public final void s()
    {
        int v3_2;
        int v0_0 = this.M;
        boolean v1_0 = v0_0.n;
        int v2_0 = this.F;
        int v3_3 = v2_0.getBackground();
        if (v3_3 == 0) {
            v3_2 = 0;
            v1_0.right = 0;
            v1_0.left = 0;
        } else {
            v3_3.getPadding(v1_0);
            if (v0_0.getLayoutDirection() != 1) {
                v3_2 = (- v1_0.left);
            } else {
                v3_2 = v1_0.right;
            }
        }
        int v5_0 = v0_0.getPaddingLeft();
        int v6 = v0_0.getPaddingRight();
        int v7_0 = v0_0.getWidth();
        int v8_0 = v0_0.m;
        if (v8_0 != -2) {
            if (v8_0 != -1) {
                this.r(v8_0);
            } else {
                this.r(((v7_0 - v5_0) - v6));
            }
        } else {
            int v2_2 = v0_0.a(this.J, v2_0.getBackground());
            int v8_7 = ((v0_0.getContext().getResources().getDisplayMetrics().widthPixels - v1_0.left) - v1_0.right);
            if (v2_2 > v8_7) {
                v2_2 = v8_7;
            }
            this.r(Math.max(v2_2, ((v7_0 - v5_0) - v6)));
        }
        int v7_1;
        if (v0_0.getLayoutDirection() != 1) {
            v7_1 = ((v5_0 + this.L) + v3_2);
        } else {
            v7_1 = ((((v7_0 - v6) - this.e) - this.L) + v3_2);
        }
        this.f = v7_1;
        return;
    }
}
