package com.google.android.gms.internal.location;
final class zzax extends com.google.android.gms.internal.location.zzba {
    final synthetic boolean zza;

    public zzax(com.google.android.gms.internal.location.zzbb p1, com.google.android.gms.common.api.GoogleApiClient p2, boolean p3)
    {
        this.zza = p3;
        super(p2);
        return;
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p2)
    {
        if (!this.zza) {
            ((com.google.android.gms.internal.location.zzdz) p2).zzz(com.google.android.gms.internal.location.zzbb.zza(this));
            return;
        } else {
            ((com.google.android.gms.internal.location.zzdz) p2).zzy(com.google.android.gms.internal.location.zzbb.zza(this));
            return;
        }
    }
}
