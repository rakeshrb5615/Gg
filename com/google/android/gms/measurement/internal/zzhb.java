package com.google.android.gms.measurement.internal;
final class zzhb extends android.content.BroadcastReceiver {
    private final com.google.android.gms.measurement.internal.zzpg zza;
    private boolean zzb;
    private boolean zzc;

    public zzhb(com.google.android.gms.measurement.internal.zzpg p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zza = p1;
        return;
    }

    public final void onReceive(android.content.Context p3, android.content.Intent p4)
    {
        com.google.android.gms.measurement.internal.zzhz v3_0 = this.zza;
        v3_0.zzu();
        boolean v4_3 = p4.getAction();
        v3_0.zzaV().zzk().zzb("NetworkBroadcastReceiver received action", v4_3);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(v4_3)) {
            v3_0.zzaV().zze().zzb("NetworkBroadcastReceiver received unknown action", v4_3);
            return;
        } else {
            boolean v4_2 = v3_0.zzi().zzb();
            if (this.zzc != v4_2) {
                this.zzc = v4_2;
                v3_0.zzaW().zzj(new com.google.android.gms.measurement.internal.zzha(this, v4_2));
            }
            return;
        }
    }

    public final void zza()
    {
        int v0_0 = this.zza;
        v0_0.zzu();
        v0_0.zzaW().zzg();
        if (!this.zzb) {
            v0_0.zzaY().registerReceiver(this, new android.content.IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.zzc = v0_0.zzi().zzb();
            v0_0.zzaV().zzk().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzc));
            this.zzb = 1;
            return;
        } else {
            return;
        }
    }

    public final void zzb()
    {
        IllegalArgumentException v0_0 = this.zza;
        v0_0.zzu();
        v0_0.zzaW().zzg();
        v0_0.zzaW().zzg();
        if (this.zzb) {
            v0_0.zzaV().zzk().zza("Unregistering connectivity change receiver");
            this.zzb = 0;
            this.zzc = 0;
            try {
                v0_0.zzaY().unregisterReceiver(this);
                return;
            } catch (IllegalArgumentException v0_2) {
                this.zza.zzaV().zzb().zzb("Failed to unregister the network broadcast receiver", v0_2);
                return;
            }
        } else {
            return;
        }
    }

    public final synthetic com.google.android.gms.measurement.internal.zzpg zzc()
    {
        return this.zza;
    }
}
