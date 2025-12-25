package com.google.android.gms.fido.fido2.api.common;
public final enum class ResidentKeyRequirement extends java.lang.Enum implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement RESIDENT_KEY_DISCOURAGED;
    public static final enum com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement RESIDENT_KEY_PREFERRED;
    public static final enum com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement RESIDENT_KEY_REQUIRED;
    private static final synthetic com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] zza;
    private final String zzb;

    static ResidentKeyRequirement()
    {
        com.google.android.gms.fido.fido2.api.common.zzas v0_4 = new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement("RESIDENT_KEY_DISCOURAGED", 0, "discouraged");
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.RESIDENT_KEY_DISCOURAGED = v0_4;
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement v1_1 = new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement("RESIDENT_KEY_PREFERRED", 1, "preferred");
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.RESIDENT_KEY_PREFERRED = v1_1;
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement v2_1 = new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement("RESIDENT_KEY_REQUIRED", 2, "required");
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.RESIDENT_KEY_REQUIRED = v2_1;
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.zza = new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] {v0_4, v1_1, v2_1});
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzas();
        return;
    }

    private ResidentKeyRequirement(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement fromString(String p5)
    {
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException v0_0 = com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.values();
        int v2 = 0;
        while (v2 < v0_0.length) {
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement v3 = v0_0[v2];
            if (!p5.equals(v3.zzb)) {
                v2++;
            } else {
                return v3;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement$UnsupportedResidentKeyRequirementException(p5);
    }

    public static com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement valueOf(String p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement) Enum.valueOf(com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement, p1));
    }

    public static com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[] values()
    {
        return ((com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement[]) com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.zza.clone());
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
