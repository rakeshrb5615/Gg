package q0;
public abstract class l0 {

    public static CharSequence a(android.view.View p0)
    {
        return p0.getAccessibilityPaneTitle();
    }

    public static boolean b(android.view.View p0)
    {
        return p0.isAccessibilityHeading();
    }

    public static boolean c(android.view.View p0)
    {
        return p0.isScreenReaderFocusable();
    }

    public static void d(android.view.View p0, boolean p1)
    {
        p0.setAccessibilityHeading(p1);
        return;
    }

    public static void e(android.view.View p0, CharSequence p1)
    {
        p0.setAccessibilityPaneTitle(p1);
        return;
    }

    public static void f(android.view.View p0, boolean p1)
    {
        p0.setScreenReaderFocusable(p1);
        return;
    }
}
