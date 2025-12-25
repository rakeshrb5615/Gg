package com.google.android.gms.auth.api.credentials;
public final class HintRequest$Builder {
    private boolean zba;
    private boolean zbb;
    private String[] zbc;
    private com.google.android.gms.auth.api.credentials.CredentialPickerConfig zbd;
    private boolean zbe;
    private String zbf;
    private String zbg;

    public HintRequest$Builder()
    {
        this.zbd = new com.google.android.gms.auth.api.credentials.CredentialPickerConfig$Builder().build();
        this.zbe = 0;
        return;
    }

    public com.google.android.gms.auth.api.credentials.HintRequest build()
    {
        if (this.zbc == null) {
            IllegalStateException v0_5 = new String[0];
            this.zbc = v0_5;
        }
        if ((!this.zba) && ((!this.zbb) && (this.zbc.length == 0))) {
            throw new IllegalStateException("At least one authentication method must be specified");
        } else {
            return new com.google.android.gms.auth.api.credentials.HintRequest(2, this.zbd, this.zba, this.zbb, this.zbc, this.zbe, this.zbf, this.zbg);
        }
    }

    public varargs com.google.android.gms.auth.api.credentials.HintRequest$Builder setAccountTypes(String[] p1)
    {
        if (p1 == null) {
            p1 = new String[0];
        }
        this.zbc = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.HintRequest$Builder setEmailAddressIdentifierSupported(boolean p1)
    {
        this.zba = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.HintRequest$Builder setHintPickerConfig(com.google.android.gms.auth.api.credentials.CredentialPickerConfig p1)
    {
        this.zbd = ((com.google.android.gms.auth.api.credentials.CredentialPickerConfig) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public com.google.android.gms.auth.api.credentials.HintRequest$Builder setIdTokenNonce(String p1)
    {
        this.zbg = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.HintRequest$Builder setIdTokenRequested(boolean p1)
    {
        this.zbe = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.HintRequest$Builder setPhoneNumberIdentifierSupported(boolean p1)
    {
        this.zbb = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.HintRequest$Builder setServerClientId(String p1)
    {
        this.zbf = p1;
        return this;
    }
}
