package okhttp3.internal.platform;
public final class Platform$Companion {

    private Platform$Companion()
    {
        return;
    }

    public synthetic Platform$Companion(int p1)
    {
        return;
    }

    public static java.util.ArrayList a(java.util.List p4)
    {
        kotlin.jvm.internal.j.e(p4, "protocols");
        java.util.ArrayList v0_2 = new java.util.ArrayList();
        java.util.ArrayList v4_2 = p4.iterator();
        while (v4_2.hasNext()) {
            int v1_3 = v4_2.next();
            if (((okhttp3.Protocol) v1_3) != okhttp3.Protocol.c) {
                v0_2.add(v1_3);
            }
        }
        java.util.ArrayList v4_1 = new java.util.ArrayList(i7.j.X(v0_2, 10));
        int v1_2 = v0_2.size();
        int v2_0 = 0;
        while (v2_0 < v1_2) {
            String v3_0 = v0_2.get(v2_0);
            v2_0++;
            v4_1.add(((okhttp3.Protocol) v3_0).a);
        }
        return v4_1;
    }

    public static byte[] b(java.util.List p5)
    {
        kotlin.jvm.internal.j.e(p5, "protocols");
        x8.g v0_2 = new x8.g();
        byte[] v5_2 = okhttp3.internal.platform.Platform$Companion.a(p5);
        long v1_1 = v5_2.size();
        int v2 = 0;
        while (v2 < v1_1) {
            String v3_0 = v5_2.get(v2);
            v2++;
            String v3_1 = ((String) v3_0);
            v0_2.M(v3_1.length());
            v0_2.S(v3_1);
        }
        return v0_2.D(v0_2.b);
    }
}
