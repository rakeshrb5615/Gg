package com.google.android.recaptcha.internal;
public final class zzhr implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhr zza;

    static zzhr()
    {
        com.google.android.recaptcha.internal.zzhr.zza = new com.google.android.recaptcha.internal.zzhr();
        return;
    }

    private zzhr()
    {
        return;
    }

    public final varargs void zza(int p8, com.google.android.recaptcha.internal.zzgd p9, com.google.android.recaptcha.internal.zzue[] p10)
    {
        if (p10.length != 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            int v1_1 = 0;
            int[] v0_2 = p9.zzc().zza(p10[0]);
            if (1 != (v0_2 instanceof int[])) {
                v0_2 = 0;
            }
            int[] v0_3 = ((int[]) v0_2);
            if (v0_3 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                String v10_2 = p9.zzc().zza(p10[1]);
                if (1 != (v10_2 instanceof String)) {
                    v10_2 = 0;
                }
                String v10_3 = ((String) v10_2);
                if (v10_3 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    com.google.android.recaptcha.internal.zzce v9_1 = p9.zzc();
                    StringBuilder v3_2 = new StringBuilder();
                    try {
                        int v4_3 = v0_3.length;
                    } catch (Exception v8_5) {
                        throw new com.google.android.recaptcha.internal.zzce(4, 22, v8_5);
                    }
                    while (v1_1 < v4_3) {
                        v3_2.append(v10_3.charAt(v0_3[v1_1]));
                        v1_1++;
                    }
                    v9_1.zze(p8, v3_2.toString());
                    return;
                }
            }
        }
    }
}
