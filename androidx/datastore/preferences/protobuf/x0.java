package androidx.datastore.preferences.protobuf;
public final class x0 implements java.util.Map$Entry, java.lang.Comparable {
    public final Comparable a;
    public Object b;
    public final synthetic androidx.datastore.preferences.protobuf.w0 c;

    public x0(androidx.datastore.preferences.protobuf.w0 p1, Comparable p2, Object p3)
    {
        this.c = p1;
        this.a = p2;
        this.b = p3;
        return;
    }

    public final int compareTo(Object p2)
    {
        return this.a.compareTo(((androidx.datastore.preferences.protobuf.x0) p2).a);
    }

    public final boolean equals(Object p5)
    {
        if (p5 != this) {
            if ((p5 instanceof java.util.Map$Entry)) {
                Object v1_0;
                Object v1_3 = ((java.util.Map$Entry) p5).getKey();
                Comparable v3 = this.a;
                if (v3 != null) {
                    v1_0 = v3.equals(v1_3);
                } else {
                    if (v1_3 != null) {
                        v1_0 = 0;
                    } else {
                        v1_0 = 1;
                    }
                }
                if (v1_0 != null) {
                    int v5_2;
                    Object v1_1 = this.b;
                    int v5_1 = ((java.util.Map$Entry) p5).getValue();
                    if (v1_1 != null) {
                        v5_2 = v1_1.equals(v5_1);
                    } else {
                        if (v5_1 != 0) {
                            v5_2 = 0;
                        } else {
                            v5_2 = 1;
                        }
                    }
                    if (v5_2 != 0) {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 1;
    }

    public final Object getKey()
    {
        return this.a;
    }

    public final Object getValue()
    {
        return this.b;
    }

    public final int hashCode()
    {
        int v1_1;
        int v0_0 = 0;
        int v1_0 = this.a;
        if (v1_0 != 0) {
            v1_1 = v1_0.hashCode();
        } else {
            v1_1 = 0;
        }
        Object v2 = this.b;
        if (v2 != null) {
            v0_0 = v2.hashCode();
        }
        return (v0_0 ^ v1_1);
    }

    public final Object setValue(Object p2)
    {
        this.c.c();
        Object v0_1 = this.b;
        this.b = p2;
        return v0_1;
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.a);
        v0_1.append("=");
        v0_1.append(this.b);
        return v0_1.toString();
    }
}
