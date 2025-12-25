package com.google.android.gms.internal.firebase-auth-api;
public final class zzhj {
    private static final com.google.android.gms.internal.firebase-auth-api.zzaaj zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzph zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzpd zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zznx zzd;
    private static final com.google.android.gms.internal.firebase-auth-api.zznt zze;

    static zzhj()
    {
        com.google.android.gms.internal.firebase-auth-api.zznt v0_1 = com.google.android.gms.internal.firebase-auth-api.zzqn.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        com.google.android.gms.internal.firebase-auth-api.zzhj.zza = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzhj.zzb = com.google.android.gms.internal.firebase-auth-api.zzph.zza(new com.google.android.gms.internal.firebase-auth-api.zzhm(), com.google.android.gms.internal.firebase-auth-api.zzem, com.google.android.gms.internal.firebase-auth-api.zzqe);
        com.google.android.gms.internal.firebase-auth-api.zzhj.zzc = com.google.android.gms.internal.firebase-auth-api.zzpd.zza(new com.google.android.gms.internal.firebase-auth-api.zzhl(), v0_1, com.google.android.gms.internal.firebase-auth-api.zzqe);
        com.google.android.gms.internal.firebase-auth-api.zzhj.zzd = com.google.android.gms.internal.firebase-auth-api.zznx.zza(new com.google.android.gms.internal.firebase-auth-api.zzho(), com.google.android.gms.internal.firebase-auth-api.zzej, com.google.android.gms.internal.firebase-auth-api.zzqb);
        com.google.android.gms.internal.firebase-auth-api.zzhj.zze = com.google.android.gms.internal.firebase-auth-api.zznt.zza(new com.google.android.gms.internal.firebase-auth-api.zzhn(), v0_1, com.google.android.gms.internal.firebase-auth-api.zzqb);
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzej zza(com.google.android.gms.internal.firebase-auth-api.zzqb p0, com.google.android.gms.internal.firebase-auth-api.zzch p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzhj.zzb(p0, p1);
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzem$zza zza(com.google.android.gms.internal.firebase-auth-api.zzxz p2)
    {
        java.security.GeneralSecurityException v0_3 = com.google.android.gms.internal.firebase-auth-api.zzhq.zza[p2.ordinal()];
        if (v0_3 == 1) {
            return com.google.android.gms.internal.firebase-auth-api.zzem$zza.zza;
        } else {
            if ((v0_3 == 2) || (v0_3 == 3)) {
                return com.google.android.gms.internal.firebase-auth-api.zzem$zza.zzb;
            } else {
                if (v0_3 != 4) {
                    throw new java.security.GeneralSecurityException(g2.g.c(p2.zza(), "Unable to parse OutputPrefixType: "));
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzem$zza.zzc;
                }
            }
        }
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzem zza(com.google.android.gms.internal.firebase-auth-api.zzqe p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzhj.zzb(p0);
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqb zza(com.google.android.gms.internal.firebase-auth-api.zzej p3, com.google.android.gms.internal.firebase-auth-api.zzch p4)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqb.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((com.google.android.gms.internal.firebase-auth-api.zzuv) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzuv.zzb().zza(com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p3.zze().zza(com.google.android.gms.internal.firebase-auth-api.zzch.zza(p4)))).zze())).zzj(), com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzhj.zza(((com.google.android.gms.internal.firebase-auth-api.zzem) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzb()), p3.zzb());
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqe zza(com.google.android.gms.internal.firebase-auth-api.zzem p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqe.zzb(((com.google.android.gms.internal.firebase-auth-api.zzxb) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxb.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(com.google.android.gms.internal.firebase-auth-api.zzuy.zzb().zzj()).zza(com.google.android.gms.internal.firebase-auth-api.zzhj.zza(p2.zzb())).zze())));
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzxz zza(com.google.android.gms.internal.firebase-auth-api.zzem$zza p2)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzem$zza.zza.equals(p2)) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzem$zza.zzb.equals(p2)) {
                if (!com.google.android.gms.internal.firebase-auth-api.zzem$zza.zzc.equals(p2)) {
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
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzhj.zzb);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzhj.zzc);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzhj.zzd);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzhj.zze);
        return;
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzej zzb(com.google.android.gms.internal.firebase-auth-api.zzqb p2, com.google.android.gms.internal.firebase-auth-api.zzch p3)
    {
        if (!p2.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        } else {
            try {
                byte[] v0_2 = com.google.android.gms.internal.firebase-auth-api.zzuv.zza(p2.zzd(), com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            } catch (com.google.android.gms.internal.firebase-auth-api.zzall) {
                throw new java.security.GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
            if (v0_2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzej.zza(com.google.android.gms.internal.firebase-auth-api.zzhj.zza(p2.zzb()), com.google.android.gms.internal.firebase-auth-api.zzaal.zza(v0_2.zzd().zzd(), com.google.android.gms.internal.firebase-auth-api.zzch.zza(p3)), p2.zze());
            }
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzem zzb(com.google.android.gms.internal.firebase-auth-api.zzqe p2)
    {
        if (!p2.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException(g2.g.l("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", p2.zza().zzf()));
        } else {
            try {
                com.google.android.gms.internal.firebase-auth-api.zzuy.zza(p2.zza().zze(), com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
                return com.google.android.gms.internal.firebase-auth-api.zzem.zza(com.google.android.gms.internal.firebase-auth-api.zzhj.zza(p2.zza().zzd()));
            } catch (com.google.android.gms.internal.firebase-auth-api.zzall v2_8) {
                throw new java.security.GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", v2_8);
            }
        }
    }
}
