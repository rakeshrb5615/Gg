package com.google.android.gms.internal.measurement;
public final class zzab {
    private com.google.android.gms.internal.measurement.zzaa zza;
    private com.google.android.gms.internal.measurement.zzaa zzb;
    private final java.util.List zzc;

    public zzab()
    {
        this.zza = new com.google.android.gms.internal.measurement.zzaa("", 0, 0);
        this.zzb = new com.google.android.gms.internal.measurement.zzaa("", 0, 0);
        this.zzc = new java.util.ArrayList();
        return;
    }

    public zzab(com.google.android.gms.internal.measurement.zzaa p1)
    {
        this.zza = p1;
        this.zzb = p1.zzg();
        this.zzc = new java.util.ArrayList();
        return;
    }

    public final bridge synthetic Object clone()
    {
        com.google.android.gms.internal.measurement.zzab v0_1 = new com.google.android.gms.internal.measurement.zzab(this.zza.zzg());
        java.util.Iterator v1_3 = this.zzc.iterator();
        while (v1_3.hasNext()) {
            v0_1.zzc.add(((com.google.android.gms.internal.measurement.zzaa) v1_3.next()).zzg());
        }
        return v0_1;
    }

    public final com.google.android.gms.internal.measurement.zzaa zza()
    {
        return this.zza;
    }

    public final void zzb(com.google.android.gms.internal.measurement.zzaa p1)
    {
        this.zza = p1;
        this.zzb = p1.zzg();
        this.zzc.clear();
        return;
    }

    public final com.google.android.gms.internal.measurement.zzaa zzc()
    {
        return this.zzb;
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzaa p1)
    {
        this.zzb = p1;
        return;
    }

    public final void zze(String p6, long p7, java.util.Map p9)
    {
        java.util.HashMap v0_1 = new java.util.HashMap();
        com.google.android.gms.internal.measurement.zzaa v1_3 = p9.keySet().iterator();
        while (v1_3.hasNext()) {
            String v2_1 = ((String) v1_3.next());
            v0_1.put(v2_1, com.google.android.gms.internal.measurement.zzaa.zzh(v2_1, this.zza.zze(v2_1), p9.get(v2_1)));
        }
        this.zzc.add(new com.google.android.gms.internal.measurement.zzaa(p6, p7, v0_1));
        return;
    }

    public final java.util.List zzf()
    {
        return this.zzc;
    }
}
