package com.google.android.recaptcha.internal;
public final class zzjh {
    private boolean zza;
    private long zzb;
    private long zzc;

    public zzjh()
    {
        return;
    }

    public static com.google.android.recaptcha.internal.zzjh zzb()
    {
        com.google.android.recaptcha.internal.zzjh v0_1 = new com.google.android.recaptcha.internal.zzjh();
        v0_1.zze();
        return v0_1;
    }

    public static com.google.android.recaptcha.internal.zzjh zzc()
    {
        return new com.google.android.recaptcha.internal.zzjh();
    }

    private final long zzg()
    {
        if (!this.zza) {
            return this.zzb;
        } else {
            return ((System.nanoTime() - this.zzc) + this.zzb);
        }
    }

    public final String toString()
    {
        String v0_0 = this.zzg();
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
        switch (com.google.android.recaptcha.internal.zzjg.zza[v2_0.ordinal()]) {
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
        return p4.convert(this.zzg(), java.util.concurrent.TimeUnit.NANOSECONDS);
    }

    public final com.google.android.recaptcha.internal.zzjh zzd()
    {
        this.zzb = 0;
        this.zza = 0;
        return this;
    }

    public final com.google.android.recaptcha.internal.zzjh zze()
    {
        com.google.android.recaptcha.internal.zzjf.zze((this.zza ^ 1), "This stopwatch is already running.");
        this.zza = 1;
        this.zzc = System.nanoTime();
        return this;
    }

    public final com.google.android.recaptcha.internal.zzjh zzf()
    {
        long v0_0 = System.nanoTime();
        com.google.android.recaptcha.internal.zzjf.zze(this.zza, "This stopwatch is already stopped.");
        this.zza = 0;
        this.zzb = ((v0_0 - this.zzc) + this.zzb);
        return this;
    }
}
