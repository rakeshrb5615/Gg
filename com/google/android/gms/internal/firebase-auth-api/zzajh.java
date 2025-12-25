package com.google.android.gms.internal.firebase-auth-api;
public class zzajh implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzajh";
    private String zzb;
    private String zzc;
    private long zzd;
    private java.util.List zze;
    private String zzf;

    public zzajh()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzajh zzb(String p6)
    {
        try {
            NullPointerException v0_1 = new org.json.JSONObject(p6);
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("localId", 0));
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("email", 0));
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("displayName", 0));
            this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("idToken", 0));
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("photoUrl", 0));
            this.zzc = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("refreshToken", 0));
            this.zzd = v0_1.optLong("expiresIn", 0);
            this.zze = com.google.android.gms.internal.firebase-auth-api.zzahy.zza(v0_1.optJSONArray("mfaInfo"));
            this.zzf = v0_1.optString("mfaPendingCredential", 0);
            return this;
        } catch (NullPointerException v0_3) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_3, com.google.android.gms.internal.firebase-auth-api.zzajh.zza, p6);
        } catch (NullPointerException v0_3) {
        }
    }

    public final long zza()
    {
        return this.zzd;
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
        return this.zzf;
    }

    public final String zzd()
    {
        return this.zzc;
    }

    public final java.util.List zze()
    {
        return this.zze;
    }

    public final boolean zzf()
    {
        if (android.text.TextUtils.isEmpty(this.zzf)) {
            return 0;
        } else {
            return 1;
        }
    }
}
