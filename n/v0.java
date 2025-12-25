package n;
public abstract class v0 {

    public static int a(android.widget.TextView p0)
    {
        return p0.getAutoSizeStepGranularity();
    }

    public static void b(android.widget.TextView p0, int p1, int p2, int p3, int p4)
    {
        p0.setAutoSizeTextTypeUniformWithConfiguration(p1, p2, p3, p4);
        return;
    }

    public static void c(android.widget.TextView p0, int[] p1, int p2)
    {
        p0.setAutoSizeTextTypeUniformWithPresetSizes(p1, p2);
        return;
    }

    public static boolean d(android.widget.TextView p0, String p1)
    {
        return p0.setFontVariationSettings(p1);
    }
}
