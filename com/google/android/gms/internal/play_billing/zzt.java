package com.google.android.gms.internal.play_billing;
final class zzt implements com.google.android.gms.internal.play_billing.zzcz {
    final ref.WeakReference zza;
    private final com.google.android.gms.internal.play_billing.zzo zzb;

    public zzt(com.google.android.gms.internal.play_billing.zzp p2)
    {
        this.zzb = new com.google.android.gms.internal.play_billing.zzs(this);
        this.zza = new ref.WeakReference(p2);
        return;
    }

    public final boolean cancel(boolean p3)
    {
        com.google.android.gms.internal.play_billing.zzp v0_2 = ((com.google.android.gms.internal.play_billing.zzp) this.zza.get());
        int v3_1 = this.zzb.cancel(p3);
        if ((v3_1 != 0) && (v0_2 != null)) {
            v0_2.zza();
            v3_1 = 1;
        }
        return v3_1;
    }

    public final Object get()
    {
        return this.zzb.get();
    }

    public final Object get(long p2, java.util.concurrent.TimeUnit p4)
    {
        return this.zzb.get(p2, p4);
    }

    public final boolean isCancelled()
    {
        return (this.zzb.zzc instanceof com.google.android.gms.internal.play_billing.zze);
    }

    public final boolean isDone()
    {
        return this.zzb.isDone();
    }

    public final String toString()
    {
        return this.zzb.toString();
    }

    public final boolean zza(Object p2)
    {
        return this.zzb.zzd(p2);
    }

    public final void zzb(Runnable p2, java.util.concurrent.Executor p3)
    {
        this.zzb.zzb(p2, p3);
        return;
    }

    public final boolean zzc(Throwable p4)
    {
        com.google.android.gms.internal.play_billing.zzo v1 = this.zzb;
        if (!com.google.android.gms.internal.play_billing.zzo.zzb.zzd(v1, 0, new com.google.android.gms.internal.play_billing.zzg(p4))) {
            return 0;
        } else {
            com.google.android.gms.internal.play_billing.zzo.zzc(v1);
            return 1;
        }
    }
}
