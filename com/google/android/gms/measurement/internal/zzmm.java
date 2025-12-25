package com.google.android.gms.measurement.internal;
final class zzmm extends com.google.android.gms.measurement.internal.zzay {
    final synthetic com.google.android.gms.measurement.internal.zznl zza;

    public zzmm(com.google.android.gms.measurement.internal.zznl p1, com.google.android.gms.measurement.internal.zzjg p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        super(p2);
        return;
    }

    public final void zza()
    {
        com.google.android.gms.measurement.internal.zznl v0 = this.zza;
        v0.zzg();
        if (v0.zzh()) {
            v0.zzu.zzaV().zzk().zza("Inactivity, disconnecting from the service");
            v0.zzM();
            return;
        } else {
            return;
        }
    }
}
