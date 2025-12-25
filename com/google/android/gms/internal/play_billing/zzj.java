package com.google.android.gms.internal.play_billing;
final class zzj extends com.google.android.gms.internal.play_billing.zzd {
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zza;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zzb;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zzc;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zzd;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zze;

    public zzj(java.util.concurrent.atomic.AtomicReferenceFieldUpdater p2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater p3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater p4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater p5, java.util.concurrent.atomic.AtomicReferenceFieldUpdater p6)
    {
        super(0);
        super.zza = p2;
        super.zzb = p3;
        super.zzc = p4;
        super.zzd = p5;
        super.zze = p6;
        return;
    }

    public final void zza(com.google.android.gms.internal.play_billing.zzm p2, com.google.android.gms.internal.play_billing.zzm p3)
    {
        this.zzb.lazySet(p2, p3);
        return;
    }

    public final void zzb(com.google.android.gms.internal.play_billing.zzm p2, Thread p3)
    {
        this.zza.lazySet(p2, p3);
        return;
    }

    public final boolean zzc(com.google.android.gms.internal.play_billing.zzo p2, com.google.android.gms.internal.play_billing.zzh p3, com.google.android.gms.internal.play_billing.zzh p4)
    {
        return com.google.android.gms.internal.play_billing.zzi.zza(this.zzd, p2, p3, p4);
    }

    public final boolean zzd(com.google.android.gms.internal.play_billing.zzo p2, Object p3, Object p4)
    {
        return com.google.android.gms.internal.play_billing.zzi.zza(this.zze, p2, p3, p4);
    }

    public final boolean zze(com.google.android.gms.internal.play_billing.zzo p2, com.google.android.gms.internal.play_billing.zzm p3, com.google.android.gms.internal.play_billing.zzm p4)
    {
        return com.google.android.gms.internal.play_billing.zzi.zza(this.zzc, p2, p3, p4);
    }
}
