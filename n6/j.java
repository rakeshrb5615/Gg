package n6;
public final class j {
    public static final java.util.regex.Pattern e;
    public static final java.util.regex.Pattern f;
    public final java.util.HashSet a;
    public final java.util.concurrent.Executor b;
    public final n6.d c;
    public final n6.d d;

    static j()
    {
        java.nio.charset.Charset.forName("UTF-8");
        n6.j.e = java.util.regex.Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        n6.j.f = java.util.regex.Pattern.compile("^(0|false|f|no|n|off|)$", 2);
        return;
    }

    public j(java.util.concurrent.Executor p2, n6.d p3, n6.d p4)
    {
        this.a = new java.util.HashSet();
        this.b = p2;
        this.c = p3;
        this.d = p4;
        return;
    }

    public static String b(n6.d p0, String p1)
    {
        int v0_1 = p0.c();
        try {
            if (v0_1 != 0) {
                return v0_1.b.getString(p1);
            } else {
                return 0;
            }
        } catch (org.json.JSONException) {
            return 0;
        }
    }

    public static void c(String p2, String p3)
    {
        StringBuilder v0_1 = new StringBuilder("No value of type \'");
        v0_1.append(p3);
        v0_1.append("\' exists for parameter key \'");
        v0_1.append(p2);
        v0_1.append("\'.");
        android.util.Log.w("FirebaseRemoteConfig", v0_1.toString());
        return;
    }

    public final void a(String p7, n6.f p8)
    {
        if (p8 != null) {
            java.util.Iterator v1_1 = this.a.iterator();
            while (v1_1.hasNext()) {
                this.b.execute(new androidx.fragment.app.l(((com.google.android.gms.common.util.BiConsumer) v1_1.next()), p7, p8, 5));
            }
            return;
        } else {
            return;
        }
    }
}
