package com.google.android.gms.auth.api.identity;
public interface AuthorizationClient implements com.google.android.gms.common.api.HasApiKey {

    public abstract com.google.android.gms.tasks.Task authorize();

    public abstract com.google.android.gms.auth.api.identity.AuthorizationResult getAuthorizationResultFromIntent();
}
