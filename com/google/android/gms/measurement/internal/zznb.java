package com.google.android.gms.measurement.internal;
final class zznb implements java.lang.Runnable {
    final synthetic com.google.android.gms.measurement.internal.zznf zza;

    public zznb(com.google.android.gms.measurement.internal.zznf p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zznl v0_1 = this.zza.zza;
        String v2_0 = v0_1.zzu;
        android.content.Context v3 = v2_0.zzaY();
        v2_0.zzaU();
        v0_1.zzW(new android.content.ComponentName(v3, "com.google.android.gms.measurement.AppMeasurementService"));
        return;
    }
}
