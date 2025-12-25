package com.google.android.gms.internal.firebase-auth-api;
public final synthetic class zzafr implements java.lang.Runnable {
    private synthetic com.google.android.gms.internal.firebase-auth-api.zzafo zza;
    private synthetic com.google.android.gms.internal.firebase-auth-api.zzafq zzb;
    private synthetic com.google.android.gms.tasks.TaskCompletionSource zzc;

    public synthetic zzafr(com.google.android.gms.internal.firebase-auth-api.zzafo p1, com.google.android.gms.internal.firebase-auth-api.zzafq p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final void run()
    {
        this.zzb.zza(this.zzc, this.zza.zza);
        return;
    }
}
