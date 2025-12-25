package com.google.android.gms.common.util;
public class ClientLibraryUtils {

    private ClientLibraryUtils()
    {
        return;
    }

    public static int getClientVersion(android.content.Context p1, String p2)
    {
        int v1_1 = com.google.android.gms.common.util.ClientLibraryUtils.getPackageInfo(p1, p2);
        if (v1_1 != 0) {
            int v1_3 = v1_1.applicationInfo;
            if (v1_3 != 0) {
                int v1_4 = v1_3.metaData;
                if (v1_4 != 0) {
                    return v1_4.getInt("com.google.android.gms.version", -1);
                }
            }
        }
        return -1;
    }

    public static android.content.pm.PackageInfo getPackageInfo(android.content.Context p1, String p2)
    {
        try {
            return com.google.android.gms.common.wrappers.Wrappers.packageManager(p1).getPackageInfo(p2, 128);
        } catch (android.content.pm.PackageManager$NameNotFoundException) {
            return 0;
        }
    }

    public static boolean isPackageSide()
    {
        return 0;
    }
}
