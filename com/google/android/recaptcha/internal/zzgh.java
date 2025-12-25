package com.google.android.recaptcha.internal;
public final class zzgh implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgh zza;

    static zzgh()
    {
        com.google.android.recaptcha.internal.zzgh.zza = new com.google.android.recaptcha.internal.zzgh();
        return;
    }

    private zzgh()
    {
        return;
    }

    public final varargs void zza(int p7, com.google.android.recaptcha.internal.zzgd p8, com.google.android.recaptcha.internal.zzue[] p9)
    {
        if (p9.length != 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            java.util.List v0_2 = p8.zzc().zza(p9[0]);
            if (1 != java.util.Objects.nonNull(v0_2)) {
                v0_2 = 0;
            }
            if (v0_2 == null) {
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
                    int v9_5;
                    if (!(v0_2 instanceof String)) {
                        if (!(v0_2 instanceof java.util.List)) {
                            v9_5 = reflect.Array.get(v0_2, v9_4);
                        } else {
                            v9_5 = ((java.util.List) v0_2).get(v9_4);
                        }
                    } else {
                        v9_5 = String.valueOf(((String) v0_2).charAt(v9_4));
                    }
                    p8.zzc().zze(p7, v9_5);
                    return;
                }
            }
        }
    }
}
