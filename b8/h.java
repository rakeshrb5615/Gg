package b8;
public final class h implements java.io.Serializable {
    public final java.util.regex.Pattern a;

    public h(String p2)
    {
        java.util.regex.Pattern v2_1 = java.util.regex.Pattern.compile(p2);
        kotlin.jvm.internal.j.d(v2_1, "compile(...)");
        this.a = v2_1;
        return;
    }

    public final b8.g a(int p3, String p4)
    {
        kotlin.jvm.internal.j.e(p4, "input");
        int v3_1 = this.a.matcher(p4).useAnchoringBounds(0).useTransparentBounds(1).region(p3, p4.length());
        if (!v3_1.lookingAt()) {
            return 0;
        } else {
            return new b8.g(v3_1, p4);
        }
    }

    public final String b(String p2)
    {
        kotlin.jvm.internal.j.e(p2, "input");
        String v2_2 = this.a.matcher(p2).replaceAll("");
        kotlin.jvm.internal.j.d(v2_2, "replaceAll(...)");
        return v2_2;
    }

    public final String toString()
    {
        String v0_1 = this.a.toString();
        kotlin.jvm.internal.j.d(v0_1, "toString(...)");
        return v0_1;
    }
}
