package h;
public abstract class w {

    public static android.window.OnBackInvokedDispatcher a(android.app.Activity p0)
    {
        return p0.getOnBackInvokedDispatcher();
    }

    public static android.window.OnBackInvokedCallback b(Object p2, h.c0 p3)
    {
        java.util.Objects.requireNonNull(p3);
        h.v v0_1 = new h.v(p3, 0);
        a5.t.d(p2).registerOnBackInvokedCallback(1000000, v0_1);
        return v0_1;
    }

    public static void c(Object p0, Object p1)
    {
        a5.t.d(p0).unregisterOnBackInvokedCallback(((android.window.OnBackInvokedCallback) p1));
        return;
    }
}
