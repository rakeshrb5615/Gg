package p7;
public abstract class a {
    public static final reflect.Method a;

    static a()
    {
        reflect.Method[] v1 = Throwable.getMethods();
        kotlin.jvm.internal.j.b(v1);
        boolean v2_3 = v1.length;
        int v3 = 0;
        String v4_0 = 0;
        while(true) {
            reflect.Method v5_0 = 0;
            if (v4_0 < v2_3) {
                reflect.Method v6 = v1[v4_0];
                if (kotlin.jvm.internal.j.a(v6.getName(), "addSuppressed")) {
                    Class[] v7_2 = v6.getParameterTypes();
                    kotlin.jvm.internal.j.d(v7_2, "getParameterTypes(...)");
                    if (v7_2.length == 1) {
                        v5_0 = v7_2[0];
                    }
                    if (kotlin.jvm.internal.j.a(v5_0, Throwable)) {
                        break;
                    }
                }
                v4_0++;
            }
            p7.a.a = v5_0;
            while (v3 < v1.length) {
                if (!kotlin.jvm.internal.j.a(v1[v3].getName(), "getSuppressed")) {
                    v3++;
                } else {
                    return;
                }
            }
            return;
        }
        v5_0 = v6;
    }
}
