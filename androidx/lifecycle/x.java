package androidx.lifecycle;
public abstract class x {
    public static final java.util.HashMap a;
    public static final java.util.HashMap b;

    static x()
    {
        androidx.lifecycle.x.a = new java.util.HashMap();
        androidx.lifecycle.x.b = new java.util.HashMap();
        return;
    }

    public static void a(reflect.Constructor p0, androidx.lifecycle.t p1)
    {
        try {
            kotlin.jvm.internal.j.b(p0.newInstance(new Object[] {p1})));
            throw new ClassCastException();
        } catch (reflect.InvocationTargetException v0_2) {
            throw new RuntimeException(v0_2);
        } catch (reflect.InvocationTargetException v0_1) {
            throw new RuntimeException(v0_1);
        } catch (reflect.InvocationTargetException v0_6) {
            throw new RuntimeException(v0_6);
        }
    }

    public static int b(Class p13)
    {
        IllegalArgumentException v0_0 = androidx.lifecycle.x.a;
        java.util.ArrayList v1_7 = ((Integer) v0_0.get(p13));
        if (v1_7 == null) {
            String v2 = 1;
            if (p13.getCanonicalName() != null) {
                java.util.ArrayList v1_2 = 0;
                try {
                    java.util.Collection v3_5;
                    java.util.Collection v3_1 = p13.getPackage();
                    boolean v4_0 = p13.getCanonicalName();
                } catch (ClassNotFoundException) {
                    java.util.Collection v3_8 = 0;
                    StringBuilder v5_9 = androidx.lifecycle.x.b;
                    if (v3_8 == null) {
                        java.util.Collection v3_11;
                        java.util.Collection v3_9 = androidx.lifecycle.d.c;
                        Class v6_2 = v3_9.b;
                        int v7_5 = ((Boolean) v6_2.get(p13));
                        if (v7_5 == 0) {
                            try {
                                int v7_6 = p13.getDeclaredMethods();
                                java.util.Collection v10_3 = 0;
                            } catch (NoClassDefFoundError v13_3) {
                                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", v13_3);
                            }
                            while (v10_3 < v7_6.length) {
                                if (((androidx.lifecycle.f0) v7_6[v10_3].getAnnotation(androidx.lifecycle.f0)) == null) {
                                    v10_3++;
                                } else {
                                    v3_9.a(p13, v7_6);
                                    v3_11 = 1;
                                }
                            }
                            v6_2.put(p13, Boolean.FALSE);
                            v3_11 = 0;
                        } else {
                            v3_11 = v7_5.booleanValue();
                        }
                        if (v3_11 == null) {
                            int v7_1;
                            java.util.Collection v3_0 = p13.getSuperclass();
                            if ((v3_0 == null) || (!androidx.lifecycle.t.isAssignableFrom(v3_0))) {
                                v7_1 = 0;
                            } else {
                                v7_1 = 1;
                            }
                            if (v7_1 != 0) {
                                kotlin.jvm.internal.j.b(v3_0);
                                if (androidx.lifecycle.x.b(v3_0) != 1) {
                                    java.util.Collection v3_2 = v5_9.get(v3_0);
                                    kotlin.jvm.internal.j.b(v3_2);
                                    v1_2 = new java.util.ArrayList(((java.util.Collection) v3_2));
                                } else {
                                    v0_0.put(p13, Integer.valueOf(v2));
                                    return v2;
                                }
                            }
                            java.util.Collection v3_4 = p13.getInterfaces();
                            kotlin.jvm.internal.j.d(v3_4, "getInterfaces(...)");
                            int v7_3 = v3_4.length;
                            int v9_0 = 0;
                            while (v9_0 < v7_3) {
                                int v11_1;
                                java.util.Collection v10_0 = v3_4[v9_0];
                                if ((v10_0 == null) || (!androidx.lifecycle.t.isAssignableFrom(v10_0))) {
                                    v11_1 = 0;
                                } else {
                                    v11_1 = 1;
                                }
                                if (v11_1 != 0) {
                                    kotlin.jvm.internal.j.b(v10_0);
                                    if (androidx.lifecycle.x.b(v10_0) != 1) {
                                        if (v1_2 == null) {
                                            v1_2 = new java.util.ArrayList();
                                        }
                                        java.util.Collection v10_1 = v5_9.get(v10_0);
                                        kotlin.jvm.internal.j.b(v10_1);
                                        v1_2.addAll(((java.util.Collection) v10_1));
                                    }
                                }
                                v9_0++;
                            }
                            if (v1_2 == null) {
                                v0_0.put(p13, Integer.valueOf(v2));
                                return v2;
                            } else {
                                v5_9.put(p13, v1_2);
                            }
                        }
                    } else {
                        v5_9.put(p13, a.a.G(v3_8));
                    }
                    v2 = 2;
                } catch (NoClassDefFoundError v13_2) {
                    throw new RuntimeException(v13_2);
                }
                if (v3_1 == null) {
                    v3_5 = "";
                } else {
                    v3_5 = v3_1.getName();
                }
                kotlin.jvm.internal.j.b(v3_5);
                if (v3_5.length() != 0) {
                    kotlin.jvm.internal.j.b(v4_0);
                    v4_0 = v4_0.substring((v3_5.length() + 1));
                    kotlin.jvm.internal.j.d(v4_0, "substring(...)");
                } else {
                }
                kotlin.jvm.internal.j.b(v4_0);
                boolean v4_2 = b8.p.n0(v4_0, ".", "_").concat("_LifecycleAdapter");
                if (v3_5.length() != 0) {
                    StringBuilder v5_8 = new StringBuilder();
                    v5_8.append(v3_5);
                    v5_8.append(46);
                    v5_8.append(v4_2);
                    v4_2 = v5_8.toString();
                } else {
                }
                v3_8 = Class.forName(v4_2).getDeclaredConstructor(new Class[] {p13}));
                if (v3_8.isAccessible()) {
                } else {
                    v3_8.setAccessible(1);
                }
            }
            v0_0.put(p13, Integer.valueOf(v2));
            return v2;
        } else {
            return v1_7.intValue();
        }
    }
}
