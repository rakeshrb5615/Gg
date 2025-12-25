package com.google.android.gms.common.internal;
final class zzq extends com.google.android.gms.common.internal.GmsClientSupervisor {
    private final java.util.HashMap zzb;
    private final android.content.Context zzc;
    private volatile android.os.Handler zzd;
    private final com.google.android.gms.common.internal.zzp zze;
    private final com.google.android.gms.common.stats.ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;
    private volatile java.util.concurrent.Executor zzi;

    public zzq(android.content.Context p3, android.os.Looper p4, java.util.concurrent.Executor p5)
    {
        this.zzb = new java.util.HashMap();
        com.google.android.gms.common.internal.zzp v0_3 = new com.google.android.gms.common.internal.zzp(this, 0);
        this.zze = v0_3;
        this.zzc = p3.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzg(p4, v0_3);
        this.zzf = com.google.android.gms.common.stats.ConnectionTracker.getInstance();
        this.zzg = 5000;
        this.zzh = 300000;
        this.zzi = p5;
        return;
    }

    public final com.google.android.gms.common.ConnectionResult zza(com.google.android.gms.common.internal.zzn p6, android.content.ServiceConnection p7, String p8, java.util.concurrent.Executor p9)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p7, "ServiceConnection must not be null");
        java.util.HashMap v0_1 = this.zzb;
        com.google.android.gms.common.internal.zzo v2_1 = ((com.google.android.gms.common.internal.zzo) v0_1.get(p6));
        if (p9 == null) {
            p9 = this.zzi;
        }
        com.google.android.gms.common.ConnectionResult v7_4;
        if (v2_1 != null) {
            this.zzd.removeMessages(0, p6);
            if (v2_1.zzf(p7)) {
                int v6_1 = p6.toString();
                StringBuilder v9_2 = new StringBuilder((v6_1.length() + 81));
                v9_2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                v9_2.append(v6_1);
                throw new IllegalStateException(v9_2.toString());
            } else {
                v2_1.zzb(p7, p7, p8);
                int v6_3 = v2_1.zze();
                if (v6_3 == 1) {
                    p7.onServiceConnected(v2_1.zzi(), v2_1.zzh());
                } else {
                    if (v6_3 == 2) {
                        v7_4 = v2_1.zzj(p8, p9);
                        if (!v2_1.zzd()) {
                            if (v7_4 == null) {
                                v7_4 = new com.google.android.gms.common.ConnectionResult(-1);
                            }
                            return v7_4;
                        } else {
                            return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
                        }
                    }
                }
                v7_4 = 0;
            }
        } else {
            v2_1 = new com.google.android.gms.common.internal.zzo(this, p6);
            v2_1.zzb(p7, p7, p8);
            v7_4 = v2_1.zzj(p8, p9);
            v0_1.put(p6, v2_1);
        }
    }

    public final void zzc(com.google.android.gms.common.internal.zzn p5, android.content.ServiceConnection p6, String p7)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6, "ServiceConnection must not be null");
        com.google.android.gms.common.internal.zzo v3_1 = ((com.google.android.gms.common.internal.zzo) this.zzb.get(p5));
        if (v3_1 == null) {
            android.os.Message v5_1 = p5.toString();
            long v1_1 = new StringBuilder((v5_1.length() + 50));
            v1_1.append("Nonexistent connection status for service config: ");
            v1_1.append(v5_1);
            throw new IllegalStateException(v1_1.toString());
        } else {
            if (!v3_1.zzf(p6)) {
                android.os.Message v5_3 = p5.toString();
                StringBuilder v2_2 = new StringBuilder((v5_3.length() + 76));
                v2_2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                v2_2.append(v5_3);
                throw new IllegalStateException(v2_2.toString());
            } else {
                v3_1.zzc(p6, p7);
                if (v3_1.zzg()) {
                    this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, p5), this.zzg);
                }
                return;
            }
        }
    }

    public final void zzd(android.os.Looper p4)
    {
        try {
            this.zzd = new com.google.android.gms.internal.common.zzg(p4, this.zze);
            return;
        } catch (Throwable v4_1) {
            throw v4_1;
        }
    }

    public final void zze(java.util.concurrent.Executor p2)
    {
        try {
            this.zzi = p2;
            return;
        } catch (Throwable v2_1) {
            throw v2_1;
        }
    }

    public final synthetic java.util.HashMap zzf()
    {
        return this.zzb;
    }

    public final synthetic android.content.Context zzg()
    {
        return this.zzc;
    }

    public final synthetic android.os.Handler zzh()
    {
        return this.zzd;
    }

    public final synthetic com.google.android.gms.common.stats.ConnectionTracker zzi()
    {
        return this.zzf;
    }

    public final synthetic long zzj()
    {
        return this.zzh;
    }
}
