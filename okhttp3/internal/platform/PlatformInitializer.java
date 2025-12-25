package okhttp3.internal.platform;
public final class PlatformInitializer implements d2.b {

    public PlatformInitializer()
    {
        return;
    }

    public final java.util.List a()
    {
        return i7.n.a;
    }

    public final Object b(android.content.Context p2)
    {
        int v0_4;
        kotlin.jvm.internal.j.e(p2, "context");
        okhttp3.internal.platform.PlatformRegistry.a.getClass();
        okhttp3.internal.platform.Platform.a.getClass();
        int v0_3 = okhttp3.internal.platform.Platform.b;
        if (v0_3 == 0) {
            v0_4 = 0;
        } else {
            v0_4 = ((okhttp3.internal.platform.ContextAwarePlatform) v0_3);
        }
        if (v0_4 != 0) {
            v0_4.a(p2);
        }
        return okhttp3.internal.platform.Platform.b;
    }
}
