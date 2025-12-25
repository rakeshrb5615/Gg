package com.google.android.gms.internal.measurement;
final class zzaz implements java.util.Comparator {
    final synthetic com.google.android.gms.internal.measurement.zzai zza;
    final synthetic com.google.android.gms.internal.measurement.zzg zzb;

    public zzaz(com.google.android.gms.internal.measurement.zzai p1, com.google.android.gms.internal.measurement.zzg p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final bridge synthetic int compare(Object p6, Object p7)
    {
        if (!(((com.google.android.gms.internal.measurement.zzao) p6) instanceof com.google.android.gms.internal.measurement.zzat)) {
            if (!(((com.google.android.gms.internal.measurement.zzao) p7) instanceof com.google.android.gms.internal.measurement.zzat)) {
                com.google.android.gms.internal.measurement.zzai v0_2 = this.zza;
                if (v0_2 != null) {
                    com.google.android.gms.internal.measurement.zzg v3 = this.zzb;
                    com.google.android.gms.internal.measurement.zzao[] v4_1 = new com.google.android.gms.internal.measurement.zzao[2];
                    v4_1[0] = ((com.google.android.gms.internal.measurement.zzao) p6);
                    v4_1[1] = ((com.google.android.gms.internal.measurement.zzao) p7);
                    return ((int) com.google.android.gms.internal.measurement.zzh.zzi(v0_2.zza(v3, java.util.Arrays.asList(v4_1)).zzd().doubleValue()));
                } else {
                    return ((com.google.android.gms.internal.measurement.zzao) p6).zzc().compareTo(((com.google.android.gms.internal.measurement.zzao) p7).zzc());
                }
            } else {
                return -1;
            }
        } else {
            if ((((com.google.android.gms.internal.measurement.zzao) p7) instanceof com.google.android.gms.internal.measurement.zzat)) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
