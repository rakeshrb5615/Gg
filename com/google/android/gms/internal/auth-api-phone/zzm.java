package com.google.android.gms.internal.auth-api-phone;
public final synthetic class zzm implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth-api-phone.zzr zza;

    public synthetic zzm(com.google.android.gms.internal.auth-api-phone.zzr p1)
    {
        this.zza = p1;
        return;
    }

    public final void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.auth-api-phone.zzh) ((com.google.android.gms.internal.auth-api-phone.zzw) p3).getService()).zze(new com.google.android.gms.internal.auth-api-phone.zzo(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p4)));
        return;
    }
}
