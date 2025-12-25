package com.google.firebase.remoteconfig;
public class RemoteConfigRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public RemoteConfigRegistrar()
    {
        return;
    }

    public static synthetic m6.j a(a5.x p0, a5.z p1)
    {
        return com.google.firebase.remoteconfig.RemoteConfigRegistrar.lambda$getComponents$0(p0, p1);
    }

    private static m6.j lambda$getComponents$0(a5.x p9, a5.d p10)
    {
        android.content.Context v1_2 = ((android.content.Context) p10.a(android.content.Context));
        java.util.concurrent.ScheduledExecutorService v2_1 = ((java.util.concurrent.ScheduledExecutorService) p10.e(p9));
        q4.f v3_1 = ((q4.f) p10.a(q4.f));
        d6.d v4_1 = ((d6.d) p10.a(d6.d));
        Class v9_6 = ((s4.a) p10.a(s4.a));
        if (!v9_6.a.containsKey("frc")) {
            v9_6.a.put("frc", new r4.c(v9_6.b));
        }
        return new m6.j(v1_2, v2_1, v3_1, v4_1, ((r4.c) v9_6.a.get("frc")), p10.f(u4.b));
    }

    public java.util.List getComponents()
    {
        java.util.List v0_1 = new a5.x(w4.b, java.util.concurrent.ScheduledExecutorService);
        String v2_3 = new a5.b(m6.j, new Class[] {p6.a}));
        v2_3.a = "fire-rc";
        v2_3.a(a5.m.c(android.content.Context));
        v2_3.a(new a5.m(v0_1, 1, 0));
        v2_3.a(a5.m.c(q4.f));
        v2_3.a(a5.m.c(d6.d));
        v2_3.a(a5.m.c(s4.a));
        v2_3.a(a5.m.a(u4.b));
        v2_3.f = new a6.b(v0_1, 2);
        v2_3.c(2);
        return java.util.Arrays.asList(new a5.c[] {v2_3.b(), j5.t1.j("fire-rc", "23.0.1")}));
    }
}
