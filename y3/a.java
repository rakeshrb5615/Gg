package y3;
public final class a extends android.animation.AnimatorListenerAdapter {
    public final synthetic int a;
    public final synthetic y3.h b;

    public synthetic a(y3.h p1, int p2)
    {
        this.a = p2;
        this.b = p1;
        return;
    }

    public synthetic a(y3.h p1, int p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        return;
    }

    public final void onAnimationEnd(android.animation.Animator p1)
    {
        switch (this.a) {
            case 0:
                this.b.c();
                return;
            case 1:
                this.b.d();
                return;
            case 2:
                this.b.c();
                return;
            default:
                this.b.d();
                return;
        }
    }

    public void onAnimationStart(android.animation.Animator p10)
    {
        switch (this.a) {
            case 1:
                android.view.ViewPropertyAnimator v10_15 = this.b;
                android.view.ViewPropertyAnimator v10_16 = v10_15.a;
                android.animation.TimeInterpolator v1_4 = (v10_15.c - v10_16);
                com.google.android.material.snackbar.SnackbarContentLayout v0_4 = ((com.google.android.material.snackbar.SnackbarContentLayout) v10_15.j);
                v0_4.a.setAlpha(0);
                long v5 = ((long) v10_16);
                int v2_4 = v0_4.c;
                long v7 = ((long) v1_4);
                v0_4.a.animate().alpha(1065353216).setDuration(v5).setInterpolator(v2_4).setStartDelay(v7).start();
                if (v0_4.b.getVisibility() == 0) {
                    v0_4.b.setAlpha(0);
                    v0_4.b.animate().alpha(1065353216).setDuration(v5).setInterpolator(v2_4).setStartDelay(v7).start();
                }
                return;
            case 2:
                android.view.ViewPropertyAnimator v10_2 = this.b;
                android.view.ViewPropertyAnimator v10_12 = v10_2.b;
                com.google.android.material.snackbar.SnackbarContentLayout v0_3 = ((com.google.android.material.snackbar.SnackbarContentLayout) v10_2.j);
                v0_3.a.setAlpha(1065353216);
                long v4_0 = ((long) v10_12);
                android.animation.TimeInterpolator v1_2 = v0_3.c;
                v0_3.a.animate().alpha(0).setDuration(v4_0).setInterpolator(v1_2).setStartDelay(((long) 0)).start();
                if (v0_3.b.getVisibility() == 0) {
                    v0_3.b.setAlpha(1065353216);
                    v0_3.b.animate().alpha(0).setDuration(v4_0).setInterpolator(v1_2).setStartDelay(((long) 0)).start();
                }
                return;
            default:
                super.onAnimationStart(p10);
                return;
        }
    }
}
