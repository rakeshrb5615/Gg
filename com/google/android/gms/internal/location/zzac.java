package com.google.android.gms.internal.location;
final class zzac extends com.google.android.gms.internal.location.zzae {
    final synthetic long zza;
    final synthetic android.app.PendingIntent zzb;

    public zzac(com.google.android.gms.internal.location.zzaf p1, com.google.android.gms.common.api.GoogleApiClient p2, long p3, android.app.PendingIntent p5)
    {
        this.zza = p3;
        this.zzb = p5;
        super(p2);
        return;
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p7)
    {
        int v3_2;
        android.app.PendingIntent v0 = this.zzb;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(v0);
        long v1 = this.zza;
        if (v1 < 0) {
            v3_2 = 0;
        } else {
            v3_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v3_2, "detectionIntervalMillis must be >= 0");
        ((com.google.android.gms.internal.location.zzv) ((com.google.android.gms.internal.location.zzg) p7).getService()).zzh(v1, 1, v0);
        this.setResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
        return;
    }
}
