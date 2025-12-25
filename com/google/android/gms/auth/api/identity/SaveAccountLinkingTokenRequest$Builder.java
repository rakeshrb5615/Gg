package com.google.android.gms.auth.api.identity;
public final class SaveAccountLinkingTokenRequest$Builder {
    private android.app.PendingIntent zba;
    private String zbb;
    private String zbc;
    private java.util.List zbd;
    private String zbe;
    private int zbf;

    public SaveAccountLinkingTokenRequest$Builder()
    {
        this.zbd = new java.util.ArrayList();
        return;
    }

    public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest build()
    {
        String v0_7;
        int v1 = 0;
        if (this.zba == null) {
            v0_7 = 0;
        } else {
            v0_7 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_7, "Consent PendingIntent cannot be null");
        com.google.android.gms.common.internal.Preconditions.checkArgument("auth_code".equals(this.zbb), "Invalid tokenType");
        com.google.android.gms.common.internal.Preconditions.checkArgument((android.text.TextUtils.isEmpty(this.zbc) ^ 1), "serviceId cannot be null or empty");
        if (this.zbd != null) {
            v1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1, "scopes cannot be null");
        return new com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf);
    }

    public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder setConsentPendingIntent(android.app.PendingIntent p1)
    {
        this.zba = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder setScopes(java.util.List p1)
    {
        this.zbd = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder setServiceId(String p1)
    {
        this.zbc = p1;
        return this;
    }

    public com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder setTokenType(String p1)
    {
        this.zbb = p1;
        return this;
    }

    public final com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder zba(String p1)
    {
        this.zbe = p1;
        return this;
    }

    public final com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest$Builder zbb(int p1)
    {
        this.zbf = p1;
        return this;
    }
}
