package com.google.android.gms.common.internal.service;
public final class zap extends com.google.android.gms.common.internal.GmsClient {
    private final com.google.android.gms.common.internal.TelemetryLoggingOptions zaa;

    public zap(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.common.internal.TelemetryLoggingOptions p11, com.google.android.gms.common.api.internal.ConnectionCallbacks p12, com.google.android.gms.common.api.internal.OnConnectionFailedListener p13)
    {
        super(p8, p9, 270, p10, p12, p13).zaa = p11;
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.common.internal.service.zai v0_1 = p3.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
            if (!(v0_1 instanceof com.google.android.gms.common.internal.service.zai)) {
                return new com.google.android.gms.common.internal.service.zai(p3);
            } else {
                return ((com.google.android.gms.common.internal.service.zai) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.common.Feature[] getApiFeatures()
    {
        return com.google.android.gms.internal.base.zaf.zab;
    }

    public final android.os.Bundle getGetServiceRequestExtraArgs()
    {
        return this.zaa.zaa();
    }

    public final int getMinApkVersion()
    {
        return 203400000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean getUseDynamicLookup()
    {
        return 1;
    }
}
