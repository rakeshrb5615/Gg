package com.google.android.gms.internal.play_billing;
final class zzcj$zzb implements java.lang.Runnable {
    final com.google.android.gms.internal.play_billing.zzcj zza;
    final com.google.android.gms.internal.play_billing.zzcz zzb;

    public zzcj$zzb(com.google.android.gms.internal.play_billing.zzcj p1, com.google.android.gms.internal.play_billing.zzcz p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        if ((this.zza.valueField == this) && (com.google.android.gms.internal.play_billing.zzck.zzq(this.zza, this, com.google.android.gms.internal.play_billing.zzcj.zza(this.zzb)))) {
            com.google.android.gms.internal.play_billing.zzcj.zzf(this.zza, 0);
        }
        return;
    }
}
