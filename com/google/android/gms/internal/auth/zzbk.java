package com.google.android.gms.internal.auth;
public final synthetic class zzbk implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth.zzbo zza;

    public synthetic zzbk(com.google.android.gms.internal.auth.zzbo p1)
    {
        this.zza = p1;
        return;
    }

    public final void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.auth.zzbh) ((com.google.android.gms.internal.auth.zzbe) p3).getService()).zzd(new com.google.android.gms.internal.auth.zzbn(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p4)));
        return;
    }
}
