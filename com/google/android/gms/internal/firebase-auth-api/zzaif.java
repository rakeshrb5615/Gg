package com.google.android.gms.internal.firebase-auth-api;
public class zzaif implements com.google.android.gms.internal.firebase-auth-api.zzaez {
    private static final String zza = "zzaif";
    private String zzb;
    private String zzc;
    private String zzd;
    private com.google.android.gms.internal.firebase-auth-api.zzahy zze;

    public zzaif()
    {
        return;
    }

    private final com.google.android.gms.internal.firebase-auth-api.zzaif zzb(String p12)
    {
        boolean v2_4;
        String v1_1 = new org.json.JSONObject(p12);
        this.zzb = com.google.android.gms.common.util.Strings.emptyToNull(v1_1.optString("email"));
        this.zzc = com.google.android.gms.common.util.Strings.emptyToNull(v1_1.optString("newEmail"));
        boolean v2_3 = v1_1.optInt("reqType");
        boolean v10 = 0;
        if (v2_3 == 1) {
            v2_4 = "PASSWORD_RESET";
        } else {
            switch (v2_3) {
                case 4:
                    v2_4 = "VERIFY_EMAIL";
                    break;
                case 5:
                    v2_4 = "RECOVER_EMAIL";
                    break;
                case 6:
                    v2_4 = "EMAIL_SIGNIN";
                    break;
                case 7:
                    v2_4 = "VERIFY_AND_CHANGE_EMAIL";
                    break;
                case 8:
                    v2_4 = "REVERT_SECOND_FACTOR_ADDITION";
                    break;
                default:
                    v2_4 = 0;
            }
        }
        this.zzd = v2_4;
        if (android.text.TextUtils.isEmpty(v2_4)) {
            boolean v2_8 = v1_1.optString("requestType");
            switch (v2_8.hashCode()) {
                case -1874510116:
                    if (!v2_8.equals("REVERT_SECOND_FACTOR_ADDITION")) {
                    } else {
                        v10 = v2_8;
                    }
                    break;
                case -1452371317:
                    if (!v2_8.equals("PASSWORD_RESET")) {
                    } else {
                    }
                    break;
                case -1341836234:
                    if (!v2_8.equals("VERIFY_EMAIL")) {
                    } else {
                    }
                    break;
                case -1099157829:
                    if (!v2_8.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    } else {
                    }
                    break;
                case 870738373:
                    if (!v2_8.equals("EMAIL_SIGNIN")) {
                    } else {
                    }
                    break;
                case 970484929:
                    if (!v2_8.equals("RECOVER_EMAIL")) {
                    } else {
                    }
                    break;
                default:
            }
            this.zzd = v10;
        }
        if (v1_1.has("mfaInfo")) {
            this.zze = com.google.android.gms.internal.firebase-auth-api.zzahy.zza(v1_1.optJSONObject("mfaInfo"));
        }
        return this;
    }

    public final synthetic com.google.android.gms.internal.firebase-auth-api.zzaez zza(String p1)
    {
        return this.zzb(p1);
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahy zza()
    {
        return this.zze;
    }

    public final String zzb()
    {
        return this.zzb;
    }

    public final String zzc()
    {
        return this.zzc;
    }

    public final String zzd()
    {
        return this.zzd;
    }

    public final boolean zze()
    {
        if (this.zzb == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzf()
    {
        if (this.zze == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzg()
    {
        if (this.zzc == null) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzh()
    {
        if (this.zzd == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
