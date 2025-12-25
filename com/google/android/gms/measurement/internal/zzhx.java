package com.google.android.gms.measurement.internal;
final class zzhx extends java.util.concurrent.FutureTask implements java.lang.Comparable {
    final boolean zza;
    final synthetic com.google.android.gms.measurement.internal.zzhz zzb;
    private final long zzc;
    private final String zzd;

    public zzhx(com.google.android.gms.measurement.internal.zzhz p3, Runnable p4, boolean p5, String p6)
    {
        java.util.Objects.requireNonNull(p3);
        this.zzb = p3;
        super(p4, 0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6);
        long v0_1 = com.google.android.gms.measurement.internal.zzhz.zzu().getAndIncrement();
        super.zzc = v0_1;
        super.zzd = p6;
        super.zza = p5;
        if (v0_1 == 9223372036854775807) {
            v1.a.s(p3.zzu, "Tasks index overflow");
        }
        return;
    }

    public zzhx(com.google.android.gms.measurement.internal.zzhz p3, java.util.concurrent.Callable p4, boolean p5, String p6)
    {
        java.util.Objects.requireNonNull(p3);
        this.zzb = p3;
        super(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull("Task exception on worker thread");
        long v0 = com.google.android.gms.measurement.internal.zzhz.zzu().getAndIncrement();
        super.zzc = v0;
        super.zzd = "Task exception on worker thread";
        super.zza = p5;
        if (v0 == 9223372036854775807) {
            v1.a.s(p3.zzu, "Tasks index overflow");
        }
        return;
    }

    public final bridge synthetic int compareTo(Object p7)
    {
        boolean v1 = this.zza;
        if (v1 == ((com.google.android.gms.measurement.internal.zzhx) p7).zza) {
            Long v0_2 = this.zzc;
            int v7_7 = v0_2 cmp ((com.google.android.gms.measurement.internal.zzhx) p7).zzc;
            if (v7_7 >= 0) {
                if (v7_7 <= 0) {
                    this.zzb.zzu.zzaV().zzc().zzb("Two tasks share the same index. index", Long.valueOf(v0_2));
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return -1;
            }
        } else {
            if (v1) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public final void setException(Throwable p3)
    {
        this.zzb.zzu.zzaV().zzb().zzb(this.zzd, p3);
        if ((p3 instanceof com.google.android.gms.measurement.internal.zzhv)) {
            Thread$UncaughtExceptionHandler v0_2 = Thread.getDefaultUncaughtExceptionHandler();
            if (v0_2 != null) {
                v0_2.uncaughtException(Thread.currentThread(), p3);
            }
        }
        super.setException(p3);
        return;
    }
}
