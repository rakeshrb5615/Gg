package com.google.android.gms.fido.u2f.api.common;
public class RegisterRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final int U2F_V1_CHALLENGE_BYTE_LENGTH = 65;
    private final int zza;
    private final com.google.android.gms.fido.u2f.api.common.ProtocolVersion zzb;
    private final byte[] zzc;
    private final String zzd;

    static RegisterRequest()
    {
        com.google.android.gms.fido.u2f.api.common.RegisterRequest.CREATOR = new com.google.android.gms.fido.u2f.api.common.zzg();
        return;
    }

    public RegisterRequest(int p1, String p2, byte[] p3, String p4)
    {
        this.zza = p1;
        try {
            this.zzb = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(p2);
            this.zzc = p3;
            this.zzd = p4;
            return;
        } catch (com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException v1_2) {
            throw new IllegalArgumentException(v1_2);
        }
    }

    public RegisterRequest(com.google.android.gms.fido.u2f.api.common.ProtocolVersion p3, byte[] p4, String p5)
    {
        int v0 = 1;
        this.zza = 1;
        this.zzb = ((com.google.android.gms.fido.u2f.api.common.ProtocolVersion) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3));
        this.zzc = ((byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4));
        if (p3 == com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1) {
            if (p4.length != 65) {
                v0 = 0;
            }
            com.google.android.gms.common.internal.Preconditions.checkArgument(v0, "invalid challengeValue length for V1");
        }
        this.zzd = p5;
        return;
    }

    public static com.google.android.gms.fido.u2f.api.common.RegisterRequest parseFromJson(org.json.JSONObject p5)
    {
        org.json.JSONException v0_7;
        String v2 = 0;
        if (!p5.has("version")) {
            v0_7 = 0;
        } else {
            v0_7 = p5.getString("version");
        }
        try {
            org.json.JSONException v0_8 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(v0_7);
            try {
                byte[] v1_3 = android.util.Base64.decode(p5.getString("challenge"), 8);
            } catch (String v5_3) {
                throw new org.json.JSONException(v5_3.toString());
            }
            if (p5.has("appId")) {
                v2 = p5.getString("appId");
            }
            try {
                return new com.google.android.gms.fido.u2f.api.common.RegisterRequest(v0_8, v1_3, v2);
            } catch (String v5_7) {
                throw new org.json.JSONException(v5_7.getMessage());
            }
        } catch (String v5_1) {
            throw new org.json.JSONException(v5_1.toString());
        }
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.fido.u2f.api.common.RegisterRequest)) {
                if (java.util.Arrays.equals(this.zzc, ((com.google.android.gms.fido.u2f.api.common.RegisterRequest) p5).zzc)) {
                    if (this.zzb == ((com.google.android.gms.fido.u2f.api.common.RegisterRequest) p5).zzb) {
                        String v1_1 = this.zzd;
                        if (v1_1 != null) {
                            if (!v1_1.equals(((com.google.android.gms.fido.u2f.api.common.RegisterRequest) p5).zzd)) {
                                return 0;
                            }
                        } else {
                            if (((com.google.android.gms.fido.u2f.api.common.RegisterRequest) p5).zzd != null) {
                                return 0;
                            }
                        }
                        return 1;
                    } else {
                        return 0;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public String getAppId()
    {
        return this.zzd;
    }

    public byte[] getChallengeValue()
    {
        return this.zzc;
    }

    public com.google.android.gms.fido.u2f.api.common.ProtocolVersion getProtocolVersion()
    {
        return this.zzb;
    }

    public int getVersionCode()
    {
        return this.zza;
    }

    public int hashCode()
    {
        int v1_0;
        int v0_6 = (((java.util.Arrays.hashCode(this.zzc) + 31) * 31) + this.zzb.hashCode());
        int v1_3 = this.zzd;
        if (v1_3 != 0) {
            v1_0 = v1_3.hashCode();
        } else {
            v1_0 = 0;
        }
        return ((v0_6 * 31) + v1_0);
    }

    public org.json.JSONObject toJson()
    {
        org.json.JSONException v0_1 = new org.json.JSONObject();
        try {
            v0_1.put("version", this.zzb.toString());
            v0_1.put("challenge", android.util.Base64.encodeToString(this.zzc, 11));
            RuntimeException v1_0 = this.zzd;
        } catch (org.json.JSONException v0_2) {
            throw new RuntimeException(v0_2);
        }
        if (v1_0 == null) {
            return v0_1;
        } else {
            v0_1.put("appId", v1_0);
            return v0_1;
        }
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 2, this.zzb.toString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 3, this.getChallengeValue(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 4, this.getAppId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
