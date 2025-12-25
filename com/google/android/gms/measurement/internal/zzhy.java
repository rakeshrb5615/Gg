package com.google.android.gms.measurement.internal;
final class zzhy extends java.lang.Thread {
    final synthetic com.google.android.gms.measurement.internal.zzhz zza;
    private final Object zzb;
    private final java.util.concurrent.BlockingQueue zzc;
    private boolean zzd;

    public zzhy(com.google.android.gms.measurement.internal.zzhz p1, String p2, java.util.concurrent.BlockingQueue p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzd = 0;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        this.zzb = new Object();
        this.zzc = p3;
        this.setName(p2);
        return;
    }

    private final void zzb()
    {
        com.google.android.gms.measurement.internal.zzgs v0_0 = this.zza;
        v0_0.zzr();
        if (!this.zzd) {
            v0_0.zzs().release();
            v0_0.zzr().notifyAll();
            if (this != v0_0.zzn()) {
                if (this != v0_0.zzp()) {
                    v0_0.zzu.zzaV().zzb().zza("Current scheduler thread is neither worker nor network");
                } else {
                    v0_0.zzq(0);
                }
            } else {
                v0_0.zzo(0);
            }
            this.zzd = 1;
        }
        return;
    }

    private final void zzc(InterruptedException p4)
    {
        this.zza.zzu.zzaV().zze().zzb(String.valueOf(this.getName()).concat(" was interrupted"), p4);
        return;
    }

    public final void run()
    {
        Throwable v0_0 = 0;
        while (v0_0 == null) {
            try {
                this.zza.zzs().acquire();
                v0_0 = 1;
            } catch (InterruptedException v1_1) {
                this.zzc(v1_1);
            }
        }
        Throwable v0_5 = android.os.Process.getThreadPriority(android.os.Process.myTid());
        while(true) {
            InterruptedException v2_8 = this.zzc;
            Object v3_0 = ((com.google.android.gms.measurement.internal.zzhx) v2_8.poll());
            if (v3_0 == null) {
                Object v3_1 = this.zzb;
                if (v2_8.peek() == null) {
                    this.zza.zzt();
                    try {
                        v3_1.wait(30000);
                    } catch (InterruptedException v2_2) {
                        this.zzc(v2_2);
                    }
                }
                this.zza.zzr();
                if (this.zzc.peek() == null) {
                    break;
                }
            } else {
                InterruptedException v2_5;
                if (1 == v3_0.zza) {
                    v2_5 = v0_5;
                } else {
                    v2_5 = 10;
                }
                android.os.Process.setThreadPriority(v2_5);
                v3_0.run();
            }
        }
        this.zzb();
        this.zzb();
        return;
    }

    public final void zza()
    {
        try {
            this.zzb.notifyAll();
            return;
        } catch (Throwable v1) {
            throw v1;
        }
    }
}
