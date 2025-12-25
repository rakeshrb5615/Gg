package com.google.android.gms.internal.firebase-auth-api;
public final class zzajg implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzajg()
    {
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzajg zza(String p1, String p2, boolean p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzajg v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzajg();
        v0_1.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        v0_1.zzc = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        v0_1.zzf = p3;
        return v0_1;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzajg zzb(String p1, String p2, boolean p3)
    {
        com.google.android.gms.internal.firebase-auth-api.zzajg v0_1 = new com.google.android.gms.internal.firebase-auth-api.zzajg();
        v0_1.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        v0_1.zzd = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        v0_1.zzf = p3;
        return v0_1;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        if (android.text.TextUtils.isEmpty(this.zzd)) {
            v0_1.put("sessionInfo", this.zzb);
            v0_1.put("code", this.zzc);
        } else {
            v0_1.put("phoneNumber", this.zza);
            v0_1.put("temporaryProof", this.zzd);
        }
        String v1_2 = this.zze;
        if (v1_2 != null) {
            v0_1.put("idToken", v1_2);
        }
        if (!this.zzf) {
            v0_1.put("operation", 2);
        }
        return v0_1.toString();
    }

    public final void zza(String p1)
    {
        this.zze = p1;
        return;
    }
}
