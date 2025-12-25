package com.google.android.gms.fido.u2f.api.common;
public class Error {
    public static final String JSON_ERROR_CODE = "errorCode";
    public static final String JSON_ERROR_MESSAGE = "errorMessage";
    private final com.google.android.gms.fido.u2f.api.common.ErrorCode zza;
    private final String zzb;

    public Error(com.google.android.gms.fido.u2f.api.common.ErrorCode p1)
    {
        this.zza = p1;
        this.zzb = 0;
        return;
    }

    public Error(com.google.android.gms.fido.u2f.api.common.ErrorCode p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public com.google.android.gms.fido.u2f.api.common.ErrorCode getErrorCode()
    {
        return this.zza;
    }

    public String getErrorMessage()
    {
        return this.zzb;
    }

    public org.json.JSONObject toJsonObject()
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
        if (this.zzb != null) {
            String v0_7 = this.zza.getCode();
            String v3 = this.zzb;
            StringBuilder v4_0 = new StringBuilder("{errorCode: ");
            v4_0.append(v0_7);
            v4_0.append(", errorMessage: ");
            v4_0.append(v3);
            v4_0.append("}");
            return v4_0.toString();
        } else {
            return v1.a.j("{errorCode: ", this.zza.getCode(), "}");
        }
    }
}
