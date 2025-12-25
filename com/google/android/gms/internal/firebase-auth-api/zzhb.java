package com.google.android.gms.internal.firebase-auth-api;
public final class zzhb {
    private static final com.google.android.gms.internal.firebase-auth-api.zzaaj zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzph zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzpd zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zznx zzd;
    private static final com.google.android.gms.internal.firebase-auth-api.zznt zze;

    static zzhb()
    {
        com.google.android.gms.internal.firebase-auth-api.zznt v0_1 = com.google.android.gms.internal.firebase-auth-api.zzqn.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        com.google.android.gms.internal.firebase-auth-api.zzhb.zza = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzhb.zzb = com.google.android.gms.internal.firebase-auth-api.zzph.zza(new com.google.android.gms.internal.firebase-auth-api.zzhe(), com.google.android.gms.internal.firebase-auth-api.zzeg, com.google.android.gms.internal.firebase-auth-api.zzqe);
        com.google.android.gms.internal.firebase-auth-api.zzhb.zzc = com.google.android.gms.internal.firebase-auth-api.zzpd.zza(new com.google.android.gms.internal.firebase-auth-api.zzhd(), v0_1, com.google.android.gms.internal.firebase-auth-api.zzqe);
        com.google.android.gms.internal.firebase-auth-api.zzhb.zzd = com.google.android.gms.internal.firebase-auth-api.zznx.zza(new com.google.android.gms.internal.firebase-auth-api.zzhg(), com.google.android.gms.internal.firebase-auth-api.zzdz, com.google.android.gms.internal.firebase-auth-api.zzqb);
        com.google.android.gms.internal.firebase-auth-api.zzhb.zze = com.google.android.gms.internal.firebase-auth-api.zznt.zza(new com.google.android.gms.internal.firebase-auth-api.zzhf(), v0_1, com.google.android.gms.internal.firebase-auth-api.zzqb);
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzdz zza(com.google.android.gms.internal.firebase-auth-api.zzqb p0, com.google.android.gms.internal.firebase-auth-api.zzch p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzhb.zzb(p0, p1);
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzeg$zzb zza(com.google.android.gms.internal.firebase-auth-api.zzxz p2)
    {
        java.security.GeneralSecurityException v0_3 = com.google.android.gms.internal.firebase-auth-api.zzhi.zza[p2.ordinal()];
        if (v0_3 == 1) {
            return com.google.android.gms.internal.firebase-auth-api.zzeg$zzb.zza;
        } else {
            if ((v0_3 == 2) || (v0_3 == 3)) {
                return com.google.android.gms.internal.firebase-auth-api.zzeg$zzb.zzb;
            } else {
                if (v0_3 != 4) {
                    throw new java.security.GeneralSecurityException(g2.g.c(p2.zza(), "Unable to parse OutputPrefixType: "));
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzeg$zzb.zzc;
                }
            }
        }
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzeg zza(com.google.android.gms.internal.firebase-auth-api.zzqe p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzhb.zzb(p0);
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqb zza(com.google.android.gms.internal.firebase-auth-api.zzdz p3, com.google.android.gms.internal.firebase-auth-api.zzch p4)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqb.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((com.google.android.gms.internal.firebase-auth-api.zzuj) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzuj.zzb().zza(com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p3.zzf().zza(com.google.android.gms.internal.firebase-auth-api.zzch.zza(p4)))).zze())).zzj(), com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzhb.zza(((com.google.android.gms.internal.firebase-auth-api.zzeg) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzd()), p3.zzb());
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqe zza(com.google.android.gms.internal.firebase-auth-api.zzeg p3)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqe.zzb(((com.google.android.gms.internal.firebase-auth-api.zzxb) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey").zza(((com.google.android.gms.internal.firebase-auth-api.zzum) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzum.zzc().zza(p3.zzb()).zze())).zzj()).zza(com.google.android.gms.internal.firebase-auth-api.zzhb.zza(p3.zzd())).zze())));
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzxz zza(com.google.android.gms.internal.firebase-auth-api.zzeg$zzb p2)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzeg$zzb.zza.equals(p2)) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzeg$zzb.zzb.equals(p2)) {
                if (!com.google.android.gms.internal.firebase-auth-api.zzeg$zzb.zzc.equals(p2)) {
                    throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(p2)));
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzxz.zzd;
                }
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzxz.zze;
            }
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzxz.zzb;
        }
    }

    public static void zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzoz v0 = com.google.android.gms.internal.firebase-auth-api.zzoz.zza();
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzhb.zzb);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzhb.zzc);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzhb.zzd);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzhb.zze);
        return;
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzdz zzb(com.google.android.gms.internal.firebase-auth-api.zzqb p3, com.google.android.gms.internal.firebase-auth-api.zzch p4)
    {
        if (!p3.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        } else {
            try {
                byte[] v0_2 = com.google.android.gms.internal.firebase-auth-api.zzuj.zza(p3.zzd(), com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            } catch (com.google.android.gms.internal.firebase-auth-api.zzall) {
                throw new java.security.GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
            if (v0_2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzdz.zze().zza(com.google.android.gms.internal.firebase-auth-api.zzeg.zzc().zza(v0_2.zzd().zzb()).zza(com.google.android.gms.internal.firebase-auth-api.zzhb.zza(p3.zzb())).zza()).zza(com.google.android.gms.internal.firebase-auth-api.zzaal.zza(v0_2.zzd().zzd(), com.google.android.gms.internal.firebase-auth-api.zzch.zza(p4))).zza(p3.zze()).zza();
            }
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzeg zzb(com.google.android.gms.internal.firebase-auth-api.zzqe p2)
    {
        if (!p2.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException(g2.g.l("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", p2.zza().zzf()));
        } else {
            try {
                String v0_4 = com.google.android.gms.internal.firebase-auth-api.zzum.zza(p2.zza().zze(), com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            } catch (java.security.GeneralSecurityException v2_4) {
                throw new java.security.GeneralSecurityException("Parsing AesGcmSivParameters failed: ", v2_4);
            }
            if (v0_4.zzb() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzeg.zzc().zza(v0_4.zza()).zza(com.google.android.gms.internal.firebase-auth-api.zzhb.zza(p2.zza().zzd())).zza();
            }
        }
    }
}
