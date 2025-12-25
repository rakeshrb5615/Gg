package com.google.android.gms.internal.location;
final class zzau extends com.google.android.gms.internal.location.zzba {
    final synthetic com.google.android.gms.location.LocationListener zza;

    public zzau(com.google.android.gms.internal.location.zzbb p1, com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.location.LocationListener p3)
    {
        this.zza = p3;
        super(p2);
        return;
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p4)
    {
        ((com.google.android.gms.internal.location.zzdz) p4).zzv(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this.zza, "LocationListener"), 1, com.google.android.gms.internal.location.zzbb.zza(this));
        return;
    }
}
