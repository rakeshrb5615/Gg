package com.google.android.gms.internal.auth-api;
public final class zbw extends com.google.android.gms.common.internal.GmsClient {
    private final android.os.Bundle zba;

    public zbw(android.content.Context p8, android.os.Looper p9, com.google.android.gms.auth.api.identity.zbc p10, com.google.android.gms.common.internal.ClientSettings p11, com.google.android.gms.common.api.internal.ConnectionCallbacks p12, com.google.android.gms.common.api.internal.OnConnectionFailedListener p13)
    {
        super(p8, p9, 219, p11, p12, p13).zba = p10.zba();
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.internal.auth-api.zbaa v0_1 = p3.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
            if (!(v0_1 instanceof com.google.android.gms.internal.auth-api.zbaa)) {
                return new com.google.android.gms.internal.auth-api.zbaa(p3);
            } else {
                return ((com.google.android.gms.internal.auth-api.zbaa) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.common.Feature[] getApiFeatures()
    {
        return com.google.android.gms.internal.auth-api.zbbi.zbi;
    }

    public final android.os.Bundle getGetServiceRequestExtraArgs()
    {
        return this.zba;
    }

    public final int getMinApkVersion()
    {
        return 17895000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    public final boolean getUseDynamicLookup()
    {
        return 1;
    }

    public final boolean usesClientTelemetry()
    {
        return 1;
    }
}
