package com.google.android.gms.internal.measurement;
public abstract class zzav {
    final java.util.List zza;

    public zzav()
    {
        this.zza = new java.util.ArrayList();
        return;
    }

    public abstract com.google.android.gms.internal.measurement.zzao zza();

    public final com.google.android.gms.internal.measurement.zzao zzb(String p3)
    {
        if (!this.zza.contains(com.google.android.gms.internal.measurement.zzh.zze(p3))) {
            throw new IllegalArgumentException("Command not supported");
        } else {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(p3)));
        }
    }
}
