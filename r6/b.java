package r6;
public final class b {
    public final String a;
    public final r6.a b;

    public b(String p4, r6.a p5)
    {
        kotlin.jvm.internal.j.e(p4, "appId");
        kotlin.jvm.internal.j.e(android.os.Build.MODEL, "deviceModel");
        kotlin.jvm.internal.j.e(android.os.Build$VERSION.RELEASE, "osVersion");
        this.a = p4;
        this.b = p5;
        return;
    }

    public final boolean equals(Object p3)
    {
        if ((this == p3) || (((p3 instanceof r6.b)) && ((kotlin.jvm.internal.j.a(this.a, ((r6.b) p3).a)) && ((kotlin.jvm.internal.j.a(android.os.Build.MODEL, android.os.Build.MODEL)) && ((kotlin.jvm.internal.j.a(android.os.Build$VERSION.RELEASE, android.os.Build$VERSION.RELEASE)) && (this.b.equals(((r6.b) p3).b))))))) {
            return 1;
        } else {
            return 0;
        }
    }

    public final int hashCode()
    {
        return (this.b.hashCode() + ((r6.x.b.hashCode() + ((android.os.Build$VERSION.RELEASE.hashCode() + ((((android.os.Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517562) * 31)) * 31)) * 31));
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("ApplicationInfo(appId=");
        v0_1.append(this.a);
        v0_1.append(", deviceModel=");
        v0_1.append(android.os.Build.MODEL);
        v0_1.append(", sessionSdkVersion=3.0.3, osVersion=");
        v0_1.append(android.os.Build$VERSION.RELEASE);
        v0_1.append(", logEnvironment=");
        v0_1.append(r6.x.b);
        v0_1.append(", androidAppInfo=");
        v0_1.append(this.b);
        v0_1.append(41);
        return v0_1.toString();
    }
}
