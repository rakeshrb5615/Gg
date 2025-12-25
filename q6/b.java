package q6;
public final class b {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public byte f;

    public final q6.c a()
    {
        if ((this.f == 1) && ((this.a != null) && ((this.b != null) && ((this.c != null) && (this.d != null))))) {
            return new q6.c(this.a, this.b, this.c, this.d, this.e);
        } else {
            String v0_2 = new StringBuilder();
            if (this.a == null) {
                v0_2.append(" rolloutId");
            }
            if (this.b == null) {
                v0_2.append(" variantId");
            }
            if (this.c == null) {
                v0_2.append(" parameterKey");
            }
            if (this.d == null) {
                v0_2.append(" parameterValue");
            }
            if ((1 & this.f) == 0) {
                v0_2.append(" templateVersion");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
        }
    }
}
