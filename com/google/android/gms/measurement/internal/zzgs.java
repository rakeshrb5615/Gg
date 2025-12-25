package com.google.android.gms.measurement.internal;
public final class zzgs {
    final synthetic com.google.android.gms.measurement.internal.zzgu zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzgs(com.google.android.gms.measurement.internal.zzgu p1, int p2, boolean p3, boolean p4)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzb = p2;
        this.zzc = p3;
        this.zzd = p4;
        return;
    }

    public final void zza(String p9)
    {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, p9, 0, 0, 0);
        return;
    }

    public final void zzb(String p9, Object p10)
    {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, p9, p10, 0, 0);
        return;
    }

    public final void zzc(String p9, Object p10, Object p11)
    {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, p9, p10, p11, 0);
        return;
    }

    public final void zzd(String p9, Object p10, Object p11, Object p12)
    {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, p9, p10, p11, p12);
        return;
    }
}
