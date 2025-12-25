package com.google.android.gms.internal.auth;
public final class zzcc {
    private static android.os.UserManager zza;
    private static volatile boolean zzb;

    static zzcc()
    {
        com.google.android.gms.internal.auth.zzcc.zzb = (com.google.android.gms.internal.auth.zzcc.zzb() ^ 1);
        return;
    }

    private zzcc()
    {
        return;
    }

    public static boolean zza(android.content.Context p8)
    {
        if ((com.google.android.gms.internal.auth.zzcc.zzb()) && (!com.google.android.gms.internal.auth.zzcc.zzb)) {
            if (!com.google.android.gms.internal.auth.zzcc.zzb) {
                int v3 = 1;
                while (v3 <= 2) {
                    if (com.google.android.gms.internal.auth.zzcc.zza == null) {
                        com.google.android.gms.internal.auth.zzcc.zza = ((android.os.UserManager) p8.getSystemService(android.os.UserManager));
                    }
                    NullPointerException v4_5 = com.google.android.gms.internal.auth.zzcc.zza;
                    if (v4_5 != null) {
                        try {
                            if ((!v4_5.isUserUnlocked()) && (v4_5.isUserRunning(android.os.Process.myUserHandle()))) {
                                break;
                            }
                            int v8_2 = 1;
                            if (v8_2 != 0) {
                                com.google.android.gms.internal.auth.zzcc.zza = 0;
                            }
                        } catch (NullPointerException v4_6) {
                            android.util.Log.w("DirectBootUtils", "Failed to check if user is unlocked.", v4_6);
                            com.google.android.gms.internal.auth.zzcc.zza = 0;
                            v3++;
                        }
                    } else {
                        v8_2 = 1;
                    }
                    if (v8_2 != 0) {
                        com.google.android.gms.internal.auth.zzcc.zzb = 1;
                    }
                    if (v8_2 == 0) {
                        return 1;
                    }
                }
                v8_2 = 0;
            } else {
            }
        }
        return 0;
    }

    public static boolean zzb()
    {
        return 1;
    }
}
