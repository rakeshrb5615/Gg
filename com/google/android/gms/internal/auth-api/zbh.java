package com.google.android.gms.internal.auth-api;
final class zbh extends com.google.android.gms.internal.auth-api.zbm {
    final synthetic com.google.android.gms.auth.api.credentials.Credential zba;

    public zbh(com.google.android.gms.internal.auth-api.zbl p1, com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.auth.api.credentials.Credential p3)
    {
        this.zba = p3;
        super(p2);
        return;
    }

    public final bridge synthetic com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status p1)
    {
        return p1;
    }

    public final void zba(android.content.Context p3, com.google.android.gms.internal.auth-api.zbt p4)
    {
        p4.zbe(new com.google.android.gms.internal.auth-api.zbk(this), new com.google.android.gms.internal.auth-api.zbu(this.zba));
        return;
    }
}
