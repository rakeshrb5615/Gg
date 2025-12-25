package com.google.android.gms.measurement.internal;
public final class zzhe {
    final synthetic com.google.android.gms.measurement.internal.zzhh zza;
    private final String zzb;
    private final long zzc;
    private boolean zzd;
    private long zze;

    public zzhe(com.google.android.gms.measurement.internal.zzhh p1, String p2, long p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzb = p2;
        this.zzc = p3;
        return;
    }

    public final long zza()
    {
        if (!this.zzd) {
            this.zzd = 1;
            this.zze = this.zza.zzd().getLong(this.zzb, this.zzc);
        }
        return this.zze;
    }

    public final void zzb(long p3)
    {
        android.content.SharedPreferences$Editor v0_2 = this.zza.zzd().edit();
        v0_2.putLong(this.zzb, p3);
        v0_2.apply();
        this.zze = p3;
        return;
    }
}
