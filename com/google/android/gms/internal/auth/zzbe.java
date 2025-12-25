package com.google.android.gms.internal.auth;
public final class zzbe extends com.google.android.gms.common.internal.GmsClient {
    private final android.os.Bundle zze;

    public zzbe(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, com.google.android.gms.auth.api.AuthProxyOptions p11, com.google.android.gms.common.api.internal.ConnectionCallbacks p12, com.google.android.gms.common.api.internal.OnConnectionFailedListener p13)
    {
        android.os.Bundle v8_1;
        com.google.android.gms.internal.auth.zzbe v0_1 = super(p8, p9, 16, p10, p12, p13);
        if (p11 != null) {
            v8_1 = p11.zza();
        } else {
            v8_1 = new android.os.Bundle();
        }
        v0_1.zze = v8_1;
        return;
    }

    public final synthetic android.os.IInterface createServiceInterface(android.os.IBinder p3)
    {
        if (p3 != 0) {
            com.google.android.gms.internal.auth.zzbh v0_1 = p3.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
            if (!(v0_1 instanceof com.google.android.gms.internal.auth.zzbh)) {
                return new com.google.android.gms.internal.auth.zzbh(p3);
            } else {
                return ((com.google.android.gms.internal.auth.zzbh) v0_1);
            }
        } else {
            return 0;
        }
    }

    public final android.os.Bundle getGetServiceRequestExtraArgs()
    {
        return this.zze;
    }

    public final int getMinApkVersion()
    {
        return 12451000;
    }

    public final String getServiceDescriptor()
    {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String getStartServiceAction()
    {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean requiresSignIn()
    {
        int v0_0 = this.getClientSettings();
        if ((android.text.TextUtils.isEmpty(v0_0.getAccountName())) || (v0_0.getApplicableScopes(com.google.android.gms.auth.api.AuthProxy.API).isEmpty())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final boolean usesClientTelemetry()
    {
        return 1;
    }
}
