package kotlin.jvm.internal;
public abstract class j {
    public static final Object[] a;

    static j()
    {
        Object[] v0_1 = new Object[0];
        kotlin.jvm.internal.j.a = v0_1;
        return;
    }

    public static boolean a(Object p0, Object p1)
    {
        if (p0 != 0) {
            return p0.equals(p1);
        } else {
            if (p1 != null) {
                return 0;
            } else {
                return 1;
            }
        }
    }

    public static void b(Object p1)
    {
        if (p1 == null) {
            NullPointerException v1_2 = new NullPointerException();
            kotlin.jvm.internal.j.h(v1_2, kotlin.jvm.internal.j.getName());
            throw v1_2;
        } else {
            return;
        }
    }

    public static void c(Object p0, String p1)
    {
        if (p0 == null) {
            NullPointerException v0_2 = new NullPointerException(p1);
            kotlin.jvm.internal.j.h(v0_2, kotlin.jvm.internal.j.getName());
            throw v0_2;
        } else {
            return;
        }
    }

    public static void d(Object p1, String p2)
    {
        if (p1 == null) {
            NullPointerException v1_2 = new NullPointerException(p2.concat(" must not be null"));
            kotlin.jvm.internal.j.h(v1_2, kotlin.jvm.internal.j.getName());
            throw v1_2;
        } else {
            return;
        }
    }

    public static void e(Object p6, String p7)
    {
        if (p6 != null) {
            return;
        } else {
            StringBuilder v0_4 = Thread.currentThread().getStackTrace();
            String v2_1 = kotlin.jvm.internal.j.getName();
            String v3_0 = 0;
            while (!v0_4[v3_0].getClassName().equals(v2_1)) {
                v3_0++;
            }
            while (v0_4[v3_0].getClassName().equals(v2_1)) {
                v3_0++;
            }
            StringBuilder v0_0 = v0_4[v3_0];
            StringBuilder v0_2 = v1.a.r("Parameter specified as non-null is null: method ", v0_0.getClassName(), ".", v0_0.getMethodName(), ", parameter ");
            v0_2.append(p7);
            NullPointerException v6_2 = new NullPointerException(v0_2.toString());
            kotlin.jvm.internal.j.h(v6_2, kotlin.jvm.internal.j.getName());
            throw v6_2;
        }
    }

    public static int f(int p0, int p1)
    {
        if (p0 >= p1) {
            if (p0 != p1) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }

    public static int g(long p0, long p2)
    {
        int v0_1 = p0 cmp p2;
        if (v0_1 >= 0) {
            if (v0_1 != 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }

    public static void h(RuntimeException p5, String p6)
    {
        StackTraceElement[] v0 = p5.getStackTrace();
        int v1 = v0.length;
        int v2_0 = -1;
        int v3 = 0;
        while (v3 < v1) {
            if (p6.equals(v0[v3].getClassName())) {
                v2_0 = v3;
            }
            v3++;
        }
        p5.setStackTrace(((StackTraceElement[]) java.util.Arrays.copyOfRange(v0, (v2_0 + 1), v1)));
        return;
    }

    public static void i(String p2)
    {
        a5.o v0_2 = new a5.o(v1.a.l("lateinit property ", p2, " has not been initialized"));
        kotlin.jvm.internal.j.h(v0_2, kotlin.jvm.internal.j.getName());
        throw v0_2;
    }

    public static final Object[] j(java.util.Collection p4)
    {
        Object[] v0_0 = p4.size();
        if (v0_0 != null) {
            OutOfMemoryError v4_4 = p4.iterator();
            if (v4_4.hasNext()) {
                Object[] v0_1 = new Object[v0_0];
                int v1_6 = 0;
                while(true) {
                    int v2 = (v1_6 + 1);
                    v0_1[v1_6] = v4_4.next();
                    if (v2 < v0_1.length) {
                        if (!v4_4.hasNext()) {
                            break;
                        }
                    } else {
                        if (v4_4.hasNext()) {
                            int v1_5 = (((v2 * 3) + 1) >> 1);
                            if (v1_5 <= v2) {
                                v1_5 = 2147483645;
                                if (v2 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            v0_1 = java.util.Arrays.copyOf(v0_1, v1_5);
                            kotlin.jvm.internal.j.d(v0_1, "copyOf(...)");
                        } else {
                            return v0_1;
                        }
                    }
                    v1_6 = v2;
                }
                OutOfMemoryError v4_1 = java.util.Arrays.copyOf(v0_1, v2);
                kotlin.jvm.internal.j.d(v4_1, "copyOf(...)");
                return v4_1;
            }
        }
        return kotlin.jvm.internal.j.a;
    }

    public static final Object[] k(java.util.Collection p5, Object[] p6)
    {
        Object[] v0_0 = p5.size();
        int v2_1 = 0;
        if (v0_0 != null) {
            OutOfMemoryError v5_6 = p5.iterator();
            if (v5_6.hasNext()) {
                Object[] v0_2;
                if (v0_0 > p6.length) {
                    Object[] v0_1 = reflect.Array.newInstance(p6.getClass().getComponentType(), v0_0);
                    kotlin.jvm.internal.j.c(v0_1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    v0_2 = ((Object[]) v0_1);
                } else {
                    v0_2 = p6;
                }
                while(true) {
                    int v3_4 = (v2_1 + 1);
                    v0_2[v2_1] = v5_6.next();
                    if (v3_4 < v0_2.length) {
                        if (!v5_6.hasNext()) {
                            break;
                        }
                    } else {
                        if (v5_6.hasNext()) {
                            int v2_6 = (((v3_4 * 3) + 1) >> 1);
                            if (v2_6 <= v3_4) {
                                v2_6 = 2147483645;
                                if (v3_4 >= 2147483645) {
                                    throw new OutOfMemoryError();
                                }
                            }
                            v0_2 = java.util.Arrays.copyOf(v0_2, v2_6);
                            kotlin.jvm.internal.j.d(v0_2, "copyOf(...)");
                        } else {
                            return v0_2;
                        }
                    }
                    v2_1 = v3_4;
                }
                if (v0_2 != p6) {
                    OutOfMemoryError v5_1 = java.util.Arrays.copyOf(v0_2, v3_4);
                    kotlin.jvm.internal.j.d(v5_1, "copyOf(...)");
                    return v5_1;
                } else {
                    p6[v3_4] = 0;
                    return p6;
                }
            } else {
                if (p6.length > 0) {
                    p6[0] = 0;
                }
            }
        } else {
            if (p6.length > 0) {
                p6[0] = 0;
                return p6;
            }
        }
        return p6;
    }
}
