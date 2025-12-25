package z6;
public final class q0 implements w6.a0 {
    public final synthetic int a;
    public final synthetic Class b;
    public final synthetic w6.z c;

    public synthetic q0(Class p1, w6.z p2, int p3)
    {
        this.a = p3;
        this.b = p1;
        this.c = p2;
        return;
    }

    public final w6.z a(w6.m p1, d7.a p2)
    {
        switch (this.a) {
            case 0:
                int v1_3;
                if (p2.a != this.b) {
                    v1_3 = 0;
                } else {
                    v1_3 = this.c;
                }
                return v1_3;
            default:
                int v1_1;
                int v1_4 = p2.a;
                if (this.b.isAssignableFrom(v1_4)) {
                    v1_1 = new z6.c(this, v1_4);
                } else {
                    v1_1 = 0;
                }
                return v1_1;
        }
    }

    public final String toString()
    {
        switch (this.a) {
            case 0:
                String v0_6 = new StringBuilder("Factory[type=");
                v0_6.append(this.b.getName());
                v0_6.append(",adapter=");
                v0_6.append(this.c);
                v0_6.append("]");
                return v0_6.toString();
            default:
                String v0_4 = new StringBuilder("Factory[typeHierarchy=");
                v0_4.append(this.b.getName());
                v0_4.append(",adapter=");
                v0_4.append(this.c);
                v0_4.append("]");
                return v0_4.toString();
        }
    }
}
