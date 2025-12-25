package com.google.android.gms.auth.api.credentials;
public final class CredentialRequest$Builder {
    private boolean zba;
    private String[] zbb;
    private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbc;
    private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbd;
    private boolean zbe;
    private String zbf;
    private String zbg;

    public CredentialRequest$Builder()
    {
        this.zbe = 0;
        this.zbf = 0;
        return;
    }

    public com.google.android.gms.auth.api.credentials.CredentialRequest build()
    {
        if (this.zbb == null) {
            IllegalStateException v0_4 = new String[0];
            this.zbb = v0_4;
        }
        if ((!this.zba) && (this.zbb.length == 0)) {
            throw new IllegalStateException("At least one authentication method must be specified");
        } else {
            return new com.google.android.gms.auth.api.credentials.CredentialRequest(4, this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, 0);
        }
    }

    public varargs com.google.android.gms.auth.api.credentials.CredentialRequest$Builder setAccountTypes(String[] p1)
    {
        if (p1 == null) {
            p1 = new String[0];
        }
        this.zbb = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialRequest$Builder setCredentialHintPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig p1)
    {
        this.zbd = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialRequest$Builder setCredentialPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig p1)
    {
        this.zbc = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialRequest$Builder setIdTokenNonce(String p1)
    {
        this.zbg = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialRequest$Builder setIdTokenRequested(boolean p1)
    {
        this.zbe = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialRequest$Builder setPasswordLoginSupported(boolean p1)
    {
        this.zba = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialRequest$Builder setServerClientId(String p1)
    {
        this.zbf = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.CredentialRequest$Builder setSupportsPasswordLogin(boolean p1)
    {
        this.setPasswordLoginSupported(p1);
        return this;
    }
}
