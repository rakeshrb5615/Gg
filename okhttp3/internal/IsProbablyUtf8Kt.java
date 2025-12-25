package okhttp3.internal;
public final class IsProbablyUtf8Kt {

    public static final boolean a(x8.g p10)
    {
        kotlin.jvm.internal.j.e(p10, "<this>");
        try {
            int v10_3 = x8.b.c(new x8.z(p10));
            long v2 = 0;
        } catch (java.io.EOFException) {
            return 0;
        }
        while (v2 < 16) {
            if (!v10_3.h()) {
                v10_3.o(1);
                boolean v6_0 = v10_3.b;
                long v7_0 = v6_0.A(0);
                if ((v7_0 & 224) != 192) {
                    if ((v7_0 & 240) != 224) {
                        if ((v7_0 & 248) == 240) {
                            v10_3.o(4);
                        }
                    } else {
                        v10_3.o(3);
                    }
                } else {
                    v10_3.o(2);
                }
                boolean v6_1 = v6_0.H();
                if ((!Character.isISOControl(v6_1)) || (Character.isWhitespace(v6_1))) {
                    v2++;
                }
            } else {
                break;
            }
        }
        return 1;
    }
}
