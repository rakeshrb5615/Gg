package com.google.android.gms.internal.firebase-auth-api;
public final class zzjs {
    private static final com.google.android.gms.internal.firebase-auth-api.zzaaj zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzph zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzpd zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zznx zzd;
    private static final com.google.android.gms.internal.firebase-auth-api.zznt zze;
    private static final java.util.Map zzf;
    private static final java.util.Map zzg;

    static zzjs()
    {
        java.util.Map v0_1 = com.google.android.gms.internal.firebase-auth-api.zzqn.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        com.google.android.gms.internal.firebase-auth-api.zzjs.zza = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzjs.zzb = com.google.android.gms.internal.firebase-auth-api.zzph.zza(new com.google.android.gms.internal.firebase-auth-api.zzjr(), com.google.android.gms.internal.firebase-auth-api.zzjf, com.google.android.gms.internal.firebase-auth-api.zzqe);
        com.google.android.gms.internal.firebase-auth-api.zzjs.zzc = com.google.android.gms.internal.firebase-auth-api.zzpd.zza(new com.google.android.gms.internal.firebase-auth-api.zzju(), v0_1, com.google.android.gms.internal.firebase-auth-api.zzqe);
        com.google.android.gms.internal.firebase-auth-api.zzjs.zzd = com.google.android.gms.internal.firebase-auth-api.zznx.zza(new com.google.android.gms.internal.firebase-auth-api.zzjt(), com.google.android.gms.internal.firebase-auth-api.zzja, com.google.android.gms.internal.firebase-auth-api.zzqb);
        com.google.android.gms.internal.firebase-auth-api.zzjs.zze = com.google.android.gms.internal.firebase-auth-api.zznt.zza(new com.google.android.gms.internal.firebase-auth-api.zzjw(), v0_1, com.google.android.gms.internal.firebase-auth-api.zzqb);
        java.util.Map v0_4 = new java.util.HashMap();
        com.google.android.gms.internal.firebase-auth-api.zzxz v1_8 = com.google.android.gms.internal.firebase-auth-api.zzjf$zza.zzc;
        com.google.android.gms.internal.firebase-auth-api.zzxz v2_1 = com.google.android.gms.internal.firebase-auth-api.zzxz.zzd;
        v0_4.put(v1_8, v2_1);
        com.google.android.gms.internal.firebase-auth-api.zzjf$zza v3_1 = com.google.android.gms.internal.firebase-auth-api.zzjf$zza.zza;
        com.google.android.gms.internal.firebase-auth-api.zzxz v4 = com.google.android.gms.internal.firebase-auth-api.zzxz.zzb;
        v0_4.put(v3_1, v4);
        com.google.android.gms.internal.firebase-auth-api.zzjf$zza v5 = com.google.android.gms.internal.firebase-auth-api.zzjf$zza.zzb;
        com.google.android.gms.internal.firebase-auth-api.zzxz v6 = com.google.android.gms.internal.firebase-auth-api.zzxz.zze;
        v0_4.put(v5, v6);
        com.google.android.gms.internal.firebase-auth-api.zzjs.zzf = java.util.Collections.unmodifiableMap(v0_4);
        java.util.Map v0_7 = new java.util.EnumMap(com.google.android.gms.internal.firebase-auth-api.zzxz);
        v0_7.put(v2_1, v1_8);
        v0_7.put(v4, v3_1);
        v0_7.put(v6, v5);
        v0_7.put(com.google.android.gms.internal.firebase-auth-api.zzxz.zzc, v5);
        com.google.android.gms.internal.firebase-auth-api.zzjs.zzg = java.util.Collections.unmodifiableMap(v0_7);
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzja zza(com.google.android.gms.internal.firebase-auth-api.zzqb p0, com.google.android.gms.internal.firebase-auth-api.zzch p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzjs.zzb(p0, p1);
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzjf$zza zza(com.google.android.gms.internal.firebase-auth-api.zzxz p2)
    {
        java.security.GeneralSecurityException v0_0 = com.google.android.gms.internal.firebase-auth-api.zzjs.zzg;
        if (!v0_0.containsKey(p2)) {
            throw new java.security.GeneralSecurityException(g2.g.c(p2.zza(), "Unable to parse OutputPrefixType: "));
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzjf$zza) v0_0.get(p2));
        }
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzjf zza(com.google.android.gms.internal.firebase-auth-api.zzqe p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzjs.zzb(p0);
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqb zza(com.google.android.gms.internal.firebase-auth-api.zzja p3, com.google.android.gms.internal.firebase-auth-api.zzch p4)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqb.zza("type.googleapis.com/google.crypto.tink.AesSivKey", ((com.google.android.gms.internal.firebase-auth-api.zzup) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzup.zzb().zza(com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p3.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzch.zza(p4)))).zze())).zzj(), com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzjs.zza(((com.google.android.gms.internal.firebase-auth-api.zzjf) ((com.google.android.gms.internal.firebase-auth-api.zzjj) p3.zza())).zzd()), p3.zzb());
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqe zza(com.google.android.gms.internal.firebase-auth-api.zzjf p3)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqe.zzb(((com.google.android.gms.internal.firebase-auth-api.zzxb) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((com.google.android.gms.internal.firebase-auth-api.zzus) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzus.zzc().zza(p3.zzb()).zze())).zzj()).zza(com.google.android.gms.internal.firebase-auth-api.zzjs.zza(p3.zzd())).zze())));
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzxz zza(com.google.android.gms.internal.firebase-auth-api.zzjf$zza p2)
    {
        java.security.GeneralSecurityException v0_0 = com.google.android.gms.internal.firebase-auth-api.zzjs.zzf;
        if (!v0_0.containsKey(p2)) {
            throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(p2)));
        } else {
            return ((com.google.android.gms.internal.firebase-auth-api.zzxz) v0_0.get(p2));
        }
    }

    public static void zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzoz v0 = com.google.android.gms.internal.firebase-auth-api.zzoz.zza();
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzjs.zzb);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzjs.zzc);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzjs.zzd);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzjs.zze);
        return;
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzja zzb(com.google.android.gms.internal.firebase-auth-api.zzqb p3, com.google.android.gms.internal.firebase-auth-api.zzch p4)
    {
        if (!p3.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        } else {
            try {
                byte[] v0_2 = com.google.android.gms.internal.firebase-auth-api.zzup.zza(p3.zzd(), com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            } catch (com.google.android.gms.internal.firebase-auth-api.zzall) {
                throw new java.security.GeneralSecurityException("Parsing AesSivKey failed");
            }
            if (v0_2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzja.zzc().zza(com.google.android.gms.internal.firebase-auth-api.zzjf.zzc().zza(v0_2.zzd().zzb()).zza(com.google.android.gms.internal.firebase-auth-api.zzjs.zza(p3.zzb())).zza()).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(v0_2.zzd().zzd(), com.google.android.gms.internal.firebase-auth-api.zzch.zza(p4))).zza(p3.zze()).zza();
            }
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzjf zzb(com.google.android.gms.internal.firebase-auth-api.zzqe p2)
    {
        if (!p2.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException(g2.g.l("Wrong type URL in call to AesSivParameters.parseParameters: ", p2.zza().zzf()));
        } else {
            try {
                String v0_4 = com.google.android.gms.internal.firebase-auth-api.zzus.zza(p2.zza().zze(), com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            } catch (java.security.GeneralSecurityException v2_6) {
                throw new java.security.GeneralSecurityException("Parsing AesSivParameters failed: ", v2_6);
            }
            if (v0_4.zzb() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzjf.zzc().zza(v0_4.zza()).zza(com.google.android.gms.internal.firebase-auth-api.zzjs.zza(p2.zza().zzd())).zza();
            }
        }
    }
}
