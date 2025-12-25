package com.google.android.gms.measurement.internal;
abstract class zzos extends com.google.android.gms.measurement.internal.zzol {
    private boolean zza;

    public zzos(com.google.android.gms.measurement.internal.zzpg p1)
    {
        super(p1);
        super.zzg.zzae();
        return;
    }

    public final boolean zzav()
    {
        if (!this.zza) {
            return 0;
        } else {
            return 1;
        }
    }

    public final void zzaw()
    {
        if (!this.zzav()) {
            throw new IllegalStateException("Not initialized");
        } else {
            return;
        }
    }

    public final void zzax()
    {
        if (this.zza) {
            throw new IllegalStateException("Can\'t initialize twice");
        } else {
            this.zzbb();
            this.zzg.zzaf();
            this.zza = 1;
            return;
        }
    }

    public abstract boolean zzbb();
}
