package com.google.android.gms.internal.location;
final class zzbh implements com.google.android.gms.common.api.internal.RemoteCall, com.google.android.gms.internal.location.zzdr {
    final synthetic com.google.android.gms.internal.location.zzbi zza;
    private final com.google.android.gms.internal.location.zzbg zzb;
    private com.google.android.gms.common.api.internal.ListenerHolder zzc;
    private boolean zzd;

    public zzbh(com.google.android.gms.internal.location.zzbi p1, com.google.android.gms.common.api.internal.ListenerHolder p2, com.google.android.gms.internal.location.zzbg p3)
    {
        this.zza = p1;
        this.zzd = 1;
        this.zzc = p2;
        this.zzb = p3;
        return;
    }

    public final bridge synthetic void accept(Object p4, Object p5)
    {
        com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey v0_1 = this.zzc.getListenerKey();
        boolean v1 = this.zzd;
        this.zzc.clear();
        if (v0_1 != null) {
            this.zzb.zza(((com.google.android.gms.internal.location.zzdz) p4), v0_1, v1, ((com.google.android.gms.tasks.TaskCompletionSource) p5));
            return;
        } else {
            ((com.google.android.gms.tasks.TaskCompletionSource) p5).setResult(Boolean.FALSE);
            return;
        }
    }

    public final declared_synchronized com.google.android.gms.common.api.internal.ListenerHolder zza()
    {
        return this.zzc;
    }

    public final declared_synchronized void zzb(com.google.android.gms.common.api.internal.ListenerHolder p2)
    {
        com.google.android.gms.common.api.internal.ListenerHolder v0 = this.zzc;
        if (v0 == p2) {
            return;
        } else {
            v0.clear();
            this.zzc = p2;
            return;
        }
    }

    public final void zzc()
    {
        this.zzd = 0;
        Throwable v0_2 = this.zzc.getListenerKey();
        if (v0_2 != null) {
            this.zza.doUnregisterEventListener(v0_2, 2441);
        }
        return;
    }
}
