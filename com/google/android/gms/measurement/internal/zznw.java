package com.google.android.gms.measurement.internal;
final synthetic class zznw implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zznx zza;

    public synthetic zznw(com.google.android.gms.measurement.internal.zznx p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void run()
    {
        com.google.android.gms.measurement.internal.zzlq v0_0 = this.zza;
        com.google.android.gms.measurement.internal.zzgs v1_1 = v0_0.zzc.zza;
        v1_1.zzg();
        String v2_0 = v1_1.zzu;
        v2_0.zzaV().zzj().zza("Application going to the background");
        v2_0.zzd().zzn.zzb(1);
        v1_1.zzh(1);
        if (!v2_0.zzc().zzv()) {
            long v3_4 = v0_0.zzb;
            Long v5_0 = v1_1.zzb;
            v5_0.zzd(0, 0, v3_4);
            v5_0.zzb(v3_4);
        }
        v2_0.zzaV().zzi().zzb("Application backgrounded at: timestamp_millis", Long.valueOf(v0_0.zza));
        com.google.android.gms.measurement.internal.zzlq v0_3 = v1_1.zzu;
        com.google.android.gms.measurement.internal.zzgs v1_2 = v0_3.zzj();
        v1_2.zzg();
        long v3_7 = v1_2.zzu;
        v1_2.zzb();
        com.google.android.gms.measurement.internal.zzgs v1_3 = v3_7.zzt();
        v1_3.zzg();
        v1_3.zzb();
        if ((!v1_3.zzK()) || (v1_3.zzu.zzk().zzah() >= 242600)) {
            v3_7.zzt().zzF();
        }
        if (v2_0.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaN)) {
            long v3_15;
            if (!v2_0.zzk().zzaa(v2_0.zzaY().getPackageName(), v2_0.zzc().zzz())) {
                v3_15 = v2_0.zzc().zzl(v2_0.zzaY().getPackageName(), com.google.android.gms.measurement.internal.zzfy.zzD);
            } else {
                v3_15 = 1000;
            }
            v2_0.zzaV().zzk().zzb("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(v3_15));
            v0_3.zzx().zzh(v3_15);
        }
        return;
    }
}
