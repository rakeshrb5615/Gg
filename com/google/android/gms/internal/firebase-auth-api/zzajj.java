package com.google.android.gms.internal.firebase-auth-api;
public class zzajj implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzajj";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;
    private String zzf;
    private String zzg;

    public zzajj()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzajj zzb(String p6)
    {
        try {
            NullPointerException v0_1 = new org.json.JSONObject(p6);
            this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("idToken", 0));
            this.zzc = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("refreshToken", 0));
            this.zzd = v0_1.optLong("expiresIn", 0);
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("localId", 0));
            this.zze = v0_1.optBoolean("isNewUser", 0);
            this.zzf = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("temporaryProof", 0));
            this.zzg = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("phoneNumber", 0));
            return this;
        } catch (NullPointerException v0_4) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_4, com.google.android.gms.internal.firebase-auth-api.zzajj.zza, p6);
        } catch (NullPointerException v0_4) {
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
        return this.zzg;
    }

    public final String zzd()
    {
        return this.zzc;
    }

    public final String zze()
    {
        return this.zzf;
    }

    public final boolean zzf()
    {
        return this.zze;
    }
}
