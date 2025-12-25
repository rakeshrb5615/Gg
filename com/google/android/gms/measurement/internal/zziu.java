package com.google.android.gms.measurement.internal;
final class zziu implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzpl zza;
    final synthetic com.google.android.gms.measurement.internal.zzr zzb;
    final synthetic com.google.android.gms.measurement.internal.zzjd zzc;

    public zziu(com.google.android.gms.measurement.internal.zzjd p1, com.google.android.gms.measurement.internal.zzpl p2, com.google.android.gms.measurement.internal.zzr p3)
    {
        this.zza = p2;
        this.zzb = p3;
        java.util.Objects.requireNonNull(p1);
        this.zzc = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzpg v0_0 = this.zzc;
        v0_0.zzL().zzZ();
        String v1_2 = this.zza;
        if (v1_2.zza() != null) {
            v0_0.zzL().zzac(v1_2, this.zzb);
            return;
        } else {
            v0_0.zzL().zzad(v1_2.zzb, this.zzb);
            return;
        }
    }
}
