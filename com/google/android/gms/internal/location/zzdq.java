package com.google.android.gms.internal.location;
final class zzdq extends com.google.android.gms.location.zzs {
    private com.google.android.gms.common.api.internal.ListenerHolder zza;

    public zzdq(com.google.android.gms.common.api.internal.ListenerHolder p1)
    {
        this.zza = p1;
        return;
    }

    public final declared_synchronized void zzc(com.google.android.gms.common.api.internal.ListenerHolder p2)
    {
        com.google.android.gms.common.api.internal.ListenerHolder v0 = this.zza;
        if (v0 == p2) {
            return;
        } else {
            v0.clear();
            this.zza = p2;
            return;
        }
    }

    public final void zzd(com.google.android.gms.location.DeviceOrientation p3)
    {
        this.zza.notifyListener(new com.google.android.gms.internal.location.zzdp(this, p3));
        return;
    }

    public final declared_synchronized void zze()
    {
        this.zza.clear();
        return;
    }
}
