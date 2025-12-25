package com.google.android.gms.internal.firebase-auth-api;
public class zzair implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzair";

    public zzair()
    {
        return;
    }

    public synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzb(p1);
    }

    public String zza()
    {
        return 0;
    }

    public com.google.android.gms.internal.firebase-auth-api.zzair zzb(String p3)
    {
        IllegalArgumentException v0_1 = new org.json.JSONObject(p3);
        if (v0_1.optJSONObject("phoneSessionInfo") == null) {
            if (v0_1.optJSONObject("totpSessionInfo") == null) {
                throw new IllegalArgumentException("Missing phoneSessionInfo or totpSessionInfo.");
            } else {
                return ((com.google.android.gms.internal.firebase-auth-api.zzaix) ((com.google.android.gms.internal.firebase-auth-api.zzair) new com.google.android.gms.internal.firebase-auth-api.zzaix().zza(p3)));
            }
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzaiv) ((com.google.android.gms.internal.firebase-auth-api.zzair) new com.google.android.gms.internal.firebase-auth-api.zzaiv().zza(p3)));
        }
    }
}
