package com.google.android.gms.measurement;
final class zza extends com.google.android.gms.measurement.zzc {
    private final com.google.android.gms.measurement.internal.zzic zza;
    private final com.google.android.gms.measurement.internal.zzlj zzb;

    public zza(com.google.android.gms.measurement.internal.zzic p2)
    {
        super(0);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        super.zza = p2;
        super.zzb = p2.zzj();
        return;
    }

    public final void zza(String p2, String p3, android.os.Bundle p4)
    {
        this.zzb.zzB(p2, p3, p4);
        return;
    }

    public final void zzb(String p9, String p10, android.os.Bundle p11, long p12)
    {
        this.zzb.zzC(p9, p10, p11, 1, 0, p12);
        return;
    }

    public final java.util.Map zzc(boolean p4)
    {
        java.util.Iterator v4_1 = this.zzb.zzO(p4);
        r.e v0_2 = new r.e(v4_1.size());
        java.util.Iterator v4_2 = v4_1.iterator();
        while (v4_2.hasNext()) {
            String v1_2 = ((com.google.android.gms.measurement.internal.zzpl) v4_2.next());
            Object v2 = v1_2.zza();
            if (v2 != null) {
                v0_2.put(v1_2.zzb, v2);
            }
        }
        return v0_2;
    }

    public final java.util.Map zzd(String p2, String p3, boolean p4)
    {
        return this.zzb.zzP(p2, p3, p4);
    }

    public final void zze(com.google.android.gms.measurement.internal.zzjp p2)
    {
        this.zzb.zzV(p2);
        return;
    }

    public final void zzf(com.google.android.gms.measurement.internal.zzjq p2)
    {
        this.zzb.zzW(p2);
        return;
    }

    public final void zzg(com.google.android.gms.measurement.internal.zzjq p2)
    {
        this.zzb.zzX(p2);
        return;
    }

    public final String zzh()
    {
        return this.zzb.zzad();
    }

    public final String zzi()
    {
        return this.zzb.zzae();
    }

    public final String zzj()
    {
        return this.zzb.zzQ();
    }

    public final String zzk()
    {
        return this.zzb.zzaf();
    }

    public final long zzl()
    {
        return this.zza.zzk().zzd();
    }

    public final void zzm(String p5)
    {
        com.google.android.gms.common.util.Clock v0_0 = this.zza;
        v0_0.zzw().zza(p5, v0_0.zzaZ().elapsedRealtime());
        return;
    }

    public final void zzn(String p5)
    {
        com.google.android.gms.common.util.Clock v0_0 = this.zza;
        v0_0.zzw().zzb(p5, v0_0.zzaZ().elapsedRealtime());
        return;
    }

    public final void zzo(android.os.Bundle p2)
    {
        this.zzb.zzZ(p2);
        return;
    }

    public final void zzp(String p2, String p3, android.os.Bundle p4)
    {
        this.zza.zzj().zzab(p2, p3, p4);
        return;
    }

    public final java.util.List zzq(String p2, String p3)
    {
        return this.zzb.zzac(p2, p3);
    }

    public final int zzr(String p2)
    {
        this.zzb.zzY(p2);
        return 25;
    }

    public final Boolean zzs()
    {
        return this.zzb.zzi();
    }

    public final Integer zzt()
    {
        return this.zzb.zzl();
    }

    public final String zzu()
    {
        return this.zzb.zzj();
    }

    public final Long zzv()
    {
        return this.zzb.zzk();
    }

    public final Double zzw()
    {
        return this.zzb.zzm();
    }

    public final Object zzx(int p2)
    {
        if (p2 == null) {
            return this.zzb.zzj();
        } else {
            if (p2 == 1) {
                return this.zzb.zzk();
            } else {
                if (p2 == 2) {
                    return this.zzb.zzm();
                } else {
                    if (p2 == 3) {
                        return this.zzb.zzl();
                    } else {
                        return this.zzb.zzi();
                    }
                }
            }
        }
    }
}
