package com.google.android.gms.tasks;
final class zzi implements java.lang.Runnable {
    final synthetic com.google.android.gms.tasks.Task zza;
    final synthetic com.google.android.gms.tasks.zzj zzb;

    public zzi(com.google.android.gms.tasks.zzj p1, com.google.android.gms.tasks.Task p2)
    {
        this.zzb = p1;
        this.zza = p2;
        return;
    }

    public final void run()
    {
        com.google.android.gms.tasks.zzj.zzb(this.zzb);
        com.google.android.gms.tasks.OnCompleteListener v1_1 = this.zzb;
        if (com.google.android.gms.tasks.zzj.zza(v1_1) != null) {
            com.google.android.gms.tasks.zzj.zza(v1_1).onComplete(this.zza);
        }
        return;
    }
}
