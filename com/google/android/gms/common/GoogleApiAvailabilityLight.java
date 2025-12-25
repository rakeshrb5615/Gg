package com.google.android.gms.common;
public class GoogleApiAvailabilityLight {
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static final String TRACKING_SOURCE_DIALOG = "d";
    static final String TRACKING_SOURCE_NOTIFICATION = "n";
    private static final com.google.android.gms.common.GoogleApiAvailabilityLight zza;

    static GoogleApiAvailabilityLight()
    {
        com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        com.google.android.gms.common.GoogleApiAvailabilityLight.zza = new com.google.android.gms.common.GoogleApiAvailabilityLight();
        return;
    }

    public GoogleApiAvailabilityLight()
    {
        return;
    }

    public static com.google.android.gms.common.GoogleApiAvailabilityLight getInstance()
    {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.zza;
    }

    public void cancelAvailabilityErrorNotifications(android.content.Context p1)
    {
        com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(p1);
        return;
    }

    public int getApkVersion(android.content.Context p1)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getApkVersion(p1);
    }

    public int getClientVersion(android.content.Context p1)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getClientVersion(p1);
    }

    public android.content.Intent getErrorResolutionIntent(int p2)
    {
        return this.getErrorResolutionIntent(0, p2, 0);
    }

    public android.content.Intent getErrorResolutionIntent(android.content.Context p4, int p5, String p6)
    {
        if ((p5 == 1) || (p5 == 2)) {
            if ((p4 != 0) && (com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(p4))) {
                int v4_1 = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
                v4_1.setPackage("com.google.android.wearable.app");
                return v4_1;
            } else {
                android.content.Intent v5_4 = new StringBuilder("gcore_");
                v5_4.append(com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                v5_4.append("-");
                if (!android.text.TextUtils.isEmpty(p6)) {
                    v5_4.append(p6);
                }
                v5_4.append("-");
                if (p4 != 0) {
                    v5_4.append(p4.getPackageName());
                }
                v5_4.append("-");
                if (p4 != 0) {
                    v5_4.append(com.google.android.gms.common.wrappers.Wrappers.packageManager(p4).getPackageInfo(p4.getPackageName(), 0).versionCode);
                }
                int v4_5 = v5_4.toString();
                android.content.Intent v5_6 = new android.content.Intent("android.intent.action.VIEW");
                android.net.Uri$Builder v6_7 = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!android.text.TextUtils.isEmpty(v4_5)) {
                    v6_7.appendQueryParameter("pcampaignid", v4_5);
                }
                v5_6.setData(v6_7.build());
                v5_6.setPackage("com.android.vending");
                v5_6.addFlags(524288);
                return v5_6;
            }
        } else {
            if (p5 == 3) {
                int v4_11 = android.net.Uri.fromParts("package", "com.google.android.gms", 0);
                android.content.Intent v5_9 = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                v5_9.setData(v4_11);
                return v5_9;
            } else {
                return 0;
            }
        }
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context p2, int p3, int p4)
    {
        return this.getErrorResolutionPendingIntent(p2, p3, p4, 0);
    }

    public android.app.PendingIntent getErrorResolutionPendingIntent(android.content.Context p1, int p2, int p3, String p4)
    {
        android.content.Intent v2_1 = this.getErrorResolutionIntent(p1, p2, p4);
        if (v2_1 != null) {
            return android.app.PendingIntent.getActivity(p1, p3, v2_1, 201326592);
        } else {
            return 0;
        }
    }

    public String getErrorString(int p1)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(p1);
    }

    public int isGooglePlayServicesAvailable(android.content.Context p2)
    {
        return this.isGooglePlayServicesAvailable(p2, com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public int isGooglePlayServicesAvailable(android.content.Context p1, int p2)
    {
        int v2_1 = com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(p1, p2);
        if (!com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(p1, v2_1)) {
            return v2_1;
        } else {
            return 18;
        }
    }

    public boolean isPlayServicesPossiblyUpdating(android.content.Context p1, int p2)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(p1, p2);
    }

    public boolean isPlayStorePossiblyUpdating(android.content.Context p1, int p2)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(p1, p2);
    }

    public boolean isUninstalledAppPossiblyUpdating(android.content.Context p1, String p2)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.zza(p1, p2);
    }

    public boolean isUserResolvableError(int p1)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(p1);
    }

    public void verifyGooglePlayServicesIsAvailable(android.content.Context p1, int p2)
    {
        com.google.android.gms.common.GooglePlayServicesUtilLight.ensurePlayServicesAvailable(p1, p2);
        return;
    }
}
