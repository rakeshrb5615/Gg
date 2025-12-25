package com.google.android.gms.measurement.internal;
final class zzmp implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzbg zza;
    final synthetic String zzb;
    final synthetic com.google.android.gms.internal.measurement.zzcu zzc;
    final synthetic com.google.android.gms.measurement.internal.zznl zzd;

    public zzmp(com.google.android.gms.measurement.internal.zznl p1, com.google.android.gms.measurement.internal.zzbg p2, String p3, com.google.android.gms.internal.measurement.zzcu p4)
    {
        this.zza = p2;
        this.zzb = p3;
        this.zzc = p4;
        java.util.Objects.requireNonNull(p1);
        this.zzd = p1;
        return;
    }

    public final void run()
    {
        byte[] v0 = 0;
        try {
            com.google.android.gms.internal.measurement.zzcu v2_7;
            com.google.android.gms.measurement.internal.zzpp v1_5;
            com.google.android.gms.measurement.internal.zzpp v1_0 = this.zzd;
            com.google.android.gms.internal.measurement.zzcu v2_8 = v1_0.zzZ();
        } catch (com.google.android.gms.measurement.internal.zzpp v1_1) {
            this.zzd.zzu.zzaV().zzb().zzb("Failed to send event to the service to bundle", v1_1);
            v2_7 = this.zzc;
            v1_5 = this.zzd.zzu.zzk();
            v1_5.zzao(v2_7, v0);
            return;
        } catch (com.google.android.gms.measurement.internal.zzpp v1_2) {
            this.zzd.zzu.zzk().zzao(this.zzc, v0);
            throw v1_2;
        }
        if (v2_8 != null) {
            v0 = v2_8.zzk(this.zza, this.zzb);
            v1_0.zzV();
        } else {
            com.google.android.gms.measurement.internal.zzpp v1_6 = v1_0.zzu;
            v1_6.zzaV().zzb().zza("Discarding data. Failed to send event to service to bundle");
            v1_5 = v1_6.zzk();
            v2_7 = this.zzc;
            v1_5.zzao(v2_7, v0);
            return;
        }
    }
}
