package com.google.android.gms.fido.u2f.api.common;
public final enum class ErrorCode extends java.lang.Enum implements android.os.Parcelable {
    public static final enum com.google.android.gms.fido.u2f.api.common.ErrorCode BAD_REQUEST;
    public static final enum com.google.android.gms.fido.u2f.api.common.ErrorCode CONFIGURATION_UNSUPPORTED;
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.u2f.api.common.ErrorCode DEVICE_INELIGIBLE;
    public static final enum com.google.android.gms.fido.u2f.api.common.ErrorCode OK;
    public static final enum com.google.android.gms.fido.u2f.api.common.ErrorCode OTHER_ERROR;
    public static final enum com.google.android.gms.fido.u2f.api.common.ErrorCode TIMEOUT;
    private static final String zza;
    private static final synthetic com.google.android.gms.fido.u2f.api.common.ErrorCode[] zzb;
    private final int zzc;

    static ErrorCode()
    {
        com.google.android.gms.fido.u2f.api.common.zzc v0_1 = new com.google.android.gms.fido.u2f.api.common.ErrorCode("OK", 0, 0);
        com.google.android.gms.fido.u2f.api.common.ErrorCode.OK = v0_1;
        com.google.android.gms.fido.u2f.api.common.ErrorCode.OTHER_ERROR = new com.google.android.gms.fido.u2f.api.common.ErrorCode("OTHER_ERROR", 1, 1);
        com.google.android.gms.fido.u2f.api.common.ErrorCode.BAD_REQUEST = new com.google.android.gms.fido.u2f.api.common.ErrorCode("BAD_REQUEST", 2, 2);
        com.google.android.gms.fido.u2f.api.common.ErrorCode.CONFIGURATION_UNSUPPORTED = new com.google.android.gms.fido.u2f.api.common.ErrorCode("CONFIGURATION_UNSUPPORTED", 3, 3);
        com.google.android.gms.fido.u2f.api.common.ErrorCode.DEVICE_INELIGIBLE = new com.google.android.gms.fido.u2f.api.common.ErrorCode("DEVICE_INELIGIBLE", 4, 4);
        com.google.android.gms.fido.u2f.api.common.ErrorCode v5_3 = new com.google.android.gms.fido.u2f.api.common.ErrorCode("TIMEOUT", 5, 5);
        com.google.android.gms.fido.u2f.api.common.ErrorCode.TIMEOUT = v5_3;
        com.google.android.gms.fido.u2f.api.common.ErrorCode.zzb = new com.google.android.gms.fido.u2f.api.common.ErrorCode[] {v0_1, v5_3});
        com.google.android.gms.fido.u2f.api.common.ErrorCode.zza = "ErrorCode";
        com.google.android.gms.fido.u2f.api.common.ErrorCode.CREATOR = new com.google.android.gms.fido.u2f.api.common.zzc();
        return;
    }

    private ErrorCode(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzc = p3;
        return;
    }

    public static com.google.android.gms.fido.u2f.api.common.ErrorCode toErrorCode(int p5)
    {
        com.google.android.gms.fido.u2f.api.common.ErrorCode[] v0 = com.google.android.gms.fido.u2f.api.common.ErrorCode.values();
        int v2 = 0;
        while (v2 < v0.length) {
            com.google.android.gms.fido.u2f.api.common.ErrorCode v3 = v0[v2];
            if (p5 != v3.zzc) {
                v2++;
            } else {
                return v3;
            }
        }
        return com.google.android.gms.fido.u2f.api.common.ErrorCode.OTHER_ERROR;
    }

    public static com.google.android.gms.fido.u2f.api.common.ErrorCode valueOf(String p1)
    {
        return ((com.google.android.gms.fido.u2f.api.common.ErrorCode) Enum.valueOf(com.google.android.gms.fido.u2f.api.common.ErrorCode, p1));
    }

    public static com.google.android.gms.fido.u2f.api.common.ErrorCode[] values()
    {
        return ((com.google.android.gms.fido.u2f.api.common.ErrorCode[]) com.google.android.gms.fido.u2f.api.common.ErrorCode.zzb.clone());
    }

    public int describeContents()
    {
        return 0;
    }

    public int getCode()
    {
        return this.zzc;
    }

    public void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeInt(this.zzc);
        return;
    }
}
