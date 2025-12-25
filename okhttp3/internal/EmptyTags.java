package okhttp3.internal;
public final class EmptyTags extends okhttp3.internal.Tags {
    public static final okhttp3.internal.EmptyTags a;

    static EmptyTags()
    {
        okhttp3.internal.EmptyTags.a = new okhttp3.internal.EmptyTags();
        return;
    }

    private EmptyTags()
    {
        super(0);
        return;
    }

    public final Object a(kotlin.jvm.internal.e p1)
    {
        return 0;
    }

    public final okhttp3.internal.Tags b(kotlin.jvm.internal.e p2, Object p3)
    {
        if (p3 == null) {
            return this;
        } else {
            return new okhttp3.internal.LinkedTags(p2, p3, this);
        }
    }

    public final String toString()
    {
        return "{}";
    }
}
