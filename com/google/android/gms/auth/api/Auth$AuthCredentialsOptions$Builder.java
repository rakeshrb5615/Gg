package com.google.android.gms.auth.api;
public class Auth$AuthCredentialsOptions$Builder {
    protected Boolean zba;
    protected String zbb;

    public Auth$AuthCredentialsOptions$Builder()
    {
        this.zba = Boolean.FALSE;
        return;
    }

    public Auth$AuthCredentialsOptions$Builder(com.google.android.gms.auth.api.Auth$AuthCredentialsOptions p2)
    {
        this.zba = Boolean.FALSE;
        com.google.android.gms.auth.api.Auth$AuthCredentialsOptions.zbb(p2);
        this.zba = Boolean.valueOf(com.google.android.gms.auth.api.Auth$AuthCredentialsOptions.zbe(p2));
        this.zbb = com.google.android.gms.auth.api.Auth$AuthCredentialsOptions.zbc(p2);
        return;
    }

    public com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder forceEnableSaveDialog()
    {
        this.zba = Boolean.TRUE;
        return this;
    }

    public final com.google.android.gms.auth.api.Auth$AuthCredentialsOptions$Builder zba(String p1)
    {
        this.zbb = p1;
        return this;
    }
}
