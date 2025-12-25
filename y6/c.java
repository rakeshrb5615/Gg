package y6;
public final class c {
    public final synthetic int a;
    public final java.util.List b;

    public c()
    {
        this.a = 0;
        this.b = java.util.Collections.EMPTY_LIST;
        return;
    }

    public c(java.util.List p2)
    {
        this.a = 1;
        this.b = p2;
        return;
    }

    public static String a(Class p2)
    {
        StringBuilder v0_0 = p2.getModifiers();
        if (!reflect.Modifier.isInterface(v0_0)) {
            if (!reflect.Modifier.isAbstract(v0_0)) {
                return 0;
            } else {
                StringBuilder v0_2 = new StringBuilder("Abstract classes can\'t be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: ");
                v0_2.append(p2.getName());
                v0_2.append("\nSee ");
                v0_2.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class"));
                return v0_2.toString();
            }
        } else {
            return "Interfaces can\'t be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(p2.getName());
        }
    }

    public y6.p b(d7.a p9, boolean p10)
    {
        int v0_0 = p9.b;
        String v9_1 = p9.a;
        Class v1_3 = java.util.Collections.EMPTY_MAP;
        if (v1_3.get(v0_0) != null) {
            throw new ClassCastException();
        } else {
            if (v1_3.get(v9_1) != null) {
                throw new ClassCastException();
            } else {
                Class v1_5;
                r2.q v4_1 = 0;
                if (!java.util.EnumSet.isAssignableFrom(v9_1)) {
                    if (v9_1 != java.util.EnumMap) {
                        v1_5 = 0;
                    } else {
                        v1_5 = new y6.b(1, v0_0);
                    }
                } else {
                    v1_5 = new y6.b(0, v0_0);
                }
                if (v1_5 == null) {
                    Class v1_11;
                    y6.i.e();
                    try {
                        if (!reflect.Modifier.isAbstract(v9_1.getModifiers())) {
                            Class v1_10 = v9_1.getDeclaredConstructor(0);
                            try {
                                v1_10.setAccessible(1);
                                int v5_0 = 0;
                            } catch (int v5_1) {
                                StringBuilder v6_1 = new StringBuilder("Failed making constructor \'");
                                v6_1.append(b7.c.b(v1_10));
                                v6_1.append("\' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: ");
                                v6_1.append(v5_1.getMessage());
                                v6_1.append(b7.c.e(v5_1));
                                v5_0 = v6_1.toString();
                            }
                            if (v5_0 == 0) {
                                v1_11 = new a5.a(v1_10, 26);
                            } else {
                                v1_11 = new y6.a(v5_0, 1);
                            }
                        } else {
                            v1_11 = 0;
                        }
                    } catch (NoSuchMethodException) {
                    }
                    if (v1_11 == null) {
                        if (!java.util.Collection.isAssignableFrom(v9_1)) {
                            if (java.util.Map.isAssignableFrom(v9_1)) {
                                if (v9_1.isAssignableFrom(y6.o)) {
                                    if ((v0_0 instanceof reflect.ParameterizedType)) {
                                        int v0_27 = ((reflect.ParameterizedType) v0_0).getActualTypeArguments();
                                        if ((v0_27.length == 0) || (y6.i.g(v0_27[0]) != String)) {
                                            if (!v9_1.isAssignableFrom(java.util.LinkedHashMap)) {
                                                if (!v9_1.isAssignableFrom(java.util.TreeMap)) {
                                                    if (!v9_1.isAssignableFrom(java.util.concurrent.ConcurrentHashMap)) {
                                                        if (v9_1.isAssignableFrom(java.util.concurrent.ConcurrentSkipListMap)) {
                                                            v4_1 = new r2.q(18);
                                                        }
                                                    } else {
                                                        v4_1 = new r2.q(17);
                                                    }
                                                } else {
                                                    v4_1 = new r2.q(16);
                                                }
                                            } else {
                                                v4_1 = new r2.q(15);
                                            }
                                            if (v4_1 == null) {
                                                int v0_22 = y6.c.a(v9_1);
                                                if (v0_22 == 0) {
                                                    if (p10 != null) {
                                                        return new a5.a(v9_1, 27);
                                                    } else {
                                                        a5.a v10_4 = new StringBuilder("Unable to create instance of ");
                                                        v10_4.append(v9_1);
                                                        v10_4.append("; Register an InstanceCreator or a TypeAdapter for this type.");
                                                        return new y6.a(v10_4.toString(), 2);
                                                    }
                                                } else {
                                                    return new y6.a(v0_22, 0);
                                                }
                                            } else {
                                                return v4_1;
                                            }
                                        }
                                    }
                                    v4_1 = new r2.q(23);
                                }
                            }
                        } else {
                            if (!v9_1.isAssignableFrom(java.util.ArrayList)) {
                                if (!v9_1.isAssignableFrom(java.util.LinkedHashSet)) {
                                    if (!v9_1.isAssignableFrom(java.util.TreeSet)) {
                                        if (v9_1.isAssignableFrom(java.util.ArrayDeque)) {
                                            v4_1 = new r2.q(22);
                                        }
                                    } else {
                                        v4_1 = new r2.q(21);
                                    }
                                } else {
                                    v4_1 = new r2.q(20);
                                }
                            } else {
                                v4_1 = new r2.q(19);
                            }
                        }
                    } else {
                        return v1_11;
                    }
                } else {
                    return v1_5;
                }
            }
        }
    }

    public String toString()
    {
        switch (this.a) {
            case 0:
                return java.util.Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }
}
