package com.google.android.gms.common.internal;
final class zzo implements android.content.ServiceConnection, com.google.android.gms.common.internal.zzr {
    final synthetic com.google.android.gms.common.internal.zzq zza;
    private final java.util.Map zzb;
    private int zzc;
    private boolean zzd;
    private android.os.IBinder zze;
    private final com.google.android.gms.common.internal.zzn zzf;
    private android.content.ComponentName zzg;

    public zzo(com.google.android.gms.common.internal.zzq p1, com.google.android.gms.common.internal.zzn p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzf = p2;
        this.zzb = new java.util.HashMap();
        this.zzc = 2;
        return;
    }

    public final void onBindingDied(android.content.ComponentName p1)
    {
        this.onServiceDisconnected(p1);
        return;
    }

    public final void onServiceConnected(android.content.ComponentName p5, android.os.IBinder p6)
    {
        java.util.Iterator v0_0 = this.zza;
        v0_0.zzf();
        v0_0.zzh().removeMessages(1, this.zzf);
        this.zze = p6;
        this.zzg = p5;
        java.util.Iterator v0_3 = this.zzb.values().iterator();
        while (v0_3.hasNext()) {
            ((android.content.ServiceConnection) v0_3.next()).onServiceConnected(p5, p6);
        }
        this.zzc = 1;
        return;
    }

    public final void onServiceDisconnected(android.content.ComponentName p5)
    {
        java.util.Iterator v0_0 = this.zza;
        v0_0.zzf();
        v0_0.zzh().removeMessages(1, this.zzf);
        this.zze = 0;
        this.zzg = p5;
        java.util.Iterator v0_3 = this.zzb.values().iterator();
        while (v0_3.hasNext()) {
            ((android.content.ServiceConnection) v0_3.next()).onServiceDisconnected(p5);
        }
        this.zzc = 2;
        return;
    }

    public final void zza(String p4)
    {
        android.content.Context v0_0 = this.zza;
        v0_0.zzh().removeMessages(1, this.zzf);
        v0_0.zzi().unbindService(v0_0.zzg(), this);
        this.zzd = 0;
        this.zzc = 2;
        return;
    }

    public final void zzb(android.content.ServiceConnection p1, android.content.ServiceConnection p2, String p3)
    {
        this.zzb.put(p1, p2);
        return;
    }

    public final void zzc(android.content.ServiceConnection p1, String p2)
    {
        this.zzb.remove(p1);
        return;
    }

    public final boolean zzd()
    {
        return this.zzd;
    }

    public final int zze()
    {
        return this.zzc;
    }

    public final boolean zzf(android.content.ServiceConnection p2)
    {
        return this.zzb.containsKey(p2);
    }

    public final boolean zzg()
    {
        return this.zzb.isEmpty();
    }

    public final android.os.IBinder zzh()
    {
        return this.zze;
    }

    public final android.content.ComponentName zzi()
    {
        return this.zzg;
    }

    public final synthetic com.google.android.gms.common.ConnectionResult zzj(String p11, java.util.concurrent.Executor p12)
    {
        try {
            android.content.Intent v5 = com.google.android.gms.common.internal.zzah.zza(this.zza.zzg(), this.zzf);
            this.zzc = 3;
            android.os.StrictMode$VmPolicy v1_1 = com.google.android.gms.common.util.zzd.zza();
            try {
                Throwable v0_2 = this.zza;
                com.google.android.gms.common.internal.zzn v9 = this.zzf;
                try {
                    com.google.android.gms.common.ConnectionResult v11_3 = v0_2.zzi().zza(v0_2.zzg(), p11, v5, this, 4225, p12);
                    this.zzd = v11_3;
                } catch (Throwable v0_4) {
                    com.google.android.gms.common.ConnectionResult v11_7 = v0_4;
                    android.os.StrictMode.setVmPolicy(v1_1);
                    throw v11_7;
                }
                if (v11_3 == null) {
                    this.zzc = 2;
                    v0_2.zzi().unbindService(v0_2.zzg(), this);
                    com.google.android.gms.common.ConnectionResult v11_2 = new com.google.android.gms.common.ConnectionResult(16);
                    android.os.StrictMode.setVmPolicy(v1_1);
                    return v11_2;
                } else {
                    v0_2.zzh().sendMessageDelayed(v0_2.zzh().obtainMessage(1, v9), v0_2.zzj());
                    android.os.StrictMode.setVmPolicy(v1_1);
                    return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
                }
            } catch (Throwable v0_4) {
            }
        } catch (Throwable v0_1) {
            v11_2 = v0_1.zza;
            return v11_2;
        }
    }
}
