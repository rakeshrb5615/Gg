package com.google.android.gms.common.api;
public abstract class Api$AbstractClientBuilder extends com.google.android.gms.common.api.Api$BaseClientBuilder {

    public Api$AbstractClientBuilder()
    {
        return;
    }

    public com.google.android.gms.common.api.Api$Client buildClient(android.content.Context p1, android.os.Looper p2, com.google.android.gms.common.internal.ClientSettings p3, Object p4, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p5, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p6)
    {
        return this.buildClient(p1, p2, p3, p4, p5, p6);
    }

    public com.google.android.gms.common.api.Api$Client buildClient(android.content.Context p1, android.os.Looper p2, com.google.android.gms.common.internal.ClientSettings p3, Object p4, com.google.android.gms.common.api.internal.ConnectionCallbacks p5, com.google.android.gms.common.api.internal.OnConnectionFailedListener p6)
    {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }
}
