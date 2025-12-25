package com.google.android.gms.measurement.internal;
final class zzoa {
    protected long zza;
    protected long zzb;
    final synthetic com.google.android.gms.measurement.internal.zzoc zzc;
    private final com.google.android.gms.measurement.internal.zzay zzd;

    public zzoa(com.google.android.gms.measurement.internal.zzoc p3)
    {
        java.util.Objects.requireNonNull(p3);
        this.zzc = p3;
        this.zzd = new com.google.android.gms.measurement.internal.zznz(this, p3.zzu);
        long v0_0 = p3.zzu.zzaZ().elapsedRealtime();
        this.zza = v0_0;
        this.zzb = v0_0;
        return;
    }

    public final void zza(long p2)
    {
        this.zzc.zzg();
        this.zzd.zzd();
        this.zza = p2;
        this.zzb = p2;
        return;
    }

    public final void zzb(long p1)
    {
        this.zzd.zzd();
        return;
    }

    public final void zzc()
    {
        this.zzd.zzd();
        long v0_4 = this.zzc.zzu.zzaZ().elapsedRealtime();
        this.zza = v0_4;
        this.zzb = v0_4;
        return;
    }

    public final boolean zzd(boolean p7, boolean p8, long p9)
    {
        String v0_0 = this.zzc;
        v0_0.zzg();
        v0_0.zzb();
        if (v0_0.zzu.zzB()) {
            int v1_7 = v0_0.zzu;
            v1_7.zzd().zzk.zzb(v1_7.zzaZ().currentTimeMillis());
        }
        int v1_2 = (p9 - this.zza);
        if ((p7 == null) && (v1_2 < 1000)) {
            v0_0.zzu.zzaV().zzk().zzb("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(v1_2));
            return 0;
        } else {
            if (p8 == 0) {
                v1_2 = (p9 - this.zzb);
                this.zzb = p9;
            }
            com.google.android.gms.measurement.internal.zzay v7_6 = v0_0.zzu;
            v7_6.zzaV().zzk().zzb("Recording user engagement, ms", Long.valueOf(v1_2));
            android.os.Bundle v3_5 = new android.os.Bundle();
            v3_5.putLong("_et", v1_2);
            String v0_1 = v0_0.zzu;
            com.google.android.gms.measurement.internal.zzpp.zzav(v0_1.zzs().zzh((v7_6.zzc().zzv() ^ 1)), v3_5, 1);
            if (p8 == 0) {
                v0_1.zzj().zzF("auto", "_e", v3_5);
            }
            this.zza = p9;
            com.google.android.gms.measurement.internal.zzay v7_12 = this.zzd;
            v7_12.zzd();
            v7_12.zzb(((Long) com.google.android.gms.measurement.internal.zzfy.zzaq.zzb(0)).longValue());
            return 1;
        }
    }
}
