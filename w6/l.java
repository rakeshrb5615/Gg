package w6;
public class l extends z6.w {
    public w6.z a;

    public l()
    {
        this.a = 0;
        return;
    }

    public final Object b(e7.a p2)
    {
        String v0_0 = this.a;
        if (v0_0 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        } else {
            return v0_0.b(p2);
        }
    }

    public final void c(e7.b p2, Object p3)
    {
        w6.z v0 = this.a;
        if (v0 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        } else {
            v0.c(p2, p3);
            return;
        }
    }

    public final w6.z d()
    {
        IllegalStateException v0_0 = this.a;
        if (v0_0 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        } else {
            return v0_0;
        }
    }
}
