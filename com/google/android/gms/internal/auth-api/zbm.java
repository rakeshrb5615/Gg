package com.google.android.gms.internal.auth-api;
abstract class zbm extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl {

    public zbm(com.google.android.gms.common.api.GoogleApiClient p2)
    {
        super(com.google.android.gms.auth.api.Auth.CREDENTIALS_API, p2);
        return;
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p2)
    {
        this.zba(((com.google.android.gms.internal.auth-api.zbo) p2).getContext(), ((com.google.android.gms.internal.auth-api.zbt) ((com.google.android.gms.internal.auth-api.zbo) p2).getService()));
        return;
    }

    public final bridge synthetic void setResult(Object p1)
    {
        this.setResult(((com.google.android.gms.common.api.Result) p1));
        return;
    }

    public abstract void zba();
}
