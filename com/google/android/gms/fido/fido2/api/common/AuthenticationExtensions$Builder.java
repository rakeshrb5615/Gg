package com.google.android.gms.fido.fido2.api.common;
public final class AuthenticationExtensions$Builder {
    private com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension zza;
    private com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension zzb;
    private com.google.android.gms.fido.fido2.api.common.zzs zzc;
    private com.google.android.gms.fido.fido2.api.common.zzz zzd;
    private com.google.android.gms.fido.fido2.api.common.zzab zze;
    private com.google.android.gms.fido.fido2.api.common.zzad zzf;
    private com.google.android.gms.fido.fido2.api.common.zzu zzg;
    private com.google.android.gms.fido.fido2.api.common.zzag zzh;
    private com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzi;
    private com.google.android.gms.fido.fido2.api.common.zzai zzj;

    public AuthenticationExtensions$Builder()
    {
        return;
    }

    public AuthenticationExtensions$Builder(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions p2)
    {
        if (p2 != null) {
            this.zza = p2.getFidoAppIdExtension();
            this.zzb = p2.getUserVerificationMethodExtension();
            this.zzc = p2.zza();
            this.zzd = p2.zzc();
            this.zze = p2.zzd();
            this.zzf = p2.zze();
            this.zzg = p2.zzb();
            this.zzh = p2.zzg();
            this.zzi = p2.zzf();
            this.zzj = p2.zzh();
        }
        return;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions build()
    {
        return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions(this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions$Builder setFido2Extension(com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension p1)
    {
        this.zza = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions$Builder setGoogleThirdPartyPaymentExtension(com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension p1)
    {
        this.zzi = p1;
        return this;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions$Builder setUserVerificationMethodExtension(com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension p1)
    {
        this.zzb = p1;
        return this;
    }
}
