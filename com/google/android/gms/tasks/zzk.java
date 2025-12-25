package com.google.android.gms.tasks;
final class zzk implements java.lang.Runnable {
    final synthetic com.google.android.gms.tasks.Task zza;
    final synthetic com.google.android.gms.tasks.zzl zzb;

    public zzk(com.google.android.gms.tasks.zzl p1, com.google.android.gms.tasks.Task p2)
    {
        this.zzb = p1;
        this.zza = p2;
        return;
    }

    public final void run()
    {
        com.google.android.gms.tasks.zzl.zzb(this.zzb);
        com.google.android.gms.tasks.OnFailureListener v1_1 = this.zzb;
        if (com.google.android.gms.tasks.zzl.zza(v1_1) != null) {
            com.google.android.gms.tasks.zzl.zza(v1_1).onFailure(((Exception) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zza.getException())));
        }
        return;
    }
}
