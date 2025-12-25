package com.google.android.gms.internal.firebase-auth-api;
public class zzahr implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzahr";
    private String zzb;

    public zzahr()
    {
        return;
    }

    public zzahr(String p1)
    {
        this.zzb = p1;
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzahr zzb(String p3)
    {
        try {
            this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(new org.json.JSONObject(p3).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException v0_2) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_2, com.google.android.gms.internal.firebase-auth-api.zzahr.zza, p3);
        } catch (NullPointerException v0_2) {
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
}
