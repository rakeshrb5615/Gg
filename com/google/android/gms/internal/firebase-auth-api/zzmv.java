package com.google.android.gms.internal.firebase-auth-api;
public final class zzmv implements com.google.android.gms.internal.firebase-auth-api.zzmt {
    private static final byte[] zza;
    private static final byte[] zzb;
    private final java.security.Provider zzc;

    static zzmv()
    {
        byte[] v0_1 = new byte[16];
        v0_1 = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
        com.google.android.gms.internal.firebase-auth-api.zzmv.zza = v0_1;
        byte[] v0_3 = new byte[12];
        v0_3 = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
        com.google.android.gms.internal.firebase-auth-api.zzmv.zzb = v0_3;
        return;
    }

    private zzmv(java.security.Provider p1)
    {
        this.zzc = p1;
        return;
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzmt zzb()
    {
        java.security.GeneralSecurityException v0_0 = com.google.android.gms.internal.firebase-auth-api.zznh.zza();
        if (v0_0 == null) {
            throw new java.security.GeneralSecurityException("Conscrypt is not available.");
        } else {
            java.security.KeyFactory.getInstance("XDH", v0_0);
            javax.crypto.KeyAgreement.getInstance("XDH", v0_0);
            String v1_1 = new com.google.android.gms.internal.firebase-auth-api.zzmv(v0_0);
            v1_1.zza();
            return v1_1;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzms zza()
    {
        java.security.GeneralSecurityException v0_5 = java.security.KeyPairGenerator.getInstance("XDH", this.zzc);
        v0_5.initialize(255);
        java.security.GeneralSecurityException v0_13 = v0_5.generateKeyPair();
        String v1_1 = v0_13.getPrivate().getEncoded();
        int v3_0 = com.google.android.gms.internal.firebase-auth-api.zzmv.zza;
        if (v1_1.length != (v3_0.length + 32)) {
            throw new java.security.GeneralSecurityException("Invalid encoded private key length");
        } else {
            if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v3_0, v1_1)) {
                throw new java.security.GeneralSecurityException("Invalid encoded private key prefix");
            } else {
                String v1_4 = java.util.Arrays.copyOfRange(v1_1, v3_0.length, v1_1.length);
                java.security.GeneralSecurityException v0_7 = v0_13.getPublic().getEncoded();
                int v3_2 = com.google.android.gms.internal.firebase-auth-api.zzmv.zzb;
                if (v0_7.length != (v3_2.length + 32)) {
                    throw new java.security.GeneralSecurityException("Invalid encoded public key length");
                } else {
                    if (!com.google.android.gms.internal.firebase-auth-api.zzqn.zza(v3_2, v0_7)) {
                        throw new java.security.GeneralSecurityException("Invalid encoded public key prefix");
                    } else {
                        return new com.google.android.gms.internal.firebase-auth-api.zzms(v1_4, java.util.Arrays.copyOfRange(v0_7, v3_2.length, v0_7.length));
                    }
                }
            }
        }
    }

    public final byte[] zza(byte[] p6, byte[] p7)
    {
        javax.crypto.KeyAgreement v0_1 = java.security.KeyFactory.getInstance("XDH", this.zzc);
        if (p6.length != 32) {
            throw new java.security.InvalidKeyException("Invalid X25519 private key");
        } else {
            java.security.InvalidKeyException v6_3 = v0_1.generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {com.google.android.gms.internal.firebase-auth-api.zzmv.zza, p6}))));
            if (p7.length != 32) {
                throw new java.security.InvalidKeyException("Invalid X25519 public key");
            } else {
                String v7_4 = v0_1.generatePublic(new java.security.spec.X509EncodedKeySpec(com.google.android.gms.internal.firebase-auth-api.zzyz.zza(new byte[][] {com.google.android.gms.internal.firebase-auth-api.zzmv.zzb, p7}))));
                javax.crypto.KeyAgreement v0_3 = javax.crypto.KeyAgreement.getInstance("XDH", this.zzc);
                v0_3.init(v6_3);
                v0_3.doPhase(v7_4, 1);
                return v0_3.generateSecret();
            }
        }
    }
}
