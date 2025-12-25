package com.google.android.gms.measurement.internal;
final class zzob {
    final synthetic com.google.android.gms.measurement.internal.zzoc zza;

    public zzob(com.google.android.gms.measurement.internal.zzoc p1)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        return;
    }

    public final void zza()
    {
        long v0_0 = this.zza;
        v0_0.zzg();
        long v0_1 = v0_0.zzu;
        if (v0_1.zzd().zzp(v0_1.zzaZ().currentTimeMillis())) {
            v0_1.zzd().zzg.zzb(1);
            com.google.android.gms.measurement.internal.zzgs v1_4 = new android.app.ActivityManager$RunningAppProcessInfo();
            android.app.ActivityManager.getMyMemoryState(v1_4);
            if (v1_4.importance == 100) {
                v0_1.zzaV().zzk().zza("Detected application was in foreground");
                this.zzc(v0_1.zzaZ().currentTimeMillis(), 0);
            }
        }
        return;
    }

    public final void zzb(long p5, boolean p7)
    {
        boolean v0_0 = this.zza;
        v0_0.zzg();
        v0_0.zzj();
        com.google.android.gms.measurement.internal.zzic v1 = v0_0.zzu;
        if (v1.zzd().zzp(p5)) {
            v1.zzd().zzg.zzb(1);
            v0_0.zzu.zzv().zzi();
        }
        v1.zzd().zzk.zzb(p5);
        if (v1.zzd().zzg.zza()) {
            this.zzc(p5, p7);
        }
        return;
    }

    public final void zzc(long p11, boolean p13)
    {
        com.google.android.gms.measurement.internal.zzlj v0_0 = this.zza;
        v0_0.zzg();
        if (v0_0.zzu.zzB()) {
            com.google.android.gms.measurement.internal.zzic v6 = v0_0.zzu;
            v6.zzd().zzk.zzb(p11);
            v6.zzaV().zzk().zzb("Session started, time", Long.valueOf(v6.zzaZ().elapsedRealtime()));
            long v7 = (p11 / 1000);
            com.google.android.gms.measurement.internal.zzic v9 = v0_0.zzu;
            v9.zzj().zzN("auto", "_sid", Long.valueOf(v7), p11);
            v6.zzd().zzl.zzb(v7);
            v6.zzd().zzg.zzb(0);
            android.os.Bundle v5_3 = new android.os.Bundle();
            v5_3.putLong("_sid", v7);
            v9.zzj().zzG("auto", "_s", p11, v5_3);
            com.google.android.gms.measurement.internal.zzlj v0_10 = v6.zzd().zzq.zza();
            if (!android.text.TextUtils.isEmpty(v0_10)) {
                android.os.Bundle v5_5 = new android.os.Bundle();
                v5_5.putString("_ffr", v0_10);
                v9.zzj().zzG("auto", "_ssr", p11, v5_5);
            }
        }
        return;
    }
}
