package kotlin.jvm.internal;
public final class t {

    public static String a(kotlin.jvm.internal.g p1)
    {
        String v1_2 = p1.getClass().getGenericInterfaces()[0].toString();
        if (v1_2.startsWith("kotlin.jvm.functions.")) {
            v1_2 = v1_2.substring(21);
        }
        return v1_2;
    }
}
