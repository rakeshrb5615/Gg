package q0;
public abstract class g0 {

    public static android.view.WindowInsets a(android.view.View p1, android.view.WindowInsets p2)
    {
        return p1.dispatchApplyWindowInsets(p2);
    }

    public static android.view.WindowInsets b(android.view.View p0, android.view.WindowInsets p1)
    {
        return p0.onApplyWindowInsets(p1);
    }

    public static void c(android.view.View p0)
    {
        p0.requestApplyInsets();
        return;
    }
}
