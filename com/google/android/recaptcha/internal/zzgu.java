package com.google.android.recaptcha.internal;
public final class zzgu implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgu zza;

    static zzgu()
    {
        com.google.android.recaptcha.internal.zzgu.zza = new com.google.android.recaptcha.internal.zzgu();
        return;
    }

    private zzgu()
    {
        return;
    }

    public final varargs void zza(int p7, com.google.android.recaptcha.internal.zzgd p8, com.google.android.recaptcha.internal.zzue[] p9)
    {
        if (p9.length != 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            int v0_2 = p8.zzc().zza(p9[0]);
            if (1 != java.util.Objects.nonNull(v0_2)) {
                v0_2 = 0;
            }
            if (v0_2 == 0) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                int v9_2 = p8.zzc().zza(p9[1]);
                if (1 != (v9_2 instanceof Integer)) {
                    v9_2 = 0;
                }
                int v9_3 = ((Integer) v9_2);
                if (v9_3 == 0) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    int v9_4 = v9_3.intValue();
                    if ((v0_2 instanceof String)) {
                        v0_2 = p8.zzh().zza(((String) v0_2));
                    }
                    p8.zzc().zze(p7, reflect.Array.newInstance(com.google.android.recaptcha.internal.zzgc.zza(v0_2), v9_4));
                    return;
                }
            }
        }
    }
}
