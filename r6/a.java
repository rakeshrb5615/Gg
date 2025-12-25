package r6;
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final r6.d0 d;
    public final java.util.ArrayList e;

    public a(String p3, String p4, String p5, r6.d0 p6, java.util.ArrayList p7)
    {
        kotlin.jvm.internal.j.e(p4, "versionName");
        kotlin.jvm.internal.j.e(p5, "appBuildVersion");
        kotlin.jvm.internal.j.e(android.os.Build.MANUFACTURER, "deviceManufacturer");
        this.a = p3;
        this.b = p4;
        this.c = p5;
        this.d = p6;
        this.e = p7;
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((this == p3) || (((p3 instanceof r6.a)) && ((this.a.equals(((r6.a) p3).a)) && ((kotlin.jvm.internal.j.a(this.b, ((r6.a) p3).b)) && ((kotlin.jvm.internal.j.a(this.c, ((r6.a) p3).c)) && ((kotlin.jvm.internal.j.a(android.os.Build.MANUFACTURER, android.os.Build.MANUFACTURER)) && ((this.d.equals(((r6.a) p3).d)) && (this.e.equals(((r6.a) p3).e))))))))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return (this.e.hashCode() + ((this.d.hashCode() + ((android.os.Build.MANUFACTURER.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("AndroidApplicationInfo(packageName=");
        v0_1.append(this.a);
        v0_1.append(", versionName=");
        v0_1.append(this.b);
        v0_1.append(", appBuildVersion=");
        v0_1.append(this.c);
        v0_1.append(", deviceManufacturer=");
        v0_1.append(android.os.Build.MANUFACTURER);
        v0_1.append(", currentProcessDetails=");
        v0_1.append(this.d);
        v0_1.append(", appProcessDetails=");
        v0_1.append(this.e);
        v0_1.append(41);
        return v0_1.toString();
    }
}
