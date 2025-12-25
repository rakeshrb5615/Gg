package com.google.android.recaptcha.internal;
public final class zzgj implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgj zza;

    static zzgj()
    {
        com.google.android.recaptcha.internal.zzgj.zza = new com.google.android.recaptcha.internal.zzgj();
        return;
    }

    private zzgj()
    {
        return;
    }

    public final varargs void zza(int p8, com.google.android.recaptcha.internal.zzgd p9, com.google.android.recaptcha.internal.zzue[] p10)
    {
        if (p10.length != 3) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            com.google.android.recaptcha.internal.zzce v8_1 = p9.zzc().zza(p10[0]);
            if (1 != (v8_1 instanceof Integer)) {
                v8_1 = 0;
            }
            com.google.android.recaptcha.internal.zzce v8_2 = ((Integer) v8_1);
            if (v8_2 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                com.google.android.recaptcha.internal.zzce v8_5 = v8_2.intValue();
                if (v8_5 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 6, 0);
                } else {
                    int v4_1 = p9.zzc().zza(p10[1]);
                    if (1 != java.util.Objects.nonNull(v4_1)) {
                        v4_1 = 0;
                    }
                    if (v4_1 == 0) {
                        throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                    } else {
                        int v10_2 = p9.zzc().zza(p10[2]);
                        if (1 != java.util.Objects.nonNull(v10_2)) {
                            v10_2 = 0;
                        }
                        if (v10_2 == 0) {
                            throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                        } else {
                            if (v4_1.equals(v10_2)) {
                                p9.zzg((p9.zza() + v8_5));
                            }
                            return;
                        }
                    }
                }
            }
        }
    }
}
