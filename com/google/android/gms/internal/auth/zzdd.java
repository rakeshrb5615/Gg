package com.google.android.gms.internal.auth;
public final class zzdd implements com.google.android.gms.internal.auth.zzcl {
    private static final java.util.Map zza;
    private final android.content.SharedPreferences zzb;
    private final android.content.SharedPreferences$OnSharedPreferenceChangeListener zzc;

    static zzdd()
    {
        com.google.android.gms.internal.auth.zzdd.zza = new r.e(0);
        return;
    }

    public static com.google.android.gms.internal.auth.zzdd zza(android.content.Context p0, String p1, Runnable p2)
    {
        if (com.google.android.gms.internal.auth.zzcc.zzb()) {
            throw 0;
        } else {
            android.os.StrictMode$ThreadPolicy v2_3 = ((com.google.android.gms.internal.auth.zzdd) com.google.android.gms.internal.auth.zzdd.zza.get(0));
            if (v2_3 == null) {
                android.os.StrictMode$ThreadPolicy v2_0 = android.os.StrictMode.allowThreadDiskReads();
                try {
                    throw 0;
                } catch (Throwable v1_0) {
                    android.os.StrictMode.setThreadPolicy(v2_0);
                    throw v1_0;
                }
            } else {
                return v2_3;
            }
        }
    }

    public static declared_synchronized void zzc()
    {
        try {
            int v1_0 = com.google.android.gms.internal.auth.zzdd.zza;
            java.util.Iterator v2_1 = v1_0.values().iterator();
        } catch (int v1_4) {
            throw v1_4;
        }
        if (v2_1.hasNext()) {
            v2_1.next();
            throw 0;
        } else {
            v1_0.clear();
            return;
        }
    }

    public final Object zzb(String p1)
    {
        throw 0;
    }
}
