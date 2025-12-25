package com.google.android.gms.internal.location;
final class zzdy extends com.google.android.gms.location.zzy {
    private final com.google.android.gms.internal.location.zzdr zza;

    public zzdy(com.google.android.gms.internal.location.zzdr p1)
    {
        this.zza = p1;
        return;
    }

    public final com.google.android.gms.internal.location.zzdy zzc(com.google.android.gms.common.api.internal.ListenerHolder p2)
    {
        this.zza.zzb(p2);
        return this;
    }

    public final void zzd(android.location.Location p3)
    {
        this.zza.zza().notifyListener(new com.google.android.gms.internal.location.zzdw(this, p3));
        return;
    }

    public final void zze()
    {
        this.zza.zza().notifyListener(new com.google.android.gms.internal.location.zzdx(this));
        return;
    }

    public final void zzf()
    {
        this.zza.zza().clear();
        return;
    }

    public final synthetic com.google.android.gms.internal.location.zzdr zzg()
    {
        return this.zza;
    }
}
