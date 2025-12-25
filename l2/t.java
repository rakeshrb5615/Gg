package l2;
public final class t extends a2.w0 {

    public final void a(androidx.recyclerview.widget.RecyclerView p9, int p10)
    {
        int v0 = 0;
        android.view.ViewPropertyAnimator v2_0 = 1;
        if (p10 == null) {
            if (p9.getResources().getConfiguration().orientation != 1) {
                v2_0 = 0;
            }
            while (v0 < p9.getChildCount()) {
                int v4;
                android.view.ViewPropertyAnimator v10_2 = p9.getChildAt(v0);
                v10_2.animate().cancel();
                int v3_1 = -1054867456;
                if (v2_0 == null) {
                    v4 = 0;
                } else {
                    v4 = -1054867456;
                }
                if (v2_0 != null) {
                    v3_1 = 0;
                }
                v10_2.animate().setDuration(50).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).translationXBy(v4).translationYBy(v3_1).withEndAction(new l2.k(v10_2, v4, v3_1, 0)).start();
                v0++;
            }
        } else {
            if ((p10 != 1) && (p10 != 2)) {
                return;
            }
            while (v0 < p9.getChildCount()) {
                android.view.ViewPropertyAnimator v10_6 = p9.getChildAt(v0);
                v10_6.animate().cancel();
                v10_6.setTranslationX(0);
                v10_6.setTranslationY(0);
                v0++;
            }
        }
        return;
    }
}
