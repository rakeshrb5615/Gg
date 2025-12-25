package com.google.android.gms.fido.fido2.api.common;
public class AuthenticatorErrorResponse extends com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse {
    public static final android.os.Parcelable$Creator CREATOR;
    private final com.google.android.gms.fido.fido2.api.common.ErrorCode zza;
    private final String zzb;
    private final int zzc;

    static AuthenticatorErrorResponse()
    {
        com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse.CREATOR = new com.google.android.gms.fido.fido2.api.common.zzl();
        return;
    }

    public AuthenticatorErrorResponse(int p1, String p2, int p3)
    {
        try {
            this.zza = com.google.android.gms.fido.fido2.api.common.ErrorCode.toErrorCode(p1);
            this.zzb = p2;
            this.zzc = p3;
            return;
        } catch (com.google.android.gms.fido.fido2.api.common.ErrorCode$UnsupportedErrorCodeException v1_2) {
            throw new IllegalArgumentException(v1_2);
        }
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse deserializeFromBytes(byte[] p1)
    {
        return ((com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(p1, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse.CREATOR));
    }

    public boolean equals(Object p4)
    {
        if ((p4 instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse)) {
            if ((!com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) p4).zza)) || ((!com.google.android.gms.common.internal.Objects.equal(this.zzb, ((com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) p4).zzb)) || (!com.google.android.gms.common.internal.Objects.equal(Integer.valueOf(this.zzc), Integer.valueOf(((com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse) p4).zzc))))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public byte[] getClientDataJSON()
    {
        throw new UnsupportedOperationException();
    }

    public com.google.android.gms.fido.fido2.api.common.ErrorCode getErrorCode()
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
        return com.google.android.gms.common.internal.Objects.hashCode(new Object[] {this.zza, this.zzb, Integer.valueOf(this.zzc)}));
    }

    public byte[] serializeToBytes()
    {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
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
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(p4, 4, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(p4, p5);
        return;
    }

    public final org.json.JSONObject zza()
    {
        try {
            org.json.JSONException v0_1 = new org.json.JSONObject();
            v0_1.put("code", this.zza.getCode());
            RuntimeException v1_3 = this.zzb;
        } catch (org.json.JSONException v0_2) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", v0_2);
        }
        if (v1_3 == null) {
            return v0_1;
        } else {
            v0_1.put("message", v1_3);
            return v0_1;
        }
    }
}
