package com.google.android.gms.measurement.internal;
final class zzmk implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic com.google.android.gms.measurement.internal.zznl zzb;

    public zzmk(com.google.android.gms.measurement.internal.zznl p1, com.google.android.gms.measurement.internal.zzr p2, boolean p3)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        android.os.RemoteException v0_0 = this.zzb;
        com.google.android.gms.measurement.internal.zzgs v1_3 = v0_0.zzZ();
        if (v1_3 != null) {
            String v2_1 = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_1);
            com.google.android.gms.measurement.internal.zzal v3_1 = v0_0.zzu;
            com.google.android.gms.measurement.internal.zzfx v5 = com.google.android.gms.measurement.internal.zzfy.zzbb;
            if (v3_1.zzc().zzp(0, v5)) {
                v0_0.zzm(v1_3, 0, v2_1);
            }
            v1_3.zzg(v2_1);
            v0_0.zzu.zzm().zzo();
            v3_1.zzc().zzp(0, v5);
            v0_0.zzm(v1_3, 0, v2_1);
            v0_0.zzV();
            return;
        } else {
            v1.a.s(v0_0.zzu, "Discarding data. Failed to send app launch");
            return;
        }
    }
}
