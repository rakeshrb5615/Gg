package com.google.android.gms.cloudmessaging;
final class zzae extends com.google.android.gms.internal.cloudmessaging.zzf {
    final synthetic com.google.android.gms.cloudmessaging.Rpc zza;

    public zzae(com.google.android.gms.cloudmessaging.Rpc p1, android.os.Looper p2)
    {
        this.zza = p1;
        super(p2);
        return;
    }

    public final void handleMessage(android.os.Message p2)
    {
        com.google.android.gms.cloudmessaging.Rpc.zzc(this.zza, p2);
        return;
    }
}
