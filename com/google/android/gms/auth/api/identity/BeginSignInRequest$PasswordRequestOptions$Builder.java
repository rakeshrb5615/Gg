package com.google.android.gms.auth.api.identity;
public final class BeginSignInRequest$PasswordRequestOptions$Builder {
    private boolean zba;

    public BeginSignInRequest$PasswordRequestOptions$Builder()
    {
        this.zba = 0;
        return;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions build()
    {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions(this.zba);
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasswordRequestOptions$Builder setSupported(boolean p1)
    {
        this.zba = p1;
        return this;
    }
}
