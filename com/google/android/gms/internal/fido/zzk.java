package com.google.android.gms.internal.fido;
public final class zzk extends com.google.android.gms.common.internal.GmsClient {

    public zzk(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p11, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p12)
    {
        super(p8, p9, 149, p10, p11, p12);
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.internal.fido.zzn v0_1 = p3.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
            if (!(v0_1 instanceof com.google.android.gms.internal.fido.zzn)) {
                return new com.google.android.gms.internal.fido.zzn(p3);
            } else {
                return ((com.google.android.gms.internal.fido.zzn) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.common.Feature[] getApiFeatures()
    {
        return new com.google.android.gms.common.Feature[] {com.google.android.gms.fido.zza.zzh, com.google.android.gms.fido.zza.zzi, com.google.android.gms.fido.zza.zzt});
    }

    public final android.os.Bundle getGetServiceRequestExtraArgs()
    {
        android.os.Bundle v0_1 = new android.os.Bundle();
        v0_1.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.privileged.START");
        return v0_1;
    }

    public final int getMinApkVersion()
    {
        return 13000000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.fido.fido2.privileged.START";
    }

    public final boolean usesClientTelemetry()
    {
        return 1;
    }
}
