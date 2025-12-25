package com.google.android.gms.internal.firebase-auth-api;
public final class zzzf {

    public static int zza(java.security.spec.EllipticCurve p1)
    {
        return ((com.google.android.gms.internal.firebase-auth-api.zznj.zza(p1).subtract(java.math.BigInteger.ONE).bitLength() + 7) / 8);
    }

    private static java.math.BigInteger zza(java.math.BigInteger p10, boolean p11, java.security.spec.EllipticCurve p12)
    {
        java.math.BigInteger v0 = com.google.android.gms.internal.firebase-auth-api.zznj.zza(p12);
        java.security.InvalidAlgorithmParameterException v10_7 = p10.multiply(p10).add(p12.getA()).multiply(p10).add(p12.getB()).mod(v0);
        if (v0.signum() != 1) {
            throw new java.security.InvalidAlgorithmParameterException("p must be positive");
        } else {
            java.security.InvalidAlgorithmParameterException v10_16 = v10_7.mod(v0);
            java.math.BigInteger v12_1 = java.math.BigInteger.ZERO;
            if (!v10_16.equals(v12_1)) {
                if ((!v0.testBit(0)) || (!v0.testBit(1))) {
                    if ((!v0.testBit(0)) || (v0.testBit(1))) {
                        v12_1 = 0;
                    } else {
                        v12_1 = java.math.BigInteger.ONE;
                        int v4_2 = v0.subtract(v12_1).shiftRight(1);
                        java.math.BigInteger v5_1 = 0;
                        do {
                            boolean v6_6 = v12_1.multiply(v12_1).subtract(v10_16).mod(v0);
                            if (!v6_6.equals(java.math.BigInteger.ZERO)) {
                                java.math.BigInteger v7_6 = v6_6.modPow(v4_2, v0);
                                java.math.BigInteger v8_0 = java.math.BigInteger.ONE;
                                if (v7_6.add(v8_0).equals(v0)) {
                                    java.math.BigInteger v1_4 = v0.add(v8_0).shiftRight(1);
                                    int v4_0 = (v1_4.bitLength() - 2);
                                    java.math.BigInteger v2_2 = v12_1;
                                    while (v4_0 >= 0) {
                                        java.math.BigInteger v5_2 = v2_2.multiply(v8_0);
                                        v2_2 = v2_2.multiply(v2_2).add(v8_0.multiply(v8_0).mod(v0).multiply(v6_6)).mod(v0);
                                        java.math.BigInteger v5_4 = v5_2.add(v5_2).mod(v0);
                                        if (!v1_4.testBit(v4_0)) {
                                            v8_0 = v5_4;
                                        } else {
                                            v8_0 = v12_1.multiply(v5_4).add(v2_2).mod(v0);
                                            v2_2 = v2_2.multiply(v12_1).add(v5_4.multiply(v6_6)).mod(v0);
                                        }
                                        v4_0--;
                                    }
                                    v12_1 = v2_2;
                                } else {
                                    if (!v7_6.equals(v8_0)) {
                                        throw new java.security.InvalidAlgorithmParameterException("p is not prime");
                                    } else {
                                        v12_1 = v12_1.add(v8_0);
                                        v5_1++;
                                    }
                                }
                            } else {
                                if (p11 == v12_1.testBit(0)) {
                                    return v12_1;
                                } else {
                                    return v0.subtract(v12_1).mod(v0);
                                }
                            }
                        } while((v5_1 == 128) && (!v0.isProbablePrime(80)));
                        throw new java.security.InvalidAlgorithmParameterException("p is not prime");
                    }
                } else {
                    v12_1 = v10_16.modPow(v0.add(java.math.BigInteger.ONE).shiftRight(2), v0);
                }
                if ((v12_1 != null) && (v12_1.multiply(v12_1).mod(v0).compareTo(v10_16) != 0)) {
                    throw new java.security.GeneralSecurityException("Could not find a modular square root");
                }
            }
        }
    }

    public static java.security.KeyPair zza(java.security.spec.ECParameterSpec p2)
    {
        java.security.KeyPairGenerator v0_2 = ((java.security.KeyPairGenerator) com.google.android.gms.internal.firebase-auth-api.zzzj.zzd.zza("EC"));
        v0_2.initialize(p2);
        return v0_2.generateKeyPair();
    }

    public static java.security.interfaces.ECPrivateKey zza(com.google.android.gms.internal.firebase-auth-api.zzzi p1, byte[] p2)
    {
        return ((java.security.interfaces.ECPrivateKey) ((java.security.KeyFactory) com.google.android.gms.internal.firebase-auth-api.zzzj.zze.zza("EC")).generatePrivate(new java.security.spec.ECPrivateKeySpec(com.google.android.gms.internal.firebase-auth-api.zzne.zza(p2), com.google.android.gms.internal.firebase-auth-api.zzzf.zza(p1))));
    }

    public static java.security.interfaces.ECPublicKey zza(java.security.spec.ECParameterSpec p1, com.google.android.gms.internal.firebase-auth-api.zzzh p2, byte[] p3)
    {
        return ((java.security.interfaces.ECPublicKey) ((java.security.KeyFactory) com.google.android.gms.internal.firebase-auth-api.zzzj.zze.zza("EC")).generatePublic(new java.security.spec.ECPublicKeySpec(com.google.android.gms.internal.firebase-auth-api.zzzf.zza(p1.getCurve(), p2, p3), p1)));
    }

