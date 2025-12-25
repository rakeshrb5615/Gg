package com.google.android.gms.measurement.internal;
public final class zzhz extends com.google.android.gms.measurement.internal.zzjf {
    private static final java.util.concurrent.atomic.AtomicLong zzj;
    private com.google.android.gms.measurement.internal.zzhy zza;
    private com.google.android.gms.measurement.internal.zzhy zzb;
    private final java.util.concurrent.PriorityBlockingQueue zzc;
    private final java.util.concurrent.BlockingQueue zzd;
    private final Thread$UncaughtExceptionHandler zze;
    private final Thread$UncaughtExceptionHandler zzf;
    private final Object zzg;
    private final java.util.concurrent.Semaphore zzh;
    private volatile boolean zzi;

    static zzhz()
    {
        com.google.android.gms.measurement.internal.zzhz.zzj = new java.util.concurrent.atomic.AtomicLong(-9223372036854775808);
        return;
    }

    public zzhz(com.google.android.gms.measurement.internal.zzic p2)
    {
        super(p2);
        super.zzg = new Object();
        super.zzh = new java.util.concurrent.Semaphore(2);
        super.zzc = new java.util.concurrent.PriorityBlockingQueue();
        super.zzd = new java.util.concurrent.LinkedBlockingQueue();
        super.zze = new com.google.android.gms.measurement.internal.zzhw(super, "Thread death: Uncaught exception on worker thread");
        super.zzf = new com.google.android.gms.measurement.internal.zzhw(super, "Thread death: Uncaught exception on network thread");
        return;
    }

    public static synthetic java.util.concurrent.atomic.AtomicLong zzu()
    {
        return com.google.android.gms.measurement.internal.zzhz.zzj;
    }

    private final void zzz(com.google.android.gms.measurement.internal.zzhx p4)
    {
        Thread$UncaughtExceptionHandler v1_0 = this.zzc;
        v1_0.add(p4);
        com.google.android.gms.measurement.internal.zzhy v4_3 = this.zza;
        if (v4_3 != null) {
            v4_3.zza();
        } else {
            com.google.android.gms.measurement.internal.zzhy v4_5 = new com.google.android.gms.measurement.internal.zzhy(this, "Measurement Worker", v1_0);
            this.zza = v4_5;
            v4_5.setUncaughtExceptionHandler(this.zze);
            this.zza.start();
        }
        return;
    }

    public final boolean zza()
    {
        return 0;
    }

    public final void zzaX()
    {
        if (Thread.currentThread() != this.zzb) {
            throw new IllegalStateException("Call expected from network thread");
        } else {
            return;
        }
    }

    public final void zzd()
    {
        if (Thread.currentThread() == this.zza) {
            throw new IllegalStateException("Call not expected from worker thread");
        } else {
            return;
        }
    }

    public final boolean zze()
    {
        if (Thread.currentThread() != this.zza) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean zzf()
    {
        if (Thread.currentThread() != this.zzb) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zzg()
    {
        if (Thread.currentThread() != this.zza) {
            throw new IllegalStateException("Call expected from worker thread");
        } else {
            return;
        }
    }

    public final java.util.concurrent.Future zzh(java.util.concurrent.Callable p4)
    {
        this.zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.measurement.internal.zzhx v0_1 = new com.google.android.gms.measurement.internal.zzhx(this, p4, 0, "Task exception on worker thread");
        if (Thread.currentThread() != this.zza) {
            this.zzz(v0_1);
            return v0_1;
        } else {
            if (!this.zzc.isEmpty()) {
                v1.a.v(this.zzu, "Callable skipped the worker queue.");
            }
            v0_1.run();
            return v0_1;
        }
    }

    public final java.util.concurrent.Future zzi(java.util.concurrent.Callable p4)
    {
        this.zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.measurement.internal.zzhx v0_1 = new com.google.android.gms.measurement.internal.zzhx(this, p4, 1, "Task exception on worker thread");
        if (Thread.currentThread() != this.zza) {
            this.zzz(v0_1);
            return v0_1;
        } else {
            v0_1.run();
            return v0_1;
        }
    }

    public final void zzj(Runnable p4)
    {
        this.zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        this.zzz(new com.google.android.gms.measurement.internal.zzhx(this, p4, 0, "Task exception on worker thread"));
        return;
    }

    public final Object zzk(java.util.concurrent.atomic.AtomicReference p3, long p4, String p6, Runnable p7)
    {
        try {
            this.zzu.zzaW().zzj(p7);
        } catch (com.google.android.gms.measurement.internal.zzgs v4_2) {
            throw v4_2;
        }
        p3.wait(p4);
        Object v3_2 = p3.get();
        if (v3_2 == null) {
            this.zzu.zzaV().zze().zza("Timed out waiting for ".concat(p6));
        }
        return v3_2;
    }

    public final void zzl(Runnable p4)
    {
        this.zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        this.zzz(new com.google.android.gms.measurement.internal.zzhx(this, p4, 1, "Task exception on worker thread"));
        return;
    }

    public final void zzm(Runnable p4)
    {
        this.zzw();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.measurement.internal.zzhy v0_4 = this.zzd;
        v0_4.add(new com.google.android.gms.measurement.internal.zzhx(this, p4, 0, "Task exception on network thread"));
        com.google.android.gms.measurement.internal.zzhy v1_4 = this.zzb;
        if (v1_4 != null) {
            v1_4.zza();
        } else {
            com.google.android.gms.measurement.internal.zzhy v1_1 = new com.google.android.gms.measurement.internal.zzhy(this, "Measurement Network", v0_4);
            this.zzb = v1_1;
            v1_1.setUncaughtExceptionHandler(this.zzf);
            this.zzb.start();
        }
        return;
    }

    public final synthetic com.google.android.gms.measurement.internal.zzhy zzn()
    {
        return this.zza;
    }

    public final synthetic void zzo(com.google.android.gms.measurement.internal.zzhy p1)
    {
        this.zza = 0;
        return;
    }

    public final synthetic com.google.android.gms.measurement.internal.zzhy zzp()
    {
        return this.zzb;
    }

    public final synthetic void zzq(com.google.android.gms.measurement.internal.zzhy p1)
    {
        this.zzb = 0;
        return;
    }

    public final synthetic Object zzr()
    {
        return this.zzg;
    }

    public final synthetic java.util.concurrent.Semaphore zzs()
    {
        return this.zzh;
    }

    public final synthetic boolean zzt()
    {
        return 0;
    }
}
