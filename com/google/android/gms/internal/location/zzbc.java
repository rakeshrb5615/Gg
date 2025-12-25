package com.google.android.gms.internal.location;
final synthetic class zzbc implements com.google.android.gms.tasks.OnCompleteListener {
    private final synthetic java.util.concurrent.atomic.AtomicReference zza;
    private final synthetic java.util.concurrent.CountDownLatch zzb;

    public synthetic zzbc(java.util.concurrent.atomic.AtomicReference p1, java.util.concurrent.CountDownLatch p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void onComplete(com.google.android.gms.tasks.Task p2)
    {
        if (p2.isSuccessful()) {
            this.zza.set(((com.google.android.gms.location.LocationAvailability) p2.getResult()));
        }
        this.zzb.countDown();
        return;
    }
}
