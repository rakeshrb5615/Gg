package com.google.android.gms.internal.firebase-auth-api;
public final class zzaje implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private String zza;
    private String zzb;
    private final String zzc;
    private final String zzd;
    private boolean zze;

    public zzaje(String p1, String p2, String p3, String p4)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzc = p3;
        this.zzd = p4;
        this.zze = 1;
        return;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("email", this.zza);
        v0_1.put("password", this.zzb);
        v0_1.put("returnSecureToken", this.zze);
        String v1_0 = this.zzc;
        if (v1_0 != null) {
            v0_1.put("tenantId", v1_0);
        }
        String v1_1 = this.zzd;
        if (v1_1 == null) {
            com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_1);
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_1, "captchaResponse", v1_1);
        }
        return v0_1.toString();
    }
}
