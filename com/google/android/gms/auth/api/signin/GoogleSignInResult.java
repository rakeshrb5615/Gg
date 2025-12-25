package com.google.android.gms.auth.api.signin;
public class GoogleSignInResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zba;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zbb;

    public GoogleSignInResult(com.google.android.gms.auth.api.signin.GoogleSignInAccount p1, com.google.android.gms.common.api.Status p2)
    {
        this.zbb = p1;
        this.zba = p2;
        return;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSignInAccount()
    {
        return this.zbb;
    }

    public com.google.android.gms.common.api.Status getStatus()
    {
        return this.zba;
    }

    public boolean isSuccess()
    {
        return this.zba.isSuccess();
    }
}
