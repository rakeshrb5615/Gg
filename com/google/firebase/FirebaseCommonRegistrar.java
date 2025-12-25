package com.google.firebase;
public class FirebaseCommonRegistrar implements com.google.firebase.components.ComponentRegistrar {

    public FirebaseCommonRegistrar()
    {
        return;
    }

    public static String a(String p2)
    {
        return p2.replace(32, 95).replace(47, 95);
    }

    public final java.util.List getComponents()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        String v2_8 = a5.c.b(l6.b);
        v2_8.a(new a5.m(2, 0, l6.a));
        v2_8.f = new l4.h(1);
        v0_1.add(v2_8.b());
        String v2_7 = new a5.x(w4.a, java.util.concurrent.Executor);
        a5.b v6_4 = new a5.b(a6.d, new Class[] {a6.f, a6.g}));
        v6_4.a(a5.m.c(android.content.Context));
        v6_4.a(a5.m.c(q4.f));
        v6_4.a(new a5.m(2, 0, a6.e));
        v6_4.a(new a5.m(1, 1, l6.b));
        v6_4.a(new a5.m(v2_7, 1, 0));
        v6_4.f = new a6.b(v2_7, 0);
        v0_1.add(v6_4.b());
        v0_1.add(j5.t1.j("fire-android", String.valueOf(android.os.Build$VERSION.SDK_INT)));
        v0_1.add(j5.t1.j("fire-core", "22.0.1"));
        v0_1.add(j5.t1.j("device-name", com.google.firebase.FirebaseCommonRegistrar.a(android.os.Build.PRODUCT)));
        v0_1.add(j5.t1.j("device-model", com.google.firebase.FirebaseCommonRegistrar.a(android.os.Build.DEVICE)));
        v0_1.add(j5.t1.j("device-brand", com.google.firebase.FirebaseCommonRegistrar.a(android.os.Build.BRAND)));
        v0_1.add(j5.t1.r("android-target-sdk", new l4.h(14)));
        v0_1.add(j5.t1.r("android-min-sdk", new l4.h(15)));
        v0_1.add(j5.t1.r("android-platform", new l4.h(16)));
        v0_1.add(j5.t1.r("android-installer", new l4.h(17)));
        try {
            h7.c.b.getClass();
            a5.c v1_8 = "2.2.21";
        } catch (NoClassDefFoundError) {
            v1_8 = 0;
        }
        if (v1_8 != null) {
            v0_1.add(j5.t1.j("kotlin", v1_8));
        }
        return v0_1;
    }
}
