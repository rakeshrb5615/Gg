package com.google.android.gms.internal.measurement;
public final class zzau extends com.google.android.gms.internal.measurement.zzav {

    public zzau()
    {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zze);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzf);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzg);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzh);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzi);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzj);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzk);
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(String p8, com.google.android.gms.internal.measurement.zzg p9, java.util.List p10)
    {
        switch (com.google.android.gms.internal.measurement.zzh.zze(p8).ordinal()) {
            case 4:
                return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) (com.google.android.gms.internal.measurement.zzh.zzg(p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zze, 2, p10, 0))).zzd().doubleValue()) & com.google.android.gms.internal.measurement.zzh.zzg(p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(1))).zzd().doubleValue())))));
            case 5:
                return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) (com.google.android.gms.internal.measurement.zzh.zzg(p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzf, 2, p10, 0))).zzd().doubleValue()) << ((int) (com.google.android.gms.internal.measurement.zzh.zzh(p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(1))).zzd().doubleValue()) & 31))))));
            case 6:
                return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) (~ com.google.android.gms.internal.measurement.zzh.zzg(p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzg, 1, p10, 0))).zzd().doubleValue())))));
            case 7:
                return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) (com.google.android.gms.internal.measurement.zzh.zzg(p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzh, 2, p10, 0))).zzd().doubleValue()) | com.google.android.gms.internal.measurement.zzh.zzg(p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(1))).zzd().doubleValue())))));
            case 8:
                return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) (com.google.android.gms.internal.measurement.zzh.zzg(p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzi, 2, p10, 0))).zzd().doubleValue()) >> ((int) (com.google.android.gms.internal.measurement.zzh.zzh(p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(1))).zzd().doubleValue()) & 31))))));
            case 9:
                return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) (com.google.android.gms.internal.measurement.zzh.zzh(p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzj, 2, p10, 0))).zzd().doubleValue()) >> ((int) (com.google.android.gms.internal.measurement.zzh.zzh(p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(1))).zzd().doubleValue()) & 31))))));
            case 10:
                return new com.google.android.gms.internal.measurement.zzah(Double.valueOf(((double) (com.google.android.gms.internal.measurement.zzh.zzg(p9.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzk, 2, p10, 0))).zzd().doubleValue()) ^ com.google.android.gms.internal.measurement.zzh.zzg(p9.zza(((com.google.android.gms.internal.measurement.zzao) p10.get(1))).zzd().doubleValue())))));
            default:
                return this.zzb(p8);
        }
    }
}
