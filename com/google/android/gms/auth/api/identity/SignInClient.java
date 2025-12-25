package com.google.android.gms.auth.api.identity;
public interface SignInClient implements com.google.android.gms.common.api.HasApiKey {

    public abstract com.google.android.gms.tasks.Task beginSignIn();

    public abstract String getPhoneNumberFromIntent();

    public abstract com.google.android.gms.tasks.Task getPhoneNumberHintIntent();

    public abstract com.google.android.gms.auth.api.identity.SignInCredential getSignInCredentialFromIntent();

    public abstract com.google.android.gms.tasks.Task getSignInIntent();

    public abstract com.google.android.gms.tasks.Task signOut();
}
