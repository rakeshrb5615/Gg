package com.google.android.gms.internal.firebase-auth-api;
public class zzahs implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzahs";
    private String zzb;
    private com.google.android.gms.internal.firebase-auth-api.zzah zzc;

    public zzahs()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzahs zzd(String p7)
    {
        com.google.android.gms.internal.firebase-auth-api.zzak v1_3 = new org.json.JSONObject(p7);
        this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(v1_3.optString("recaptchaKey"));
        if (v1_3.has("recaptchaEnforcementState")) {
            com.google.android.gms.internal.firebase-auth-api.zzah v0_2;
            com.google.android.gms.internal.firebase-auth-api.zzah v0_1 = v1_3.optJSONArray("recaptchaEnforcementState");
            if (v0_1 == null) {
                v0_2 = com.google.android.gms.internal.firebase-auth-api.zzah.zzg();
            } else {
                if (v0_1.length() != 0) {
                    com.google.android.gms.internal.firebase-auth-api.zzak v1_2 = com.google.android.gms.internal.firebase-auth-api.zzah.zzf();
                    int v2_1 = 0;
                    while (v2_1 < v0_1.length()) {
                        com.google.android.gms.internal.firebase-auth-api.zzaid v3_4;
                        com.google.android.gms.internal.firebase-auth-api.zzaid v3_1 = v0_1.getJSONObject(v2_1);
                        if (v3_1 != null) {
                            v3_4 = com.google.android.gms.internal.firebase-auth-api.zzaid.zza(com.google.android.gms.common.util.Strings.emptyToNull(v3_1.optString("provider")), com.google.android.gms.common.util.Strings.emptyToNull(v3_1.optString("enforcementState")));
                        } else {
                            v3_4 = com.google.android.gms.internal.firebase-auth-api.zzaid.zza(0, 0);
                        }
                        v1_2.zza(v3_4);
                        v2_1++;
                    }
                    v0_2 = v1_2.zza();
                } else {
                }
            }
            this.zzc = v0_2;
        }
        return this;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzd(p1);
    }

    public final String zza()
    {
        return this.zzb;
    }

    public final String zzb(String p8)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p8);
        com.google.android.gms.internal.firebase-auth-api.zzah v0_0 = this.zzc;
        if ((v0_0 != null) && (!v0_0.isEmpty())) {
            com.google.android.gms.internal.firebase-auth-api.zzah v0_2 = this.zzc;
            int v2 = v0_2.size();
            int v3 = 0;
            while (v3 < v2) {
                com.google.android.gms.internal.firebase-auth-api.zzaid v4_0 = v0_2.get(v3);
                v3++;
                com.google.android.gms.internal.firebase-auth-api.zzaid v4_1 = ((com.google.android.gms.internal.firebase-auth-api.zzaid) v4_0);
                boolean v5_0 = v4_1.zza();
                String v6 = v4_1.zzb();
                if ((v5_0) && ((v6 != null) && (v6.equals(p8)))) {
                    return v4_1.zza();
                }
            }
        }
        return 0;
    }

    public final boolean zzc(String p3)
    {
        int v3_1 = this.zzb(p3);
        if (v3_1 != 0) {
            if ((!v3_1.equals("ENFORCE")) && (!v3_1.equals("AUDIT"))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}
