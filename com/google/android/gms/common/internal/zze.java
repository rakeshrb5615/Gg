package com.google.android.gms.common.internal;
public final class zze implements android.content.ServiceConnection {
    final synthetic com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zze(com.google.android.gms.common.internal.BaseGmsClient p1, int p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void onServiceConnected(android.content.ComponentName p4, android.os.IBinder p5)
    {
        com.google.android.gms.common.internal.BaseGmsClient v4_0 = this.zza;
        if (p5 != 0) {
            v4_0.zzh();
            int v1_1;
            int v1_4 = p5.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if ((v1_4 == 0) || (!(v1_4 instanceof com.google.android.gms.common.internal.IGmsServiceBroker))) {
                v1_1 = new com.google.android.gms.common.internal.zzaa(p5);
            } else {
                v1_1 = ((com.google.android.gms.common.internal.IGmsServiceBroker) v1_4);
            }
            v4_0.zzi(v1_1);
            this.zza.zzb(0, 0, this.zzb);
            return;
        } else {
            v4_0.zzf(16);
            return;
        }
    }

    public final void onServiceDisconnected(android.content.ComponentName p4)
    {
        Throwable v4_0 = this.zza;
        v4_0.zzh();
        v4_0.zzi(0);
        Throwable v4_3 = this.zza.zzb;
        v4_3.sendMessage(v4_3.obtainMessage(6, this.zzb, 1));
        return;
    }
}
