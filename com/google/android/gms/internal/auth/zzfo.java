package com.google.android.gms.internal.auth;
final class zzfo implements com.google.android.gms.internal.auth.zzgi {
    private static final com.google.android.gms.internal.auth.zzfu zza;
    private final com.google.android.gms.internal.auth.zzfu zzb;

    static zzfo()
    {
        com.google.android.gms.internal.auth.zzfo.zza = new com.google.android.gms.internal.auth.zzfm();
        return;
    }

    public zzfo()
    {
        try {
            com.google.android.gms.internal.auth.zzfu v2_1 = ((com.google.android.gms.internal.auth.zzfu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", 0).invoke(0, 0));
        } catch (Exception) {
            v2_1 = com.google.android.gms.internal.auth.zzfo.zza;
        }
        com.google.android.gms.internal.auth.zzfu[] v3_1 = new com.google.android.gms.internal.auth.zzfu[2];
        v3_1[0] = com.google.android.gms.internal.auth.zzer.zza();
        v3_1[1] = v2_1;
        com.google.android.gms.internal.auth.zzfn v0_1 = new com.google.android.gms.internal.auth.zzfn(v3_1);
        com.google.android.gms.internal.auth.zzez.zzf(v0_1, "messageInfoFactory");
        this.zzb = v0_1;
        return;
    }

    private static boolean zzb(com.google.android.gms.internal.auth.zzft p1)
    {
        if (p1.zzc() != 1) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.internal.auth.zzgh zza(Class p9)
    {
        com.google.android.gms.internal.auth.zzgj.zzg(p9);
        com.google.android.gms.internal.auth.zzft v2 = this.zzb.zzb(p9);
        if (!v2.zzb()) {
            if (!com.google.android.gms.internal.auth.zzeu.isAssignableFrom(p9)) {
                if (!com.google.android.gms.internal.auth.zzfo.zzb(v2)) {
                    return com.google.android.gms.internal.auth.zzfz.zzj(p9, v2, com.google.android.gms.internal.auth.zzgc.zza(), com.google.android.gms.internal.auth.zzfk.zzc(), com.google.android.gms.internal.auth.zzgj.zzb(), 0, com.google.android.gms.internal.auth.zzfs.zza());
                } else {
                    return com.google.android.gms.internal.auth.zzfz.zzj(p9, v2, com.google.android.gms.internal.auth.zzgc.zza(), com.google.android.gms.internal.auth.zzfk.zzc(), com.google.android.gms.internal.auth.zzgj.zza(), com.google.android.gms.internal.auth.zzen.zza(), com.google.android.gms.internal.auth.zzfs.zza());
                }
            } else {
                if (!com.google.android.gms.internal.auth.zzfo.zzb(v2)) {
                    return com.google.android.gms.internal.auth.zzfz.zzj(p9, v2, com.google.android.gms.internal.auth.zzgc.zzb(), com.google.android.gms.internal.auth.zzfk.zzd(), com.google.android.gms.internal.auth.zzgj.zzc(), 0, com.google.android.gms.internal.auth.zzfs.zzb());
                } else {
                    return com.google.android.gms.internal.auth.zzfz.zzj(p9, v2, com.google.android.gms.internal.auth.zzgc.zzb(), com.google.android.gms.internal.auth.zzfk.zzd(), com.google.android.gms.internal.auth.zzgj.zzc(), com.google.android.gms.internal.auth.zzen.zzb(), com.google.android.gms.internal.auth.zzfs.zzb());
                }
            }
        } else {
            if (!com.google.android.gms.internal.auth.zzeu.isAssignableFrom(p9)) {
                return com.google.android.gms.internal.auth.zzga.zzb(com.google.android.gms.internal.auth.zzgj.zza(), com.google.android.gms.internal.auth.zzen.zza(), v2.zza());
            } else {
                return com.google.android.gms.internal.auth.zzga.zzb(com.google.android.gms.internal.auth.zzgj.zzc(), com.google.android.gms.internal.auth.zzen.zzb(), v2.zza());
            }
        }
    }
}
