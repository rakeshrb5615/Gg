package com.google.android.gms.internal.auth;
public final class zzam extends com.google.android.gms.common.internal.GmsClient {

    public zzam(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p11, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p12)
    {
        super(p8, p9, 120, p10, p11, p12);
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p1)
    {
        return com.google.android.gms.auth.account.zzd.zzb(p1);
    }

    public final com.google.android.gms.common.Feature[] getApiFeatures()
    {
        return new com.google.android.gms.common.Feature[] {com.google.android.gms.auth.zze.zzl});
    }

    public final int getMinApkVersion()
    {
        return 12451000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    public final boolean usesClientTelemetry()
    {
        return 1;
    }
}
