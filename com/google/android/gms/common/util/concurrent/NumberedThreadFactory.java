package com.google.android.gms.common.util.concurrent;
public class NumberedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final String zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;
    private final java.util.concurrent.ThreadFactory zzc;

    public NumberedThreadFactory(String p2)
    {
        this.zzb = new java.util.concurrent.atomic.AtomicInteger();
        this.zzc = java.util.concurrent.Executors.defaultThreadFactory();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Name must not be null");
        this.zza = p2;
        return;
    }

    public final Thread newThread(Runnable p6)
    {
        Thread v6_2 = this.zzc.newThread(new com.google.android.gms.common.util.concurrent.zza(p6, 0));
        String v0_5 = this.zzb.getAndIncrement();
        String v3 = this.zza;
        StringBuilder v2_1 = new StringBuilder((((v3.length() + 1) + String.valueOf(v0_5).length()) + 1));
        v2_1.append(v3);
        v2_1.append("[");
        v2_1.append(v0_5);
        v2_1.append("]");
        v6_2.setName(v2_1.toString());
        return v6_2;
    }
}
