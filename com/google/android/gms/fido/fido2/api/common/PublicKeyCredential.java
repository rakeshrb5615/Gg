package com.google.android.gms.fido.fido2.api.common;
public class PublicKeyCredential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final String zza;
    private final String zzb;
    private final byte[] zzc;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse zzd;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse zze;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse zzf;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs zzg;
    private final String zzh;

    static PublicKeyCredential()
    {
        com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzal();
        return;
    }

    public PublicKeyCredential(String p3, String p4, byte[] p5, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse p6, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse p7, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse p8, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs p9, String p10)
    {
        int v0 = 1;
        if (((p6 == null) || ((p7 != null) || (p8 != null))) && (((p6 != null) || ((p7 == null) || (p8 != null))) && ((p6 != null) || ((p7 != null) || (p8 == null))))) {
            v0 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0);
        this.zza = p3;
        this.zzb = p4;
        this.zzc = p5;
        this.zzd = p6;
        this.zze = p7;
        this.zzf = p8;
        this.zzg = p9;
        this.zzh = p10;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.PublicKeyCredential deserializeFromBytes(byte[] p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(p1, com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.CREATOR));
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.PublicKeyCredential)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) p4).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) p4).zzb)) || ((!java.util.Arrays.equals(this.zzc, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) p4).zzc)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzd, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) p4).zzd)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zze, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) p4).zze)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzf, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) p4).zzf)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzg, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) p4).zzg)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzh, ((com.google.android.gms.fido.fido2.api.common.PublicKeyCredential) p4).zzh))))))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public String getAuthenticatorAttachment()
    {
        return this.zzh;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs getClientExtensionResults()
    {
        return this.zzg;
    }

    public String getId()
    {
        return this.zza;
    }

    public byte[] getRawId()
    {
        return this.zzc;
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse getResponse()
    {
        IllegalStateException v0_0 = this.zzd;
        if (v0_0 == null) {
            IllegalStateException v0_1 = this.zze;
            if (v0_1 == null) {
                IllegalStateException v0_2 = this.zzf;
                if (v0_2 == null) {
                    throw new IllegalStateException("No response set.");
                } else {
                    return v0_2;
                }
            } else {
                return v0_1;
            }
        } else {
            return v0_0;
        }
    }

    public String getType()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        byte[] v2 = this.zzc;
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse v4 = this.zzd;
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs v6 = this.zzg;
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzh}));
    }

    public byte[] serializeToBytes()
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toJson()
    {
        String v0_1 = new org.json.JSONObject();
        org.json.JSONObject v1_2 = this.zzc;
        if ((v1_2 != null) && (v1_2.length > 0)) {
            v0_1.put("rawId", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(v1_2));
        }
        org.json.JSONObject v1_0 = this.zzh;
        if (v1_0 != null) {
            v0_1.put("authenticatorAttachment", v1_0);
        }
        org.json.JSONObject v1_1 = this.zzb;
        if ((v1_1 != null) && (this.zzf == null)) {
            v0_1.put("type", v1_1);
        }
        org.json.JSONObject v1_3 = this.zza;
        if (v1_3 != null) {
            v0_1.put("id", v1_3);
        }
        int v2_7;
        org.json.JSONObject v1_4 = "response";
        int v2_4 = this.zze;
        int v3 = 1;
        if (v2_4 == 0) {
            int v2_5 = this.zzd;
            if (v2_5 == 0) {
                int v2_6 = this.zzf;
                v3 = 0;
                if (v2_6 == 0) {
                    v2_7 = 0;
                } else {
                    v2_7 = v2_6.zza();
                    v1_4 = "error";
                }
            } else {
                v2_7 = v2_5.zza();
            }
        } else {
            v2_7 = v2_4.zza();
        }
        if (v2_7 != 0) {
            v0_1.put(v1_4, v2_7);
        }
        org.json.JSONObject v1_5 = this.zzg;
        if (v1_5 == null) {
            if (v3 != 0) {
                v0_1.put("clientExtensionResults", new org.json.JSONObject());
            }
        } else {
            v0_1.put("clientExtensionResults", v1_5.zza());
        }
        return v0_1.toString();
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 1, this.getId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 2, this.getType(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p5, 3, this.getRawId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 4, this.zzd, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 5, this.zze, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 6, this.zzf, p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 7, this.getClientExtensionResults(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 8, this.getAuthenticatorAttachment(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
