package com.google.android.gms.internal.play_billing;
public final class zzaz {
    private static final com.google.android.gms.internal.play_billing.zzbl zza;

    static zzaz()
    {
        try {
            android.os.SystemClock.elapsedRealtimeNanos();
            com.google.android.gms.internal.play_billing.zzay v0_1 = new com.google.android.gms.internal.play_billing.zzax();
        } catch (Throwable) {
            android.os.SystemClock.elapsedRealtime();
            v0_1 = new com.google.android.gms.internal.play_billing.zzay();
        }
        com.google.android.gms.internal.play_billing.zzaz.zza = v0_1;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzbl zza()
    {
        return com.google.android.gms.internal.play_billing.zzaz.zza;
    }
}
