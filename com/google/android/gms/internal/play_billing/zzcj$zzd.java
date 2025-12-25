package com.google.android.gms.internal.play_billing;
final class zzcj$zzd {
    static final com.google.android.gms.internal.play_billing.zzcj$zzd zza;
    com.google.android.gms.internal.play_billing.zzcj$zzd next;
    final Runnable zzb;
    final java.util.concurrent.Executor zzc;

    static zzcj$zzd()
    {
        com.google.android.gms.internal.play_billing.zzcj$zzd.zza = new com.google.android.gms.internal.play_billing.zzcj$zzd();
        return;
    }

    public zzcj$zzd()
    {
        this.zzb = 0;
        this.zzc = 0;
        return;
    }

    public zzcj$zzd(Runnable p1, java.util.concurrent.Executor p2)
    {
        this.zzb = p1;
        this.zzc = p2;
        return;
    }
}
