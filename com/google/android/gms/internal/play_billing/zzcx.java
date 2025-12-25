package com.google.android.gms.internal.play_billing;
final class zzcx implements com.google.android.gms.internal.play_billing.zzcz {
    private static final com.google.android.gms.internal.play_billing.zzcy zza;
    private final Object zzb;

    static zzcx()
    {
        com.google.android.gms.internal.play_billing.zzcx.zza = new com.google.android.gms.internal.play_billing.zzcy(com.google.android.gms.internal.play_billing.zzcx);
        return;
    }

    public zzcx(Object p1)
    {
        this.zzb = p1;
        return;
    }

    public final boolean cancel(boolean p1)
    {
        return 0;
    }

    public final Object get()
    {
        return this.zzb;
    }

    public final Object get(long p1, java.util.concurrent.TimeUnit p3)
    {
        p3.getClass();
        return this.zzb;
    }

    public final boolean isCancelled()
    {
        return 0;
    }

    public final boolean isDone()
    {
        return 1;
    }

    public final String toString()
    {
        String v0_0 = this.zzb;
        String v1_0 = super.toString();
        String v0_3 = v0_0.toString();
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append(v1_0);
        v2_1.append("[status=SUCCESS, result=[");
        v2_1.append(v0_3);
        v2_1.append("]]");
        return v2_1.toString();
    }

    public final void zzb(Runnable p8, java.util.concurrent.Executor p9)
    {
        com.google.android.gms.internal.play_billing.zzbg.zzc(p9, "Executor was null.");
        try {
            p9.execute(p8);
            return;
        } catch (String v0_2) {
            com.google.android.gms.internal.play_billing.zzcx.zza.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", g2.g.f("RuntimeException while executing runnable ", p8.toString(), " with executor ", String.valueOf(p9)), v0_2);
            return;
        }
    }
}
