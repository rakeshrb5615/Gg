package com.google.android.gms.internal.auth-api-phone;
public final synthetic class zzs implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth-api-phone.zzv zza;

    public synthetic zzs(com.google.android.gms.internal.auth-api-phone.zzv p1)
    {
        this.zza = p1;
        return;
    }

    public final void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.auth-api-phone.zzh) ((com.google.android.gms.internal.auth-api-phone.zzw) p3).getService()).zzf(new com.google.android.gms.internal.auth-api-phone.zzu(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p4)));
        return;
    }
}
