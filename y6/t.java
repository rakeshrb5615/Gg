package y6;
public final class t extends y6.v {
    public final synthetic reflect.Method b;

    public t(reflect.Method p1)
    {
        this.b = p1;
        return;
    }

    public final Object a(Class p3)
    {
        String v0_0 = y6.c.a(p3);
        if (v0_0 != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(v0_0));
        } else {
            return this.b.invoke(0, new Object[] {p3, Object}));
        }
    }
}
