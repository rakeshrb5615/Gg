package com.google.android.gms.internal.play_billing;
public final class zzcu extends com.google.android.gms.internal.play_billing.zzcw {

    public static com.google.android.gms.internal.play_billing.zzcz zza(Object p1)
    {
        return new com.google.android.gms.internal.play_billing.zzcx(p1);
    }

    public static com.google.android.gms.internal.play_billing.zzcz zzb(com.google.android.gms.internal.play_billing.zzcz p0, long p1, java.util.concurrent.TimeUnit p3, java.util.concurrent.ScheduledExecutorService p4)
    {
        if (!p0.isDone()) {
            return com.google.android.gms.internal.play_billing.zzde.zzs(p0, 28500, p3, p4);
        } else {
            return p0;
        }
    }

    public static void zzc(com.google.android.gms.internal.play_billing.zzcz p1, com.google.android.gms.internal.play_billing.zzcs p2, java.util.concurrent.Executor p3)
    {
        p1.zzb(new com.google.android.gms.internal.play_billing.zzct(p1, p2), p3);
        return;
    }
}
