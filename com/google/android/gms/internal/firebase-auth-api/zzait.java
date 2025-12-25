package com.google.android.gms.internal.firebase-auth-api;
public class zzait implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzait";
    private String zzb;

    public zzait()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzait zzb(String p3)
    {
        try {
            String v0_4 = new org.json.JSONObject(p3).optJSONObject("phoneResponseInfo");
        } catch (String v0_5) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_5, com.google.android.gms.internal.firebase-auth-api.zzait.zza, p3);
        } catch (String v0_5) {
        }
        if (v0_4 == null) {
            return this;
        } else {
            this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(v0_4.optString("sessionInfo"));
            return this;
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzb(p1);
    }

    public final String zza()
    {
        return this.zzb;
    }
}
