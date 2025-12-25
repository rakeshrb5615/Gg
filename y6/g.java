package y6;
public final class g implements java.lang.reflect.ParameterizedType, java.io.Serializable {
    public final reflect.Type a;
    public final reflect.Type b;
    public final reflect.Type[] c;

    public varargs g(reflect.Type p2, Class p3, reflect.Type[] p4)
    {
        java.util.Objects.requireNonNull(p3);
        if ((p2 == 0) && ((!reflect.Modifier.isStatic(p3.getModifiers())) && (p3.getDeclaringClass() != null))) {
            reflect.Type[] v4_2 = new StringBuilder("Must specify owner type for ");
            v4_2.append(p3);
            throw new IllegalArgumentException(v4_2.toString());
        } else {
            int v2_3;
            if (p2 != 0) {
                v2_3 = y6.i.a(p2);
            } else {
                v2_3 = 0;
            }
            this.a = v2_3;
            this.b = y6.i.a(p3);
            int v2_6 = ((reflect.Type[]) p4.clone());
            this.c = v2_6;
            int v2_7 = v2_6.length;
            int v3_2 = 0;
            while (v3_2 < v2_7) {
                java.util.Objects.requireNonNull(this.c[v3_2]);
                y6.i.b(this.c[v3_2]);
                reflect.Type[] v4_7 = this.c;
                v4_7[v3_2] = y6.i.a(v4_7[v3_2]);
                v3_2++;
            }
            return;
        }
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof reflect.ParameterizedType)) || (!y6.i.d(this, ((reflect.ParameterizedType) p2)))) {
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
        int v1 = v0_0.length;
        int v2_5 = this.b;
        if (v1 != 0) {
            StringBuilder v3_1 = new StringBuilder(((v1 + 1) * 30));
            v3_1.append(y6.i.k(v2_5));
            v3_1.append("<");
            v3_1.append(y6.i.k(v0_0[0]));
            int v2_4 = 1;
            while (v2_4 < v1) {
                v3_1.append(", ");
                v3_1.append(y6.i.k(v0_0[v2_4]));
                v2_4++;
            }
            v3_1.append(">");
            return v3_1.toString();
        } else {
            return y6.i.k(v2_5);
        }
    }
}
