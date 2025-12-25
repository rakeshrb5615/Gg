package r6;
public final class o0 {
    public static final r6.o0 a;
    public static final j6.o b;

    static o0()
    {
        r6.o0.a = new r6.o0();
        v5.d v0_3 = new v5.d();
        v0_3.a(r6.n0, r6.g.a);
        v0_3.a(r6.v0, r6.h.a);
        v0_3.a(r6.k, r6.e.a);
        v0_3.a(r6.b, r6.d.a);
        v0_3.a(r6.a, r6.c.a);
        v0_3.a(r6.d0, r6.f.a);
        v0_3.d = 1;
        r6.o0.b = new j6.o(v0_3, 19);
        return;
    }

    public static r6.b a(q4.f p10)
    {
        r6.a v2_2;
        p10.a();
        android.content.Context v0 = p10.a;
        kotlin.jvm.internal.j.d(v0, "getApplicationContext(...)");
        String v3 = v0.getPackageName();
        String v1_0 = v0.getPackageManager().getPackageInfo(v3, 0);
        if (android.os.Build$VERSION.SDK_INT < 28) {
            v2_2 = String.valueOf(v1_0.versionCode);
        } else {
            v2_2 = String.valueOf(v1_0.getLongVersionCode());
        }
        String v4_4;
        String v5 = v2_2;
        p10.a();
        String v9 = p10.c.b;
        kotlin.jvm.internal.j.d(v9, "getApplicationId(...)");
        kotlin.jvm.internal.j.d(android.os.Build.MODEL, "MODEL");
        kotlin.jvm.internal.j.d(android.os.Build$VERSION.RELEASE, "RELEASE");
        kotlin.jvm.internal.j.b(v3);
        String v1_2 = v1_0.versionName;
        if (v1_2 != null) {
            v4_4 = v1_2;
        } else {
            v4_4 = v5;
        }
        kotlin.jvm.internal.j.d(android.os.Build.MANUFACTURER, "MANUFACTURER");
        p10.a();
        r6.d0 v6_1 = r6.e0.b(v0);
        p10.a();
        return new r6.b(v9, new r6.a(v3, v4_4, v5, v6_1, r6.e0.a(v0)));
    }
}
