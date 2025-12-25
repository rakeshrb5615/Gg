package com.google.android.recaptcha.internal;
public final class zzhd implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhd zza;

    static zzhd()
    {
        com.google.android.recaptcha.internal.zzhd.zza = new com.google.android.recaptcha.internal.zzhd();
        return;
    }

    private zzhd()
    {
        return;
    }

    public final varargs void zza(int p6, com.google.android.recaptcha.internal.zzgd p7, com.google.android.recaptcha.internal.zzue[] p8)
    {
        if (p8.length != 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            int v0_2 = p7.zzc().zza(p8[0]);
            if (1 != (v0_2 instanceof reflect.Field)) {
                v0_2 = 0;
            }
            int v0_3 = ((reflect.Field) v0_2);
            if (v0_3 == 0) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                try {
                    p7.zzc().zze(p6, v0_3.get(p7.zzc().zza(p8[1])));
                    return;
                } catch (Exception v6_3) {
                    throw new com.google.android.recaptcha.internal.zzce(6, 16, v6_3);
                }
            }
        }
    }
}
