package com.google.android.gms.auth.api.credentials;
public class CredentialRequestResponse extends com.google.android.gms.common.api.Response {

    public CredentialRequestResponse()
    {
        return;
    }

    public com.google.android.gms.auth.api.credentials.Credential getCredential()
    {
        return ((com.google.android.gms.auth.api.credentials.CredentialRequestResult) this.getResult()).getCredential();
    }
}
