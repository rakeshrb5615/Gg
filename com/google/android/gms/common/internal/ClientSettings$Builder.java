package com.google.android.gms.common.internal;
public final class ClientSettings$Builder {
    private android.accounts.Account zaa;
    private r.f zab;
    private String zac;
    private String zad;
    private final com.google.android.gms.signin.SignInOptions zae;

    public ClientSettings$Builder()
    {
        this.zae = com.google.android.gms.signin.SignInOptions.zaa;
        return;
    }

    public com.google.android.gms.common.internal.ClientSettings build()
    {
        return new com.google.android.gms.common.internal.ClientSettings(this.zaa, this.zab, 0, 0, 0, this.zac, this.zad, this.zae, 0);
    }

    public com.google.android.gms.common.internal.ClientSettings$Builder setRealClientPackageName(String p1)
    {
        this.zac = p1;
        return this;
    }

    public final com.google.android.gms.common.internal.ClientSettings$Builder zaa(java.util.Collection p3)
    {
        if (this.zab == null) {
            this.zab = new r.f(0);
        }
        this.zab.addAll(p3);
        return this;
    }

    public final com.google.android.gms.common.internal.ClientSettings$Builder zab(android.accounts.Account p1)
    {
        this.zaa = p1;
        return this;
    }

    public final com.google.android.gms.common.internal.ClientSettings$Builder zac(String p1)
    {
        this.zad = p1;
        return this;
    }
}
