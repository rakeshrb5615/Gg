package com.google.android.gms.internal.firebase-auth-api;
public final class zzaiu implements com.google.android.gms.internal.firebase-auth-api.zzaio {
    private final String zza;
    private final String zzb;

    private zzaiu(String p1, String p2)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzb = p2;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzaiu zza(String p1, String p2)
    {
        return new com.google.android.gms.internal.firebase-auth-api.zzaiu(p1, p2);
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("idToken", this.zza);
        if (!android.text.TextUtils.isEmpty(this.zzb)) {
            v0_1.put("tenantId", this.zzb);
        }
        v0_1.put("totpEnrollmentInfo", new org.json.JSONObject());
        return v0_1.toString();
    }
}
