package e0;
public abstract class a {

    public static android.os.Handler a(android.os.Looper p0)
    {
        return android.os.Handler.createAsync(p0);
    }

    public static android.graphics.Bitmap b(android.graphics.Picture p0)
    {
        return android.graphics.Bitmap.createBitmap(p0);
    }

    public static String[] c(android.icu.text.DecimalFormatSymbols p0)
    {
        return p0.getDigitStrings();
    }

    public static long d(android.content.pm.PackageInfo p2)
    {
        return p2.getLongVersionCode();
    }

    public static java.util.concurrent.Executor e(android.content.Context p0)
    {
        return p0.getMainExecutor();
    }

    public static int f(Object p0)
    {
        return ((android.graphics.drawable.Icon) p0).getResId();
    }

    public static String g(Object p0)
    {
        return ((android.graphics.drawable.Icon) p0).getResPackage();
    }

    public static int h(android.view.DisplayCutout p0)
    {
        return p0.getSafeInsetBottom();
    }

    public static int i(android.view.DisplayCutout p0)
    {
        return p0.getSafeInsetLeft();
    }

    public static int j(android.view.DisplayCutout p0)
    {
        return p0.getSafeInsetRight();
    }

    public static int k(android.view.DisplayCutout p0)
    {
        return p0.getSafeInsetTop();
    }

    public static android.text.PrecomputedText$Params l(n.b1 p0)
    {
        return p0.getTextMetricsParams();
    }

    public static int m(Object p0)
    {
        return ((android.graphics.drawable.Icon) p0).getType();
    }

    public static android.net.Uri n(Object p0)
    {
        return ((android.graphics.drawable.Icon) p0).getUri();
    }

    public static void o(int p0, android.widget.TextView p1)
    {
        p1.setFirstBaselineToTopHeight(p0);
        return;
    }

    public static boolean p(android.view.ViewConfiguration p0)
    {
        return p0.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
