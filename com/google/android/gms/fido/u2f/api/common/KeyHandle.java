package com.google.android.gms.fido.u2f.api.common;
public class KeyHandle extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    private final int zza;
    private final byte[] zzb;
    private final com.google.android.gms.fido.u2f.api.common.ProtocolVersion zzc;
    private final java.util.List zzd;

    static KeyHandle()
    {
        com.google.android.gms.fido.u2f.api.common.KeyHandle.CREATOR = new com.google.android.gms.fido.u2f.api.common.zze();
        return;
    }

    public KeyHandle(int p1, byte[] p2, String p3, java.util.List p4)
    {
        this.zza = p1;
        this.zzb = p2;
        try {
            this.zzc = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(p3);
            this.zzd = p4;
            return;
        } catch (com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException v1_2) {
            throw new IllegalArgumentException(v1_2);
        }
    }

    public KeyHandle(byte[] p2, com.google.android.gms.fido.u2f.api.common.ProtocolVersion p3, java.util.List p4)
    {
        this.zza = 1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public static com.google.android.gms.fido.u2f.api.common.KeyHandle parseFromJson(org.json.JSONObject p5)
    {
        org.json.JSONException v0_5;
        java.util.List v2 = 0;
        if (!p5.has("version")) {
            v0_5 = 0;
        } else {
            v0_5 = p5.getString("version");
        }
        try {
            org.json.JSONException v0_6 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(v0_5);
            try {
                byte[] v1_3 = android.util.Base64.decode(p5.getString("keyHandle"), 8);
            } catch (com.google.android.gms.fido.u2f.api.common.KeyHandle v5_3) {
                throw new org.json.JSONException(v5_3.toString());
            }
            if (p5.has("transports")) {
                v2 = com.google.android.gms.fido.common.Transport.parseTransports(p5.getJSONArray("transports"));
            }
            return new com.google.android.gms.fido.u2f.api.common.KeyHandle(v1_3, v0_6, v2);
        } catch (com.google.android.gms.fido.u2f.api.common.KeyHandle v5_1) {
            throw new org.json.JSONException(v5_1.toString());
        }
    }

    public boolean equals(Object p5)
    {
        if (this != p5) {
            if ((p5 instanceof com.google.android.gms.fido.u2f.api.common.KeyHandle)) {
                if (java.util.Arrays.equals(this.zzb, ((com.google.android.gms.fido.u2f.api.common.KeyHandle) p5).zzb)) {
                    if (this.zzc.equals(((com.google.android.gms.fido.u2f.api.common.KeyHandle) p5).zzc)) {
                        java.util.List v1_2 = this.zzd;
                        if ((v1_2 == null) && (((com.google.android.gms.fido.u2f.api.common.KeyHandle) p5).zzd == null)) {
                            return 1;
                        } else {
                            if (v1_2 != null) {
                                java.util.List v3_2 = ((com.google.android.gms.fido.u2f.api.common.KeyHandle) p5).zzd;
                                if ((v3_2 != null) && ((v1_2.containsAll(v3_2)) && (((com.google.android.gms.fido.u2f.api.common.KeyHandle) p5).zzd.containsAll(this.zzd)))) {
                                    return 1;
                                }
                            }
                            return 0;
                        }
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

    public byte[] getBytes()
    {
        return this.zzb;
    }

    public com.google.android.gms.fido.u2f.api.common.ProtocolVersion getProtocolVersion()
    {
        return this.zzc;
    }

    public java.util.List getTransports()
    {
        return this.zzd;
    }

    public int getVersionCode()
    {
        return this.zza;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {Integer.valueOf(java.util.Arrays.hashCode(this.zzb)), this.zzc, this.zzd}));
    }

    public org.json.JSONObject toJson()
    {
        return this.zza();
    }

    public String toString()
    {
        String v0_2;
        String v0_0 = this.zzd;
        if (v0_0 != null) {
            v0_2 = v0_0.toString();
        } else {
            v0_2 = "null";
        }
        String v1_4 = com.google.android.gms.common.util.Base64Utils.encode(this.zzb);
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion v2 = this.zzc;
        StringBuilder v3_0 = new StringBuilder("{keyHandle: ");
        v3_0.append(v1_4);
        v3_0.append(", version: ");
        v3_0.append(v2);
        v3_0.append(", transports: ");
        return v1.a.n(v3_0, v0_2, "}");
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 1, this.getVersionCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(p4, 2, this.getBytes(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.zzc.toString(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(p4, 4, this.getTransports(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final org.json.JSONObject zza()
    {
        org.json.JSONException v0_1 = new org.json.JSONObject();
        org.json.JSONArray v1_4 = this.zzb;
        if (v1_4 != null) {
            v0_1.put("keyHandle", android.util.Base64.encodeToString(v1_4, 11));
        }
        org.json.JSONArray v1_8 = this.zzc;
        if (v1_8 != null) {
            v0_1.put("version", v1_8.toString());
        }
        if (this.zzd != null) {
            org.json.JSONArray v1_3 = new org.json.JSONArray();
            String v2_2 = this.zzd.iterator();
            while (v2_2.hasNext()) {
                v1_3.put(((com.google.android.gms.fido.common.Transport) v2_2.next()).toString());
            }
            v0_1.put("transports", v1_3);
        }
        return v0_1;
    }
}
