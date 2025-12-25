package com.google.android.gms.measurement.internal;
abstract class zzjf extends com.google.android.gms.measurement.internal.zzje {
    private boolean zza;

    public zzjf(com.google.android.gms.measurement.internal.zzic p1)
    {
        super(p1);
        super.zzu.zzF();
        return;
    }

    public abstract boolean zza();

    public void zzba()
    {
        return;
    }

    public final boolean zzv()
    {
        if (!this.zza) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zzw()
    {
        if (!this.zzv()) {
            throw new IllegalStateException("Not initialized");
        } else {
            return;
        }
    }

    public final void zzx()
    {
        if (this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        } else {
            if (!this.zza()) {
                this.zzu.zzG();
                this.zza = 1;
            }
            return;
        }
    }

    public final void zzy()
    {
        if (this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        } else {
            this.zzba();
            this.zzu.zzG();
            this.zza = 1;
            return;
        }
    }
}
