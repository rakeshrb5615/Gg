package com.google.android.gms.measurement.internal;
final class zzpd {
    final String zza;
    long zzb;

    private zzpd(com.google.android.gms.measurement.internal.zzpg p1, String p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p2;
        this.zzb = p1.zzaZ().elapsedRealtime();
        return;
    }

    public synthetic zzpd(com.google.android.gms.measurement.internal.zzpg p1, String p2, byte[] p3)
    {
        this(p1, p2);
        return;
    }

    public synthetic zzpd(com.google.android.gms.measurement.internal.zzpg p1, byte[] p2)
    {
        this(p1, p1.zzt().zzaw());
        return;
    }
}
