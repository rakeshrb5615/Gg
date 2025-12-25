package k8;
public final class e extends k8.h {
    public static final k8.e d;

    static e()
    {
        k8.e v0_1 = new k8.e();
        v0_1.c = new k8.c(k8.k.c, k8.k.d, k8.k.e, k8.k.a);
        k8.e.d = v0_1;
        return;
    }

    public final void close()
    {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final String toString()
    {
        return "Dispatchers.Default";
    }
}
