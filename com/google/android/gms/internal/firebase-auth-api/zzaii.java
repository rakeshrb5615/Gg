package com.google.android.gms.internal.firebase-auth-api;
public class zzaii implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzaii";
    private String zzb;

    public zzaii()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzaii zzb(String p4)
    {
        try {
            this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(new org.json.JSONObject(p4).optString("sessionInfo", 0));
            return this;
        } catch (NullPointerException v0_2) {
            throw com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_2, com.google.android.gms.internal.firebase-auth-api.zzaii.zza, p4);
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
