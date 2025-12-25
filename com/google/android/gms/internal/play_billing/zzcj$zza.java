package com.google.android.gms.internal.play_billing;
final class zzcj$zza {
    static final com.google.android.gms.internal.play_billing.zzcj$zza zza;
    static final com.google.android.gms.internal.play_billing.zzcj$zza zzb;
    final boolean zzc;
    final Throwable zzd;

    static zzcj$zza()
    {
        if (!com.google.android.gms.internal.play_billing.zzck.zzc) {
            com.google.android.gms.internal.play_billing.zzcj$zza.zzb = new com.google.android.gms.internal.play_billing.zzcj$zza(0, 0);
            com.google.android.gms.internal.play_billing.zzcj$zza.zza = new com.google.android.gms.internal.play_billing.zzcj$zza(1, 0);
            return;
        } else {
            com.google.android.gms.internal.play_billing.zzcj$zza.zzb = 0;
            com.google.android.gms.internal.play_billing.zzcj$zza.zza = 0;
            return;
        }
    }

    public zzcj$zza(boolean p1, Throwable p2)
    {
        this.zzc = p1;
        this.zzd = p2;
        return;
    }
}
