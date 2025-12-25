package com.google.android.gms.measurement.internal;
public final class zzjs {
    final android.content.Context zza;
    Boolean zzb;
    long zzc;
    com.google.android.gms.internal.measurement.zzdd zzd;
    boolean zze;
    final Long zzf;
    String zzg;

    public zzjs(android.content.Context p4, com.google.android.gms.internal.measurement.zzdd p5, Long p6)
    {
        this.zze = 1;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        Boolean v4_6 = p4.getApplicationContext();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_6);
        this.zza = v4_6;
        this.zzf = p6;
        if (p5 != null) {
            this.zzd = p5;
            this.zze = p5.zzc;
            this.zzc = p5.zzb;
            this.zzg = p5.zze;
            Boolean v4_3 = p5.zzd;
            if (v4_3 != null) {
                this.zzb = Boolean.valueOf(v4_3.getBoolean("dataCollectionDefaultEnabled", 1));
            }
        }
        return;
    }
}
