package r0;
public final class d extends android.view.accessibility.AccessibilityNodeProvider {
    public final j6.o a;

    public d(j6.o p1)
    {
        this.a = p1;
        return;
    }

    public final void addExtraDataToAccessibilityNodeInfo(int p1, android.view.accessibility.AccessibilityNodeInfo p2, String p3, android.os.Bundle p4)
    {
        this.a.getClass();
        return;
    }

    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int p2)
    {
        android.view.accessibility.AccessibilityNodeInfo v2_1 = this.a.p(p2);
        if (v2_1 != null) {
            return v2_1.a;
        } else {
            return 0;
        }
    }

    public final java.util.List findAccessibilityNodeInfosByText(String p1, int p2)
    {
        this.a.getClass();
        return 0;
    }

    public final android.view.accessibility.AccessibilityNodeInfo findFocus(int p2)
    {
        android.view.accessibility.AccessibilityNodeInfo v2_1 = this.a.r(p2);
        if (v2_1 != null) {
            return v2_1.a;
        } else {
            return 0;
        }
    }

    public final boolean performAction(int p2, int p3, android.os.Bundle p4)
    {
        return this.a.F(p2, p3, p4);
    }
}
