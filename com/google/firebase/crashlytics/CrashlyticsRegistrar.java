package com.google.firebase.crashlytics;
public class CrashlyticsRegistrar implements com.google.firebase.components.ComponentRegistrar {
    public static final synthetic int d;
    public final a5.x a;
    public final a5.x b;
    public final a5.x c;

    static CrashlyticsRegistrar()
    {
        String v0_0 = s6.d.a;
        StringBuilder v1_0 = s6.c.b;
        if (!v1_0.containsKey(v0_0)) {
            v1_0.put(v0_0, new s6.a(new m8.c(1)));
            StringBuilder v1_2 = new StringBuilder("Dependency to ");
            v1_2.append(v0_0);
            v1_2.append(" added.");
            android.util.Log.d("FirebaseSessions", v1_2.toString());
            return;
        } else {
            StringBuilder v1_4 = new StringBuilder("Dependency ");
            v1_4.append(v0_0);
            v1_4.append(" already added.");
            android.util.Log.d("FirebaseSessions", v1_4.toString());
            return;
        }
    }

    public CrashlyticsRegistrar()
    {
        this.a = new a5.x(w4.a, java.util.concurrent.ExecutorService);
        this.b = new a5.x(w4.b, java.util.concurrent.ExecutorService);
        this.c = new a5.x(w4.c, java.util.concurrent.ExecutorService);
        return;
    }

    public final java.util.List getComponents()
    {
        java.util.List v0_1 = a5.c.b(c5.c);
        v0_1.a = "fire-cls";
        v0_1.a(a5.m.c(q4.f));
        v0_1.a(a5.m.c(d6.d));
        v0_1.a(new a5.m(this.a, 1, 0));
        v0_1.a(new a5.m(this.b, 1, 0));
        v0_1.a(new a5.m(this.c, 1, 0));
        v0_1.a(new a5.m(0, 2, d5.b));
        v0_1.a(new a5.m(0, 2, u4.b));
        v0_1.a(new a5.m(0, 2, p6.a));
        v0_1.f = new a5.a(this, 2);
        v0_1.c(2);
        return java.util.Arrays.asList(new a5.c[] {v0_1.b(), j5.t1.j("fire-cls", "20.0.3")}));
    }
}
