package n;
public abstract class u0 {

    public static android.os.LocaleList a(String p0)
    {
        return android.os.LocaleList.forLanguageTags(p0);
    }

    public static void b(android.widget.TextView p0, android.os.LocaleList p1)
    {
        p0.setTextLocales(p1);
        return;
    }
}
