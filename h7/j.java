package h7;
public final class j implements h7.d, java.io.Serializable {
    public u7.a a;
    public volatile Object b;
    public final Object c;

    public j(u7.a p2)
    {
        kotlin.jvm.internal.j.e(p2, "initializer");
        this.a = p2;
        this.b = h7.k.a;
        this.c = this;
        return;
    }

    public final Object getValue()
    {
        Object v0 = this.b;
        int v1_0 = h7.k.a;
        if (v0 == v1_0) {
            try {
                Object v2 = this.b;
            } catch (int v1_2) {
                throw v1_2;
            }
            if (v2 == v1_0) {
                int v1_3 = this.a;
                kotlin.jvm.internal.j.b(v1_3);
                v2 = v1_3.invoke();
                this.b = v2;
                this.a = 0;
            } else {
            }
            return v2;
        } else {
            return v0;
        }
    }

    public final String toString()
    {
        if (this.b == h7.k.a) {
            return "Lazy value not initialized yet.";
        } else {
            return String.valueOf(this.getValue());
        }
    }
}
