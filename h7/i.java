package h7;
public final class i implements h7.d, java.io.Serializable {
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c;
    public volatile u7.a a;
    public volatile Object b;

    static i()
    {
        h7.i.c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(h7.i, Object, "b");
        return;
    }

    public final Object getValue()
    {
        Object v0_0 = this.b;
        int v1_0 = h7.k.a;
        if (v0_0 == v1_0) {
            Object v0_2 = this.a;
            if (v0_2 != null) {
                Object v0_3 = v0_2.invoke();
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater v2 = h7.i.c;
                while (!v2.compareAndSet(this, v1_0, v0_3)) {
                    if (v2.get(this) != v1_0) {
                    }
                }
                this.a = 0;
                return v0_3;
            }
            return this.b;
        } else {
            return v0_0;
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
