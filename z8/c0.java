package z8;
public final class c0 extends z8.z0 {
    public final synthetic int d;
    public final String e;
    public final z8.a f;
    public final boolean g;

    public c0(String p2, int p3, boolean p4)
    {
        this.d = p3;
        switch (p3) {
            case 1:
                java.util.Objects.requireNonNull(p2, "name == null");
                this.e = p2;
                this.f = z8.a.b;
                this.g = p4;
                return;
            case 2:
                java.util.Objects.requireNonNull(p2, "name == null");
                this.e = p2;
                this.f = z8.a.b;
                this.g = p4;
                return;
            default:
                java.util.Objects.requireNonNull(p2, "name == null");
                this.e = p2;
                this.f = z8.a.b;
                this.g = p4;
                return;
        }
    }

    public final void a(z8.n0 p3, Object p4)
    {
        switch (this.d) {
            case 0:
                if (p4 != null) {
                    this.f.getClass();
                    String v4_1 = p4.toString();
                    if (v4_1 != null) {
                        p3.a(this.e, v4_1, this.g);
                    }
                }
                return;
            case 1:
                if (p4 != null) {
                    this.f.getClass();
                    String v4_3 = p4.toString();
                    if (v4_3 != null) {
                        p3.b(this.e, v4_3, this.g);
                    }
                }
                return;
            default:
                if (p4 != null) {
                    this.f.getClass();
                    String v4_2 = p4.toString();
                    if (v4_2 != null) {
                        p3.d(this.e, v4_2, this.g);
                    }
                }
                return;
        }
    }
}
