package com.google.android.gms.fido.u2f.api.common;
public class RegisteredKey extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    String zza;
    private final com.google.android.gms.fido.u2f.api.common.KeyHandle zzb;
    private final String zzc;

    static RegisteredKey()
    {
        com.google.android.gms.fido.u2f.api.common.RegisteredKey.CREATOR = new com.google.android.gms.fido.u2f.api.common.zzj();
        return;
    }

    public RegisteredKey(com.google.android.gms.fido.u2f.api.common.KeyHandle p2)
    {
        this(p2, 0, 0);
        return;
    }

    public RegisteredKey(com.google.android.gms.fido.u2f.api.common.KeyHandle p1, String p2, String p3)
    {
        this.zzb = ((com.google.android.gms.fido.u2f.api.common.KeyHandle) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zza = p2;
        this.zzc = p3;
        return;
    }

    public static com.google.android.gms.fido.u2f.api.common.RegisteredKey parseFromJson(org.json.JSONObject p5)
    {
        int v0_1;
        String v2 = 0;
        if (!p5.has("challenge")) {
            v0_1 = 0;
        } else {
            v0_1 = p5.getString("challenge");
        }
        com.google.android.gms.fido.u2f.api.common.KeyHandle v1_1 = com.google.android.gms.fido.u2f.api.common.KeyHandle.parseFromJson(p5);
        if (p5.has("appId")) {
            v2 = p5.getString("appId");
        }
        return new com.google.android.gms.fido.u2f.api.common.RegisteredKey(v1_1, v0_1, v2);
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.fido.u2f.api.common.RegisteredKey)) {
                String v1_6 = this.zza;
                if (v1_6 != null) {
                    if (!v1_6.equals(((com.google.android.gms.fido.u2f.api.common.RegisteredKey) p5).zza)) {
                        return 0;
                    }
                } else {
                    if (((com.google.android.gms.fido.u2f.api.common.RegisteredKey) p5).zza != null) {
                        return 0;
                    }
                }
                if (this.zzb.equals(((com.google.android.gms.fido.u2f.api.common.RegisteredKey) p5).zzb)) {
                    String v1_5 = this.zzc;
                    if (v1_5 != null) {
                        if (!v1_5.equals(((com.google.android.gms.fido.u2f.api.common.RegisteredKey) p5).zzc)) {
                            return 0;
                        }
                    } else {
                        if (((com.google.android.gms.fido.u2f.api.common.RegisteredKey) p5).zzc != null) {
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
            return 1;
        }
    }

    public String getAppId()
    {
        return this.zzc;
    }

    public String getChallengeValue()
    {
        return this.zza;
    }

    public com.google.android.gms.fido.u2f.api.common.KeyHandle getKeyHandle()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        String v0_2;
        String v0_0 = this.zza;
        int v1 = 0;
        if (v0_0 != null) {
            v0_2 = v0_0.hashCode();
        } else {
            v0_2 = 0;
        }
        int v2_1 = (this.zzb.hashCode() + ((v0_2 + 31) * 31));
        String v0_1 = this.zzc;
        if (v0_1 != null) {
            v1 = v0_1.hashCode();
        }
        return ((v2_1 * 31) + v1);
    }

    public org.json.JSONObject toJson()
    {
        org.json.JSONException v0_1 = new org.json.JSONObject();
        String v1_1 = this.zza;
        if (v1_1 != null) {
            v0_1.put("challenge", v1_1);
        }
        String v1_5 = this.zzb.zza();
        String v2_0 = v1_5.keys();
        while (v2_0.hasNext()) {
            String v3_2 = ((String) v2_0.next());
            v0_1.put(v3_2, v1_5.get(v3_2));
        }
        String v1_0 = this.zzc;
        if (v1_0 != null) {
            v0_1.put("appId", v1_0);
        }
        return v0_1;
    }

    public String toString()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("keyHandle", android.util.Base64.encodeToString(this.zzb.getBytes(), 11));
        if (this.zzb.getProtocolVersion() != com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN) {
            v0_1.put("version", this.zzb.getProtocolVersion().toString());
        }
        if (this.zzb.getTransports() != null) {
            v0_1.put("transports", this.zzb.getTransports().toString());
        }
        String v1_7 = this.zza;
        if (v1_7 != null) {
            v0_1.put("challenge", v1_7);
        }
        String v1_8 = this.zzc;
        if (v1_8 != null) {
            v0_1.put("appId", v1_8);
        }
        return v0_1.toString();
    }

    public void writeToParcel(android.os.Parcel p5, int p6)
    {
        int v0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p5);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(p5, 2, this.getKeyHandle(), p6, 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 3, this.getChallengeValue(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p5, 4, this.getAppId(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p5, v0);
        return;
    }
}
