package r6;
public final class w0 implements android.app.Application$ActivityLifecycleCallbacks {
    public final r6.c1 a;

    public w0(r6.c1 p2)
    {
        kotlin.jvm.internal.j.e(p2, "sharedSessionRepository");
        this.a = p2;
        return;
    }

    public final void onActivityCreated(android.app.Activity p1, android.os.Bundle p2)
    {
        kotlin.jvm.internal.j.e(p1, "activity");
        return;
    }

    public final void onActivityDestroyed(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        return;
    }

    public final void onActivityPaused(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        this.a.b();
        return;
    }

    public final void onActivityResumed(android.app.Activity p6)
    {
        kotlin.jvm.internal.j.e(p6, "activity");
        String v6_2 = this.a;
        v6_2.i = 1;
        r6.h0 v0_2 = v6_2.h;
        if (v0_2 != null) {
            if (v0_2 == null) {
                kotlin.jvm.internal.j.i("localSessionData");
                throw 0;
            } else {
                a1.d v3_1 = new StringBuilder("App foregrounded on ");
                v3_1.append(v6_2.f.a());
                android.util.Log.d("FirebaseSessions", v3_1.toString());
                if ((!v6_2.d(v0_2)) && (!v6_2.c(v0_2))) {
                    return;
                } else {
                    d8.f0.p(d8.f0.b(v6_2.g), new a1.d(v6_2, v0_2, 0, 11));
                    return;
                }
            }
        } else {
            android.util.Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
    }

    public final void onActivitySaveInstanceState(android.app.Activity p2, android.os.Bundle p3)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        kotlin.jvm.internal.j.e(p3, "outState");
        return;
    }

    public final void onActivityStarted(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        return;
    }

    public final void onActivityStopped(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        return;
    }
}
