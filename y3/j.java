package y3;
public final class j extends y3.h {
    public static final int[] C;
    public final android.view.accessibility.AccessibilityManager A;
    public boolean B;

    static j()
    {
        y3.j.C = new int[] {2130969755, 2130969757});
        return;
    }

    public j(android.content.Context p1, android.view.ViewGroup p2, com.google.android.material.snackbar.SnackbarContentLayout p3, com.google.android.material.snackbar.SnackbarContentLayout p4)
    {
        super(p1, p2, p3, p4);
        super.A = ((android.view.accessibility.AccessibilityManager) p2.getContext().getSystemService("accessibility"));
        return;
    }

    public final int g()
    {
        int v0_0 = this.k;
        if (v0_0 != -2) {
            android.view.accessibility.AccessibilityManager v4 = this.A;
            if (android.os.Build$VERSION.SDK_INT < 29) {
                if ((!this.B) || (!v4.isTouchExplorationEnabled())) {
                    return v0_0;
                }
            } else {
                int v1_2;
                if (!this.B) {
                    v1_2 = 0;
                } else {
                    v1_2 = 4;
                }
                return v4.getRecommendedTimeoutMillis(v0_0, (v1_2 | 3));
            }
        }
        return -2;
    }
}
