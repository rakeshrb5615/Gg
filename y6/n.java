package y6;
public final class n implements java.util.Map$Entry {
    public y6.n a;
    public y6.n b;
    public y6.n c;
    public y6.n d;
    public y6.n e;
    public final Object f;
    public final boolean m;
    public Object n;
    public int o;

    public n(boolean p2)
    {
        this.f = 0;
        this.m = p2;
        this.e = this;
        this.d = this;
        return;
    }

    public n(boolean p1, y6.n p2, Object p3, y6.n p4, y6.n p5)
    {
        this.a = p2;
        this.f = p3;
        this.m = p1;
        this.o = 1;
        this.d = p4;
        this.e = p5;
        p5.d = this;
        p4.e = this;
        return;
    }

    public final boolean equals(Object p4)
    {
        if ((p4 instanceof java.util.Map$Entry)) {
            Object v0_3 = this.f;
            if (v0_3 != null) {
                if (!v0_3.equals(((java.util.Map$Entry) p4).getKey())) {
                    return 0;
                }
            } else {
                if (((java.util.Map$Entry) p4).getKey() != null) {
                    return 0;
                }
            }
            Object v0_2 = this.n;
            if (v0_2 != null) {
                if (!v0_2.equals(((java.util.Map$Entry) p4).getValue())) {
                    return 0;
                }
            } else {
                if (((java.util.Map$Entry) p4).getValue() != null) {
                    return 0;
                }
            }
            return 1;
        }
        return 0;
    }

    public final Object getKey()
    {
        return this.f;
    }

    public final Object getValue()
    {
        return this.n;
    }

    public final int hashCode()
    {
        int v1_1;
        int v0_0 = 0;
        int v1_0 = this.f;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        Object v2 = this.n;
        if (v2 != null) {
            v0_0 = v2.hashCode();
        }
        return (v0_0 ^ v1_1);
    }

    public final Object setValue(Object p2)
    {
        if ((p2 == null) && (!this.m)) {
            throw new NullPointerException("value == null");
        } else {
            String v0_2 = this.n;
            this.n = p2;
            return v0_2;
        }
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.f);
        v0_1.append("=");
        v0_1.append(this.n);
        return v0_1.toString();
    }
}
