package com.google.android.gms.fido.u2f.api.common;
public class RegisterResponseData extends com.google.android.gms.fido.u2f.api.common.ResponseData {
    public static final android.os.Parcelable$Creator CREATOR;
    private final byte[] zza;
    private final com.google.android.gms.fido.u2f.api.common.ProtocolVersion zzb;
    private final String zzc;

    static RegisterResponseData()
    {
        com.google.android.gms.fido.u2f.api.common.RegisterResponseData.CREATOR = new com.google.android.gms.fido.u2f.api.common.zzi();
        return;
    }

    public RegisterResponseData(byte[] p1)
    {
        this.zza = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1;
        this.zzc = 0;
        return;
    }

    public RegisterResponseData(byte[] p3, com.google.android.gms.fido.u2f.api.common.ProtocolVersion p4, String p5)
    {
        int v3_1;
        this.zza = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zzb = ((com.google.android.gms.fido.u2f.api.common.ProtocolVersion) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        int v0 = 0;
        if (p4 == com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN) {
            v3_1 = 0;
        } else {
            v3_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v3_1);
        if (p4 != com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1) {
            this.zzc = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p5));
            return;
        } else {
            if (p5 == null) {
                v0 = 1;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(v0);
            this.zzc = 0;
            return;
        }
    }

    public RegisterResponseData(byte[] p1, String p2, String p3)
    {
        this.zza = p1;
        try {
            this.zzb = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(p2);
            this.zzc = p3;
            return;
        } catch (com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException v1_2) {
            throw new IllegalArgumentException(v1_2);
        }
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.u2f.api.common.RegisterResponseData)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.u2f.api.common.RegisterResponseData) p4).zzb)) || ((!java.util.Arrays.equals(this.zza, ((com.google.android.gms.fido.u2f.api.common.RegisterResponseData) p4).zza)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzc, ((com.google.android.gms.fido.u2f.api.common.RegisterResponseData) p4).zzc)))) {
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
        return this.zzc;
    }

    public com.google.android.gms.fido.u2f.api.common.ProtocolVersion getProtocolVersion()
    {
        return this.zzb;
    }

    public byte[] getRegisterData()
    {
        return this.zza;
    }

    public int getVersionCode()
    {
        int v0_1 = this.zzb.ordinal();
        int v1 = 1;
        if (v0_1 != 1) {
            v1 = 2;
            if (v0_1 != 2) {
                return -1;
            }
        }
        return v1;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zzb, Integer.valueOf(java.util.Arrays.hashCode(this.zza)), this.zzc}));
    }

    public org.json.JSONObject toJsonObject()
    {
        try {
            org.json.JSONException v0_1 = new org.json.JSONObject();
            v0_1.put("registrationData", android.util.Base64.encodeToString(this.zza, 11));
            v0_1.put("version", this.zzb.toString());
            RuntimeException v1_0 = this.zzc;
        } catch (org.json.JSONException v0_2) {
            throw new RuntimeException(v0_2);
        }
        if (v1_0 == null) {
            return v0_1;
        } else {
            v0_1.put("clientData", android.util.Base64.encodeToString(v1_0.getBytes(), 11));
            return v0_1;
        }
    }

    public String toString()
    {
        String v0_0 = com.google.android.gms.internal.fido.zzan.zza(this);
        v0_0.zzb("protocolVersion", this.zzb);
        String v2_3 = this.zza;
        v0_0.zzb("registerData", com.google.android.gms.internal.fido.zzch.zzf().zzg(v2_3, 0, v2_3.length));
        String v1_1 = this.zzc;
        if (v1_1 != null) {
            v0_0.zzb("clientDataString", v1_1);
        }
        return v0_0.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 2, this.getRegisterData(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.zzb.toString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.getClientDataString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
