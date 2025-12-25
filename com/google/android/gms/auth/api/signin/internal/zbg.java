package com.google.android.gms.auth.api.signin.internal;
final class zbg extends com.google.android.gms.auth.api.signin.internal.zbl {
    final synthetic android.content.Context zba;
    final synthetic com.google.android.gms.auth.api.signin.GoogleSignInOptions zbb;

    public zbg(com.google.android.gms.common.api.GoogleApiClient p1, android.content.Context p2, com.google.android.gms.auth.api.signin.GoogleSignInOptions p3)
    {
        this.zba = p2;
        this.zbb = p3;
        super(p1);
        return;
    }

    public final synthetic com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status p3)
    {
        return new com.google.android.gms.auth.api.signin.GoogleSignInResult(0, p3);
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p3)
    {
        ((com.google.android.gms.auth.api.signin.internal.zbs) ((com.google.android.gms.auth.api.signin.internal.zbe) p3).getService()).zbe(new com.google.android.gms.auth.api.signin.internal.zbf(this), this.zbb);
        return;
    }
}
