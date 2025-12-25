package com.google.android.gms.common.wrappers;
public class InstantApps {
    private static android.content.Context zza;
    private static Boolean zzb;

    public InstantApps()
    {
        return;
    }

    public static declared_synchronized boolean isInstantApp(android.content.Context p4)
    {
        android.content.Context v1 = p4.getApplicationContext();
        String v2_3 = com.google.android.gms.common.wrappers.InstantApps.zza;
        if (v2_3 != null) {
            Boolean v3 = com.google.android.gms.common.wrappers.InstantApps.zzb;
            if (v3 != null) {
                if (v2_3 == v1) {
                    return v3.booleanValue();
                } else {
                }
            }
        }
        com.google.android.gms.common.wrappers.InstantApps.zzb = 0;
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            p4.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
            com.google.android.gms.common.wrappers.InstantApps.zzb = Boolean.TRUE;
        } else {
            com.google.android.gms.common.wrappers.InstantApps.zzb = Boolean.valueOf(v1.getPackageManager().isInstantApp());
        }
        com.google.android.gms.common.wrappers.InstantApps.zza = v1;
        return com.google.android.gms.common.wrappers.InstantApps.zzb.booleanValue();
    }
}
