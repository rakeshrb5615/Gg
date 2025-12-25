package com.google.android.gms.common;
public class GooglePlayServicesUtilLight {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    public static final String GOOGLE_SERVICES_FRAMEWORK_PACKAGE = "com.google.android.gsf";
    static final java.util.concurrent.atomic.AtomicBoolean sCanceledAvailabilityNotification = None;
    public static boolean zza = False;
    public static boolean zzb = False;
    private static final java.util.concurrent.atomic.AtomicBoolean zzc;

    static GooglePlayServicesUtilLight()
    {
        com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification = new java.util.concurrent.atomic.AtomicBoolean();
        com.google.android.gms.common.GooglePlayServicesUtilLight.zzc = new java.util.concurrent.atomic.AtomicBoolean();
        return;
    }

    public GooglePlayServicesUtilLight()
    {
        return;
    }

    public static void cancelAvailabilityErrorNotifications(android.content.Context p2)
    {
        if (!com.google.android.gms.common.GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.getAndSet(1)) {
            try {
                SecurityException v2_3 = ((android.app.NotificationManager) p2.getSystemService("notification"));
            } catch (SecurityException v2_1) {
                android.util.Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", v2_1);
                return;
            }
            if (v2_3 != null) {
                v2_3.cancel(10436);
            }
        }
        return;
    }

    public static void enableUsingApkIndependentContext()
    {
        com.google.android.gms.common.GooglePlayServicesUtilLight.zzc.set(1);
        return;
    }

    public static void ensurePlayServicesAvailable(android.content.Context p2, int p3)
    {
        int v3_1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(p2, p3);
        if (v3_1 == 0) {
            return;
        } else {
            com.google.android.gms.common.GooglePlayServicesNotAvailableException v2_1 = com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(p2, v3_1, "e");
            String v1_1 = new StringBuilder((String.valueOf(v3_1).length() + 46));
            v1_1.append("GooglePlayServices not available due to error ");
            v1_1.append(v3_1);
            android.util.Log.e("GooglePlayServicesUtil", v1_1.toString());
            if (v2_1 != null) {
                throw new com.google.android.gms.common.GooglePlayServicesRepairableException(v3_1, "Google Play Services not available", v2_1);
            } else {
                throw new com.google.android.gms.common.GooglePlayServicesNotAvailableException(v3_1);
            }
        }
    }

