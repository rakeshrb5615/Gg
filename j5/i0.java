package j5;
public final class i0 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public j5.u1 g;
    public j5.l2 h;
    public j5.k2 i;
    public j5.v1 j;
    public java.util.List k;
    public int l;
    public byte m;

    public final j5.j0 a()
    {
        if (this.m == 7) {
            String v4 = this.a;
            if (v4 != null) {
                String v5 = this.b;
                if (v5 != null) {
                    j5.u1 v11 = this.g;
                    if (v11 != null) {
                        return new j5.j0(v4, v5, this.c, this.d, this.e, this.f, v11, this.h, this.i, this.j, this.k, this.l);
                    }
                }
            }
        }
        String v1_3 = new StringBuilder();
        if (this.a == null) {
            v1_3.append(" generator");
        }
        if (this.b == null) {
            v1_3.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            v1_3.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            v1_3.append(" crashed");
        }
        if (this.g == null) {
            v1_3.append(" app");
        }
        if ((this.m & 4) == 0) {
            v1_3.append(" generatorType");
        }
        throw new IllegalStateException(g2.g.g("Missing required properties:", v1_3));
    }
}
