package z6;
public final class s0 implements w6.a0 {
    public final synthetic Class a;
    public final synthetic Class b;
    public final synthetic w6.z c;

    public s0(Class p1, Class p2, w6.z p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = p3;
        return;
    }

    public final w6.z a(w6.m p1, d7.a p2)
    {
        int v1_0 = p2.a;
        if ((v1_0 != this.a) && (v1_0 != this.b)) {
            return 0;
        } else {
            return this.c;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("Factory[type=");
        v0_1.append(this.b.getName());
        v0_1.append("+");
        v0_1.append(this.a.getName());
        v0_1.append(",adapter=");
        v0_1.append(this.c);
        v0_1.append("]");
        return v0_1.toString();
    }
}
