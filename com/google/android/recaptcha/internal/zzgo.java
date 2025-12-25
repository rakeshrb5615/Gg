package com.google.android.recaptcha.internal;
public final class zzgo implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgo zza;

    static zzgo()
    {
        com.google.android.recaptcha.internal.zzgo.zza = new com.google.android.recaptcha.internal.zzgo();
        return;
    }

    private zzgo()
    {
        return;
    }

    public final varargs void zza(int p7, com.google.android.recaptcha.internal.zzgd p8, com.google.android.recaptcha.internal.zzue[] p9)
    {
        if (p9.length != 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            String v0_2 = p8.zzc().zza(p9[0]);
            if (1 != (v0_2 instanceof String)) {
                v0_2 = 0;
            }
            String v0_3 = ((String) v0_2);
            if (v0_3 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                String v9_2 = p8.zzc().zza(p9[1]);
                if (1 != (v9_2 instanceof String)) {
                    v9_2 = 0;
                }
                String v9_3 = ((String) v9_2);
                if (v9_3 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    p8.zzc().zze(p7, v0_3.concat(v9_3));
                    return;
                }
            }
        }
    }
}
