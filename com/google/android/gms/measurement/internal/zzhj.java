package com.google.android.gms.measurement.internal;
public final class zzhj implements android.content.ServiceConnection {
    final synthetic com.google.android.gms.measurement.internal.zzhk zza;
    private final String zzb;

    public zzhj(com.google.android.gms.measurement.internal.zzhk p1, String p2)
    {
        java.util.Objects.requireNonNull(p1);
        this.zza = p1;
        this.zzb = p2;
        return;
    }

    public final void onServiceConnected(android.content.ComponentName p3, android.os.IBinder p4)
    {
        if (p4 == null) {
            v1.a.v(this.zza.zza, "Install Referrer connection returned with null binder");
            return;
        } else {
            com.google.android.gms.measurement.internal.zzgs v3_7 = com.google.android.gms.internal.measurement.zzbp.zzb(p4);
            if (v3_7 != null) {
                com.google.android.gms.measurement.internal.zzgs v4_1 = this.zza.zza;
                v4_1.zzaV().zzk().zza("Install Referrer Service connected");
                v4_1.zzaW().zzj(new com.google.android.gms.measurement.internal.zzhi(this, v3_7, this));
                return;
            } else {
                this.zza.zza.zzaV().zze().zza("Install Referrer Service implementation was not found");
                return;
            }
        }
    }

    public final void onServiceDisconnected(android.content.ComponentName p2)
    {
        this.zza.zza.zzaV().zzk().zza("Install Referrer Service disconnected");
        return;
    }

    public final synthetic String zza()
    {
        return this.zzb;
    }
}
