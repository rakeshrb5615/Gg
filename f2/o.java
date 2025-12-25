package f2;
public final class o extends android.animation.AnimatorListenerAdapter {
    public final synthetic int a;
    public final synthetic Object b;

    public synthetic o(Object p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public o(q0.u0 p1, android.view.View p2)
    {
        this.a = 6;
        this.b = p1;
        return;
    }

    public void onAnimationCancel(android.animation.Animator p2)
    {
        switch (this.a) {
            case 5:
                q0.u0 v2_4 = ((androidx.appcompat.widget.ActionBarOverlayLayout) this.b);
                v2_4.C = 0;
                v2_4.p = 0;
                return;
            case 6:
                ((q0.u0) this.b).b();
                return;
            default:
                super.onAnimationCancel(p2);
                return;
        }
    }

    public final void onAnimationEnd(android.animation.Animator p5)
    {
        switch (this.a) {
            case 0:
                ((f2.s) this.b).p();
                p5.removeListener(this);
                return;
            case 1:
                ((com.google.android.material.behavior.HideBottomViewOnScrollBehavior) this.b).k = 0;
                return;
            case 2:
                ((com.google.android.material.behavior.HideViewOnScrollBehavior) this.b).k = 0;
                return;
            case 3:
                android.view.ViewOverlay v0_14 = ((g2.f) this.b);
                java.util.ArrayList v5_24 = new java.util.ArrayList(v0_14.e);
                int v1_3 = v5_24.size();
                int v2_1 = 0;
                while (v2_1 < v1_3) {
                    b4.b v3_5 = ((k3.a) v5_24.get(v2_1)).b.u;
                    if (v3_5 != null) {
                        v0_14.setTintList(v3_5);
                    }
                    v2_1++;
                }
                return;
            case 4:
                java.util.ArrayList v5_19 = ((com.google.android.material.bottomsheet.BottomSheetBehavior) this.b);
                v5_19.I(5);
                android.view.ViewOverlay v0_11 = v5_19.W;
                if ((v0_11 != null) && (v0_11.get() != null)) {
                    ((android.view.View) v5_19.W.get()).requestLayout();
                }
                return;
            case 5:
                java.util.ArrayList v5_17 = ((androidx.appcompat.widget.ActionBarOverlayLayout) this.b);
                v5_17.C = 0;
                v5_17.p = 0;
                return;
            case 6:
                ((q0.u0) this.b).a();
                return;
            case 7:
                java.util.ArrayList v5_12 = ((r3.f) this.b);
                v5_12.b.setTranslationY(0);
                v5_12.b(0);
                return;
            case 8:
                java.util.ArrayList v5_6 = ((com.google.android.material.sidesheet.SideSheetBehavior) this.b);
                v5_6.w(5);
                android.view.ViewOverlay v0_4 = v5_6.p;
                if ((v0_4 != null) && (v0_4.get() != null)) {
                    ((android.view.View) v5_6.p.get()).requestLayout();
                }
                return;
            case 9:
                android.view.ViewOverlay v0_1;
                super.onAnimationEnd(p5);
                java.util.ArrayList v5_13 = ((x3.e) this.b);
                android.view.ViewOverlay v0_10 = q3.k.d(v5_13);
                if (v0_10 != null) {
                    v0_1 = v0_10.getOverlay();
                } else {
                    v0_1 = 0;
                }
                if (v0_1 != null) {
                    java.util.ArrayList v5_4 = v5_13.r;
                    int v1_0 = v5_4.size();
                    int v2_0 = 0;
                    while (v2_0 < v1_0) {
                        b4.b v3_0 = v5_4.get(v2_0);
                        v2_0++;
                        v0_1.remove(((b4.b) v3_0));
                    }
                }
                return;
            default:
                java.util.ArrayList v5_2 = ((z3.k) this.b);
                v5_2.p();
                v5_2.r.start();
                return;
        }
    }

    public void onAnimationStart(android.animation.Animator p7)
    {
        switch (this.a) {
            case 3:
                g2.f v0_2 = ((g2.f) this.b);
                q0.u0 v7_1 = new java.util.ArrayList(v0_2.e);
                int v1_0 = v7_1.size();
                int v2 = 0;
                while (v2 < v1_0) {
                    int v3_2 = ((k3.a) v7_1.get(v2)).b;
                    android.content.res.ColorStateList v4 = v3_2.u;
                    if (v4 != null) {
                        v0_2.setTint(v4.getColorForState(v3_2.y, v4.getDefaultColor()));
                    }
                    v2++;
                }
                return;
            case 6:
                ((q0.u0) this.b).c();
                return;
            default:
                super.onAnimationStart(p7);
                return;
        }
    }
}
