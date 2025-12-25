package com.google.android.gms.auth.api.identity;
public final class BeginSignInRequest$PasskeysRequestOptions$Builder {
    private boolean zba;
    private byte[] zbb;
    private String zbc;

    public BeginSignInRequest$PasskeysRequestOptions$Builder()
    {
        this.zba = 0;
        return;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions build()
    {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions(this.zba, this.zbb, this.zbc);
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder setChallenge(byte[] p1)
    {
        this.zbb = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder setRpId(String p1)
    {
        this.zbc = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeysRequestOptions$Builder setSupported(boolean p1)
    {
        this.zba = p1;
        return this;
    }
}
