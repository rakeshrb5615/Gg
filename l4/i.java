package l4;
public final class i implements l4.f {
    public static final l4.h c;
    public volatile l4.f a;
    public Object b;

    static i()
    {
        l4.i.c = new l4.h(0);
        return;
    }

    public final Object get()
    {
        l4.h v1 = l4.i.c;
        if (this.a != v1) {
            if (this.a == v1) {
            } else {
                Object v0_5 = this.a.get();
                this.b = v0_5;
                this.a = v1;
                return v0_5;
            }
        }
        return this.b;
    }

    public final String toString()
    {
        String v0_0 = this.a;
        StringBuilder v1_1 = new StringBuilder("Suppliers.memoize(");
        if (v0_0 == l4.i.c) {
            String v0_4 = new StringBuilder("<supplier that returned ");
            v0_4.append(this.b);
            v0_4.append(">");
            v0_0 = v0_4.toString();
        }
        v1_1.append(v0_0);
        v1_1.append(")");
        return v1_1.toString();
    }
}
