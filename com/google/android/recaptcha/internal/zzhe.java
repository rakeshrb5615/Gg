package com.google.android.recaptcha.internal;
public final class zzhe implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhe zza;

    static zzhe()
    {
        com.google.android.recaptcha.internal.zzhe.zza = new com.google.android.recaptcha.internal.zzhe();
        return;
    }

    private zzhe()
    {
        return;
    }

    public final varargs void zza(int p6, com.google.android.recaptcha.internal.zzgd p7, com.google.android.recaptcha.internal.zzue[] p8)
    {
        if (p8.length != 1) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            int v8_2 = p7.zzc().zza(p8[0]);
            if (1 != (v8_2 instanceof reflect.Field)) {
                v8_2 = 0;
            }
            int v8_3 = ((reflect.Field) v8_2);
            if (v8_3 == 0) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                try {
                    p7.zzc().zze(p6, v8_3.get(0));
                    return;
                } catch (Exception v6_3) {
                    throw new com.google.android.recaptcha.internal.zzce(6, 16, v6_3);
                }
            }
        }
    }
}
