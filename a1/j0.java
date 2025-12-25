package a1;
public final class j0 extends kotlin.jvm.internal.k implements u7.l {
    public static final a1.j0 a;

    static j0()
    {
        a1.j0.a = new a1.j0(1);
        return;
    }

    public final Object invoke(Object p2)
    {
        kotlin.jvm.internal.j.e(((java.io.File) p2), "it");
        String v2_3 = ((java.io.File) p2).getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.j.d(v2_3, "file.canonicalFile.absolutePath");
        return new a1.k1(v2_3);
    }
}
