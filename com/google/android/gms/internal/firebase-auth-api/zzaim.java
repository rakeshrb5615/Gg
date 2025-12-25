package com.google.android.gms.internal.firebase-auth-api;
public final class zzaim implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;

    public zzaim(String p1)
    {
        this.zzc = p1;
        return;
    }

    public zzaim(String p1, String p2, String p3, String p4, String p5, String p6)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        return;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        String v1_3 = this.zza;
        if (v1_3 != null) {
            v0_1.put("email", v1_3);
        }
        String v1_4 = this.zzb;
        if (v1_4 != null) {
            v0_1.put("password", v1_4);
        }
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
        String v1_2 = this.zze;
        if (v1_2 != null) {
            v0_1.put("idToken", v1_2);
        }
        return v0_1.toString();
    }
}
