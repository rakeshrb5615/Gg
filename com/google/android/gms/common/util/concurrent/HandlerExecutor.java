package com.google.android.gms.common.util.concurrent;
public class HandlerExecutor implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    public HandlerExecutor(android.os.Looper p2)
    {
        this.zza = new com.google.android.gms.internal.common.zzg(p2);
        return;
    }

    public final void execute(Runnable p2)
    {
        this.zza.post(p2);
        return;
    }
}
