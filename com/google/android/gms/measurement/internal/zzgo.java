package com.google.android.gms.measurement.internal;
public final class zzgo extends com.google.android.gms.common.internal.BaseGmsClient {

    public zzgo(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks p10, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener p11)
    {
        super(p8, p9, 93, p10, p11, 0);
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.measurement.internal.zzfz v0_1 = p3.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
            if (!(v0_1 instanceof com.google.android.gms.measurement.internal.zzgb)) {
                return new com.google.android.gms.measurement.internal.zzfz(p3);
            } else {
                return ((com.google.android.gms.measurement.internal.zzgb) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final int getMinApkVersion()
    {
        return 12451000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.measurement.START";
    }
}
