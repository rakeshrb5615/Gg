package com.google.android.gms.internal.measurement;
public final class zzjz {
    private static volatile l4.d zza;

    private zzjz()
    {
        return;
    }

    public static l4.d zza(android.content.Context p16)
    {
        Throwable v0_0 = com.google.android.gms.internal.measurement.zzjz.zza;
        if (v0_0 != null) {
            return v0_0;
        } else {
            Throwable v0_4 = com.google.android.gms.internal.measurement.zzjz.zza;
            if (v0_4 == null) {
                Throwable v0_22 = android.os.Build.TYPE;
                l4.e v2_6 = android.os.Build.TAGS;
                if (v0_22.equals("eng")) {
                    if (!v2_6.contains("dev-keys")) {
                        if (!v2_6.contains("test-keys")) {
                            v0_4 = l4.a.a;
                            com.google.android.gms.internal.measurement.zzjz.zza = v0_4;
                            return v0_4;
                        } else {
                        }
                    }
                    if ((!com.google.android.gms.internal.measurement.zzjm.zza()) || (p16.isDeviceProtectedStorage())) {
                        l4.e v2_5 = p16;
                    } else {
                        v2_5 = p16.createDeviceProtectedStorageContext();
                    }
                    android.os.StrictMode$ThreadPolicy v3_2 = android.os.StrictMode.allowThreadDiskReads();
                    android.os.StrictMode.allowThreadDiskWrites();
                    int v4_4 = 0;
                    Throwable v0_19 = new java.io.File(v2_5.getDir("phenotype_hermetic", 0), "overrides.txt");
                    String v5_3;
                    if (!v0_19.exists()) {
                        v5_3 = l4.a.a;
                        l4.e v2_1;
                        if (!v5_3.b()) {
                            v2_1 = l4.a.a;
                        } else {
                            Throwable v0_24 = ((java.io.File) v5_3.a());
                            try {
                                java.io.BufferedReader v8_1 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(v0_24)));
                            } catch (Throwable v0_9) {
                                throw new RuntimeException(v0_9);
                            }
                            r.j v9_3 = new r.j(0);
                            StringBuilder v10_3 = new java.util.HashMap();
                            while(true) {
                                String v11_5 = v8_1.readLine();
                                if (v11_5 == null) {
                                    break;
                                }
                                int v12_1 = v11_5.split(" ", 3);
                                if (v12_1.length == 3) {
                                    String v13_2 = new String(v12_1[v4_4]);
                                    String v11_3 = android.net.Uri.decode(new String(v12_1[1]));
                                    String v15_2 = ((String) v10_3.get(v12_1[2]));
                                    if (v15_2 == null) {
                                        String v14_5 = new String(v12_1[2]);
                                        v15_2 = android.net.Uri.decode(v14_5);
                                        if ((v15_2.length() < 1024) || (v15_2 == v14_5)) {
                                            v10_3.put(v14_5, v15_2);
                                        }
                                    }
                                    int v12_4;
                                    int v4_2 = ((r.j) v9_3.get(v13_2));
                                    if (v4_2 != 0) {
                                        v12_4 = 0;
                                    } else {
                                        v12_4 = 0;
                                        v4_2 = new r.j(0);
                                        v9_3.put(v13_2, v4_2);
                                    }
                                    v4_2.put(v11_3, v15_2);
                                    v4_4 = v12_4;
                                } else {
                                    String v14_7 = new StringBuilder((v11_5.length() + 9));
                                    v14_7.append("Invalid: ");
                                    v14_7.append(v11_5);
                                    android.util.Log.e("HermeticFileOverrides", v14_7.toString());
                                }
                            }
                            Throwable v0_25 = v0_24.toString();
                            l4.e v2_7 = v2_5.getPackageName();
                            StringBuilder v10_7 = new StringBuilder(((v0_25.length() + 28) + String.valueOf(v2_7).length()));
                            v10_7.append("Parsed ");
                            v10_7.append(v0_25);
                            v10_7.append(" for Android package ");
                            v10_7.append(v2_7);
                            android.util.Log.w("HermeticFileOverrides", v10_7.toString());
                            Throwable v0_3 = new com.google.android.gms.internal.measurement.zzjt(v9_3);
                            v8_1.close();
                            v2_1 = new l4.e(v0_3);
                        }
                        android.os.StrictMode.setThreadPolicy(v3_2);
                        v0_4 = v2_1;
                    } else {
                        v5_3 = new l4.e(v0_19);
                    }
                } else {
                    if (!v0_22.equals("userdebug")) {
                    } else {
                    }
                }
            }
            return v0_4;
        }
    }
}
