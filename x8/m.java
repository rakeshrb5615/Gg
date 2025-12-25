package x8;
public abstract class m implements java.io.Closeable {
    public static final x8.v a;
    public static final y8.h b;

    static m()
    {
        try {
            Class.forName("java.nio.file.Files");
            y8.h v0_5 = new x8.w();
        } catch (ClassNotFoundException) {
            v0_5 = new x8.v();
        }
        x8.m.a = v0_5;
        y8.h v0_1 = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.j.d(v0_1, "getProperty(...)");
        a6.e.d(v0_1);
        ClassLoader v1_2 = y8.h.getClassLoader();
        kotlin.jvm.internal.j.d(v1_2, "getClassLoader(...)");
        x8.m.b = new y8.h(v1_2);
        return;
    }

    public abstract x8.u c();

    public void close()
    {
        return;
    }

    public abstract x8.h0 f();
}
