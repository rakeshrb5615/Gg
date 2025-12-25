package com.google.android.gms.internal.auth-api;
public final class zbo extends com.google.android.gms.common.internal.GmsClient {
    private final com.google.android.gms.auth.api.Auth$AuthCredentialsOptions zba;

    public zbo(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions p11, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p12, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p13)
    {
        com.google.android.gms.internal.auth-api.zbo v0_1 = super(p8, p9, 68, p10, p12, p13);
        if (p11 == null) {
            p11 = com.google.android.gms.auth.api.Auth$AuthCredentialsOptions.zba;
        }
        com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder v8_1 = new com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder(p11);
        v8_1.zba(com.google.android.gms.internal.auth-api.zbbj.zba());
        v0_1.zba = new com.google.android.gms.auth.api.Auth$AuthCredentialsOptions(v8_1);
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.internal.auth-api.zbt v0_1 = p3.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
            if (!(v0_1 instanceof com.google.android.gms.internal.auth-api.zbt)) {
                return new com.google.android.gms.internal.auth-api.zbt(p3);
            } else {
                return ((com.google.android.gms.internal.auth-api.zbt) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final android.os.Bundle getGetServiceRequestExtraArgs()
    {
        return this.zba.zba();
    }

    public final int getMinApkVersion()
    {
        return 12800000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final com.google.android.gms.auth.api.Auth$AuthCredentialsOptions zba()
    {
        return this.zba;
    }
}
