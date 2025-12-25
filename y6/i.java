package y6;
public abstract class i {
    public static final reflect.Type[] a;

    static i()
    {
        reflect.Type[] v0_1 = new reflect.Type[0];
        y6.i.a = v0_1;
        return;
    }

    public static reflect.Type a(reflect.Type p3)
    {
        if (!(p3 instanceof Class)) {
            if (!(p3 instanceof reflect.ParameterizedType)) {
                if (!(p3 instanceof reflect.GenericArrayType)) {
                    if (!(p3 instanceof reflect.WildcardType)) {
                        return p3;
                    } else {
                        return new y6.h(((reflect.WildcardType) p3).getUpperBounds(), ((reflect.WildcardType) p3).getLowerBounds());
                    }
                } else {
                    return new y6.f(((reflect.GenericArrayType) p3).getGenericComponentType());
                }
            } else {
                return new y6.g(((reflect.ParameterizedType) p3).getOwnerType(), ((Class) ((reflect.ParameterizedType) p3).getRawType()), ((reflect.ParameterizedType) p3).getActualTypeArguments());
            }
        } else {
            if (!((Class) p3).isArray()) {
                return ((Class) p3);
            } else {
                return new y6.f(y6.i.a(((Class) p3).getComponentType()));
            }
        }
    }

    public static void b(reflect.Type p1)
    {
        if (((p1 instanceof Class)) && (((Class) p1).isPrimitive())) {
            throw new IllegalArgumentException("Primitive type is not allowed");
        } else {
            return;
        }
    }

    public static void c(String p4)
    {
        if (p4.length() > 10000) {
            StringBuilder v1_2 = new StringBuilder("Number string too large: ");
            v1_2.append(p4.substring(0, 30));
            v1_2.append("...");
            throw new NumberFormatException(v1_2.toString());
        } else {
            return;
        }
    }

    public static boolean d(reflect.Type p4, reflect.Type p5)
    {
        if (p4 != p5) {
            if (!(p4 instanceof Class)) {
                if (!(p4 instanceof reflect.ParameterizedType)) {
                    if (!(p4 instanceof reflect.GenericArrayType)) {
                        if (!(p4 instanceof reflect.WildcardType)) {
                            if ((p4 instanceof reflect.TypeVariable)) {
                                if ((p5 instanceof reflect.TypeVariable)) {
                                    if ((java.util.Objects.equals(((reflect.TypeVariable) p4).getGenericDeclaration(), ((reflect.TypeVariable) p5).getGenericDeclaration())) && (((reflect.TypeVariable) p4).getName().equals(((reflect.TypeVariable) p5).getName()))) {
                                        return 1;
                                    }
                                } else {
                                    return 0;
                                }
                            }
                            return 0;
                        } else {
                            if ((p5 instanceof reflect.WildcardType)) {
                                if ((!java.util.Arrays.equals(((reflect.WildcardType) p4).getUpperBounds(), ((reflect.WildcardType) p5).getUpperBounds())) || (!java.util.Arrays.equals(((reflect.WildcardType) p4).getLowerBounds(), ((reflect.WildcardType) p5).getLowerBounds()))) {
                                    return 0;
                                } else {
                                    return 1;
                                }
                            } else {
                                return 0;
                            }
                        }
                    } else {
                        if ((p5 instanceof reflect.GenericArrayType)) {
                            return y6.i.d(((reflect.GenericArrayType) p4).getGenericComponentType(), ((reflect.GenericArrayType) p5).getGenericComponentType());
                        } else {
                            return 0;
                        }
                    }
                } else {
                    if ((p5 instanceof reflect.ParameterizedType)) {
                        if ((!java.util.Objects.equals(((reflect.ParameterizedType) p4).getOwnerType(), ((reflect.ParameterizedType) p5).getOwnerType())) || ((!((reflect.ParameterizedType) p4).getRawType().equals(((reflect.ParameterizedType) p5).getRawType())) || (!java.util.Arrays.equals(((reflect.ParameterizedType) p4).getActualTypeArguments(), ((reflect.ParameterizedType) p5).getActualTypeArguments())))) {
                            return 0;
                        } else {
                            return 1;
                        }
                    } else {
                        return 0;
                    }
                }
            } else {
                return p4.equals(p5);
            }
        } else {
            return 1;
        }
    }

    public static void e()
    {
        ClassCastException v0_1 = java.util.Collections.EMPTY_LIST.iterator();
        if (v0_1.hasNext()) {
            throw v1.a.e(v0_1);
        } else {
            return;
        }
    }

