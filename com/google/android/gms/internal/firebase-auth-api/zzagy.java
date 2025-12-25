package com.google.android.gms.internal.firebase-auth-api;
public class zzagy implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzagy";
    private String zzb;
    private String zzc;

    public zzagy()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzagy zzb(String p3)
    {
        try {
            NullPointerException v0_1 = new org.json.JSONObject(p3);
            this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("idToken"));
            this.zzc = com.google.android.gms.common.util.Strings.emptyToNull(v0_1.optString("refreshToken"));
            return this;
        } catch (NullPointerException v0_4) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_4, com.google.android.gms.internal.firebase-auth-api.zzagy.zza, p3);
        } catch (NullPointerException v0_4) {
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzb(p1);
    }

    public final String zza()
    {
        return this.zzb;
    }

    public final String zzb()
    {
        return this.zzc;
    }
}
