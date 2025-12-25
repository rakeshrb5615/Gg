package com.google.firebase.messaging;
public class FirebaseMessagingRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public FirebaseMessagingRegistrar()
    {
        return;
    }

    public static synthetic com.google.firebase.messaging.FirebaseMessaging a(a5.x p0, a5.z p1)
    {
        return com.google.firebase.messaging.FirebaseMessagingRegistrar.lambda$getComponents$0(p0, p1);
    }

    private static synthetic com.google.firebase.messaging.FirebaseMessaging lambda$getComponents$0(a5.x p7, a5.d p8)
    {
        if (p8.a(b6.a) != null) {
            throw new ClassCastException();
        } else {
            return new com.google.firebase.messaging.FirebaseMessaging(((q4.f) p8.a(q4.f)), p8.f(l6.b), p8.f(a6.g), ((d6.d) p8.a(d6.d)), p8.b(p7), ((x5.c) p8.a(x5.c)));
        }
    }

    public java.util.List getComponents()
    {
        java.util.List v0_1 = new a5.x(r5.b, o2.g);
        a5.c v1_4 = a5.c.b(com.google.firebase.messaging.FirebaseMessaging);
        v1_4.a = "fire-fcm";
        v1_4.a(a5.m.c(q4.f));
        v1_4.a(new a5.m(0, 0, b6.a));
        v1_4.a(a5.m.a(l6.b));
        v1_4.a(a5.m.a(a6.g));
        v1_4.a(a5.m.c(d6.d));
        v1_4.a(new a5.m(v0_1, 0, 1));
        v1_4.a(a5.m.c(x5.c));
        v1_4.f = new a6.b(v0_1, 1);
        v1_4.c(1);
        return java.util.Arrays.asList(new a5.c[] {v1_4.b(), j5.t1.j("fire-fcm", "25.0.1")}));
    }
}
