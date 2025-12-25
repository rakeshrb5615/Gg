package z8;
public final class t {
    public final Object a;
    public final reflect.Method b;
    public final java.util.List c;

    public t(Object p1, reflect.Method p2, java.util.ArrayList p3)
    {
        this.a = p1;
        this.b = p2;
        this.c = java.util.Collections.unmodifiableList(p3);
        return;
    }

    public final String toString()
    {
        return String.format("%s.%s() %s", new Object[] {j2.h.getName(), this.b.getName(), this.c}));
    }
}
