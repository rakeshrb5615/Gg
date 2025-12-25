package n7;
public final class b implements l7.c {
    public static final n7.b a;

    static b()
    {
        n7.b.a = new n7.b();
        return;
    }

    public final l7.h getContext()
    {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final void resumeWith(Object p2)
    {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString()
    {
        return "This continuation is already complete";
    }
}
