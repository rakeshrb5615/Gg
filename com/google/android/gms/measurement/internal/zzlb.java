package com.google.android.gms.measurement.internal;
final synthetic class zzlb implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zzlj zza;
    private final synthetic java.util.List zzb;

    public synthetic zzlb(com.google.android.gms.measurement.internal.zzlj p1, java.util.List p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void run()
    {
        com.google.android.gms.measurement.internal.zzlj v0 = this.zza;
        v0.zzg();
        if (android.os.Build$VERSION.SDK_INT >= 30) {
            java.util.Iterator v1_2 = this.zzb;
            android.util.SparseArray v2_0 = v0.zzu.zzd().zzf();
            java.util.Iterator v1_0 = v1_2.iterator();
            while (v1_0.hasNext()) {
                com.google.android.gms.measurement.internal.zzoh v3_2 = ((com.google.android.gms.measurement.internal.zzoh) v1_0.next());
                java.util.PriorityQueue v4_0 = v3_2.zzc;
                if ((!v2_0.contains(v4_0)) || (((Long) v2_0.get(v4_0)).longValue() < v3_2.zzb)) {
                    v0.zzy().add(v3_2);
                }
            }
            v0.zzz();
            return;
        } else {
            return;
        }
    }
}
