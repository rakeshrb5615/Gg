package androidx.lifecycle;
public final class ProcessLifecycleInitializer implements d2.b {

    public ProcessLifecycleInitializer()
    {
        return;
    }

    public final java.util.List a()
    {
        return i7.n.a;
    }

    public final Object b(android.content.Context p5)
    {
        kotlin.jvm.internal.j.e(p5, "context");
        androidx.lifecycle.j0 v0_7 = d2.a.c(p5);
        kotlin.jvm.internal.j.d(v0_7, "getInstance(...)");
        if (!v0_7.b.contains(androidx.lifecycle.ProcessLifecycleInitializer)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name=\'androidx.lifecycle.ProcessLifecycleInitializer\'\n                   android:value=\'androidx.startup\' />\n               under InitializationProvider in your AndroidManifest.xml");
        } else {
            if (!androidx.lifecycle.r.a.getAndSet(1)) {
                androidx.lifecycle.j0 v0_4 = p5.getApplicationContext();
                kotlin.jvm.internal.j.c(v0_4, "null cannot be cast to non-null type android.app.Application");
                ((android.app.Application) v0_4).registerActivityLifecycleCallbacks(new androidx.lifecycle.q());
            }
            androidx.lifecycle.j0 v0_6 = androidx.lifecycle.j0.o;
            v0_6.getClass();
            v0_6.e = new android.os.Handler();
            v0_6.f.e(androidx.lifecycle.n.ON_CREATE);
            android.app.Application v5_3 = p5.getApplicationContext();
            kotlin.jvm.internal.j.c(v5_3, "null cannot be cast to non-null type android.app.Application");
            ((android.app.Application) v5_3).registerActivityLifecycleCallbacks(new androidx.lifecycle.i0(v0_6));
            return v0_6;
        }
    }
}
