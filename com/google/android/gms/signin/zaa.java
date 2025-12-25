package com.google.android.gms.signin;
final class zaa extends com.google.android.gms.common.api.Api$AbstractClientBuilder {

    public zaa()
    {
        return;
    }

    public final bridge synthetic com.google.android.gms.common.api.Api$Client buildClient(android.content.Context p9, android.os.Looper p10, com.google.android.gms.common.internal.ClientSettings p11, Object p12, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p13, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p14)
    {
        return new com.google.android.gms.signin.internal.SignInClientImpl(p9, p10, 1, p11, com.google.android.gms.signin.internal.SignInClientImpl.createBundleFromClientSettings(p11), p13, p14);
    }
}
