package com.google.android.gms.common;
public final class GooglePlayServicesUtil extends com.google.android.gms.common.GooglePlayServicesUtilLight {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 0;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    static GooglePlayServicesUtil()
    {
        com.google.android.gms.common.GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return;
    }

    private GooglePlayServicesUtil()
    {
        return;
    }

    public static android.app.Dialog getErrorDialog(int p1, android.app.Activity p2, int p3)
    {
        return com.google.android.gms.common.GooglePlayServicesUtil.getErrorDialog(p1, p2, p3, 0);
    }

    public static android.app.Dialog getErrorDialog(int p2, android.app.Activity p3, int p4, android.content.DialogInterface$OnCancelListener p5)
    {
        if (1 == com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(p3, p2)) {
            p2 = 18;
        }
        return com.google.android.gms.common.GoogleApiAvailability.getInstance().getErrorDialog(p3, p2, p4, p5);
    }

    public static android.app.PendingIntent getErrorPendingIntent(int p1, android.content.Context p2, int p3)
    {
        return com.google.android.gms.common.GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(p2, p1, p3);
    }

    public static String getErrorString(int p0)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getErrorString(p0);
    }

    public static android.content.Context getRemoteContext(android.content.Context p0)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteContext(p0);
    }

    public static android.content.res.Resources getRemoteResource(android.content.Context p0)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.getRemoteResource(p0);
    }

    public static int isGooglePlayServicesAvailable(android.content.Context p0)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(p0);
    }

    public static int isGooglePlayServicesAvailable(android.content.Context p0, int p1)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(p0, p1);
    }

    public static boolean isUserRecoverableError(int p0)
    {
        return com.google.android.gms.common.GooglePlayServicesUtilLight.isUserRecoverableError(p0);
    }

    public static boolean showErrorDialogFragment(int p1, android.app.Activity p2, int p3)
    {
        return com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(p1, p2, p3, 0);
    }

    public static boolean showErrorDialogFragment(int p1, android.app.Activity p2, int p3, android.content.DialogInterface$OnCancelListener p4)
    {
        return com.google.android.gms.common.GooglePlayServicesUtil.showErrorDialogFragment(p1, p2, 0, p3, p4);
    }

    public static boolean showErrorDialogFragment(int p8, android.app.Activity p9, androidx.fragment.app.e0 p10, int p11, android.content.DialogInterface$OnCancelListener p12)
    {
        if (1 == com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(p9, p8)) {
            p8 = 18;
        }
        com.google.android.gms.common.GoogleApiAvailability v2 = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        if (p10 != null) {
            int v8_2 = v2.zaa(p9, p8, com.google.android.gms.common.internal.zag.zac(p10, com.google.android.gms.common.GoogleApiAvailability.getInstance().getErrorResolutionIntent(p9, p8, "d"), p11), p12, 0);
            if (v8_2 != 0) {
                v2.zad(p9, v8_2, "GooglePlayServicesErrorDialog", p12);
                return 1;
            } else {
                return 0;
            }
        } else {
            return v2.showErrorDialogFragment(p9, p8, p11, p12);
        }
    }

    public static void showErrorNotification(int p2, android.content.Context p3)
    {
        com.google.android.gms.common.GoogleApiAvailability v0 = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        if ((!com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(p3, p2)) && (!com.google.android.gms.common.GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(p3, p2))) {
            v0.showErrorNotification(p3, p2);
            return;
        } else {
            v0.zaf(p3);
            return;
        }
    }
}
