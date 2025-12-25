package com.google.android.gms.fido.fido2.api.common;
public final class BrowserPublicKeyCredentialCreationOptions$Builder {
    private com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions zza;
    private android.net.Uri zzb;
    private byte[] zzc;

    public BrowserPublicKeyCredentialCreationOptions$Builder()
    {
        return;
    }

    public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions build()
    {
        return new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions(this.zza, this.zzb, this.zzc);
    }

    public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions$Builder setClientDataHash(byte[] p1)
    {
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions.zzb(p1);
        this.zzc = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions$Builder setOrigin(android.net.Uri p1)
    {
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions.zza(p1);
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions$Builder setPublicKeyCredentialCreationOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions p1)
    {
        this.zza = p1;
        return this;
    }
}
