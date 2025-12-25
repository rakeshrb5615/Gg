package z8;
public final class y0 implements java.lang.reflect.WildcardType {
    public final reflect.Type a;
    public final reflect.Type b;

    public y0(reflect.Type[] p4, reflect.Type[] p5)
    {
        if (p5.length > 1) {
            throw new IllegalArgumentException();
        } else {
            if (p4.length != 1) {
                throw new IllegalArgumentException();
            } else {
                if (p5.length != 1) {
                    p4[0].getClass();
                    z8.z0.d(p4[0]);
                    this.b = 0;
                    this.a = p4[0];
                    return;
                } else {
                    p5[0].getClass();
                    z8.z0.d(p5[0]);
                    if (p4[0] != Object) {
                        throw new IllegalArgumentException();
                    } else {
                        this.b = p5[0];
                        this.a = Object;
                        return;
                    }
                }
            }
        }
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof reflect.WildcardType)) || (!z8.z0.e(this, ((reflect.WildcardType) p2)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final reflect.Type[] getLowerBounds()
    {
        reflect.Type[] v0_0 = this.b;
        if (v0_0 == null) {
            return z8.z0.a;
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
                v0_7.append(z8.z0.s(v1_2));
                return v0_7.toString();
            } else {
                return "?";
            }
        } else {
            String v1_1 = new StringBuilder("? super ");
            v1_1.append(z8.z0.s(v0_0));
            return v1_1.toString();
        }
    }
}
