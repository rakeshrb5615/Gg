package com.google.android.gms.internal.measurement;
final class zzed implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.ThreadFactory zza;

    public zzed(com.google.android.gms.internal.measurement.zzfb p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = java.util.concurrent.Executors.defaultThreadFactory();
        return;
    }

    public final Thread newThread(Runnable p2)
    {
        Thread v2_1 = this.zza.newThread(p2);
        v2_1.setName("ScionFrontendApi");
        return v2_1;
    }
}
