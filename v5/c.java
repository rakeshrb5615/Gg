package v5;
public final class c implements t5.f {
    public static final java.text.SimpleDateFormat a;

    static c()
    {
        java.text.SimpleDateFormat v0_1 = new java.text.SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'", java.util.Locale.US);
        v5.c.a = v0_1;
        v0_1.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return;
    }

    public final void a(Object p2, Object p3)
    {
        ((t5.g) p3).e(v5.c.a.format(((java.util.Date) p2)));
        return;
    }
}
