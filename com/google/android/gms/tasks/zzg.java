package com.google.android.gms.tasks;
final class zzg implements java.lang.Runnable {
    final synthetic com.google.android.gms.tasks.zzh zza;

    public zzg(com.google.android.gms.tasks.zzh p1)
    {
        this.zza = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.tasks.zzh.zzb(this.zza);
        com.google.android.gms.tasks.OnCanceledListener v1_1 = this.zza;
        if (com.google.android.gms.tasks.zzh.zza(v1_1) != null) {
            com.google.android.gms.tasks.zzh.zza(v1_1).onCanceled();
        }
        return;
    }
}
