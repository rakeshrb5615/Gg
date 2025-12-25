package com.google.android.gms.internal.firebase-auth-api;
public final class zznj {
    public static final java.security.spec.ECParameterSpec zza;
    public static final java.security.spec.ECParameterSpec zzb;
    public static final java.security.spec.ECParameterSpec zzc;
    private static final java.math.BigInteger zzd;
    private static final java.math.BigInteger zze;
    private static final java.math.BigInteger zzf;
    private static final java.math.BigInteger zzg;

    static zznj()
    {
        com.google.android.gms.internal.firebase-auth-api.zznj.zza = com.google.android.gms.internal.firebase-auth-api.zznj.zza("115792089210356248762697446949407573530086143415290314195533631308867097853951", "115792089210356248762697446949407573529996955224135760342422259061068512044369", "5ac635d8aa3a93e7b3ebbd55769886bc651d06b0cc53b0f63bce3c3e27d2604b", "6b17d1f2e12c4247f8bce6e563a440f277037d812deb33a0f4a13945d898c296", "4fe342e2fe1a7f9b8ee7eb4a7c0f9e162bce33576b315ececbb6406837bf51f5");
        com.google.android.gms.internal.firebase-auth-api.zznj.zzb = com.google.android.gms.internal.firebase-auth-api.zznj.zza("39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112319", "39402006196394479212279040100143613805079739270465446667946905279627659399113263569398956308152294913554433653942643", "b3312fa7e23ee7e4988e056be3f82d19181d9c6efe8141120314088f5013875ac656398d8a2ed19d2a85c8edd3ec2aef", "aa87ca22be8b05378eb1c71ef320ad746e1d3b628ba79b9859f741e082542a385502f25dbf55296c3a545e3872760ab7", "3617de4a96262c6f5d9e98bf9292dc29f8f41dbd289a147ce9da3113b5f0b8c00a60b1ce1d7e819d7a431d7c90ea0e5f");
        com.google.android.gms.internal.firebase-auth-api.zznj.zzc = com.google.android.gms.internal.firebase-auth-api.zznj.zza("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151", "6864797660130609714981900799081393217269435300143305409394463459185543183397655394245057746333217197532963996371363321113864768612440380340372808892707005449", "051953eb9618e1c9a1f929a21a0b68540eea2da725b99b315f3b8b489918ef109e156193951ec7e937b1652c0bd3bb1bf073573df883d2c34f1ef451fd46b503f00", "c6858e06b70404e9cd9e3ecb662395b4429c648139053fb521f828af606b4d3dbaa14b5e77efe75928fe1dc127a2ffa8de3348b3c1856a429bf97e7e31c2e5bd66", "11839296a789a3bc0045c8a5fb42c7d1bd998f54449579b446817afbd17273e662c97ee72995ef42640c550b9013fad0761353c7086a272c24088be94769fd16650");
        com.google.android.gms.internal.firebase-auth-api.zznj.zzd = java.math.BigInteger.valueOf(2);
        com.google.android.gms.internal.firebase-auth-api.zznj.zze = java.math.BigInteger.valueOf(3);
        com.google.android.gms.internal.firebase-auth-api.zznj.zzf = java.math.BigInteger.valueOf(4);
        com.google.android.gms.internal.firebase-auth-api.zznj.zzg = java.math.BigInteger.valueOf(8);
        return;
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzni zza(com.google.android.gms.internal.firebase-auth-api.zzni p9, com.google.android.gms.internal.firebase-auth-api.zzni p10, java.math.BigInteger p11, java.math.BigInteger p12)
    {
        if (!p9.zza()) {
            if (!p10.zza()) {
                java.math.BigInteger v0_1 = p9.zzd.multiply(p9.zzd).mod(p12);
                java.math.BigInteger v1_2 = p10.zzd.multiply(p10.zzd).mod(p12);
                java.math.BigInteger v2_2 = p9.zzb.multiply(v1_2).mod(p12);
                java.math.BigInteger v3_2 = p10.zzb.multiply(v0_1).mod(p12);
                java.math.BigInteger v4_4 = p9.zzc.multiply(p10.zzd).mod(p12).multiply(v1_2).mod(p12);
                java.math.BigInteger v5_5 = p10.zzc.multiply(p9.zzd).mod(p12).multiply(v0_1).mod(p12);
                if (!v2_2.equals(v3_2)) {
                    java.math.BigInteger v11_2 = v3_2.subtract(v2_2).mod(p12);
                    java.math.BigInteger v3_6 = v11_2.multiply(com.google.android.gms.internal.firebase-auth-api.zznj.zzf).multiply(v11_2).mod(p12);
                    java.math.BigInteger v6_3 = v11_2.multiply(v3_6).mod(p12);
                    java.math.BigInteger v7 = com.google.android.gms.internal.firebase-auth-api.zznj.zzd;
                    java.math.BigInteger v5_8 = v5_5.subtract(v4_4).multiply(v7).mod(p12);
                    java.math.BigInteger v2_4 = v2_2.multiply(v3_6).mod(p12);
                    java.math.BigInteger v3_11 = v5_8.multiply(v5_8).mod(p12).subtract(v6_3).subtract(v2_4.multiply(v7)).mod(p12);
                    return new com.google.android.gms.internal.firebase-auth-api.zzni(v3_11, v5_8.multiply(v2_4.subtract(v3_11)).subtract(v4_4.multiply(v7).multiply(v6_3)).mod(p12), p9.zzd.add(p10.zzd).multiply(p9.zzd.add(p10.zzd)).mod(p12).subtract(v0_1).subtract(v1_2).multiply(v11_2).mod(p12));
                } else {
                    if (v4_4.equals(v5_5)) {
                        return com.google.android.gms.internal.firebase-auth-api.zznj.zza(p9, p11, p12);
                    } else {
                        return com.google.android.gms.internal.firebase-auth-api.zzni.zza;
                    }
                }
            } else {
                return p9;
            }
        } else {
            return p10;
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzni zza(com.google.android.gms.internal.firebase-auth-api.zzni p7, java.math.BigInteger p8, java.math.BigInteger p9)
    {
        if (!p7.zzc.equals(java.math.BigInteger.ZERO)) {
            java.math.BigInteger v0_9 = p7.zzb.multiply(p7.zzb).mod(p9);
            java.math.BigInteger v1_3 = p7.zzc.multiply(p7.zzc).mod(p9);
            java.math.BigInteger v2_1 = v1_3.multiply(v1_3).mod(p9);
            java.math.BigInteger v3_2 = p7.zzd.multiply(p7.zzd).mod(p9);
            java.math.BigInteger v5_0 = com.google.android.gms.internal.firebase-auth-api.zznj.zzd;
            java.math.BigInteger v4_6 = p7.zzb.add(v1_3).multiply(p7.zzb.add(v1_3)).mod(p9).subtract(v0_9).subtract(v2_1).multiply(v5_0);
            java.math.BigInteger v8_4 = v0_9.multiply(com.google.android.gms.internal.firebase-auth-api.zznj.zze).add(p8.multiply(v3_2).multiply(v3_2).mod(p9));
            java.math.BigInteger v0_7 = v8_4.multiply(v8_4).mod(p9).subtract(v4_6.multiply(v5_0)).mod(p9);
            return new com.google.android.gms.internal.firebase-auth-api.zzni(v0_7, v8_4.multiply(v4_6.subtract(v0_7)).mod(p9).subtract(v2_1.multiply(com.google.android.gms.internal.firebase-auth-api.zznj.zzg)).mod(p9), p7.zzc.add(p7.zzd).multiply(p7.zzc.add(p7.zzd)).mod(p9).subtract(v1_3).subtract(v3_2).mod(p9));
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzni.zza;
        }
    }

    private static com.google.android.gms.internal.firebase-auth-api.zzni zza(java.security.spec.ECPoint p5, java.math.BigInteger p6)
    {
        if (!p5.equals(java.security.spec.ECPoint.POINT_INFINITY)) {
            java.math.BigInteger v0_2 = new java.math.BigInteger(1, com.google.android.gms.internal.firebase-auth-api.zzqd.zza(((p6.bitLength() + 8) / 8))).mod(p6);
            java.math.BigInteger v1_2 = v0_2.multiply(v0_2).mod(p6);
            return new com.google.android.gms.internal.firebase-auth-api.zzni(p5.getAffineX().multiply(v1_2).mod(p6), p5.getAffineY().multiply(v1_2.multiply(v0_2).mod(p6)).mod(p6), v0_2);
        } else {
            return com.google.android.gms.internal.firebase-auth-api.zzni.zza;
        }
    }

    public static java.math.BigInteger zza(java.security.spec.EllipticCurve p1)
    {
        java.security.GeneralSecurityException v1_1 = p1.getField();
        if (!(v1_1 instanceof java.security.spec.ECFieldFp)) {
            throw new java.security.GeneralSecurityException("Only curves over prime order fields are supported");
        } else {
            return ((java.security.spec.ECFieldFp) v1_1).getP();
        }
    }

    private static java.security.spec.ECParameterSpec zza(String p3, String p4, String p5, String p6, String p7)
    {
        java.security.spec.EllipticCurve v0_1 = new java.math.BigInteger(p3);
        return new java.security.spec.ECParameterSpec(new java.security.spec.EllipticCurve(new java.security.spec.ECFieldFp(v0_1), v0_1.subtract(new java.math.BigInteger("3")), new java.math.BigInteger(p5, 16)), new java.security.spec.ECPoint(new java.math.BigInteger(p6, 16), new java.math.BigInteger(p7, 16)), new java.math.BigInteger(p4), 1);
    }

    public static java.security.spec.ECPoint zza(java.math.BigInteger p6, java.security.spec.ECParameterSpec p7)
    {
        if ((!com.google.android.gms.internal.firebase-auth-api.zznj.zza(p7, com.google.android.gms.internal.firebase-auth-api.zznj.zza)) && ((!com.google.android.gms.internal.firebase-auth-api.zznj.zza(p7, com.google.android.gms.internal.firebase-auth-api.zznj.zzb)) && (!com.google.android.gms.internal.firebase-auth-api.zznj.zza(p7, com.google.android.gms.internal.firebase-auth-api.zznj.zzc)))) {
            throw new java.security.GeneralSecurityException("spec must be NIST P256, P384 or P521");
        } else {
            if (p6.signum() != 1) {
                throw new java.security.GeneralSecurityException("k must be positive");
            } else {
                if (p6.compareTo(p7.getOrder()) >= 0) {
                    throw new java.security.GeneralSecurityException("k must be smaller than the order of the generator");
                } else {
                    java.security.spec.EllipticCurve v0_6 = p7.getCurve();
                    java.security.spec.ECPoint v1_1 = p7.getGenerator();
                    com.google.android.gms.internal.firebase-auth-api.zznj.zza(v1_1, v0_6);
                    java.math.BigInteger v7_5 = p7.getCurve().getA();
                    java.math.BigInteger v2 = com.google.android.gms.internal.firebase-auth-api.zznj.zza(v0_6);
                    java.math.BigInteger v3_1 = com.google.android.gms.internal.firebase-auth-api.zznj.zza(java.security.spec.ECPoint.POINT_INFINITY, v2);
                    java.security.spec.ECPoint v1_2 = com.google.android.gms.internal.firebase-auth-api.zznj.zza(v1_1, v2);
                    int v4_0 = p6.bitLength();
                    while (v4_0 >= 0) {
                        if (!p6.testBit(v4_0)) {
                            v1_2 = com.google.android.gms.internal.firebase-auth-api.zznj.zza(v3_1, v1_2, v7_5, v2);
                            v3_1 = com.google.android.gms.internal.firebase-auth-api.zznj.zza(v3_1, v7_5, v2);
                        } else {
                            v3_1 = com.google.android.gms.internal.firebase-auth-api.zznj.zza(v3_1, v1_2, v7_5, v2);
                            v1_2 = com.google.android.gms.internal.firebase-auth-api.zznj.zza(v1_2, v7_5, v2);
                        }
                        v4_0--;
                    }
                    java.security.spec.ECPoint v6_12;
                    if (!v3_1.zza()) {
                        java.security.spec.ECPoint v6_9 = v3_1.zzd.modInverse(v2);
                        java.math.BigInteger v7_7 = v6_9.multiply(v6_9).mod(v2);
                        v6_12 = new java.security.spec.ECPoint(v3_1.zzb.multiply(v7_7).mod(v2), v3_1.zzc.multiply(v7_7).mod(v2).multiply(v6_9).mod(v2));
                    } else {
                        v6_12 = java.security.spec.ECPoint.POINT_INFINITY;
                    }
                    com.google.android.gms.internal.firebase-auth-api.zznj.zza(v6_12, v0_6);
                    return v6_12;
                }
            }
        }
    }

    public static void zza(java.security.spec.ECPoint p4, java.security.spec.EllipticCurve p5)
    {
        java.math.BigInteger v0 = com.google.android.gms.internal.firebase-auth-api.zznj.zza(p5);
        java.math.BigInteger v1_0 = p4.getAffineX();
        java.security.GeneralSecurityException v4_8 = p4.getAffineY();
        if ((v1_0 == null) || (v4_8 == null)) {
            throw new java.security.GeneralSecurityException("point is at infinity");
        } else {
            if ((v1_0.signum() == -1) || (v1_0.compareTo(v0) >= 0)) {
                throw new java.security.GeneralSecurityException("x is out of range");
            } else {
                if ((v4_8.signum() == -1) || (v4_8.compareTo(v0) >= 0)) {
                    throw new java.security.GeneralSecurityException("y is out of range");
                } else {
                    if (!v4_8.multiply(v4_8).mod(v0).equals(v1_0.multiply(v1_0).add(p5.getA()).multiply(v1_0).add(p5.getB()).mod(v0))) {
                        throw new java.security.GeneralSecurityException("Point is not on curve");
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static boolean zza(java.security.spec.ECParameterSpec p2, java.security.spec.ECParameterSpec p3)
    {
        if ((!p2.getCurve().equals(p3.getCurve())) || ((!p2.getGenerator().equals(p3.getGenerator())) || ((!p2.getOrder().equals(p3.getOrder())) || (p2.getCofactor() != p3.getCofactor())))) {
            return 0;
        } else {
            return 1;
        }
    }
}
