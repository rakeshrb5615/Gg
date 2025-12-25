package com.google.android.gms.measurement.internal;
public final class zzoc extends com.google.android.gms.measurement.internal.zzg {
    protected final com.google.android.gms.measurement.internal.zzob zza;
    protected final com.google.android.gms.measurement.internal.zzoa zzb;
    protected final com.google.android.gms.measurement.internal.zzny zzc;
    private android.os.Handler zzd;
    private boolean zze;

    public zzoc(com.google.android.gms.measurement.internal.zzic p1)
    {
        super(p1);
        super.zze = 1;
        super.zza = new com.google.android.gms.measurement.internal.zzob(super);
        super.zzb = new com.google.android.gms.measurement.internal.zzoa(super);
        super.zzc = new com.google.android.gms.measurement.internal.zzny(super);
        return;
    }

    private final void zzn()
    {
        this.zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzcn(android.os.Looper.getMainLooper());
        }
        return;
    }

    public final boolean zze()
    {
        return 0;
    }

    public final void zzh(boolean p1)
    {
        this.zzg();
        this.zze = p1;
        return;
    }

    public final boolean zzi()
    {
        this.zzg();
        return this.zze;
    }

    public final synthetic void zzj()
    {
        this.zzn();
        return;
    }

    public final synthetic void zzk(long p5)
    {
        this.zzg();
        this.zzn();
        long v0_0 = this.zzu;
        v0_0.zzaV().zzk().zzb("Activity resumed, time", Long.valueOf(p5));
        if (!v0_0.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaU)) {
            if ((v0_0.zzc().zzv()) || (v0_0.zzd().zzn.zza())) {
                this.zzb.zza(p5);
            }
        } else {
            if ((v0_0.zzc().zzv()) || (this.zze)) {
                this.zzb.zza(p5);
            }
        }
        this.zzc.zza();
        com.google.android.gms.measurement.internal.zzob v5_2 = this.zza;
        int v6_0 = v5_2.zza;
        v6_0.zzg();
        if (v6_0.zzu.zzB()) {
            v5_2.zzb(v6_0.zzu.zzaZ().currentTimeMillis(), 0);
            return;
        } else {
            return;
        }
    }

    public final synthetic void zzl(long p5)
    {
        this.zzg();
        this.zzn();
        com.google.android.gms.measurement.internal.zzoa v0_3 = this.zzu;
        v0_3.zzaV().zzk().zzb("Activity paused, time", Long.valueOf(p5));
        this.zzc.zzb(p5);
        if (v0_3.zzc().zzv()) {
            this.zzb.zzb(p5);
        }
        return;
    }

    public final synthetic android.os.Handler zzm()
    {
        return this.zzd;
    }
}
