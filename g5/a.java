package g5;
public final class a {
    public final String a;
    public final String b;
    public final java.util.ArrayList c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final k2.c h;

    public a(String p1, String p2, java.util.ArrayList p3, String p4, String p5, String p6, String p7, k2.c p8)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p6;
        this.g = p7;
        this.h = p8;
        return;
    }

    public static g5.a a(android.content.Context p9, g5.y p10, String p11, String p12, java.util.ArrayList p13, k2.c p14)
    {
        String v10_2;
        String v5 = p9.getPackageName();
        String v4 = p10.d();
        String v9_3 = p9.getPackageManager().getPackageInfo(v5, 0);
        if (android.os.Build$VERSION.SDK_INT < 28) {
            v10_2 = Integer.toString(v9_3.versionCode);
        } else {
            v10_2 = Long.toString(v9_3.getLongVersionCode());
        }
        String v9_1 = v9_3.versionName;
        if (v9_1 == null) {
            v9_1 = "0.0";
        }
        return new g5.a(p11, p12, p13, v4, v5, v10_2, v9_1, p14);
    }
}
