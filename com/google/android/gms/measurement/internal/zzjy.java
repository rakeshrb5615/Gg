package com.google.android.gms.measurement.internal;
final class zzjy implements java.lang.Runnable {
    final synthetic boolean zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzjy(com.google.android.gms.measurement.internal.zzlj p1, boolean p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzlj v0 = this.zzb;
        com.google.android.gms.measurement.internal.zzgs v1_0 = v0.zzu;
        Boolean v2_0 = v1_0.zzB();
        Boolean v3_5 = v1_0.zzA();
        String v4_1 = this.zza;
        v1_0.zzz(v4_1);
        if (v3_5 == v4_1) {
            v1_0.zzaV().zzk().zzb("Default data collection state already set to", Boolean.valueOf(v4_1));
        }
        if ((v1_0.zzB() == v2_0) || (v1_0.zzB() != v1_0.zzA())) {
            v1_0.zzaV().zzh().zzc("Default data collection is different than actual status", Boolean.valueOf(v4_1), Boolean.valueOf(v2_0));
        }
        v0.zzal();
        return;
    }
}
