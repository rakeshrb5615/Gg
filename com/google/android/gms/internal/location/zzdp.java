package com.google.android.gms.internal.location;
final class zzdp implements com.google.android.gms.common.api.internal.ListenerHolder$Notifier {
    final synthetic com.google.android.gms.location.DeviceOrientation zza;

    public zzdp(com.google.android.gms.internal.location.zzdq p1, com.google.android.gms.location.DeviceOrientation p2)
    {
        this.zza = p2;
        return;
    }

    public final bridge synthetic void notifyListener(Object p2)
    {
        ((com.google.android.gms.location.DeviceOrientationListener) p2).onDeviceOrientationChanged(this.zza);
        return;
    }

    public final void onNotifyListenerFailed()
    {
        return;
    }
}