    public static reflect.Type f(reflect.Type p3, Class p4, Class p5)
    {
        if (p5 != p4) {
            if (p5.isInterface()) {
                reflect.Type v3_11 = p4.getInterfaces();
                int v1 = 0;
                while (v1 < v3_11.length) {
                    boolean v2_0 = v3_11[v1];
                    if (v2_0 != p5) {
                        if (!p5.isAssignableFrom(v2_0)) {
                            v1++;
                        } else {
                            return y6.i.f(p4.getGenericInterfaces()[v1], v3_11[v1], p5);
                        }
                    } else {
                        return p4.getGenericInterfaces()[v1];
                    }
                }
            }
            if (!p4.isInterface()) {
                while (p4 != Object) {
                    reflect.Type v3_3 = p4.getSuperclass();
                    if (v3_3 != p5) {
                        if (!p5.isAssignableFrom(v3_3)) {
                            p4 = v3_3;
                        } else {
                            return y6.i.f(p4.getGenericSuperclass(), v3_3, p5);
                        }
                    } else {
                        return p4.getGenericSuperclass();
                    }
                }
            }
            return p5;
        } else {
            return p3;
        }
    }

    public static Class g(reflect.Type p4)
    {
        if (!(p4 instanceof Class)) {
            if (!(p4 instanceof reflect.ParameterizedType)) {
                if (!(p4 instanceof reflect.GenericArrayType)) {
                    if (!(p4 instanceof reflect.TypeVariable)) {
                        if (!(p4 instanceof reflect.WildcardType)) {
                            String v0_2;
                            if (p4 != null) {
                                v0_2 = p4.getClass().getName();
                            } else {
                                v0_2 = "null";
                            }
                            StringBuilder v2_1 = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                            v2_1.append(p4);
                            v2_1.append("> is of type ");
                            v2_1.append(v0_2);
                            throw new IllegalArgumentException(v2_1.toString());
                        } else {
                            return y6.i.g(((reflect.WildcardType) p4).getUpperBounds()[0]);
                        }
                    } else {
                        return Object;
                    }
                } else {
                    return reflect.Array.newInstance(y6.i.g(((reflect.GenericArrayType) p4).getGenericComponentType()), 0).getClass();
                }
            } else {
                return ((Class) ((reflect.ParameterizedType) p4).getRawType());
            }
        } else {
            return ((Class) p4);
        }
    }

    public static reflect.Type h(reflect.Type p1, Class p2, Class p3)
    {
        if ((p1 instanceof reflect.WildcardType)) {
            p1 = ((reflect.WildcardType) p1).getUpperBounds()[0];
        }
        if (!p3.isAssignableFrom(p2)) {
            StringBuilder v0_2 = new StringBuilder();
            v0_2.append(p2);
            v0_2.append(" is not the same as or a subtype of ");
            v0_2.append(p3);
            throw new IllegalArgumentException(v0_2.toString());
        } else {
            return y6.i.j(p1, p2, y6.i.f(p1, p2, p3), new java.util.HashMap());
        }
    }

    public static java.math.BigDecimal i(String p5)
    {
        y6.i.c(p5);
        NumberFormatException v0_3 = new java.math.BigDecimal(p5);
        if (Math.abs(((long) v0_3.scale())) >= 10000) {
            throw new NumberFormatException("Number has unsupported scale: ".concat(p5));
        } else {
            return v0_3;
        }
    }

