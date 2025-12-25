package com.google.android.gms.measurement.internal;
final class zzkm implements java.lang.Runnable {
    final synthetic com.google.android.gms.internal.measurement.zzcu zza;
    final synthetic com.google.android.gms.measurement.internal.zzlj zzb;

    public zzkm(com.google.android.gms.measurement.internal.zzlj p1, com.google.android.gms.internal.measurement.zzcu p2)
    {
        this.zza = p2;
        java.util.Objects.requireNonNull(p1);
        this.zzb = p1;
        return;
    }

    public final void run()
    {
        com.google.android.gms.measurement.internal.zzgs v1_5;
        android.os.RemoteException v0_0 = this.zzb;
        com.google.android.gms.measurement.internal.zzgs v1_7 = v0_0.zzu.zzh().zzu;
        if (v1_7.zzd().zzl().zzo(com.google.android.gms.measurement.internal.zzjk.zzb)) {
            if ((!v1_7.zzd().zzp(v1_7.zzaZ().currentTimeMillis())) && (v1_7.zzd().zzl.zza() != 0)) {
                v1_5 = Long.valueOf(v1_7.zzd().zzl.zza());
            } else {
                v1_5 = 0;
            }
        } else {
            v1_7.zzaV().zzh().zza("Analytics storage consent denied; will not get session id");
        }
        if (v1_5 == null) {
            try {
                this.zza.zzb(0);
                return;
            } catch (android.os.RemoteException v0_2) {
                this.zzb.zzu.zzaV().zzb().zzb("getSessionId failed with exception", v0_2);
                return;
            }
        } else {
            v0_0.zzu.zzk().zzam(this.zza, v1_5.longValue());
            return;
        }
    }
}
