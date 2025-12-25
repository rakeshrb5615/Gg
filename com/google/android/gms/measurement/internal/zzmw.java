package com.google.android.gms.measurement.internal;
final class zzmw implements java.lang.Runnable {
    final synthetic String zza;
    final synthetic String zzb;
    final synthetic com.google.android.gms.measurement.internal.zzr zzc;
    final synthetic com.google.android.gms.internal.measurement.zzcu zzd;
    final synthetic com.google.android.gms.measurement.internal.zznl zze;

    public zzmw(com.google.android.gms.measurement.internal.zznl p1, String p2, String p3, com.google.android.gms.measurement.internal.zzr p4, com.google.android.gms.internal.measurement.zzcu p5)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        this.zzd = p5;
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        return;
    }

    public final void run()
    {
        java.util.ArrayList v0_1 = new java.util.ArrayList();
        try {
            com.google.android.gms.internal.measurement.zzcu v2_8;
            com.google.android.gms.measurement.internal.zzpp v1_5;
            com.google.android.gms.measurement.internal.zzpp v1_1 = this.zze;
            com.google.android.gms.internal.measurement.zzcu v2_9 = v1_1.zzZ();
        } catch (com.google.android.gms.measurement.internal.zzpp v1_0) {
            this.zze.zzu.zzaV().zzb().zzd("Failed to get conditional properties; remote exception", this.zza, this.zzb, v1_0);
            v2_8 = this.zzd;
            v1_5 = this.zze.zzu.zzk();
            v1_5.zzar(v2_8, v0_1);
            return;
        } catch (com.google.android.gms.measurement.internal.zzpp v1_2) {
            this.zze.zzu.zzk().zzar(this.zzd, v0_1);
            throw v1_2;
        }
        if (v2_9 != null) {
            com.google.android.gms.internal.measurement.zzcu v3_3 = this.zzc;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_3);
            v0_1 = com.google.android.gms.measurement.internal.zzpp.zzas(v2_9.zzr(this.zza, this.zzb, v3_3));
            v1_1.zzV();
        } else {
            com.google.android.gms.measurement.internal.zzpp v1_6 = v1_1.zzu;
            v1_6.zzaV().zzb().zzc("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
            v1_5 = v1_6.zzk();
            v2_8 = this.zzd;
            v1_5.zzar(v2_8, v0_1);
            return;
        }
    }
}
