package com.google.android.gms.internal.play_billing;
final class zzct implements java.lang.Runnable {
    final java.util.concurrent.Future zza;
    final com.google.android.gms.internal.play_billing.zzcs zzb;

    public zzct(java.util.concurrent.Future p1, com.google.android.gms.internal.play_billing.zzcs p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void run()
    {
        Throwable v0_0 = this.zza;
        if ((v0_0 instanceof com.google.android.gms.internal.play_billing.zzdf)) {
            Thread v1_12 = com.google.android.gms.internal.play_billing.zzdg.zza(((com.google.android.gms.internal.play_billing.zzdf) v0_0));
            if (v1_12 != null) {
                this.zzb.zza(v1_12);
                return;
            }
        }
        try {
            if (!v0_0.isDone()) {
                throw new IllegalStateException(com.google.android.gms.internal.play_billing.zzbj.zza("Future was expected to be done: %s", new Object[] {v0_0})));
            } else {
                Thread v1_4 = 0;
                try {
                    while(true) {
                        v0_0 = v0_0.get();
                        v1_4 = 1;
                    }
                } catch (Throwable v0_3) {
                    if (v1_4 != null) {
                        Thread.currentThread().interrupt();
                    }
                    throw v0_3;
                }
                if (v1_4 != null) {
                    Thread.currentThread().interrupt();
                }
                this.zzb.zzb(v0_0);
                return;
            }
        } catch (Throwable v0_5) {
            this.zzb.zza(v0_5.getCause());
            return;
        } catch (Throwable v0_4) {
            this.zzb.zza(v0_4);
            return;
        }
    }

    public final String toString()
    {
        String v0_0 = com.google.android.gms.internal.play_billing.zzbe.zza(this);
        v0_0.zza(this.zzb);
        return v0_0.toString();
    }
}
