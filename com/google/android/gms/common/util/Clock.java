package com.google.android.gms.common.util;
public interface Clock {

    public long currentThreadTimeMillis()
    {
        return android.os.SystemClock.currentThreadTimeMillis();
    }

    public abstract long currentTimeMillis();

    public abstract long elapsedRealtime();

    public abstract long nanoTime();
}
