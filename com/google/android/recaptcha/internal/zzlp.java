package com.google.android.recaptcha.internal;
final class zzlp implements com.google.android.recaptcha.internal.zznh {
    static final com.google.android.recaptcha.internal.zznh zza;

    static zzlp()
    {
        com.google.android.recaptcha.internal.zzlp.zza = new com.google.android.recaptcha.internal.zzlp();
        return;
    }

    private zzlp()
    {
        return;
    }

    public final boolean zza(int p3)
    {
        com.google.android.recaptcha.internal.zzlq v3_1;
        if (p3 == null) {
            v3_1 = com.google.android.recaptcha.internal.zzlq.zza;
        } else {
            if (p3 == 1) {
                v3_1 = com.google.android.recaptcha.internal.zzlq.zzg;
            } else {
                if (p3 == 2) {
                    v3_1 = com.google.android.recaptcha.internal.zzlq.zzh;
                } else {
                    if (p3 == 900) {
                        v3_1 = com.google.android.recaptcha.internal.zzlq.zzb;
                    } else {
                        if (p3 == 2147483647) {
                            v3_1 = com.google.android.recaptcha.internal.zzlq.zzl;
                        } else {
                            switch (p3) {
                                case 998:
                                    v3_1 = com.google.android.recaptcha.internal.zzlq.zzc;
                                    break;
                                case 999:
                                    v3_1 = com.google.android.recaptcha.internal.zzlq.zzd;
                                    break;
                                case 1000:
                                    v3_1 = com.google.android.recaptcha.internal.zzlq.zze;
                                    break;
                                case 1001:
                                    v3_1 = com.google.android.recaptcha.internal.zzlq.zzf;
                                    break;
                                default:
                                    switch (p3) {
                                        case 99997:
                                            v3_1 = com.google.android.recaptcha.internal.zzlq.zzi;
                                            break;
                                        case 99998:
                                            v3_1 = com.google.android.recaptcha.internal.zzlq.zzj;
                                            break;
                                        case 99999:
                                            v3_1 = com.google.android.recaptcha.internal.zzlq.zzk;
                                            break;
                                        default:
                                            v3_1 = 0;
                                    }
                            }
                        }
                    }
                }
            }
        }
        if (v3_1 == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
