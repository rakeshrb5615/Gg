package com.google.android.gms.fido.fido2.api.common;
public final enum class TokenBinding$TokenBindingStatus extends java.lang.Enum implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus NOT_SUPPORTED;
    public static final enum com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus PRESENT;
    public static final enum com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus SUPPORTED;
    private static final synthetic com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus[] zza;
    private final String zzb;

    static TokenBinding$TokenBindingStatus()
    {
        com.google.android.gms.fido.fido2.api.common.zzat v0_4 = new com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus("PRESENT", 0, "present");
        com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.PRESENT = v0_4;
        com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus v1_1 = new com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus("SUPPORTED", 1, "supported");
        com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.SUPPORTED = v1_1;
        com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus v2_1 = new com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus("NOT_SUPPORTED", 2, "not-supported");
        com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.NOT_SUPPORTED = v2_1;
        com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.zza = new com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus[] {v0_4, v1_1, v2_1});
        com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzat();
        return;
    }

    private TokenBinding$TokenBindingStatus(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus fromString(String p5)
    {
        com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException v0_0 = com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.values();
        int v2 = 0;
        while (v2 < v0_0.length) {
            com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus v3 = v0_0[v2];
            if (!p5.equals(v3.zzb)) {
                v2++;
            } else {
                return v3;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.TokenBinding$UnsupportedTokenBindingStatusException(p5);
    }

    public static com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus valueOf(String p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus) Enum.valueOf(com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus, p1));
    }

    public static com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus[] values()
    {
        return ((com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus[]) com.google.android.gms.fido.fido2.api.common.TokenBinding$TokenBindingStatus.zza.clone());
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
