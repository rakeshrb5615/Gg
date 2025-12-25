package com.google.firebase.abt.component;
public class AbtRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public AbtRegistrar()
    {
        return;
    }

    public static synthetic s4.a a(a5.z p0)
    {
        return com.google.firebase.abt.component.AbtRegistrar.lambda$getComponents$0(p0);
    }

    private static synthetic s4.a lambda$getComponents$0(a5.d p3)
    {
        return new s4.a(((android.content.Context) p3.a(android.content.Context)), p3.f(u4.b));
    }

    public java.util.List getComponents()
    {
        java.util.List v0_2 = a5.c.b(s4.a);
        v0_2.a = "fire-abt";
        v0_2.a(a5.m.c(android.content.Context));
        v0_2.a(a5.m.a(u4.b));
        v0_2.f = new r2.q(9);
        return java.util.Arrays.asList(new a5.c[] {v0_2.b(), j5.t1.j("fire-abt", "21.1.1")}));
    }
}
