package com.google.android.gms.internal.play_billing;
final class zzck$zzb extends com.google.android.gms.internal.play_billing.zzck$zza {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zza;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zzb;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zzc;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zzd;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zze;

    static zzck$zzb()
    {
        com.google.android.gms.internal.play_billing.zzck$zzb.zza = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzck$zze, Thread, "thread");
        com.google.android.gms.internal.play_billing.zzck$zzb.zzb = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzck$zze, com.google.android.gms.internal.play_billing.zzck$zze, "next");
        com.google.android.gms.internal.play_billing.zzck$zzb.zzc = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzck, com.google.android.gms.internal.play_billing.zzck$zze, "waitersField");
        com.google.android.gms.internal.play_billing.zzck$zzb.zzd = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzck, com.google.android.gms.internal.play_billing.zzcj$zzd, "listenersField");
        com.google.android.gms.internal.play_billing.zzck$zzb.zze = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(com.google.android.gms.internal.play_billing.zzck, Object, "valueField");
        return;
    }

    private zzck$zzb()
    {
        throw 0;
    }

    public synthetic zzck$zzb(com.google.android.gms.internal.play_billing.zzco p1)
    {
        super(0);
        return;
    }

    public final com.google.android.gms.internal.play_billing.zzcj$zzd zza(com.google.android.gms.internal.play_billing.zzck p2, com.google.android.gms.internal.play_billing.zzcj$zzd p3)
    {
        return ((com.google.android.gms.internal.play_billing.zzcj$zzd) com.google.android.gms.internal.play_billing.zzck$zzb.zzd.getAndSet(p2, p3));
    }

    public final com.google.android.gms.internal.play_billing.zzck$zze zzb(com.google.android.gms.internal.play_billing.zzck p2, com.google.android.gms.internal.play_billing.zzck$zze p3)
    {
        return ((com.google.android.gms.internal.play_billing.zzck$zze) com.google.android.gms.internal.play_billing.zzck$zzb.zzc.getAndSet(p2, p3));
    }

    public final void zzc(com.google.android.gms.internal.play_billing.zzck$zze p2, com.google.android.gms.internal.play_billing.zzck$zze p3)
    {
        com.google.android.gms.internal.play_billing.zzck$zzb.zzb.lazySet(p2, p3);
        return;
    }

    public final void zzd(com.google.android.gms.internal.play_billing.zzck$zze p2, Thread p3)
    {
        com.google.android.gms.internal.play_billing.zzck$zzb.zza.lazySet(p2, p3);
        return;
    }

    public final boolean zze(com.google.android.gms.internal.play_billing.zzck p2, com.google.android.gms.internal.play_billing.zzcj$zzd p3, com.google.android.gms.internal.play_billing.zzcj$zzd p4)
    {
        return com.google.android.gms.internal.play_billing.zzcl.zza(com.google.android.gms.internal.play_billing.zzck$zzb.zzd, p2, p3, p4);
    }

    public final boolean zzf(com.google.android.gms.internal.play_billing.zzck p2, Object p3, Object p4)
    {
        return com.google.android.gms.internal.play_billing.zzcl.zza(com.google.android.gms.internal.play_billing.zzck$zzb.zze, p2, p3, p4);
    }

    public final boolean zzg(com.google.android.gms.internal.play_billing.zzck p2, com.google.android.gms.internal.play_billing.zzck$zze p3, com.google.android.gms.internal.play_billing.zzck$zze p4)
    {
        return com.google.android.gms.internal.play_billing.zzcl.zza(com.google.android.gms.internal.play_billing.zzck$zzb.zzc, p2, p3, p4);
    }
}
