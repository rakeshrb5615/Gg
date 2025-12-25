package com.google.android.gms.internal.firebase-auth-api;
public final class zzze implements com.google.android.gms.internal.firebase-auth-api.zzbg {
    static final com.google.android.gms.internal.firebase-auth-api.zznl zza;
    static final com.google.android.gms.internal.firebase-auth-api.zznl zzb;

    static zzze()
    {
        com.google.android.gms.internal.firebase-auth-api.zzze.zza = com.google.android.gms.internal.firebase-auth-api.zznl.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzzi.zza, com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zza).zza(com.google.android.gms.internal.firebase-auth-api.zzzi.zzb, com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzb).zza(com.google.android.gms.internal.firebase-auth-api.zzzi.zzc, com.google.android.gms.internal.firebase-auth-api.zzkb$zzc.zzc).zza();
        com.google.android.gms.internal.firebase-auth-api.zzze.zzb = com.google.android.gms.internal.firebase-auth-api.zznl.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzzh.zza, com.google.android.gms.internal.firebase-auth-api.zzkb$zze.zzb).zza(com.google.android.gms.internal.firebase-auth-api.zzzh.zzb, com.google.android.gms.internal.firebase-auth-api.zzkb$zze.zza).zza(com.google.android.gms.internal.firebase-auth-api.zzzh.zzc, com.google.android.gms.internal.firebase-auth-api.zzkb$zze.zzc).zza();
        return;
    }

    private zzze(java.security.interfaces.ECPublicKey p1, byte[] p2, String p3, com.google.android.gms.internal.firebase-auth-api.zzzh p4, com.google.android.gms.internal.firebase-auth-api.zzlr p5, byte[] p6)
    {
        com.google.android.gms.internal.firebase-auth-api.zznj.zza(p1.getW(), p1.getParams().getCurve());
        new com.google.android.gms.internal.firebase-auth-api.zzzg(p1);
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzbg zza(com.google.android.gms.internal.firebase-auth-api.zzkh p8)
    {
        com.google.android.gms.internal.firebase-auth-api.zzkb v0_22 = ((com.google.android.gms.internal.firebase-auth-api.zzzi) com.google.android.gms.internal.firebase-auth-api.zzze.zza.zza(((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p8.zza())).zzd()));
        com.google.android.gms.internal.firebase-auth-api.zzze v1_2 = p8.zzf().getAffineX().toByteArray();
        java.security.interfaces.ECPublicKey v2_2 = p8.zzf().getAffineY().toByteArray();
        com.google.android.gms.internal.firebase-auth-api.zzkb v0_1 = com.google.android.gms.internal.firebase-auth-api.zzzf.zza(v0_22);
        java.security.interfaces.ECPublicKey v2_4 = new java.security.spec.ECPoint(new java.math.BigInteger(1, v1_2), new java.math.BigInteger(1, v2_2));
        com.google.android.gms.internal.firebase-auth-api.zznj.zza(v2_4, v0_1.getCurve());
        java.security.interfaces.ECPublicKey v2_7 = ((java.security.interfaces.ECPublicKey) ((java.security.KeyFactory) com.google.android.gms.internal.firebase-auth-api.zzzj.zze.zza("EC")).generatePublic(new java.security.spec.ECPublicKeySpec(v2_4, v0_1)));
        com.google.android.gms.internal.firebase-auth-api.zzkb v0_7 = new byte[0];
        if (((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p8.zza())).zzh() != null) {
            v0_7 = ((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p8.zza())).zzh().zzb();
        }
        return new com.google.android.gms.internal.firebase-auth-api.zzze(v2_7, v0_7, com.google.android.gms.internal.firebase-auth-api.zzze.zza(((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p8.zza())).zze()), ((com.google.android.gms.internal.firebase-auth-api.zzzh) com.google.android.gms.internal.firebase-auth-api.zzze.zzb.zza(((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p8.zza())).zzf())), com.google.android.gms.internal.firebase-auth-api.zzln.zza(((com.google.android.gms.internal.firebase-auth-api.zzkb) ((com.google.android.gms.internal.firebase-auth-api.zzlg) p8.zza()))), p8.zzd().zzb());
    }

    public static final String zza(com.google.android.gms.internal.firebase-auth-api.zzkb$zzb p2)
    {
        if (!p2.equals(com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zza)) {
            if (!p2.equals(com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zzb)) {
                if (!p2.equals(com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zzc)) {
                    if (!p2.equals(com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zzd)) {
                        if (!p2.equals(com.google.android.gms.internal.firebase-auth-api.zzkb$zzb.zze)) {
                            throw new java.security.GeneralSecurityException("hash unsupported for EciesAeadHkdf: ".concat(String.valueOf(p2)));
                        } else {
                            return "HmacSha512";
                        }
                    } else {
                        return "HmacSha384";
                    }
                } else {
                    return "HmacSha256";
                }
            } else {
                return "HmacSha224";
            }
        } else {
            return "HmacSha1";
        }
    }
}
