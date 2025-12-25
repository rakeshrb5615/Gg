package com.google.android.gms.internal.firebase-auth-api;
public final class zzij {
    private static final com.google.android.gms.internal.firebase-auth-api.zzaaj zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzph zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzpd zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zznx zzd;
    private static final com.google.android.gms.internal.firebase-auth-api.zznt zze;

    static zzij()
    {
        com.google.android.gms.internal.firebase-auth-api.zznt v0_1 = com.google.android.gms.internal.firebase-auth-api.zzqn.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        com.google.android.gms.internal.firebase-auth-api.zzij.zza = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzij.zzb = com.google.android.gms.internal.firebase-auth-api.zzph.zza(new com.google.android.gms.internal.firebase-auth-api.zzim(), com.google.android.gms.internal.firebase-auth-api.zzge, com.google.android.gms.internal.firebase-auth-api.zzqe);
        com.google.android.gms.internal.firebase-auth-api.zzij.zzc = com.google.android.gms.internal.firebase-auth-api.zzpd.zza(new com.google.android.gms.internal.firebase-auth-api.zzil(), v0_1, com.google.android.gms.internal.firebase-auth-api.zzqe);
        com.google.android.gms.internal.firebase-auth-api.zzij.zzd = com.google.android.gms.internal.firebase-auth-api.zznx.zza(new com.google.android.gms.internal.firebase-auth-api.zzio(), com.google.android.gms.internal.firebase-auth-api.zzgb, com.google.android.gms.internal.firebase-auth-api.zzqb);
        com.google.android.gms.internal.firebase-auth-api.zzij.zze = com.google.android.gms.internal.firebase-auth-api.zznt.zza(new com.google.android.gms.internal.firebase-auth-api.zzin(), v0_1, com.google.android.gms.internal.firebase-auth-api.zzqb);
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzgb zza(com.google.android.gms.internal.firebase-auth-api.zzqb p0, com.google.android.gms.internal.firebase-auth-api.zzch p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzij.zzb(p0, p1);
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzge$zza zza(com.google.android.gms.internal.firebase-auth-api.zzxz p2)
    {
        java.security.GeneralSecurityException v0_3 = com.google.android.gms.internal.firebase-auth-api.zziq.zza[p2.ordinal()];
        if (v0_3 == 1) {
            return com.google.android.gms.internal.firebase-auth-api.zzge$zza.zza;
        } else {
            if ((v0_3 == 2) || (v0_3 == 3)) {
                return com.google.android.gms.internal.firebase-auth-api.zzge$zza.zzb;
            } else {
                if (v0_3 != 4) {
                    throw new java.security.GeneralSecurityException(g2.g.c(p2.zza(), "Unable to parse OutputPrefixType: "));
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzge$zza.zzc;
                }
            }
        }
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzge zza(com.google.android.gms.internal.firebase-auth-api.zzqe p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzij.zzb(p0);
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqb zza(com.google.android.gms.internal.firebase-auth-api.zzgb p3, com.google.android.gms.internal.firebase-auth-api.zzch p4)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqb.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((com.google.android.gms.internal.firebase-auth-api.zzyo) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzyo.zzb().zza(com.google.android.gms.internal.firebase-auth-api.zzajv.zza(p3.zze().zza(com.google.android.gms.internal.firebase-auth-api.zzch.zza(p4)))).zze())).zzj(), com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzb, com.google.android.gms.internal.firebase-auth-api.zzij.zza(((com.google.android.gms.internal.firebase-auth-api.zzge) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzb()), p3.zzb());
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqe zza(com.google.android.gms.internal.firebase-auth-api.zzge p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqe.zzb(((com.google.android.gms.internal.firebase-auth-api.zzxb) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxb.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(com.google.android.gms.internal.firebase-auth-api.zzyr.zzc().zzj()).zza(com.google.android.gms.internal.firebase-auth-api.zzij.zza(p2.zzb())).zze())));
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzxz zza(com.google.android.gms.internal.firebase-auth-api.zzge$zza p2)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzge$zza.zza.equals(p2)) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzge$zza.zzb.equals(p2)) {
                if (!com.google.android.gms.internal.firebase-auth-api.zzge$zza.zzc.equals(p2)) {
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
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzij.zzb);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzij.zzc);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzij.zzd);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzij.zze);
        return;
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzgb zzb(com.google.android.gms.internal.firebase-auth-api.zzqb p2, com.google.android.gms.internal.firebase-auth-api.zzch p3)
    {
        if (!p2.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        } else {
            try {
                byte[] v0_2 = com.google.android.gms.internal.firebase-auth-api.zzyo.zza(p2.zzd(), com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            } catch (com.google.android.gms.internal.firebase-auth-api.zzall) {
                throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
            if (v0_2.zza() != 0) {
                throw new java.security.GeneralSecurityException("Only version 0 keys are accepted");
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzgb.zza(com.google.android.gms.internal.firebase-auth-api.zzij.zza(p2.zzb()), com.google.android.gms.internal.firebase-auth-api.zzaal.zza(v0_2.zzd().zzd(), com.google.android.gms.internal.firebase-auth-api.zzch.zza(p3)), p2.zze());
            }
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzge zzb(com.google.android.gms.internal.firebase-auth-api.zzqe p2)
    {
        if (!p2.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException(g2.g.l("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", p2.zza().zzf()));
        } else {
            try {
                if (com.google.android.gms.internal.firebase-auth-api.zzyr.zza(p2.zza().zze(), com.google.android.gms.internal.firebase-auth-api.zzaku.zza()).zza() != 0) {
                    throw new java.security.GeneralSecurityException("Only version 0 parameters are accepted");
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zzge.zza(com.google.android.gms.internal.firebase-auth-api.zzij.zza(p2.zza().zzd()));
                }
            } catch (java.security.GeneralSecurityException v2_4) {
                throw new java.security.GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", v2_4);
            }
        }
    }
}
