package okhttp3;
public final class MediaType {
    public static final okhttp3.MediaType$Companion e;
    public static final b8.h f;
    public static final b8.h g;
    public final String a;
    public final String b;
    public final String c;
    public final String[] d;

    static MediaType()
    {
        okhttp3.MediaType.e = new okhttp3.MediaType$Companion(0);
        okhttp3.MediaType.f = new b8.h("([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)");
        okhttp3.MediaType.g = new b8.h(";\\s*(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
        return;
    }

    public MediaType(String p2, String p3, String p4, String[] p5)
    {
        kotlin.jvm.internal.j.e(p2, "mediaType");
        kotlin.jvm.internal.j.e(p5, "parameterNamesAndValues");
        this.a = p2;
        this.b = p3;
        this.c = p4;
        this.d = p5;
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof okhttp3.MediaType)) || (!kotlin.jvm.internal.j.a(((okhttp3.MediaType) p2).a, this.a))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.a.hashCode();
    }

    public final String toString()
    {
        return this.a;
    }
}
