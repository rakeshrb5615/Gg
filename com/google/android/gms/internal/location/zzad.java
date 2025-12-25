package com.google.android.gms.internal.location;
final class zzad extends com.google.android.gms.internal.location.zzae {
    final synthetic android.app.PendingIntent zza;

    public zzad(com.google.android.gms.internal.location.zzaf p1, com.google.android.gms.common.api.GoogleApiClient p2, android.app.PendingIntent p3)
    {
        this.zza = p3;
        super(p2);
        return;
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p2)
    {
        ((com.google.android.gms.internal.location.zzg) p2).zzp(this.zza);
        this.setResult(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
        return;
    }
}
