package com.google.android.gms.internal.measurement;
public final class zzko implements com.google.android.gms.internal.measurement.zzjv {
    private static final java.util.Map zza;
    private final android.content.SharedPreferences zzb;
    private android.content.SharedPreferences$OnSharedPreferenceChangeListener zzc;
    private final Object zzd;
    private volatile java.util.Map zze;
    private final java.util.List zzf;

    static zzko()
    {
        com.google.android.gms.internal.measurement.zzko.zza = new r.e(0);
        return;
    }

    private zzko(android.content.SharedPreferences p1, Runnable p2)
    {
        this.zzd = new Object();
        this.zzf = new java.util.ArrayList();
        this.zzb = p1;
        return;
    }

    public static com.google.android.gms.internal.measurement.zzko zza(android.content.Context p7, String p8, Runnable p9)
    {
        if ((!com.google.android.gms.internal.measurement.zzjm.zza()) || ((p8.startsWith("direct_boot:")) || (com.google.android.gms.internal.measurement.zzjm.zzc(p7)))) {
            try {
                java.util.Map v1 = com.google.android.gms.internal.measurement.zzko.zza;
                com.google.android.gms.internal.measurement.zzko v2_1 = ((com.google.android.gms.internal.measurement.zzko) v1.get(p8));
            } catch (com.google.android.gms.internal.measurement.zzkn v7_6) {
                throw v7_6;
            }
            if (v2_1 == null) {
                android.os.StrictMode$ThreadPolicy v3 = android.os.StrictMode.allowThreadDiskReads();
                com.google.android.gms.internal.measurement.zzkn v7_2;
                if (!p8.startsWith("direct_boot:")) {
                    v7_2 = com.google.android.gms.internal.measurement.zzcf.zza(p7, p8, 0, com.google.android.gms.internal.measurement.zzcb.zza);
                } else {
                    if (com.google.android.gms.internal.measurement.zzjm.zza()) {
                        p7 = p7.createDeviceProtectedStorageContext();
                    }
                    v7_2 = com.google.android.gms.internal.measurement.zzcf.zza(p7, p8.substring(12), 0, com.google.android.gms.internal.measurement.zzcb.zza);
                }
                android.os.StrictMode.setThreadPolicy(v3);
                v2_1 = new com.google.android.gms.internal.measurement.zzko(v7_2, p9);
                com.google.android.gms.internal.measurement.zzkn v7_5 = new com.google.android.gms.internal.measurement.zzkn(v2_1);
                v2_1.zzc = v7_5;
                v2_1.zzb.registerOnSharedPreferenceChangeListener(v7_5);
                v1.put(p8, v2_1);
            }
            return v2_1;
        } else {
            return 0;
        }
    }

    public static declared_synchronized void zzb()
    {
        Throwable v1_0 = com.google.android.gms.internal.measurement.zzko.zza;
        java.util.Iterator v2_1 = v1_0.values().iterator();
        while (v2_1.hasNext()) {
            android.content.SharedPreferences$OnSharedPreferenceChangeListener v3_1 = ((com.google.android.gms.internal.measurement.zzko) v2_1.next());
            android.content.SharedPreferences v4 = v3_1.zzb;
            android.content.SharedPreferences$OnSharedPreferenceChangeListener v3_2 = v3_1.zzc;
            v3_2.getClass();
            v4.unregisterOnSharedPreferenceChangeListener(v3_2);
        }
        v1_0.clear();
        return;
    }

    public final synthetic void zzc(android.content.SharedPreferences p1, String p2)
    {
        this.zze = 0;
        com.google.android.gms.internal.measurement.zzkm.zzc();
        Throwable v1_2 = this.zzf.iterator();
        while (v1_2.hasNext()) {
            ((com.google.android.gms.internal.measurement.zzjs) v1_2.next()).zza();
        }
        return;
    }

    public final Object zze(String p4)
    {
        java.util.Map v0_0 = this.zze;
        if (v0_0 == null) {
            v0_0 = this.zze;
            if (v0_0 == null) {
                java.util.Map v0_1 = android.os.StrictMode.allowThreadDiskReads();
                java.util.Map v2_1 = this.zzb.getAll();
                this.zze = v2_1;
                android.os.StrictMode.setThreadPolicy(v0_1);
                v0_0 = v2_1;
            }
        }
        if (v0_0 == null) {
            return 0;
        } else {
            return v0_0.get(p4);
        }
    }
}
