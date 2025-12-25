package com.google.android.gms.internal.measurement;
final class zzes extends com.google.android.gms.internal.measurement.zzcz {
    private final com.google.android.gms.measurement.internal.zzjq zza;

    public zzes(com.google.android.gms.measurement.internal.zzjq p1)
    {
        this.zza = p1;
        return;
    }

    public final void zze(String p7, String p8, android.os.Bundle p9, long p10)
    {
        this.zza.onEvent(p7, p8, p9, p10);
        return;
    }

    public final int zzf()
    {
        return System.identityHashCode(this.zza);
    }
}
