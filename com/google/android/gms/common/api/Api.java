package com.google.android.gms.common.api;
public final class Api {
    private final com.google.android.gms.common.api.Api$AbstractClientBuilder zaa;
    private final com.google.android.gms.common.api.Api$ClientKey zab;
    private final String zac;

    public Api(String p2, com.google.android.gms.common.api.Api$AbstractClientBuilder p3, com.google.android.gms.common.api.Api$ClientKey p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Cannot construct an Api with a null ClientBuilder");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "Cannot construct an Api with a null ClientKey");
        this.zac = p2;
        this.zaa = p3;
        this.zab = p4;
        return;
    }

    public final com.google.android.gms.common.api.Api$AbstractClientBuilder zaa()
    {
        return this.zaa;
    }

    public final com.google.android.gms.common.api.Api$AnyClientKey zab()
    {
        return this.zab;
    }

    public final com.google.android.gms.common.api.Api$BaseClientBuilder zac()
    {
        return this.zaa;
    }

    public final String zad()
    {
        return this.zac;
    }
}
