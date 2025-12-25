package h;
public abstract class m {

    public static android.os.LocaleList a(Object p0)
    {
        return ((android.app.LocaleManager) p0).getApplicationLocales();
    }

    public static void b(Object p0, android.os.LocaleList p1)
    {
        ((android.app.LocaleManager) p0).setApplicationLocales(p1);
        return;
    }
}
