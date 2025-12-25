package com.google.android.recaptcha.internal;
public final class zzhf implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhf zza;

    static zzhf()
    {
        com.google.android.recaptcha.internal.zzhf.zza = new com.google.android.recaptcha.internal.zzhf();
        return;
    }

    private zzhf()
    {
        return;
    }

    public final varargs void zza(int p8, com.google.android.recaptcha.internal.zzgd p9, com.google.android.recaptcha.internal.zzue[] p10)
    {
        int v0_0 = p10.length;
        if (v0_0 < 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            reflect.Method v4_1 = p9.zzc().zza(p10[0]);
            if (1 != (v4_1 instanceof reflect.Method)) {
                v4_1 = 0;
            }
            reflect.Method v4_2 = ((reflect.Method) v4_1);
            if (v4_2 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                Object v1_2 = p9.zzc().zza(p10[1]);
                int v10_3 = p9.zzc().zzg(i7.h.i0(p10).subList(2, v0_0));
                try {
                    p9.zzc().zze(p8, v4_2.invoke(v1_2, java.util.Arrays.copyOf(v10_3, v10_3.length)));
                    return;
                } catch (Exception v8_3) {
                    throw new com.google.android.recaptcha.internal.zzce(6, 15, v8_3);
                }
            }
        }
    }
}
