package com.google.android.gms.internal.measurement;
public final class zzz {
    final java.util.TreeMap zza;
    final java.util.TreeMap zzb;

    public zzz()
    {
        this.zza = new java.util.TreeMap();
        this.zzb = new java.util.TreeMap();
        return;
    }

    private static final int zzc(com.google.android.gms.internal.measurement.zzg p0, com.google.android.gms.internal.measurement.zzan p1, com.google.android.gms.internal.measurement.zzao p2)
    {
        int v0_3 = p1.zza(p0, java.util.Collections.singletonList(p2));
        if (!(v0_3 instanceof com.google.android.gms.internal.measurement.zzah)) {
            return -1;
        } else {
            return com.google.android.gms.internal.measurement.zzh.zzg(v0_3.zzd().doubleValue());
        }
    }

    public final void zza(String p1, int p2, com.google.android.gms.internal.measurement.zzan p3, String p4)
    {
        IllegalStateException v1_2;
        if (!"create".equals(p4)) {
            if (!"edit".equals(p4)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(p4)));
            } else {
                v1_2 = this.zza;
            }
        } else {
            v1_2 = this.zzb;
        }
        if (v1_2.containsKey(Integer.valueOf(p2))) {
            p2 = (((Integer) v1_2.lastKey()).intValue() + 1);
        }
        v1_2.put(Integer.valueOf(p2), p3);
        return;
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzg p7, com.google.android.gms.internal.measurement.zzab p8)
    {
        com.google.android.gms.internal.measurement.zzl v0_1 = new com.google.android.gms.internal.measurement.zzl(p8);
        java.util.Iterator v1_2 = this.zza;
        com.google.android.gms.internal.measurement.zzan v2_6 = v1_2.keySet().iterator();
        while (v2_6.hasNext()) {
            int v3_1 = ((Integer) v2_6.next());
            com.google.android.gms.internal.measurement.zzaa v4_1 = p8.zzc().zzg();
            int v3_4 = com.google.android.gms.internal.measurement.zzz.zzc(p7, ((com.google.android.gms.internal.measurement.zzan) v1_2.get(v3_1)), v0_1);
            if ((v3_4 == 2) || (v3_4 == -1)) {
                p8.zzd(v4_1);
            }
        }
        java.util.TreeMap v8_1 = this.zzb;
        java.util.Iterator v1_1 = v8_1.keySet().iterator();
        while (v1_1.hasNext()) {
            com.google.android.gms.internal.measurement.zzz.zzc(p7, ((com.google.android.gms.internal.measurement.zzan) v8_1.get(((Integer) v1_1.next()))), v0_1);
        }
        return;
    }
}
