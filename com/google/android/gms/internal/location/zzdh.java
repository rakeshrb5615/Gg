package com.google.android.gms.internal.location;
final class zzdh extends com.google.android.gms.location.LocationCallback {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zza;
    final synthetic com.google.android.gms.internal.location.zzdz zzb;

    public zzdh(com.google.android.gms.internal.location.zzdz p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zza = p2;
        this.zzb = p1;
        return;
    }

    public final void onLocationResult(com.google.android.gms.location.LocationResult p4)
    {
        this.zza.trySetResult(p4.getLastLocation());
        try {
            this.zzb.zzw(com.google.android.gms.common.api.internal.ListenerHolders.createListenerKey(this, "GetCurrentLocation"), 0, new com.google.android.gms.tasks.TaskCompletionSource());
        } catch (android.os.RemoteException) {
        }
        return;
    }
}
