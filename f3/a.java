package f3;
public final synthetic class a implements android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener {
    public final synthetic int a;
    public final synthetic android.view.View b;
    public final synthetic b0.a c;

    public synthetic a(b0.a p1, android.view.View p2, int p3)
    {
        this.a = p3;
        this.c = p1;
        this.b = p2;
        return;
    }

    public final void onTouchExplorationStateChanged(boolean p3)
    {
        switch (this.a) {
            case 0:
                com.google.android.material.behavior.HideBottomViewOnScrollBehavior v0_4 = ((com.google.android.material.behavior.HideBottomViewOnScrollBehavior) this.c);
                if ((p3 != null) && (v0_4.j == 1)) {
                    v0_4.v(this.b);
                }
                return;
            default:
                com.google.android.material.behavior.HideBottomViewOnScrollBehavior v0_2 = ((com.google.android.material.behavior.HideViewOnScrollBehavior) this.c);
                if ((p3 != null) && (v0_2.j == 1)) {
                    v0_2.w(this.b);
                }
                return;
        }
    }
}
