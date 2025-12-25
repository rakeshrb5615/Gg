package j5;
public final class h1 {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public byte e;

    public final j5.i1 a()
    {
        if (this.e == 3) {
            String v0_3 = this.b;
            if (v0_3 != null) {
                IllegalStateException v1_13 = this.c;
                if (v1_13 != null) {
                    return new j5.i1(v0_3, v1_13, this.a, this.d);
                }
            }
        }
        String v0_2 = new StringBuilder();
        if ((this.e & 1) == 0) {
            v0_2.append(" platform");
        }
        if (this.b == null) {
            v0_2.append(" version");
        }
        if (this.c == null) {
            v0_2.append(" buildVersion");
        }
        if ((this.e & 2) == 0) {
            v0_2.append(" jailbroken");
        }
        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
    }
}
