package e0;
public abstract class b {

    public static android.content.Context a(android.content.Context p0, String p1)
    {
        return p0.createAttributionContext(p1);
    }

    public static android.graphics.drawable.Icon b(android.net.Uri p0)
    {
        return android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(p0);
    }

    public static String c(android.content.Context p0)
    {
        return p0.getAttributionTag();
    }

    public static android.view.Display d(android.content.Context p2)
    {
        try {
            android.view.Display v2_1 = p2.getDisplay();
            return v2_1;
        } catch (UnsupportedOperationException) {
            int v0_4 = new StringBuilder("The context:");
            v0_4.append(v2_1);
            v0_4.append(" is not associated with any display. Return a fallback display instead.");
            android.util.Log.w("ContextCompat", v0_4.toString());
            return ((android.hardware.display.DisplayManager) v2_1.getSystemService(android.hardware.display.DisplayManager)).getDisplay(0);
        }
    }

    public static void e(int p0)
    {
        android.os.ext.SdkExtensions.getExtensionVersion(p0);
        return;
    }

    public static CharSequence f(android.view.accessibility.AccessibilityNodeInfo p0)
    {
        return p0.getStateDescription();
    }

    public static void g(android.view.Window p2, boolean p3)
    {
        int v1_1;
        android.view.View v0 = p2.getDecorView();
        int v1_0 = v0.getSystemUiVisibility();
        if (!p3) {
            v1_1 = (v1_0 | 256);
        } else {
            v1_1 = (v1_0 & -257);
        }
        v0.setSystemUiVisibility(v1_1);
        p2.setDecorFitsSystemWindows(p3);
        return;
    }

    public static void h(android.view.Window p0, boolean p1)
    {
        p0.setDecorFitsSystemWindows(p1);
        return;
    }

    public static void i(android.view.inputmethod.EditorInfo p1, CharSequence p2)
    {
        p1.setInitialSurroundingSubText(p2, 0);
        return;
    }

    public static void j(android.view.accessibility.AccessibilityNodeInfo p0, CharSequence p1)
    {
        p0.setStateDescription(p1);
        return;
    }
}
