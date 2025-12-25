package com.google.android.gms.measurement.internal;
final synthetic class zzu implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zzic zza;

    public synthetic zzu(com.google.android.gms.measurement.internal.zzic p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void run()
    {
        com.google.android.gms.measurement.internal.zzlj v0_0 = this.zza;
        if (v0_0.zzk().zzS()) {
            v0_0.zzj().zzv();
            com.google.android.gms.measurement.internal.zzlj v0_1 = v0_0.zzj();
            java.util.Objects.requireNonNull(v0_1);
            new Thread(new com.google.android.gms.measurement.internal.zzv(v0_1)).start();
            return;
        } else {
            v1.a.v(v0_0, "registerTrigger called but app not eligible");
            return;
        }
    }
}
