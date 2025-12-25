package y6;
public final class h implements java.lang.reflect.WildcardType, java.io.Serializable {
    public final reflect.Type a;
    public final reflect.Type b;

    public h(reflect.Type[] p4, reflect.Type[] p5)
    {
        if (p5.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        } else {
            if (p4.length != 1) {
                throw new IllegalArgumentException("Exactly one upper bound must be specified");
            } else {
                if (p5.length != 1) {
                    java.util.Objects.requireNonNull(p4[0]);
                    y6.i.b(p4[0]);
                    this.b = 0;
                    this.a = y6.i.a(p4[0]);
                    return;
                } else {
                    java.util.Objects.requireNonNull(p5[0]);
                    y6.i.b(p5[0]);
                    if (p4[0] != Object) {
                        throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
                    } else {
                        this.b = y6.i.a(p5[0]);
                        this.a = Object;
                        return;
                    }
                }
            }
        }
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof reflect.WildcardType)) || (!y6.i.d(this, ((reflect.WildcardType) p2)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final reflect.Type[] getLowerBounds()
    {
        reflect.Type[] v0_0 = this.b;
        if (v0_0 == null) {
            return y6.i.a;
        } else {
            reflect.Type[] v1_1 = new reflect.Type[1];
            v1_1[0] = v0_0;
            return v1_1;
        }
    }

    public final reflect.Type[] getUpperBounds()
    {
        reflect.Type[] v0_1 = new reflect.Type[1];
        v0_1[0] = this.a;
        return v0_1;
    }

    public final int hashCode()
    {
        int v0_2;
        int v0_0 = this.b;
        if (v0_0 == 0) {
            v0_2 = 1;
        } else {
            v0_2 = (v0_0.hashCode() + 31);
        }
        return (v0_2 ^ (this.a.hashCode() + 31));
    }

    public final String toString()
    {
        String v0_0 = this.b;
        if (v0_0 == null) {
            String v1_2 = this.a;
            if (v1_2 != Object) {
                String v0_7 = new StringBuilder("? extends ");
                v0_7.append(y6.i.k(v1_2));
                return v0_7.toString();
            } else {
                return "?";
            }
        } else {
            String v1_1 = new StringBuilder("? super ");
            v1_1.append(y6.i.k(v0_0));
            return v1_1.toString();
        }
    }
}
