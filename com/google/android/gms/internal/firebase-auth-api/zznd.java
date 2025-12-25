package com.google.android.gms.internal.firebase-auth-api;
public final class zznd implements com.google.android.gms.internal.firebase-auth-api.zzbx {
    private static final Object zza;

    static zznd()
    {
        com.google.android.gms.internal.firebase-auth-api.zznd.zza = new Object();
        return;
    }

    public zznd()
    {
        this(new com.google.android.gms.internal.firebase-auth-api.zznd$zza());
        return;
    }

    private zznd(com.google.android.gms.internal.firebase-auth-api.zznd$zza p1)
    {
        return;
    }

    public static synthetic boolean zza()
    {
        return 1;
    }

    public static boolean zzc(String p3)
    {
        int v3_6 = com.google.android.gms.internal.firebase-auth-api.zzaai.zza("android-keystore://", p3);
        if (com.google.android.gms.internal.firebase-auth-api.zzmz.zzb(v3_6)) {
            return 0;
        } else {
            int v3_5 = new android.security.keystore.KeyGenParameterSpec$Builder(v3_6, 3).setKeySize(256).setBlockModes(new String[] {"GCM"})).setEncryptionPaddings(new String[] {"NoPadding"})).build();
            javax.crypto.KeyGenerator v1_7 = javax.crypto.KeyGenerator.getInstance("AES", "AndroidKeyStore");
            v1_7.init(v3_5);
            v1_7.generateKey();
            return 1;
        }
    }

    public final com.google.android.gms.internal.firebase-auth-api.zzba zza(String p5)
    {
        try {
        } catch (java.security.KeyStoreException v5_5) {
            throw new java.security.GeneralSecurityException(v5_5);
        }
        String v1_2 = new com.google.android.gms.internal.firebase-auth-api.zznb(com.google.android.gms.internal.firebase-auth-api.zzaai.zza("android-keystore://", p5));
        java.security.KeyStoreException v5_8 = com.google.android.gms.internal.firebase-auth-api.zzqd.zza(10);
        byte[] v2_0 = new byte[0];
        if (!java.util.Arrays.equals(v5_8, v1_2.zza(v1_2.zzb(v5_8, v2_0), v2_0))) {
            throw new java.security.KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        } else {
            return v1_2;
        }
    }

    public final boolean zzb(String p2)
    {
        if (!p2.toLowerCase(java.util.Locale.US).startsWith("android-keystore://")) {
            return 0;
        } else {
            return 1;
        }
    }
}
