package com.google.android.gms.internal.measurement;
public final class zzg {
    public final com.google.android.gms.internal.measurement.zzg zza;
    final com.google.android.gms.internal.measurement.zzaw zzb;
    final java.util.Map zzc;
    final java.util.Map zzd;

    public zzg(com.google.android.gms.internal.measurement.zzg p2, com.google.android.gms.internal.measurement.zzaw p3)
    {
        this.zzc = new java.util.HashMap();
        this.zzd = new java.util.HashMap();
        this.zza = p2;
        this.zzb = p3;
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzao p2)
    {
        return this.zzb.zzb(this, p2);
    }

    public final com.google.android.gms.internal.measurement.zzao zzb(com.google.android.gms.internal.measurement.zzae p4)
    {
        com.google.android.gms.internal.measurement.zzao v0_0 = com.google.android.gms.internal.measurement.zzao.zzf;
        java.util.Iterator v1 = p4.zzg();
        while (v1.hasNext()) {
            v0_0 = this.zzb.zzb(this, p4.zzl(((Integer) v1.next()).intValue()));
            if ((v0_0 instanceof com.google.android.gms.internal.measurement.zzag)) {
                break;
            }
        }
        return v0_0;
    }

    public final com.google.android.gms.internal.measurement.zzg zzc()
    {
        return new com.google.android.gms.internal.measurement.zzg(this, this.zzb);
    }

    public final boolean zzd(String p2)
    {
        if (!this.zzc.containsKey(p2)) {
            com.google.android.gms.internal.measurement.zzg v0_2 = this.zza;
            if (v0_2 == null) {
                return 0;
            } else {
                return v0_2.zzd(p2);
            }
        } else {
            return 1;
        }
    }

    public final void zze(String p4, com.google.android.gms.internal.measurement.zzao p5)
    {
        java.util.Map v0 = this.zzc;
        if (!v0.containsKey(p4)) {
            boolean v1_3 = this.zza;
            if ((v1_3) && (v1_3.zzd(p4))) {
                v1_3.zze(p4, p5);
                return;
            }
        }
        if (!this.zzd.containsKey(p4)) {
            if (p5 != null) {
                v0.put(p4, p5);
                return;
            } else {
                v0.remove(p4);
                return;
            }
        } else {
            return;
        }
    }

    public final void zzf(String p2, com.google.android.gms.internal.measurement.zzao p3)
    {
        if (!this.zzd.containsKey(p2)) {
            if (p3 != null) {
                this.zzc.put(p2, p3);
                return;
            } else {
                this.zzc.remove(p2);
                return;
            }
        } else {
            return;
        }
    }

    public final void zzg(String p2, com.google.android.gms.internal.measurement.zzao p3)
    {
        this.zzf(p2, p3);
        this.zzd.put(p2, Boolean.TRUE);
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zzh(String p3)
    {
        IllegalArgumentException v0_0 = this.zzc;
        if (!v0_0.containsKey(p3)) {
            IllegalArgumentException v0_2 = this.zza;
            if (v0_2 == null) {
                throw new IllegalArgumentException(g2.g.d(p3, " is not defined"));
            } else {
                return v0_2.zzh(p3);
            }
        } else {
            return ((com.google.android.gms.internal.measurement.zzao) v0_0.get(p3));
        }
    }
}
