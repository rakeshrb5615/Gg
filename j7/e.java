package j7;
public final class e implements java.util.Map$Entry, v7.a {
    public final j7.f a;
    public final int b;
    public final int c;

    public e(j7.f p2, int p3)
    {
        kotlin.jvm.internal.j.e(p2, "map");
        this.a = p2;
        this.b = p3;
        this.c = p2.n;
        return;
    }

    public final void b()
    {
        if (this.a.n != this.c) {
            throw new java.util.ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        } else {
            return;
        }
    }

    public final boolean equals(Object p3)
    {
        if ((!(p3 instanceof java.util.Map$Entry)) || ((!kotlin.jvm.internal.j.a(((java.util.Map$Entry) p3).getKey(), this.getKey())) || (!kotlin.jvm.internal.j.a(((java.util.Map$Entry) p3).getValue(), this.getValue())))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final Object getKey()
    {
        this.b();
        return this.a.a[this.b];
    }

    public final Object getValue()
    {
        this.b();
        Object v0_1 = this.a.b;
        kotlin.jvm.internal.j.b(v0_1);
        return v0_1[this.b];
    }

    public final int hashCode()
    {
        int v0_2;
        int v0_0 = this.getKey();
        int v1 = 0;
        if (v0_0 == 0) {
            v0_2 = 0;
        } else {
            v0_2 = v0_0.hashCode();
        }
        Object v2 = this.getValue();
        if (v2 != null) {
            v1 = v2.hashCode();
        }
        return (v0_2 ^ v1);
    }

    public final Object setValue(Object p4)
    {
        this.b();
        String v0_0 = this.a;
        v0_0.c();
        Object[] v1_0 = v0_0.b;
        if (v1_0 == null) {
            Object[] v1_2 = v0_0.a.length;
            if (v1_2 < null) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            } else {
                v1_0 = new Object[v1_2];
                v0_0.b = v1_0;
            }
        }
        String v0_1 = this.b;
        int v2 = v1_0[v0_1];
        v1_0[v0_1] = p4;
        return v2;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.getKey());
        v0_1.append(61);
        v0_1.append(this.getValue());
        return v0_1.toString();
    }
}
