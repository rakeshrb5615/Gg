package com.google.android.gms.fido.fido2.api.common;
public class PublicKeyCredentialRequestOptions extends com.google.android.gms.fido.fido2.api.common.RequestOptions {
    public static final android.os.Parcelable$Creator CREATOR;
    private final byte[] zza;
    private final Double zzb;
    private final String zzc;
    private final java.util.List zzd;
    private final Integer zze;
    private final com.google.android.gms.fido.fido2.api.common.TokenBinding zzf;
    private final com.google.android.gms.fido.fido2.api.common.zzay zzg;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions zzh;
    private final Long zzi;

    static PublicKeyCredentialRequestOptions()
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzao();
        return;
    }

    public PublicKeyCredentialRequestOptions(byte[] p1, Double p2, String p3, java.util.List p4, Integer p5, com.google.android.gms.fido.fido2.api.common.TokenBinding p6, String p7, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions p8, Long p9)
    {
        this.zza = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = p2;
        this.zzc = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zzd = p4;
        this.zze = p5;
        this.zzf = p6;
        this.zzi = p9;
        if (p7 == null) {
            this.zzg = 0;
        } else {
            try {
                this.zzg = com.google.android.gms.fido.fido2.api.common.zzay.zza(p7);
            } catch (com.google.android.gms.fido.fido2.api.common.zzax v1_4) {
                throw new IllegalArgumentException(v1_4);
            }
        }
        this.zzh = p8;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions deserializeFromBytes(byte[] p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(p1, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions.CREATOR));
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions)) {
            if ((java.util.Arrays.equals(this.zza, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zza)) && ((com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zzb)) && (com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zzc)))) {
                Long v0_4 = this.zzd;
                if ((v0_4 != null) || (((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zzd != null)) {
                    if (v0_4 == null) {
                        return 0;
                    } else {
                        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions v2_3 = ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zzd;
                        if ((v2_3 == null) || ((!v0_4.containsAll(v2_3)) || (!((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zzd.containsAll(this.zzd)))) {
                            return 0;
                        }
                    }
                }
                if ((com.google.android.gms.common.internal.Objects.equal(this.zze, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zze)) && ((com.google.android.gms.common.internal.Objects.equal(this.zzf, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zzf)) && ((com.google.android.gms.common.internal.Objects.equal(this.zzg, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zzg)) && ((com.google.android.gms.common.internal.Objects.equal(this.zzh, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zzh)) && (com.google.android.gms.common.internal.Objects.equal(this.zzi, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions) p4).zzi)))))) {
                    return 1;
                }
            }
            return 0;
        } else {
            return 0;
        }
    }

    public java.util.List getAllowList()
    {
        return this.zzd;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions getAuthenticationExtensions()
    {
        return this.zzh;
    }

    public byte[] getChallenge()
    {
        return this.zza;
    }

    public Integer getRequestId()
    {
        return this.zze;
    }

    public String getRpId()
    {
        return this.zzc;
    }

    public Double getTimeoutSeconds()
    {
        return this.zzb;
    }

    public com.google.android.gms.fido.fido2.api.common.TokenBinding getTokenBinding()
    {
        return this.zzf;
    }

    public int hashCode()
    {
        String v3 = this.zzc;
        Integer v5 = this.zze;
        com.google.android.gms.fido.fido2.api.common.zzay v7 = this.zzg;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(java.util.Arrays.hashCode(this.zza)), this.zzi}));
    }

    public byte[] serializeToBytes()
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        Long v1_6;
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p5, 2, this.getChallenge(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleObject(p5, 3, this.getTimeoutSeconds(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, this.getRpId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p5, 5, this.getAllowList(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerObject(p5, 6, this.getRequestId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 7, this.getTokenBinding(), p6, 0);
        Long v1_4 = this.zzg;
        if (v1_4 != null) {
            v1_6 = v1_4.toString();
        } else {
            v1_6 = 0;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 8, v1_6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 9, this.getAuthenticationExtensions(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(p5, 10, this.zzi, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzay zza()
    {
        return this.zzg;
    }
}
