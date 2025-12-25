package q0;
public abstract class n0 {

    public static android.view.WindowInsets a(android.view.View p0, android.view.WindowInsets p1)
    {
        return p0.dispatchApplyWindowInsets(p1);
    }

    public static CharSequence b(android.view.View p0)
    {
        return p0.getStateDescription();
    }

    public static void c(android.view.View p0, CharSequence p1)
    {
        p0.setStateDescription(p1);
        return;
    }
}
