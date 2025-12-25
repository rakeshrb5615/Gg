package com.google.android.gms.internal.play_billing;
public final class zzbi {
    private final com.google.android.gms.internal.play_billing.zzbl zza;
    private boolean zzb;
    private long zzc;
    private long zzd;

    public zzbi()
    {
        this.zza = com.google.android.gms.internal.play_billing.zzbl.zzb();
        return;
    }

    public zzbi(com.google.android.gms.internal.play_billing.zzbl p2)
    {
        com.google.android.gms.internal.play_billing.zzbg.zzc(p2, "ticker");
        this.zza = p2;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzbi zzb(com.google.android.gms.internal.play_billing.zzbl p1)
    {
        com.google.android.gms.internal.play_billing.zzbi v0_1 = new com.google.android.gms.internal.play_billing.zzbi(p1);
        v0_1.zze();
        return v0_1;
    }

    public static com.google.android.gms.internal.play_billing.zzbi zzc(com.google.android.gms.internal.play_billing.zzbl p1)
    {
        return new com.google.android.gms.internal.play_billing.zzbi(p1);
    }

    private final long zzh()
    {
        if (!this.zzb) {
            return this.zzc;
        } else {
            return ((this.zza.zza() - this.zzd) + this.zzc);
        }
    }

    public final String toString()
    {
        String v0_0 = this.zzh();
        double v2_0 = java.util.concurrent.TimeUnit.DAYS;
        double v3_0 = java.util.concurrent.TimeUnit.NANOSECONDS;
        if (v2_0.convert(v0_0, v3_0) <= 0) {
            v2_0 = java.util.concurrent.TimeUnit.HOURS;
            if (v2_0.convert(v0_0, v3_0) <= 0) {
                v2_0 = java.util.concurrent.TimeUnit.MINUTES;
                if (v2_0.convert(v0_0, v3_0) <= 0) {
                    v2_0 = java.util.concurrent.TimeUnit.SECONDS;
                    if (v2_0.convert(v0_0, v3_0) <= 0) {
                        v2_0 = java.util.concurrent.TimeUnit.MILLISECONDS;
                        if (v2_0.convert(v0_0, v3_0) <= 0) {
                            v2_0 = java.util.concurrent.TimeUnit.MICROSECONDS;
                            if (v2_0.convert(v0_0, v3_0) <= 0) {
                                v2_0 = v3_0;
                            }
                        }
                    }
                }
            }
        }
        String v1_3;
        String vtmp7 = String.format(java.util.Locale.ROOT, "%.4g", new Object[] {Double.valueOf((((double) v0_0) / ((double) v3_0.convert(1, v2_0))))}));
        switch (com.google.android.gms.internal.play_billing.zzbh.zza[v2_0.ordinal()]) {
            case 1:
                v1_3 = "ns";
                break;
            case 2:
                v1_3 = "\u03bcs";
                break;
            case 3:
                v1_3 = "ms";
                break;
            case 4:
                v1_3 = "s";
                break;
            case 5:
                v1_3 = "min";
                break;
            case 6:
                v1_3 = "h";
                break;
            case 7:
                v1_3 = "d";
                break;
            default:
                throw new AssertionError();
        }
        return g2.g.e(vtmp7, " ", v1_3);
    }

    public final long zza(java.util.concurrent.TimeUnit p4)
    {
        return p4.convert(this.zzh(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final com.google.android.gms.internal.play_billing.zzbi zzd()
    {
        this.zzc = 0;
        this.zzb = 0;
        return this;
    }

    public final com.google.android.gms.internal.play_billing.zzbi zze()
    {
        com.google.android.gms.internal.play_billing.zzbg.zze((this.zzb ^ 1), "This stopwatch is already running.");
        this.zzb = 1;
        this.zzd = this.zza.zza();
        return this;
    }

    public final com.google.android.gms.internal.play_billing.zzbi zzf()
    {
        long v0_3 = this.zza.zza();
        com.google.android.gms.internal.play_billing.zzbg.zze(this.zzb, "This stopwatch is already stopped.");
        this.zzb = 0;
        this.zzc = ((v0_3 - this.zzd) + this.zzc);
        return this;
    }

    public final boolean zzg()
    {
        return this.zzb;
    }
}
