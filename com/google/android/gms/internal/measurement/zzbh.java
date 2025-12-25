package com.google.android.gms.internal.measurement;
public final class zzbh extends com.google.android.gms.internal.measurement.zzav {

    public zzbh()
    {
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zza);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzv);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzS);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzT);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzU);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzaa);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzab);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzad);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzae);
        this.zza.add(com.google.android.gms.internal.measurement.zzbk.zzah);
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(String p6, com.google.android.gms.internal.measurement.zzg p7, java.util.List p8)
    {
        double v0_9 = com.google.android.gms.internal.measurement.zzh.zze(p6).ordinal();
        if (v0_9 == 0) {
            Double v6_10 = p7.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zza, 2, p8, 0)));
            com.google.android.gms.internal.measurement.zzah v7_6 = p7.zza(((com.google.android.gms.internal.measurement.zzao) p8.get(1)));
            if ((!(v6_10 instanceof com.google.android.gms.internal.measurement.zzak)) && ((!(v6_10 instanceof com.google.android.gms.internal.measurement.zzas)) && ((!(v7_6 instanceof com.google.android.gms.internal.measurement.zzak)) && (!(v7_6 instanceof com.google.android.gms.internal.measurement.zzas))))) {
                return new com.google.android.gms.internal.measurement.zzah(Double.valueOf((v7_6.zzd().doubleValue() + v6_10.zzd().doubleValue())));
            } else {
                return new com.google.android.gms.internal.measurement.zzas(String.valueOf(v6_10.zzc()).concat(String.valueOf(v7_6.zzc())));
            }
        } else {
            if (v0_9 == 21) {
                return new com.google.android.gms.internal.measurement.zzah(Double.valueOf((p7.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzv, 2, p8, 0))).zzd().doubleValue() / p7.zza(((com.google.android.gms.internal.measurement.zzao) p8.get(1))).zzd().doubleValue())));
            } else {
                if (v0_9 == 59) {
                    return new com.google.android.gms.internal.measurement.zzah(Double.valueOf((new com.google.android.gms.internal.measurement.zzah(Double.valueOf((- p7.zza(((com.google.android.gms.internal.measurement.zzao) p8.get(1))).zzd().doubleValue()))).zzd().doubleValue() + p7.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzah, 2, p8, 0))).zzd().doubleValue())));
                } else {
                    if ((v0_9 == 52) || (v0_9 == 53)) {
                        com.google.android.gms.internal.measurement.zzh.zza(p6, 2, p8);
                        Double v6_8 = p7.zza(((com.google.android.gms.internal.measurement.zzao) p8.get(0)));
                        p7.zza(((com.google.android.gms.internal.measurement.zzao) p8.get(1)));
                        return v6_8;
                    } else {
                        if ((v0_9 == 55) || (v0_9 == 56)) {
                            com.google.android.gms.internal.measurement.zzh.zza(p6, 1, p8);
                            return p7.zza(((com.google.android.gms.internal.measurement.zzao) p8.get(0)));
                        } else {
                            switch (v0_9) {
                                case 44:
                                    return new com.google.android.gms.internal.measurement.zzah(Double.valueOf((p7.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzS, 2, p8, 0))).zzd().doubleValue() % p7.zza(((com.google.android.gms.internal.measurement.zzao) p8.get(1))).zzd().doubleValue())));
                                case 45:
                                    return new com.google.android.gms.internal.measurement.zzah(Double.valueOf((p7.zza(((com.google.android.gms.internal.measurement.zzao) p8.get(1))).zzd().doubleValue() * p7.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzT, 2, p8, 0))).zzd().doubleValue())));
                                case 46:
                                    return new com.google.android.gms.internal.measurement.zzah(Double.valueOf((- p7.zza(((com.google.android.gms.internal.measurement.zzao) v1.a.f(com.google.android.gms.internal.measurement.zzbk.zzU, 1, p8, 0))).zzd().doubleValue())));
                                default:
                                    return this.zzb(p6);
                            }
                        }
                    }
                }
            }
        }
    }
}
