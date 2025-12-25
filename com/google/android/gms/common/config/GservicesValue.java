package com.google.android.gms.common.config;
public abstract class GservicesValue {
    private static final Object zzc;
    protected final String zza;
    protected final Object zzb;
    private Object zzd;

    static GservicesValue()
    {
        com.google.android.gms.common.config.GservicesValue.zzc = new Object();
        return;
    }

    public GservicesValue(String p2, Object p3)
    {
        this.zzd = 0;
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public static boolean isInitialized()
    {
        try {
            return 0;
        } catch (Throwable v1) {
            throw v1;
        }
    }

    public static com.google.android.gms.common.config.GservicesValue value(String p1, Float p2)
    {
        return new com.google.android.gms.common.config.zzd(p1, p2);
    }

    public static com.google.android.gms.common.config.GservicesValue value(String p1, Integer p2)
    {
        return new com.google.android.gms.common.config.zzc(p1, p2);
    }

    public static com.google.android.gms.common.config.GservicesValue value(String p1, Long p2)
    {
        return new com.google.android.gms.common.config.zzb(p1, p2);
    }

    public static com.google.android.gms.common.config.GservicesValue value(String p1, String p2)
    {
        return new com.google.android.gms.common.config.zze(p1, p2);
    }

    public static com.google.android.gms.common.config.GservicesValue value(String p1, boolean p2)
    {
        return new com.google.android.gms.common.config.zza(p1, Boolean.valueOf(p2));
    }

    public final Object get()
    {
        Throwable v0_0 = this.zzd;
        if (v0_0 == null) {
            Throwable v0_1 = android.os.StrictMode.allowThreadDiskReads();
            try {
                Throwable v1_0 = this.zza(this.zza);
            } catch (Throwable v1_2) {
                android.os.StrictMode.setThreadPolicy(v0_1);
                throw v1_2;
            }
            android.os.StrictMode.setThreadPolicy(v0_1);
            return v1_0;
        } else {
            return v0_0;
        }
    }

    public final Object getBinderSafe()
    {
        return this.get();
    }

    public void override(Object p3)
    {
        android.util.Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzd = p3;
        try {
        } catch (Throwable v0_2) {
            throw v0_2;
        }
        return;
    }

    public void resetOverride()
    {
        this.zzd = 0;
        return;
    }

    public abstract Object zza();
}
