package com.google.android.gms.auth.api;
public final class Auth {
    public static final com.google.android.gms.common.api.Api CREDENTIALS_API;
    public static final com.google.android.gms.auth.api.credentials.CredentialsApi CredentialsApi;
    public static final com.google.android.gms.common.api.Api GOOGLE_SIGN_IN_API;
    public static final com.google.android.gms.auth.api.signin.GoogleSignInApi GoogleSignInApi;
    public static final com.google.android.gms.common.api.Api PROXY_API;
    public static final com.google.android.gms.auth.api.proxy.ProxyApi ProxyApi;
    public static final com.google.android.gms.common.api.Api$ClientKey zba;
    public static final com.google.android.gms.common.api.Api$ClientKey zbb;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zbc;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zbd;

    static Auth()
    {
        com.google.android.gms.auth.api.signin.internal.zbd v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.auth.api.Auth.zba = v0_1;
        com.google.android.gms.common.api.Api$ClientKey v1_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.auth.api.Auth.zbb = v1_1;
        String v2_2 = new com.google.android.gms.auth.api.zba();
        com.google.android.gms.auth.api.Auth.zbc = v2_2;
        com.google.android.gms.auth.api.zbb v3_0 = new com.google.android.gms.auth.api.zbb();
        com.google.android.gms.auth.api.Auth.zbd = v3_0;
        com.google.android.gms.auth.api.Auth.PROXY_API = com.google.android.gms.auth.api.AuthProxy.API;
        com.google.android.gms.auth.api.Auth.CREDENTIALS_API = new com.google.android.gms.common.api.Api("Auth.CREDENTIALS_API", v2_2, v0_1);
        com.google.android.gms.auth.api.Auth.GOOGLE_SIGN_IN_API = new com.google.android.gms.common.api.Api("Auth.GOOGLE_SIGN_IN_API", v3_0, v1_1);
        com.google.android.gms.auth.api.Auth.ProxyApi = com.google.android.gms.auth.api.AuthProxy.ProxyApi;
        com.google.android.gms.auth.api.Auth.CredentialsApi = new com.google.android.gms.internal.auth-api.zbl();
        com.google.android.gms.auth.api.Auth.GoogleSignInApi = new com.google.android.gms.auth.api.signin.internal.zbd();
        return;
    }

    private Auth()
    {
        return;
    }
}
