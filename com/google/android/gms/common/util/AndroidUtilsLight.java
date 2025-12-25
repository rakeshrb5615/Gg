package com.google.android.gms.common.util;
public class AndroidUtilsLight {
    public static final synthetic int zza = 0;
    private static volatile int zzb = 255;
    private static volatile com.google.android.gms.common.util.zza zzc;
    private static final Object zzd;

    static AndroidUtilsLight()
    {
        com.google.android.gms.common.util.AndroidUtilsLight.zzd = new Object();
        return;
    }

    public AndroidUtilsLight()
    {
        return;
    }

    public static byte[] getPackageCertificateHashBytes(android.content.Context p1, String p2)
    {
        byte[] v1_7 = com.google.android.gms.common.wrappers.Wrappers.packageManager(p1).getPackageInfo(p2, 64);
        java.security.MessageDigest v2_3 = v1_7.signatures;
        if ((v2_3 != null) && (v2_3.length == 1)) {
            java.security.MessageDigest v2_2 = com.google.android.gms.common.util.AndroidUtilsLight.zza("SHA1");
            if (v2_2 != null) {
                return v2_2.digest(v1_7.signatures[0].toByteArray());
            }
        }
        return 0;
    }

    public static java.security.MessageDigest zza(String p2)
    {
        int v0 = 0;
        while (v0 < 2) {
            try {
                java.security.MessageDigest v1_1 = java.security.MessageDigest.getInstance(p2);
            } catch (java.security.NoSuchAlgorithmException) {
                v0++;
            }
            if (v1_1 != null) {
                return v1_1;
            }
        }
        return 0;
    }
}
