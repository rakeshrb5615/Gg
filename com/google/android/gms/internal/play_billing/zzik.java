package com.google.android.gms.internal.play_billing;
final class zzik implements com.google.android.gms.internal.play_billing.zzfl {
    static final com.google.android.gms.internal.play_billing.zzfl zza;

    static zzik()
    {
        com.google.android.gms.internal.play_billing.zzik.zza = new com.google.android.gms.internal.play_billing.zzik();
        return;
    }

    private zzik()
    {
        return;
    }

    public final boolean zza(int p3)
    {
        com.google.android.gms.internal.play_billing.zzil v3_1;
        if (p3 == null) {
            v3_1 = com.google.android.gms.internal.play_billing.zzil.zza;
        } else {
            if (p3 == 1) {
                v3_1 = com.google.android.gms.internal.play_billing.zzil.zzb;
            } else {
                if (p3 == 2) {
                    v3_1 = com.google.android.gms.internal.play_billing.zzil.zzc;
                } else {
                    if (p3 == 3) {
                        v3_1 = com.google.android.gms.internal.play_billing.zzil.zzd;
                    } else {
                        v3_1 = 0;
                    }
                }
            }
        }
        if (v3_1 == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
