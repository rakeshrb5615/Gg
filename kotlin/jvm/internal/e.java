package kotlin.jvm.internal;
public final class e implements z7.c, kotlin.jvm.internal.d {
    public static final java.util.Map b;
    public final Class a;

    static e()
    {
        Class v3 = u7.p;
        h7.f v5 = u7.r;
        Class v7 = u7.t;
        Class v9 = u7.v;
        Class v11 = u7.b;
        Class v13 = u7.d;
        Class v15 = u7.f;
        Class v17 = u7.h;
        Class v19 = u7.j;
        Class v21 = u7.m;
        int v0_1 = i7.h.V(new Class[] {u7.a, u7.o}));
        java.util.ArrayList v1_2 = new java.util.ArrayList(i7.j.X(v0_1, 10));
        int v0_2 = v0_1.iterator();
        int v2_2 = 0;
        while (v0_2.hasNext()) {
            Class v3_1 = v0_2.next();
            int v4 = (v2_2 + 1);
            if (v2_2 < 0) {
                a.a.V();
                throw 0;
            } else {
                v1_2.add(new h7.f(((Class) v3_1), Integer.valueOf(v2_2)));
                v2_2 = v4;
            }
        }
        kotlin.jvm.internal.e.b = i7.r.q0(v1_2);
        return;
    }

    public e(Class p2)
    {
        kotlin.jvm.internal.j.e(p2, "jClass");
        this.a = p2;
        return;
    }

    public final Class a()
    {
        return this.a;
    }

    public final String b()
    {
        String v1_0 = this.a;
        kotlin.jvm.internal.j.e(v1_0, "jClass");
        String v2_0 = 0;
        if (!v1_0.isAnonymousClass()) {
            if (!v1_0.isLocalClass()) {
                if (!v1_0.isArray()) {
                    String v0_3 = kotlin.jvm.internal.u.d(v1_0.getName());
                    if (v0_3 == null) {
                        v0_3 = v1_0.getSimpleName();
                    }
                    return v0_3;
                } else {
                    String v0_4 = v1_0.getComponentType();
                    if (v0_4.isPrimitive()) {
                        String v0_6 = kotlin.jvm.internal.u.d(v0_4.getName());
                        if (v0_6 != null) {
                            v2_0 = v0_6.concat("Array");
                        }
                    }
                    if (v2_0 != null) {
                        return v2_0;
                    } else {
                        return "Array";
                    }
                }
            } else {
                String v0_7 = v1_0.getSimpleName();
                String v2_1 = v1_0.getEnclosingMethod();
                if (v2_1 == null) {
                    String v1_2 = v1_0.getEnclosingConstructor();
                    if (v1_2 == null) {
                        String v1_4 = b8.i.v0(v0_7, 36, 0, 6);
                        if (v1_4 != -1) {
                            String v0_9 = v0_7.substring((v1_4 + 1), v0_7.length());
                            kotlin.jvm.internal.j.d(v0_9, "substring(...)");
                            return v0_9;
                        } else {
                            return v0_7;
                        }
                    } else {
                        String v2_6 = new StringBuilder();
                        v2_6.append(v1_2.getName());
                        v2_6.append(36);
                        return b8.i.F0(v0_7, v2_6.toString(), v0_7);
                    }
                } else {
                    String v1_10 = new StringBuilder();
                    v1_10.append(v2_1.getName());
                    v1_10.append(36);
                    return b8.i.F0(v0_7, v1_10.toString(), v0_7);
                }
            }
        } else {
            return 0;
        }
    }

    public final boolean equals(Object p2)
    {
        if ((!(p2 instanceof kotlin.jvm.internal.e)) || (!q4.b.v(this).equals(q4.b.v(((z7.c) p2))))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final int hashCode()
    {
        return q4.b.v(this).hashCode();
    }

    public final String toString()
    {
        String v0_1 = new StringBuilder();
        v0_1.append(this.a.toString());
        v0_1.append(" (Kotlin reflection is not available)");
        return v0_1.toString();
    }
}
