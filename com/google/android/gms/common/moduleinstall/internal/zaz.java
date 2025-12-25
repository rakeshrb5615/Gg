package com.google.android.gms.common.moduleinstall.internal;
public final class zaz extends com.google.android.gms.common.internal.GmsClient {

    public zaz(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.common.api.internal.ConnectionCallbacks p11, com.google.android.gms.common.api.internal.OnConnectionFailedListener p12)
    {
        super(p8, p9, 308, p10, p11, p12);
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.common.moduleinstall.internal.zaf v0_1 = p3.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
            if (!(v0_1 instanceof com.google.android.gms.common.moduleinstall.internal.zaf)) {
                return new com.google.android.gms.common.moduleinstall.internal.zaf(p3);
            } else {
                return ((com.google.android.gms.common.moduleinstall.internal.zaf) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final com.google.android.gms.common.Feature[] getApiFeatures()
    {
        return com.google.android.gms.internal.base.zav.zab;
    }

    public final int getMinApkVersion()
    {
        return 17895000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
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
