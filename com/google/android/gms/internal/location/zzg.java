package com.google.android.gms.internal.location;
public final class zzg extends com.google.android.gms.common.internal.GmsClient {

    public zzg(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.common.api.internal.ConnectionCallbacks p11, com.google.android.gms.common.api.internal.OnConnectionFailedListener p12)
    {
        super(p8, p9, 23, p10, p11, p12);
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.internal.location.zzu v0_1 = p3.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (!(v0_1 instanceof com.google.android.gms.internal.location.zzv)) {
                return new com.google.android.gms.internal.location.zzu(p3);
            } else {
                return ((com.google.android.gms.internal.location.zzv) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.common.Feature[] getApiFeatures()
    {
        return com.google.android.gms.location.zzo.zzp;
    }

    public final android.os.Bundle getGetServiceRequestExtraArgs()
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putString("client_name", "activity_recognition");
        return v0_1;
    }

    public final int getMinApkVersion()
    {
        return 11717000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final boolean usesClientTelemetry()
    {
        return 1;
    }

    public final void zzp(android.app.PendingIntent p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        ((com.google.android.gms.internal.location.zzv) this.getService()).zzl(p2);
        return;
    }
}
