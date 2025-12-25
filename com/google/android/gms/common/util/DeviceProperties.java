package com.google.android.gms.common.util;
public final class DeviceProperties {
    private static Boolean zza;
    private static Boolean zzb;
    private static Boolean zzc;
    private static Boolean zzd;
    private static Boolean zze;
    private static Boolean zzf;
    private static Boolean zzg;
    private static Boolean zzh;
    private static Boolean zzi;
    private static Boolean zzj;
    private static Boolean zzk;
    private static Boolean zzl;
    private static Boolean zzm;
    private static Boolean zzn;
    private static Boolean zzo;
    private static Boolean zzp;
    private static Boolean zzq;

    private DeviceProperties()
    {
        return;
    }

    public static boolean isAuto(android.content.Context p0)
    {
        return com.google.android.gms.common.util.DeviceProperties.zze(p0.getPackageManager());
    }

    public static boolean isBstar(android.content.Context p2)
    {
        if (com.google.android.gms.common.util.DeviceProperties.zzo == null) {
            int v1 = 0;
            if ((com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) && (p2.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE"))) {
                v1 = 1;
            }
            com.google.android.gms.common.util.DeviceProperties.zzo = Boolean.valueOf(v1);
        }
        return com.google.android.gms.common.util.DeviceProperties.zzo.booleanValue();
    }

    public static boolean isFoldable(android.content.Context p2)
    {
        if (com.google.android.gms.common.util.DeviceProperties.zzd == null) {
            int v1 = 0;
            if ((com.google.android.gms.common.util.PlatformVersion.isAtLeastR()) && (p2.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle"))) {
                v1 = 1;
            }
            com.google.android.gms.common.util.DeviceProperties.zzd = Boolean.valueOf(v1);
        }
        return com.google.android.gms.common.util.DeviceProperties.zzd.booleanValue();
    }

    public static boolean isLatchsky(android.content.Context p2)
    {
        if (com.google.android.gms.common.util.DeviceProperties.zzh == null) {
            Boolean v2_5 = p2.getPackageManager();
            int v1 = 0;
            if ((v2_5.hasSystemFeature("com.google.android.feature.services_updater")) && (v2_5.hasSystemFeature("cn.google.services"))) {
                v1 = 1;
            }
            com.google.android.gms.common.util.DeviceProperties.zzh = Boolean.valueOf(v1);
        }
        return com.google.android.gms.common.util.DeviceProperties.zzh.booleanValue();
    }

    public static boolean isPhone(android.content.Context p4)
    {
        if (com.google.android.gms.common.util.DeviceProperties.zza == null) {
            int v1 = 1;
            if (!com.google.android.gms.common.util.DeviceProperties.isFoldable(p4)) {
                if ((!com.google.android.gms.common.util.DeviceProperties.isTablet(p4)) && ((!com.google.android.gms.common.util.DeviceProperties.isWearable(p4)) && (!com.google.android.gms.common.util.DeviceProperties.zzd(p4)))) {
                    if (com.google.android.gms.common.util.DeviceProperties.zzk == null) {
                        com.google.android.gms.common.util.DeviceProperties.zzk = Boolean.valueOf(p4.getPackageManager().hasSystemFeature("org.chromium.arc"));
                    }
                    if ((!com.google.android.gms.common.util.DeviceProperties.zzk.booleanValue()) && ((!com.google.android.gms.common.util.DeviceProperties.isAuto(p4)) && (!com.google.android.gms.common.util.DeviceProperties.isTv(p4)))) {
                        if (com.google.android.gms.common.util.DeviceProperties.zzn == null) {
                            com.google.android.gms.common.util.DeviceProperties.zzn = Boolean.valueOf(p4.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                        }
                        if ((!com.google.android.gms.common.util.DeviceProperties.zzn.booleanValue()) && ((!com.google.android.gms.common.util.DeviceProperties.isBstar(p4)) && (!com.google.android.gms.common.util.DeviceProperties.isXr(p4)))) {
                            if (com.google.android.gms.common.util.DeviceProperties.zzq == null) {
                                com.google.android.gms.common.util.DeviceProperties.zzq = Boolean.valueOf(p4.getPackageManager().hasSystemFeature("com.google.desktop.gms"));
                            }
                            if (!com.google.android.gms.common.util.DeviceProperties.zzq.booleanValue()) {
                                com.google.android.gms.common.util.DeviceProperties.zza = Boolean.valueOf(v1);
                                return com.google.android.gms.common.util.DeviceProperties.zza.booleanValue();
                            }
                        }
                    }
                }
                v1 = 0;
            }
        }
        return com.google.android.gms.common.util.DeviceProperties.zza.booleanValue();
    }

    public static boolean isPhoneGo(android.content.Context p2)
    {
        int v0 = 0;
        if (p2 != 0) {
            if (com.google.android.gms.common.util.DeviceProperties.zzb == null) {
                if (com.google.android.gms.common.util.DeviceProperties.isPhone(p2)) {
                    if (com.google.android.gms.common.util.DeviceProperties.zzi == null) {
                        int v2_2 = ((android.app.ActivityManager) p2.getSystemService("activity"));
                        if (v2_2 != 0) {
                            com.google.android.gms.common.util.DeviceProperties.zzi = Boolean.valueOf(v2_2.isLowRamDevice());
                        }
                    }
                    if ((com.google.android.gms.common.internal.Objects.equal(com.google.android.gms.common.util.DeviceProperties.zzi, Boolean.TRUE)) && (android.os.Build$VERSION.SDK_INT >= 27)) {
                        v0 = 1;
                    }
                }
                com.google.android.gms.common.util.DeviceProperties.zzb = Boolean.valueOf(v0);
            }
            return com.google.android.gms.common.util.DeviceProperties.zzb.booleanValue();
        } else {
            return 0;
        }
    }

    public static boolean isSevenInchTablet(android.content.Context p0)
    {
        return com.google.android.gms.common.util.DeviceProperties.zza(p0.getResources());
    }

    public static boolean isSidewinder(android.content.Context p0)
    {
        return com.google.android.gms.common.util.DeviceProperties.zzc(p0);
    }

    public static boolean isTablet(android.content.Context p0)
    {
        return com.google.android.gms.common.util.DeviceProperties.isTablet(p0.getResources());
    }

    public static boolean isTablet(android.content.res.Resources p4)
    {
        int v0 = 0;
        if (p4 != null) {
            if (com.google.android.gms.common.util.DeviceProperties.zzc == null) {
                if (((p4.getConfiguration().screenLayout & 15) > 3) || (com.google.android.gms.common.util.DeviceProperties.zza(p4))) {
                    v0 = 1;
                }
                com.google.android.gms.common.util.DeviceProperties.zzc = Boolean.valueOf(v0);
            }
            return com.google.android.gms.common.util.DeviceProperties.zzc.booleanValue();
        } else {
            return 0;
        }
    }

    public static boolean isTv(android.content.Context p0)
    {
        return com.google.android.gms.common.util.DeviceProperties.zzf(p0.getPackageManager());
    }

    public static boolean isUserBuild()
    {
        return "user".equals(android.os.Build.TYPE);
    }

    public static boolean isWearable(android.content.Context p0)
    {
        return com.google.android.gms.common.util.DeviceProperties.zzb(p0.getPackageManager());
    }

    public static boolean isWearableWithoutPlayStore(android.content.Context p1)
    {
        if (((!com.google.android.gms.common.util.DeviceProperties.isWearable(p1)) || (com.google.android.gms.common.util.PlatformVersion.isAtLeastN())) && ((!com.google.android.gms.common.util.DeviceProperties.zzc(p1)) || ((com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) && (!com.google.android.gms.common.util.PlatformVersion.isAtLeastR())))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isXr(android.content.Context p0)
    {
        return com.google.android.gms.common.util.DeviceProperties.zzg(p0.getPackageManager());
    }

    public static boolean zza(android.content.res.Resources p3)
    {
        int v0 = 0;
        if (p3 != null) {
            if (com.google.android.gms.common.util.DeviceProperties.zze == null) {
                Boolean v3_5 = p3.getConfiguration();
                if (((v3_5.screenLayout & 15) <= 3) && (v3_5.smallestScreenWidthDp >= 600)) {
                    v0 = 1;
                }
                com.google.android.gms.common.util.DeviceProperties.zze = Boolean.valueOf(v0);
            }
            return com.google.android.gms.common.util.DeviceProperties.zze.booleanValue();
        } else {
            return 0;
        }
    }

    public static boolean zzb(android.content.pm.PackageManager p1)
    {
        if (com.google.android.gms.common.util.DeviceProperties.zzf == null) {
            com.google.android.gms.common.util.DeviceProperties.zzf = Boolean.valueOf(p1.hasSystemFeature("android.hardware.type.watch"));
        }
        return com.google.android.gms.common.util.DeviceProperties.zzf.booleanValue();
    }

    public static boolean zzc(android.content.Context p1)
    {
        if (com.google.android.gms.common.util.DeviceProperties.zzg == null) {
            com.google.android.gms.common.util.DeviceProperties.zzg = Boolean.valueOf(p1.getPackageManager().hasSystemFeature("cn.google"));
        }
        return com.google.android.gms.common.util.DeviceProperties.zzg.booleanValue();
    }

    public static boolean zzd(android.content.Context p1)
    {
        if (com.google.android.gms.common.util.DeviceProperties.zzj == null) {
            Boolean v1_2;
            if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
                v1_2 = p1.getPackageManager().hasSystemFeature("android.hardware.type.iot");
            } else {
                v1_2 = p1.getPackageManager().hasSystemFeature("android.hardware.type.embedded");
            }
            com.google.android.gms.common.util.DeviceProperties.zzj = Boolean.valueOf(v1_2);
        }
        return com.google.android.gms.common.util.DeviceProperties.zzj.booleanValue();
    }

    public static boolean zze(android.content.pm.PackageManager p2)
    {
        if (com.google.android.gms.common.util.DeviceProperties.zzl == null) {
            int v1 = 0;
            if ((com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) && (p2.hasSystemFeature("android.hardware.type.automotive"))) {
                v1 = 1;
            }
            com.google.android.gms.common.util.DeviceProperties.zzl = Boolean.valueOf(v1);
        }
        return com.google.android.gms.common.util.DeviceProperties.zzl.booleanValue();
    }

    public static boolean zzf(android.content.pm.PackageManager p2)
    {
        if (com.google.android.gms.common.util.DeviceProperties.zzm == null) {
            int v1 = 1;
            if ((!p2.hasSystemFeature("com.google.android.tv")) && ((!p2.hasSystemFeature("android.hardware.type.television")) && ((!p2.hasSystemFeature("android.software.leanback")) && (!p2.hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"))))) {
                v1 = 0;
            }
            com.google.android.gms.common.util.DeviceProperties.zzm = Boolean.valueOf(v1);
        }
        return com.google.android.gms.common.util.DeviceProperties.zzm.booleanValue();
    }

    public static boolean zzg(android.content.pm.PackageManager p1)
    {
        if (com.google.android.gms.common.util.DeviceProperties.zzp == null) {
            com.google.android.gms.common.util.DeviceProperties.zzp = Boolean.valueOf(p1.hasSystemFeature("android.software.xr.api.spatial"));
        }
        return com.google.android.gms.common.util.DeviceProperties.zzp.booleanValue();
    }
}
