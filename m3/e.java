package m3;
public abstract class e {
    public static final int[] a;
    public static final java.util.Map b;
    public static final java.util.Map c;

    static e()
    {
        m3.e.a = new int[] {2130969046});
        java.util.Map v0_3 = new m3.a();
        java.util.HashMap v1_13 = new m3.b();
        String v2_3 = new java.util.HashMap();
        v2_3.put("fcnt", v0_3);
        v2_3.put("google", v0_3);
        v2_3.put("hmd global", v0_3);
        v2_3.put("infinix", v0_3);
        v2_3.put("infinix mobility limited", v0_3);
        v2_3.put("itel", v0_3);
        v2_3.put("kyocera", v0_3);
        v2_3.put("lenovo", v0_3);
        v2_3.put("lge", v0_3);
        v2_3.put("meizu", v0_3);
        v2_3.put("motorola", v0_3);
        v2_3.put("nothing", v0_3);
        v2_3.put("oneplus", v0_3);
        v2_3.put("oppo", v0_3);
        v2_3.put("realme", v0_3);
        v2_3.put("robolectric", v0_3);
        v2_3.put("samsung", v1_13);
        v2_3.put("sharp", v0_3);
        v2_3.put("shift", v0_3);
        v2_3.put("sony", v0_3);
        v2_3.put("tcl", v0_3);
        v2_3.put("tecno", v0_3);
        v2_3.put("tecno mobile limited", v0_3);
        v2_3.put("vivo", v0_3);
        v2_3.put("wingtech", v0_3);
        v2_3.put("xiaomi", v0_3);
        m3.e.b = java.util.Collections.unmodifiableMap(v2_3);
        java.util.HashMap v1_12 = new java.util.HashMap();
        v1_12.put("asus", v0_3);
        v1_12.put("jio", v0_3);
        m3.e.c = java.util.Collections.unmodifiableMap(v1_12);
        return;
    }

    public static void a(android.app.Activity p2, m3.f p3)
    {
        boolean v3_0 = android.os.Build$VERSION.SDK_INT;
        if (v3_0 >= 31) {
            if (v3_0 < 33) {
                if (v3_0 >= 32) {
                    kotlin.jvm.internal.j.d(android.os.Build$VERSION.CODENAME, "CODENAME");
                    if (m0.a.a("Tiramisu")) {
                        android.content.res.Resources$Theme v2_4;
                        boolean v3_12 = p2.obtainStyledAttributes(m3.e.a);
                        java.util.Map v0_5 = v3_12.getResourceId(0, 0);
                        v3_12.recycle();
                        p2.getTheme().applyStyle(v0_5, 1);
                        android.content.res.Resources$Theme v2_1 = p2.getWindow();
                        if (v2_1 == null) {
                            v2_4 = 0;
                        } else {
                            android.content.res.Resources$Theme v2_2 = v2_1.peekDecorView();
                            if (v2_2 == null) {
                            } else {
                                android.content.res.Resources$Theme v2_3 = v2_2.getContext();
                                if (v2_3 == null) {
                                } else {
                                    v2_4 = v2_3.getTheme();
                                }
                            }
                        }
                        if (v2_4 != null) {
                            v2_4.applyStyle(v0_5, 1);
                        }
                        return;
                    }
                }
                java.util.Map v0_1 = java.util.Locale.ROOT;
                boolean v3_6 = ((m3.c) m3.e.b.get(android.os.Build.MANUFACTURER.toLowerCase(v0_1)));
                if (!v3_6) {
                    v3_6 = ((m3.c) m3.e.c.get(android.os.Build.BRAND.toLowerCase(v0_1)));
                }
                if ((!v3_6) || (!v3_6.b())) {
                    return;
                }
            }
        }
        return;
    }
}
