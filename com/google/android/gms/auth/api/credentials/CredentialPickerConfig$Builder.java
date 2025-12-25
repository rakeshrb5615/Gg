package com.google.android.gms.auth.api.credentials;
public class CredentialPickerConfig$Builder {
    private boolean zba;
    private boolean zbb;
    private int zbc;

    public CredentialPickerConfig$Builder()
    {
        this.zba = 0;
        this.zbb = 1;
        this.zbc = 1;
        return;
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig build()
    {
        return new com.google.android.gms.auth.api.credentials.CredentialPickerConfig(2, this.zba, this.zbb, 0, this.zbc);
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder setForNewAccount(boolean p2)
    {
        int v0 = 1;
        if (1 == p2) {
            v0 = 3;
        }
        this.zbc = v0;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder setPrompt(int p1)
    {
        this.zbc = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder setShowAddAccountButton(boolean p1)
    {
        this.zba = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder setShowCancelButton(boolean p1)
    {
        this.zbb = p1;
        return this;
    }
}
