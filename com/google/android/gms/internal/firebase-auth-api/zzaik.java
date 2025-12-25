package com.google.android.gms.internal.firebase-auth-api;
public class zzaik implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzaik";
    private String zzb;
    private com.google.android.gms.internal.firebase-auth-api.zzaia zzc;
    private String zzd;
    private String zze;
    private long zzf;

    public zzaik()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzaik zzb(String p5)
    {
        try {
            NullPointerException v0_1 = new org.json.JSONObject(p5);
            this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("email"));
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("passwordHash"));
            v0_1.optBoolean("emailVerified", 0);
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("displayName"));
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("photoUrl"));
            this.zzc = com.google.android.gms.internal.firebase-auth-api.zzaia.zza(v0_1.optJSONArray("providerUserInfo"));
            this.zzd = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("idToken"));
            this.zze = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("refreshToken"));
            this.zzf = v0_1.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException v0_3) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_3, com.google.android.gms.internal.firebase-auth-api.zzaik.zza, p5);
        } catch (NullPointerException v0_3) {
        }
    }

    public final long zza()
    {
        return this.zzf;
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
        return this.zzd;
    }

    public final String zzd()
    {
        return this.zze;
    }

    public final java.util.List zze()
    {
        int v0_0 = this.zzc;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.zza();
        }
    }
}
