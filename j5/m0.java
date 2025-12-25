package j5;
public final class m0 {
    public int a;
    public String b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public int g;
    public String h;
    public String i;
    public byte j;

    public final j5.n0 a()
    {
        if (this.j == 63) {
            String v4 = this.b;
            if (v4 != null) {
                String v12 = this.h;
                if (v12 != null) {
                    String v13 = this.i;
                    if (v13 != null) {
                        return new j5.n0(this.a, v4, this.c, this.d, this.e, this.f, this.g, v12, v13);
                    }
                }
            }
        }
        String v0_2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            v0_2.append(" arch");
        }
        if (this.b == null) {
            v0_2.append(" model");
        }
        if ((this.j & 2) == 0) {
            v0_2.append(" cores");
        }
        if ((this.j & 4) == 0) {
            v0_2.append(" ram");
        }
        if ((this.j & 8) == 0) {
            v0_2.append(" diskSpace");
        }
        if ((this.j & 16) == 0) {
            v0_2.append(" simulator");
        }
        if ((this.j & 32) == 0) {
            v0_2.append(" state");
        }
        if (this.h == null) {
            v0_2.append(" manufacturer");
        }
        if (this.i == null) {
            v0_2.append(" modelClass");
        }
        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
    }
}
