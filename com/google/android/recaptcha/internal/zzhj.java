package com.google.android.recaptcha.internal;
public final class zzhj implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhj zza;

    static zzhj()
    {
        com.google.android.recaptcha.internal.zzhj.zza = new com.google.android.recaptcha.internal.zzhj();
        return;
    }

    private zzhj()
    {
        return;
    }

    public final varargs void zza(int p7, com.google.android.recaptcha.internal.zzgd p8, com.google.android.recaptcha.internal.zzue[] p9)
    {
        int v0_0 = p9.length;
        if (v0_0 == 0) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            reflect.Constructor v3_0 = p8.zzc().zza(p9[0]);
            if (1 != java.util.Objects.nonNull(v3_0)) {
                v3_0 = 0;
            }
            if (v3_0 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                reflect.Constructor v3_1;
                if (!(v3_0 instanceof reflect.Constructor)) {
                    v3_1 = v3_0.getClass().getConstructor(0);
                } else {
                    v3_1 = ((reflect.Constructor) v3_0);
                }
                int v9_3 = p8.zzc().zzg(i7.h.i0(p9).subList(1, v0_0));
                try {
                    p8.zzc().zze(p7, v3_1.newInstance(java.util.Arrays.copyOf(v9_3, v9_3.length)));
                    return;
                } catch (Exception v7_4) {
                    throw new com.google.android.recaptcha.internal.zzce(6, 14, v7_4);
                }
            }
        }
    }
}
