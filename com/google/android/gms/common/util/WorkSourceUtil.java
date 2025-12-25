package com.google.android.gms.common.util;
public class WorkSourceUtil {
    private static final int zza;
    private static final reflect.Method zzb;
    private static final reflect.Method zzc;
    private static final reflect.Method zzd;
    private static final reflect.Method zze;
    private static final reflect.Method zzf;
    private static final reflect.Method zzg;
    private static final reflect.Method zzh;
    private static final reflect.Method zzi;
    private static Boolean zzj;

    static WorkSourceUtil()
    {
        Class v2 = Integer.TYPE;
        com.google.android.gms.common.util.WorkSourceUtil.zza = android.os.Process.myUid();
        try {
            String v5_0 = android.os.WorkSource.getMethod("add", new Class[] {v2}));
        } catch (Exception) {
            v5_0 = 0;
        }
        com.google.android.gms.common.util.WorkSourceUtil.zzb = v5_0;
        try {
            int v1_1 = android.os.WorkSource.getMethod("add", new Class[] {v2, String}));
        } catch (Exception) {
            v1_1 = 0;
        }
        com.google.android.gms.common.util.WorkSourceUtil.zzc = v1_1;
        try {
            int v1_3 = android.os.WorkSource.getMethod("size", 0);
        } catch (Exception) {
            v1_3 = 0;
        }
        com.google.android.gms.common.util.WorkSourceUtil.zzd = v1_3;
        try {
            int v1_5 = android.os.WorkSource.getMethod("get", new Class[] {v2}));
        } catch (Exception) {
            v1_5 = 0;
        }
        com.google.android.gms.common.util.WorkSourceUtil.zze = v1_5;
        try {
            int v1_7 = android.os.WorkSource.getMethod("getName", new Class[] {v2}));
        } catch (Exception) {
            v1_7 = 0;
        }
        int v1_10;
        com.google.android.gms.common.util.WorkSourceUtil.zzf = v1_7;
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
            v1_10 = 0;
        } else {
            try {
                v1_10 = android.os.WorkSource.getMethod("createWorkChain", 0);
            } catch (int v1_11) {
                android.util.Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", v1_11);
            }
        }
        int v0_2;
        com.google.android.gms.common.util.WorkSourceUtil.zzg = v1_10;
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
            v0_2 = 0;
        } else {
            try {
                v0_2 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", new Class[] {v2, String}));
            } catch (int v0_3) {
                android.util.Log.w("WorkSourceUtil", "Missing WorkChain class", v0_3);
            }
        }
        int v0_6;
        com.google.android.gms.common.util.WorkSourceUtil.zzh = v0_2;
        try {
            if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
                v0_6 = 0;
            } else {
                v0_6 = android.os.WorkSource.getMethod("isEmpty", 0);
                v0_6.setAccessible(1);
            }
        } catch (Exception) {
        } catch (Exception) {
        }
        com.google.android.gms.common.util.WorkSourceUtil.zzi = v0_6;
        com.google.android.gms.common.util.WorkSourceUtil.zzj = 0;
        return;
    }

    private WorkSourceUtil()
    {
        return;
    }

    public static void add(android.os.WorkSource p3, int p4, String p5)
    {
        reflect.Method v0 = com.google.android.gms.common.util.WorkSourceUtil.zzc;
        if (v0 == null) {
            String v5_1 = com.google.android.gms.common.util.WorkSourceUtil.zzb;
            if (v5_1 != null) {
                try {
                    v5_1.invoke(p3, new Object[] {Integer.valueOf(p4)}));
                    return;
                } catch (Exception v3_1) {
                    android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", v3_1);
                }
            }
            return;
        } else {
            if (p5 == null) {
                p5 = "";
            }
            try {
                v0.invoke(p3, new Object[] {Integer.valueOf(p4), p5}));
                return;
            } catch (Exception v3_2) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", v3_2);
                return;
            }
        }
    }

    public static android.os.WorkSource fromPackage(android.content.Context p3, String p4)
    {
        if ((p3 != 0) && ((p3.getPackageManager() != null) && (p4 != null))) {
            try {
                int v3_1 = com.google.android.gms.common.wrappers.Wrappers.packageManager(p3).getApplicationInfo(p4, 0);
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                android.util.Log.e("WorkSourceUtil", "Could not find package: ".concat(p4));
            }
            if (v3_1 != 0) {
                int v3_4 = v3_1.uid;
                android.os.WorkSource v0_2 = new android.os.WorkSource();
                com.google.android.gms.common.util.WorkSourceUtil.add(v0_2, v3_4, p4);
                return v0_2;
            } else {
                android.util.Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(p4));
                return 0;
            }
        }
        return 0;
    }

    public static android.os.WorkSource fromPackageAndModuleExperimentalPi(android.content.Context p5, String p6, String p7)
    {
        if ((p5 != null) && ((p5.getPackageManager() != null) && ((p7 != null) && (p6 != null)))) {
            Integer v2_0 = -1;
            try {
                android.os.WorkSource v5_2 = com.google.android.gms.common.wrappers.Wrappers.packageManager(p5).getApplicationInfo(p6, 0);
            } catch (android.content.pm.PackageManager$NameNotFoundException) {
                android.util.Log.e("WorkSourceUtil", "Could not find package: ".concat(p6));
                if (v2_0 >= null) {
                    android.os.WorkSource v5_8 = new android.os.WorkSource();
                    int v3_1 = com.google.android.gms.common.util.WorkSourceUtil.zzg;
                    if (v3_1 == 0) {
                        com.google.android.gms.common.util.WorkSourceUtil.add(v5_8, v2_0, p6);
                    } else {
                        reflect.Method v4 = com.google.android.gms.common.util.WorkSourceUtil.zzh;
                        if (v4 != null) {
                            Object v0_1 = v3_1.invoke(v5_8, 0);
                            int v3_2 = com.google.android.gms.common.util.WorkSourceUtil.zza;
                            if (v2_0 != v3_2) {
                                v4.invoke(v0_1, new Object[] {Integer.valueOf(v2_0), p6}));
                            }
                            v4.invoke(v0_1, new Object[] {Integer.valueOf(v3_2), p7}));
                        }
                    }
                    return v5_8;
                } else {
                    return 0;
                }
            }
            if (v5_2 != null) {
                v2_0 = v5_2.uid;
            } else {
                android.util.Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(p6));
            }
        } else {
            android.util.Log.w("WorkSourceUtil", "Unexpected null arguments");
            return 0;
        }
    }

    public static int get(android.os.WorkSource p1, int p2)
    {
        String v0_0 = com.google.android.gms.common.util.WorkSourceUtil.zze;
        if (v0_0 != null) {
            try {
                Exception v1_4 = v0_0.invoke(p1, new Object[] {Integer.valueOf(p2)}));
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_4);
                return ((Integer) v1_4).intValue();
            } catch (Exception v1_2) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", v1_2);
            }
        }
        return 0;
    }

    public static String getName(android.os.WorkSource p1, int p2)
    {
        String v0_0 = com.google.android.gms.common.util.WorkSourceUtil.zzf;
        if (v0_0 != null) {
            try {
                return ((String) v0_0.invoke(p1, new Object[] {Integer.valueOf(p2)})));
            } catch (Exception v1_1) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", v1_1);
            }
        }
        return 0;
    }

    public static java.util.List getNames(android.os.WorkSource p5)
    {
        int v2;
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        int v1 = 0;
        if (p5 != null) {
            v2 = com.google.android.gms.common.util.WorkSourceUtil.size(p5);
        } else {
            v2 = 0;
        }
        if (v2 != 0) {
            while (v1 < v2) {
                String v3 = com.google.android.gms.common.util.WorkSourceUtil.getName(p5, v1);
                if (!com.google.android.gms.common.util.Strings.isEmptyOrWhitespace(v3)) {
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v3);
                    v0_1.add(v3);
                }
                v1++;
            }
        }
        return v0_1;
    }

    public static declared_synchronized boolean hasWorkSourcePermission(android.content.Context p3)
    {
        int v1_0 = com.google.android.gms.common.util.WorkSourceUtil.zzj;
        if (v1_0 == 0) {
            int v1_1 = 0;
            if (p3 != null) {
                if (e0.c.checkSelfPermission(p3, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                    v1_1 = 1;
                }
                com.google.android.gms.common.util.WorkSourceUtil.zzj = Boolean.valueOf(v1_1);
                return v1_1;
            } else {
                return 0;
            }
        } else {
            return v1_0.booleanValue();
        }
    }

    public static boolean isEmpty(android.os.WorkSource p3)
    {
        Exception v0_0 = com.google.android.gms.common.util.WorkSourceUtil.zzi;
        if (v0_0 != null) {
            try {
                Exception v0_2 = v0_0.invoke(p3, 0);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_2);
                p3 = ((Boolean) v0_2).booleanValue();
                return p3;
            } catch (Exception v0_1) {
                android.util.Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", v0_1);
            }
        }
        if (com.google.android.gms.common.util.WorkSourceUtil.size(p3) != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int size(android.os.WorkSource p2)
    {
        String v0_0 = com.google.android.gms.common.util.WorkSourceUtil.zzd;
        if (v0_0 != null) {
            try {
                Exception v2_3 = v0_0.invoke(p2, 0);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_3);
                return ((Integer) v2_3).intValue();
            } catch (Exception v2_1) {
                android.util.Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", v2_1);
            }
        }
        return 0;
    }
}
