package com.google.android.gms.internal.auth;
public final class zzbv implements com.google.android.gms.auth.api.proxy.ProxyApi$SpatulaHeaderResult {
    private final com.google.android.gms.common.api.Status zza;
    private final String zzb;

    public zzbv(com.google.android.gms.common.api.Status p1)
    {
        this.zza = ((com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = "";
        return;
    }

    public zzbv(String p1)
    {
        this.zzb = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zza = com.google.android.gms.common.api.Status.RESULT_SUCCESS;
        return;
    }

    public final String getSpatulaHeader()
    {
        return this.zzb;
    }

    public final com.google.android.gms.common.api.Status getStatus()
    {
        return this.zza;
    }
}
