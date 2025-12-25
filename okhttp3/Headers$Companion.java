package okhttp3;
public final class Headers$Companion {

    private Headers$Companion()
    {
        return;
    }

    public synthetic Headers$Companion(int p1)
    {
        return;
    }

    public static varargs okhttp3.Headers a(String[] p6)
    {
        okhttp3.Headers v6_7 = ((String[]) java.util.Arrays.copyOf(p6, p6.length));
        kotlin.jvm.internal.j.e(v6_7, "inputNamesAndValues");
        if ((v6_7.length % 2) != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        } else {
            String v0_4 = ((String[]) java.util.Arrays.copyOf(v6_7, v6_7.length));
            String v2_0 = v0_4.length;
            int v3 = 0;
            int v4 = 0;
            while (v4 < v2_0) {
                if (v0_4[v4] == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                } else {
                    v0_4[v4] = b8.i.H0(v6_7[v4]).toString();
                    v4++;
                }
            }
            okhttp3.Headers v6_6 = c4.b.D(0, (v0_4.length - 1), 2);
            if (v6_6 >= null) {
                while(true) {
                    String v1_0 = v0_4[v3];
                    String v2_2 = v0_4[(v3 + 1)];
                    okhttp3.internal._HeadersCommonKt.b(v1_0);
                    okhttp3.internal._HeadersCommonKt.c(v2_2, v1_0);
                    if (v3 == v6_6) {
                        break;
                    }
                    v3 += 2;
                }
            }
            return new okhttp3.Headers(v0_4);
        }
    }
}
