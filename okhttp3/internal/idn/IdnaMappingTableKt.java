package okhttp3.internal.idn;
public final class IdnaMappingTableKt {

    public static final int a(int p1, String p2)
    {
        kotlin.jvm.internal.j.e(p2, "<this>");
        return ((p2.charAt(p1) << 7) + p2.charAt((p1 + 1)));
    }
}
