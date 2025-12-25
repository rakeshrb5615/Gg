package com.google.firebase.installations;
public class FirebaseInstallationsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public FirebaseInstallationsRegistrar()
    {
        return;
    }

    public static synthetic d6.d a(a5.z p0)
    {
        return com.google.firebase.installations.FirebaseInstallationsRegistrar.lambda$getComponents$0(p0);
    }

    private static d6.d lambda$getComponents$0(a5.d p7)
    {
        return new d6.c(((q4.f) p7.a(q4.f)), p7.f(a6.f), ((java.util.concurrent.ExecutorService) p7.e(new a5.x(w4.a, java.util.concurrent.ExecutorService))), new b5.m(((java.util.concurrent.Executor) p7.e(new a5.x(w4.b, java.util.concurrent.Executor)))));
    }

    public java.util.List getComponents()
    {
        java.util.List v0_1 = a5.c.b(d6.d);
        v0_1.a = "fire-installations";
        v0_1.a(a5.m.c(q4.f));
        v0_1.a(a5.m.a(a6.f));
        v0_1.a(new a5.m(new a5.x(w4.a, java.util.concurrent.ExecutorService), 1, 0));
        v0_1.a(new a5.m(new a5.x(w4.b, java.util.concurrent.Executor), 1, 0));
        v0_1.f = new a5.t(7);
        java.util.List v0_2 = v0_1.b();
        a5.c v2_8 = new a6.e();
        String v3_8 = a5.c.b(a6.e);
        v3_8.e = 1;
        v3_8.f = new a5.a(v2_8, 0);
        return java.util.Arrays.asList(new a5.c[] {v0_2, v3_8.b(), j5.t1.j("fire-installations", "19.0.1")}));
    }
}
