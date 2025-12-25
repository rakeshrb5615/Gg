package com.google.android.gms.measurement.internal;
final class zzmo implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic boolean zzb;
    final synthetic com.google.android.gms.measurement.internal.zzbe zzc;
    final synthetic android.os.Bundle zzd;
    final synthetic com.google.android.gms.measurement.internal.zznl zze;

    public zzmo(com.google.android.gms.measurement.internal.zznl p1, boolean p2, com.google.android.gms.measurement.internal.zzr p3, boolean p4, com.google.android.gms.measurement.internal.zzbe p5, android.os.Bundle p6)
    {
        this.zza = p3;
        this.zzb = p4;
        this.zzc = p5;
        this.zzd = p6;
        java.util.Objects.requireNonNull(p1);
        this.zze = p1;
        return;
    }

    public final void run()
    {
        android.os.RemoteException v0_0 = this.zze;
        com.google.android.gms.measurement.internal.zzgs v1_0 = v0_0.zzZ();
        if (v1_0 != null) {
            com.google.android.gms.measurement.internal.zzbe v5 = 0;
            if (!v0_0.zzu.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzbb)) {
                try {
                    com.google.android.gms.measurement.internal.zzr v3_1 = this.zza;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(v3_1);
                    v1_0.zzu(this.zzd, v3_1);
                    v0_0.zzV();
                    return;
                } catch (android.os.RemoteException v0_1) {
                    this.zze.zzu.zzaV().zzb().zzb("Failed to send default event parameters to service", v0_1);
                    return;
                }
            } else {
                android.os.RemoteException v0_2 = this.zza;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v0_2);
                if (!this.zzb) {
                    v5 = this.zzc;
                }
                this.zze.zzm(v1_0, v5, v0_2);
                return;
            }
        } else {
            v1.a.s(v0_0.zzu, "Failed to send default event parameters to service");
            return;
        }
    }
}
