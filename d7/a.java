package d7;
public class a {
    public final Class a;
    public final reflect.Type b;
    public final int c;

    public a()
    {
        int v0_8 = this.getClass().getGenericSuperclass();
        if (!(v0_8 instanceof reflect.ParameterizedType)) {
            if (v0_8 == d7.a) {
                Class v1_1 = new StringBuilder("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee ");
                v1_1.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
                throw new IllegalStateException(v1_1.toString());
            }
        } else {
            int v0_2 = ((reflect.ParameterizedType) v0_8);
            if (v0_2.getRawType() == d7.a) {
                int v0_7 = y6.i.a(v0_2.getActualTypeArguments()[0]);
                if (!java.util.Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    d7.a.a(v0_7);
                }
                this.b = v0_7;
                this.a = y6.i.g(v0_7);
                this.c = v0_7.hashCode();
                return;
            }
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public a(reflect.Type p2)
    {
        java.util.Objects.requireNonNull(p2);
        int v2_3 = y6.i.a(((reflect.Type) p2));
        this.b = v2_3;
        this.a = y6.i.g(v2_3);
        this.c = v2_3.hashCode();
        return;
    }

    public static void a(reflect.Type p5)
    {
        if ((p5 instanceof reflect.TypeVariable)) {
            int v1_2 = new StringBuilder("TypeToken type argument must not contain a type variable; captured type variable ");
            v1_2.append(((reflect.TypeVariable) p5).getName());
            v1_2.append(" declared by ");
            v1_2.append(((reflect.TypeVariable) p5).getGenericDeclaration());
            v1_2.append("\nSee ");
            v1_2.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
            throw new IllegalArgumentException(v1_2.toString());
        } else {
            if (!(p5 instanceof reflect.GenericArrayType)) {
                int v1_0 = 0;
                if (!(p5 instanceof reflect.ParameterizedType)) {
                    if (!(p5 instanceof reflect.WildcardType)) {
                        if (p5 == null) {
                            throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
                        } else {
                            return;
                        }
                    } else {
                        int v0_7 = ((reflect.WildcardType) p5).getLowerBounds();
                        reflect.Type v2_2 = v0_7.length;
                        int v3 = 0;
                        while (v3 < v2_2) {
                            d7.a.a(v0_7[v3]);
                            v3++;
                        }
                        reflect.Type[] v5_10 = ((reflect.WildcardType) p5).getUpperBounds();
                        int v0_8 = v5_10.length;
                        while (v1_0 < v0_8) {
                            d7.a.a(v5_10[v1_0]);
                            v1_0++;
                        }
                    }
                } else {
                    int v0_9 = ((reflect.ParameterizedType) p5).getOwnerType();
                    if (v0_9 != 0) {
                        d7.a.a(v0_9);
                    }
                    reflect.Type[] v5_12 = ((reflect.ParameterizedType) p5).getActualTypeArguments();
                    int v0_10 = v5_12.length;
                    while (v1_0 < v0_10) {
                        d7.a.a(v5_12[v1_0]);
                        v1_0++;
                    }
                }
                return;
            } else {
                d7.a.a(((reflect.GenericArrayType) p5).getGenericComponentType());
                return;
            }
        }
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof d7.a)) || (!y6.i.d(this.b, ((d7.a) p2).b))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return this.c;
    }

    public final String toString()
    {
        return y6.i.k(this.b);
    }
}
