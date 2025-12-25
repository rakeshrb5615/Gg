package com.google.android.gms.internal.auth;
public final synthetic class zzbl implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth.zzbo zza;
    public final synthetic com.google.android.gms.auth.api.proxy.ProxyRequest zzb;

    public synthetic zzbl(com.google.android.gms.internal.auth.zzbo p1, com.google.android.gms.auth.api.proxy.ProxyRequest p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void accept(Object p4, Object p5)
    {
        ((com.google.android.gms.internal.auth.zzbh) ((com.google.android.gms.internal.auth.zzbe) p4).getService()).zze(new com.google.android.gms.internal.auth.zzbm(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p5)), this.zzb);
        return;
    }
}
