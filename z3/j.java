package z3;
public final synthetic class j implements android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener {
    public final synthetic z3.k a;

    public synthetic j(z3.k p1)
    {
        this.a = p1;
        return;
    }

    public final void onTouchExplorationStateChanged(boolean p3)
    {
        com.google.android.material.internal.CheckableImageButton v0_0 = this.a;
        int v1_0 = v0_0.h;
        if (v1_0 != 0) {
            if (v1_0.getInputType() == 0) {
                int v3_1;
                if (p3 == 0) {
                    v3_1 = 1;
                } else {
                    v3_1 = 2;
                }
                v0_0.d.setImportantForAccessibility(v3_1);
            } else {
                return;
            }
        }
        return;
    }
}
