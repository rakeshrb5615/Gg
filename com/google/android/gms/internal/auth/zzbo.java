package com.google.android.gms.internal.auth;
public final class zzbo extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.api.proxy.ProxyClient {

    public zzbo(android.app.Activity p3, com.google.android.gms.auth.api.AuthProxyOptions p4)
    {
        if (p4 == null) {
            p4 = com.google.android.gms.auth.api.AuthProxyOptions.zza;
        }
        super(p3, com.google.android.gms.auth.api.AuthProxy.API, p4, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public zzbo(android.content.Context p3, com.google.android.gms.auth.api.AuthProxyOptions p4)
    {
        if (p4 == null) {
            p4 = com.google.android.gms.auth.api.AuthProxyOptions.zza;
        }
        super(p3, com.google.android.gms.auth.api.AuthProxy.API, p4, com.google.android.gms.common.api.GoogleApi$Settings.DEFAULT_SETTINGS);
        return;
    }

    public final com.google.android.gms.tasks.Task getSpatulaHeader()
    {
        return this.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.auth.zzbk(this)).setMethodKey(1520).build());
    }

    public final com.google.android.gms.tasks.Task performProxyRequest(com.google.android.gms.auth.api.proxy.ProxyRequest p3)
    {
        return this.doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.internal.auth.zzbl(this, p3)).setMethodKey(1518).build());
    }
}
