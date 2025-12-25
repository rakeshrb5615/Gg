package com.google.android.gms.fido.fido2;
public final synthetic class zzp implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient zza;

    public synthetic zzp(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient p1)
    {
        this.zza = p1;
        return;
    }

    public final void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) p3).getService()).zzf(new com.google.android.gms.fido.fido2.zzu(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p4)));
        return;
    }
}
