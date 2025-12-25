package com.google.android.gms.auth.api.identity;
public final class SavePasswordRequest$Builder {
    private com.google.android.gms.auth.api.identity.SignInPassword zba;
    private String zbb;
    private int zbc;

    public SavePasswordRequest$Builder()
    {
        return;
    }

    public com.google.android.gms.auth.api.identity.SavePasswordRequest build()
    {
        return new com.google.android.gms.auth.api.identity.SavePasswordRequest(this.zba, this.zbb, this.zbc);
    }

    public com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder setSignInPassword(com.google.android.gms.auth.api.identity.SignInPassword p1)
    {
        this.zba = p1;
        return this;
    }

    public final com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder zba(String p1)
    {
        this.zbb = p1;
        return this;
    }

    public final com.google.android.gms.auth.api.identity.SavePasswordRequest$Builder zbb(int p1)
    {
        this.zbc = p1;
        return this;
    }
}
