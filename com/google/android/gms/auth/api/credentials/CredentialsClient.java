package com.google.android.gms.auth.api.credentials;
public class CredentialsClient extends com.google.android.gms.common.api.GoogleApi {

    public CredentialsClient(android.app.Activity p3, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions p4)
    {
        super(p3, com.google.android.gms.auth.api.Auth.CREDENTIALS_API, p4, new com.google.android.gms.common.api.internal.ApiExceptionMapper());
        return;
    }

    public CredentialsClient(android.content.Context p4, com.google.android.gms.auth.api.Auth$AuthCredentialsOptions p5)
    {
        super(p4, com.google.android.gms.auth.api.Auth.CREDENTIALS_API, p5, new com.google.android.gms.common.api.GoogleApi$Settings$Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
        return;
    }

    public com.google.android.gms.tasks.Task delete(com.google.android.gms.auth.api.credentials.Credential p3)
    {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.Auth.CredentialsApi.delete(this.asGoogleApiClient(), p3));
    }

    public com.google.android.gms.tasks.Task disableAutoSignIn()
    {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.Auth.CredentialsApi.disableAutoSignIn(this.asGoogleApiClient()));
    }

    public android.app.PendingIntent getHintPickerIntent(com.google.android.gms.auth.api.credentials.HintRequest p4)
    {
        return com.google.android.gms.internal.auth-api.zbn.zba(this.getApplicationContext(), ((com.google.android.gms.auth.api.Auth$AuthCredentialsOptions) this.getApiOptions()), p4, ((com.google.android.gms.auth.api.Auth$AuthCredentialsOptions) this.getApiOptions()).zbd());
    }

    public com.google.android.gms.tasks.Task request(com.google.android.gms.auth.api.credentials.CredentialRequest p3)
    {
        return com.google.android.gms.common.internal.PendingResultUtil.toResponseTask(com.google.android.gms.auth.api.Auth.CredentialsApi.request(this.asGoogleApiClient(), p3), new com.google.android.gms.auth.api.credentials.CredentialRequestResponse());
    }

    public com.google.android.gms.tasks.Task save(com.google.android.gms.auth.api.credentials.Credential p3)
    {
        return com.google.android.gms.common.internal.PendingResultUtil.toVoidTask(com.google.android.gms.auth.api.Auth.CredentialsApi.save(this.asGoogleApiClient(), p3));
    }
}
