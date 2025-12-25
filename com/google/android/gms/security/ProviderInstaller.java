package com.google.android.gms.security;
public class ProviderInstaller {
    public static final String PROVIDER_NAME = "GmsCore_OpenSSL";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza;
    private static final Object zzb;
    private static reflect.Method zzc;
    private static boolean zzd;

    static ProviderInstaller()
    {
        com.google.android.gms.security.ProviderInstaller.zza = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance();
        com.google.android.gms.security.ProviderInstaller.zzb = new Object();
        com.google.android.gms.security.ProviderInstaller.zzc = 0;
        com.google.android.gms.security.ProviderInstaller.zzd = 0;
        return;
    }

    public ProviderInstaller()
    {
        return;
    }

    public static void installIfNeeded(android.content.Context p12)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p12, "Context must not be null");
        com.google.android.gms.security.ProviderInstaller.zza.verifyGooglePlayServicesIsAvailable(p12, 11925000);
        String v0_5 = android.os.SystemClock.uptimeMillis();
        try {
            String v4_1 = 0;
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException v12_4) {
            throw v12_4;
        }
        if (com.google.android.gms.security.ProviderInstaller.zzd) {
            String v6_2 = com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(p12);
            if (v6_2 != null) {
                com.google.android.gms.security.ProviderInstaller.zzd = 1;
                if (!com.google.android.gms.security.ProviderInstaller.zzd) {
                    try {
                        com.google.android.gms.internal.common.zzi[] v7_0 = android.os.SystemClock.uptimeMillis();
                        ClassLoader v10 = v6_2.getClassLoader();
                        com.google.android.gms.internal.common.zzi v11_1 = com.google.android.gms.internal.common.zzi.zzb(android.content.Context, p12);
                        String v0_2 = com.google.android.gms.internal.common.zzh.zza(v0_5);
                        String v1_1 = com.google.android.gms.internal.common.zzh.zza(v7_0);
                        com.google.android.gms.internal.common.zzi[] v7_2 = new com.google.android.gms.internal.common.zzi[3];
                        v7_2[0] = v11_1;
                        v7_2[1] = v0_2;
                        v7_2[2] = v1_1;
                        com.google.android.gms.internal.common.zzj.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", v10, v7_2);
                    } catch (String v0_4) {
                        android.util.Log.w("ProviderInstaller", "Failed to report request stats: ".concat(v0_4.toString()));
                    }
                }
                v4_1 = v6_2;
            } else {
            }
            if (v4_1 == null) {
                android.util.Log.e("ProviderInstaller", "Failed to get remote context");
                throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
            } else {
                com.google.android.gms.security.ProviderInstaller.zzb(v4_1, p12, "com.google.android.gms.common.security.ProviderInstallerImpl");
            }
        } else {
            try {
                String v3_0 = com.google.android.gms.dynamite.DynamiteModule.load(p12, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.providerinstaller.dynamite").getModuleContext();
            } catch (String v5_2) {
                android.util.Log.w("ProviderInstaller", v3_0.concat(String.valueOf(v5_2.getMessage())));
                v3_0 = 0;
            }
            if (v3_0 == null) {
            } else {
                com.google.android.gms.security.ProviderInstaller.zzb(v3_0, p12, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
            }
        }
        return;
    }

    public static void installIfNeededAsync(android.content.Context p1, com.google.android.gms.security.ProviderInstaller$ProviderInstallListener p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1, "Context must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Listener must not be null");
        com.google.android.gms.common.internal.Preconditions.checkMainThread("Must be called on the UI thread");
        Void[] v1_2 = new Void[0];
        new com.google.android.gms.security.zza(p1, p2).execute(v1_2);
        return;
    }

    public static synthetic com.google.android.gms.common.GoogleApiAvailabilityLight zza()
    {
        return com.google.android.gms.security.ProviderInstaller.zza;
    }

    private static void zzb(android.content.Context p2, android.content.Context p3, String p4)
    {
        try {
            if (com.google.android.gms.security.ProviderInstaller.zzc == null) {
                com.google.android.gms.security.ProviderInstaller.zzc = p2.getClassLoader().loadClass(p4).getMethod("insertProvider", new Class[] {android.content.Context}));
            }
        } catch (String v2_1) {
            String v3_2 = v2_1.getCause();
            if (android.util.Log.isLoggable("ProviderInstaller", 6)) {
                if (v3_2 != null) {
                    String v2_2 = v3_2.toString();
                } else {
                    v2_2 = v2_1.toString();
                }
                android.util.Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(v2_2)));
            }
            throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(8);
        }
        com.google.android.gms.security.ProviderInstaller.zzc.invoke(0, new Object[] {p2}));
        return;
    }
}
