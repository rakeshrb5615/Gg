package com.google.android.gms.internal.firebase-auth-api;
public final class zzahw {
    private Long zza;
    private Long zzb;

    public zzahw()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzahw zza(String p4)
    {
        try {
            java.io.UnsupportedEncodingException v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzahw();
            String v1_2 = new org.json.JSONObject(p4);
            v1_2.optString("iss");
            v1_2.optString("aud");
            v1_2.optString("sub");
            v0_1.zza = Long.valueOf(v1_2.optLong("iat"));
            v0_1.zzb = Long.valueOf(v1_2.optLong("exp"));
            v1_2.optBoolean("is_anonymous");
            return v0_1;
        } catch (String v4_6) {
            if (android.util.Log.isLoggable("JwtToken", 3)) {
                android.util.Log.d("JwtToken", "Failed to read JwtToken from JSONObject. ".concat(String.valueOf(v4_6)));
            }
            throw new java.io.UnsupportedEncodingException("Failed to read JwtToken from JSONObject. ".concat(String.valueOf(v4_6)));
        }
    }

    public final Long zza()
    {
        return this.zzb;
    }

    public final Long zzb()
    {
        return this.zza;
    }
}
