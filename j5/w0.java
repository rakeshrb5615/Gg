package j5;
public final class w0 {
    public long a;
    public String b;
    public String c;
    public long d;
    public int e;
    public byte f;

    public final j5.x0 a()
    {
        if (this.f == 7) {
            String v5 = this.b;
            if (v5 != null) {
                return new j5.x0(this.a, v5, this.c, this.d, this.e);
            }
        }
        String v0_2 = new StringBuilder();
        if ((this.f & 1) == 0) {
            v0_2.append(" pc");
        }
        if (this.b == null) {
            v0_2.append(" symbol");
        }
        if ((this.f & 2) == 0) {
            v0_2.append(" offset");
        }
        if ((this.f & 4) == 0) {
            v0_2.append(" importance");
        }
        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
    }
}
