package okhttp3.internal.publicsuffix;
public final class ResourcePublicSuffixList extends okhttp3.internal.publicsuffix.BasePublicSuffixList {
    public static final x8.y i;
    public final x8.y g;
    public final x8.m h;

    static ResourcePublicSuffixList()
    {
        new okhttp3.internal.publicsuffix.ResourcePublicSuffixList$Companion(0);
        okhttp3.internal.publicsuffix.ResourcePublicSuffixList.i = a6.e.d("okhttp3/internal/publicsuffix/PublicSuffixDatabase.list");
        return;
    }

    public ResourcePublicSuffixList()
    {
        y8.h v0 = x8.m.b;
        x8.y v2 = okhttp3.internal.publicsuffix.ResourcePublicSuffixList.i;
        kotlin.jvm.internal.j.e(v2, "path");
        kotlin.jvm.internal.j.e(v0, "fileSystem");
        this.g = v2;
        this.h = v0;
        return;
    }

    public final x8.h0 b()
    {
        return this.h.f(this.g);
    }
}
