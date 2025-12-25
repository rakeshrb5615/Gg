package com.google.android.recaptcha.internal;
public final class zzhg implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhg zza;

    static zzhg()
    {
        com.google.android.recaptcha.internal.zzhg.zza = new com.google.android.recaptcha.internal.zzhg();
        return;
    }

    private zzhg()
    {
        return;
    }

    public final varargs void zza(int p7, com.google.android.recaptcha.internal.zzgd p8, com.google.android.recaptcha.internal.zzue[] p9)
    {
        int v0_0 = p9.length;
        if (v0_0 == 0) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            reflect.Method v3_0 = p8.zzc().zza(p9[0]);
            if (1 != (v3_0 instanceof reflect.Method)) {
                v3_0 = 0;
            }
            reflect.Method v3_1 = ((reflect.Method) v3_0);
            if (v3_1 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                int v9_3 = p8.zzc().zzg(i7.h.i0(p9).subList(1, v0_0));
                try {
                    p8.zzc().zze(p7, v3_1.invoke(0, java.util.Arrays.copyOf(v9_3, v9_3.length)));
                    return;
                } catch (Exception v7_4) {
                    throw new com.google.android.recaptcha.internal.zzce(6, 15, v7_4);
                }
            }
        }
    }
}
