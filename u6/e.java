package u6;
public final class e {
    public final r6.b a;
    public final l7.h b;

    public e(r6.b p2, l7.h p3)
    {
        kotlin.jvm.internal.j.e(p2, "appInfo");
        kotlin.jvm.internal.j.e(p3, "blockingDispatcher");
        this.a = p2;
        this.b = p3;
        return;
    }

    public static final java.net.URL a(u6.e p3)
    {
        p3.getClass();
        String v3_1 = p3.a;
        String v3_2 = v3_1.b;
        return new java.net.URL(new android.net.Uri$Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(v3_1.a).appendPath("settings").appendQueryParameter("build_version", v3_2.c).appendQueryParameter("display_version", v3_2.b).build().toString());
    }
}
