package com.google.android.gms.internal.firebase-auth-api;
public final class zzahm implements com.google.android.gms.internal.firebase-auth-api.zzafa {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private y4.a zze;
    private String zzf;
    private String zzg;

    public zzahm(int p1)
    {
        this.zza = com.google.android.gms.internal.firebase-auth-api.zzahm.zza(p1);
        return;
    }

    private zzahm(int p1, y4.a p2, String p3, String p4, String p5, String p6, String p7)
    {
        this.zza = com.google.android.gms.internal.firebase-auth-api.zzahm.zza(7);
        this.zze = ((y4.a) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2));
        this.zzb = 0;
        this.zzc = p4;
        this.zzd = p5;
        this.zzf = 0;
        this.zzg = 0;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzahm zza(y4.a p8, String p9, String p10)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p9);
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p10);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8);
        return new com.google.android.gms.internal.firebase-auth-api.zzahm(7, p8, 0, p10, p9, 0, 0);
    }

    private static String zza(int p1)
    {
        if (p1 == 1) {
            return "PASSWORD_RESET";
        } else {
            if (p1 == 4) {
                return "VERIFY_EMAIL";
            } else {
                if (p1 == 6) {
                    return "EMAIL_SIGNIN";
                } else {
                    if (p1 == 7) {
                        return "VERIFY_AND_CHANGE_EMAIL";
                    } else {
                        return "REQUEST_TYPE_UNSET_ENUM_VALUE";
                    }
                }
            }
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahm zza(String p1)
    {
        this.zzg = p1;
        return this;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahm zza(y4.a p1)
    {
        this.zze = ((y4.a) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public final String zza()
    {
        String v0_1 = new org.json.JSONObject();
        String v1_2 = this.zza;
        v1_2.getClass();
        int v3 = 1;
        int v5 = -1;
        switch (v1_2.hashCode()) {
            case -1452371317:
                if (v1_2.equals("PASSWORD_RESET")) {
                    v5 = 0;
                } else {
                }
                break;
            case -1341836234:
                if (v1_2.equals("VERIFY_EMAIL")) {
                    v5 = 1;
                } else {
                }
                break;
            case -1099157829:
                if (v1_2.equals("VERIFY_AND_CHANGE_EMAIL")) {
                    v5 = 2;
                } else {
                }
                break;
            case 870738373:
                if (v1_2.equals("EMAIL_SIGNIN")) {
                    v5 = 3;
                } else {
                }
                break;
            default:
        }
        switch (v5) {
            case 0:
                break;
            case 1:
                v3 = 4;
                break;
            case 2:
                v3 = 7;
                break;
            case 3:
                v3 = 6;
                break;
            default:
                v3 = 0;
        }
        v0_1.put("requestType", v3);
        String v1_6 = this.zzb;
        if (v1_6 != null) {
            v0_1.put("email", v1_6);
        }
        String v1_7 = this.zzc;
        if (v1_7 != null) {
            v0_1.put("newEmail", v1_7);
        }
        String v1_8 = this.zzd;
        if (v1_8 != null) {
            v0_1.put("idToken", v1_8);
        }
        String v1_9 = this.zze;
        if (v1_9 != null) {
            v0_1.put("androidInstallApp", v1_9.e);
            v0_1.put("canHandleCodeInApp", this.zze.m);
            String v1_14 = this.zze.a;
            if (v1_14 != null) {
                v0_1.put("continueUrl", v1_14);
            }
            String v1_16 = this.zze.b;
            if (v1_16 != null) {
                v0_1.put("iosBundleId", v1_16);
            }
            String v1_18 = this.zze.c;
            if (v1_18 != null) {
                v0_1.put("iosAppStoreId", v1_18);
            }
            String v1_20 = this.zze.d;
            if (v1_20 != null) {
                v0_1.put("androidPackageName", v1_20);
            }
            String v1_22 = this.zze.f;
            if (v1_22 != null) {
                v0_1.put("androidMinimumVersion", v1_22);
            }
            String v1_24 = this.zze.p;
            if (v1_24 != null) {
                v0_1.put("dynamicLinkDomain", v1_24);
            }
            String v1_26 = this.zze.q;
            if (v1_26 != null) {
                v0_1.put("linkDomain", v1_26);
            }
        }
        String v1_27 = this.zzf;
        if (v1_27 != null) {
            v0_1.put("tenantId", v1_27);
        }
        String v1_28 = this.zzg;
        if (v1_28 == null) {
            com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_1);
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzajk.zza(v0_1, "captchaResp", v1_28);
        }
        return v0_1.toString();
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahm zzb(String p1)
    {
        this.zzb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return this;
    }

    public final y4.a zzb()
    {
        return this.zze;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahm zzc(String p1)
    {
        this.zzf = p1;
        return this;
    }

    public final String zzc()
    {
        return this.zzb;
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzahm zzd(String p1)
    {
        this.zzd = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return this;
    }

    public final String zzd()
    {
        return this.zzd;
    }
}
