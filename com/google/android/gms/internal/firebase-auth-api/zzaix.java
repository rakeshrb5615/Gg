package com.google.android.gms.internal.firebase-auth-api;
public final class zzaix extends com.google.android.gms.internal.firebase-auth-api.zzair {
    private static final String zza = "zzaix";
    private String zzb;
    private String zzc;
    private int zzd;
    private String zze;
    private int zzf;
    private long zzg;

    public zzaix()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzaix zzc(String p5)
    {
        try {
            String v0_3 = new org.json.JSONObject(p5).optJSONObject("totpSessionInfo");
        } catch (String v0_5) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_5, com.google.android.gms.internal.firebase-auth-api.zzaix.zza, p5);
        } catch (String v0_5) {
        }
        if (v0_3 != null) {
            this.zzc = com.google.android.gms.internal.firebase-auth-api.zzac.zza(v0_3.optString("sharedSecretKey"));
            this.zzd = v0_3.optInt("verificationCodeLength");
            this.zze = com.google.android.gms.internal.firebase-auth-api.zzac.zza(v0_3.optString("hashingAlgorithm"));
            this.zzf = v0_3.optInt("periodSec");
            this.zzb = com.google.android.gms.internal.firebase-auth-api.zzac.zza(v0_3.optString("sessionInfo"));
            String v0_2 = v0_3.optString("finalizeEnrollmentTime");
            this.zzg = com.google.android.gms.internal.firebase-auth-api.zzaoo.zza(com.google.android.gms.internal.firebase-auth-api.zzaoo.zza(v0_2));
            return this;
        }
        return this;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzaix) this.zzb(p1));
    }

    public final String zza()
    {
        return this.zzb;
    }

    public final int zzb()
    {
        return this.zzf;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzair zzb(String p1)
    {
        return this.zzc(p1);
    }

    public final int zzc()
    {
        return this.zzd;
    }

    public final long zzd()
    {
        return this.zzg;
    }

    public final String zze()
    {
        return this.zze;
    }

    public final String zzf()
    {
        return this.zzc;
    }
}
