package j5;
public final class c0 {
    public int a;
    public String b;
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public String h;
    public java.util.List i;
    public byte j;

    public final j5.d0 a()
    {
        if (this.j == 63) {
            String v4 = this.b;
            if (v4 != null) {
                return new j5.d0(this.a, v4, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
            }
        }
        String v0_2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            v0_2.append(" pid");
        }
        if (this.b == null) {
            v0_2.append(" processName");
        }
        if ((this.j & 2) == 0) {
            v0_2.append(" reasonCode");
        }
        if ((this.j & 4) == 0) {
            v0_2.append(" importance");
        }
        if ((this.j & 8) == 0) {
            v0_2.append(" pss");
        }
        if ((this.j & 16) == 0) {
            v0_2.append(" rss");
        }
        if ((this.j & 32) == 0) {
            v0_2.append(" timestamp");
        }
        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
    }
}
