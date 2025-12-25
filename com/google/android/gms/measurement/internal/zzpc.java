package com.google.android.gms.measurement.internal;
final class zzpc {
    com.google.android.gms.internal.measurement.zzid zza;
    java.util.List zzb;
    java.util.List zzc;
    long zzd;
    final synthetic com.google.android.gms.measurement.internal.zzpg zze;

    public synthetic zzpc(com.google.android.gms.measurement.internal.zzpg p1, byte[] p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        return;
    }

    private static final long zzb(com.google.android.gms.internal.measurement.zzhs p4)
    {
        return (((p4.zzf() / 1000) / long v2_1) / 60);
    }

    public final boolean zza(long p8, com.google.android.gms.internal.measurement.zzhs p10)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p10);
        if (this.zzc == null) {
            this.zzc = new java.util.ArrayList();
        }
        if (this.zzb == null) {
            this.zzb = new java.util.ArrayList();
        }
        if ((!this.zzc.isEmpty()) && (com.google.android.gms.measurement.internal.zzpc.zzb(((com.google.android.gms.internal.measurement.zzhs) this.zzc.get(0))) != com.google.android.gms.measurement.internal.zzpc.zzb(p10))) {
            return 0;
        } else {
            java.util.List v2_2 = (this.zzd + ((long) p10.zzcn()));
            com.google.android.gms.measurement.internal.zzpg v0_9 = this.zze;
            if (!v0_9.zzd().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbd)) {
                v0_9.zzd();
                if (v2_2 >= ((long) com.google.android.gms.measurement.internal.zzal.zzG())) {
                    return 0;
                }
            } else {
                if (!this.zzc.isEmpty()) {
                    v0_9.zzd();
                    if (v2_2 >= ((long) com.google.android.gms.measurement.internal.zzal.zzG())) {
                        return 0;
                    }
                }
            }
            this.zzd = v2_2;
            this.zzc.add(p10);
            this.zzb.add(Long.valueOf(p8));
            int v8_3 = this.zzc.size();
            v0_9.zzd();
            if (v8_3 < Math.max(1, ((Integer) com.google.android.gms.measurement.internal.zzfy.zzj.zzb(0)).intValue())) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
