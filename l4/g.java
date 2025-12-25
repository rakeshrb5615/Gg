package l4;
public final class g implements l4.f, java.io.Serializable {
    public final l4.f a;
    public transient volatile boolean b;
    public transient Object c;

    public g(l4.f p1)
    {
        this.a = p1;
        return;
    }

    public final Object get()
    {
        if (!this.b) {
            if (this.b) {
            } else {
                Object v0_5 = this.a.get();
                this.c = v0_5;
                this.b = 1;
                return v0_5;
            }
        }
        return this.c;
    }

    public final String toString()
    {
        String v1_1;
        String v0_2 = new StringBuilder("Suppliers.memoize(");
        if (!this.b) {
            v1_1 = this.a;
        } else {
            String v1_5 = new StringBuilder("<supplier that returned ");
            v1_5.append(this.c);
            v1_5.append(">");
            v1_1 = v1_5.toString();
        }
        v0_2.append(v1_1);
        v0_2.append(")");
        return v0_2.toString();
    }
}
