package com.google.android.gms.internal.location;
final class zzdw implements com.google.android.gms.common.api.internal.ListenerHolder$Notifier {
    final synthetic android.location.Location zza;

    public zzdw(com.google.android.gms.internal.location.zzdy p1, android.location.Location p2)
    {
        this.zza = p2;
        return;
    }

    public final bridge synthetic void notifyListener(Object p2)
    {
        ((com.google.android.gms.location.LocationListener) p2).onLocationChanged(this.zza);
        return;
    }

    public final void onNotifyListenerFailed()
    {
        return;
    }
}
