package com.google.android.gms.fido.fido2.api.common;
public final class PublicKeyCredentialCreationOptions$Builder {
    private com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity zza;
    private com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity zzb;
    private byte[] zzc;
    private java.util.List zzd;
    private Double zze;
    private java.util.List zzf;
    private com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria zzg;
    private Integer zzh;
    private com.google.android.gms.fido.fido2.api.common.TokenBinding zzi;
    private com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference zzj;
    private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzk;

    public PublicKeyCredentialCreationOptions$Builder()
    {
        return;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions build()
    {
        String v10_1;
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity v1 = this.zza;
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity v2 = this.zzb;
        byte[] v3 = this.zzc;
        java.util.List v4 = this.zzd;
        Double v5 = this.zze;
        java.util.List v6 = this.zzf;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria v7 = this.zzg;
        Integer v8 = this.zzh;
        com.google.android.gms.fido.fido2.api.common.TokenBinding v9 = this.zzi;
        String v10_0 = this.zzj;
        if (v10_0 != null) {
            v10_1 = v10_0.toString();
        } else {
            v10_1 = 0;
        }
        return new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10_1, this.zzk);
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setAttestationConveyancePreference(com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference p1)
    {
        this.zzj = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setAuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions p1)
    {
        this.zzk = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setAuthenticatorSelection(com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria p1)
    {
        this.zzg = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setChallenge(byte[] p1)
    {
        this.zzc = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setExcludeList(java.util.List p1)
    {
        this.zzf = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setParameters(java.util.List p1)
    {
        this.zzd = ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setRequestId(Integer p1)
    {
        this.zzh = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setRp(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity p1)
    {
        this.zza = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setTimeoutSeconds(Double p1)
    {
        this.zze = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setTokenBinding(com.google.android.gms.fido.fido2.api.common.TokenBinding p1)
    {
        this.zzi = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions$Builder setUser(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity p1)
    {
        this.zzb = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }
}
