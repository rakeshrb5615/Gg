package com.google.android.recaptcha.internal;
public final class zzho implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzho zza;

    static zzho()
    {
        com.google.android.recaptcha.internal.zzho.zza = new com.google.android.recaptcha.internal.zzho();
        return;
    }

    private zzho()
    {
        return;
    }

    public final varargs void zza(int p5, com.google.android.recaptcha.internal.zzgd p6, com.google.android.recaptcha.internal.zzue[] p7)
    {
        if (p7.length != 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            Exception v5_2 = p6.zzc().zza(p7[0]);
            if (1 != (v5_2 instanceof reflect.Field)) {
                v5_2 = 0;
            }
            Exception v5_3 = ((reflect.Field) v5_2);
            if (v5_3 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                try {
                    v5_3.set(0, p6.zzc().zza(p7[1]));
                    return;
                } catch (Exception v5_6) {
                    throw new com.google.android.recaptcha.internal.zzce(6, 11, v5_6);
                }
            }
        }
    }
}
