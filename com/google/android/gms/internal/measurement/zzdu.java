package com.google.android.gms.internal.measurement;
final class zzdu extends com.google.android.gms.internal.measurement.zzcw {
    final synthetic Runnable zza;

    public zzdu(com.google.android.gms.internal.measurement.zzdv p1, Runnable p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        return;
    }

    public final void zze()
    {
        this.zza.run();
        return;
    }
}
