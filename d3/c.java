package d3;
public final class c {
    public long a;
    public long b;
    public android.animation.TimeInterpolator c;
    public int d;
    public int e;

    public final android.animation.TimeInterpolator a()
    {
        l1.a v0_0 = this.c;
        if (v0_0 == null) {
            return d3.a.b;
        } else {
            return v0_0;
        }
    }

    public final boolean equals(Object p7)
    {
        if (this != p7) {
            if ((p7 instanceof d3.c)) {
                if (this.a == ((d3.c) p7).a) {
                    if (this.b == ((d3.c) p7).b) {
                        if (this.d == ((d3.c) p7).d) {
                            if (this.e == ((d3.c) p7).e) {
                                return this.a().getClass().equals(((d3.c) p7).a().getClass());
                            } else {
                                return 0;
                            }
                        } else {
                            return 0;
                        }
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        int v0_0 = this.a;
        long v3_1 = this.b;
        return (((((this.a().getClass().hashCode() + (((((int) (v0_0 ^ (v0_0 >> 32))) * 31) + ((int) ((v3_1 >> 32) ^ v3_1))) * 31)) * 31) + this.d) * 31) + this.e);
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder("\n");
        v0_1.append(d3.c.getName());
        v0_1.append(123);
        v0_1.append(Integer.toHexString(System.identityHashCode(this)));
        v0_1.append(" delay: ");
        v0_1.append(this.a);
        v0_1.append(" duration: ");
        v0_1.append(this.b);
        v0_1.append(" interpolator: ");
        v0_1.append(this.a().getClass());
        v0_1.append(" repeatCount: ");
        v0_1.append(this.d);
        v0_1.append(" repeatMode: ");
        v0_1.append(this.e);
        v0_1.append("}\n");
        return v0_1.toString();
    }
}
