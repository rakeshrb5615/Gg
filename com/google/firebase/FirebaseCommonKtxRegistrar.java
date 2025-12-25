package com.google.firebase;
public final class FirebaseCommonKtxRegistrar implements com.google.firebase.components.ComponentRegistrar {

    public FirebaseCommonKtxRegistrar()
    {
        return;
    }

    public java.util.List getComponents()
    {
        java.util.List v0_3 = a5.c.a(new a5.x(w4.a, d8.a0));
        v0_3.a(new a5.m(new a5.x(w4.a, java.util.concurrent.Executor), 1, 0));
        v0_3.f = q4.g.b;
        java.util.List v0_1 = v0_3.b();
        a5.c v1_5 = a5.c.a(new a5.x(w4.c, d8.a0));
        v1_5.a(new a5.m(new a5.x(w4.c, java.util.concurrent.Executor), 1, 0));
        v1_5.f = q4.g.c;
        a5.c v1_6 = v1_5.b();
        a5.c v3_6 = a5.c.a(new a5.x(w4.b, d8.a0));
        v3_6.a(new a5.m(new a5.x(w4.b, java.util.concurrent.Executor), 1, 0));
        v3_6.f = q4.g.d;
        a5.c v3_7 = v3_6.b();
        a5.c v2_1 = a5.c.a(new a5.x(w4.d, d8.a0));
        v2_1.a(new a5.m(new a5.x(w4.d, java.util.concurrent.Executor), 1, 0));
        v2_1.f = q4.g.e;
        return i7.h.V(new a5.c[] {v0_1, v1_6, v3_7, v2_1.b()}));
    }
}
