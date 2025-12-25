package com.google.android.gms.tasks;
final class zzu implements java.util.concurrent.Executor {
    private final android.os.Handler zza;

    public zzu()
    {
        this.zza = new com.google.android.gms.internal.tasks.zza(android.os.Looper.getMainLooper());
        return;
    }

    public final void execute(Runnable p2)
    {
        this.zza.post(p2);
        return;
    }
}
