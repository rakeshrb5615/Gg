package com.google.android.gms.cloudmessaging;
public final synthetic class zzh implements java.lang.Runnable {
    public final synthetic com.google.android.gms.cloudmessaging.CloudMessagingReceiver zza;
    public final synthetic android.content.Intent zzb;
    public final synthetic android.content.Context zzc;
    public final synthetic boolean zzd;
    public final synthetic android.content.BroadcastReceiver$PendingResult zze;

    public synthetic zzh(com.google.android.gms.cloudmessaging.CloudMessagingReceiver p1, android.content.Intent p2, android.content.Context p3, boolean p4, android.content.BroadcastReceiver$PendingResult p5)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        this.zze = p5;
        return;
    }

    public final void run()
    {
        this.zza.zza(this.zzb, this.zzc, this.zzd, this.zze);
        return;
    }
}
