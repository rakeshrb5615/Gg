package com.google.android.gms.internal.location;
final class zzdg extends com.google.android.gms.internal.location.zzs {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;

    public zzdg(com.google.android.gms.tasks.TaskCompletionSource p1)
    {
        this.zza = p1;
        return;
    }

    public final void zzb(int p1, String[] p2)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(new com.google.android.gms.common.api.Status(com.google.android.gms.location.GeofenceStatusCodes.zza(p1)), this.zza);
        return;
    }

    public final void zzc(int p1, String[] p2)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(new com.google.android.gms.common.api.Status(com.google.android.gms.location.GeofenceStatusCodes.zza(p1)), this.zza);
        return;
    }

    public final void zzd(int p1, android.app.PendingIntent p2)
    {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(new com.google.android.gms.common.api.Status(com.google.android.gms.location.GeofenceStatusCodes.zza(p1)), this.zza);
        return;
    }
}
