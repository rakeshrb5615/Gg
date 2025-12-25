package d6;
public final class j {
    public static final long b;
    public static final java.util.regex.Pattern c;
    public static d6.j d;
    public final v3.f a;

    static j()
    {
        d6.j.b = java.util.concurrent.TimeUnit.HOURS.toSeconds(1);
        d6.j.c = java.util.regex.Pattern.compile("\\AA[\\w-]{38}\\z");
        return;
    }

    public j(v3.f p1)
    {
        this.a = p1;
        return;
    }

    public final boolean a(e6.b p7)
    {
        if (!android.text.TextUtils.isEmpty(p7.c)) {
            long v0_3 = (p7.f + p7.e);
            this.a.getClass();
            if (v0_3 >= (java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) + d6.j.b)) {
                return 0;
            }
        }
        return 1;
    }
}
