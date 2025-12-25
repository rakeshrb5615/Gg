package z8;
public final class x0 implements java.lang.reflect.ParameterizedType {
    public final reflect.Type a;
    public final reflect.Type b;
    public final reflect.Type[] c;

    public varargs x0(reflect.Type p5, reflect.Type p6, reflect.Type[] p7)
    {
        int v1 = 0;
        if ((p6 instanceof Class)) {
            reflect.Type v2_1;
            int v0_1 = 1;
            if (p5 != null) {
                v2_1 = 0;
            } else {
                v2_1 = 1;
            }
            if (((Class) p6).getEnclosingClass() != null) {
                v0_1 = 0;
            }
            if (v2_1 != v0_1) {
                throw new IllegalArgumentException();
            }
        }
        int v0_2 = p7.length;
        while (v1 < v0_2) {
            reflect.Type v2_0 = p7[v1];
            java.util.Objects.requireNonNull(v2_0, "typeArgument == null");
            z8.z0.d(v2_0);
            v1++;
        }
        this.a = p5;
        this.b = p6;
        this.c = ((reflect.Type[]) p7.clone());
        return;
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof reflect.ParameterizedType)) || (!z8.z0.e(this, ((reflect.ParameterizedType) p2)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final reflect.Type[] getActualTypeArguments()
    {
        return ((reflect.Type[]) this.c.clone());
    }

    public final reflect.Type getOwnerType()
    {
        return this.a;
    }

    public final reflect.Type getRawType()
    {
        return this.b;
    }

    public final int hashCode()
    {
        int v1_0;
        int v0_3 = (java.util.Arrays.hashCode(this.c) ^ this.b.hashCode());
        int v1_3 = this.a;
        if (v1_3 == 0) {
            v1_0 = 0;
        } else {
            v1_0 = v1_3.hashCode();
        }
        return (v0_3 ^ v1_0);
    }

    public final String toString()
    {
        String v0_0 = this.c;
        String v2_5 = this.b;
        if (v0_0.length != 0) {
            int v4 = 1;
            StringBuilder v1_2 = new StringBuilder(((v0_0.length + 1) * 30));
            v1_2.append(z8.z0.s(v2_5));
            v1_2.append("<");
            v1_2.append(z8.z0.s(v0_0[0]));
            while (v4 < v0_0.length) {
                v1_2.append(", ");
                v1_2.append(z8.z0.s(v0_0[v4]));
                v4++;
            }
            v1_2.append(">");
            return v1_2.toString();
        } else {
            return z8.z0.s(v2_5);
        }
    }
}
