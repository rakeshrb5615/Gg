package com.google.android.gms.common.util.concurrent;
public class NamedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final String zza;
    private final java.util.concurrent.ThreadFactory zzb;

    public NamedThreadFactory(String p2)
    {
        this.zzb = java.util.concurrent.Executors.defaultThreadFactory();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Name must not be null");
        this.zza = p2;
        return;
    }

    public final Thread newThread(Runnable p3)
    {
        Thread v3_2 = this.zzb.newThread(new com.google.android.gms.common.util.concurrent.zza(p3, 0));
        v3_2.setName(this.zza);
        return v3_2;
    }
}
