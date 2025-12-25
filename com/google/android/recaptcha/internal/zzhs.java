package com.google.android.recaptcha.internal;
public final class zzhs implements com.google.android.recaptcha.internal.zzgx {
    public static final com.google.android.recaptcha.internal.zzhs zza;

    static zzhs()
    {
        com.google.android.recaptcha.internal.zzhs.zza = new com.google.android.recaptcha.internal.zzhs();
        return;
    }

    private zzhs()
    {
        return;
    }

    public final varargs void zza(int p7, com.google.android.recaptcha.internal.zzgd p8, com.google.android.recaptcha.internal.zzue[] p9)
    {
        int v0_0 = p9.length;
        if (v0_0 == 2) {
            com.google.android.recaptcha.internal.zzce v7_1 = p8.zzc().zza(p9[0]);
            if (1 != (v7_1 instanceof String)) {
                v7_1 = 0;
            }
            com.google.android.recaptcha.internal.zzce v7_2 = ((String) v7_1);
            if (v7_2 == null) {
                throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
            } else {
                String[] v9_2 = p8.zzc().zza(p9[1]);
                if (1 != (v9_2 instanceof com.google.android.recaptcha.internal.zzbn)) {
                    v9_2 = 0;
                }
                String[] v9_3 = ((com.google.android.recaptcha.internal.zzbn) v9_2);
                if (v9_3 == null) {
                    throw new com.google.android.recaptcha.internal.zzce(4, 5, 0);
                } else {
                    String[] v9_5 = com.google.android.recaptcha.internal.zzev.zza(p8.zzb(), v9_3).zzd();
                    p8.zzi().zzb(v7_2, new String[] {com.google.android.recaptcha.internal.zzkh.zzh().zzi(v9_5, 0, v9_5.length)}));
                    return;
                }
            }
        } else {
            if (v0_0 != 0) {
                throw new com.google.android.recaptcha.internal.zzce(4, 3, 0);
            } else {
                p8.zzc().zze(p7, new com.google.android.recaptcha.internal.zzbn());
                return;
            }
        }
    }
}
