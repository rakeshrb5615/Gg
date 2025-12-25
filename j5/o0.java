package j5;
public final class o0 {
    public long a;
    public String b;
    public j5.d2 c;
    public j5.e2 d;
    public j5.f2 e;
    public j5.i2 f;
    public byte g;

    public final j5.p0 a()
    {
        if (this.g == 1) {
            String v5 = this.b;
            if (v5 != null) {
                j5.d2 v6 = this.c;
                if (v6 != null) {
                    j5.e2 v7 = this.d;
                    if (v7 != null) {
                        return new j5.p0(this.a, v5, v6, v7, this.e, this.f);
                    }
                }
            }
        }
        String v0_2 = new StringBuilder();
        if ((1 & this.g) == 0) {
            v0_2.append(" timestamp");
        }
        if (this.b == null) {
            v0_2.append(" type");
        }
        if (this.c == null) {
            v0_2.append(" app");
        }
        if (this.d == null) {
            v0_2.append(" device");
        }
        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
    }
}
