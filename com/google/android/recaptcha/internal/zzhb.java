package com.google.android.recaptcha.internal;
public final class zzhb implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhb zza;

    static zzhb()
    {
        com.google.android.recaptcha.internal.zzhb.zza = new com.google.android.recaptcha.internal.zzhb();
        return;
    }

    private zzhb()
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
                int v0_3;
                if (!(v0_2 instanceof Class)) {
                    v0_3 = v0_2.getClass();
                } else {
                    v0_3 = ((Class) v0_2);
                }
                int v9_2 = p8.zzc().zza(p9[1]);
                if (1 != (v9_2 instanceof String)) {
                    v9_2 = 0;
                }
                int v9_3 = ((String) v9_2);
                if (v9_3 == 0) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    try {
                        p8.zzc().zze(p7, v0_3.getField(p8.zzh().zza(v9_3)));
                        return;
                    } catch (Exception v7_6) {
                        throw new com.google.android.recaptcha.internal.zzce(6, 10, v7_6);
                    }
                }
            }
        }
    }
}
