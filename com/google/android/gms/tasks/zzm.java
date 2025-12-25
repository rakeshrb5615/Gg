package com.google.android.gms.tasks;
final class zzm implements java.lang.Runnable {
    final synthetic com.google.android.gms.tasks.Task zza;
    final synthetic com.google.android.gms.tasks.zzn zzb;

    public zzm(com.google.android.gms.tasks.zzn p1, com.google.android.gms.tasks.Task p2)
    {
        this.zzb = p1;
        this.zza = p2;
        return;
    }

    public final void run()
    {
        com.google.android.gms.tasks.zzn.zzb(this.zzb);
        com.google.android.gms.tasks.OnSuccessListener v1_1 = this.zzb;
        if (com.google.android.gms.tasks.zzn.zza(v1_1) != null) {
            com.google.android.gms.tasks.zzn.zza(v1_1).onSuccess(this.zza.getResult());
        }
        return;
    }
}
