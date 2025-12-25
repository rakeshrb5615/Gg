package com.google.firebase.messaging;
public class FirebaseMessaging {
    public static final long j;
    public static j6.o k;
    public static c6.b l;
    public static java.util.concurrent.ScheduledThreadPoolExecutor m;
    public final q4.f a;
    public final android.content.Context b;
    public final a5.z c;
    public final j6.j d;
    public final i5.n e;
    public final java.util.concurrent.ScheduledThreadPoolExecutor f;
    public final java.util.concurrent.ThreadPoolExecutor g;
    public final h3.k h;
    public boolean i;

    static FirebaseMessaging()
    {
        com.google.firebase.messaging.FirebaseMessaging.j = java.util.concurrent.TimeUnit.HOURS.toSeconds(8);
        com.google.firebase.messaging.FirebaseMessaging.l = new a5.g(6);
        return;
    }

    public FirebaseMessaging(q4.f p19, c6.b p20, c6.b p21, d6.d p22, c6.b p23, x5.c p24)
    {
        p19.a();
        String v7_0 = p19.a;
        h3.k v3_1 = new h3.k();
        v3_1.b = 0;
        v3_1.c = v7_0;
        j6.l v1_0 = new a5.z(p19, v3_1, p20, p21, p22);
        j6.y v4_3 = java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-Messaging-Task"));
        java.util.concurrent.ScheduledThreadPoolExecutor v5_3 = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-Messaging-Init"));
        java.util.concurrent.ThreadPoolExecutor v10_1 = new java.util.concurrent.ThreadPoolExecutor(0, 1, 30, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-Messaging-File-Io"));
        com.google.firebase.messaging.FirebaseMessaging v0_1 = ;
v0_1.i = 0;
        com.google.firebase.messaging.FirebaseMessaging.l = p23;
        v0_1.a = p19;
        v0_1.e = new i5.n(v0_1, p24);
        p19.a();
        android.content.Context v6_7 = p19.a;
        v0_1.b = v6_7;
        j6.k v11_4 = new j6.k();
        v0_1.h = v3_1;
        v0_1.c = v1_0;
        v0_1.d = new j6.j(v4_3);
        v0_1.f = v5_3;
        v0_1.g = v10_1;
        p19.a();
        if (!(v7_0 instanceof android.app.Application)) {
            j6.m v2_3 = new StringBuilder("Context ");
            v2_3.append(v7_0);
            v2_3.append(" was not an application, can\'t register for lifecycle callbacks. Some notification events may be dropped as a result.");
            android.util.Log.w("FirebaseMessaging", v2_3.toString());
        } else {
            ((android.app.Application) v7_0).registerActivityLifecycleCallbacks(v11_4);
        }
        v5_3.execute(new j6.l(v0_1, 0));
        java.util.concurrent.ScheduledThreadPoolExecutor v21_1 = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        com.google.android.gms.tasks.Tasks.call(v21_1, new j6.y(v6_7, v21_1, v0_1, v3_1, v1_0)).addOnSuccessListener(v5_3, new j6.m(v0_1, 0));
        v5_3.execute(new j6.l(v0_1, 1));
        return;
    }

    public static void b(Runnable p4, long p5)
    {
        if (com.google.firebase.messaging.FirebaseMessaging.m == null) {
            com.google.firebase.messaging.FirebaseMessaging.m = new java.util.concurrent.ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("TAG"));
        }
        com.google.firebase.messaging.FirebaseMessaging.m.schedule(p4, p5, java.util.concurrent.TimeUnit.SECONDS);
        return;
    }

    public static declared_synchronized j6.o c(android.content.Context p2)
    {
        if (com.google.firebase.messaging.FirebaseMessaging.k == null) {
            com.google.firebase.messaging.FirebaseMessaging.k = new j6.o(p2);
        }
        return com.google.firebase.messaging.FirebaseMessaging.k;
    }

    public static declared_synchronized com.google.firebase.messaging.FirebaseMessaging getInstance(q4.f p2)
    {
        Throwable v2_2 = ((com.google.firebase.messaging.FirebaseMessaging) p2.b(com.google.firebase.messaging.FirebaseMessaging));
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_2, "Firebase Messaging component is not present");
        return v2_2;
    }

    public final String a()
    {
        InterruptedException v0_0 = this.d();
        if (this.g(v0_0)) {
            java.io.IOException v1_3 = h3.k.b(this.a);
            j6.j v2 = this.d;
            com.google.android.gms.tasks.Task v5_3 = ((com.google.android.gms.tasks.Task) ((r.e) v2.b).get(v1_3));
            if (v5_3 == null) {
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    com.google.android.gms.tasks.Task v5_5 = new StringBuilder("Making new request for: ");
                    v5_5.append(v1_3);
                    android.util.Log.d("FirebaseMessaging", v5_5.toString());
                }
                java.util.concurrent.Executor v3_1 = this.c;
                v5_3 = v3_1.o(v3_1.v(h3.k.b(((q4.f) v3_1.a)), "*", new android.os.Bundle())).onSuccessTask(this.g, new h5.a(this, v1_3, v0_0, 2)).continueWithTask(((java.util.concurrent.Executor) v2.a), new a5.u(3, v2, v1_3));
                ((r.e) v2.b).put(v1_3, v5_3);
            } else {
                if (android.util.Log.isLoggable("FirebaseMessaging", 3)) {
                    java.util.concurrent.Executor v3_6 = new StringBuilder("Joining ongoing request for: ");
                    v3_6.append(v1_3);
                    android.util.Log.d("FirebaseMessaging", v3_6.toString());
                }
            }
            try {
                return ((String) com.google.android.gms.tasks.Tasks.await(v5_3));
            } catch (InterruptedException v0_10) {
                throw new java.io.IOException(v0_10);
            } catch (InterruptedException v0_10) {
            }
        } else {
            return v0_0.a;
        }
    }

    public final j6.t d()
    {
        Throwable v1_0;
        j6.o v0_1 = com.google.firebase.messaging.FirebaseMessaging.c(this.b);
        int v2_3 = this.a;
        v2_3.a();
        if (!"[DEFAULT]".equals(v2_3.b)) {
            v1_0 = v2_3.f();
        } else {
            v1_0 = "";
        }
        int v2_1 = h3.k.b(this.a);
        android.content.SharedPreferences v3_1 = ((android.content.SharedPreferences) v0_1.b);
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append(v1_0);
        v4_1.append("|T|");
        v4_1.append(v2_1);
        v4_1.append("|*");
        return j6.t.b(v3_1.getString(v4_1.toString(), 0));
    }

    public final boolean e()
    {
        c6.b v0_0 = this.b;
        f2.b0.f(v0_0);
        if ((!f2.b0.h(v0_0)) || ((this.a.b(u4.b) == null) && ((!a.a.q()) || (com.google.firebase.messaging.FirebaseMessaging.l == null)))) {
            return 0;
        } else {
            return 1;
        }
    }

    public final declared_synchronized void f(long p5)
    {
        com.google.firebase.messaging.FirebaseMessaging.b(new j6.v(this, Math.min(Math.max(30, (2 * p5)), com.google.firebase.messaging.FirebaseMessaging.j)), p5);
        this.i = 1;
        return;
    }

    public final boolean g(j6.t p8)
    {
        if (p8 != 0) {
            String v0_1 = this.h.a();
            if ((System.currentTimeMillis() <= (p8.c + j6.t.d)) && (v0_1.equals(p8.b))) {
                return 0;
            }
        }
        return 1;
    }
}
