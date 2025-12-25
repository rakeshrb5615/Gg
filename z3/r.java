package z3;
public final class r extends android.view.View$AccessibilityDelegate {
    public final synthetic z3.s a;

    public r(z3.s p1)
    {
        this.a = p1;
        return;
    }

    public final void onInitializeAccessibilityNodeInfo(android.view.View p1, android.view.accessibility.AccessibilityNodeInfo p2)
    {
        super.onInitializeAccessibilityNodeInfo(p1, p2);
        android.widget.EditText v1_3 = this.a.h.getEditText();
        if (v1_3 != null) {
            p2.setLabeledBy(v1_3);
        }
        return;
    }
}
