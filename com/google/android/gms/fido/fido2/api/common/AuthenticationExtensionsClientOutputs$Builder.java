package com.google.android.gms.fido.fido2.api.common;
public final class AuthenticationExtensionsClientOutputs$Builder {
    private com.google.android.gms.fido.fido2.api.common.UvmEntries zza;
    private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs zzb;

    public AuthenticationExtensionsClientOutputs$Builder()
    {
        return;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs build()
    {
        return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs(this.zza, 0, this.zzb, 0);
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs$Builder setCredProps(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs$Builder setUserVerificationMethodEntries(com.google.android.gms.fido.fido2.api.common.UvmEntries p1)
    {
        this.zza = p1;
        return this;
    }
}
