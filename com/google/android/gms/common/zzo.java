package com.google.android.gms.common;
final class zzo {
    static final com.google.android.gms.common.zzm zza;
    static final com.google.android.gms.common.zzm zzb;
    static final com.google.android.gms.common.zzm zzc;
    static final com.google.android.gms.common.zzm zzd;
    static final com.google.android.gms.common.zzm zze;
    static final com.google.android.gms.common.zzm zzf;
    static volatile com.google.android.gms.common.internal.zzad zzg;
    public static final synthetic int zzh;
    private static final Object zzi;
    private static android.content.Context zzj;

    static zzo()
    {
        com.google.android.gms.common.zzo.zza = new com.google.android.gms.common.zzd(com.google.android.gms.common.zzj.zzf("0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u007f\u00a2f\u00fa\u00a7p\u0085xb\u00b1"));
        com.google.android.gms.common.zzo.zzb = new com.google.android.gms.common.zze(com.google.android.gms.common.zzj.zzf("0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014Q\u00d5\u00db\u0004\u00f7X\u00e7B\u0086<"));
        com.google.android.gms.common.zzo.zzc = new com.google.android.gms.common.zzf(com.google.android.gms.common.zzj.zzf("0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\u0008s\u00f9/\u008eQ\u00ed"));
        com.google.android.gms.common.zzo.zzd = new com.google.android.gms.common.zzg(com.google.android.gms.common.zzj.zzf("0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0003\u00a3\u00b2\u00ad\u00d7\u00e1r\u00cak\u00ec"));
        com.google.android.gms.common.zzo.zze = new com.google.android.gms.common.zzh(com.google.android.gms.common.zzj.zzf("0\u0082\u0004C0\u0082\u0003+\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"));
        com.google.android.gms.common.zzo.zzf = new com.google.android.gms.common.zzi(com.google.android.gms.common.zzj.zzf("0\u0082\u0004\u00a80\u0082\u0003\u0090\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085\u00b8l}\u00d3N\u00f50"));
        com.google.android.gms.common.zzo.zzi = new Object();
        return;
    }

    public static declared_synchronized void zza(android.content.Context p2)
    {
        if (com.google.android.gms.common.zzo.zzj != null) {
            android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            return;
        } else {
            if (p2 == null) {
                return;
            } else {
                com.google.android.gms.common.zzo.zzj = p2.getApplicationContext();
                return;
            }
        }
    }

    public static void zzb()
    {
        if (com.google.android.gms.common.zzo.zzg == null) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.common.zzo.zzj);
            if (com.google.android.gms.common.zzo.zzg == null) {
                com.google.android.gms.common.zzo.zzg = com.google.android.gms.common.internal.zzac.zzb(com.google.android.gms.dynamite.DynamiteModule.load(com.google.android.gms.common.zzo.zzj, com.google.android.gms.dynamite.DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
            return;
        } else {
            return;
        }
    }

    public static com.google.android.gms.common.zzy zzc(com.google.android.gms.common.zzw p5)
    {
        String v0_0 = "Failed to get Google certificates from remote";
        int v1_0 = "GoogleCertificates";
        android.os.StrictMode$ThreadPolicy v2 = android.os.StrictMode.allowThreadDiskReads();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.common.zzo.zzj);
        com.google.android.gms.common.zzo.zzb();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.common.zzo.zzj);
        int v3_2 = p5.zzb(com.google.android.gms.common.zzo.zzj);
        com.google.android.gms.common.zzy v5_4;
        if (!p5.zza()) {
            v5_4 = com.google.android.gms.common.zzo.zzg.zzh(v3_2);
        } else {
            v5_4 = com.google.android.gms.common.zzo.zzg.zzf(v3_2);
        }
        com.google.android.gms.common.zzy v5_1;
        v0_0 = v5_4.zza();
        if (v0_0 == null) {
            v0_0 = v5_4.zzb();
            v1_0 = v5_4.zzd();
            if (v1_0 != 4) {
                v1_0 = 0;
            } else {
                v1_0 = new android.content.pm.PackageManager$NameNotFoundException();
            }
            if (v0_0 == null) {
                v0_0 = "error checking package certificate";
            }
            v5_1 = com.google.android.gms.common.zzy.zzg(v5_4.zze(), v5_4.zzd(), v0_0, v1_0);
            android.os.StrictMode.setThreadPolicy(v2);
            return v5_1;
        } else {
            v0_0 = v5_4.zze();
            v5_1 = com.google.android.gms.common.zzy.zzf(v0_0, v5_4.zzc());
            android.os.StrictMode.setThreadPolicy(v2);
            return v5_1;
        }
    }

    public static com.google.android.gms.common.zzy zzd(String p1, com.google.android.gms.common.zzj p2, boolean p3, boolean p4)
    {
        android.os.StrictMode$ThreadPolicy v0 = android.os.StrictMode.allowThreadDiskReads();
        try {
            Throwable v1_1 = com.google.android.gms.common.zzo.zzf(p1, p2, p3, p4);
            android.os.StrictMode.setThreadPolicy(v0);
            return v1_1;
        } catch (Throwable v1_2) {
            android.os.StrictMode.setThreadPolicy(v0);
            throw v1_2;
        }
    }

    public static synthetic String zze(boolean p2, String p3, com.google.android.gms.common.zzj p4)
    {
        if ((p2 != null) || (!com.google.android.gms.common.zzo.zzf(p3, p4, 1, 0).zza)) {
            String v0_4 = "not allowed";
        } else {
            v0_4 = "debug cert rejected";
        }
        StringBuilder v1_0 = com.google.android.gms.common.util.AndroidUtilsLight.zza("SHA-256");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v1_0);
        String v4_3 = com.google.android.gms.common.util.Hex.bytesToStringLowercase(v1_0.digest(p4.zzc()));
        StringBuilder v1_3 = new StringBuilder();
        v1_3.append(v0_4);
        v1_3.append(": pkg=");
        v1_3.append(p3);
        v1_3.append(", sha256=");
        v1_3.append(v4_3);
        v1_3.append(", atk=");
        v1_3.append(p2);
        v1_3.append(", ver=12451000.false");
        return v1_3.toString();
    }

    private static com.google.android.gms.common.zzy zzf(String p4, com.google.android.gms.common.zzj p5, boolean p6, boolean p7)
    {
        try {
            com.google.android.gms.common.zzo.zzb();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.common.zzo.zzj);
            try {
                if (!com.google.android.gms.common.zzo.zzg.zze(new com.google.android.gms.common.zzt(p4, p5, p6, p7), com.google.android.gms.dynamic.ObjectWrapper.wrap(com.google.android.gms.common.zzo.zzj.getPackageManager()))) {
                    return new com.google.android.gms.common.zzx(new com.google.android.gms.common.zzl(p6, p4, p5), 0);
                } else {
                    return com.google.android.gms.common.zzy.zzb();
                }
            } catch (com.google.android.gms.common.zzx v4_2) {
                android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", v4_2);
                return com.google.android.gms.common.zzy.zzd("module call", v4_2);
            }
        } catch (com.google.android.gms.common.zzx v4_7) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", v4_7);
            return com.google.android.gms.common.zzy.zzd("module init: ".concat(String.valueOf(v4_7.getMessage())), v4_7);
        }
    }
}
