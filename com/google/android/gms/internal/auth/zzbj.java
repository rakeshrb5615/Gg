package com.google.android.gms.internal.auth;
abstract class zzbj extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl {

    public zzbj(com.google.android.gms.common.api.GoogleApiClient p2)
    {
        super(com.google.android.gms.auth.api.AuthProxy.API, p2);
        return;
    }

    public final synthetic com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status p2)
    {
        return new com.google.android.gms.internal.auth.zzbv(p2);
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p2)
    {
        this.zza(((com.google.android.gms.internal.auth.zzbe) p2).getContext(), ((com.google.android.gms.internal.auth.zzbh) ((com.google.android.gms.internal.auth.zzbe) p2).getService()));
        return;
    }

    public final bridge synthetic void setResult(Object p1)
    {
        this.setResult(((com.google.android.gms.common.api.Result) p1));
        return;
    }

    public abstract void zza();
}
