package r2;
public final class h {
    public String a;
    public Integer b;
    public r2.m c;
    public Long d;
    public Long e;
    public java.util.HashMap f;
    public Integer g;
    public String h;
    public byte[] i;
    public byte[] j;

    public final void a(String p2, String p3)
    {
        java.util.HashMap v0 = this.f;
        if (v0 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        } else {
            v0.put(p2, p3);
            return;
        }
    }

    public final r2.i b()
    {
        String v0_1;
        if (this.a != null) {
            v0_1 = "";
        } else {
            v0_1 = " transportName";
        }
        if (this.c == null) {
            v0_1 = v0_1.concat(" encodedPayload");
        }
        if (this.d == null) {
            v0_1 = g2.g.d(v0_1, " eventMillis");
        }
        if (this.e == null) {
            v0_1 = g2.g.d(v0_1, " uptimeMillis");
        }
        if (this.f == null) {
            v0_1 = g2.g.d(v0_1, " autoMetadata");
        }
        if (!v0_1.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(v0_1));
        } else {
            return new r2.i(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j);
        }
    }
}
