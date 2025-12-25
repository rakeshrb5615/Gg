package com.google.android.gms.fido.fido2.api.common;
public final class BrowserPublicKeyCredentialRequestOptions$Builder {
    private com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions zza;
    private android.net.Uri zzb;
    private byte[] zzc;

    public BrowserPublicKeyCredentialRequestOptions$Builder()
    {
        return;
    }

    public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions build()
    {
        return new com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions(this.zza, this.zzb, this.zzc);
    }

    public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions$Builder setClientDataHash(byte[] p1)
    {
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zzb(p1);
        this.zzc = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions$Builder setOrigin(android.net.Uri p1)
    {
        com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions.zza(p1);
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions$Builder setPublicKeyCredentialRequestOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions p1)
    {
        this.zza = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }
}
