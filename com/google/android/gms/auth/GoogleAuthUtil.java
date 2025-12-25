package com.google.android.gms.auth;
public final class GoogleAuthUtil extends com.google.android.gms.auth.zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";

    private GoogleAuthUtil()
    {
        return;
    }

    public static void clearToken(android.content.Context p0, String p1)
    {
        com.google.android.gms.auth.zzl.clearToken(p0, p1);
        return;
    }

    public static java.util.List getAccountChangeEvents(android.content.Context p0, int p1, String p2)
    {
        return com.google.android.gms.auth.zzl.getAccountChangeEvents(p0, p1, p2);
    }

    public static String getAccountId(android.content.Context p0, String p1)
    {
        return com.google.android.gms.auth.zzl.getAccountId(p0, p1);
    }

    public static String getToken(android.content.Context p0, android.accounts.Account p1, String p2)
    {
        return com.google.android.gms.auth.zzl.getToken(p0, p1, p2);
    }

    public static String getToken(android.content.Context p0, android.accounts.Account p1, String p2, android.os.Bundle p3)
    {
        return com.google.android.gms.auth.zzl.getToken(p0, p1, p2, p3);
    }

    public static String getToken(android.content.Context p0, String p1, String p2)
    {
        return com.google.android.gms.auth.zzl.getToken(p0, p1, p2);
    }

    public static String getToken(android.content.Context p0, String p1, String p2, android.os.Bundle p3)
    {
        return com.google.android.gms.auth.zzl.getToken(p0, p1, p2, p3);
    }

    public static String getTokenWithNotification(android.content.Context p2, android.accounts.Account p3, String p4, android.os.Bundle p5)
    {
        if (p5 == null) {
            p5 = new android.os.Bundle();
        }
        p5.putBoolean("handle_notification", 1);
        return com.google.android.gms.auth.GoogleAuthUtil.zzg(p2, p3, p4, p5).zza();
    }

    public static String getTokenWithNotification(android.content.Context p1, android.accounts.Account p2, String p3, android.os.Bundle p4, android.content.Intent p5)
    {
        com.google.android.gms.auth.zzl.zzf(p5);
        if (p4 == null) {
            p4 = new android.os.Bundle();
        }
        p4.putParcelable("callback_intent", p5);
        p4.putBoolean("handle_notification", 1);
        return com.google.android.gms.auth.GoogleAuthUtil.zzg(p1, p2, p3, p4).zza();
    }

    public static String getTokenWithNotification(android.content.Context p1, android.accounts.Account p2, String p3, android.os.Bundle p4, String p5, android.os.Bundle p6)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p5, "Authority cannot be empty or null.");
        if (p4 == null) {
            p4 = new android.os.Bundle();
        }
        if (p6 == 0) {
            p6 = new android.os.Bundle();
        }
        android.content.ContentResolver.validateSyncExtrasBundle(p6);
        p4.putString("authority", p5);
        p4.putBundle("sync_extras", p6);
        p4.putBoolean("handle_notification", 1);
        return com.google.android.gms.auth.GoogleAuthUtil.zzg(p1, p2, p3, p4).zza();
    }

    public static String getTokenWithNotification(android.content.Context p2, String p3, String p4, android.os.Bundle p5)
    {
        return com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(p2, new android.accounts.Account(p3, "com.google"), p4, p5);
    }

    public static String getTokenWithNotification(android.content.Context p2, String p3, String p4, android.os.Bundle p5, android.content.Intent p6)
    {
        return com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(p2, new android.accounts.Account(p3, "com.google"), p4, p5, p6);
    }

    public static String getTokenWithNotification(android.content.Context p2, String p3, String p4, android.os.Bundle p5, String p6, android.os.Bundle p7)
    {
        return com.google.android.gms.auth.GoogleAuthUtil.getTokenWithNotification(p2, new android.accounts.Account(p3, "com.google"), p4, p5, p6, p7);
    }

    public static void invalidateToken(android.content.Context p0, String p1)
    {
        com.google.android.gms.auth.zzl.invalidateToken(p0, p1);
        return;
    }

    public static android.os.Bundle removeAccount(android.content.Context p0, android.accounts.Account p1)
    {
        return com.google.android.gms.auth.zzl.removeAccount(p0, p1);
    }

    public static Boolean requestGoogleAccountsAccess(android.content.Context p0)
    {
        return com.google.android.gms.auth.zzl.requestGoogleAccountsAccess(p0);
    }

    private static com.google.android.gms.auth.TokenData zzg(android.content.Context p3, android.accounts.Account p4, String p5, android.os.Bundle p6)
    {
        try {
            com.google.android.gms.auth.UserRecoverableAuthException v4_2 = com.google.android.gms.auth.zzl.zza(p3, p4, p5, p6);
            com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(p3);
            return v4_2;
        } catch (com.google.android.gms.auth.UserRecoverableAuthException v4_1) {
            com.google.android.gms.common.GooglePlayServicesUtil.showErrorNotification(v4_1.getConnectionStatusCode(), p3);
            android.util.Log.w("GoogleAuthUtil", "Error when getting token", v4_1);
            throw new com.google.android.gms.auth.UserRecoverableNotifiedException("User intervention required. Notification has been pushed.", v4_1);
        } catch (com.google.android.gms.auth.UserRecoverableAuthException v4_3) {
            com.google.android.gms.common.GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(p3);
            android.util.Log.w("GoogleAuthUtil", "Error when getting token", v4_3);
            throw new com.google.android.gms.auth.UserRecoverableNotifiedException("User intervention required. Notification has been pushed.", v4_3);
        }
    }
}
