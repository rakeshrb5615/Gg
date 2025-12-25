package com.google.android.gms.internal.firebase-auth-api;
public class zzajd implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzajd";
    private boolean zzb;
    private String zzc;
    private String zzd;
    private long zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private java.util.List zzp;
    private String zzq;

    public zzajd()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzajd zzb(String p7)
    {
        try {
            NullPointerException v0_1 = new org.json.JSONObject(p7);
            this.zzb = v0_1.optBoolean("needConfirmation", 0);
            v0_1.optBoolean("needEmail", 0);
            this.zzc = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("idToken", 0));
            this.zzd = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("refreshToken", 0));
            this.zze = v0_1.optLong("expiresIn", 0);
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("localId", 0));
            this.zzf = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("email", 0));
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("displayName", 0));
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("photoUrl", 0));
            this.zzg = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("providerId", 0));
            this.zzh = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("rawUserInfo", 0));
            this.zzi = v0_1.optBoolean("isNewUser", 0);
            this.zzj = v0_1.optString("oauthAccessToken", 0);
            this.zzk = v0_1.optString("oauthIdToken", 0);
            this.zzm = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("errorMessage", 0));
            this.zzn = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("pendingToken", 0));
            this.zzo = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("tenantId", 0));
            this.zzp = com.google.android.gms.internal.firebase-auth-api.zzahy.zza(v0_1.optJSONArray("mfaInfo"));
            this.zzq = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("mfaPendingCredential", 0));
            this.zzl = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("oauthTokenSecret", 0));
            return this;
        } catch (NullPointerException v0_4) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_4, com.google.android.gms.internal.firebase-auth-api.zzajd.zza, p7);
        } catch (NullPointerException v0_4) {
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

    public final y4.g0 zzb()
    {
        if ((android.text.TextUtils.isEmpty(this.zzj)) && (android.text.TextUtils.isEmpty(this.zzk))) {
            return 0;
        } else {
            String v2 = this.zzg;
            String v3 = this.zzk;
            String v4 = this.zzj;
            String v6 = this.zzn;
            String v7 = this.zzl;
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(v2, "Must specify a non-empty providerId");
            if ((android.text.TextUtils.isEmpty(v3)) && (android.text.TextUtils.isEmpty(v4))) {
                throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
            } else {
                return new y4.g0(v2, v3, v4, 0, v6, v7, 0);
            }
        }
    }

    public final String zzc()
    {
        return this.zzf;
    }

    public final String zzd()
    {
        return this.zzm;
    }

    public final String zze()
    {
        return this.zzc;
    }

    public final String zzf()
    {
        return this.zzq;
    }

    public final String zzg()
    {
        return this.zzg;
    }

    public final String zzh()
    {
        return this.zzh;
    }

    public final String zzi()
    {
        return this.zzd;
    }

    public final String zzj()
    {
        return this.zzo;
    }

    public final java.util.List zzk()
    {
        return this.zzp;
    }

    public final boolean zzl()
    {
        if (android.text.TextUtils.isEmpty(this.zzq)) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzm()
    {
        return this.zzb;
    }

    public final boolean zzn()
    {
        return this.zzi;
    }

    public final boolean zzo()
    {
        if ((!this.zzb) && (android.text.TextUtils.isEmpty(this.zzm))) {
            return 0;
        } else {
            return 1;
        }
    }
}
