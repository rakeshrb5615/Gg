package com.google.android.gms.internal.firebase-auth-api;
public final class zziv {
    private static final java.util.logging.Logger zza;
    private static final java.util.concurrent.atomic.AtomicBoolean zzb;

    static zziv()
    {
        com.google.android.gms.internal.firebase-auth-api.zziv.zza = java.util.logging.Logger.getLogger(com.google.android.gms.internal.firebase-auth-api.zziv.getName());
        com.google.android.gms.internal.firebase-auth-api.zziv.zzb = new java.util.concurrent.atomic.AtomicBoolean(0);
        return;
    }

    private zziv()
    {
        return;
    }

    public static Boolean zza()
    {
        try {
            return ((Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", 0).invoke(0, 0));
        } catch (Exception) {
            com.google.android.gms.internal.firebase-auth-api.zziv.zza.logp(java.util.logging.Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean zzb()
    {
        if (!com.google.android.gms.internal.firebase-auth-api.zziv.zzb.get()) {
            return 0;
        } else {
            return 1;
        }
    }
}
