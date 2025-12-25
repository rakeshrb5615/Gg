package j5;
public final class a0 {
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public j5.m2 j;
    public j5.s1 k;
    public j5.p1 l;
    public byte m;

    public final j5.b0 a()
    {
        if ((this.m == 1) && ((this.a != null) && ((this.b != null) && ((this.d != null) && ((this.h != null) && (this.i != null)))))) {
            return new j5.b0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        } else {
            String v0_3 = new StringBuilder();
            if (this.a == null) {
                v0_3.append(" sdkVersion");
            }
            if (this.b == null) {
                v0_3.append(" gmpAppId");
            }
            if ((1 & this.m) == 0) {
                v0_3.append(" platform");
            }
            if (this.d == null) {
                v0_3.append(" installationUuid");
            }
            if (this.h == null) {
                v0_3.append(" buildVersion");
            }
            if (this.i == null) {
                v0_3.append(" displayVersion");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", v0_3));
        }
    }
}
