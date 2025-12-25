package com.google.android.gms.internal.auth;
public final class zzbt implements com.google.android.gms.auth.api.proxy.ProxyApi {

    public zzbt()
    {
        return;
    }

    public final com.google.android.gms.common.api.PendingResult getSpatulaHeader(com.google.android.gms.common.api.GoogleApiClient p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        return p2.execute(new com.google.android.gms.internal.auth.zzbs(this, p2));
    }

    public final com.google.android.gms.common.api.PendingResult performProxyRequest(com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.auth.api.proxy.ProxyRequest p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        return p2.execute(new com.google.android.gms.internal.auth.zzbq(this, p2, p3));
    }
}