    public static int getApkVersion(android.content.Context p2)
    {
        try {
            return p2.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            android.util.Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static int getClientVersion(android.content.Context p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkState(1);
        return com.google.android.gms.common.util.ClientLibraryUtils.getClientVersion(p1, p1.getPackageName());
    }

    public static android.app.PendingIntent getErrorPendingIntent(int p1, android.content.Context p2, int p3)
    {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(p2, p1, p3);
    }

    public static String getErrorString(int p0)
    {
        return com.google.android.gms.common.ConnectionResult.zza(p0);
    }

    public static android.content.Intent getGooglePlayServicesAvailabilityRecoveryIntent(int p2)
    {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(0, p2, 0);
    }

    public static android.content.Context getRemoteContext(android.content.Context p2)
    {
        try {
            return p2.createPackageContext("com.google.android.gms", 3);
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            return 0;
        }
    }

    public static android.content.res.Resources getRemoteResource(android.content.Context p1)
    {
        try {
            return p1.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            return 0;
        }
    }

    public static boolean honorsDebugCertificates(android.content.Context p5)
    {
        if (!com.google.android.gms.common.GooglePlayServicesUtilLight.zzb) {
            String v3_0;
            android.content.pm.PackageInfo v0_3 = com.google.android.gms.common.wrappers.Wrappers.packageManager(p5);
            if (android.os.Build$VERSION.SDK_INT < 28) {
                v3_0 = 64;
            } else {
                v3_0 = 134217792;
            }
            android.content.pm.PackageInfo v0_1 = v0_3.getPackageInfo("com.google.android.gms", v3_0);
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(p5);
            if ((v0_1 == null) || ((com.google.android.gms.common.GoogleSignatureVerifier.zza(v0_1, 0)) || (!com.google.android.gms.common.GoogleSignatureVerifier.zza(v0_1, 1)))) {
                com.google.android.gms.common.GooglePlayServicesUtilLight.zza = 0;
            } else {
                com.google.android.gms.common.GooglePlayServicesUtilLight.zza = 1;
            }
            com.google.android.gms.common.GooglePlayServicesUtilLight.zzb = 1;
        }
        if ((!com.google.android.gms.common.GooglePlayServicesUtilLight.zza) && (com.google.android.gms.common.util.DeviceProperties.isUserBuild())) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int isGooglePlayServicesAvailable(android.content.Context p1)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(p1, com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public static int isGooglePlayServicesAvailable(android.content.Context p11, int p12)
    {
        try {
            p11.getResources().getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
        } catch (Throwable) {
            android.util.Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if ((!"com.google.android.gms".equals(p11.getPackageName())) && (!com.google.android.gms.common.GooglePlayServicesUtilLight.zzc.get())) {
            String v1_12 = com.google.android.gms.common.internal.zzae.zzb(p11);
            if (v1_12 == null) {
                throw new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException();
            } else {
                if (v1_12 != com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                    throw new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException(v1_12);
                }
            }
        }
        String v1_16;
        int v3_0 = 1;
        if ((com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(p11)) || (com.google.android.gms.common.util.DeviceProperties.zzd(p11))) {
            v1_16 = 0;
        } else {
            v1_16 = 1;
        }
        String v5_0;
        if (p12 < null) {
            v5_0 = 0;
        } else {
            v5_0 = 1;
        }
        android.content.pm.PackageInfo v9_0;
        com.google.android.gms.common.internal.Preconditions.checkArgument(v5_0);
        String v5_1 = p11.getPackageName();
        android.content.pm.PackageManager v6 = p11.getPackageManager();
        if (v1_16 == null) {
            v9_0 = 0;
            try {
                android.content.pm.PackageInfo v7_1;
                if (android.os.Build$VERSION.SDK_INT < 28) {
                    v7_1 = 64;
                } else {
                    v7_1 = 134217792;
                }
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                android.util.Log.w("GooglePlayServicesUtil", String.valueOf(v5_1).concat(" requires Google Play services, but they are missing."));
            }
            android.content.pm.PackageInfo v7_2 = v6.getPackageInfo("com.google.android.gms", v7_1);
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(p11);
            if (com.google.android.gms.common.GoogleSignatureVerifier.zza(v7_2, 1)) {
                if (v1_16 != null) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v9_0);
                    if (!com.google.android.gms.common.GoogleSignatureVerifier.zza(v9_0, 1)) {
                        android.util.Log.w("GooglePlayServicesUtil", String.valueOf(v5_1).concat(" requires Google Play Store, but its signature is invalid."));
                        v3_0 = 9;
                        return v3_0;
                    }
                }
                if ((v1_16 == null) || ((v9_0 == null) || (v9_0.signatures[0].equals(v7_2.signatures[0])))) {
                    if (com.google.android.gms.common.util.zzb.zza(v7_2.versionCode) >= com.google.android.gms.common.util.zzb.zza(p12)) {
                        android.content.pm.PackageManager$NameNotFoundException v11_1 = v7_2.applicationInfo;
                        if (v11_1 == null) {
                            try {
                                v11_1 = v6.getApplicationInfo("com.google.android.gms", 0);
                            } catch (android.content.pm.PackageManager$NameNotFoundException v11_2) {
                                android.util.Log.wtf("GooglePlayServicesUtil", String.valueOf(v5_1).concat(" requires Google Play services, but they\'re missing when getting application info."), v11_2);
                                return v3_0;
                            }
                        }
                        if (v11_1.enabled) {
                            return 0;
                        } else {
                            v3_0 = 3;
                        }
                    } else {
                        android.content.pm.PackageManager$NameNotFoundException v11_4 = v7_2.versionCode;
                        int v3_3 = new StringBuilder(((((String.valueOf(v5_1).length() + 49) + String.valueOf(p12).length()) + 11) + String.valueOf(v11_4).length()));
                        v3_3.append("Google Play services out of date for ");
                        v3_3.append(v5_1);
                        v3_3.append(".  Requires ");
                        v3_3.append(p12);
                        v3_3.append(" but found ");
                        v3_3.append(v11_4);
                        android.util.Log.w("GooglePlayServicesUtil", v3_3.toString());
                        v3_0 = 2;
                    }
                } else {
                    android.util.Log.w("GooglePlayServicesUtil", String.valueOf(v5_1).concat(" requires Google Play Store, but its signature doesn\'t match that of Google Play services."));
                }
            } else {
                android.util.Log.w("GooglePlayServicesUtil", String.valueOf(v5_1).concat(" requires Google Play services, but their signature is invalid."));
            }
        } else {
            try {
                android.content.pm.PackageInfo v9_2;
                if (android.os.Build$VERSION.SDK_INT < 28) {
                    v9_2 = 8256;
                } else {
                    v9_2 = 134225984;
                }
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                android.util.Log.w("GooglePlayServicesUtil", String.valueOf(v5_1).concat(" requires the Google Play Store, but it is missing."));
            }
            v9_0 = v6.getPackageInfo("com.android.vending", v9_2);
        }
        return v3_0;
    }

    public static boolean isGooglePlayServicesUid(android.content.Context p0, int p1)
    {
        return com.google.android.gms.common.util.UidVerifier.isGooglePlayServicesUid(p0, p1);
    }

    public static boolean isPlayServicesPossiblyUpdating(android.content.Context p2, int p3)
    {
        if (p3 != 18) {
            if (p3 != 1) {
                return 0;
            } else {
                return com.google.android.gms.common.GooglePlayServicesUtilLight.zza(p2, "com.google.android.gms");
            }
        } else {
            return 1;
        }
    }

    public static boolean isPlayStorePossiblyUpdating(android.content.Context p1, int p2)
    {
        if (p2 != 9) {
            return 0;
        } else {
            return com.google.android.gms.common.GooglePlayServicesUtilLight.zza(p1, "com.android.vending");
        }
    }

    public static boolean isRestrictedUserProfile(android.content.Context p2)
    {
        String v0_2 = p2.getSystemService("user");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_2);
        int v2_6 = ((android.os.UserManager) v0_2).getApplicationRestrictions(p2.getPackageName());
        if ((v2_6 == 0) || (!"true".equals(v2_6.getString("restricted_profile")))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isSidewinderDevice(android.content.Context p0)
    {
        return com.google.android.gms.common.util.DeviceProperties.isSidewinder(p0);
    }

    public static boolean isUserRecoverableError(int p2)
    {
        if ((p2 == 1) || ((p2 == 2) || ((p2 == 3) || (p2 == 9)))) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean uidHasPackageName(android.content.Context p0, int p1, String p2)
    {
        return com.google.android.gms.common.util.UidVerifier.uidHasPackageName(p0, p1, p2);
    }

    public static boolean zza(android.content.Context p5, String p6)
    {
        boolean v0_1 = p6.equals("com.google.android.gms");
        try {
            android.content.pm.PackageManager v2_0 = p5.getPackageManager().getPackageInstaller().getAllSessions().iterator();
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            return 0;
        }
        while (v2_0.hasNext()) {
            if (p6.equals(((android.content.pm.PackageInstaller$SessionInfo) v2_0.next()).getAppPackageName())) {
                return 1;
            }
        }
        boolean v6_1 = p5.getPackageManager().getApplicationInfo(p6, 8192);
        if (!v0_1) {
            if ((!v6_1.enabled) || (com.google.android.gms.common.GooglePlayServicesUtilLight.isRestrictedUserProfile(p5))) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return v6_1.enabled;
        }
    }
}
