package com.google.android.gms.internal.measurement;
public final class zzaw {
    final java.util.Map zza;
    final com.google.android.gms.internal.measurement.zzbi zzb;

    public zzaw()
    {
        this.zza = new java.util.HashMap();
        this.zzb = new com.google.android.gms.internal.measurement.zzbi();
        this.zza(new com.google.android.gms.internal.measurement.zzau());
        this.zza(new com.google.android.gms.internal.measurement.zzax());
        this.zza(new com.google.android.gms.internal.measurement.zzay());
        this.zza(new com.google.android.gms.internal.measurement.zzbb());
        this.zza(new com.google.android.gms.internal.measurement.zzbg());
        this.zza(new com.google.android.gms.internal.measurement.zzbh());
        this.zza(new com.google.android.gms.internal.measurement.zzbj());
        return;
    }

    public final void zza(com.google.android.gms.internal.measurement.zzav p4)
    {
        java.util.Iterator v0_1 = p4.zza.iterator();
        while (v0_1.hasNext()) {
            this.zza.put(((com.google.android.gms.internal.measurement.zzbk) v0_1.next()).zzb().toString(), p4);
        }
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zzb(com.google.android.gms.internal.measurement.zzg p4, com.google.android.gms.internal.measurement.zzao p5)
    {
        com.google.android.gms.internal.measurement.zzh.zzl(p4);
        if (!(p5 instanceof com.google.android.gms.internal.measurement.zzap)) {
            return p5;
        } else {
            com.google.android.gms.internal.measurement.zzbi v1_0;
            java.util.ArrayList v0_1 = ((com.google.android.gms.internal.measurement.zzap) p5).zzg();
            String v5_2 = ((com.google.android.gms.internal.measurement.zzap) p5).zzb();
            com.google.android.gms.internal.measurement.zzbi v1_2 = this.zza;
            if (!v1_2.containsKey(v5_2)) {
                v1_0 = this.zzb;
            } else {
                v1_0 = ((com.google.android.gms.internal.measurement.zzav) v1_2.get(v5_2));
            }
            return v1_0.zza(v5_2, p4, v0_1);
        }
    }
}
