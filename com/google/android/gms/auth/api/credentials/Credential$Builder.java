package com.google.android.gms.auth.api.credentials;
public class Credential$Builder {
    private final String zba;
    private String zbb;
    private android.net.Uri zbc;
    private java.util.List zbd;
    private String zbe;
    private String zbf;
    private String zbg;
    private String zbh;

    public Credential$Builder(com.google.android.gms.auth.api.credentials.Credential p2)
    {
        this.zba = com.google.android.gms.auth.api.credentials.Credential.zbe(p2);
        this.zbb = com.google.android.gms.auth.api.credentials.Credential.zbf(p2);
        this.zbc = com.google.android.gms.auth.api.credentials.Credential.zba(p2);
        this.zbd = com.google.android.gms.auth.api.credentials.Credential.zbh(p2);
        this.zbe = com.google.android.gms.auth.api.credentials.Credential.zbg(p2);
        this.zbf = com.google.android.gms.auth.api.credentials.Credential.zbb(p2);
        this.zbg = com.google.android.gms.auth.api.credentials.Credential.zbd(p2);
        this.zbh = com.google.android.gms.auth.api.credentials.Credential.zbc(p2);
        return;
    }

    public Credential$Builder(String p1)
    {
        this.zba = p1;
        return;
    }

    public com.google.android.gms.auth.api.credentials.Credential build()
    {
        return new com.google.android.gms.auth.api.credentials.Credential(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh);
    }

    public com.google.android.gms.auth.api.credentials.Credential$Builder setAccountType(String p1)
    {
        this.zbf = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.Credential$Builder setName(String p1)
    {
        this.zbb = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.Credential$Builder setPassword(String p1)
    {
        this.zbe = p1;
        return this;
    }

    public com.google.android.gms.auth.api.credentials.Credential$Builder setProfilePictureUri(android.net.Uri p1)
    {
        this.zbc = p1;
        return this;
    }
}
