package com.google.android.gms.internal.location;
final class zzaz implements com.google.android.gms.internal.location.zzdr {
    private com.google.android.gms.common.api.internal.ListenerHolder zza;

    public zzaz(com.google.android.gms.common.api.internal.ListenerHolder p1)
    {
        this.zza = p1;
        return;
    }

    public final declared_synchronized com.google.android.gms.common.api.internal.ListenerHolder zza()
    {
        return this.zza;
    }

    public final declared_synchronized void zzb(com.google.android.gms.common.api.internal.ListenerHolder p2)
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

    public final void zzc()
    {
        return;
    }
}
