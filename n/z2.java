package n;
public abstract class z2 {

    public static android.window.OnBackInvokedDispatcher a(android.view.View p0)
    {
        return p0.findOnBackInvokedDispatcher();
    }

    public static android.window.OnBackInvokedCallback b(Runnable p2)
    {
        java.util.Objects.requireNonNull(p2);
        return new h.v(p2, 1);
    }

    public static void c(Object p1, Object p2)
    {
        ((android.window.OnBackInvokedDispatcher) p1).registerOnBackInvokedCallback(1000000, ((android.window.OnBackInvokedCallback) p2));
        return;
    }

    public static void d(Object p0, Object p1)
    {
        ((android.window.OnBackInvokedDispatcher) p0).unregisterOnBackInvokedCallback(((android.window.OnBackInvokedCallback) p1));
        return;
    }
}
