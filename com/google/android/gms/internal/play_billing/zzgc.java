package com.google.android.gms.internal.play_billing;
final class zzgc implements com.google.android.gms.internal.play_billing.zzgj {
    private final com.google.android.gms.internal.play_billing.zzgj[] zza;

    public varargs zzgc(com.google.android.gms.internal.play_billing.zzgj[] p1)
    {
        this.zza = p1;
        return;
    }

    public final com.google.android.gms.internal.play_billing.zzgi zzb(Class p4)
    {
        int v0_0 = 0;
        while (v0_0 < 2) {
            String v1_2 = this.zza[v0_0];
            if (!v1_2.zzc(p4)) {
                v0_0++;
            } else {
                return v1_2.zzb(p4);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(p4.getName()));
    }

    public final boolean zzc(Class p4)
    {
        int v1 = 0;
        while (v1 < 2) {
            if (!this.zza[v1].zzc(p4)) {
                v1++;
            } else {
                return 1;
            }
        }
        return 0;
    }
}
