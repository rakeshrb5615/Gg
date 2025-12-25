package com.google.android.gms.internal.location;
final class zzdl extends com.google.android.gms.internal.location.zzw {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzdl(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.zza = p1;
        return;
    }

    public final void zzb(com.google.android.gms.common.api.Status p2, com.google.android.gms.location.LocationAvailability p3)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(p2, p3, this.zza);
        return;
    }
}
