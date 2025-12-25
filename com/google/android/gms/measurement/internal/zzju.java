package com.google.android.gms.measurement.internal;
final class zzju extends com.google.android.gms.measurement.internal.zzay {
    final synthetic com.google.android.gms.measurement.internal.zzlj zza;

    public zzju(com.google.android.gms.measurement.internal.zzlj p1, com.google.android.gms.measurement.internal.zzjg p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        super(p2);
        return;
    }

    public final void zza()
    {
        com.google.android.gms.measurement.internal.zzlj v1_2 = this.zza.zzu.zzj();
        java.util.Objects.requireNonNull(v1_2);
        new Thread(new com.google.android.gms.measurement.internal.zzjt(v1_2)).start();
        return;
    }
}
