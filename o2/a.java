package o2;
public final class a {
    public final Object a;
    public final o2.d b;
    public final o2.b c;

    public a(Object p1, o2.d p2, o2.b p3)
    {
        if (p1 == null) {
            throw new NullPointerException("Null payload");
        } else {
            this.a = p1;
            this.b = p2;
            this.c = p3;
            return;
        }
    }

    public final boolean equals(Object p6)
    {
        if (p6 != this) {
            if ((p6 instanceof o2.a)) {
                o2.b v1_1 = ((o2.a) p6).c;
                if ((this.a.equals(((o2.a) p6).a)) && (this.b.equals(((o2.a) p6).b))) {
                    boolean v6_3 = this.c;
                    if (v6_3) {
                        if (!v6_3.equals(v1_1)) {
                            return 0;
                        }
                    } else {
                        if (v1_1 != null) {
                            return 0;
                        }
                    }
                    return 1;
                }
            }
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v2_1;
        int v1_2 = (((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003);
        int v2_0 = this.c;
        if (v2_0 != 0) {
            v2_1 = v2_0.hashCode();
        } else {
            v2_1 = 0;
        }
        return ((v1_2 ^ v2_1) * 1000003);
    }

    public final String toString()
    {
        String v0_2 = new StringBuilder("Event{code=null, payload=");
        v0_2.append(this.a);
        v0_2.append(", priority=");
        v0_2.append(this.b);
        v0_2.append(", productData=");
        v0_2.append(this.c);
        v0_2.append(", eventContext=null}");
        return v0_2.toString();
    }
}
