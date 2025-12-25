package com.google.android.gms.measurement.internal;
final class zzny {
    final synthetic com.google.android.gms.measurement.internal.zzoc zza;
    private com.google.android.gms.measurement.internal.zznx zzb;

    public zzny(com.google.android.gms.measurement.internal.zzoc p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void zza()
    {
        com.google.android.gms.measurement.internal.zzlj v0_0 = this.zza;
        v0_0.zzg();
        com.google.android.gms.measurement.internal.zzgs v1_0 = this.zzb;
        if (v1_0 != null) {
            v0_0.zzm().removeCallbacks(v1_0);
        }
        com.google.android.gms.measurement.internal.zzgs v1_3 = v0_0.zzu;
        v1_3.zzd().zzn.zzb(0);
        v0_0.zzh(0);
        if (v1_3.zzc().zzp(0, com.google.android.gms.measurement.internal.zzfy.zzaT)) {
            com.google.android.gms.measurement.internal.zzlj v0_1 = v0_0.zzu;
            if (v0_1.zzj().zzx()) {
                v1_3.zzaV().zzk().zza("Retrying trigger URI registration in foreground");
                v0_1.zzj().zzz();
            }
        }
        return;
    }

    public final void zzb(long p8)
    {
        com.google.android.gms.measurement.internal.zzoc v6 = this.zza;
        this.zzb = new com.google.android.gms.measurement.internal.zznx(this, v6.zzu.zzaZ().currentTimeMillis(), p8);
        v6.zzm().postDelayed(this.zzb, 2000);
        return;
    }
}
