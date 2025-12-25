package com.google.android.gms.internal.firebase-auth-api;
public class zzaip implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzaip";
    private String zzb;
    private String zzc;
    private long zzd;

    public zzaip()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzaip zzb(String p5)
    {
        try {
            NullPointerException v0_1 = new org.json.JSONObject(p5);
            this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("idToken", 0));
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("displayName", 0));
            com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("email", 0));
            this.zzc = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("refreshToken", 0));
            this.zzd = v0_1.optLong("expiresIn", 0);
            return this;
        } catch (NullPointerException v0_3) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_3, com.google.android.gms.internal.firebase-auth-api.zzaip.zza, p5);
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
        return this.zzc;
    }
}
