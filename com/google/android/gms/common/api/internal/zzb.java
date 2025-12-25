package com.google.android.gms.common.api.internal;
final class zzb implements java.lang.Runnable {
    final synthetic com.google.android.gms.common.api.internal.LifecycleCallback zza;
    final synthetic String zzb;
    final synthetic com.google.android.gms.common.api.internal.zzc zzc;

    public zzb(com.google.android.gms.common.api.internal.zzc p1, com.google.android.gms.common.api.internal.LifecycleCallback p2, String p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.common.api.internal.LifecycleCallback v0_0 = this.zzc;
        if (v0_0.zzm() > 0) {
            int v2_0;
            int v1_8 = this.zza;
            if (v0_0.zzn() == null) {
                v2_0 = 0;
            } else {
                v2_0 = v0_0.zzn().getBundle(this.zzb);
            }
            v1_8.onCreate(v2_0);
        }
        if (v0_0.zzm() >= 2) {
            this.zza.onStart();
        }
        if (v0_0.zzm() >= 3) {
            this.zza.onResume();
        }
        if (v0_0.zzm() >= 4) {
            this.zza.onStop();
        }
        if (v0_0.zzm() >= 5) {
            this.zza.onDestroy();
        }
        return;
    }
}
