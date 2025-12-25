package okhttp3.internal.publicsuffix;
public final class AssetPublicSuffixList extends okhttp3.internal.publicsuffix.BasePublicSuffixList {
    public static final String h;
    public final String g;

    static AssetPublicSuffixList()
    {
        new okhttp3.internal.publicsuffix.AssetPublicSuffixList$Companion(0);
        okhttp3.internal.publicsuffix.AssetPublicSuffixList.h = "PublicSuffixDatabase.list";
        return;
    }

    public AssetPublicSuffixList()
    {
        this(0);
        return;
    }

    public AssetPublicSuffixList(int p2)
    {
        String v0 = okhttp3.internal.publicsuffix.AssetPublicSuffixList.h;
        kotlin.jvm.internal.j.e(v0, "path");
        this.g = v0;
        return;
    }

    public final x8.h0 b()
    {
        java.io.IOException v0_11;
        okhttp3.internal.platform.PlatformRegistry.a.getClass();
        okhttp3.internal.platform.Platform.a.getClass();
        java.io.IOException v0_10 = okhttp3.internal.platform.Platform.b;
        String v1_0 = 0;
        if (v0_10 == null) {
            v0_11 = 0;
        } else {
            v0_11 = ((okhttp3.internal.platform.ContextAwarePlatform) v0_10);
        }
        java.io.IOException v0_1;
        if (v0_11 == null) {
            v0_1 = 0;
        } else {
            v0_1 = v0_11.b();
        }
        if (v0_1 != null) {
            v1_0 = v0_1.getAssets();
        }
        if (v1_0 != null) {
            java.io.IOException v0_3 = v1_0.open(this.g);
            kotlin.jvm.internal.j.d(v0_3, "open(...)");
            return new x8.t(v0_3, new x8.j0());
        } else {
            if (android.os.Build.FINGERPRINT != null) {
                throw new java.io.IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
            } else {
                throw new java.io.IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
        }
    }
}
