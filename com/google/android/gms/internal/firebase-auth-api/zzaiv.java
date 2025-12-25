package com.google.android.gms.internal.firebase-auth-api;
public final class zzaiv extends com.google.android.gms.internal.firebase-auth-api.zzair {
    private static final String zza = "zzaiv";
    private String zzb;

    public zzaiv()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzaiv zzc(String p3)
    {
        try {
            String v0_4 = new org.json.JSONObject(p3).optJSONObject("phoneSessionInfo");
        } catch (String v0_5) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_5, com.google.android.gms.internal.firebase-auth-api.zzaiv.zza, p3);
        } catch (String v0_5) {
        }
        if (v0_4 == null) {
            return this;
        } else {
            this.zzb = com.google.android.gms.internal.firebase-auth-api.zzac.zza(v0_4.optString("sessionInfo"));
            return this;
        }
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zzaiv) this.zzb(p1));
    }

    public final String zza()
    {
        return this.zzb;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzair zzb(String p1)
    {
        return this.zzc(p1);
    }
}
