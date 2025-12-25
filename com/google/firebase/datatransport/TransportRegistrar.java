package com.google.firebase.datatransport;
public class TransportRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public TransportRegistrar()
    {
        return;
    }

    public static synthetic o2.g a(a5.z p0)
    {
        return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$2(p0);
    }

    public static synthetic o2.g b(a5.z p0)
    {
        return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$1(p0);
    }

    public static synthetic o2.g c(a5.z p0)
    {
        return com.google.firebase.datatransport.TransportRegistrar.lambda$getComponents$0(p0);
    }

    private static synthetic o2.g lambda$getComponents$0(a5.d p1)
    {
        r2.r.b(((android.content.Context) p1.a(android.content.Context)));
        return r2.r.a().c(p2.a.f);
    }

    private static synthetic o2.g lambda$getComponents$1(a5.d p1)
    {
        r2.r.b(((android.content.Context) p1.a(android.content.Context)));
        return r2.r.a().c(p2.a.f);
    }

    private static synthetic o2.g lambda$getComponents$2(a5.d p1)
    {
        r2.r.b(((android.content.Context) p1.a(android.content.Context)));
        return r2.r.a().c(p2.a.e);
    }

    public java.util.List getComponents()
    {
        a5.c v1_1 = a5.c.b(o2.g);
        v1_1.a = "fire-transport";
        v1_1.a(a5.m.c(android.content.Context));
        v1_1.f = new r2.q(1);
        a5.c v1_0 = v1_1.b();
        a5.c v4_3 = a5.c.a(new a5.x(r5.a, o2.g));
        v4_3.a(a5.m.c(android.content.Context));
        v4_3.f = new r2.q(2);
        a5.c v4_4 = v4_3.b();
        java.util.List v0_1 = a5.c.a(new a5.x(r5.b, o2.g));
        v0_1.a(a5.m.c(android.content.Context));
        v0_1.f = new r2.q(3);
        return java.util.Arrays.asList(new a5.c[] {v1_0, v4_4, v0_1.b(), j5.t1.j("fire-transport", "19.0.0")}));
    }
}
