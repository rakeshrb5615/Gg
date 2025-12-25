package com.google.android.gms.fido.fido2.api.common;
public class PublicKeyCredentialCreationOptions extends com.google.android.gms.fido.fido2.api.common.RequestOptions {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity zza;
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity zzb;
    private final byte[] zzc;
    private final java.util.List zzd;
    private final Double zze;
    private final java.util.List zzf;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria zzg;
    private final Integer zzh;
    private final com.google.android.gms.fido.fido2.api.common.TokenBinding zzi;
    private final com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference zzj;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzk;

    static PublicKeyCredentialCreationOptions()
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzak();
        return;
    }

    public PublicKeyCredentialCreationOptions(com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity p1, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity p2, byte[] p3, java.util.List p4, Double p5, java.util.List p6, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria p7, Integer p8, com.google.android.gms.fido.fido2.api.common.TokenBinding p9, String p10, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions p11)
    {
        this.zza = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzc = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zzd = ((java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        this.zze = p5;
        this.zzf = p6;
        this.zzg = p7;
        this.zzh = p8;
        this.zzi = p9;
        if (p10 == null) {
            this.zzj = 0;
        } else {
            try {
                this.zzj = com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.fromString(p10);
            } catch (com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException v1_8) {
                throw new IllegalArgumentException(v1_8);
            }
        }
        this.zzk = p11;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions deserializeFromBytes(byte[] p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(p1, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.CREATOR));
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions)) {
            if ((com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zza)) && ((com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzb)) && ((java.util.Arrays.equals(this.zzc, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzc)) && ((com.google.android.gms.common.internal.Objects.equal(this.zze, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zze)) && ((this.zzd.containsAll(((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzd)) && (((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzd.containsAll(this.zzd))))))) {
                com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions v0_10 = this.zzf;
                if ((v0_10 != null) || (((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzf != null)) {
                    if (v0_10 == null) {
                        return 0;
                    } else {
                        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference v2_6 = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzf;
                        if ((v2_6 == null) || ((!v0_10.containsAll(v2_6)) || (!((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzf.containsAll(this.zzf)))) {
                            return 0;
                        }
                    }
                }
                if ((com.google.android.gms.common.internal.Objects.equal(this.zzg, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzg)) && ((com.google.android.gms.common.internal.Objects.equal(this.zzh, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzh)) && ((com.google.android.gms.common.internal.Objects.equal(this.zzi, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzi)) && ((com.google.android.gms.common.internal.Objects.equal(this.zzj, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzj)) && (com.google.android.gms.common.internal.Objects.equal(this.zzk, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions) p4).zzk)))))) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference getAttestationConveyancePreference()
    {
        return this.zzj;
    }

    public String getAttestationConveyancePreferenceAsString()
    {
        String v0_0 = this.zzj;
        if (v0_0 != null) {
            return v0_0.toString();
        } else {
            return 0;
        }
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions()
    {
        return this.zzk;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria getAuthenticatorSelection()
    {
        return this.zzg;
    }

    public byte[] getChallenge()
    {
        return this.zzc;
    }

    public java.util.List getExcludeList()
    {
        return this.zzf;
    }

    public java.util.List getParameters()
    {
        return this.zzd;
    }

    public Integer getRequestId()
    {
        return this.zzh;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity getRp()
    {
        return this.zza;
    }

    public Double getTimeoutSeconds()
    {
        return this.zze;
    }

    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding()
    {
        return this.zzi;
    }

    public com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity getUser()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        int v0_0 = this.zza;
        Integer.valueOf(java.util.Arrays.hashCode(this.zzc));
        java.util.List v3 = this.zzd;
        java.util.List v5 = this.zzf;
        Integer v7 = this.zzh;
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference v9 = this.zzj;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {v0_0, this.zzk}));
    }

    public byte[] serializeToBytes()
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.getRp(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 3, this.getUser(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p5, 4, this.getChallenge(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 5, this.getParameters(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(p5, 6, this.getTimeoutSeconds(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 7, this.getExcludeList(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 8, this.getAuthenticatorSelection(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(p5, 9, this.getRequestId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 10, this.getTokenBinding(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 11, this.getAttestationConveyancePreferenceAsString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 12, this.getAuthenticationExtensions(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
