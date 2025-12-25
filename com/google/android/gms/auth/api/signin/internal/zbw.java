package com.google.android.gms.auth.api.signin.internal;
final class zbw implements q1.a {
    final synthetic com.google.android.gms.auth.api.signin.internal.SignInHubActivity zba;

    public synthetic zbw(com.google.android.gms.auth.api.signin.internal.SignInHubActivity p1, com.google.android.gms.auth.api.signin.internal.zbv p2)
    {
        this.zba = p1;
        return;
    }

    public final androidx.loader.content.e onCreateLoader(int p2, android.os.Bundle p3)
    {
        return new com.google.android.gms.auth.api.signin.internal.zbc(this.zba, com.google.android.gms.common.api.GoogleApiClient.getAllClients());
    }

    public final bridge synthetic void onLoadFinished(androidx.loader.content.e p2, Object p3)
    {
        com.google.android.gms.auth.api.signin.internal.SignInHubActivity v2_0 = this.zba;
        v2_0.setResult(com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zba(v2_0), com.google.android.gms.auth.api.signin.internal.SignInHubActivity.zbb(v2_0));
        this.zba.finish();
        return;
    }

    public final void onLoaderReset(androidx.loader.content.e p1)
    {
        return;
    }
}
