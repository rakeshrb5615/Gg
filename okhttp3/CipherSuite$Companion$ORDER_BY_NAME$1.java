package okhttp3;
public final class CipherSuite$Companion$ORDER_BY_NAME$1 implements java.util.Comparator {

    public CipherSuite$Companion$ORDER_BY_NAME$1()
    {
        return;
    }

    public final int compare(Object p5, Object p6)
    {
        kotlin.jvm.internal.j.e(((String) p5), "a");
        kotlin.jvm.internal.j.e(((String) p6), "b");
        int v0_0 = Math.min(((String) p5).length(), ((String) p6).length());
        int v1_0 = 4;
        while (v1_0 < v0_0) {
            char v2 = ((String) p5).charAt(v1_0);
            char v3 = ((String) p6).charAt(v1_0);
            if (v2 == v3) {
                v1_0++;
            } else {
                if (kotlin.jvm.internal.j.f(v2, v3) < 0) {
                    return -1;
                }
            }
            return 1;
        }
        int v5_2 = ((String) p5).length();
        int v6_2 = ((String) p6).length();
        if (v5_2 == v6_2) {
            return 0;
        } else {
            if (v5_2 < v6_2) {
                return -1;
            }
        }
        return 1;
    }
}
