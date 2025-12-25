package com.google.android.recaptcha.internal;
public final class zzhz implements com.google.android.recaptcha.internal.zzhx {
    private final com.google.android.recaptcha.internal.zzhy zza;

    public zzhz(com.google.android.recaptcha.internal.zzhy p1, com.google.android.recaptcha.internal.zzhw p2)
    {
        this.zza = p1;
        return;
    }

    private final com.google.android.recaptcha.internal.zztz zzb(String p9, java.util.List p10)
    {
        if (p9.length() == 0) {
            throw new com.google.android.recaptcha.internal.zzce(3, 17, 0);
        } else {
            com.google.android.recaptcha.internal.zzhv v2_1 = new com.google.android.recaptcha.internal.zzhv(this.zza.zza(i7.i.k0(p10)), 255, com.google.android.recaptcha.internal.zzhv.zzb());
            com.google.android.recaptcha.internal.zzkh v10_3 = new StringBuilder(p9.length());
            int v0_2 = 0;
            while (v0_2 < p9.length()) {
                v10_3.append(((char) (p9.charAt(v0_2) ^ ((int) v2_1.zza()))));
                v0_2++;
            }
            return com.google.android.recaptcha.internal.zztz.zzg(com.google.android.recaptcha.internal.zzkh.zzh().zzj(v10_3.toString()));
        }
    }

    public final com.google.android.recaptcha.internal.zztz zza(com.google.android.recaptcha.internal.zzub p4)
    {
        long v0_0 = com.google.android.recaptcha.internal.zzjh.zzb();
        com.google.android.recaptcha.internal.zztz v4_2 = this.zzb(p4.zzj(), p4.zzk());
        v0_0.zzf();
        com.google.android.recaptcha.internal.zzbk.zza(com.google.android.recaptcha.internal.zzbl.zzh.zza(), v0_0.zza(java.util.concurrent.TimeUnit.MICROSECONDS));
        return v4_2;
    }
}
