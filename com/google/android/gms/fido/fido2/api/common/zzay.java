package com.google.android.gms.fido.fido2.api.common;
public final enum class zzay extends java.lang.Enum implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.fido2.api.common.zzay zza;
    public static final enum com.google.android.gms.fido.fido2.api.common.zzay zzb;
    public static final enum com.google.android.gms.fido.fido2.api.common.zzay zzc;
    private static final synthetic com.google.android.gms.fido.fido2.api.common.zzay[] zzd;
    private final String zze;

    static zzay()
    {
        com.google.android.gms.fido.fido2.api.common.zzaw v0_4 = new com.google.android.gms.fido.fido2.api.common.zzay("USER_VERIFICATION_REQUIRED", 0, "required");
        com.google.android.gms.fido.fido2.api.common.zzay.zza = v0_4;
        com.google.android.gms.fido.fido2.api.common.zzay v1_1 = new com.google.android.gms.fido.fido2.api.common.zzay("USER_VERIFICATION_PREFERRED", 1, "preferred");
        com.google.android.gms.fido.fido2.api.common.zzay.zzb = v1_1;
        com.google.android.gms.fido.fido2.api.common.zzay v2_1 = new com.google.android.gms.fido.fido2.api.common.zzay("USER_VERIFICATION_DISCOURAGED", 2, "discouraged");
        com.google.android.gms.fido.fido2.api.common.zzay.zzc = v2_1;
        com.google.android.gms.fido.fido2.api.common.zzay.zzd = new com.google.android.gms.fido.fido2.api.common.zzay[] {v0_4, v1_1, v2_1});
        com.google.android.gms.fido.fido2.api.common.zzay.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaw();
        return;
    }

    private zzay(String p1, int p2, String p3)
    {
        super(p1, p2);
        super.zze = p3;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.zzay[] values()
    {
        return ((com.google.android.gms.fido.fido2.api.common.zzay[]) com.google.android.gms.fido.fido2.api.common.zzay.zzd.clone());
    }

    public static com.google.android.gms.fido.fido2.api.common.zzay zza(String p5)
    {
        com.google.android.gms.fido.fido2.api.common.zzax v0_0 = com.google.android.gms.fido.fido2.api.common.zzay.values();
        int v2 = 0;
        while (v2 < v0_0.length) {
            com.google.android.gms.fido.fido2.api.common.zzay v3 = v0_0[v2];
            if (!p5.equals(v3.zze)) {
                v2++;
            } else {
                return v3;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.zzax(p5);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String toString()
    {
        return this.zze;
    }

    public final void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeString(this.zze);
        return;
    }
}
