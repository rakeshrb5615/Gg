package z8;
public final class r0 implements java.lang.reflect.InvocationHandler {
    public final Object[] a;
    public final synthetic z8.s0 b;

    public r0(z8.s0 p1)
    {
        this.b = p1;
        Object[] v1_2 = new Object[0];
        this.a = v1_2;
        return;
    }

    public final Object invoke(Object p7, reflect.Method p8, Object[] p9)
    {
        if (p8.getDeclaringClass() != Object) {
            if (p9 == null) {
                p9 = this.a;
            }
            java.util.concurrent.ConcurrentHashMap v9_4 = z8.k0.b;
            if (!v9_4.f(p8)) {
                java.util.concurrent.ConcurrentHashMap v9_1 = this.b;
                while(true) {
                    z8.t0 v0_6;
                    z8.t0 v0_2 = v9_1.a.get(p8);
                    if (!(v0_2 instanceof z8.t0)) {
                        if (v0_2 == null) {
                            if (v9_1.a.putIfAbsent(p8, new Object()) == null) {
                                break;
                            }
                        }
                        z8.t0 v0_5 = v9_1.a.get(p8);
                        if (v0_5 != null) {
                            v0_6 = ((z8.t0) v0_5);
                        } else {
                        }
                    } else {
                        v0_6 = ((z8.t0) v0_2);
                    }
                    z8.s v8_2 = ((z8.s) v0_6);
                    return v8_2.b(new z8.z(v8_2.a, p7, p9, v8_2.b, v8_2.c), p9);
                }
                v0_6 = z8.t0.a(v9_1, p8);
                v9_1.a.put(p8, v0_6);
                v8_2 = ((z8.s) v0_6);
                return v8_2.b(new z8.z(v8_2.a, p7, p9, v8_2.b, v8_2.c), p9);
            } else {
                return v9_4.d(p8, p7, p9);
            }
        } else {
            return p8.invoke(this, p9);
        }
    }
}
