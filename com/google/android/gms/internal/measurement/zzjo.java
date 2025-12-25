package com.google.android.gms.internal.measurement;
final class zzjo extends android.database.ContentObserver {
    final synthetic com.google.android.gms.internal.measurement.zzjr zza;

    public zzjo(com.google.android.gms.internal.measurement.zzjr p1, android.os.Handler p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        super(0);
        return;
    }

    public final void onChange(boolean p1)
    {
        this.zza.zzc();
        return;
    }
}
