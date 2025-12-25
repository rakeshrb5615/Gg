package com.google.android.gms.auth.api.identity;
public final class Identity {

    private Identity()
    {
        return;
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationClient getAuthorizationClient(android.app.Activity p3)
    {
        return new com.google.android.gms.internal.auth-api.zbaq(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3)), new com.google.android.gms.auth.api.identity.zbb(0).zbb());
    }

    public static com.google.android.gms.auth.api.identity.AuthorizationClient getAuthorizationClient(android.content.Context p3)
    {
        return new com.google.android.gms.internal.auth-api.zbaq(((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3)), new com.google.android.gms.auth.api.identity.zbb(0).zbb());
    }

    public static com.google.android.gms.auth.api.identity.CredentialSavingClient getCredentialSavingClient(android.app.Activity p2)
    {
        return new com.google.android.gms.internal.auth-api.zbaw(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2)), new com.google.android.gms.auth.api.identity.zbh());
    }

    public static com.google.android.gms.auth.api.identity.CredentialSavingClient getCredentialSavingClient(android.content.Context p2)
    {
        return new com.google.android.gms.internal.auth-api.zbaw(((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2)), new com.google.android.gms.auth.api.identity.zbh());
    }

    public static com.google.android.gms.auth.api.identity.SignInClient getSignInClient(android.app.Activity p2)
    {
        return new com.google.android.gms.internal.auth-api.zbbg(((android.app.Activity) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2)), new com.google.android.gms.auth.api.identity.zbu());
    }

    public static com.google.android.gms.auth.api.identity.SignInClient getSignInClient(android.content.Context p2)
    {
        return new com.google.android.gms.internal.auth-api.zbbg(((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2)), new com.google.android.gms.auth.api.identity.zbu());
    }
}
