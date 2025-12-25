package com.google.android.gms.internal.firebase-auth-api;
public final class zzmg {
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zza;
    private static final com.google.android.gms.internal.firebase-auth-api.zzps zzb;
    private static final com.google.android.gms.internal.firebase-auth-api.zzcd zzc;
    private static final com.google.android.gms.internal.firebase-auth-api.zzbh zzd;
    private static final com.google.android.gms.internal.firebase-auth-api.zzor zze;

    static zzmg()
    {
        com.google.android.gms.internal.firebase-auth-api.zzmg.zza = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzmj(), com.google.android.gms.internal.firebase-auth-api.zzki, com.google.android.gms.internal.firebase-auth-api.zzbd);
        com.google.android.gms.internal.firebase-auth-api.zzmg.zzb = com.google.android.gms.internal.firebase-auth-api.zzps.zza(new com.google.android.gms.internal.firebase-auth-api.zzmi(), com.google.android.gms.internal.firebase-auth-api.zzkq, com.google.android.gms.internal.firebase-auth-api.zzbg);
        com.google.android.gms.internal.firebase-auth-api.zzmg.zzc = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", com.google.android.gms.internal.firebase-auth-api.zzbd, com.google.android.gms.internal.firebase-auth-api.zzwr.zzf());
        com.google.android.gms.internal.firebase-auth-api.zzmg.zzd = com.google.android.gms.internal.firebase-auth-api.zzod.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", com.google.android.gms.internal.firebase-auth-api.zzbg, com.google.android.gms.internal.firebase-auth-api.zzwx$zzb.zzd, com.google.android.gms.internal.firebase-auth-api.zzwu.zzg());
        com.google.android.gms.internal.firebase-auth-api.zzmg.zze = new com.google.android.gms.internal.firebase-auth-api.zzml();
        return;
    }

    public static synthetic com.google.android.gms.internal.firebase-auth-api.zzki zza(com.google.android.gms.internal.firebase-auth-api.zzkg p9, Integer p10)
    {
        int v0_5;
        com.google.android.gms.internal.firebase-auth-api.zzaal v1_5;
        if (!p9.zze().equals(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzd)) {
            if ((!p9.zze().equals(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza)) && ((!p9.zze().equals(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb)) && (!p9.zze().equals(com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc)))) {
                throw new java.security.GeneralSecurityException("Unknown KEM ID");
            } else {
                byte[] v4_0;
                int v0_12 = com.google.android.gms.internal.firebase-auth-api.zzmk.zzc(p9.zze());
                com.google.android.gms.internal.firebase-auth-api.zzaal v1_10 = com.google.android.gms.internal.firebase-auth-api.zzzf.zza(com.google.android.gms.internal.firebase-auth-api.zzzf.zza(v0_12));
                int v2_7 = com.google.android.gms.internal.firebase-auth-api.zzzh.zza;
                byte[] v3_4 = ((java.security.interfaces.ECPublicKey) v1_10.getPublic()).getW();
                int v0_15 = com.google.android.gms.internal.firebase-auth-api.zzzf.zza(v0_12).getCurve();
                com.google.android.gms.internal.firebase-auth-api.zznj.zza(v3_4, v0_15);
                int v0_16 = com.google.android.gms.internal.firebase-auth-api.zzzf.zza(v0_15);
                byte[] v4_1 = v2_7.ordinal();
                if (v4_1 == null) {
                    int v2_9 = ((v0_16 * 2) + 1);
                    v4_0 = new byte[v2_9];
                    int v7_9 = com.google.android.gms.internal.firebase-auth-api.zzne.zza(v3_4.getAffineX());
                    byte[] v3_6 = com.google.android.gms.internal.firebase-auth-api.zzne.zza(v3_4.getAffineY());
                    System.arraycopy(v3_6, 0, v4_0, (v2_9 - v3_6.length), v3_6.length);
                    System.arraycopy(v7_9, 0, v4_0, ((v0_16 + 1) - v7_9.length), v7_9.length);
                    v4_0[0] = 4;
                } else {
                    int v7_10 = 2;
                    if (v4_1 == 1) {
                        int v0_21 = (v0_16 + 1);
                        v4_0 = new byte[v0_21];
                        int v2_14 = com.google.android.gms.internal.firebase-auth-api.zzne.zza(v3_4.getAffineX());
                        System.arraycopy(v2_14, 0, v4_0, (v0_21 - v2_14.length), v2_14.length);
                        if (v3_4.getAffineY().testBit(0)) {
                            v7_10 = 3;
                        }
                        v4_0[0] = ((byte) v7_10);
                    } else {
                        if (v4_1 != 2) {
                            throw new java.security.GeneralSecurityException("invalid format:".concat(String.valueOf(v2_7)));
                        } else {
                            int v2_0 = (v0_16 * 2);
                            v4_0 = new byte[v2_0];
                            byte[] v5_1 = com.google.android.gms.internal.firebase-auth-api.zzne.zza(v3_4.getAffineX());
                            if (v5_1.length > v0_16) {
                                v5_1 = java.util.Arrays.copyOfRange(v5_1, (v5_1.length - v0_16), v5_1.length);
                            }
                            byte[] v3_1 = com.google.android.gms.internal.firebase-auth-api.zzne.zza(v3_4.getAffineY());
                            if (v3_1.length > v0_16) {
                                v3_1 = java.util.Arrays.copyOfRange(v3_1, (v3_1.length - v0_16), v3_1.length);
                            }
                            System.arraycopy(v3_1, 0, v4_0, (v2_0 - v3_1.length), v3_1.length);
                            System.arraycopy(v5_1, 0, v4_0, (v0_16 - v5_1.length), v5_1.length);
                        }
                    }
                }
                v0_5 = com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(v4_0);
                v1_5 = com.google.android.gms.internal.firebase-auth-api.zzaal.zza(com.google.android.gms.internal.firebase-auth-api.zzne.zza(((java.security.interfaces.ECPrivateKey) v1_10.getPrivate()).getS(), com.google.android.gms.internal.firebase-auth-api.zzmk.zza(p9.zze())), com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
            }
        } else {
            int v0_6 = com.google.android.gms.internal.firebase-auth-api.zzaah.zza();
            v1_5 = com.google.android.gms.internal.firebase-auth-api.zzaal.zza(v0_6, com.google.android.gms.internal.firebase-auth-api.zzbf.zza());
            v0_5 = com.google.android.gms.internal.firebase-auth-api.zzaaj.zza(com.google.android.gms.internal.firebase-auth-api.zzaah.zza(v0_6));
        }
        return com.google.android.gms.internal.firebase-auth-api.zzki.zza(com.google.android.gms.internal.firebase-auth-api.zzkq.zza(p9, v0_5, p10), v1_5);
    }

    public static void zza(boolean p10)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza.zza()) {
            throw new java.security.GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzkl.zza();
            java.security.GeneralSecurityException v10_1 = com.google.android.gms.internal.firebase-auth-api.zzox.zza();
            String v0_1 = new java.util.HashMap();
            String v2_0 = com.google.android.gms.internal.firebase-auth-api.zzkg$zze.zza;
            com.google.android.gms.internal.firebase-auth-api.zzkg$zzf v3_4 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzd;
            com.google.android.gms.internal.firebase-auth-api.zzkg$zzc v4_1 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzc.zza;
            String v5_0 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzb.zza;
            v0_1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v2_0).zza(v3_4).zza(v4_1).zza(v5_0).zza());
            com.google.android.gms.internal.firebase-auth-api.zzkg$zze v6_1 = com.google.android.gms.internal.firebase-auth-api.zzkg$zze.zzc;
            v0_1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v6_1).zza(v3_4).zza(v4_1).zza(v5_0).zza());
            com.google.android.gms.internal.firebase-auth-api.zzkg$zzb v7_1 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzb.zzb;
            v0_1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v2_0).zza(v3_4).zza(v4_1).zza(v7_1).zza());
            v0_1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v6_1).zza(v3_4).zza(v4_1).zza(v7_1).zza());
            String v8_9 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzb.zzc;
            v0_1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v2_0).zza(v3_4).zza(v4_1).zza(v8_9).zza());
            v0_1.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v6_1).zza(v3_4).zza(v4_1).zza(v8_9).zza());
            com.google.android.gms.internal.firebase-auth-api.zzkg$zzf v3_1 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zza;
            v0_1.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v2_0).zza(v3_1).zza(v4_1).zza(v5_0).zza());
            v0_1.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v6_1).zza(v3_1).zza(v4_1).zza(v5_0).zza());
            v0_1.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v2_0).zza(v3_1).zza(v4_1).zza(v7_1).zza());
            v0_1.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v6_1).zza(v3_1).zza(v4_1).zza(v7_1).zza());
            com.google.android.gms.internal.firebase-auth-api.zzkg$zzf v3_3 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzb;
            com.google.android.gms.internal.firebase-auth-api.zzkg$zzc v4_0 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzc.zzb;
            v0_1.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v2_0).zza(v3_3).zza(v4_0).zza(v5_0).zza());
            v0_1.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v6_1).zza(v3_3).zza(v4_0).zza(v5_0).zza());
            v0_1.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v2_0).zza(v3_3).zza(v4_0).zza(v7_1).zza());
            v0_1.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v6_1).zza(v3_3).zza(v4_0).zza(v7_1).zza());
            com.google.android.gms.internal.firebase-auth-api.zzkg$zzf v3_6 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzf.zzc;
            com.google.android.gms.internal.firebase-auth-api.zzkg$zzc v4_2 = com.google.android.gms.internal.firebase-auth-api.zzkg$zzc.zzc;
            v0_1.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v2_0).zza(v3_6).zza(v4_2).zza(v5_0).zza());
            v0_1.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v6_1).zza(v3_6).zza(v4_2).zza(v5_0).zza());
            v0_1.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v2_0).zza(v3_6).zza(v4_2).zza(v7_1).zza());
            v0_1.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", com.google.android.gms.internal.firebase-auth-api.zzkg.zzc().zza(v6_1).zza(v3_6).zza(v4_2).zza(v7_1).zza());
            v10_1.zza(java.util.Collections.unmodifiableMap(v0_1));
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzmg.zza);
            com.google.android.gms.internal.firebase-auth-api.zzpa.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzmg.zzb);
            com.google.android.gms.internal.firebase-auth-api.zzop.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzmg.zze, com.google.android.gms.internal.firebase-auth-api.zzkg);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzmg.zzc, 1);
            com.google.android.gms.internal.firebase-auth-api.zznq.zza().zza(com.google.android.gms.internal.firebase-auth-api.zzmg.zzd, 0);
            return;
        }
    }
}
