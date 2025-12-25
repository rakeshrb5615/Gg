package y6;
public final class r extends y6.v {
    public final synthetic reflect.Method b;
    public final synthetic Object c;

    public r(reflect.Method p1, Object p2)
    {
        this.b = p1;
        this.c = p2;
        return;
    }

    public final Object a(Class p3)
    {
        String v0_0 = y6.c.a(p3);
        if (v0_0 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(v0_0));
        } else {
            return this.b.invoke(this.c, new Object[] {p3}));
        }
    }
}
