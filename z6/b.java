package z6;
public final class b extends w6.z {
    public static final z6.a c;
    public final Class a;
    public final z6.m b;

    static b()
    {
        z6.b.c = new z6.a();
        return;
    }

    public b(w6.m p2, w6.z p3, Class p4)
    {
        this.b = new z6.m(p2, p3, p4);
        this.a = p4;
        return;
    }

    public final Object b(e7.a p5)
    {
        if (p5.O() != 9) {
            java.util.ArrayList v0_2 = new java.util.ArrayList();
            p5.c();
            while (p5.B()) {
                v0_2.add(this.b.c.b(p5));
            }
            p5.x();
            Object[] v5_1 = v0_2.size();
            Object v1_0 = this.a;
            if (!v1_0.isPrimitive()) {
                return v0_2.toArray(((Object[]) reflect.Array.newInstance(v1_0, v5_1)));
            } else {
                Object v1_2 = reflect.Array.newInstance(v1_0, v5_1);
                int v2_1 = 0;
                while (v2_1 < v5_1) {
                    reflect.Array.set(v1_2, v2_1, v0_2.get(v2_1));
                    v2_1++;
                }
                return v1_2;
            }
        } else {
            p5.K();
            return 0;
        }
    }

    public final void c(e7.b p5, Object p6)
    {
        if (p6 != null) {
            p5.f();
            int v0 = reflect.Array.getLength(p6);
            int v1 = 0;
            while (v1 < v0) {
                this.b.c(p5, reflect.Array.get(p6, v1));
                v1++;
            }
            p5.x();
            return;
        } else {
            p5.B();
            return;
        }
    }
}
