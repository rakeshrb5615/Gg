package com.google.android.gms.common.util.concurrent;
final class zza implements java.lang.Runnable {
    private final Runnable zza;

    public zza(Runnable p1, int p2)
    {
        this.zza = p1;
        return;
    }

    public final void run()
    {
        android.os.Process.setThreadPriority(0);
        this.zza.run();
        return;
    }
}
