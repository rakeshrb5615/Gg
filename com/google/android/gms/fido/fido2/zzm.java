package com.google.android.gms.fido.fido2;
public final synthetic class zzm implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient zza;
    public final synthetic com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions zzb;

    public synthetic zzm(com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient p1, com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void accept(Object p4, Object p5)
    {
        ((com.google.android.gms.internal.fido.zzn) ((com.google.android.gms.internal.fido.zzk) p4).getService()).zze(new com.google.android.gms.fido.fido2.zzr(this.zza, ((com.google.android.gms.tasks.TaskCompletionSource) p5)), this.zzb);
        return;
    }
}
