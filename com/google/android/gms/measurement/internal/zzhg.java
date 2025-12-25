package com.google.android.gms.measurement.internal;
public final class zzhg {
    final synthetic com.google.android.gms.measurement.internal.zzhh zza;
    private final String zzb;
    private boolean zzc;
    private String zzd;

    public zzhg(com.google.android.gms.measurement.internal.zzhh p1, String p2, String p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p2);
        this.zzb = p2;
        return;
    }

    public final String zza()
    {
        if (!this.zzc) {
            this.zzc = 1;
            this.zzd = this.zza.zzd().getString(this.zzb, 0);
        }
        return this.zzd;
    }

    public final void zzb(String p3)
    {
        android.content.SharedPreferences$Editor v0_2 = this.zza.zzd().edit();
        v0_2.putString(this.zzb, p3);
        v0_2.apply();
        this.zzd = p3;
        return;
    }
}
