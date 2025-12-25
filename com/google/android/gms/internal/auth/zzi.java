package com.google.android.gms.internal.auth;
final class zzi extends com.google.android.gms.common.internal.GmsClient {

    public zzi(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.common.api.internal.ConnectionCallbacks p11, com.google.android.gms.common.api.internal.OnConnectionFailedListener p12)
    {
        super(p8, p9, 224, p10, p11, p12);
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.internal.auth.zzp v0_1 = p3.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
            if (!(v0_1 instanceof com.google.android.gms.internal.auth.zzp)) {
                return new com.google.android.gms.internal.auth.zzp(p3);
            } else {
                return ((com.google.android.gms.internal.auth.zzp) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final void disconnect(String p3)
    {
        android.util.Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(p3)));
        super.disconnect(p3);
        return;
    }

    public final com.google.android.gms.common.Feature[] getApiFeatures()
    {
        return new com.google.android.gms.common.Feature[] {com.google.android.gms.auth.zze.zzj, com.google.android.gms.auth.zze.zzi, com.google.android.gms.auth.zze.zza});
    }

    public final int getMinApkVersion()
    {
        return 17895000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.auth.account.authapi.START";
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
