package com.google.android.gms.common.util;
public final class UidVerifier {

    private UidVerifier()
    {
        return;
    }

    public static boolean isGooglePlayServicesUid(android.content.Context p2, int p3)
    {
        if (com.google.android.gms.common.util.UidVerifier.uidHasPackageName(p2, p3, "com.google.android.gms")) {
            try {
                return com.google.android.gms.common.GoogleSignatureVerifier.getInstance(p2).isGooglePublicSignedPackage(p2.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                if (android.util.Log.isLoggable("UidVerifier", 3)) {
                    android.util.Log.d("UidVerifier", "Package manager can\'t find google play services package, defaulting to false");
                }
            }
        }
        return 0;
    }

    public static boolean uidHasPackageName(android.content.Context p0, int p1, String p2)
    {
        return com.google.android.gms.common.wrappers.Wrappers.packageManager(p0).zza(p1, p2);
    }
}
