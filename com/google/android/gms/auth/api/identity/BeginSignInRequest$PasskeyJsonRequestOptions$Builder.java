package com.google.android.gms.auth.api.identity;
public final class BeginSignInRequest$PasskeyJsonRequestOptions$Builder {
    private boolean zba;
    private String zbb;

    public BeginSignInRequest$PasskeyJsonRequestOptions$Builder()
    {
        this.zba = 0;
        return;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions build()
    {
        return new com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions(this.zba, this.zbb);
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder setRequestJson(String p1)
    {
        this.zbb = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.BeginSignInRequest$PasskeyJsonRequestOptions$Builder setSupported(boolean p1)
    {
        this.zba = p1;
        return this;
    }
}
