package okhttp3.internal;
public final class Internal {

    public static final java.nio.charset.Charset a(okhttp3.MediaType p6)
    {
        java.nio.charset.Charset v1_0;
        if (p6 == null) {
            v1_0 = b8.a.a;
        } else {
            java.nio.charset.Charset v6_2;
            java.nio.charset.Charset v6_1 = p6.d;
            int v0_2 = c4.b.D(0, (v6_1.length - 1), 2);
            v1_0 = 0;
            if (v0_2 < 0) {
                v6_2 = 0;
            } else {
                int v3_0 = 0;
                while(true) {
                    boolean v4_1;
                    boolean v4_0 = v6_1[v3_0];
                    if (v4_0) {
                        v4_1 = v4_0.equalsIgnoreCase("charset");
                    } else {
                        v4_1 = 0;
                    }
                    if (!v4_1) {
                        if (v3_0 == v0_2) {
                            break;
                        }
                        v3_0 += 2;
                    } else {
                        v6_2 = v6_1[(v3_0 + 1)];
                    }
                }
            }
            try {
                if (v6_2 != null) {
                    v1_0 = java.nio.charset.Charset.forName(v6_2);
                }
            } catch (IllegalArgumentException) {
            }
            if (v1_0 == null) {
            }
        }
        return v1_0;
    }
}
