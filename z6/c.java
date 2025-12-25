package z6;
public final class c extends w6.z {
    public final synthetic int a;
    public final Object b;
    public final Object c;

    public c(z6.m p2, y6.p p3)
    {
        this.a = 0;
        this.b = p2;
        this.c = p3;
        return;
    }

    public c(z6.q0 p2, Class p3)
    {
        this.a = 1;
        this.c = p2;
        this.b = p3;
        return;
    }

    public final Object b(e7.a p6)
    {
        switch (this.a) {
            case 0:
                int v6_1;
                if (p6.O() != 9) {
                    int v0_1 = ((java.util.Collection) ((y6.p) this.c).c());
                    p6.c();
                    while (p6.B()) {
                        v0_1.add(((z6.m) this.b).c.b(p6));
                    }
                    p6.x();
                    v6_1 = v0_1;
                } else {
                    p6.K();
                    v6_1 = 0;
                }
                return v6_1;
            default:
                int v0_3 = ((Class) this.b);
                Object v1_8 = ((z6.q0) this.c).c.b(p6);
                if ((v1_8 != null) && (!v0_3.isInstance(v1_8))) {
                    StringBuilder v3_1 = new StringBuilder("Expected a ");
                    v3_1.append(v0_3.getName());
                    v3_1.append(" but was ");
                    v3_1.append(v1_8.getClass().getName());
                    v3_1.append("; at path ");
                    v3_1.append(p6.A(1));
                    throw new w6.p(v3_1.toString());
                } else {
                    return v1_8;
                }
        }
    }

    public final void c(e7.b p3, Object p4)
    {
        switch (this.a) {
            case 0:
                if (((java.util.Collection) p4) != null) {
                    p3.f();
                    java.util.Iterator v4_2 = ((java.util.Collection) p4).iterator();
                    while (v4_2.hasNext()) {
                        ((z6.m) this.b).c(p3, v4_2.next());
                    }
                    p3.x();
                } else {
                    p3.B();
                }
                return;
            default:
                ((z6.q0) this.c).c.c(p3, p4);
                return;
        }
    }
}
