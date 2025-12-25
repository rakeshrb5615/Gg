package com.google.android.gms.auth.api;
final class zbb extends com.google.android.gms.common.api.Api$AbstractClientBuilder {

    public zbb()
    {
        return;
    }

    public final synthetic com.google.android.gms.common.api.Api$Client buildClient(android.content.Context p8, android.os.Looper p9, com.google.android.gms.common.internal.ClientSettings p10, Object p11, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p12, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p13)
    {
        return new com.google.android.gms.auth.api.signin.internal.zbe(p8, p9, p10, ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p11), p12, p13);
    }

    public final bridge synthetic java.util.List getImpliedScopes(Object p1)
    {
        if (((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p1) != null) {
            return ((com.google.android.gms.auth.api.signin.GoogleSignInOptions) p1).getScopes();
        } else {
            return java.util.Collections.EMPTY_LIST;
        }
    }
}
