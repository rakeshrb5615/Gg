package com.google.android.gms.internal.auth-api-phone;
public final synthetic class zzx implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth-api-phone.zzab zza;

    public synthetic zzx(com.google.android.gms.internal.auth-api-phone.zzab p1)
    {
        this.zza = p1;
        return;
    }

    public final void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.auth-api-phone.zzh) ((com.google.android.gms.internal.auth-api-phone.zzw) p3).getService()).zzg(new com.google.android.gms.internal.auth-api-phone.zzz(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p4)));
        return;
    }
}
