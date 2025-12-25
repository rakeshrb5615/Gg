package com.google.firebase.auth;
public class FirebaseAuthRegistrar implements com.google.firebase.components.ComponentRegistrar {

    public FirebaseAuthRegistrar()
    {
        return;
    }

    public static com.google.firebase.auth.FirebaseAuth lambda$getComponents$0(a5.x p8, a5.x p9, a5.x p10, a5.x p11, a5.x p12, a5.d p13)
    {
        q4.f v2_1 = ((q4.f) p13.a(q4.f));
        c6.b v3 = p13.f(x4.a);
        c6.b v4 = p13.f(a6.f);
        p13.e(p8);
        java.util.concurrent.Executor v5_1 = ((java.util.concurrent.Executor) p13.e(p9));
        p13.e(p10);
        return new z4.d(v2_1, v3, v4, v5_1, ((java.util.concurrent.ScheduledExecutorService) p13.e(p11)), ((java.util.concurrent.Executor) p13.e(p12)));
    }

    public java.util.List getComponents()
    {
        java.util.List v0_1 = new a5.x(w4.a, java.util.concurrent.Executor);
        a5.c v1_2 = new a5.x(w4.b, java.util.concurrent.Executor);
        String v3_5 = new a5.x(w4.c, java.util.concurrent.Executor);
        a5.x v5_1 = new a5.x(w4.c, java.util.concurrent.ScheduledExecutorService);
        int v4_1 = new a5.x(w4.d, java.util.concurrent.Executor);
        a5.b v6_3 = new a5.b(com.google.firebase.auth.FirebaseAuth, new Class[] {z4.a}));
        v6_3.a(a5.m.c(q4.f));
        v6_3.a(new a5.m(1, 1, a6.f));
        v6_3.a(new a5.m(v0_1, 1, 0));
        v6_3.a(new a5.m(v1_2, 1, 0));
        v6_3.a(new a5.m(v3_5, 1, 0));
        v6_3.a(new a5.m(v5_1, 1, 0));
        v6_3.a(new a5.m(v4_1, 1, 0));
        v6_3.a(a5.m.a(x4.a));
        a5.c v2_20 = new a2.b();
        v2_20.b = v0_1;
        v2_20.c = v1_2;
        v2_20.d = v3_5;
        v2_20.e = v5_1;
        v2_20.f = v4_1;
        v6_3.f = v2_20;
        java.util.List v0_2 = v6_3.b();
        a5.c v1_4 = new a6.e();
        a5.c v2_22 = a5.c.b(a6.e);
        v2_22.e = 1;
        v2_22.f = new a5.a(v1_4, 0);
        return java.util.Arrays.asList(new a5.c[] {v0_2, v2_22.b(), j5.t1.j("fire-auth", "24.0.1")}));
    }
}
