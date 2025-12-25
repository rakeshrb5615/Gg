package com.google.android.gms.measurement.internal;
final class zzhw implements java.lang.Thread$UncaughtExceptionHandler {
    final synthetic com.google.android.gms.measurement.internal.zzhz zza;
    private final String zzb;

    public zzhw(com.google.android.gms.measurement.internal.zzhz p1, String p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        this.zzb = p2;
        return;
    }

    public final declared_synchronized void uncaughtException(Thread p2, Throwable p3)
    {
        this.zza.zzu.zzaV().zzb().zzb(this.zzb, p3);
        return;
    }
}
