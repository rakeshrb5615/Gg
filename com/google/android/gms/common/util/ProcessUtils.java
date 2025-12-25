package com.google.android.gms.common.util;
public class ProcessUtils {
    private static String zza;
    private static int zzb;
    private static Boolean zzc;

    private ProcessUtils()
    {
        return;
    }

    public static String getMyProcessName()
    {
        if (com.google.android.gms.common.util.ProcessUtils.zza == null) {
            if (android.os.Build$VERSION.SDK_INT < 28) {
                Throwable v0_6 = com.google.android.gms.common.util.ProcessUtils.zzb;
                if (v0_6 == null) {
                    v0_6 = android.os.Process.myPid();
                    com.google.android.gms.common.util.ProcessUtils.zzb = v0_6;
                }
                java.io.BufferedReader v3 = 0;
                if (v0_6 > null) {
                    try {
                        StringBuilder v5_1 = new StringBuilder((String.valueOf(v0_6).length() + 14));
                        v5_1.append("/proc/");
                        v5_1.append(v0_6);
                        v5_1.append("/cmdline");
                        Throwable v0_2 = v5_1.toString();
                        android.os.StrictMode$ThreadPolicy v1_1 = android.os.StrictMode.allowThreadDiskReads();
                        try {
                            java.io.BufferedReader v2_2 = new java.io.BufferedReader(new java.io.FileReader(v0_2));
                        } catch (Throwable v0_3) {
                            android.os.StrictMode.setThreadPolicy(v1_1);
                            throw v0_3;
                        }
                        android.os.StrictMode.setThreadPolicy(v1_1);
                        try {
                            Throwable v0_5 = v2_2.readLine();
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_5);
                            v3 = v0_5.trim();
                        } catch (Throwable v0_4) {
                            v3 = v2_2;
                            com.google.android.gms.common.util.IOUtils.closeQuietly(v3);
                            throw v0_4;
                        }
                        com.google.android.gms.common.util.IOUtils.closeQuietly(v2_2);
                    } catch (java.io.IOException) {
                        v2_2 = 0;
                    } catch (Throwable v0_4) {
                    } catch (java.io.IOException) {
                    }
                }
                com.google.android.gms.common.util.ProcessUtils.zza = v3;
            } else {
                com.google.android.gms.common.util.ProcessUtils.zza = android.app.Application.getProcessName();
            }
        }
        return com.google.android.gms.common.util.ProcessUtils.zza;
    }

    public static boolean zza()
    {
        com.google.android.gms.internal.common.zzy v0_0 = com.google.android.gms.common.util.ProcessUtils.zzc;
        if (v0_0 == null) {
            if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastP()) {
                try {
                    com.google.android.gms.internal.common.zzi[] v3 = new com.google.android.gms.internal.common.zzi[0];
                    com.google.android.gms.internal.common.zzy v0_1 = com.google.android.gms.internal.common.zzj.zza(android.os.Process, "isIsolated", v3);
                    String v1_0 = new Object[0];
                } catch (ReflectiveOperationException) {
                    v0_0 = Boolean.FALSE;
                }
                if (v0_1 == null) {
                    throw new com.google.android.gms.internal.common.zzy(com.google.android.gms.internal.common.zzx.zza("expected a non-null reference", v1_0));
                } else {
                    v0_0 = ((Boolean) v0_1);
                }
            } else {
                v0_0 = Boolean.valueOf(android.os.Process.isIsolated());
            }
            com.google.android.gms.common.util.ProcessUtils.zzc = v0_0;
        }
        return v0_0.booleanValue();
    }
}
