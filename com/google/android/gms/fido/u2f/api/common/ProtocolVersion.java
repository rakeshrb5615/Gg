package com.google.android.gms.fido.u2f.api.common;
public final enum class ProtocolVersion extends java.lang.Enum implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.u2f.api.common.ProtocolVersion UNKNOWN;
    public static final enum com.google.android.gms.fido.u2f.api.common.ProtocolVersion V1;
    public static final enum com.google.android.gms.fido.u2f.api.common.ProtocolVersion V2;
    private static final synthetic com.google.android.gms.fido.u2f.api.common.ProtocolVersion[] zza;
    private final String zzb;

    static ProtocolVersion()
    {
        com.google.android.gms.fido.u2f.api.common.zzf v0_4 = new com.google.android.gms.fido.u2f.api.common.ProtocolVersion("UNKNOWN", 0, "UNKNOWN");
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN = v0_4;
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion v1_2 = new com.google.android.gms.fido.u2f.api.common.ProtocolVersion("V1", 1, "U2F_V1");
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V1 = v1_2;
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion v2_1 = new com.google.android.gms.fido.u2f.api.common.ProtocolVersion("V2", 2, "U2F_V2");
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion.V2 = v2_1;
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion.zza = new com.google.android.gms.fido.u2f.api.common.ProtocolVersion[] {v0_4, v1_2, v2_1});
        com.google.android.gms.fido.u2f.api.common.ProtocolVersion.CREATOR = new com.google.android.gms.fido.u2f.api.common.zzf();
        return;
    }

    private ProtocolVersion(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.u2f.api.common.ProtocolVersion fromBytes(byte[] p2)
    {
        try {
            return com.google.android.gms.fido.u2f.api.common.ProtocolVersion.fromString(new String(p2, "UTF-8"));
        } catch (java.io.UnsupportedEncodingException v2_2) {
            throw new RuntimeException(v2_2);
        }
    }

    public static com.google.android.gms.fido.u2f.api.common.ProtocolVersion fromString(String p5)
    {
        if (p5 != null) {
            com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException v0_0 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.values();
            int v2 = 0;
            while (v2 < v0_0.length) {
                com.google.android.gms.fido.u2f.api.common.ProtocolVersion v3 = v0_0[v2];
                if (!p5.equals(v3.zzb)) {
                    v2++;
                } else {
                    return v3;
                }
            }
            throw new com.google.android.gms.fido.u2f.api.common.ProtocolVersion$UnsupportedProtocolException(p5);
        } else {
            return com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN;
        }
    }

    public static com.google.android.gms.fido.u2f.api.common.ProtocolVersion valueOf(String p1)
    {
        return ((com.google.android.gms.fido.u2f.api.common.ProtocolVersion) Enum.valueOf(com.google.android.gms.fido.u2f.api.common.ProtocolVersion, p1));
    }

    public static com.google.android.gms.fido.u2f.api.common.ProtocolVersion[] values()
    {
        return ((com.google.android.gms.fido.u2f.api.common.ProtocolVersion[]) com.google.android.gms.fido.u2f.api.common.ProtocolVersion.zza.clone());
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean isCompatible(com.google.android.gms.fido.u2f.api.common.ProtocolVersion p3)
    {
        boolean v0_0 = com.google.android.gms.fido.u2f.api.common.ProtocolVersion.UNKNOWN;
        if ((!this.equals(v0_0)) && (!p3.equals(v0_0))) {
            return this.equals(p3);
        } else {
            return 1;
        }
    }

    public String toString()
    {
        return this.zzb;
    }

    public void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeString(this.zzb);
        return;
    }
}
