package com.google.android.gms.auth.api.credentials;
public final class CredentialsOptions$Builder extends com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder {

    public CredentialsOptions$Builder()
    {
        return;
    }

    public com.google.android.gms.auth.api.credentials.CredentialsOptions build()
    {
        return new com.google.android.gms.auth.api.credentials.CredentialsOptions(this, 0);
    }

    public final bridge synthetic com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder forceEnableSaveDialog()
    {
        this.forceEnableSaveDialog();
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialsOptions$Builder forceEnableSaveDialog()
    {
        this.zba = Boolean.TRUE;
        return this;
    }
}
