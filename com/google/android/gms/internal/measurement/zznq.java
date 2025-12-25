package com.google.android.gms.internal.measurement;
final class zznq implements com.google.android.gms.internal.measurement.zznx {
    private final com.google.android.gms.internal.measurement.zznm zza;
    private final com.google.android.gms.internal.measurement.zzoi zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.measurement.zzls zzd;

    private zznq(com.google.android.gms.internal.measurement.zzoi p1, com.google.android.gms.internal.measurement.zzls p2, com.google.android.gms.internal.measurement.zznm p3)
    {
        this.zzb = p1;
        this.zzc = (p3 instanceof com.google.android.gms.internal.measurement.zzmc);
        this.zzd = p2;
        this.zza = p3;
        return;
    }

    public static com.google.android.gms.internal.measurement.zznq zzg(com.google.android.gms.internal.measurement.zzoi p1, com.google.android.gms.internal.measurement.zzls p2, com.google.android.gms.internal.measurement.zznm p3)
    {
        return new com.google.android.gms.internal.measurement.zznq(p1, p2, p3);
    }

    public final Object zza()
    {
        com.google.android.gms.internal.measurement.zznm v0_0 = this.zza;
        if (!(v0_0 instanceof com.google.android.gms.internal.measurement.zzmf)) {
            return v0_0.zzcC().zzbf();
        } else {
            return ((com.google.android.gms.internal.measurement.zzmf) v0_0).zzch();
        }
    }

    public final boolean zzb(Object p3, Object p4)
    {
        if (((com.google.android.gms.internal.measurement.zzmf) p3).zzc.equals(((com.google.android.gms.internal.measurement.zzmf) p4).zzc)) {
            if (!this.zzc) {
                return 1;
            } else {
                return ((com.google.android.gms.internal.measurement.zzmc) p3).zzb.equals(((com.google.android.gms.internal.measurement.zzmc) p4).zzb);
            }
        } else {
            return 0;
        }
    }

    public final int zzc(Object p3)
    {
        int v0_2 = ((com.google.android.gms.internal.measurement.zzmf) p3).zzc.hashCode();
        if (this.zzc) {
            v0_2 = ((v0_2 * 53) + ((com.google.android.gms.internal.measurement.zzmc) p3).zzb.zza.hashCode());
        }
        return v0_2;
    }

    public final void zzd(Object p2, Object p3)
    {
        com.google.android.gms.internal.measurement.zznz.zzD(this.zzb, p2, p3);
        if (this.zzc) {
            com.google.android.gms.internal.measurement.zznz.zzC(this.zzd, p2, p3);
        }
        return;
    }

    public final int zze(Object p3)
    {
        int v0_2 = ((com.google.android.gms.internal.measurement.zzmf) p3).zzc.zzh();
        if (this.zzc) {
            v0_2 += ((com.google.android.gms.internal.measurement.zzmc) p3).zzb.zzg();
        }
        return v0_2;
    }

    public final void zzf(Object p6, com.google.android.gms.internal.measurement.zzov p7)
    {
        java.util.Iterator v0_3 = ((com.google.android.gms.internal.measurement.zzmc) p6).zzb.zzc();
        while (v0_3.hasNext()) {
            Object v1_1 = ((java.util.Map$Entry) v0_3.next());
            int v2_1 = ((com.google.android.gms.internal.measurement.zzlv) v1_1.getKey());
            if ((v2_1.zzc() != com.google.android.gms.internal.measurement.zzou.zzi) || ((v2_1.zzd()) || (v2_1.zze()))) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else {
                if (!(v1_1 instanceof com.google.android.gms.internal.measurement.zzmt)) {
                    p7.zzv(v2_1.zza(), v1_1.getValue());
                } else {
                    p7.zzv(v2_1.zza(), ((com.google.android.gms.internal.measurement.zzmt) v1_1).zza().zzc());
                }
            }
        }
        ((com.google.android.gms.internal.measurement.zzmf) p6).zzc.zzf(p7);
        return;
    }

    public final void zzi(Object p1, byte[] p2, int p3, int p4, com.google.android.gms.internal.measurement.zzkw p5)
    {
        if (((com.google.android.gms.internal.measurement.zzmf) p1).zzc == com.google.android.gms.internal.measurement.zzoj.zza()) {
            ((com.google.android.gms.internal.measurement.zzmf) p1).zzc = com.google.android.gms.internal.measurement.zzoj.zzb();
        }
        throw 0;
    }

    public final void zzj(Object p2)
    {
        this.zzb.zzb(p2);
        this.zzd.zza(p2);
        return;
    }

    public final boolean zzk(Object p1)
    {
        return ((com.google.android.gms.internal.measurement.zzmc) p1).zzb.zze();
    }
}
