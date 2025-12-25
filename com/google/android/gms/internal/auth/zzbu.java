package com.google.android.gms.internal.auth;
final class zzbu implements com.google.android.gms.auth.api.proxy.ProxyApi$ProxyResult {
    private final com.google.android.gms.common.api.Status zza;
    private com.google.android.gms.auth.api.proxy.ProxyResponse zzb;

    public zzbu(com.google.android.gms.auth.api.proxy.ProxyResponse p1)
    {
        this.zzb = p1;
        this.zza = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        return;
    }

    public zzbu(com.google.android.gms.common.api.Status p1)
    {
        this.zza = p1;
        return;
    }

    public final com.google.android.gms.auth.api.proxy.ProxyResponse getResponse()
    {
        return this.zzb;
    }

    public final com.google.android.gms.common.api.Status getStatus()
    {
        return this.zza;
    }
}
