package com.google.android.gms.internal.location;
final class zzde extends com.google.android.gms.internal.location.zzaa {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzde(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.zza = p1;
        return;
    }

    public final void zzb(com.google.android.gms.location.LocationSettingsResult p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p3.getStatus(), new com.google.android.gms.location.LocationSettingsResponse(p3), this.zza);
        return;
    }
}
