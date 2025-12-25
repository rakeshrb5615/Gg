package androidx.lifecycle;
public final class m0$a implements android.app.Application$ActivityLifecycleCallbacks {
    public static final androidx.lifecycle.l0 Companion;

    static m0$a()
    {
        androidx.lifecycle.m0$a.Companion = new androidx.lifecycle.l0();
        return;
    }

    public m0$a()
    {
        return;
    }

    public static final void registerIn(android.app.Activity p1)
    {
        androidx.lifecycle.m0$a.Companion.getClass();
        androidx.lifecycle.l0.a(p1);
        return;
    }

    public void onActivityCreated(android.app.Activity p1, android.os.Bundle p2)
    {
        kotlin.jvm.internal.j.e(p1, "activity");
        return;
    }

    public void onActivityDestroyed(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        return;
    }

    public void onActivityPaused(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        return;
    }

    public void onActivityPostCreated(android.app.Activity p1, android.os.Bundle p2)
    {
        kotlin.jvm.internal.j.e(p1, "activity");
        androidx.lifecycle.k0.a(p1, androidx.lifecycle.n.ON_CREATE);
        return;
    }

    public void onActivityPostResumed(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        androidx.lifecycle.k0.a(p2, androidx.lifecycle.n.ON_RESUME);
        return;
    }

    public void onActivityPostStarted(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        androidx.lifecycle.k0.a(p2, androidx.lifecycle.n.ON_START);
        return;
    }

    public void onActivityPreDestroyed(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        androidx.lifecycle.k0.a(p2, androidx.lifecycle.n.ON_DESTROY);
        return;
    }

    public void onActivityPrePaused(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        androidx.lifecycle.k0.a(p2, androidx.lifecycle.n.ON_PAUSE);
        return;
    }

    public void onActivityPreStopped(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        androidx.lifecycle.k0.a(p2, androidx.lifecycle.n.ON_STOP);
        return;
    }

    public void onActivityResumed(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        return;
    }

    public void onActivitySaveInstanceState(android.app.Activity p2, android.os.Bundle p3)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        kotlin.jvm.internal.j.e(p3, "bundle");
        return;
    }

    public void onActivityStarted(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        return;
    }

    public void onActivityStopped(android.app.Activity p2)
    {
        kotlin.jvm.internal.j.e(p2, "activity");
        return;
    }
}
