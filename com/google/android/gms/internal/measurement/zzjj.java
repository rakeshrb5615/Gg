package com.google.android.gms.internal.measurement;
final class zzjj extends android.database.ContentObserver {
    final synthetic com.google.android.gms.internal.measurement.zzjl zza;

    public zzjj(com.google.android.gms.internal.measurement.zzjl p1, android.os.Handler p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        super(0);
        return;
    }

    public final void onChange(boolean p2)
    {
        this.zza.zzb().set(1);
        return;
    }
}
