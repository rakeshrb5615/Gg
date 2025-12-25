package com.google.android.gms.internal.auth-api-phone;
public final class zzw extends com.google.android.gms.common.internal.GmsClient {

    public zzw(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.common.api.internal.ConnectionCallbacks p11, com.google.android.gms.common.api.internal.OnConnectionFailedListener p12)
    {
        super(p8, p9, 126, p10, p11, p12);
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.internal.auth-api-phone.zzh v0_1 = p3.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
            if (!(v0_1 instanceof com.google.android.gms.internal.auth-api-phone.zzh)) {
                return new com.google.android.gms.internal.auth-api-phone.zzh(p3);
            } else {
                return ((com.google.android.gms.internal.auth-api-phone.zzh) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.common.Feature[] getApiFeatures()
    {
        return com.google.android.gms.internal.auth-api-phone.zzac.zze;
    }

    public final int getMinApkVersion()
    {
        return 12451000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    public final boolean usesClientTelemetry()
    {
        return 1;
    }
}
