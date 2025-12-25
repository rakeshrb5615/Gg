package com.google.android.gms.tasks;
final class zzz implements java.lang.Runnable {
    final synthetic com.google.android.gms.tasks.zzw zza;
    final synthetic java.util.concurrent.Callable zzb;

    public zzz(com.google.android.gms.tasks.zzw p1, java.util.concurrent.Callable p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        try {
            this.zza.zzb(this.zzb.call());
            return;
        } catch (Throwable v0_1) {
            this.zza.zza(v0_1);
            return;
        } catch (Throwable v0_2) {
            this.zza.zza(new RuntimeException(v0_2));
            return;
        }
    }
}
