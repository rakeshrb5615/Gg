package m0;
public abstract class a {
    public static final synthetic int a;

    static a()
    {
        int v0_0 = android.os.Build$VERSION.SDK_INT;
        if (v0_0 >= 30) {
            e0.b.e(30);
        }
        if (v0_0 >= 30) {
            e0.b.e(31);
        }
        if (v0_0 >= 30) {
            e0.b.e(33);
        }
        if (v0_0 >= 30) {
            e0.b.e(1000000);
        }
        return;
    }

    public static final boolean a(String p9)
    {
        String v0_0 = android.os.Build$VERSION.CODENAME;
        int v2 = Integer.valueOf(0);
        kotlin.jvm.internal.j.e(v0_0, "buildCodename");
        if (!"REL".equals(v0_0)) {
            int v4_2;
            java.util.Locale v3_0 = java.util.Locale.ROOT;
            int v4_0 = v0_0.toUpperCase(v3_0);
            kotlin.jvm.internal.j.d(v4_0, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (!v4_0.equals("BAKLAVA")) {
                v4_2 = 0;
            } else {
                v4_2 = v2;
            }
            String v8 = p9.toUpperCase(v3_0);
            kotlin.jvm.internal.j.d(v8, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (!v8.equals("BAKLAVA")) {
                v2 = 0;
            }
            if ((v4_2 == 0) || (v2 == 0)) {
                if ((v4_2 != 0) || (v2 != 0)) {
                    if (v4_2 == 0) {
                        return 0;
                    }
                } else {
                    String v0_1 = v0_0.toUpperCase(v3_0);
                    kotlin.jvm.internal.j.d(v0_1, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    int v9_1 = p9.toUpperCase(v3_0);
                    kotlin.jvm.internal.j.d(v9_1, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (v0_1.compareTo(v9_1) < 0) {
                        return 0;
                    }
                }
            } else {
                if (v4_2.intValue() < v2.intValue()) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }
}
