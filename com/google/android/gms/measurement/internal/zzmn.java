package com.google.android.gms.measurement.internal;
final class zzmn implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzlu zza;
    final synthetic com.google.android.gms.measurement.internal.zznl zzb;

    public zzmn(com.google.android.gms.measurement.internal.zznl p1, com.google.android.gms.measurement.internal.zzlu p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        android.os.RemoteException v0_0 = this.zzb;
        com.google.android.gms.measurement.internal.zzgs v1_0 = v0_0.zzZ();
        if (v1_0 != null) {
            String v2_4 = this.zza;
            if (v2_4 != null) {
                String v4_1 = v2_4;
                String v5_2 = v4_1;
                v1_0.zzl(v4_1.zzc, v5_2.zza, v5_2.zzb, v0_0.zzu.zzaY().getPackageName());
            } else {
                v1_0.zzl(0, 0, 0, v0_0.zzu.zzaY().getPackageName());
            }
            v0_0.zzV();
            return;
        } else {
            v1.a.s(v0_0.zzu, "Failed to send current screen to service");
            return;
        }
    }
}
