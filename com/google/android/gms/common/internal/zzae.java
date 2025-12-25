package com.google.android.gms.common.internal;
public final class zzae {
    private static final Object zza;
    private static boolean zzb;
    private static String zzc;
    private static int zzd;

    static zzae()
    {
        com.google.android.gms.common.internal.zzae.zza = new Object();
        return;
    }

    public static String zza(android.content.Context p0)
    {
        com.google.android.gms.common.internal.zzae.zzc(p0);
        return com.google.android.gms.common.internal.zzae.zzc;
    }

    public static int zzb(android.content.Context p0)
    {
        com.google.android.gms.common.internal.zzae.zzc(p0);
        return com.google.android.gms.common.internal.zzae.zzd;
    }

    private static void zzc(android.content.Context p3)
    {
        if (!com.google.android.gms.common.internal.zzae.zzb) {
            com.google.android.gms.common.internal.zzae.zzb = 1;
            try {
                int v3_2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(p3).getApplicationInfo(p3.getPackageName(), 128).metaData;
            } catch (int v3_4) {
                android.util.Log.wtf("MetadataValueReader", "This should never happen.", v3_4);
                return;
            }
            if (v3_2 != 0) {
                com.google.android.gms.common.internal.zzae.zzc = v3_2.getString("com.google.app.id");
                com.google.android.gms.common.internal.zzae.zzd = v3_2.getInt("com.google.android.gms.version");
                return;
            } else {
                return;
            }
        } else {
            return;
        }
    }
}
