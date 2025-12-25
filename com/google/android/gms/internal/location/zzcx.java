package com.google.android.gms.internal.location;
final class zzcx extends com.google.android.gms.internal.location.zzcy {
    final synthetic com.google.android.gms.location.LocationSettingsRequest zza;

    public zzcx(com.google.android.gms.internal.location.zzcz p1, com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.location.LocationSettingsRequest p3, String p4)
    {
        this.zza = p3;
        super(p2);
        return;
    }

    public final synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p4)
    {
        com.google.android.gms.internal.location.zzdf v1_2;
        com.google.android.gms.location.LocationSettingsRequest v0 = this.zza;
        if (v0 == null) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1_2, "locationSettingsRequest can\'t be null");
        ((com.google.android.gms.internal.location.zzv) ((com.google.android.gms.internal.location.zzdz) p4).getService()).zzD(v0, new com.google.android.gms.internal.location.zzdf(this), 0);
        return;
    }
}
