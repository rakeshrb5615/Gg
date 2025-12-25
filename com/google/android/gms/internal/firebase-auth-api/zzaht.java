package com.google.android.gms.internal.firebase-auth-api;
public final class zzaht implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private final String zza;
    private final String zzb;
    private final String zzc;

    private zzaht(String p1, String p2)
    {
        this.zza = p1;
        this.zzb = "CLIENT_TYPE_ANDROID";
        this.zzc = p2;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaht zza(String p1, String p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzaht(p1, p2);
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        if (!android.text.TextUtils.isEmpty(this.zza)) {
            v0_1.put("tenantId", this.zza);
        }
        if (!android.text.TextUtils.isEmpty(this.zzb)) {
            v0_1.put("clientType", this.zzb);
        }
        if (!android.text.TextUtils.isEmpty(this.zzc)) {
            v0_1.put("recaptchaVersion", this.zzc);
        }
        return v0_1.toString();
    }

    public final String zzb()
    {
        return this.zzb;
    }

    public final String zzc()
    {
        return this.zzc;
    }

    public final String zzd()
    {
        return this.zza;
    }
}
