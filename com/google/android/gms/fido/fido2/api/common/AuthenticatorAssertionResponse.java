package com.google.android.gms.fido.fido2.api.common;
public class AuthenticatorAssertionResponse extends com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse {
    public static final android.os.Parcelable$Creator CREATOR;
    private final byte[] zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final byte[] zzd;
    private final byte[] zze;

    static AuthenticatorAssertionResponse()
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzj();
        return;
    }

    public AuthenticatorAssertionResponse(byte[] p1, byte[] p2, byte[] p3, byte[] p4, byte[] p5)
    {
        this.zza = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzc = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zzd = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        this.zze = p5;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse deserializeFromBytes(byte[] p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(p1, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse.CREATOR));
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse)) {
            if ((!java.util.Arrays.equals(this.zza, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) p4).zza)) || ((!java.util.Arrays.equals(this.zzb, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) p4).zzb)) || ((!java.util.Arrays.equals(this.zzc, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) p4).zzc)) || ((!java.util.Arrays.equals(this.zzd, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) p4).zzd)) || (!java.util.Arrays.equals(this.zze, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse) p4).zze)))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public byte[] getAuthenticatorData()
    {
        return this.zzc;
    }

    public byte[] getClientDataJSON()
    {
        return this.zzb;
    }

    public byte[] getKeyHandle()
    {
        return this.zza;
    }

    public byte[] getSignature()
    {
        return this.zzd;
    }

    public byte[] getUserHandle()
    {
        return this.zze;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(java.util.Arrays.hashCode(this.zza)), Integer.valueOf(java.util.Arrays.hashCode(this.zzb)), Integer.valueOf(java.util.Arrays.hashCode(this.zzc)), Integer.valueOf(java.util.Arrays.hashCode(this.zzd)), Integer.valueOf(java.util.Arrays.hashCode(this.zze))}));
    }

    public byte[] serializeToBytes()
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString()
    {
        String v0_0 = com.google.android.gms.internal.fido.zzan.zza(this);
        String v2_7 = this.zza;
        v0_0.zzb("keyHandle", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_7, 0, v2_7.length));
        String v2_0 = this.zzb;
        v0_0.zzb("clientDataJSON", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_0, 0, v2_0.length));
        String v2_2 = this.zzc;
        v0_0.zzb("authenticatorData", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_2, 0, v2_2.length));
        String v2_4 = this.zzd;
        v0_0.zzb("signature", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_4, 0, v2_4.length));
        String v1_7 = this.zze;
        if (v1_7 != null) {
            v0_0.zzb("userHandle", com.google.android.gms.internal.fido.zzch.zzf().zzg(v1_7, 0, v1_7.length));
        }
        return v0_0.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 2, this.getKeyHandle(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 3, this.getClientDataJSON(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 4, this.getAuthenticatorData(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 5, this.getSignature(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 6, this.getUserHandle(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final org.json.JSONObject zza()
    {
        try {
            org.json.JSONException v0_1 = new org.json.JSONObject();
            v0_1.put("clientDataJSON", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(this.zzb));
            v0_1.put("authenticatorData", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(this.zzc));
            v0_1.put("signature", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(this.zzd));
            RuntimeException v1_1 = this.zze;
        } catch (org.json.JSONException v0_2) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", v0_2);
        }
        if (v1_1 == null) {
            return v0_1;
        } else {
            v0_1.put("userHandle", com.google.android.gms.common.util.Base64Utils.encodeUrlSafeNoPadding(v1_1));
            return v0_1;
        }
    }
}
