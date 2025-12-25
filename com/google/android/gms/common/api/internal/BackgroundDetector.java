package com.google.android.gms.common.api.internal;
public final class BackgroundDetector implements android.app.Application$ActivityLifecycleCallbacks, android.content.ComponentCallbacks2 {
    private static final com.google.android.gms.common.api.internal.BackgroundDetector zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb;
    private final java.util.concurrent.atomic.AtomicBoolean zzc;
    private final java.util.ArrayList zzd;
    private boolean zze;

    static BackgroundDetector()
    {
        com.google.android.gms.common.api.internal.BackgroundDetector.zza = new com.google.android.gms.common.api.internal.BackgroundDetector();
        return;
    }

    private BackgroundDetector()
    {
        this.zzb = new java.util.concurrent.atomic.AtomicBoolean();
        this.zzc = new java.util.concurrent.atomic.AtomicBoolean();
        this.zzd = new java.util.ArrayList();
        this.zze = 0;
        return;
    }

    public static com.google.android.gms.common.api.internal.BackgroundDetector getInstance()
    {
        return com.google.android.gms.common.api.internal.BackgroundDetector.zza;
    }

    public static void initialize(android.app.Application p2)
    {
        com.google.android.gms.common.api.internal.BackgroundDetector v0 = com.google.android.gms.common.api.internal.BackgroundDetector.zza;
        if (!v0.zze) {
            p2.registerActivityLifecycleCallbacks(v0);
            p2.registerComponentCallbacks(v0);
            v0.zze = 1;
        }
        return;
    }

    private final void zza(boolean p6)
    {
        java.util.ArrayList v1 = this.zzd;
        int v2 = v1.size();
        int v3 = 0;
        while (v3 < v2) {
            com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener v4_1 = v1.get(v3);
            v3++;
            ((com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener) v4_1).onBackgroundStateChanged(p6);
        }
        return;
    }

    public void addListener(com.google.android.gms.common.api.internal.BackgroundDetector$BackgroundStateChangeListener p3)
    {
        try {
            this.zzd.add(p3);
            return;
        } catch (Throwable v3_1) {
            throw v3_1;
        }
    }

    public boolean isInBackground()
    {
        return this.zzb.get();
    }

    public final void onActivityCreated(android.app.Activity p3, android.os.Bundle p4)
    {
        p3 = this.zzc;
        boolean v4_1 = this.zzb.compareAndSet(1, 0);
        p3.set(1);
        if (v4_1) {
            this.zza(0);
        }
        return;
    }

    public final void onActivityDestroyed(android.app.Activity p1)
    {
        return;
    }

    public final void onActivityPaused(android.app.Activity p1)
    {
        return;
    }

    public final void onActivityResumed(android.app.Activity p4)
    {
        p4 = this.zzc;
        boolean v0_1 = this.zzb.compareAndSet(1, 0);
        p4.set(1);
        if (v0_1) {
            this.zza(0);
        }
        return;
    }

    public final void onActivitySaveInstanceState(android.app.Activity p1, android.os.Bundle p2)
    {
        return;
    }

    public final void onActivityStarted(android.app.Activity p1)
    {
        return;
    }

    public final void onActivityStopped(android.app.Activity p1)
    {
        return;
    }

    public final void onConfigurationChanged(android.content.res.Configuration p1)
    {
        return;
    }

    public final void onLowMemory()
    {
        return;
    }

    public final void onTrimMemory(int p3)
    {
        if ((p3 == 20) && (this.zzb.compareAndSet(0, 1))) {
            this.zzc.set(1);
            this.zza(1);
        }
        return;
    }

    public boolean readCurrentStateIfPossible(boolean p3)
    {
        int v0_0 = this.zzc;
        if (!v0_0.get()) {
            if (com.google.android.gms.common.util.ProcessUtils.zza()) {
                return p3;
            } else {
                java.util.concurrent.atomic.AtomicBoolean v3_5 = new android.app.ActivityManager$RunningAppProcessInfo();
                android.app.ActivityManager.getMyMemoryState(v3_5);
                if ((!v0_0.getAndSet(1)) && (v3_5.importance > 100)) {
                    this.zzb.set(1);
                }
            }
        }
        return this.isInBackground();
    }
}
