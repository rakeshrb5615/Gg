package com.google.android.gms.cloudmessaging;
public final synthetic class zzad implements com.google.android.gms.tasks.OnCompleteListener {
    public final synthetic com.google.android.gms.cloudmessaging.Rpc zza;
    public final synthetic String zzb;
    public final synthetic java.util.concurrent.ScheduledFuture zzc;

    public synthetic zzad(com.google.android.gms.cloudmessaging.Rpc p1, String p2, java.util.concurrent.ScheduledFuture p3)
    {
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final void onComplete(com.google.android.gms.tasks.Task p4)
    {
        this.zza.zzd(this.zzb, this.zzc, p4);
        return;
    }
}
