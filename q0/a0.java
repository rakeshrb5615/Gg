package q0;
public abstract class a0 {

    public static android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction a()
    {
        return android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(android.view.VelocityTracker p0, int p1)
    {
        return p0.getAxisVelocity(p1);
    }

    public static void c(android.view.accessibility.AccessibilityNodeInfo p0, android.graphics.Rect p1)
    {
        p0.getBoundsInWindow(p1);
        return;
    }

    public static CharSequence d(android.view.accessibility.AccessibilityNodeInfo p0)
    {
        return p0.getContainerTitle();
    }

    public static int e(android.view.ViewConfiguration p0, int p1, int p2, int p3)
    {
        return p0.getScaledMaximumFlingVelocity(p1, p2, p3);
    }

    public static int f(android.view.ViewConfiguration p0, int p1, int p2, int p3)
    {
        return p0.getScaledMinimumFlingVelocity(p1, p2, p3);
    }

    public static boolean g(android.view.accessibility.AccessibilityNodeInfo p0)
    {
        return p0.isAccessibilityDataSensitive();
    }

    public static void h(android.widget.TextView p0, int p1, float p2)
    {
        p0.setLineHeight(p1, p2);
        return;
    }
}
