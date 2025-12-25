package com.google.android.gms.auth.api.identity;
public final class AuthorizationRequest$Builder {
    private java.util.List zba;
    private String zbb;
    private boolean zbc;
    private boolean zbd;
    private android.accounts.Account zbe;
    private String zbf;
    private String zbg;
    private boolean zbh;

    public AuthorizationRequest$Builder()
    {
        return;
    }

    private final String zbc(String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        String v0_0 = this.zbb;
        int v1 = 1;
        if ((v0_0 != null) && (!v0_0.equals(p3))) {
            v1 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1, "two different server client ids provided");
        return p3;
    }

    public com.google.android.gms.auth.api.identity.AuthorizationRequest build()
    {
        return new com.google.android.gms.auth.api.identity.AuthorizationRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh);
    }

    public com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder filterByHostedDomain(String p1)
    {
        this.zbf = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return this;
    }

    public com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder requestOfflineAccess(String p2)
    {
        this.requestOfflineAccess(p2, 0);
        return this;
    }

    public com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder requestOfflineAccess(String p1, boolean p2)
    {
        this.zbc(p1);
        this.zbb = p1;
        this.zbc = 1;
        this.zbh = p2;
        return this;
    }

    public com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder setAccount(android.accounts.Account p1)
    {
        this.zbe = ((android.accounts.Account) com.google.android.gms.common.internal.Preconditions.checkNotNull(p1));
        return this;
    }

    public com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder setRequestedScopes(java.util.List p3)
    {
        int v0 = 0;
        if ((p3 != null) && (!p3.isEmpty())) {
            v0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0, "requestedScopes cannot be null or empty");
        this.zba = p3;
        return this;
    }

    public final com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder zba(String p1)
    {
        this.zbc(p1);
        this.zbb = p1;
        this.zbd = 1;
        return this;
    }

    public final com.google.android.gms.auth.api.identity.AuthorizationRequest$Builder zbb(String p1)
    {
        this.zbg = p1;
        return this;
    }
}
