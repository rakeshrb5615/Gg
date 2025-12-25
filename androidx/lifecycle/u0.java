package androidx.lifecycle;
public abstract class u0 {
    public static final java.util.List a;
    public static final java.util.List b;

    static u0()
    {
        androidx.lifecycle.u0.a = a.a.H(new Class[] {android.app.Application, androidx.lifecycle.n0}));
        androidx.lifecycle.u0.b = a.a.G(androidx.lifecycle.n0);
        return;
    }

    public static final reflect.Constructor a(Class p6, java.util.List p7)
    {
        kotlin.jvm.internal.j.e(p7, "signature");
        UnsupportedOperationException v0_2 = p6.getConstructors();
        kotlin.jvm.internal.j.d(v0_2, "getConstructors(...)");
        StringBuilder v1_3 = v0_2.length;
        String v2_1 = 0;
        while (v2_1 < v1_3) {
            boolean v3_0 = v0_2[v2_1];
            java.util.List v4_0 = v3_0.getParameterTypes();
            kotlin.jvm.internal.j.d(v4_0, "getParameterTypes(...)");
            java.util.List v4_1 = i7.h.i0(v4_0);
            if (!p7.equals(v4_1)) {
                if ((p7.size() == v4_1.size()) && (v4_1.containsAll(p7))) {
                    StringBuilder v1_1 = new StringBuilder("Class ");
                    v1_1.append(p6.getSimpleName());
                    v1_1.append(" must have parameters in the proper order: ");
                    v1_1.append(p7);
                    throw new UnsupportedOperationException(v1_1.toString());
                } else {
                    v2_1++;
                }
            } else {
                return v3_0;
            }
        }
        return 0;
    }

    public static final varargs androidx.lifecycle.v0 b(Class p2, reflect.Constructor p3, Object[] p4)
    {
        try {
            return ((androidx.lifecycle.v0) p3.newInstance(java.util.Arrays.copyOf(p4, p4.length)));
        } catch (Throwable v3_3) {
            StringBuilder v0_5 = new StringBuilder("Failed to access ");
            v0_5.append(p2);
            throw new RuntimeException(v0_5.toString(), v3_3);
        } catch (Throwable v3_2) {
            StringBuilder v0_3 = new StringBuilder("A ");
            v0_3.append(p2);
            v0_3.append(" cannot be instantiated.");
            throw new RuntimeException(v0_3.toString(), v3_2);
        } catch (Throwable v3_6) {
            StringBuilder v0_1 = new StringBuilder("An exception happened in constructor of ");
            v0_1.append(p2);
            throw new RuntimeException(v0_1.toString(), v3_6.getCause());
        }
    }
}
