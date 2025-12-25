package com.google.android.gms.internal.location;
final synthetic class zzdb implements com.google.android.gms.common.api.internal.RemoteCall {
    private final synthetic com.google.android.gms.location.LocationSettingsRequest zza;

    public synthetic zzdb(com.google.android.gms.location.LocationSettingsRequest p1)
    {
        this.zza = p1;
        return;
    }

    public final synthetic void accept(Object p4, Object p5)
    {
        com.google.android.gms.internal.location.zzde v1_2;
        com.google.android.gms.location.LocationSettingsRequest v0 = this.zza;
        if (v0 == null) {
            v1_2 = 0;
        } else {
            v1_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1_2, "locationSettingsRequest can\'t be null");
        ((com.google.android.gms.internal.location.zzv) ((com.google.android.gms.internal.location.zzdz) p4).getService()).zzD(v0, new com.google.android.gms.internal.location.zzde(((com.google.android.gms.tasks.TaskCompletionSource) p5)), 0);
        return;
    }
}
