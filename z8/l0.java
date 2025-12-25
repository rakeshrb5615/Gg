package z8;
public final class l0 extends z8.a {
    public final synthetic int n;

    public synthetic l0(int p1)
    {
        this.n = p1;
        super(7);
        return;
    }

    public String c(reflect.Method p3, int p4)
    {
        switch (this.n) {
            case 1:
                String v3_3;
                reflect.Parameter v0_2 = p3.getParameters()[p4];
                if (!v0_2.isNamePresent()) {
                    v3_3 = super.c(p3, p4);
                } else {
                    String v3_2 = new StringBuilder("parameter \'");
                    v3_2.append(v0_2.getName());
                    v3_2.append(39);
                    v3_3 = v3_2.toString();
                }
                return v3_3;
            default:
                return super.c(p3, p4);
        }
    }

    public final Object d(reflect.Method p2, Object p3, Object[] p4)
    {
        switch (this.n) {
            case 0:
                return z8.z0.k(p2, p3, p4);
            default:
                return z8.z0.k(p2, p3, p4);
        }
    }

    public final boolean f(reflect.Method p2)
    {
        switch (this.n) {
            case 0:
                return p2.isDefault();
            default:
                return p2.isDefault();
        }
    }
}
