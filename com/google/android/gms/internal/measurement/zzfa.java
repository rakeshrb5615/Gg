package com.google.android.gms.internal.measurement;
final class zzfa implements android.app.Application$ActivityLifecycleCallbacks {
    final synthetic com.google.android.gms.internal.measurement.zzfb zza;

    public zzfa(com.google.android.gms.internal.measurement.zzfb p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void onActivityCreated(android.app.Activity p2, android.os.Bundle p3)
    {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzet(this, p3, p2));
        return;
    }

    public final void onActivityDestroyed(android.app.Activity p2)
    {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzez(this, p2));
        return;
    }

    public final void onActivityPaused(android.app.Activity p2)
    {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzew(this, p2));
        return;
    }

    public final void onActivityResumed(android.app.Activity p2)
    {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzev(this, p2));
        return;
    }

    public final void onActivitySaveInstanceState(android.app.Activity p4, android.os.Bundle p5)
    {
        com.google.android.gms.internal.measurement.zzco v0_1 = new com.google.android.gms.internal.measurement.zzco();
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzey(this, p4, v0_1));
        android.os.Bundle v4_2 = v0_1.zze(50);
        if (v4_2 != null) {
            p5.putAll(v4_2);
        }
        return;
    }

    public final void onActivityStarted(android.app.Activity p2)
    {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzeu(this, p2));
        return;
    }

    public final void onActivityStopped(android.app.Activity p2)
    {
        this.zza.zzM(new com.google.android.gms.internal.measurement.zzex(this, p2));
        return;
    }
}
