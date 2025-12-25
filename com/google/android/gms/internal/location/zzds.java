package com.google.android.gms.internal.location;
final class zzds implements com.google.android.gms.common.api.internal.ListenerHolder$Notifier {
    final synthetic com.google.android.gms.location.LocationResult zza;

    public zzds(com.google.android.gms.internal.location.zzdv p1, com.google.android.gms.location.LocationResult p2)
    {
        this.zza = p2;
        return;
    }

    public final synthetic void notifyListener(Object p2)
    {
        ((com.google.android.gms.location.LocationCallback) p2).onLocationResult(this.zza);
        return;
    }

    public final void onNotifyListenerFailed()
    {
        return;
    }
}
