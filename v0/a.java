package v0;
public abstract class a {
    public static final java.util.Set a;

    static a()
    {
        java.util.Set v1_0;
        String v0_4 = new Integer[] {Integer.valueOf(7), Integer.valueOf(20)});
        java.util.Set v1_4 = v0_4.length;
        if (v1_4 == null) {
            v1_0 = i7.p.a;
        } else {
            int v2 = 0;
            if (v1_4 == 1) {
                v1_0 = java.util.Collections.singleton(v0_4[0]);
                kotlin.jvm.internal.j.d(v1_0, "singleton(...)");
            } else {
                v1_0 = new java.util.LinkedHashSet(i7.r.l0(v0_4.length));
                int v3_3 = v0_4.length;
                while (v2 < v3_3) {
                    v1_0.add(v0_4[v2]);
                    v2++;
                }
            }
        }
        v0.a.a = v1_0;
        return;
    }
}
