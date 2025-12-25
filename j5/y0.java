package j5;
public final class y0 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final j5.z0 a()
    {
        if (this.e == 7) {
            String v0_3 = this.a;
            if (v0_3 != null) {
                return new j5.z0(v0_3, this.b, this.c, this.d);
            }
        }
        String v0_2 = new StringBuilder();
        if (this.a == null) {
            v0_2.append(" processName");
        }
        if ((this.e & 1) == 0) {
            v0_2.append(" pid");
        }
        if ((this.e & 2) == 0) {
            v0_2.append(" importance");
        }
        if ((this.e & 4) == 0) {
            v0_2.append(" defaultProcess");
        }
        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
    }
}
