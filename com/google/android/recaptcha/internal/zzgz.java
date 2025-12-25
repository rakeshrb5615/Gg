package com.google.android.recaptcha.internal;
public final class zzgz implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgz zza;

    static zzgz()
    {
        com.google.android.recaptcha.internal.zzgz.zza = new com.google.android.recaptcha.internal.zzgz();
        return;
    }

    private zzgz()
    {
        return;
    }

    public final varargs void zza(int p6, com.google.android.recaptcha.internal.zzgd p7, com.google.android.recaptcha.internal.zzue[] p8)
    {
        if (p8.length != 1) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            int v8_2 = p7.zzc().zza(p8[0]);
            if (1 != java.util.Objects.nonNull(v8_2)) {
                v8_2 = 0;
            }
            if (v8_2 == 0) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                if ((v8_2 instanceof String)) {
                    v8_2 = p7.zzh().zza(((String) v8_2));
                }
                p7.zzc().zze(p6, com.google.android.recaptcha.internal.zzgc.zza(v8_2));
                return;
            }
        }
    }
}
