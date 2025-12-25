package com.google.android.gms.common.util;
public class DefaultClock implements com.google.android.gms.common.util.Clock {
    private static final com.google.android.gms.common.util.DefaultClock zza;

    static DefaultClock()
    {
        com.google.android.gms.common.util.DefaultClock.zza = new com.google.android.gms.common.util.DefaultClock();
        return;
    }

    private DefaultClock()
    {
        return;
    }

    public static com.google.android.gms.common.util.Clock getInstance()
    {
        return com.google.android.gms.common.util.DefaultClock.zza;
    }

    public final long currentThreadTimeMillis()
    {
        return android.os.SystemClock.currentThreadTimeMillis();
    }

    public final long currentTimeMillis()
    {
        return System.currentTimeMillis();
    }

    public final long elapsedRealtime()
    {
        return android.os.SystemClock.elapsedRealtime();
    }

    public final long nanoTime()
    {
        return System.nanoTime();
    }
}
