package com.google.android.gms.internal.measurement;
public final class zzu extends com.google.android.gms.internal.measurement.zzai {
    private final java.util.concurrent.Callable zza;

    public zzu(String p1, java.util.concurrent.Callable p2)
    {
        super("internal.appMetadata");
        super.zza = p2;
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg p1, java.util.List p2)
    {
        try {
            return com.google.android.gms.internal.measurement.zzi.zza(this.zza.call());
        } catch (Exception) {
            return com.google.android.gms.internal.measurement.zzao.zzf;
        }
    }
}
