package com.google.android.gms.auth.api.signin;
public interface GoogleSignInApi {
    public static final String EXTRA_SIGN_IN_ACCOUNT = "signInAccount";

    public abstract android.content.Intent getSignInIntent();

    public abstract com.google.android.gms.auth.api.signin.GoogleSignInResult getSignInResultFromIntent();

    public abstract com.google.android.gms.common.api.PendingResult revokeAccess();

    public abstract com.google.android.gms.common.api.PendingResult signOut();

    public abstract com.google.android.gms.common.api.OptionalPendingResult silentSignIn();
}
