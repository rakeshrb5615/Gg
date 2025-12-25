package com.google.android.gms.internal.auth;
public final class zzcp {
    private static volatile com.google.android.gms.internal.auth.zzdh zza;

    private zzcp()
    {
        return;
    }

    public static com.google.android.gms.internal.auth.zzdh zza(android.content.Context p13)
    {
        android.os.StrictMode$ThreadPolicy v1_0 = com.google.android.gms.internal.auth.zzcp.zza;
        if (v1_0 == null) {
            com.google.android.gms.internal.auth.zzdh v13_5;
            android.os.StrictMode$ThreadPolicy v1_8 = android.os.Build.TYPE;
            Object[] v2_5 = android.os.Build.TAGS;
            if (v1_8.equals("eng")) {
                if (!v2_5.contains("dev-keys")) {
                    if (!v2_5.contains("test-keys")) {
                        v13_5 = com.google.android.gms.internal.auth.zzdh.zzc();
                        v1_0 = v13_5;
                        com.google.android.gms.internal.auth.zzcp.zza = v1_0;
                        return v1_0;
                    } else {
                    }
                }
                if ((com.google.android.gms.internal.auth.zzcc.zzb()) && (!p13.isDeviceProtectedStorage())) {
                    p13 = p13.createDeviceProtectedStorageContext();
                }
                android.os.StrictMode$ThreadPolicy v1_9 = android.os.StrictMode.allowThreadDiskReads();
                android.os.StrictMode.allowThreadDiskWrites();
                reflect.Method v3_4 = new java.io.File(p13.getDir("phenotype_hermetic", 0), "overrides.txt");
                reflect.Method v3_6;
                if (!v3_4.exists()) {
                    v3_6 = com.google.android.gms.internal.auth.zzdh.zzc();
                    if (!v3_6.zzb()) {
                        v13_5 = com.google.android.gms.internal.auth.zzdh.zzc();
                    } else {
                        reflect.Method v3_9 = ((java.io.File) v3_6.zza());
                        try {
                            Class v4_7 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(v3_9)));
                        } catch (com.google.android.gms.internal.auth.zzdh v13_2) {
                            throw new RuntimeException(v13_2);
                        }
                        String v5_6 = new r.j(0);
                        String v6_3 = new java.util.HashMap();
                        while(true) {
                            String v7_5 = v4_7.readLine();
                            if (v7_5 == null) {
                                break;
                            }
                            r.j v8_1 = v7_5.split(" ", 3);
                            if (v8_1.length == 3) {
                                String v9_2 = new String(v8_1[0]);
                                String v7_3 = android.net.Uri.decode(new String(v8_1[1]));
                                String v11_2 = ((String) v6_3.get(v8_1[2]));
                                if (v11_2 == null) {
                                    String v10_5 = new String(v8_1[2]);
                                    v11_2 = android.net.Uri.decode(v10_5);
                                    if ((v11_2.length() < 1024) || (v11_2 == v10_5)) {
                                        v6_3.put(v10_5, v11_2);
                                    }
                                }
                                if (!v5_6.containsKey(v9_2)) {
                                    v5_6.put(v9_2, new r.j(0));
                                }
                                ((r.j) v5_6.get(v9_2)).put(v7_3, v11_2);
                            } else {
                                r.j v8_10 = new StringBuilder();
                                v8_10.append("Invalid: ");
                                v8_10.append(v7_5);
                                android.util.Log.e("HermeticFileOverrides", v8_10.toString());
                            }
                        }
                        Object[] v2_6 = v3_9.toString();
                        com.google.android.gms.internal.auth.zzdh v13_6 = p13.getPackageName();
                        reflect.Method v3_12 = new StringBuilder();
                        v3_12.append("Parsed ");
                        v3_12.append(v2_6);
                        v3_12.append(" for Android package ");
                        v3_12.append(v13_6);
                        android.util.Log.w("HermeticFileOverrides", v3_12.toString());
                        com.google.android.gms.internal.auth.zzdh v13_9 = new com.google.android.gms.internal.auth.zzci(v5_6);
                        v4_7.close();
                        v13_5 = com.google.android.gms.internal.auth.zzdh.zzd(v13_9);
                    }
                    android.os.StrictMode.setThreadPolicy(v1_9);
                } else {
                    v3_6 = com.google.android.gms.internal.auth.zzdh.zzd(v3_4);
                }
            } else {
                if (!v1_8.equals("userdebug")) {
                } else {
                }
            }
        }
        return v1_0;
    }
}
