package com.google.android.gms.internal.auth-api-phone;
public final synthetic class zzl implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth-api-phone.zzr zza;
    public final synthetic String zzb;

    public synthetic zzl(com.google.android.gms.internal.auth-api-phone.zzr p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.auth-api-phone.zzh) ((com.google.android.gms.internal.auth-api-phone.zzw) p3).getService()).zzd(this.zzb, new com.google.android.gms.internal.auth-api-phone.zzq(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p4)));
        return;
    }
}
