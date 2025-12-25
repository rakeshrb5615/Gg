package com.google.android.gms.auth.api.identity;
public interface CredentialSavingClient implements com.google.android.gms.common.api.HasApiKey {

    public abstract com.google.android.gms.common.api.Status getStatusFromIntent();

    public abstract com.google.android.gms.tasks.Task saveAccountLinkingToken();

    public abstract com.google.android.gms.tasks.Task savePassword();
}
