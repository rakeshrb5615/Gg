package l7;
public final class i implements l7.h, java.io.Serializable {
    public static final l7.i a;

    static i()
    {
        l7.i.a = new l7.i();
        return;
    }

    public final Object fold(Object p1, u7.p p2)
    {
        return p1;
    }

    public final l7.f get(l7.g p2)
    {
        kotlin.jvm.internal.j.e(p2, "key");
        return 0;
    }

    public final int hashCode()
    {
        return 0;
    }

    public final l7.h minusKey(l7.g p2)
    {
        kotlin.jvm.internal.j.e(p2, "key");
        return this;
    }

    public final l7.h plus(l7.h p2)
    {
        kotlin.jvm.internal.j.e(p2, "context");
        return p2;
    }

    public final String toString()
    {
        return "EmptyCoroutineContext";
    }
}
