package androidx.lifecycle;
public final class z0 {
    public static final c5.c b;
    public final Object a;

    static z0()
    {
        androidx.lifecycle.z0.b = new c5.c();
        return;
    }

    public z0(androidx.lifecycle.a1 p3, androidx.lifecycle.x0 p4)
    {
        kotlin.jvm.internal.j.e(p3, "store");
        o1.a v0_1 = o1.a.b;
        kotlin.jvm.internal.j.e(v0_1, "defaultCreationExtras");
        j6.s v1_2 = new j6.s(p3, p4, v0_1);
        this.a = v1_2;
        return;
    }

    public z0(androidx.lifecycle.j0 p1)
    {
        this.a = p1;
        return;
    }

    public androidx.lifecycle.v0 a(Class p5)
    {
        IllegalArgumentException v5_1 = kotlin.jvm.internal.s.a(p5);
        String v0_1 = ((j6.s) this.a);
        String v1_5 = v5_1.a;
        kotlin.jvm.internal.j.e(v1_5, "jClass");
        String v3 = 0;
        if ((!v1_5.isAnonymousClass()) && (!v1_5.isLocalClass())) {
            if (!v1_5.isArray()) {
                v3 = kotlin.jvm.internal.u.b(v1_5.getName());
                if (v3 == null) {
                    v3 = v1_5.getCanonicalName();
                }
            } else {
                String v1_0 = v1_5.getComponentType();
                if (v1_0.isPrimitive()) {
                    String v1_2 = kotlin.jvm.internal.u.b(v1_0.getName());
                    if (v1_2 != null) {
                        v3 = v1_2.concat("Array");
                    }
                }
                if (v3 == null) {
                    v3 = "kotlin.Array";
                }
            }
        }
        if (v3 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        } else {
            return v0_1.i(v5_1, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(v3));
        }
    }
}
