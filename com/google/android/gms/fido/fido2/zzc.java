package com.google.android.gms.fido.fido2;
public final synthetic class zzc implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.fido.fido2.Fido2ApiClient zza;
    public final synthetic com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions zzb;

    public synthetic zzc(com.google.android.gms.fido.fido2.Fido2ApiClient p1, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void accept(Object p4, Object p5)
    {
        ((com.google.android.gms.internal.fido.zzs) ((com.google.android.gms.internal.fido.zzp) p4).getService()).zzc(new com.google.android.gms.fido.fido2.zzf(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p5)), this.zzb);
        return;
    }
}
