package com.android.billingclient.api;
final class zzav implements java.util.concurrent.ThreadFactory {
    private final java.util.concurrent.ThreadFactory zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;

    public zzav(com.android.billingclient.api.BillingClientImpl p2)
    {
        java.util.Objects.requireNonNull(p2);
        this.zza = java.util.concurrent.Executors.defaultThreadFactory();
        this.zzb = new java.util.concurrent.atomic.AtomicInteger(1);
        return;
    }

    public final Thread newThread(Runnable p4)
    {
        String v0_0 = this.zzb;
        Thread v4_1 = this.zza.newThread(p4);
        String v0_2 = v0_0.getAndIncrement();
        StringBuilder v1_2 = new StringBuilder("PlayBillingLibrary-");
        v1_2.append(v0_2);
        v4_1.setName(v1_2.toString());
        return v4_1;
    }
}
