package r4;
public final class b {
    public static final String[] g;
    public static final java.text.SimpleDateFormat h;
    public final String a;
    public final String b;
    public final String c;
    public final java.util.Date d;
    public final long e;
    public final long f;

    static b()
    {
        r4.b.g = new String[] {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"});
        r4.b.h = new java.text.SimpleDateFormat("yyyy-MM-dd\'T\'HH:mm:ss", java.util.Locale.US);
        return;
    }

    public b(String p1, String p2, String p3, java.util.Date p4, long p5, long p7)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        this.d = p4;
        this.e = p5;
        this.f = p7;
        return;
    }

    public final u4.a a()
    {
        u4.a v0_1 = new u4.a();
        v0_1.a = "frc";
        v0_1.m = this.d.getTime();
        v0_1.b = this.a;
        v0_1.c = this.b;
        long v1_1 = this.c;
        if (android.text.TextUtils.isEmpty(v1_1)) {
            v1_1 = 0;
        }
        v0_1.d = v1_1;
        v0_1.e = this.e;
        v0_1.j = this.f;
        return v0_1;
    }
}
