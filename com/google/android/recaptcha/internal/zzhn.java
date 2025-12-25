package com.google.android.recaptcha.internal;
public final class zzhn implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhn zza;

    static zzhn()
    {
        com.google.android.recaptcha.internal.zzhn.zza = new com.google.android.recaptcha.internal.zzhn();
        return;
    }

    private zzhn()
    {
        return;
    }

    public final varargs void zza(int p5, com.google.android.recaptcha.internal.zzgd p6, com.google.android.recaptcha.internal.zzue[] p7)
    {
        if (p7.length != 3) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            Exception v5_1 = p6.zzc().zza(p7[0]);
            if (1 != (v5_1 instanceof reflect.Field)) {
                v5_1 = 0;
            }
            Exception v5_2 = ((reflect.Field) v5_1);
            if (v5_2 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                try {
                    v5_2.set(p6.zzc().zza(p7[1]), p6.zzc().zza(p7[2]));
                    return;
                } catch (Exception v5_5) {
                    throw new com.google.android.recaptcha.internal.zzce(6, 11, v5_5);
                }
            }
        }
    }
}
