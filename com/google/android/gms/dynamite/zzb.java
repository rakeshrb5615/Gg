package com.google.android.gms.dynamite;
public final class zzb {
    private static ClassLoader zza;
    private static Thread zzb;

    public static declared_synchronized ClassLoader zza()
    {
        if (com.google.android.gms.dynamite.zzb.zza == null) {
            String v1_5 = "Failed to get thread context classloader ";
            ClassLoader v3 = 0;
            if (com.google.android.gms.dynamite.zzb.zzb != null) {
                try {
                    v3 = com.google.android.gms.dynamite.zzb.zzb.getContextClassLoader();
                } catch (String v4_2) {
                    String v4_3 = v4_2.getMessage();
                    SecurityException v7_3 = new StringBuilder((String.valueOf(v4_3).length() + 41));
                    v7_3.append(v1_5);
                    v7_3.append(v4_3);
                    android.util.Log.w("DynamiteLoaderV2CL", v7_3.toString());
                }
            } else {
                SecurityException v2_10;
                SecurityException v2_1 = android.os.Looper.getMainLooper().getThread().getThreadGroup();
                String v4_0 = "Failed to enumerate thread/threadgroup ";
                if (v2_1 != null) {
                    SecurityException v6_0 = v2_1.activeGroupCount();
                    SecurityException v7_0 = new ThreadGroup[v6_0];
                    v2_1.enumerate(v7_0);
                    int v8_0 = 0;
                    boolean v9_0 = 0;
                    while (v9_0 < v6_0) {
                        ThreadGroup v10_0 = v7_0[v9_0];
                        if (!"dynamiteLoader".equals(v10_0.getName())) {
                            v9_0++;
                        } else {
                        }
                        if (v10_0 == null) {
                            v10_0 = new ThreadGroup(v2_1, "dynamiteLoader");
                        }
                        SecurityException v2_2 = v10_0.activeCount();
                        SecurityException v6_2 = new Thread[v2_2];
                        v10_0.enumerate(v6_2);
                        while (v8_0 < v2_2) {
                            SecurityException v7_1 = v6_2[v8_0];
                            if (!"GmsDynamite".equals(v7_1.getName())) {
                                v8_0++;
                            }
                            if (v7_1 != null) {
                                v2_10 = v7_1;
                            } else {
                                try {
                                    SecurityException v2_5 = new com.google.android.gms.dynamite.zza(v10_0, "GmsDynamite");
                                    try {
                                        v2_5.setContextClassLoader(0);
                                        v2_5.start();
                                        v7_1 = v2_5;
                                    } catch (SecurityException v6_4) {
                                        v7_1 = v2_5;
                                        SecurityException v6_5 = v6_4.getMessage();
                                        boolean v9_4 = new StringBuilder((String.valueOf(v6_5).length() + 39));
                                        v9_4.append(v4_0);
                                        v9_4.append(v6_5);
                                        v4_0 = v9_4.toString();
                                        android.util.Log.w("DynamiteLoaderV2CL", v4_0);
                                    }
                                } catch (SecurityException v2_6) {
                                    v6_4 = v2_6;
                                }
                            }
                        }
                        v7_1 = 0;
                    }
                    v10_0 = 0;
                } else {
                    v2_10 = 0;
                }
                com.google.android.gms.dynamite.zzb.zzb = v2_10;
                if (v2_10 != null) {
                }
            }
            com.google.android.gms.dynamite.zzb.zza = v3;
        }
        return com.google.android.gms.dynamite.zzb.zza;
    }
}
