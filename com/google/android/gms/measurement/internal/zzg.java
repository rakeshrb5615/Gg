package com.google.android.gms.measurement.internal;
abstract class zzg extends com.google.android.gms.measurement.internal.zzf {
    private boolean zza;

    public zzg(com.google.android.gms.measurement.internal.zzic p1)
    {
        super(p1);
        super.zzu.zzF();
        return;
    }

    public final boolean zza()
    {
        if (!this.zza) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zzb()
    {
        if (!this.zza()) {
            throw new IllegalStateException("Not initialized");
        } else {
            return;
        }
    }

    public final void zzc()
    {
        if (this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        } else {
            if (!this.zze()) {
                this.zzu.zzG();
                this.zza = 1;
            }
            return;
        }
    }

    public final void zzd()
    {
        if (this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        } else {
            this.zzf();
            this.zzu.zzG();
            this.zza = 1;
            return;
        }
    }

    public abstract boolean zze();

    public void zzf()
    {
        return;
    }
}
