package com.google.android.gms.fido.fido2;
public final synthetic class zzb implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.fido.fido2.Fido2ApiClient zza;

    public synthetic zzb(com.google.android.gms.fido.fido2.Fido2ApiClient p1)
    {
        this.zza = p1;
        return;
    }

    public final void accept(Object p3, Object p4)
    {
        ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) p3).getService()).zze(new com.google.android.gms.fido.fido2.zzj(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p4)));
        return;
    }
}
