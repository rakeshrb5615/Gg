package com.google.android.gms.auth.api.identity;
public final class BeginSignInRequest$Builder {
    private com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions zba;
    private com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions zbb;
    private com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions zbc;
    private com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions zbd;
    private String zbe;
    private boolean zbf;
    private int zbg;

    public BeginSignInRequest$Builder()
    {
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions v0_3 = com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions.builder();
        v0_3.setSupported(0);
        this.zba = v0_3.build();
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions v0_7 = com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions.builder();
        v0_7.setSupported(0);
        this.zbb = v0_7.build();
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions v0_1 = com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions.builder();
        v0_1.setSupported(0);
        this.zbc = v0_1.build();
        com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions v0_4 = com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions.builder();
        v0_4.setSupported(0);
        this.zbd = v0_4.build();
        return;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest build()
    {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest(this.zba, this.zbb, this.zbe, this.zbf, this.zbg, this.zbc, this.zbd);
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder setAutoSelectEnabled(boolean p1)
    {
        this.zbf = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder setGoogleIdTokenRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions p1)
    {
        this.zbb = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$GoogleIdTokenRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder setPasskeyJsonSignInRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions p1)
    {
        this.zbd = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder setPasskeysSignInRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions p1)
    {
        this.zbc = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder setPasswordRequestOptions(com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions p1)
    {
        this.zba = ((com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public final com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder zba(String p1)
    {
        this.zbe = p1;
        return this;
    }

    public final com.google.android.gms.auth.api.identity.BeginSignInRequest$Builder zbb(int p1)
    {
        this.zbg = p1;
        return this;
    }
}
