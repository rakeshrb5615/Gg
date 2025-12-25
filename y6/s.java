package y6;
public final class s extends y6.v {
    public final synthetic reflect.Method b;
    public final synthetic int c;

    public s(reflect.Method p1, int p2)
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
            return this.b.invoke(0, new Object[] {p3, Integer.valueOf(this.c)}));
        }
    }
}
