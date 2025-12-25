package com.google.android.gms.auth.api.credentials;
public class Credentials {

    public Credentials()
    {
        return;
    }

    public static com.google.android.gms.auth.api.credentials.CredentialsClient getClient(android.app.Activity p2)
    {
        return new com.google.android.gms.auth.api.credentials.CredentialsClient(p2, com.google.android.gms.auth.api.credentials.CredentialsOptions.DEFAULT);
    }

    public static com.google.android.gms.auth.api.credentials.CredentialsClient getClient(android.app.Activity p1, com.google.android.gms.auth.api.credentials.CredentialsOptions p2)
    {
        return new com.google.android.gms.auth.api.credentials.CredentialsClient(p1, p2);
    }

    public static com.google.android.gms.auth.api.credentials.CredentialsClient getClient(android.content.Context p2)
    {
        return new com.google.android.gms.auth.api.credentials.CredentialsClient(p2, com.google.android.gms.auth.api.credentials.CredentialsOptions.DEFAULT);
    }

    public static com.google.android.gms.auth.api.credentials.CredentialsClient getClient(android.content.Context p1, com.google.android.gms.auth.api.credentials.CredentialsOptions p2)
    {
        return new com.google.android.gms.auth.api.credentials.CredentialsClient(p1, p2);
    }
}
