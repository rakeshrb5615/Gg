package com.google.android.gms.measurement.internal;
final class zzy {
    final synthetic com.google.android.gms.measurement.internal.zzad zza;
    private String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzii zzd;
    private java.util.BitSet zze;
    private java.util.BitSet zzf;
    private java.util.Map zzg;
    private java.util.Map zzh;

    public zzy(com.google.android.gms.measurement.internal.zzad p1, String p2, com.google.android.gms.internal.measurement.zzii p3, java.util.BitSet p4, java.util.BitSet p5, java.util.Map p6, java.util.Map p7, byte[] p8)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzb = p2;
        this.zze = p4;
        this.zzf = p5;
        this.zzg = p6;
        this.zzh = new r.e(0);
        java.util.Iterator v1_2 = p7.keySet().iterator();
        while (v1_2.hasNext()) {
            Integer v4_3 = ((Integer) v1_2.next());
            java.util.ArrayList v5_2 = new java.util.ArrayList();
            v5_2.add(((Long) p7.get(v4_3)));
            this.zzh.put(v4_3, v5_2);
        }
        this.zzc = 0;
        this.zzd = p3;
        return;
    }

    public zzy(com.google.android.gms.measurement.internal.zzad p1, String p2, byte[] p3)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzb = p2;
        this.zzc = 1;
        this.zze = new java.util.BitSet();
        this.zzf = new java.util.BitSet();
        this.zzg = new r.e(0);
        this.zzh = new r.e(0);
        return;
    }

    public final void zza(com.google.android.gms.measurement.internal.zzab p10)
    {
        boolean v0_0 = p10.zza();
        if (p10.zzd != null) {
            this.zzf.set(v0_0, 1);
        }
        java.util.ArrayList v1_14 = p10.zze;
        if (v1_14 != null) {
            this.zze.set(v0_0, v1_14.booleanValue());
        }
        if (p10.zzf != null) {
            java.util.ArrayList v1_2 = this.zzg;
            long v4_0 = Integer.valueOf(v0_0);
            java.util.ArrayList v1_5 = ((Long) v1_2.get(v4_0));
            String v5_2 = (p10.zzf.longValue() / 1000);
            if ((v1_5 == null) || (v5_2 > v1_5.longValue())) {
                this.zzg.put(v4_0, Long.valueOf(v5_2));
            }
        }
        if (p10.zzg != null) {
            java.util.ArrayList v1_9 = this.zzh;
            boolean v0_1 = Integer.valueOf(v0_0);
            java.util.ArrayList v1_12 = ((java.util.List) v1_9.get(v0_1));
            if (v1_12 == null) {
                v1_12 = new java.util.ArrayList();
                this.zzh.put(v0_1, v1_12);
            }
            if (p10.zzb()) {
                v1_12.clear();
            }
            com.google.android.gms.internal.measurement.zzpu.zza();
            boolean v0_4 = this.zza.zzu;
            com.google.android.gms.measurement.internal.zzfx v6 = com.google.android.gms.measurement.internal.zzfy.zzaF;
            if ((v0_4.zzc().zzp(this.zzb, v6)) && (p10.zzc())) {
                v1_12.clear();
            }
            com.google.android.gms.internal.measurement.zzpu.zza();
            if (!v0_4.zzc().zzp(this.zzb, v6)) {
                v1_12.add(Long.valueOf((p10.zzg.longValue() / 1000)));
            } else {
                Long v10_4 = Long.valueOf((p10.zzg.longValue() / 1000));
                if (!v1_12.contains(v10_4)) {
                    v1_12.add(v10_4);
                    return;
                }
            }
        }
        return;
    }

    public final com.google.android.gms.internal.measurement.zzhg zzb(int p7)
    {
        com.google.android.gms.internal.measurement.zzhf v0 = com.google.android.gms.internal.measurement.zzhg.zzh();
        v0.zza(p7);
        v0.zzd(this.zzc);
        com.google.android.gms.internal.measurement.zzhg v7_2 = this.zzd;
        if (v7_2 != null) {
            v0.zzc(v7_2);
        }
        java.util.ArrayList v1_9;
        com.google.android.gms.internal.measurement.zzhg v7_3 = com.google.android.gms.internal.measurement.zzii.zzi();
        v7_3.zzc(com.google.android.gms.measurement.internal.zzpk.zzp(this.zze));
        v7_3.zza(com.google.android.gms.measurement.internal.zzpk.zzp(this.zzf));
        java.util.ArrayList v1_4 = this.zzg;
        if (v1_4 != null) {
            java.util.ArrayList v2_1 = new java.util.ArrayList(v1_4.size());
            java.util.ArrayList v1_8 = this.zzg.keySet().iterator();
            while (v1_8.hasNext()) {
                com.google.android.gms.internal.measurement.zzik v3_2 = ((Integer) v1_8.next());
                com.google.android.gms.internal.measurement.zzij v4_0 = v3_2.intValue();
                com.google.android.gms.internal.measurement.zzik v3_4 = ((Long) this.zzg.get(v3_2));
                if (v3_4 != null) {
                    java.util.Map v5_1 = com.google.android.gms.internal.measurement.zzhq.zze();
                    v5_1.zza(v4_0);
                    v5_1.zzb(v3_4.longValue());
                    v2_1.add(((com.google.android.gms.internal.measurement.zzhq) v5_1.zzbc()));
                }
            }
            v1_9 = v2_1;
        } else {
            v1_9 = 0;
        }
        if (v1_9 != null) {
            v7_3.zze(v1_9);
        }
        java.util.ArrayList v1_15;
        java.util.ArrayList v1_10 = this.zzh;
        if (v1_10 != null) {
            java.util.ArrayList v2_3 = new java.util.ArrayList(v1_10.size());
            java.util.ArrayList v1_14 = this.zzh.keySet().iterator();
            while (v1_14.hasNext()) {
                com.google.android.gms.internal.measurement.zzik v3_10 = ((Integer) v1_14.next());
                com.google.android.gms.internal.measurement.zzij v4_1 = com.google.android.gms.internal.measurement.zzik.zzf();
                v4_1.zza(v3_10.intValue());
                com.google.android.gms.internal.measurement.zzik v3_12 = ((java.util.List) this.zzh.get(v3_10));
                if (v3_12 != null) {
                    java.util.Collections.sort(v3_12);
                    v4_1.zzb(v3_12);
                }
                v2_3.add(((com.google.android.gms.internal.measurement.zzik) v4_1.zzbc()));
            }
            v1_15 = v2_3;
        } else {
            v1_15 = java.util.Collections.EMPTY_LIST;
        }
        v7_3.zzg(v1_15);
        v0.zzb(v7_3);
        return ((com.google.android.gms.internal.measurement.zzhg) v0.zzbc());
    }

    public final synthetic java.util.BitSet zzc()
    {
        return this.zze;
    }
}
