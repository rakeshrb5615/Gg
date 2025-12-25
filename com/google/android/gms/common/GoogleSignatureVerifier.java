package com.google.android.gms.common;
public class GoogleSignatureVerifier {
    private static com.google.android.gms.common.GoogleSignatureVerifier zza;
    private static volatile java.util.Set zzd;
    private static volatile java.util.Set zze;
    private final android.content.Context zzb;
    private volatile String zzc;

    public GoogleSignatureVerifier(android.content.Context p1)
    {
        this.zzb = p1.getApplicationContext();
        return;
    }

    public static com.google.android.gms.common.GoogleSignatureVerifier getInstance(android.content.Context p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        if (com.google.android.gms.common.GoogleSignatureVerifier.zza == null) {
            com.google.android.gms.common.zzo.zza(p2);
            com.google.android.gms.common.GoogleSignatureVerifier.zza = new com.google.android.gms.common.GoogleSignatureVerifier(p2);
        }
        return com.google.android.gms.common.GoogleSignatureVerifier.zza;
    }

    public static final boolean zza(android.content.pm.PackageInfo p10, boolean p11)
    {
        if (p10 != null) {
            if ((p11 != null) && (("com.android.vending".equals(p10.packageName)) || ("com.google.android.gms".equals(p10.packageName)))) {
                com.google.android.gms.common.zzj[] v11_5 = p10.applicationInfo;
                if ((v11_5 == null) || ((v11_5.flags & 129) == 0)) {
                    p11 = 0;
                } else {
                    p11 = 1;
                }
            }
            try {
                String v2_2;
                if (p11 == null) {
                    v2_2 = com.google.android.gms.common.zzn.zzb;
                } else {
                    v2_2 = com.google.android.gms.common.zzn.zzc;
                }
            } catch (IllegalArgumentException) {
                android.util.Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if (p11 == null) {
                    com.google.android.gms.common.zzj v10_1 = com.google.android.gms.common.GoogleSignatureVerifier.zzc(p10, new com.google.android.gms.common.zzj[] {com.google.android.gms.common.zzn.zza[0]}));
                } else {
                    v10_1 = com.google.android.gms.common.GoogleSignatureVerifier.zzc(p10, com.google.android.gms.common.zzn.zza);
                }
                if (v10_1 == null) {
                    return 0;
                } else {
                    return 1;
                }
            }
            com.google.android.gms.internal.common.zzah v3_6;
            com.google.android.gms.internal.common.zzah v3_2 = android.os.Build$VERSION.SDK_INT;
            if (v3_2 >= 28) {
                com.google.android.gms.internal.common.zzah v3_3;
                if (v3_2 < 28) {
                    v3_3 = 0;
                } else {
                    v3_3 = 1;
                }
                com.google.android.gms.internal.common.zzr.zza(v3_3);
                com.google.android.gms.internal.common.zzah v3_4 = a5.t.c(p10);
                if ((v3_4 != null) && (!v3_4.hasMultipleSigners())) {
                    if (v3_4.getSigningCertificateHistory() != null) {
                        com.google.android.gms.internal.common.zzad v4_4 = new com.google.android.gms.internal.common.zzad();
                        com.google.android.gms.internal.common.zzah v3_5 = v3_4.getSigningCertificateHistory();
                        int v5_0 = v3_5.length;
                        int v6_0 = 0;
                        while (v6_0 < v5_0) {
                            v4_4.zzb(v3_5[v6_0].toByteArray());
                            v6_0++;
                        }
                        v3_6 = v4_4.zzd();
                        if (v3_6.isEmpty()) {
                            throw new IllegalArgumentException("Unable to obtain package certificate history.");
                        } else {
                            com.google.android.gms.internal.common.zzah v3_12 = v3_6.zzh();
                            com.google.android.gms.internal.common.zzad v4_7 = v3_12.size();
                            int v5_2 = 0;
                            while (v5_2 < v4_7) {
                                int v6_2 = ((byte[]) v3_12.get(v5_2));
                                byte[] v7_2 = v2_2.zzr(0);
                                while (v7_2.hasNext()) {
                                    if (java.util.Arrays.equals(v6_2, ((byte[]) v7_2.next()))) {
                                        return 1;
                                    }
                                }
                                v5_2++;
                            }
                            return 0;
                        }
                    } else {
                    }
                }
                v3_6 = com.google.android.gms.internal.common.zzah.zzj();
            } else {
                com.google.android.gms.internal.common.zzah v3_8 = p10.signatures;
                com.google.android.gms.internal.common.zzad v4_5 = 0;
                if ((v3_8 != null) && (v3_8.length == 1)) {
                    v4_5 = v3_8[0].toByteArray();
                }
                if (v4_5 == null) {
                    v3_6 = com.google.android.gms.internal.common.zzah.zzj();
                } else {
                    v3_6 = com.google.android.gms.internal.common.zzah.zzk(v4_5);
                }
            }
        } else {
            return 0;
        }
    }

    private final com.google.android.gms.common.zzy zzb(String p6, boolean p7, boolean p8)
    {
        if (p6 != null) {
            if (p6.equals(this.zzc)) {
                return com.google.android.gms.common.zzy.zzb();
            } else {
                int v8_0 = android.os.StrictMode.allowThreadDiskReads();
                try {
                    com.google.android.gms.common.zzy v7_8;
                    com.google.android.gms.common.zzo.zzb();
                    com.google.android.gms.common.zzy v1_1 = com.google.android.gms.common.zzo.zzg.zzg();
                    android.os.StrictMode.setThreadPolicy(v8_0);
                } catch (com.google.android.gms.common.zzy v1_2) {
                    android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", v1_2);
                    android.os.StrictMode.setThreadPolicy(v8_0);
                    int v8_3;
                    if (android.os.Build$VERSION.SDK_INT < 28) {
                        v8_3 = 64;
                    } else {
                        v8_3 = 134217792;
                    }
                    try {
                        int v8_4 = this.zzb.getPackageManager().getPackageInfo(p6, v8_3);
                        com.google.android.gms.common.zzy v1_7 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb);
                    } catch (com.google.android.gms.common.zzy v7_1) {
                        return com.google.android.gms.common.zzy.zzd("no pkg ".concat(p6), v7_1);
                    }
                    if (v8_4 != 0) {
                        com.google.android.gms.common.zzy v7_2 = v8_4.signatures;
                        if ((v7_2 != null) && (v7_2.length == 1)) {
                            com.google.android.gms.common.zzy v7_5 = new com.google.android.gms.common.zzk(v8_4.signatures[0].toByteArray());
                            String v2_4 = v8_4.packageName;
                            com.google.android.gms.common.zzy v1_8 = com.google.android.gms.common.zzo.zzd(v2_4, v7_5, v1_7, 0);
                            if (v1_8.zza) {
                                int v8_7 = v8_4.applicationInfo;
                                if ((v8_7 != 0) && (((v8_7.flags & 2) != 0) && (com.google.android.gms.common.zzo.zzd(v2_4, v7_5, 0, 1).zza))) {
                                    v7_8 = com.google.android.gms.common.zzy.zzc("debuggable release cert app rejected");
                                    if (v7_8.zza) {
                                        this.zzc = p6;
                                    }
                                    return v7_8;
                                }
                            }
                            v7_8 = v1_8;
                        } else {
                            v7_8 = com.google.android.gms.common.zzy.zzc("single cert required");
                        }
                    } else {
                        v7_8 = com.google.android.gms.common.zzy.zzc("null pkg");
                    }
                } catch (com.google.android.gms.common.zzy v1_2) {
                } catch (com.google.android.gms.common.zzy v6_2) {
                    android.os.StrictMode.setThreadPolicy(v8_0);
                    throw v6_2;
                }
                if (v1_1 == null) {
                } else {
                    com.google.android.gms.common.zzy v7_12 = new com.google.android.gms.common.zzv(0);
                    v7_12.zza(p6);
                    v7_12.zzb(com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb));
                    v7_12.zzc(1);
                    v7_8 = com.google.android.gms.common.zzo.zzc(v7_12.zzd());
                }
            }
        } else {
            return com.google.android.gms.common.zzy.zzc("null pkg");
        }
    }

    private static varargs com.google.android.gms.common.zzj zzc(android.content.pm.PackageInfo p3, com.google.android.gms.common.zzj[] p4)
    {
        com.google.android.gms.common.zzk v0_0 = p3.signatures;
        if (v0_0 != null) {
            if (v0_0.length == 1) {
                int v2_0 = 0;
                com.google.android.gms.common.zzk v0_1 = new com.google.android.gms.common.zzk(p3.signatures[0].toByteArray());
                while (v2_0 < p4.length) {
                    if (!p4[v2_0].equals(v0_1)) {
                        v2_0++;
                    } else {
                        return p4[v2_0];
                    }
                }
            } else {
                android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return 0;
            }
        }
        return 0;
    }

    public boolean isGooglePublicSignedPackage(android.content.pm.PackageInfo p4)
    {
        if (p4 != null) {
            if (!com.google.android.gms.common.GoogleSignatureVerifier.zza(p4, 0)) {
                if (com.google.android.gms.common.GoogleSignatureVerifier.zza(p4, 1)) {
                    if (!com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzb)) {
                        android.util.Log.w("GoogleSignatureVerifier", "Test-keys aren\'t accepted on this build.");
                    } else {
                        return 1;
                    }
                }
                return 0;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public boolean isPackageGoogleSigned(String p2)
    {
        boolean v2_1 = this.zzb(p2, 0, 0);
        v2_1.zze();
        return v2_1.zza;
    }

    public boolean isUidGoogleSigned(int p6)
    {
        com.google.android.gms.common.zzy v2_1;
        boolean v6_3 = this.zzb.getPackageManager().getPackagesForUid(p6);
        if (!v6_3) {
            v2_1 = com.google.android.gms.common.zzy.zzc("no pkgs");
        } else {
            int v0_2 = v6_3.length;
            if (v0_2 != 0) {
                v2_1 = 0;
                int v3 = 0;
                while (v3 < v0_2) {
                    v2_1 = this.zzb(v6_3[v3], 0, 0);
                    if (!v2_1.zza) {
                        v3++;
                    }
                }
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_1);
            }
        }
        v2_1.zze();
        return v2_1.zza;
    }
}
