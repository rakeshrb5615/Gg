package com.google.firebase.sessions;
public final class FirebaseSessionsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    private static final r6.u Companion = None;
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final a5.x appContext;
    private static final a5.x backgroundDispatcher;
    private static final a5.x blockingDispatcher;
    private static final a5.x firebaseApp;
    private static final a5.x firebaseInstallationsApi;
    private static final a5.x firebaseSessionsComponent;
    private static final a5.x transportFactory;

    static FirebaseSessionsRegistrar()
    {
        com.google.firebase.sessions.FirebaseSessionsRegistrar.Companion = new r6.u();
        com.google.firebase.sessions.FirebaseSessionsRegistrar.appContext = a5.x.a(android.content.Context);
        com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp = a5.x.a(q4.f);
        com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseInstallationsApi = a5.x.a(d6.d);
        com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher = new a5.x(w4.a, d8.a0);
        com.google.firebase.sessions.FirebaseSessionsRegistrar.blockingDispatcher = new a5.x(w4.b, d8.a0);
        com.google.firebase.sessions.FirebaseSessionsRegistrar.transportFactory = a5.x.a(o2.g);
        com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseSessionsComponent = a5.x.a(r6.r);
        return;
    }

    public FirebaseSessionsRegistrar()
    {
        return;
    }

    public static synthetic r6.r a(a5.z p0)
    {
        return com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$1(p0);
    }

    public static final synthetic a5.x access$getAppContext$cp()
    {
        return com.google.firebase.sessions.FirebaseSessionsRegistrar.appContext;
    }

    public static final synthetic a5.x access$getBackgroundDispatcher$cp()
    {
        return com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher;
    }

    public static final synthetic a5.x access$getBlockingDispatcher$cp()
    {
        return com.google.firebase.sessions.FirebaseSessionsRegistrar.blockingDispatcher;
    }

    public static final synthetic a5.x access$getFirebaseApp$cp()
    {
        return com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp;
    }

    public static final synthetic a5.x access$getFirebaseInstallationsApi$cp()
    {
        return com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseInstallationsApi;
    }

    public static final synthetic a5.x access$getFirebaseSessionsComponent$cp()
    {
        return com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseSessionsComponent;
    }

    public static final synthetic a5.x access$getTransportFactory$cp()
    {
        return com.google.firebase.sessions.FirebaseSessionsRegistrar.transportFactory;
    }

    public static synthetic r6.o b(a5.z p0)
    {
        return com.google.firebase.sessions.FirebaseSessionsRegistrar.getComponents$lambda$0(p0);
    }

    private static final r6.o getComponents$lambda$0(a5.d p1)
    {
        return ((r6.o) ((r6.i) ((r6.r) p1.e(com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseSessionsComponent))).p.get());
    }

    private static final r6.r getComponents$lambda$1(a5.d p13)
    {
        j6.o v0_12 = p13.e(com.google.firebase.sessions.FirebaseSessionsRegistrar.appContext);
        kotlin.jvm.internal.j.d(v0_12, "get(...)");
        j6.o v0_17 = ((android.content.Context) v0_12);
        int v2_10 = p13.e(com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher);
        kotlin.jvm.internal.j.d(v2_10, "get(...)");
        int v2_0 = ((l7.h) v2_10);
        j6.s v3_5 = p13.e(com.google.firebase.sessions.FirebaseSessionsRegistrar.blockingDispatcher);
        kotlin.jvm.internal.j.d(v3_5, "get(...)");
        j6.s v3_9 = ((l7.h) v3_5);
        k4.i v4_7 = p13.e(com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp);
        kotlin.jvm.internal.j.d(v4_7, "get(...)");
        k4.i v4_8 = ((q4.f) v4_7);
        t6.c v5_4 = p13.e(com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseInstallationsApi);
        kotlin.jvm.internal.j.d(v5_4, "get(...)");
        t6.c v5_5 = ((d6.d) v5_4);
        t6.c v13_9 = p13.b(com.google.firebase.sessions.FirebaseSessionsRegistrar.transportFactory);
        kotlin.jvm.internal.j.d(v13_9, "getProvider(...)");
        r6.i v1_4 = new r6.i();
        v1_4.a = k4.i.b(v4_8);
        j6.o v0_13 = k4.i.b(v0_17);
        v1_4.b = v0_13;
        v1_4.c = t6.a.a(new r6.m(v0_13, 2));
        v1_4.d = t6.a.a(r6.t.a);
        v1_4.e = k4.i.b(v5_5);
        v1_4.f = t6.a.a(new r6.m(v1_4.a, 1));
        j6.o v0_21 = k4.i.b(v3_9);
        v1_4.g = v0_21;
        v1_4.h = t6.a.a(new r6.s(v1_4.f, v0_21));
        v1_4.i = k4.i.b(v2_0);
        v1_4.j = t6.a.a(new r6.u0(v1_4.c, t6.a.a(new a2.b(v1_4.d, v1_4.e, v1_4.f, v1_4.h, t6.a.a(new b8.g(v1_4.i, v1_4.d, t6.a.a(new r6.s(v1_4.b, v1_4.g, 0)), 17)), 5)), 1));
        j6.o v0_2 = t6.a.a(r6.t.b);
        v1_4.k = v0_2;
        v1_4.l = t6.a.a(new r6.u0(v1_4.d, v0_2, 0));
        v1_4.m = t6.a.a(new a2.b(v1_4.a, v1_4.e, v1_4.j, t6.a.a(new r6.m(k4.i.b(v13_9), 0)), v1_4.i, 4));
        v1_4.n = t6.a.a(new b8.g(v1_4.b, v1_4.g, t6.a.a(new r6.j0(v1_4.l, 0)), 14));
        t6.c v13_7 = t6.a.a(new m5.c(v1_4.j, v1_4.l, v1_4.m, v1_4.d, v1_4.n, t6.a.a(new r6.s(v1_4.b, v1_4.k, 1)), v1_4.i, 2));
        v1_4.o = v13_7;
        v1_4.p = t6.a.a(new j6.s(v1_4.a, v1_4.j, v1_4.i, t6.a.a(new j6.o(v13_7, 12)), 11));
        return v1_4;
    }

    public java.util.List getComponents()
    {
        java.util.List v0_2 = a5.c.b(r6.o);
        v0_2.a = "fire-sessions";
        v0_2.a(a5.m.b(com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseSessionsComponent));
        v0_2.f = new r2.q(6);
        v0_2.c(2);
        java.util.List v0_1 = v0_2.b();
        a5.c v2_3 = a5.c.b(r6.r);
        v2_3.a = "fire-sessions-component";
        v2_3.a(a5.m.b(com.google.firebase.sessions.FirebaseSessionsRegistrar.appContext));
        v2_3.a(a5.m.b(com.google.firebase.sessions.FirebaseSessionsRegistrar.backgroundDispatcher));
        v2_3.a(a5.m.b(com.google.firebase.sessions.FirebaseSessionsRegistrar.blockingDispatcher));
        v2_3.a(a5.m.b(com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseApp));
        v2_3.a(a5.m.b(com.google.firebase.sessions.FirebaseSessionsRegistrar.firebaseInstallationsApi));
        v2_3.a(new a5.m(com.google.firebase.sessions.FirebaseSessionsRegistrar.transportFactory, 1, 1));
        v2_3.f = new r2.q(7);
        return i7.h.V(new a5.c[] {v0_1, v2_3.b(), j5.t1.j("fire-sessions", "3.0.3")}));
    }
}
