package x8;
public class v extends x8.m {

    public final x8.u c(x8.y p4)
    {
        return new x8.u(new java.io.RandomAccessFile(p4.toFile(), "r"));
    }

    public final x8.h0 f(x8.y p3)
    {
        kotlin.jvm.internal.j.e(p3, "file");
        return new x8.t(new java.io.FileInputStream(p3.toFile()), x8.j0.d);
    }

    public String toString()
    {
        return "JvmSystemFileSystem";
    }
}
