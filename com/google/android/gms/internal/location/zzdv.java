package com.google.android.gms.internal.location;
final class zzdv extends com.google.android.gms.location.zzv {
    private final com.google.android.gms.internal.location.zzdr zza;

    public zzdv(com.google.android.gms.internal.location.zzdr p1)
    {
        this.zza = p1;
        return;
    }

    public final com.google.android.gms.internal.location.zzdv zzc(com.google.android.gms.common.api.internal.ListenerHolder p2)
    {
        this.zza.zzb(p2);
        return this;
    }

    public final void zzd(com.google.android.gms.location.LocationResult p3)
    {
        this.zza.zza().notifyListener(new com.google.android.gms.internal.location.zzds(this, p3));
        return;
    }

    public final void zze(com.google.android.gms.location.LocationAvailability p3)
    {
        this.zza.zza().notifyListener(new com.google.android.gms.internal.location.zzdt(this, p3));
        return;
    }

    public final void zzf()
    {
        this.zza.zza().notifyListener(new com.google.android.gms.internal.location.zzdu(this));
        return;
    }

    public final void zzg()
    {
        this.zza.zza().clear();
        return;
    }

    public final synthetic com.google.android.gms.internal.location.zzdr zzh()
    {
        return this.zza;
    }
}
