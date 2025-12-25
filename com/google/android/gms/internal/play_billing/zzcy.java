package com.google.android.gms.internal.play_billing;
final class zzcy {
    private final com.google.android.gms.internal.play_billing.zzbm zza;
    private final String zzb;
    private volatile java.util.logging.Logger zzc;

    public zzcy(Class p2)
    {
        this.zza = new com.google.android.gms.internal.play_billing.zzbm();
        this.zzb = p2.getName();
        return;
    }

    public final java.util.logging.Logger zza()
    {
        com.google.android.gms.internal.play_billing.zzbm v0 = this.zzc;
        if (v0 == null) {
            java.util.logging.Logger v1_1 = this.zzc;
            if (v1_1 == null) {
                java.util.logging.Logger v1_3 = java.util.logging.Logger.getLogger(this.zzb);
                this.zzc = v1_3;
                return v1_3;
            } else {
                return v1_1;
            }
        } else {
            return v0;
        }
    }
}
