package com.google.android.recaptcha.internal;
final class zzoa implements com.google.android.recaptcha.internal.zzox {
    private static final com.google.android.recaptcha.internal.zzog zza;
    private final com.google.android.recaptcha.internal.zzog zzb;

    static zzoa()
    {
        com.google.android.recaptcha.internal.zzoa.zza = new com.google.android.recaptcha.internal.zzny();
        return;
    }

    public zzoa()
    {
        com.google.android.recaptcha.internal.zzog[] v2_1 = new com.google.android.recaptcha.internal.zzog[2];
        v2_1[0] = com.google.android.recaptcha.internal.zzmw.zza();
        v2_1[1] = com.google.android.recaptcha.internal.zzoa.zza;
        com.google.android.recaptcha.internal.zznz v0_1 = new com.google.android.recaptcha.internal.zznz(v2_1);
        this.zzb = v0_1;
        return;
    }

    public final com.google.android.recaptcha.internal.zzow zza(Class p9)
    {
        // Both branches of the condition point to the same code.
        // if (com.google.android.recaptcha.internal.zznd.isAssignableFrom(p9)) {
            com.google.android.recaptcha.internal.zzof v2 = this.zzb.zzb(p9);
            if (v2.zzb()) {
                return com.google.android.recaptcha.internal.zzom.zzc(com.google.android.recaptcha.internal.zzoy.zzm(), com.google.android.recaptcha.internal.zzmr.zza(), v2.zza());
            } else {
                int v0_6;
                com.google.android.recaptcha.internal.zzoo v3 = com.google.android.recaptcha.internal.zzop.zza();
                com.google.android.recaptcha.internal.zznv v4 = com.google.android.recaptcha.internal.zznw.zza();
                com.google.android.recaptcha.internal.zzpl v5 = com.google.android.recaptcha.internal.zzoy.zzm();
                if ((v2.zzc() - 1) == 1) {
                    v0_6 = 0;
                } else {
                    v0_6 = com.google.android.recaptcha.internal.zzmr.zza();
                }
                return com.google.android.recaptcha.internal.zzol.zzm(p9, v2, v3, v4, v5, v0_6, com.google.android.recaptcha.internal.zzoe.zza());
            }
        // }
    }
}
