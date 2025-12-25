package okhttp3.internal;
public final class _HeadersCommonKt {

    public static final void a(okhttp3.Headers$Builder p1, String p2, String p3)
    {
        kotlin.jvm.internal.j.e(p1, "<this>");
        kotlin.jvm.internal.j.e(p2, "name");
        kotlin.jvm.internal.j.e(p3, "value");
        java.util.ArrayList v1_1 = p1.a;
        v1_1.add(p2);
        v1_1.add(b8.i.H0(p3).toString());
        return;
    }

    public static final void b(String p5)
    {
        kotlin.jvm.internal.j.e(p5, "name");
        if (p5.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        } else {
            IllegalArgumentException v0_1 = p5.length();
            String v1_0 = 0;
            while (v1_0 < v0_1) {
                String v2_0 = p5.charAt(v1_0);
                if ((33 > v2_0) || (v2_0 >= 127)) {
                    IllegalArgumentException v0_3 = new StringBuilder("Unexpected char 0x");
                    a.a.j(16);
                    String v2_1 = Integer.toString(v2_0, 16);
                    kotlin.jvm.internal.j.d(v2_1, "toString(...)");
                    if (v2_1.length() < 2) {
                        v2_1 = "0".concat(v2_1);
                    }
                    v0_3.append(v2_1);
                    v0_3.append(" at ");
                    v0_3.append(v1_0);
                    v0_3.append(" in header name: ");
                    v0_3.append(p5);
                    throw new IllegalArgumentException(v0_3.toString().toString());
                } else {
                    v1_0++;
                }
            }
            return;
        }
    }

    public static final void c(String p5, String p6)
    {
        kotlin.jvm.internal.j.e(p5, "value");
        kotlin.jvm.internal.j.e(p6, "name");
        StringBuilder v0_4 = p5.length();
        String v1_2 = 0;
        while (v1_2 < v0_4) {
            String v2_0 = p5.charAt(v1_2);
            if ((v2_0 != 9) && ((32 > v2_0) || (v2_0 >= 127))) {
                StringBuilder v0_2 = new StringBuilder("Unexpected char 0x");
                a.a.j(16);
                String v2_1 = Integer.toString(v2_0, 16);
                kotlin.jvm.internal.j.d(v2_1, "toString(...)");
                if (v2_1.length() < 2) {
                    v2_1 = "0".concat(v2_1);
                }
                String v5_1;
                v0_2.append(v2_1);
                v0_2.append(" at ");
                v0_2.append(v1_2);
                v0_2.append(" in ");
                v0_2.append(p6);
                v0_2.append(" value");
                if (!okhttp3.internal._UtilCommonKt.j(p6)) {
                    v5_1 = ": ".concat(p5);
                } else {
                    v5_1 = "";
                }
                v0_2.append(v5_1);
                throw new IllegalArgumentException(v0_2.toString().toString());
            } else {
                v1_2++;
            }
        }
        return;
    }
}
