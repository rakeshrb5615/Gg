package com.google.android.gms.measurement.internal;
final class zzml implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zzr zza;
    final synthetic com.google.android.gms.measurement.internal.zznl zzb;

    public zzml(com.google.android.gms.measurement.internal.zznl p1, com.google.android.gms.measurement.internal.zzr p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        android.os.RemoteException v0_0 = this.zzb;
        com.google.android.gms.measurement.internal.zzgs v1_4 = v0_0.zzZ();
        if (v1_4 != null) {
            try {
                String v2_1 = this.zza;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(v2_1);
                v1_4.zzA(v2_1);
                v0_0.zzV();
                return;
            } catch (android.os.RemoteException v0_2) {
                this.zzb.zzu.zzaV().zzb().zzb("Failed to send app backgrounded to the service", v0_2);
                return;
            }
        } else {
            v1.a.v(v0_0.zzu, "Failed to send app backgrounded");
            return;
        }
    }
}
