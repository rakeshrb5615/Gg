package com.google.android.gms.internal.measurement;
final class zznd implements com.google.android.gms.internal.measurement.zzny {
    private static final com.google.android.gms.internal.measurement.zznk zzb;
    private final com.google.android.gms.internal.measurement.zznk zza;

    static zznd()
    {
        com.google.android.gms.internal.measurement.zznd.zzb = new com.google.android.gms.internal.measurement.zznb();
        return;
    }

    public zznd()
    {
        com.google.android.gms.internal.measurement.zznk[] v2_1 = new com.google.android.gms.internal.measurement.zznk[2];
        v2_1[0] = com.google.android.gms.internal.measurement.zzma.zza();
        v2_1[1] = com.google.android.gms.internal.measurement.zznd.zzb;
        com.google.android.gms.internal.measurement.zznc v0_1 = new com.google.android.gms.internal.measurement.zznc(v2_1);
        this.zza = v0_1;
        return;
    }

    public final com.google.android.gms.internal.measurement.zznx zza(Class p9)
    {
        // Both branches of the condition point to the same code.
        // if (com.google.android.gms.internal.measurement.zzmf.isAssignableFrom(p9)) {
            com.google.android.gms.internal.measurement.zznj v2 = this.zza.zzc(p9);
            if (v2.zza()) {
                return com.google.android.gms.internal.measurement.zznq.zzg(com.google.android.gms.internal.measurement.zznz.zzA(), com.google.android.gms.internal.measurement.zzlu.zza(), v2.zzb());
            } else {
                int v0_6;
                com.google.android.gms.internal.measurement.zznr v3 = com.google.android.gms.internal.measurement.zzns.zza();
                com.google.android.gms.internal.measurement.zzmy v4 = com.google.android.gms.internal.measurement.zzmz.zza();
                com.google.android.gms.internal.measurement.zzoi v5 = com.google.android.gms.internal.measurement.zznz.zzA();
                if ((v2.zzc() - 1) == 1) {
                    v0_6 = 0;
                } else {
                    v0_6 = com.google.android.gms.internal.measurement.zzlu.zza();
                }
                return com.google.android.gms.internal.measurement.zznp.zzl(p9, v2, v3, v4, v5, v0_6, com.google.android.gms.internal.measurement.zzni.zza());
            }
        // }
    }
}
