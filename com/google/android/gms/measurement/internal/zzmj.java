package com.google.android.gms.measurement.internal;
final class zzmj implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic com.google.android.gms.internal.measurement.zzcu zzb;
    final synthetic com.google.android.gms.measurement.internal.zznl zzc;

    public zzmj(com.google.android.gms.measurement.internal.zznl p1, com.google.android.gms.measurement.internal.zzr p2, com.google.android.gms.internal.measurement.zzcu p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzpp v0_0 = "Failed to get app instance id";
        String v1 = 0;
        com.google.android.gms.measurement.internal.zzpp v0_3;
        com.google.android.gms.internal.measurement.zzcu v2_11;
        com.google.android.gms.internal.measurement.zzcu v2_0 = this.zzc;
        com.google.android.gms.measurement.internal.zzhg v3_2 = v2_0.zzu;
        if (v3_2.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
            com.google.android.gms.measurement.internal.zzlj v4_1 = v2_0.zzZ();
            if (v4_1 != null) {
                com.google.android.gms.measurement.internal.zzr v5_0 = this.zza;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v5_0);
                v1 = v4_1.zzm(v5_0);
                if (v1 != null) {
                    v2_0.zzu.zzj().zzR(v1);
                    v3_2.zzd().zze.zzb(v1);
                }
                v2_0.zzV();
                v2_11 = this.zzb;
                v0_3 = this.zzc.zzu.zzk();
                v0_3.zzal(v2_11, v1);
                return;
            } else {
                v3_2.zzaV().zzb().zza("Failed to get app instance id");
            }
        } else {
            v3_2.zzaV().zzh().zza("Analytics storage consent denied; will not get app instance id");
            v2_0.zzu.zzj().zzR(0);
            v3_2.zzd().zze.zzb(0);
        }
        v0_3 = v3_2.zzk();
        v2_11 = this.zzb;
        v0_3.zzal(v2_11, v1);
        return;
    }
}
