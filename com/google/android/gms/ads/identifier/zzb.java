package com.google.android.gms.ads.identifier;
final class zzb extends java.lang.Thread {
    final java.util.concurrent.CountDownLatch zza;
    boolean zzb;
    private final ref.WeakReference zzc;
    private final long zzd;

    public zzb(com.google.android.gms.ads.identifier.AdvertisingIdClient p2, long p3)
    {
        this.zzc = new ref.WeakReference(p2);
        this.zzd = p3;
        this.zza = new java.util.concurrent.CountDownLatch(1);
        this.zzb = 0;
        this.start();
        return;
    }

    private final void zza()
    {
        int v0_2 = ((com.google.android.gms.ads.identifier.AdvertisingIdClient) this.zzc.get());
        if (v0_2 != 0) {
            v0_2.zza();
            this.zzb = 1;
        }
        return;
    }

    public final void run()
    {
        try {
            if (!this.zza.await(this.zzd, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                this.zza();
            }
        } catch (InterruptedException) {
            this.zza();
            return;
        }
        return;
    }
}
