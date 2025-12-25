package j5;
public final class a1 {
    public Double a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public byte g;

    public final j5.b1 a()
    {
        if (this.g == 31) {
            return new j5.b1(this.a, this.b, this.c, this.d, this.e, this.f);
        } else {
            String v0_2 = new StringBuilder();
            if ((this.g & 1) == 0) {
                v0_2.append(" batteryVelocity");
            }
            if ((this.g & 2) == 0) {
                v0_2.append(" proximityOn");
            }
            if ((this.g & 4) == 0) {
                v0_2.append(" orientation");
            }
            if ((this.g & 8) == 0) {
                v0_2.append(" ramUsed");
            }
            if ((this.g & 16) == 0) {
                v0_2.append(" diskUsed");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
        }
    }
}
