package com.google.android.gms.internal.measurement;
final class zzs extends com.google.android.gms.internal.measurement.zzai {
    final boolean zza;
    final boolean zzb;
    final synthetic com.google.android.gms.internal.measurement.zzt zzc;

    public zzs(com.google.android.gms.internal.measurement.zzt p1, boolean p2, boolean p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        super("log");
        super.zza = p2;
        super.zzb = p3;
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg p12, java.util.List p13)
    {
        com.google.android.gms.internal.measurement.zzh.zzb("log", 1, p13);
        if (p13.size() != 1) {
            int v4_0;
            int v6_0;
            String v0_3 = com.google.android.gms.internal.measurement.zzh.zzg(p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0))).zzd().doubleValue());
            int v3_0 = 2;
            if (v0_3 == 2) {
                v4_0 = 4;
                v6_0 = v4_0;
            } else {
                v4_0 = 3;
                if (v0_3 == 3) {
                    v6_0 = 1;
                } else {
                    if (v0_3 == 5) {
                        v6_0 = 5;
                    } else {
                        if (v0_3 == 6) {
                            v6_0 = 2;
                        }
                    }
                }
            }
            String v7 = p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(1))).zzc();
            if (p13.size() != 2) {
                java.util.ArrayList v8_1 = new java.util.ArrayList();
                while (v3_0 < Math.min(p13.size(), 5)) {
                    v8_1.add(p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(v3_0))).zzc());
                    v3_0++;
                }
                this.zzc.zzb().zza(v6_0, v7, v8_1, this.zza, this.zzb);
                return com.google.android.gms.internal.measurement.zzao.zzf;
            } else {
                this.zzc.zzb().zza(v6_0, v7, java.util.Collections.EMPTY_LIST, this.zza, this.zzb);
                return com.google.android.gms.internal.measurement.zzao.zzf;
            }
        } else {
            this.zzc.zzb().zza(3, p12.zza(((com.google.android.gms.internal.measurement.zzao) p13.get(0))).zzc(), java.util.Collections.EMPTY_LIST, this.zza, this.zzb);
            return com.google.android.gms.internal.measurement.zzao.zzf;
        }
    }
}
