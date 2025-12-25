package com.google.android.gms.internal.auth-api;
public final class zbe implements com.google.android.gms.auth.api.credentials.CredentialRequestResult {
    private final com.google.android.gms.common.api.Status zba;
    private final com.google.android.gms.auth.api.credentials.Credential zbb;

    public zbe(com.google.android.gms.common.api.Status p1, com.google.android.gms.auth.api.credentials.Credential p2)
    {
        this.zba = p1;
        this.zbb = p2;
        return;
    }

    public final com.google.android.gms.auth.api.credentials.Credential getCredential()
    {
        return this.zbb;
    }

    public final com.google.android.gms.common.api.Status getStatus()
    {
        return this.zba;
    }
}
