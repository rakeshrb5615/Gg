package com.google.android.gms.auth.api.signin.internal;
public final class zbd implements com.google.android.gms.auth.api.signin.GoogleSignInApi {

    public zbd()
    {
        return;
    }

    private static final com.google.android.gms.auth.api.signin.GoogleSignInOptions zba(com.google.android.gms.common.api.GoogleApiClient p1)
    {
        return ((com.google.android.gms.auth.api.signin.internal.zbe) p1.getClient(com.google.android.gms.auth.api.Auth.zbb)).zba();
    }

    public final android.content.Intent getSignInIntent(com.google.android.gms.common.api.GoogleApiClient p2)
    {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbc(p2.getContext(), com.google.android.gms.auth.api.signin.internal.zbd.zba(p2));
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent(android.content.Intent p1)
    {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbd(p1);
    }

    public final com.google.android.gms.common.api.PendingResult revokeAccess(com.google.android.gms.common.api.GoogleApiClient p3)
    {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbf(p3, p3.getContext(), 0);
    }

    public final com.google.android.gms.common.api.PendingResult signOut(com.google.android.gms.common.api.GoogleApiClient p3)
    {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbg(p3, p3.getContext(), 0);
    }

    public final com.google.android.gms.common.api.OptionalPendingResult silentSignIn(com.google.android.gms.common.api.GoogleApiClient p4)
    {
        return com.google.android.gms.auth.api.signin.internal.zbm.zbe(p4, p4.getContext(), com.google.android.gms.auth.api.signin.internal.zbd.zba(p4), 0);
    }
}