    public static reflect.Type j(reflect.Type p10, Class p11, reflect.Type p12, java.util.HashMap p13)
    {
        boolean v1 = 0;
        do {
            int v3 = 0;
            if (!(p12 instanceof reflect.TypeVariable)) {
                if ((!(p12 instanceof Class)) || (!((Class) p12).isArray())) {
                    if (!(p12 instanceof reflect.GenericArrayType)) {
                        if (!(p12 instanceof reflect.ParameterizedType)) {
                            if (!(p12 instanceof reflect.WildcardType)) {
                                break;
                            }
                            p12 = ((reflect.WildcardType) p12);
                            Class v0_4 = ((reflect.WildcardType) p12).getLowerBounds();
                            reflect.ParameterizedType v4_5 = ((reflect.WildcardType) p12).getUpperBounds();
                            if (v0_4.length != 1) {
                                if (v4_5.length != 1) {
                                    break;
                                }
                                reflect.Type[] v10_5 = y6.i.j(p10, p11, v4_5[0], p13);
                                if (v10_5 == v4_5[0]) {
                                    break;
                                }
                                reflect.Type[] v10_6;
                                if (!(v10_5 instanceof reflect.WildcardType)) {
                                    reflect.Type[] v11_8 = new reflect.Type[1];
                                    v11_8[0] = v10_5;
                                    v10_6 = v11_8;
                                } else {
                                    v10_6 = ((reflect.WildcardType) v10_5).getUpperBounds();
                                }
                                p12 = new y6.h(v10_6, y6.i.a);
                                break;
                            } else {
                                reflect.Type[] v10_8 = y6.i.j(p10, p11, v0_4[0], p13);
                                if (v10_8 == v0_4[0]) {
                                    break;
                                }
                                reflect.Type[] v10_9;
                                if (!(v10_8 instanceof reflect.WildcardType)) {
                                    reflect.Type[] v11_12 = new reflect.Type[1];
                                    v11_12[0] = v10_8;
                                    v10_9 = v11_12;
                                } else {
                                    v10_9 = ((reflect.WildcardType) v10_8).getLowerBounds();
                                }
                                reflect.Type[] v11_13 = new reflect.Type[1];
                                v11_13[0] = Object;
                                p12 = new y6.h(v11_13, v10_9);
                                break;
                            }
                        } else {
                            p12 = ((reflect.ParameterizedType) p12);
                            Class v0_9 = ((reflect.ParameterizedType) p12).getOwnerType();
                            reflect.ParameterizedType v4_7 = y6.i.j(p10, p11, v0_9, p13);
                            Class v0_10 = java.util.Objects.equals(v4_7, v0_9);
                            int v5_4 = ((reflect.ParameterizedType) p12).getActualTypeArguments();
                            boolean v6_2 = v5_4.length;
                            reflect.Type[] v7_0 = v5_4;
                            int v5_5 = 0;
                            while (v3 < v6_2) {
                                reflect.Type v8_1 = y6.i.j(p10, p11, v7_0[v3], p13);
                                if (!java.util.Objects.equals(v8_1, v7_0[v3])) {
                                    if (v5_5 == 0) {
                                        v7_0 = ((reflect.Type[]) v7_0.clone());
                                        v5_5 = 1;
                                    }
                                    v7_0[v3] = v8_1;
                                }
                                v3++;
                            }
                            if ((v0_10 != null) && (v5_5 == 0)) {
                                break;
                            }
                            reflect.Type[] v11_3 = new y6.g(v4_7, ((Class) ((reflect.ParameterizedType) p12).getRawType()), v7_0);
                        }
                    } else {
                        p12 = ((reflect.GenericArrayType) p12);
                        Class v0_13 = ((reflect.GenericArrayType) p12).getGenericComponentType();
                        reflect.Type[] v10_1 = y6.i.j(p10, p11, v0_13, p13);
                        if (java.util.Objects.equals(v0_13, v10_1)) {
                            break;
                        }
                        v11_3 = new y6.f(v10_1);
                    }
                } else {
                    y6.h v12_1 = ((Class) p12).getComponentType();
                    reflect.Type[] v10_2 = y6.i.j(p10, p11, v12_1, p13);
                    if (!java.util.Objects.equals(v12_1, v10_2)) {
                        v11_3 = new y6.f(v10_2);
                    } else {
                        p12 = ((Class) p12);
                        break;
                    }
                }
                p12 = v11_3;
                break;
            } else {
                reflect.ParameterizedType v4_1 = ((reflect.Type) p13.get(((reflect.TypeVariable) p12)));
                int v5_0 = Void.TYPE;
                if (v4_1 == null) {
                    p13.put(((reflect.TypeVariable) p12), v5_0);
                    if (!v1) {
                        v1 = ((reflect.TypeVariable) p12);
                    }
                    y6.h v12_3;
                    y6.h v12_2 = ((reflect.TypeVariable) p12).getGenericDeclaration();
                    if (!(v12_2 instanceof Class)) {
                        v12_3 = 0;
                    } else {
                        v12_3 = ((Class) v12_2);
                    }
                    if (v12_3 != null) {
                        reflect.ParameterizedType v4_3 = y6.i.f(p10, p11, v12_3);
                        if (!(v4_3 instanceof reflect.ParameterizedType)) {
                            p12 = ((reflect.TypeVariable) p12);
                        } else {
                            y6.h v12_4 = v12_3.getTypeParameters();
                            while (v3 < v12_4.length) {
                                if (!((reflect.TypeVariable) p12).equals(v12_4[v3])) {
                                    v3++;
                                } else {
                                    p12 = ((reflect.ParameterizedType) v4_3).getActualTypeArguments()[v3];
                                }
                            }
                            throw new java.util.NoSuchElementException();
                        }
                    }
                } else {
                    if (v4_1 != v5_0) {
                        return v4_1;
                    } else {
                        return p12;
                    }
                }
            }
        } while(p12 != ((reflect.TypeVariable) p12));
        if (v1) {
            p13.put(v1, p12);
        }
        return p12;
    }

    public static String k(reflect.Type p1)
    {
        if (!(p1 instanceof Class)) {
            return p1.toString();
        } else {
            return ((Class) p1).getName();
        }
    }
}
