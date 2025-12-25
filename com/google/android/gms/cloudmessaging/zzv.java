package com.google.android.gms.cloudmessaging;
public final class zzv {
    private static com.google.android.gms.cloudmessaging.zzv zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private com.google.android.gms.cloudmessaging.zzp zzd;
    private int zze;

    public zzv(android.content.Context p3, java.util.concurrent.ScheduledExecutorService p4)
    {
        this.zzd = new com.google.android.gms.cloudmessaging.zzp(this, 0);
        this.zze = 1;
        this.zzc = p4;
        this.zzb = p3.getApplicationContext();
        return;
    }

    public static bridge synthetic android.content.Context zza(com.google.android.gms.cloudmessaging.zzv p0)
    {
        return p0.zzb;
    }

    public static declared_synchronized com.google.android.gms.cloudmessaging.zzv zzb(android.content.Context p4)
    {
        if (com.google.android.gms.cloudmessaging.zzv.zza == null) {
            com.google.android.gms.internal.cloudmessaging.zze.zza();
            com.google.android.gms.cloudmessaging.zzv.zza = new com.google.android.gms.cloudmessaging.zzv(p4, java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("MessengerIpcClient"))));
        }
        return com.google.android.gms.cloudmessaging.zzv.zza;
    }

    public static bridge synthetic java.util.concurrent.ScheduledExecutorService zze(com.google.android.gms.cloudmessaging.zzv p0)
    {
        return p0.zzc;
    }

    private final declared_synchronized int zzf()
    {
        Throwable v0_0 = this.zze;
        this.zze = (v0_0 + 1);
        return v0_0;
    }

    private final declared_synchronized com.google.android.gms.tasks.Task zzg(com.google.android.gms.cloudmessaging.zzs p3)
    {
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            android.util.Log.d("MessengerIpcClient", "Queueing ".concat(p3.toString()));
        }
        if (!this.zzd.zzg(p3)) {
            com.google.android.gms.cloudmessaging.zzp v0_4 = new com.google.android.gms.cloudmessaging.zzp(this, 0);
            this.zzd = v0_4;
            v0_4.zzg(p3);
        }
        return p3.zzb.getTask();
    }

    public final com.google.android.gms.tasks.Task zzc(int p3, android.os.Bundle p4)
    {
        return this.zzg(new com.google.android.gms.cloudmessaging.zzr(this.zzf(), p3, p4));
    }

    public final com.google.android.gms.tasks.Task zzd(int p3, android.os.Bundle p4)
    {
        return this.zzg(new com.google.android.gms.cloudmessaging.zzu(this.zzf(), p3, p4));
    }
}
