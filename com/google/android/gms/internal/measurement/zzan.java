package com.google.android.gms.internal.measurement;
public final class zzan extends com.google.android.gms.internal.measurement.zzai implements com.google.android.gms.internal.measurement.zzak {
    protected final java.util.List zza;
    protected final java.util.List zzb;
    protected com.google.android.gms.internal.measurement.zzg zzc;

    private zzan(com.google.android.gms.internal.measurement.zzan p3)
    {
        super(p3.zzd);
        java.util.ArrayList v0_4 = new java.util.ArrayList(p3.zza.size());
        super.zza = v0_4;
        v0_4.addAll(p3.zza);
        java.util.ArrayList v0_2 = new java.util.ArrayList(p3.zzb.size());
        super.zzb = v0_2;
        v0_2.addAll(p3.zzb);
        super.zzc = p3.zzc;
        return;
    }

    public zzan(String p1, java.util.List p2, java.util.List p3, com.google.android.gms.internal.measurement.zzg p4)
    {
        super(p1);
        super.zza = new java.util.ArrayList();
        super.zzc = p4;
        if (!p2.isEmpty()) {
            java.util.ArrayList v1_6 = p2.iterator();
            while (v1_6.hasNext()) {
                super.zza.add(((com.google.android.gms.internal.measurement.zzao) v1_6.next()).zzc());
            }
        }
        super.zzb = new java.util.ArrayList(p3);
        return;
    }

    public final com.google.android.gms.internal.measurement.zzao zza(com.google.android.gms.internal.measurement.zzg p5, java.util.List p6)
    {
        com.google.android.gms.internal.measurement.zzg v0_1 = this.zzc.zzc();
        com.google.android.gms.internal.measurement.zzag v1_2 = 0;
        while(true) {
            boolean v2_3 = this.zza;
            if (v1_2 >= v2_3.size()) {
                break;
            }
            if (v1_2 >= p6.size()) {
                v0_1.zzf(((String) v2_3.get(v1_2)), com.google.android.gms.internal.measurement.zzao.zzf);
            } else {
                v0_1.zzf(((String) v2_3.get(v1_2)), p5.zza(((com.google.android.gms.internal.measurement.zzao) p6.get(v1_2))));
            }
            v1_2++;
        }
        com.google.android.gms.internal.measurement.zzao v5_1 = this.zzb.iterator();
        while (v5_1.hasNext()) {
            boolean v6_3 = ((com.google.android.gms.internal.measurement.zzao) v5_1.next());
            com.google.android.gms.internal.measurement.zzag v1_0 = v0_1.zza(v6_3);
            if ((v1_0 instanceof com.google.android.gms.internal.measurement.zzap)) {
                v1_0 = v0_1.zza(v6_3);
            }
            if ((v1_0 instanceof com.google.android.gms.internal.measurement.zzag)) {
                return ((com.google.android.gms.internal.measurement.zzag) v1_0).zzb();
            }
        }
        return com.google.android.gms.internal.measurement.zzao.zzf;
    }

    public final com.google.android.gms.internal.measurement.zzao zzt()
    {
        return new com.google.android.gms.internal.measurement.zzan(this);
    }
}
