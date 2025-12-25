package h;
public abstract class u {

    public static void a(android.content.res.Configuration p1, android.content.res.Configuration p2, android.content.res.Configuration p3)
    {
        java.util.Locale v1_1 = p1.getLocales();
        android.os.LocaleList v0 = p2.getLocales();
        if (!v1_1.equals(v0)) {
            p3.setLocales(v0);
            p3.locale = p2.locale;
        }
        return;
    }

    public static m0.h b(android.content.res.Configuration p0)
    {
        return m0.h.a(p0.getLocales().toLanguageTags());
    }

    public static void c(m0.h p0)
    {
        android.os.LocaleList.setDefault(android.os.LocaleList.forLanguageTags(p0.a.a.toLanguageTags()));
        return;
    }

    public static void d(android.content.res.Configuration p0, m0.h p1)
    {
        p0.setLocales(android.os.LocaleList.forLanguageTags(p1.a.a.toLanguageTags()));
        return;
    }
}
