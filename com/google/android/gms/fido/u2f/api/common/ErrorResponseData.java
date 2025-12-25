package com.google.android.gms.fido.u2f.api.common;
public class ErrorResponseData extends com.google.android.gms.fido.u2f.api.common.ResponseData {
    public static final android.os.Parcelable$Creator CREATOR = None;
    public static final String JSON_ERROR_CODE = "errorCode";
    public static final String JSON_ERROR_MESSAGE = "errorMessage";
    private final com.google.android.gms.fido.u2f.api.common.ErrorCode zza;
    private final String zzb;

    static ErrorResponseData()
    {
        com.google.android.gms.fido.u2f.api.common.ErrorResponseData.CREATOR = new com.google.android.gms.fido.u2f.api.common.zzd();
        return;
    }

    public ErrorResponseData(int p1, String p2)
    {
        this.zza = com.google.android.gms.fido.u2f.api.common.ErrorCode.toErrorCode(p1);
        this.zzb = p2;
        return;
    }

    public ErrorResponseData(com.google.android.gms.fido.u2f.api.common.ErrorCode p1)
    {
        this.zza = ((com.google.android.gms.fido.u2f.api.common.ErrorCode) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = 0;
        return;
    }

    public ErrorResponseData(com.google.android.gms.fido.u2f.api.common.ErrorCode p1, String p2)
    {
        this.zza = ((com.google.android.gms.fido.u2f.api.common.ErrorCode) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        this.zzb = p2;
        return;
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.u2f.api.common.ErrorResponseData)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.u2f.api.common.ErrorResponseData) p4).zza)) || (!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.u2f.api.common.ErrorResponseData) p4).zzb))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public com.google.android.gms.fido.u2f.api.common.ErrorCode getErrorCode()
    {
        return this.zza;
    }

    public int getErrorCodeAsInt()
    {
        return this.zza.getCode();
    }

    public String getErrorMessage()
    {
        return this.zzb;
    }

    public int hashCode()
    {
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzb}));
    }

    public final org.json.JSONObject toJsonObject()
    {
        org.json.JSONException v0_1 = new org.json.JSONObject();
        try {
            v0_1.put("errorCode", this.zza.getCode());
            RuntimeException v1_3 = this.zzb;
        } catch (org.json.JSONException v0_2) {
            throw new RuntimeException(v0_2);
        }
        if (v1_3 == null) {
            return v0_1;
        } else {
            v0_1.put("errorMessage", v1_3);
            return v0_1;
        }
    }

    public String toString()
    {
        String v0_0 = com.google.android.gms.internal.fido.zzan.zza(this);
        v0_0.zza("errorCode", this.zza.getCode());
        String v1_2 = this.zzb;
        if (v1_2 != null) {
            v0_0.zzb("errorMessage", v1_2);
        }
        return v0_0.toString();
    }

    public void writeToParcel(android.os.Parcel p4, int p5)
    {
        p5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(p4);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 2, this.getErrorCodeAsInt());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(p4, 3, this.getErrorMessage(), 0);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }
}
