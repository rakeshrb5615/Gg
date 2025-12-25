package com.google.android.gms.internal.firebase-auth-api;
public final class zzaij implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private final String zza;
    private final long zzb;
    private final boolean zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;
    private final String zzh;
    private final boolean zzi;
    private com.google.android.gms.internal.firebase-auth-api.zzagm zzj;

    public zzaij(String p1, long p2, boolean p4, String p5, String p6, String p7, String p8, String p9, boolean p10)
    {
        this.zza = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        this.zzb = p2;
        this.zzc = p4;
        this.zzd = p5;
        this.zze = p6;
        this.zzf = p7;
        this.zzg = p8;
        this.zzh = p9;
        this.zzi = p10;
        return;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        v0_1.put("phoneNumber", this.zza);
        String v1_5 = this.zze;
        if (v1_5 != null) {
            v0_1.put("tenantId", v1_5);
        }
        String v1_6 = this.zzf;
        if (v1_6 != null) {
            v0_1.put("recaptchaToken", v1_6);
        }
        String v1_0 = this.zzj;
        if (v1_0 != null) {
            v0_1.put("autoRetrievalInfo", v1_0.zza());
        }
        String v1_2 = this.zzg;
        if (v1_2 != null) {
            v0_1.put("playIntegrityToken", v1_2);
        }
        String v1_4 = this.zzh;
        if (v1_4 == null) {
            com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_1);
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_1, "captchaResponse", v1_4);
        }
        return v0_1.toString();
    }

    public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagm p1)
    {
        this.zzj = p1;
        return;
    }

    public final long zzb()
    {
        return this.zzb;
    }

    public final String zzc()
    {
        return this.zzd;
    }

    public final String zzd()
    {
        return this.zza;
    }

    public final boolean zze()
    {
        return this.zzc;
    }

    public final boolean zzf()
    {
        return this.zzi;
    }
}
