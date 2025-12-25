package com.google.android.recaptcha.internal;
public final class zzhm implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhm zza;

    static zzhm()
    {
        com.google.android.recaptcha.internal.zzhm.zza = new com.google.android.recaptcha.internal.zzhm();
        return;
    }

    private zzhm()
    {
        return;
    }

    public final varargs void zza(int p5, com.google.android.recaptcha.internal.zzgd p6, com.google.android.recaptcha.internal.zzue[] p7)
    {
        if (p7.length != 1) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            com.google.android.recaptcha.internal.zzce v5_2 = p6.zzc().zza(p7[0]);
            if (1 != (v5_2 instanceof String)) {
                v5_2 = 0;
            }
            com.google.android.recaptcha.internal.zzce v5_3 = ((String) v5_2);
            if (v5_3 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                p6.zzf(v5_3);
                return;
            }
        }
    }
}
