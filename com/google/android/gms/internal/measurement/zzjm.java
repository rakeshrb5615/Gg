package com.google.android.gms.internal.measurement;
public final class zzjm {
    private static android.os.UserManager zza;
    private static volatile boolean zzb;

    static zzjm()
    {
        com.google.android.gms.internal.measurement.zzjm.zzb = (com.google.android.gms.internal.measurement.zzjm.zza() ^ 1);
        return;
    }

    private zzjm()
    {
        return;
    }

    public static boolean zza()
    {
        return 1;
    }

    public static boolean zzb(android.content.Context p1)
    {
        if ((!com.google.android.gms.internal.measurement.zzjm.zza()) || (com.google.android.gms.internal.measurement.zzjm.zzd(p1))) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean zzc(android.content.Context p1)
    {
        if ((com.google.android.gms.internal.measurement.zzjm.zza()) && (!com.google.android.gms.internal.measurement.zzjm.zzd(p1))) {
            return 0;
        } else {
            return 1;
        }
    }

    private static boolean zzd(android.content.Context p7)
    {
        if (!com.google.android.gms.internal.measurement.zzjm.zzb) {
            if (!com.google.android.gms.internal.measurement.zzjm.zzb) {
                int v2_0 = 1;
                while(true) {
                    String v5_1 = 0;
                    if (v2_0 > 2) {
                        if (v5_1 != null) {
                            com.google.android.gms.internal.measurement.zzjm.zza = 0;
                        }
                    } else {
                        if (com.google.android.gms.internal.measurement.zzjm.zza == null) {
                            com.google.android.gms.internal.measurement.zzjm.zza = ((android.os.UserManager) p7.getSystemService(android.os.UserManager));
                        }
                        NullPointerException v3_4 = com.google.android.gms.internal.measurement.zzjm.zza;
                        if (v3_4 != null) {
                            try {
                                if ((v3_4.isUserUnlocked()) || (!v3_4.isUserRunning(android.os.Process.myUserHandle()))) {
                                    break;
                                }
                            } catch (NullPointerException v3_5) {
                                android.util.Log.w("DirectBootUtils", "Failed to check if user is unlocked.", v3_5);
                                com.google.android.gms.internal.measurement.zzjm.zza = 0;
                                v2_0++;
                            }
                        } else {
                            v5_1 = 1;
                        }
                    }
                    if (v5_1 != null) {
                        com.google.android.gms.internal.measurement.zzjm.zzb = 1;
                    }
                    return v5_1;
                }
                v5_1 = 1;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}
