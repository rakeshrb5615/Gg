package com.google.android.gms.fido.fido2.api.common;
public final class PublicKeyCredentialRequestOptions$Builder {
    private byte[] zza;
    private Double zzb;
    private String zzc;
    private java.util.List zzd;
    private Integer zze;
    private com.google.android.gms.fido.fido2.api.common.TokenBinding zzf;
    private com.google.android.gms.fido.fido2.api.common.zzay zzg;
    private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzh;

    public PublicKeyCredentialRequestOptions$Builder()
    {
        return;
    }

    public PublicKeyCredentialRequestOptions$Builder(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions p2)
    {
        if (p2 != null) {
            this.zza = p2.getChallenge();
            this.zzb = p2.getTimeoutSeconds();
            this.zzc = p2.getRpId();
            this.zzd = p2.getAllowList();
            this.zze = p2.getRequestId();
            this.zzf = p2.getTokenBinding();
            this.zzg = p2.zza();
            this.zzh = p2.getAuthenticationExtensions();
        }
        return;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions build()
    {
        String v7_0;
        byte[] v1 = this.zza;
        Double v2 = this.zzb;
        String v3 = this.zzc;
        java.util.List v4 = this.zzd;
        Integer v5 = this.zze;
        com.google.android.gms.fido.fido2.api.common.TokenBinding v6 = this.zzf;
        String v7_1 = this.zzg;
        if (v7_1 != null) {
            v7_0 = v7_1.toString();
        } else {
            v7_0 = 0;
        }
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions(v1, v2, v3, v4, v5, v6, v7_0, this.zzh, 0);
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions$Builder setAllowList(java.util.List p1)
    {
        this.zzd = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions$Builder setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions p1)
    {
        this.zzh = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions$Builder setChallenge(byte[] p1)
    {
        this.zza = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions$Builder setRequestId(Integer p1)
    {
        this.zze = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions$Builder setRpId(String p1)
    {
        this.zzc = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions$Builder setTimeoutSeconds(Double p1)
    {
        this.zzb = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions$Builder setTokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding p1)
    {
        this.zzf = p1;
        return this;
    }
}
