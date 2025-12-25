package com.google.android.gms.auth.api;
public final class AuthProxy {
    public static final com.google.android.gms.common.api.Api API;
    public static final com.google.android.gms.auth.api.proxy.ProxyApi ProxyApi;
    public static final com.google.android.gms.common.api.Api$ClientKey zza;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zzb;

    static AuthProxy()
    {
        com.google.android.gms.internal.auth.zzbt v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.auth.api.AuthProxy.zza = v0_1;
        com.google.android.gms.auth.api.zza v1_1 = new com.google.android.gms.auth.api.zza();
        com.google.android.gms.auth.api.AuthProxy.zzb = v1_1;
        com.google.android.gms.auth.api.AuthProxy.API = new com.google.android.gms.common.api.Api("Auth.PROXY_API", v1_1, v0_1);
        com.google.android.gms.auth.api.AuthProxy.ProxyApi = new com.google.android.gms.internal.auth.zzbt();
        return;
    }

    public AuthProxy()
    {
        return;
    }

    public static com.google.android.gms.auth.api.proxy.ProxyClient getClient(android.app.Activity p1, com.google.android.gms.auth.api.AuthProxyOptions p2)
    {
        return new com.google.android.gms.internal.auth.zzbo(p1, p2);
    }

    public static com.google.android.gms.auth.api.proxy.ProxyClient getClient(android.content.Context p1, com.google.android.gms.auth.api.AuthProxyOptions p2)
    {
        return new com.google.android.gms.internal.auth.zzbo(p1, p2);
    }
}
