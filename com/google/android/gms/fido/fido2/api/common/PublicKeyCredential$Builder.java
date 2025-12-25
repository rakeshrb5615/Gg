package com.google.android.gms.fido.fido2.api.common;
public class PublicKeyCredential$Builder {
    private String zza;
    private byte[] zzb;
    private com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse zzc;
    private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs zzd;
    private String zze;

    public PublicKeyCredential$Builder()
    {
        return;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential build()
    {
        int v7;
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType v0_0 = this.zzc;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse v2_1 = 0;
        if (!(v0_0 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse)) {
            v7 = 0;
        } else {
            v7 = ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse) v0_0);
        }
        int v8;
        if (!(v0_0 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse)) {
            v8 = 0;
        } else {
            v8 = ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) v0_0);
        }
        if ((v0_0 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse)) {
            v2_1 = ((com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) v0_0);
        }
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredential(this.zza, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType.PUBLIC_KEY.toString(), this.zzb, v7, v8, v2_1, this.zzd, this.zze);
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential$Builder setAuthenticationExtensionsClientOutputs(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs p1)
    {
        this.zzd = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential$Builder setAuthenticatorAttachment(String p1)
    {
        this.zze = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential$Builder setId(String p1)
    {
        this.zza = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential$Builder setRawId(byte[] p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredential$Builder setResponse(com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse p1)
    {
        this.zzc = p1;
        return this;
    }
}
