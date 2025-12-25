package com.google.android.gms.auth.api.identity;
public final class BeginSignInRequest$GoogleIdTokenRequestOptions$Builder {
    private boolean zba;
    private String zbb;
    private String zbc;
    private boolean zbd;
    private String zbe;
    private java.util.List zbf;
    private boolean zbg;

    public BeginSignInRequest$GoogleIdTokenRequestOptions$Builder()
    {
        this.zba = 0;
        this.zbb = 0;
        this.zbc = 0;
        this.zbd = 1;
        this.zbe = 0;
        this.zbf = 0;
        this.zbg = 0;
        return;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder associateLinkedAccounts(String p2, java.util.List p3)
    {
        this.zbe = ((String) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "linkedServiceId must be provided if you want to associate linked accounts."));
        this.zbf = p3;
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions build()
    {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg);
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder setFilterByAuthorizedAccounts(boolean p1)
    {
        this.zbd = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder setNonce(String p1)
    {
        this.zbc = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder setRequestVerifiedPhoneNumber(boolean p1)
    {
        this.zbg = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder setServerClientId(String p1)
    {
        this.zbb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions$Builder setSupported(boolean p1)
    {
        this.zba = p1;
        return this;
    }
}
