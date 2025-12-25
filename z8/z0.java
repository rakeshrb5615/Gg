package z8;
public abstract class z0 {
    public static final reflect.Type[] a = None;
    public static boolean b = True;
    public static reflect.Constructor c;

    static z0()
    {
        reflect.Type[] v0_1 = new reflect.Type[0];
        z8.z0.a = v0_1;
        return;
    }

    public static final Object b(z8.d p3, l7.c p4)
    {
        d8.n v0_1 = new d8.n(1, q4.b.C(p4));
        v0_1.r();
        v0_1.t(new z8.u(p3, 0));
        p3.f(new n8.b(v0_1, 1));
        return v0_1.q();
    }

    public static final Object c(z8.d p2, l7.c p3)
    {
        d8.n v0_1 = new d8.n(1, q4.b.C(p3));
        v0_1.r();
        v0_1.t(new z8.u(p2, 1));
        p2.f(new n8.b(v0_1, 2));
        return v0_1.q();
    }

    public static void d(reflect.Type p1)
    {
        if (((p1 instanceof Class)) && (((Class) p1).isPrimitive())) {
            throw new IllegalArgumentException();
        } else {
            return;
        }
    }

    public static boolean e(reflect.Type p5, reflect.Type p6)
    {
        if (p5 != p6) {
            if (!(p5 instanceof Class)) {
                if (!(p5 instanceof reflect.ParameterizedType)) {
                    if (!(p5 instanceof reflect.GenericArrayType)) {
                        if (!(p5 instanceof reflect.WildcardType)) {
                            if ((p5 instanceof reflect.TypeVariable)) {
                                if ((p6 instanceof reflect.TypeVariable)) {
                                    if ((((reflect.TypeVariable) p5).getGenericDeclaration() == ((reflect.TypeVariable) p6).getGenericDeclaration()) && (((reflect.TypeVariable) p5).getName().equals(((reflect.TypeVariable) p6).getName()))) {
                                        return 1;
                                    }
                                } else {
                                    return 0;
                                }
                            }
                            return 0;
                        } else {
                            if ((p6 instanceof reflect.WildcardType)) {
                                if ((!java.util.Arrays.equals(((reflect.WildcardType) p5).getUpperBounds(), ((reflect.WildcardType) p6).getUpperBounds())) || (!java.util.Arrays.equals(((reflect.WildcardType) p5).getLowerBounds(), ((reflect.WildcardType) p6).getLowerBounds()))) {
                                    return 0;
                                } else {
                                    return 1;
                                }
                            } else {
                                return 0;
                            }
                        }
                    } else {
                        if ((p6 instanceof reflect.GenericArrayType)) {
                            return z8.z0.e(((reflect.GenericArrayType) p5).getGenericComponentType(), ((reflect.GenericArrayType) p6).getGenericComponentType());
                        } else {
                            return 0;
                        }
                    }
                } else {
                    if ((p6 instanceof reflect.ParameterizedType)) {
                        reflect.GenericDeclaration v1_12;
                        reflect.GenericDeclaration v1_10 = ((reflect.ParameterizedType) p5).getOwnerType();
                        reflect.GenericDeclaration v3_2 = ((reflect.ParameterizedType) p6).getOwnerType();
                        if ((v1_10 != v3_2) && ((v1_10 == null) || (!v1_10.equals(v3_2)))) {
                            v1_12 = 0;
                        } else {
                            v1_12 = 1;
                        }
                        reflect.GenericDeclaration v3_4 = ((reflect.ParameterizedType) p5).getRawType().equals(((reflect.ParameterizedType) p6).getRawType());
                        boolean v5_12 = java.util.Arrays.equals(((reflect.ParameterizedType) p5).getActualTypeArguments(), ((reflect.ParameterizedType) p6).getActualTypeArguments());
                        if ((v1_12 == null) || ((v3_4 == null) || (!v5_12))) {
                            return 0;
                        } else {
                            return 1;
                        }
                    } else {
                        return 0;
                    }
                }
            } else {
                return p5.equals(p6);
            }
        } else {
            return 1;
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
                            return z8.z0.f(p4.getGenericInterfaces()[v1], v3_11[v1], p5);
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
                            return z8.z0.f(p4.getGenericSuperclass(), v3_3, p5);
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

    public static reflect.Type g(int p4, reflect.ParameterizedType p5)
    {
        String v0_0 = p5.getActualTypeArguments();
        if ((p4 < null) || (p4 >= v0_0.length)) {
            reflect.Type v4_5 = v1.a.p("Index ", p4, " not in range [0,");
            v4_5.append(v0_0.length);
            v4_5.append(") for ");
            v4_5.append(p5);
            throw new IllegalArgumentException(v4_5.toString());
        } else {
            reflect.Type v4_2 = v0_0[p4];
            if ((v4_2 instanceof reflect.WildcardType)) {
                v4_2 = ((reflect.WildcardType) v4_2).getUpperBounds()[0];
            }
            return v4_2;
        }
    }

    public static Class h(reflect.Type p3)
    {
        java.util.Objects.requireNonNull(p3, "type == null");
        if (!(p3 instanceof Class)) {
            if (!(p3 instanceof reflect.ParameterizedType)) {
                if (!(p3 instanceof reflect.GenericArrayType)) {
                    if (!(p3 instanceof reflect.TypeVariable)) {
                        if (!(p3 instanceof reflect.WildcardType)) {
                            StringBuilder v1_1 = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                            v1_1.append(p3);
                            v1_1.append("> is of type ");
                            v1_1.append(p3.getClass().getName());
                            throw new IllegalArgumentException(v1_1.toString());
                        } else {
                            return z8.z0.h(((reflect.WildcardType) p3).getUpperBounds()[0]);
                        }
                    } else {
                        return Object;
                    }
                } else {
                    return reflect.Array.newInstance(z8.z0.h(((reflect.GenericArrayType) p3).getGenericComponentType()), 0).getClass();
                }
            } else {
                String v3_15 = ((reflect.ParameterizedType) p3).getRawType();
                if (!(v3_15 instanceof Class)) {
                    throw new IllegalArgumentException();
                } else {
                    return ((Class) v3_15);
                }
            }
        } else {
            return ((Class) p3);
        }
    }

    public static reflect.Type i(reflect.Type p2, Class p3)
    {
        if (!java.util.Map.isAssignableFrom(p3)) {
            throw new IllegalArgumentException();
        } else {
            return z8.z0.p(p2, p3, z8.z0.f(p2, p3, java.util.Map));
        }
    }

    public static boolean j(reflect.Type p5)
    {
        if (!(p5 instanceof Class)) {
            if (!(p5 instanceof reflect.ParameterizedType)) {
                if (!(p5 instanceof reflect.GenericArrayType)) {
                    if (!(p5 instanceof reflect.TypeVariable)) {
                        if (!(p5 instanceof reflect.WildcardType)) {
                            String v0_3;
                            if (p5 != null) {
                                v0_3 = p5.getClass().getName();
                            } else {
                                v0_3 = "null";
                            }
                            StringBuilder v2_1 = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                            v2_1.append(p5);
                            v2_1.append("> is of type ");
                            v2_1.append(v0_3);
                            throw new IllegalArgumentException(v2_1.toString());
                        } else {
                            return 1;
                        }
                    } else {
                        return 1;
                    }
                } else {
                    return z8.z0.j(((reflect.GenericArrayType) p5).getGenericComponentType());
                }
            } else {
                String v5_7 = ((reflect.ParameterizedType) p5).getActualTypeArguments();
                String v3_1 = 0;
                while (v3_1 < v5_7.length) {
                    if (!z8.z0.j(v5_7[v3_1])) {
                        v3_1++;
                    } else {
                        return 1;
                    }
                }
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static Object k(reflect.Method p3, Object p4, Object[] p5)
    {
        invoke.MethodHandles$Lookup v0_0 = z8.z0.c;
        if (v0_0 == null) {
            v0_0 = invoke.MethodHandles$Lookup.getDeclaredConstructor(new Class[] {Class, Integer.TYPE}));
            v0_0.setAccessible(1);
            z8.z0.c = v0_0;
        }
        return ((invoke.MethodHandles$Lookup) v0_0.newInstance(new Object[] {j2.h, Integer.valueOf(-1)}))).unreflectSpecial(p3, j2.h).bindTo(p4).invokeWithArguments(p5);
    }

    public static boolean l(otation.Annotation[] p4, Class p5)
    {
        int v2 = 0;
        while (v2 < p4.length) {
            if (!p5.isInstance(p4[v2])) {
                v2++;
            } else {
                return 1;
            }
        }
        return 0;
    }

    public static varargs IllegalArgumentException m(reflect.Method p1, Exception p2, String p3, Object[] p4)
    {
        String v3_1 = String.format(p3, p4);
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append(v3_1);
        v0_1.append("\n    for method ");
        v0_1.append(p1.getDeclaringClass().getSimpleName());
        v0_1.append(".");
        v0_1.append(p1.getName());
        return new IllegalArgumentException(v0_1.toString(), p2);
    }

    public static varargs IllegalArgumentException n(reflect.Method p1, int p2, String p3, Object[] p4)
    {
        String v2_2 = z8.k0.b.c(p1, p2);
        StringBuilder v0_2 = new StringBuilder();
        v0_2.append(p3);
        v0_2.append(" (");
        v0_2.append(v2_2);
        v0_2.append(")");
        return z8.z0.m(p1, 0, v0_2.toString(), p4);
    }

    public static varargs IllegalArgumentException o(reflect.Method p1, Exception p2, int p3, String p4, Object[] p5)
    {
        String v3_2 = z8.k0.b.c(p1, p3);
        StringBuilder v0_2 = new StringBuilder();
        v0_2.append(p4);
        v0_2.append(" (");
        v0_2.append(v3_2);
        v0_2.append(")");
        return z8.z0.m(p1, p2, v0_2.toString(), p5);
    }

    public static reflect.Type p(reflect.Type p8, Class p9, reflect.Type p10)
    {
        while(true) {
            int v1 = 0;
            if (!(p10 instanceof reflect.TypeVariable)) {
                break;
            }
            reflect.ParameterizedType v0_3;
            reflect.ParameterizedType v0_2 = ((reflect.TypeVariable) p10).getGenericDeclaration();
            if (!(v0_2 instanceof Class)) {
                v0_3 = 0;
            } else {
                v0_3 = ((Class) v0_2);
            }
            reflect.ParameterizedType v0_7;
            if (v0_3 != null) {
                reflect.ParameterizedType v2_1 = z8.z0.f(p8, p9, v0_3);
                if (!(v2_1 instanceof reflect.ParameterizedType)) {
                    v0_7 = ((reflect.TypeVariable) p10);
                } else {
                    reflect.ParameterizedType v0_4 = v0_3.getTypeParameters();
                    while (v1 < v0_4.length) {
                        if (!((reflect.TypeVariable) p10).equals(v0_4[v1])) {
                            v1++;
                        } else {
                            v0_7 = ((reflect.ParameterizedType) v2_1).getActualTypeArguments()[v1];
                        }
                    }
                    throw new java.util.NoSuchElementException();
                }
            }
            if (v0_7 != ((reflect.TypeVariable) p10)) {
                p10 = v0_7;
            } else {
                return v0_7;
            }
        }
        if ((!(p10 instanceof Class)) || (!((Class) p10).isArray())) {
            if (!(p10 instanceof reflect.GenericArrayType)) {
                if (!(p10 instanceof reflect.ParameterizedType)) {
                    if ((p10 instanceof reflect.WildcardType)) {
                        p10 = ((reflect.WildcardType) p10);
                        reflect.ParameterizedType v0_9 = ((reflect.WildcardType) p10).getLowerBounds();
                        boolean v3_4 = ((reflect.WildcardType) p10).getUpperBounds();
                        if (v0_9.length != 1) {
                            if (v3_4.length == 1) {
                                z8.x0 v8_3 = z8.z0.p(p8, p9, v3_4[0]);
                                if (v8_3 != v3_4[0]) {
                                    reflect.Type[] v10_2 = new reflect.Type[1];
                                    v10_2[0] = v8_3;
                                    return new z8.y0(v10_2, z8.z0.a);
                                }
                            }
                        } else {
                            z8.x0 v8_5 = z8.z0.p(p8, p9, v0_9[0]);
                            if (v8_5 != v0_9[0]) {
                                reflect.Type[] v10_3 = new reflect.Type[1];
                                v10_3[0] = Object;
                                reflect.ParameterizedType v0_14 = new reflect.Type[1];
                                v0_14[0] = v8_5;
                                return new z8.y0(v10_3, v0_14);
                            }
                        }
                    }
                    return p10;
                } else {
                    reflect.ParameterizedType v0_17;
                    reflect.ParameterizedType v0_16 = ((reflect.ParameterizedType) p10).getOwnerType();
                    boolean v3_6 = z8.z0.p(p8, p9, v0_16);
                    if (v3_6 == v0_16) {
                        v0_17 = 0;
                    } else {
                        v0_17 = 1;
                    }
                    reflect.Type[] v4_1 = ((reflect.ParameterizedType) p10).getActualTypeArguments();
                    int v5 = v4_1.length;
                    while (v1 < v5) {
                        reflect.Type v6_1 = z8.z0.p(p8, p9, v4_1[v1]);
                        if (v6_1 != v4_1[v1]) {
                            if (v0_17 == null) {
                                v4_1 = ((reflect.Type[]) v4_1.clone());
                                v0_17 = 1;
                            }
                            v4_1[v1] = v6_1;
                        }
                        v1++;
                    }
                    if (v0_17 == null) {
                        return ((reflect.ParameterizedType) p10);
                    } else {
                        return new z8.x0(v3_6, ((reflect.ParameterizedType) p10).getRawType(), v4_1);
                    }
                }
            } else {
                reflect.ParameterizedType v0_20 = ((reflect.GenericArrayType) p10).getGenericComponentType();
                z8.x0 v8_8 = z8.z0.p(p8, p9, v0_20);
                if (v0_20 != v8_8) {
                    return new z8.w0(v8_8);
                } else {
                    return ((reflect.GenericArrayType) p10);
                }
            }
        } else {
            reflect.Type[] v10_6 = ((Class) p10).getComponentType();
            z8.x0 v8_9 = z8.z0.p(p8, p9, v10_6);
            if (v10_6 != v8_9) {
                return new z8.w0(v8_9);
            } else {
                return ((Class) p10);
            }
        }
    }

    public static final void q(Throwable p4, l7.c p5)
    {
        z8.v v0_2;
        if (!(p5 instanceof z8.v)) {
            v0_2 = new z8.v(p5);
        } else {
            v0_2 = ((z8.v) p5);
            l7.h v1_3 = ((z8.v) p5).b;
            if ((v1_3 & -2147483648) == 0) {
            } else {
                ((z8.v) p5).b = (v1_3 - -2147483648);
            }
        }
        String v5_1 = v0_2.a;
        l7.h v1_1 = v0_2.b;
        if (v1_1 == null) {
            c4.b.e0(v5_1);
            v0_2.b = 1;
            d8.n0.a.i(v0_2.getContext(), new b5.l(11, v0_2, p4));
            return;
        } else {
            if (v1_1 == 1) {
                c4.b.e0(v5_1);
                throw new a5.o();
            } else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    public static void r(Throwable p1)
    {
        if ((p1 instanceof VirtualMachineError)) {
            throw ((VirtualMachineError) p1);
        } else {
            if ((p1 instanceof ThreadDeath)) {
                throw ((ThreadDeath) p1);
            } else {
                if ((p1 instanceof LinkageError)) {
                    throw ((LinkageError) p1);
                } else {
                    return;
                }
            }
        }
    }

    public static String s(reflect.Type p1)
    {
        if (!(p1 instanceof Class)) {
            return p1.toString();
        } else {
            return ((Class) p1).getName();
        }
    }

    public abstract void a();
}
