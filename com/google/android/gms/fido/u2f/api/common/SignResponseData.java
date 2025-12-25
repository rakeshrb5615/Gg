package com.google.android.gms.fido.u2f.api.common;
public class SignResponseData extends com.google.android.gms.fido.u2f.api.common.ResponseData {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final String JSON_RESPONSE_DATA_CLIENT_DATA = "clientData";
    public static final String JSON_RESPONSE_DATA_KEY_HANDLE = "keyHandle";
    public static final String JSON_RESPONSE_DATA_SIGNATURE_DATA = "signatureData";
    private final byte[] zza;
    private final String zzb;
    private final byte[] zzc;
    private final byte[] zzd;

    static SignResponseData()
    {
        com.google.android.gms.fido.u2f.api.common.SignResponseData.CREATOR = new com.google.android.gms.fido.u2f.api.common.zzl();
        return;
    }

    public SignResponseData(byte[] p2, String p3, byte[] p4)
    {
        byte[] v0_1 = new byte[0];
        this(p2, p3, p4, v0_1);
        return;
    }

    public SignResponseData(byte[] p1, String p2, byte[] p3, byte[] p4)
    {
        this.zza = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzc = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zzd = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        return;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.u2f.api.common.SignResponseData)) {
            if ((!java.util.Arrays.equals(this.zza, ((com.google.android.gms.fido.u2f.api.common.SignResponseData) p4).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.u2f.api.common.SignResponseData) p4).zzb)) || ((!java.util.Arrays.equals(this.zzc, ((com.google.android.gms.fido.u2f.api.common.SignResponseData) p4).zzc)) || (!java.util.Arrays.equals(this.zzd, ((com.google.android.gms.fido.u2f.api.common.SignResponseData) p4).zzd))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public String getClientDataString()
    {
        return this.zzb;
    }

    public byte[] getKeyHandle()
    {
        return this.zza;
    }

    public byte[] getSignatureData()
    {
        return this.zzc;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(java.util.Arrays.hashCode(this.zza)), this.zzb, Integer.valueOf(java.util.Arrays.hashCode(this.zzc)), Integer.valueOf(java.util.Arrays.hashCode(this.zzd))}));
    }

    public org.json.JSONObject toJsonObject()
    {
        try {
            org.json.JSONException v0_1 = new org.json.JSONObject();
            v0_1.put("keyHandle", android.util.Base64.encodeToString(this.zza, 11));
            v0_1.put("clientData", android.util.Base64.encodeToString(this.zzb.getBytes(), 11));
            v0_1.put("signatureData", android.util.Base64.encodeToString(this.zzc, 11));
            return v0_1;
        } catch (org.json.JSONException v0_2) {
            throw new RuntimeException(v0_2);
        }
    }

    public String toString()
    {
        String v0_0 = com.google.android.gms.internal.fido.zzan.zza(this);
        String v2_5 = this.zza;
        v0_0.zzb("keyHandle", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_5, 0, v2_5.length));
        v0_0.zzb("clientDataString", this.zzb);
        String v2_1 = this.zzc;
        v0_0.zzb("signatureData", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_1, 0, v2_1.length));
        String v2_3 = this.zzd;
        v0_0.zzb("application", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_3, 0, v2_3.length));
        return v0_0.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 2, this.getKeyHandle(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.getClientDataString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 4, this.getSignatureData(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 5, this.zzd, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
