package com.google.android.gms.fido.fido2.api.common;
public final enum class AttestationConveyancePreference extends java.lang.Enum implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference DIRECT;
    public static final enum com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference INDIRECT;
    public static final enum com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference NONE;
    private static final synthetic com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference[] zza;
    private final String zzb;

    static AttestationConveyancePreference()
    {
        com.google.android.gms.fido.fido2.api.common.zzb v0_4 = new com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference("NONE", 0, "none");
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.NONE = v0_4;
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference v1_1 = new com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference("INDIRECT", 1, "indirect");
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.INDIRECT = v1_1;
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference v2_1 = new com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference("DIRECT", 2, "direct");
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.DIRECT = v2_1;
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.zza = new com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference[] {v0_4, v1_1, v2_1});
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzb();
        return;
    }

    private AttestationConveyancePreference(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference fromString(String p5)
    {
        com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException v0_0 = com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.values();
        int v2 = 0;
        while (v2 < v0_0.length) {
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference v3 = v0_0[v2];
            if (!p5.equals(v3.zzb)) {
                v2++;
            } else {
                return v3;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference$UnsupportedAttestationConveyancePreferenceException(p5);
    }

    public static com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference valueOf(String p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference) Enum.valueOf(com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference, p1));
    }

    public static com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference[] values()
    {
        return ((com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference[]) com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.zza.clone());
    }

    public int describeContents()
    {
        return 0;
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
