package com.google.android.gms.internal.fido;
public final class zzac extends com.google.android.gms.common.internal.GmsClient {

    public zzac(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p11, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p12)
    {
        super(p8, p9, 119, p10, p11, p12);
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.internal.fido.zzz v0_1 = p3.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
            if (!(v0_1 instanceof com.google.android.gms.internal.fido.zzz)) {
                return new com.google.android.gms.internal.fido.zzz(p3);
            } else {
                return ((com.google.android.gms.internal.fido.zzz) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final android.os.Bundle getGetServiceRequestExtraArgs()
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
        return v0_1;
    }

    public final int getMinApkVersion()
    {
        return 13000000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
    }

    public final boolean usesClientTelemetry()
    {
        return 1;
    }
}
