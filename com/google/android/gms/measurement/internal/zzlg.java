package com.google.android.gms.measurement.internal;
final synthetic class zzlg implements java.lang.Runnable {
    private final synthetic com.google.android.gms.measurement.internal.zzlj zza;
    private final synthetic String zzb;

    public synthetic zzlg(com.google.android.gms.measurement.internal.zzlj p1, String p2)
    {
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final synthetic void run()
    {
        com.google.android.gms.measurement.internal.zzgi v0_1 = this.zza.zzu;
        if (v0_1.zzv().zzq(this.zzb)) {
            v0_1.zzv().zzi();
        }
        return;
    }
}
