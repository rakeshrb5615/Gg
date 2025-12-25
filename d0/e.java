package d0;
public abstract class e {

    public static String a(android.content.Context p0)
    {
        return p0.getOpPackageName();
    }

    public static void b(android.app.Notification$Builder p0, boolean p1)
    {
        p0.setAllowSystemGeneratedContextualActions(p1);
        return;
    }

    public static void c(android.app.Notification$Builder p1)
    {
        p1.setBubbleMetadata(0);
        return;
    }

    public static void d(android.app.Notification$Action$Builder p1)
    {
        p1.setContextual(0);
        return;
    }
}