    public static java.security.spec.ECParameterSpec zza(com.google.android.gms.internal.firebase-auth-api.zzzi p2)
    {
        java.security.NoSuchAlgorithmException v0_0 = p2.ordinal();
        if (v0_0 == null) {
            return com.google.android.gms.internal.firebase-auth-api.zznj.zza;
        } else {
            if (v0_0 == 1) {
                return com.google.android.gms.internal.firebase-auth-api.zznj.zzb;
            } else {
                if (v0_0 != 2) {
                    throw new java.security.NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(p2)));
                } else {
                    return com.google.android.gms.internal.firebase-auth-api.zznj.zzc;
                }
            }
        }
    }

    public static java.security.spec.ECPoint zza(java.security.spec.EllipticCurve p6, com.google.android.gms.internal.firebase-auth-api.zzzh p7, byte[] p8)
    {
        java.math.BigInteger v0_0 = com.google.android.gms.internal.firebase-auth-api.zzzf.zza(p6);
        int v1_5 = p7.ordinal();
        int v3 = 0;
        if (v1_5 == 0) {
            if (p8.length != ((v0_0 * 2) + 1)) {
                throw new java.security.GeneralSecurityException("invalid point size");
            } else {
                if (p8[0] != 4) {
                    throw new java.security.GeneralSecurityException("invalid point format");
                } else {
                    java.math.BigInteger v0_1 = (v0_0 + 1);
                    int v8_5 = new java.security.spec.ECPoint(new java.math.BigInteger(1, java.util.Arrays.copyOfRange(p8, 1, v0_1)), new java.math.BigInteger(1, java.util.Arrays.copyOfRange(p8, v0_1, p8.length)));
                    com.google.android.gms.internal.firebase-auth-api.zznj.zza(v8_5, p6);
                    return v8_5;
                }
            }
        } else {
            if (v1_5 == 1) {
                java.security.spec.ECPoint v7_5 = com.google.android.gms.internal.firebase-auth-api.zznj.zza(p6);
                if (p8.length != (v0_0 + 1)) {
                    throw new java.security.GeneralSecurityException("compressed point has wrong length");
                } else {
                    java.math.BigInteger v0_3 = p8[0];
                    if (v0_3 != 2) {
                        if (v0_3 != 3) {
                            throw new java.security.GeneralSecurityException("invalid format");
                        } else {
                            v3 = 1;
                        }
                    }
                    java.math.BigInteger v0_5 = new java.math.BigInteger(1, java.util.Arrays.copyOfRange(p8, 1, p8.length));
                    if ((v0_5.signum() == -1) || (v0_5.compareTo(v7_5) >= 0)) {
                        throw new java.security.GeneralSecurityException("x is out of range");
                    } else {
                        return new java.security.spec.ECPoint(v0_5, com.google.android.gms.internal.firebase-auth-api.zzzf.zza(v0_5, v3, p6));
                    }
                }
            } else {
                if (v1_5 != 2) {
                    throw new java.security.GeneralSecurityException("invalid format:".concat(String.valueOf(p7)));
                } else {
                    if (p8.length != (v0_0 * 2)) {
                        throw new java.security.GeneralSecurityException("invalid point size");
                    } else {
                        int v8_2 = new java.security.spec.ECPoint(new java.math.BigInteger(1, java.util.Arrays.copyOf(p8, v0_0)), new java.math.BigInteger(1, java.util.Arrays.copyOfRange(p8, v0_0, p8.length)));
                        com.google.android.gms.internal.firebase-auth-api.zznj.zza(v8_2, p6);
                        return v8_2;
                    }
                }
            }
        }
    }

    public static byte[] zza(java.security.interfaces.ECPrivateKey p2, java.security.interfaces.ECPublicKey p3)
    {
        try {
            if (!com.google.android.gms.internal.firebase-auth-api.zznj.zza(p3.getParams(), p2.getParams())) {
                throw new java.security.GeneralSecurityException("invalid public key spec");
            } else {
                return com.google.android.gms.internal.firebase-auth-api.zzzf.zza(p2, p3.getW());
            }
        } catch (java.security.GeneralSecurityException v2_1) {
            throw new java.security.GeneralSecurityException(v2_1);
        }
    }

    private static byte[] zza(java.security.interfaces.ECPrivateKey p4, java.security.spec.ECPoint p5)
    {
        com.google.android.gms.internal.firebase-auth-api.zznj.zza(p5, p4.getParams().getCurve());
        String v5_3 = ((java.security.KeyFactory) com.google.android.gms.internal.firebase-auth-api.zzzj.zze.zza("EC")).generatePublic(new java.security.spec.ECPublicKeySpec(p5, p4.getParams()));
        java.math.BigInteger v0_4 = ((javax.crypto.KeyAgreement) com.google.android.gms.internal.firebase-auth-api.zzzj.zzc.zza("ECDH"));
        v0_4.init(p4);
        try {
            v0_4.doPhase(v5_3, 1);
            String v5_4 = v0_4.generateSecret();
            java.security.GeneralSecurityException v4_2 = p4.getParams().getCurve();
            java.math.BigInteger v0_7 = new java.math.BigInteger(1, v5_4);
        } catch (java.security.GeneralSecurityException v4_5) {
            throw new java.security.GeneralSecurityException(v4_5);
        }
        if ((v0_7.signum() == -1) || (v0_7.compareTo(com.google.android.gms.internal.firebase-auth-api.zznj.zza(v4_2)) >= 0)) {
            throw new java.security.GeneralSecurityException("shared secret is out of range");
        } else {
            com.google.android.gms.internal.firebase-auth-api.zzzf.zza(v0_7, 1, v4_2);
            return v5_4;
        }
    }
}
