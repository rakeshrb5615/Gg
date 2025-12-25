package com.google.android.gms.internal.play_billing;
final class zzgp implements com.google.android.gms.internal.play_billing.zzgv {
    private final com.google.android.gms.internal.play_billing.zzgl zza;
    private final com.google.android.gms.internal.play_billing.zzhh zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.play_billing.zzev zzd;

    private zzgp(com.google.android.gms.internal.play_billing.zzhh p1, com.google.android.gms.internal.play_billing.zzev p2, com.google.android.gms.internal.play_billing.zzgl p3)
    {
        this.zzb = p1;
        this.zzc = (p3 instanceof com.google.android.gms.internal.play_billing.zzff);
        this.zzd = p2;
        this.zza = p3;
        return;
    }

    public static com.google.android.gms.internal.play_billing.zzgp zzc(com.google.android.gms.internal.play_billing.zzhh p1, com.google.android.gms.internal.play_billing.zzev p2, com.google.android.gms.internal.play_billing.zzgl p3)
    {
        return new com.google.android.gms.internal.play_billing.zzgp(p1, p2, p3);
    }

    public final int zza(Object p3)
    {
        int v0_2 = ((com.google.android.gms.internal.play_billing.zzfi) p3).zzc.zzb();
        if (this.zzc) {
            v0_2 += ((com.google.android.gms.internal.play_billing.zzff) p3).zzb.zzd();
        }
        return v0_2;
    }

    public final int zzb(Object p3)
    {
        int v0_2 = ((com.google.android.gms.internal.play_billing.zzfi) p3).zzc.hashCode();
        if (this.zzc) {
            v0_2 = ((v0_2 * 53) + ((com.google.android.gms.internal.play_billing.zzff) p3).zzb.zza.hashCode());
        }
        return v0_2;
    }

    public final Object zze()
    {
        com.google.android.gms.internal.play_billing.zzgl v0_0 = this.zza;
        if (!(v0_0 instanceof com.google.android.gms.internal.play_billing.zzfi)) {
            return v0_0.zzK().zzg();
        } else {
            return ((com.google.android.gms.internal.play_billing.zzfi) v0_0).zzo();
        }
    }

    public final void zzf(Object p2)
    {
        this.zzb.zzb(p2);
        this.zzd.zza(p2);
        return;
    }

    public final void zzg(Object p2, Object p3)
    {
        com.google.android.gms.internal.play_billing.zzgx.zzp(this.zzb, p2, p3);
        if (this.zzc) {
            com.google.android.gms.internal.play_billing.zzgx.zzo(this.zzd, p2, p3);
        }
        return;
    }

    public final void zzh(Object p1, byte[] p2, int p3, int p4, com.google.android.gms.internal.play_billing.zzdw p5)
    {
        if (((com.google.android.gms.internal.play_billing.zzfi) p1).zzc == com.google.android.gms.internal.play_billing.zzhi.zzc()) {
            ((com.google.android.gms.internal.play_billing.zzfi) p1).zzc = com.google.android.gms.internal.play_billing.zzhi.zzf();
        }
        throw 0;
    }

    public final void zzi(Object p6, com.google.android.gms.internal.play_billing.zzhu p7)
    {
        java.util.Iterator v0_3 = ((com.google.android.gms.internal.play_billing.zzff) p6).zzb.zzf();
        while (v0_3.hasNext()) {
            Object v1_1 = ((java.util.Map$Entry) v0_3.next());
            int v2_1 = ((com.google.android.gms.internal.play_billing.zzey) v1_1.getKey());
            if ((v2_1.zzc() != com.google.android.gms.internal.play_billing.zzht.zzi) || ((v2_1.zze()) || (v2_1.zzd()))) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else {
                if (!(v1_1 instanceof com.google.android.gms.internal.play_billing.zzfs)) {
                    p7.zzw(v2_1.zza(), v1_1.getValue());
                } else {
                    p7.zzw(v2_1.zza(), ((com.google.android.gms.internal.play_billing.zzfs) v1_1).zza().zzb());
                }
            }
        }
        ((com.google.android.gms.internal.play_billing.zzfi) p6).zzc.zzk(p7);
        return;
    }

    public final boolean zzj(Object p3, Object p4)
    {
        if (((com.google.android.gms.internal.play_billing.zzfi) p3).zzc.equals(((com.google.android.gms.internal.play_billing.zzfi) p4).zzc)) {
            if (!this.zzc) {
                return 1;
            } else {
                return ((com.google.android.gms.internal.play_billing.zzff) p3).zzb.equals(((com.google.android.gms.internal.play_billing.zzff) p4).zzb);
            }
        } else {
            return 0;
        }
    }

    public final boolean zzk(Object p1)
    {
        return ((com.google.android.gms.internal.play_billing.zzff) p1).zzb.zzi();
    }
}
