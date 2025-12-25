package com.google.android.gms.fido.fido2.api.common;
public final enum class ErrorCode extends java.lang.Enum implements android.os.Parcelable {
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode ABORT_ERR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode ATTESTATION_NOT_PRIVATE_ERR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode CONSTRAINT_ERR;
    public static final android.os.Parcelable$Creator CREATOR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode DATA_ERR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode ENCODING_ERR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode INVALID_STATE_ERR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode NETWORK_ERR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode NOT_ALLOWED_ERR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode NOT_SUPPORTED_ERR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode SECURITY_ERR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode TIMEOUT_ERR;
    public static final enum com.google.android.gms.fido.fido2.api.common.ErrorCode UNKNOWN_ERR;
    private static final synthetic com.google.android.gms.fido.fido2.api.common.ErrorCode[] zza;
    private final int zzb;

    static ErrorCode()
    {
        com.google.android.gms.fido.fido2.api.common.zzw v0_1 = new com.google.android.gms.fido.fido2.api.common.ErrorCode("NOT_SUPPORTED_ERR", 0, 9);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.NOT_SUPPORTED_ERR = v0_1;
        com.google.android.gms.fido.fido2.api.common.ErrorCode.INVALID_STATE_ERR = new com.google.android.gms.fido.fido2.api.common.ErrorCode("INVALID_STATE_ERR", 1, 11);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.SECURITY_ERR = new com.google.android.gms.fido.fido2.api.common.ErrorCode("SECURITY_ERR", 2, 18);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.NETWORK_ERR = new com.google.android.gms.fido.fido2.api.common.ErrorCode("NETWORK_ERR", 3, 19);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.ABORT_ERR = new com.google.android.gms.fido.fido2.api.common.ErrorCode("ABORT_ERR", 4, 20);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.TIMEOUT_ERR = new com.google.android.gms.fido.fido2.api.common.ErrorCode("TIMEOUT_ERR", 5, 23);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.ENCODING_ERR = new com.google.android.gms.fido.fido2.api.common.ErrorCode("ENCODING_ERR", 6, 27);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.UNKNOWN_ERR = new com.google.android.gms.fido.fido2.api.common.ErrorCode("UNKNOWN_ERR", 7, 28);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.CONSTRAINT_ERR = new com.google.android.gms.fido.fido2.api.common.ErrorCode("CONSTRAINT_ERR", 8, 29);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.DATA_ERR = new com.google.android.gms.fido.fido2.api.common.ErrorCode("DATA_ERR", 9, 30);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.NOT_ALLOWED_ERR = new com.google.android.gms.fido.fido2.api.common.ErrorCode("NOT_ALLOWED_ERR", 10, 35);
        com.google.android.gms.fido.fido2.api.common.ErrorCode v11_5 = new com.google.android.gms.fido.fido2.api.common.ErrorCode("ATTESTATION_NOT_PRIVATE_ERR", 11, 36);
        com.google.android.gms.fido.fido2.api.common.ErrorCode.ATTESTATION_NOT_PRIVATE_ERR = v11_5;
        com.google.android.gms.fido.fido2.api.common.ErrorCode.zza = new com.google.android.gms.fido.fido2.api.common.ErrorCode[] {v0_1, v11_5});
        com.google.android.gms.fido.fido2.api.common.ErrorCode.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzw();
        return;
    }

    private ErrorCode(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.zzb = p3;
        return;
    }

    public static com.google.android.gms.fido.fido2.api.common.ErrorCode toErrorCode(int p5)
    {
        com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException v0_0 = com.google.android.gms.fido.fido2.api.common.ErrorCode.values();
        int v2 = 0;
        while (v2 < v0_0.length) {
            com.google.android.gms.fido.fido2.api.common.ErrorCode v3 = v0_0[v2];
            if (p5 != v3.zzb) {
                v2++;
            } else {
                return v3;
            }
        }
        throw new com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException(p5);
    }

    public static com.google.android.gms.fido.fido2.api.common.ErrorCode valueOf(String p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.ErrorCode) Enum.valueOf(com.google.android.gms.fido.fido2.api.common.ErrorCode, p1));
    }

    public static com.google.android.gms.fido.fido2.api.common.ErrorCode[] values()
    {
        return ((com.google.android.gms.fido.fido2.api.common.ErrorCode[]) com.google.android.gms.fido.fido2.api.common.ErrorCode.zza.clone());
    }

    public int describeContents()
    {
        return 0;
    }

    public int getCode()
    {
        return this.zzb;
    }

    public void writeToParcel(android.os.Parcel p1, int p2)
    {
        p1.writeInt(this.zzb);
        return;
    }
}
