package z6;
public abstract class r extends w6.z {
    public final z6.t a;

    public r(z6.t p1)
    {
        this.a = p1;
        return;
    }

    public final Object b(e7.a p4)
    {
        if (p4.O() != 9) {
            RuntimeException v0_5 = this.d();
            String v1_3 = this.a.a;
            p4.f();
            while (p4.B()) {
                z6.q v2_3 = ((z6.q) v1_3.get(p4.I()));
                if (v2_3 != null) {
                    this.f(v0_5, p4, v2_3);
                } else {
                    p4.U();
                }
            }
            p4.y();
            return this.e(v0_5);
        } else {
            p4.K();
            return 0;
        }
    }

    public final void c(e7.b p3, Object p4)
    {
        if (p4 != null) {
            p3.i();
            try {
                String v0_3 = this.a.b.iterator();
            } catch (IllegalAccessException v3_1) {
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", v3_1);
            }
            while (v0_3.hasNext()) {
                ((z6.q) v0_3.next()).a(p3, p4);
            }
            p3.y();
            return;
        } else {
            p3.B();
            return;
        }
    }

    public abstract Object d();

    public abstract Object e();

    public abstract void f();
}
