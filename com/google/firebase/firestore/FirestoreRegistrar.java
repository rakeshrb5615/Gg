package com.google.firebase.firestore;
public class FirestoreRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    public FirestoreRegistrar()
    {
        return;
    }

    public static synthetic y5.a a(a5.z p0)
    {
        return com.google.firebase.firestore.FirestoreRegistrar.lambda$getComponents$0(p0);
    }

    private static y5.a lambda$getComponents$0(a5.d p3)
    {
        p3.a(android.content.Context);
        q4.f v1_4 = ((q4.f) p3.a(q4.f));
        p3.h(z4.a);
        p3.h(x4.a);
        p3.f(l6.b);
        p3.f(a6.g);
        p3.a(q4.j);
        y5.a v0_1 = new y5.a();
        new java.util.HashMap();
        v1_4.a();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_1);
        v1_4.j.add(v0_1);
        return v0_1;
    }

    public java.util.List getComponents()
    {
        java.util.List v0_1 = a5.c.b(y5.a);
        v0_1.a = "fire-fst";
        v0_1.a(a5.m.c(q4.f));
        v0_1.a(a5.m.c(android.content.Context));
        v0_1.a(a5.m.a(a6.g));
        v0_1.a(a5.m.a(l6.b));
        v0_1.a(new a5.m(0, 2, z4.a));
        v0_1.a(new a5.m(0, 2, x4.a));
        v0_1.a(new a5.m(0, 0, q4.j));
        v0_1.f = new r2.q(14);
        return java.util.Arrays.asList(new a5.c[] {v0_1.b(), j5.t1.j("fire-fst", "26.0.2")}));
    }
}
