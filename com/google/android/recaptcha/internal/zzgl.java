package com.google.android.recaptcha.internal;
public final class zzgl implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzgl zza;

    static zzgl()
    {
        com.google.android.recaptcha.internal.zzgl.zza = new com.google.android.recaptcha.internal.zzgl();
        return;
    }

    private zzgl()
    {
        return;
    }

    public final varargs void zza(int p5, com.google.android.recaptcha.internal.zzgd p6, com.google.android.recaptcha.internal.zzue[] p7)
    {
        if (p7.length != 2) {
            throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
        } else {
            com.google.android.recaptcha.internal.zzce v5_2 = p6.zzc().zza(p7[0]);
            if (1 != (v5_2 instanceof String)) {
                v5_2 = 0;
            }
            com.google.android.recaptcha.internal.zzce v5_3 = ((String) v5_2);
            if (v5_3 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                String[] v7_2 = p6.zzc().zza(p7[1]);
                if (v7_2 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 4, 0);
                } else {
                    if ((!(v7_2 instanceof Integer)) && ((!(v7_2 instanceof Short)) && ((!(v7_2 instanceof Byte)) && ((!(v7_2 instanceof Long)) && ((!(v7_2 instanceof Double)) && ((!(v7_2 instanceof Float)) && ((!(v7_2 instanceof Boolean)) && ((!(v7_2 instanceof Character)) && (!(v7_2 instanceof String)))))))))) {
                        throw new com.google.android.recaptcha.internal.zzce(4, 7, 0);
                    } else {
                        p6.zzi().zzb(v5_3, new String[] {v7_2.toString()}));
                        return;
                    }
                }
            }
        }
    }
}
