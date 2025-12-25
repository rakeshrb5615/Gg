package com.google.android.gms.common.internal.service;
public final class zah extends com.google.android.gms.common.internal.GmsClient {

    public zah(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p11, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p12)
    {
        super(p8, p9, 39, p10, p11, p12);
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.common.internal.service.zal v0_1 = p3.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            if (!(v0_1 instanceof com.google.android.gms.common.internal.service.zal)) {
                return new com.google.android.gms.common.internal.service.zal(p3);
            } else {
                return ((com.google.android.gms.common.internal.service.zal) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.common.service.START";
    }
}
