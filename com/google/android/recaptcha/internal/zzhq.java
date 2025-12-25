package com.google.android.recaptcha.internal;
public final class zzhq implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhq zza;

    static zzhq()
    {
        com.google.android.recaptcha.internal.zzhq.zza = new com.google.android.recaptcha.internal.zzhq();
        return;
    }

    private zzhq()
    {
        return;
    }

    public final varargs void zza(int p8, com.google.android.recaptcha.internal.zzgd p9, com.google.android.recaptcha.internal.zzue[] p10)
    {
        if (p10.length != 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            int[] v0_2 = p9.zzc().zza(p10[0]);
            if (1 != java.util.Objects.nonNull(v0_2)) {
                v0_2 = 0;
            }
            if (v0_2 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                Object[] v10_2 = p9.zzc().zza(p10[1]);
                if (1 != (v10_2 instanceof Integer)) {
                    v10_2 = 0;
                }
                Object[] v10_3 = ((Integer) v10_2);
                if (v10_3 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    Object[] v10_6;
                    Object[] v10_4 = v10_3.intValue();
                    if (!(v0_2 instanceof Integer)) {
                        if (!(v0_2 instanceof int[])) {
                            throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                        } else {
                            int[] v0_3 = ((int[]) v0_2);
                            int v2_1 = v0_3.length;
                            java.util.ArrayList v3_2 = new java.util.ArrayList(v2_1);
                            int v4_3 = 0;
                            while (v4_3 < v2_1) {
                                v3_2.add(Integer.valueOf((v0_3[v4_3] - v10_4)));
                                v4_3++;
                            }
                            Object[] v10_5 = new Integer[0];
                            v10_6 = v3_2.toArray(v10_5);
                        }
                    } else {
                        v10_6 = Integer.valueOf((((Number) v0_2).intValue() - v10_4));
                    }
                    p9.zzc().zze(p8, v10_6);
                    return;
                }
            }
        }
    }
}
