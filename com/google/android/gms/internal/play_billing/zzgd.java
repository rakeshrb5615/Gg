package com.google.android.gms.internal.play_billing;
final class zzgd implements com.google.android.gms.internal.play_billing.zzgw {
    private static final com.google.android.gms.internal.play_billing.zzgj zza;
    private final com.google.android.gms.internal.play_billing.zzgj zzb;

    static zzgd()
    {
        com.google.android.gms.internal.play_billing.zzgd.zza = new com.google.android.gms.internal.play_billing.zzgb();
        return;
    }

    public zzgd()
    {
        com.google.android.gms.internal.play_billing.zzgj[] v2_1 = new com.google.android.gms.internal.play_billing.zzgj[2];
        v2_1[0] = com.google.android.gms.internal.play_billing.zzfd.zza();
        v2_1[1] = com.google.android.gms.internal.play_billing.zzgd.zza;
        com.google.android.gms.internal.play_billing.zzgc v0_1 = new com.google.android.gms.internal.play_billing.zzgc(v2_1);
        this.zzb = v0_1;
        return;
    }

    public final com.google.android.gms.internal.play_billing.zzgv zza(Class p9)
    {
        // Both branches of the condition point to the same code.
        // if (com.google.android.gms.internal.play_billing.zzfi.isAssignableFrom(p9)) {
            com.google.android.gms.internal.play_billing.zzgi v2 = this.zzb.zzb(p9);
            if (v2.zzb()) {
                return com.google.android.gms.internal.play_billing.zzgp.zzc(com.google.android.gms.internal.play_billing.zzgx.zzm(), com.google.android.gms.internal.play_billing.zzex.zza(), v2.zza());
            } else {
                int v0_6;
                com.google.android.gms.internal.play_billing.zzgq v3 = com.google.android.gms.internal.play_billing.zzgr.zza();
                com.google.android.gms.internal.play_billing.zzfy v4 = com.google.android.gms.internal.play_billing.zzfz.zza();
                com.google.android.gms.internal.play_billing.zzhh v5 = com.google.android.gms.internal.play_billing.zzgx.zzm();
                if ((v2.zzc() - 1) == 1) {
                    v0_6 = 0;
                } else {
                    v0_6 = com.google.android.gms.internal.play_billing.zzex.zza();
                }
                return com.google.android.gms.internal.play_billing.zzgo.zzl(p9, v2, v3, v4, v5, v0_6, com.google.android.gms.internal.play_billing.zzgh.zza());
            }
        // }
    }
}
