package com.google.android.gms.internal.auth-api;
final class zbg extends com.google.android.gms.internal.auth-api.zbm {
    final synthetic com.google.android.gms.auth.api.credentials.CredentialRequest zba;

    public zbg(com.google.android.gms.internal.auth-api.zbl p1, com.google.android.gms.common.api.GoogleApiClient p2, com.google.android.gms.auth.api.credentials.CredentialRequest p3)
    {
        this.zba = p3;
        super(p2);
        return;
    }

    public final synthetic com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status p3)
    {
        return new com.google.android.gms.internal.auth-api.zbe(p3, 0);
    }

    public final void zba(android.content.Context p2, com.google.android.gms.internal.auth-api.zbt p3)
    {
        p3.zbd(new com.google.android.gms.internal.auth-api.zbf(this), this.zba);
        return;
    }
}
