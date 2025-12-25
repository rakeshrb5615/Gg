package j5;
public final class d1 {
    public j5.f1 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final j5.e1 a()
    {
        if (this.e == 1) {
            j5.f1 v3 = this.a;
            if (v3 != null) {
                String v4 = this.b;
                if (v4 != null) {
                    String v5 = this.c;
                    if (v5 != null) {
                        return new j5.e1(v3, v4, v5, this.d);
                    }
                }
            }
        }
        String v0_2 = new StringBuilder();
        if (this.a == null) {
            v0_2.append(" rolloutVariant");
        }
        if (this.b == null) {
            v0_2.append(" parameterKey");
        }
        if (this.c == null) {
            v0_2.append(" parameterValue");
        }
        if ((1 & this.e) == 0) {
            v0_2.append(" templateVersion");
        }
        throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
    }
}
