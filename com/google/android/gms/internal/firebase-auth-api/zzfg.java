package com.google.android.gms.internal.firebase-auth-api;
public final class zzfg {
    private static final com.google.android.gms.internal.firebase-auth-api.zzaaj zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzph zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzpd zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zznx zzd;
    private static final com.google.android.gms.internal.firebase-auth-api.zznt zze;

    static zzfg()
    {
        com.google.android.gms.internal.firebase-auth-api.zznt v0_1 = com.google.android.gms.internal.firebase-auth-api.zzqn.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        com.google.android.gms.internal.firebase-auth-api.zzfg.zza = v0_1;
        com.google.android.gms.internal.firebase-auth-api.zzfg.zzb = com.google.android.gms.internal.firebase-auth-api.zzph.zza(new com.google.android.gms.internal.firebase-auth-api.zzff(), com.google.android.gms.internal.firebase-auth-api.zzfc, com.google.android.gms.internal.firebase-auth-api.zzqe);
        com.google.android.gms.internal.firebase-auth-api.zzfg.zzc = com.google.android.gms.internal.firebase-auth-api.zzpd.zza(new com.google.android.gms.internal.firebase-auth-api.zzfi(), v0_1, com.google.android.gms.internal.firebase-auth-api.zzqe);
        com.google.android.gms.internal.firebase-auth-api.zzfg.zzd = com.google.android.gms.internal.firebase-auth-api.zznx.zza(new com.google.android.gms.internal.firebase-auth-api.zzfh(), com.google.android.gms.internal.firebase-auth-api.zzfd, com.google.android.gms.internal.firebase-auth-api.zzqb);
        com.google.android.gms.internal.firebase-auth-api.zzfg.zze = com.google.android.gms.internal.firebase-auth-api.zznt.zza(new com.google.android.gms.internal.firebase-auth-api.zzfk(), v0_1, com.google.android.gms.internal.firebase-auth-api.zzqb);
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzfc zza(com.google.android.gms.internal.firebase-auth-api.zzqe p0)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzfg.zzb(p0);
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzfc zza(com.google.android.gms.internal.firebase-auth-api.zzxw p5, com.google.android.gms.internal.firebase-auth-api.zzxz p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zzfc$zza v1_9;
        String v0_7 = com.google.android.gms.internal.firebase-auth-api.zzcj.zza(((com.google.android.gms.internal.firebase-auth-api.zzxb) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxb.zza().zza(p5.zza().zzf()).zza(p5.zza().zze()).zza(com.google.android.gms.internal.firebase-auth-api.zzxz.zzd).zze())).zzk());
        if (!(v0_7 instanceof com.google.android.gms.internal.firebase-auth-api.zzdx)) {
            if (!(v0_7 instanceof com.google.android.gms.internal.firebase-auth-api.zzem)) {
                if (!(v0_7 instanceof com.google.android.gms.internal.firebase-auth-api.zzge)) {
                    if (!(v0_7 instanceof com.google.android.gms.internal.firebase-auth-api.zzdi)) {
                        if (!(v0_7 instanceof com.google.android.gms.internal.firebase-auth-api.zzdq)) {
                            if (!(v0_7 instanceof com.google.android.gms.internal.firebase-auth-api.zzeg)) {
                                throw new java.security.GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(String.valueOf(v0_7)));
                            } else {
                                v1_9 = com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzf;
                            }
                        } else {
                            v1_9 = com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zze;
                        }
                    } else {
                        v1_9 = com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzd;
                    }
                } else {
                    v1_9 = com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzb;
                }
            } else {
                v1_9 = com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zzc;
            }
        } else {
            v1_9 = com.google.android.gms.internal.firebase-auth-api.zzfc$zza.zza;
        }
        String v6_3;
        com.google.android.gms.internal.firebase-auth-api.zzfc$zzb v2_1 = new com.google.android.gms.internal.firebase-auth-api.zzfc$zzb(0);
        int v3_2 = com.google.android.gms.internal.firebase-auth-api.zzfj.zza[p6.ordinal()];
        if (v3_2 == 1) {
            v6_3 = com.google.android.gms.internal.firebase-auth-api.zzfc$zzc.zza;
        } else {
            if (v3_2 != 2) {
                throw new java.security.GeneralSecurityException(g2.g.c(p6.zza(), "Unable to parse OutputPrefixType: "));
            } else {
                v6_3 = com.google.android.gms.internal.firebase-auth-api.zzfc$zzc.zzb;
            }
        }
        return v2_1.zza(v6_3).zza(p5.zze()).zza(((com.google.android.gms.internal.firebase-auth-api.zzcy) v0_7)).zza(v1_9).zza();
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzfd zza(com.google.android.gms.internal.firebase-auth-api.zzqb p0, com.google.android.gms.internal.firebase-auth-api.zzch p1)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzfg.zzb(p0, p1);
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqb zza(com.google.android.gms.internal.firebase-auth-api.zzfd p3, com.google.android.gms.internal.firebase-auth-api.zzch p4)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqb.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((com.google.android.gms.internal.firebase-auth-api.zzxt) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxt.zzb().zza(com.google.android.gms.internal.firebase-auth-api.zzfg.zzb(((com.google.android.gms.internal.firebase-auth-api.zzfc) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())))).zze())).zzj(), com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zze, com.google.android.gms.internal.firebase-auth-api.zzfg.zza(((com.google.android.gms.internal.firebase-auth-api.zzfc) ((com.google.android.gms.internal.firebase-auth-api.zzcy) p3.zza())).zzc()), p3.zzb());
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzqe zza(com.google.android.gms.internal.firebase-auth-api.zzfc p2)
    {
        return com.google.android.gms.internal.firebase-auth-api.zzqe.zzb(((com.google.android.gms.internal.firebase-auth-api.zzxb) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxb.zza().zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zza(com.google.android.gms.internal.firebase-auth-api.zzfg.zzb(p2).zzj()).zza(com.google.android.gms.internal.firebase-auth-api.zzfg.zza(p2.zzc())).zze())));
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzxz zza(com.google.android.gms.internal.firebase-auth-api.zzfc$zzc p2)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzfc$zzc.zza.equals(p2)) {
            if (!com.google.android.gms.internal.firebase-auth-api.zzfc$zzc.zzb.equals(p2)) {
                throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(p2)));
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzxz.zzd;
            }
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzxz.zzb;
        }
    }

    public static void zza()
    {
        com.google.android.gms.internal.firebase-auth-api.zzoz v0 = com.google.android.gms.internal.firebase-auth-api.zzoz.zza();
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzfg.zzb);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzfg.zzc);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzfg.zzd);
        v0.zza(com.google.android.gms.internal.firebase-auth-api.zzfg.zze);
        return;
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzfc zzb(com.google.android.gms.internal.firebase-auth-api.zzqe p2)
    {
        if (!p2.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException(g2.g.l("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", p2.zza().zzf()));
        } else {
            try {
                return com.google.android.gms.internal.firebase-auth-api.zzfg.zza(com.google.android.gms.internal.firebase-auth-api.zzxw.zza(p2.zza().zze(), com.google.android.gms.internal.firebase-auth-api.zzaku.zza()), p2.zza().zzd());
            } catch (com.google.android.gms.internal.firebase-auth-api.zzall v2_7) {
                throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", v2_7);
            }
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzfd zzb(com.google.android.gms.internal.firebase-auth-api.zzqb p2, com.google.android.gms.internal.firebase-auth-api.zzch p3)
    {
        if (!p2.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        } else {
            try {
                String v0_1 = com.google.android.gms.internal.firebase-auth-api.zzxt.zza(p2.zzd(), com.google.android.gms.internal.firebase-auth-api.zzaku.zza());
            } catch (java.security.GeneralSecurityException v2_5) {
                throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", v2_5);
            }
            if (v0_1.zza() != 0) {
                throw new java.security.GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(v0_1)));
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzfd.zza(com.google.android.gms.internal.firebase-auth-api.zzfg.zza(v0_1.zzd(), p2.zzb()), p2.zze());
            }
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzxw zzb(com.google.android.gms.internal.firebase-auth-api.zzfc p2)
    {
        try {
            return ((com.google.android.gms.internal.firebase-auth-api.zzxw) ((com.google.android.gms.internal.firebase-auth-api.zzalf) com.google.android.gms.internal.firebase-auth-api.zzxw.zzb().zza(p2.zzd()).zza(com.google.android.gms.internal.firebase-auth-api.zzxb.zza(com.google.android.gms.internal.firebase-auth-api.zzcj.zza(p2.zzb()), com.google.android.gms.internal.firebase-auth-api.zzaku.zza())).zze()));
        } catch (com.google.android.gms.internal.firebase-auth-api.zzall v2_7) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", v2_7);
        }
    }
}
