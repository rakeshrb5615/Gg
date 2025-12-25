package com.google.android.gms.measurement;
public final class AppMeasurementReceiver extends m1.a implements com.google.android.gms.measurement.internal.zzhl$zza {
    private com.google.android.gms.measurement.internal.zzhl zza;

    public AppMeasurementReceiver()
    {
        return;
    }

    public android.content.BroadcastReceiver$PendingResult doGoAsync()
    {
        return this.goAsync();
    }

    public void doStartService(android.content.Context p1, android.content.Intent p2)
    {
        m1.a.startWakefulService(p1, p2);
        return;
    }

    public void onReceive(android.content.Context p2, android.content.Intent p3)
    {
        if (this.zza == null) {
            this.zza = new com.google.android.gms.measurement.internal.zzhl(this);
        }
        this.zza.zza(p2, p3);
        return;
    }
}
