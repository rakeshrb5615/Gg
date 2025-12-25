package com.google.android.gms.internal.firebase-auth-api;
public class zzagw implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzagw";
    private String zzb;
    private String zzc;
    private boolean zzd;
    private long zze;
    private java.util.List zzf;
    private String zzg;

    public zzagw()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzagw zzb(String p6)
    {
        try {
            NullPointerException v0_1 = new org.json.JSONObject(p6);
            v0_1.optString("localId", 0);
            v0_1.optString("email", 0);
            this.zzb = v0_1.optString("idToken", 0);
            this.zzc = v0_1.optString("refreshToken", 0);
            this.zzd = v0_1.optBoolean("isNewUser", 0);
            this.zze = v0_1.optLong("expiresIn", 0);
            this.zzf = com.google.android.gms.internal.firebase-auth-api.zzahy.zza(v0_1.optJSONArray("mfaInfo"));
            this.zzg = v0_1.optString("mfaPendingCredential", 0);
            return this;
        } catch (NullPointerException v0_3) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_3, com.google.android.gms.internal.firebase-auth-api.zzagw.zza, p6);
        } catch (NullPointerException v0_3) {
        }
    }

    public final long zza()
    {
        return this.zze;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzb(p1);
    }

    public final String zzb()
    {
        return this.zzb;
    }

    public final String zzc()
    {
        return this.zzg;
    }

    public final String zzd()
    {
        return this.zzc;
    }

    public final java.util.List zze()
    {
        return this.zzf;
    }

    public final boolean zzf()
    {
        if (android.text.TextUtils.isEmpty(this.zzg)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzg()
    {
        return this.zzd;
    }
}
