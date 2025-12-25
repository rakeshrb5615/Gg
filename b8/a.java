package b8;
public abstract class a {
    public static final java.nio.charset.Charset a;
    public static final java.nio.charset.Charset b;
    public static final java.nio.charset.Charset c;
    public static final java.nio.charset.Charset d;
    public static volatile java.nio.charset.Charset e;
    public static volatile java.nio.charset.Charset f;

    static a()
    {
        java.nio.charset.Charset v0_5 = java.nio.charset.Charset.forName("UTF-8");
        kotlin.jvm.internal.j.d(v0_5, "forName(...)");
        b8.a.a = v0_5;
        kotlin.jvm.internal.j.d(java.nio.charset.Charset.forName("UTF-16"), "forName(...)");
        java.nio.charset.Charset v0_2 = java.nio.charset.Charset.forName("UTF-16BE");
        kotlin.jvm.internal.j.d(v0_2, "forName(...)");
        b8.a.b = v0_2;
        java.nio.charset.Charset v0_4 = java.nio.charset.Charset.forName("UTF-16LE");
        kotlin.jvm.internal.j.d(v0_4, "forName(...)");
        b8.a.c = v0_4;
        kotlin.jvm.internal.j.d(java.nio.charset.Charset.forName("US-ASCII"), "forName(...)");
        java.nio.charset.Charset v0_9 = java.nio.charset.Charset.forName("ISO-8859-1");
        kotlin.jvm.internal.j.d(v0_9, "forName(...)");
        b8.a.d = v0_9;
        return;
    }
}
