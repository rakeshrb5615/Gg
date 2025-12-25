package com.google.android.gms.internal.auth;
final class zzbm extends com.google.android.gms.internal.auth.zzbd {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzbm(com.google.android.gms.internal.auth.zzbo p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        return;
    }

    public final void zzb(com.google.android.gms.auth.api.proxy.ProxyResponse p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(new com.google.android.gms.common.api.Status(p3.googlePlayServicesStatusCode), p3, this.zza);
        return;
    }
}
