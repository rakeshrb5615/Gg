package com.google.android.gms.internal.firebase-auth-api;
public final class zzsx implements com.google.android.gms.internal.firebase-auth-api.zzsq {
    private static final com.google.android.gms.internal.firebase-auth-api.zziv$zza zza;
    private final java.security.Key zzb;
    private final java.security.Provider zzc;

    static zzsx()
    {
        com.google.android.gms.internal.firebase-auth-api.zzsx.zza = com.google.android.gms.internal.firebase-auth-api.zziv$zza.zza;
        return;
    }

    private zzsx(byte[] p3, java.security.Provider p4)
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zzsx.zza.zza()) {
            throw new java.security.GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        } else {
            this.zzb = new javax.crypto.spec.SecretKeySpec(p3, "AES");
            this.zzc = p4;
            return;
        }
    }

    public static com.google.android.gms.internal.firebase-auth-api.zzsq zza(com.google.android.gms.internal.firebase-auth-api.zzso p3)
    {
        String v0_0 = com.google.android.gms.internal.firebase-auth-api.zznh.zza();
        if (v0_0 == null) {
            throw new java.security.GeneralSecurityException("Conscrypt not available");
        } else {
            javax.crypto.Mac.getInstance("AESCMAC", v0_0);
            return new com.google.android.gms.internal.firebase-auth-api.zzsx(p3.zzd().zza(com.google.android.gms.internal.firebase-auth-api.zzbf.zza()), v0_0);
        }
    }

    public final byte[] zza(byte[] p3, int p4)
    {
        if (p4 > 16) {
            throw new java.security.InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        } else {
            int v0_3 = javax.crypto.Mac.getInstance("AESCMAC", this.zzc);
            v0_3.init(this.zzb);
            byte[] v3_1 = v0_3.doFinal(p3);
            if (p4 != v3_1.length) {
                return java.util.Arrays.copyOf(v3_1, p4);
            } else {
                return v3_1;
            }
        }
    }
}
