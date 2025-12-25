package e6;
public final class a {
    public String a;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    public String g;
    public byte h;

    public final e6.b a()
    {
        if ((this.h == 3) && (this.b != 0)) {
            return new e6.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        } else {
            String v0_2 = new StringBuilder();
            if (this.b == 0) {
                v0_2.append(" registrationStatus");
            }
            if ((this.h & 1) == 0) {
                v0_2.append(" expiresInSecs");
            }
            if ((this.h & 2) == 0) {
                v0_2.append(" tokenCreationEpochInSecs");
            }
            throw new IllegalStateException(g2.g.g("Missing required properties:", v0_2));
        }
    }
}
