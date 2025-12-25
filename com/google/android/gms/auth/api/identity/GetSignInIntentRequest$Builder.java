package com.google.android.gms.auth.api.identity;
public final class GetSignInIntentRequest$Builder {
    private String zba;
    private String zbb;
    private String zbc;
    private String zbd;
    private boolean zbe;
    private int zbf;

    public GetSignInIntentRequest$Builder()
    {
        return;
    }

    public com.google.android.gms.auth.api.identity.GetSignInIntentRequest build()
    {
        return new com.google.android.gms.auth.api.identity.GetSignInIntentRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf);
    }

    public com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder filterByHostedDomain(String p1)
    {
        this.zbb = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder setNonce(String p1)
    {
        this.zbd = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder setRequestVerifiedPhoneNumber(boolean p1)
    {
        this.zbe = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder setServerClientId(String p1)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p1);
        this.zba = p1;
        return this;
    }

    public final com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder zba(String p1)
    {
        this.zbc = p1;
        return this;
    }

    public final com.google.android.gms.auth.api.identity.GetSignInIntentRequest$Builder zbb(int p1)
    {
        this.zbf = p1;
        return this;
    }
}
