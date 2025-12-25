package com.google.android.recaptcha.internal;
public final class zzgm implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgm zza;

    static zzgm()
    {
        com.google.android.recaptcha.internal.zzgm.zza = new com.google.android.recaptcha.internal.zzgm();
        return;
    }

    private zzgm()
    {
        return;
    }

    public final varargs void zza(int p6, com.google.android.recaptcha.internal.zzgd p7, com.google.android.recaptcha.internal.zzue[] p8)
    {
        int v3 = 1;
        if (p8.length != 1) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            Boolean v8_2 = p7.zzc().zza(p8[0]);
            if (1 != java.util.Objects.nonNull(v8_2)) {
                v8_2 = 0;
            }
            if (v8_2 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                if ((v8_2 instanceof String)) {
                    v8_2 = p7.zzh().zza(((String) v8_2));
                }
                com.google.android.recaptcha.internal.zzce v7_2 = p7.zzc();
                try {
                    com.google.android.recaptcha.internal.zzgc.zza(v8_2);
                } catch (Boolean v8_4) {
                    if (v8_4.zzb() != 8) {
                        if (v8_4.zzb() != 6) {
                            if (v8_4.zzb() != 47) {
                                throw v8_4;
                            } else {
                            }
                        }
                    }
                    v3 = 0;
                }
                v7_2.zze(p6, Boolean.valueOf(v3));
                return;
            }
        }
    }
}
