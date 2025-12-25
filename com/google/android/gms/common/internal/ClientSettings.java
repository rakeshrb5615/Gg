package com.google.android.gms.common.internal;
public final class ClientSettings {
    private final android.accounts.Account zaa;
    private final java.util.Set zab;
    private final java.util.Set zac;
    private final java.util.Map zad;
    private final int zae;
    private final android.view.View zaf;
    private final String zag;
    private final String zah;
    private final com.google.android.gms.signin.SignInOptions zai;
    private Integer zaj;

    public ClientSettings(android.accounts.Account p11, java.util.Set p12, java.util.Map p13, int p14, android.view.View p15, String p16, String p17, com.google.android.gms.signin.SignInOptions p18)
    {
        this(p11, p12, p13, p14, p15, p16, p17, p18, 0);
        return;
    }

    public ClientSettings(android.accounts.Account p1, java.util.Set p2, java.util.Map p3, int p4, android.view.View p5, String p6, String p7, com.google.android.gms.signin.SignInOptions p8, boolean p9)
    {
        java.util.Set v1_4;
        this.zaa = p1;
        if (p2 != null) {
            v1_4 = java.util.Collections.unmodifiableSet(p2);
        } else {
            v1_4 = java.util.Collections.EMPTY_SET;
        }
        this.zab = v1_4;
        if (p3 == null) {
            p3 = java.util.Collections.EMPTY_MAP;
        }
        this.zad = p3;
        this.zaf = p5;
        this.zae = p4;
        this.zag = p6;
        this.zah = p7;
        if (p8 == null) {
            p8 = com.google.android.gms.signin.SignInOptions.zaa;
        }
        this.zai = p8;
        java.util.HashSet v2_2 = new java.util.HashSet(v1_4);
        java.util.Set v1_2 = p3.values().iterator();
        while (v1_2.hasNext()) {
            v2_2.addAll(((com.google.android.gms.common.internal.zab) v1_2.next()).zaa);
        }
        this.zac = java.util.Collections.unmodifiableSet(v2_2);
        return;
    }

    public static com.google.android.gms.common.internal.ClientSettings createDefault(android.content.Context p1)
    {
        return new com.google.android.gms.common.api.GoogleApiClient$Builder(p1).zaa();
    }

    public android.accounts.Account getAccount()
    {
        return this.zaa;
    }

    public String getAccountName()
    {
        int v0_0 = this.zaa;
        if (v0_0 == 0) {
            return 0;
        } else {
            return v0_0.name;
        }
    }

    public android.accounts.Account getAccountOrDefault()
    {
        android.accounts.Account v0_0 = this.zaa;
        if (v0_0 == null) {
            return new android.accounts.Account("<<default account>>", "com.google");
        } else {
            return v0_0;
        }
    }

    public java.util.Set getAllRequestedScopes()
    {
        return this.zac;
    }

    public java.util.Set getApplicableScopes(com.google.android.gms.common.api.Api p3)
    {
        java.util.Set v3_4 = ((com.google.android.gms.common.internal.zab) this.zad.get(p3));
        if ((v3_4 != null) && (!v3_4.zaa.isEmpty())) {
            java.util.HashSet v1_1 = new java.util.HashSet(this.zab);
            v1_1.addAll(v3_4.zaa);
            return v1_1;
        } else {
            return this.zab;
        }
    }

    public int getGravityForPopups()
    {
        return this.zae;
    }

    public String getRealClientPackageName()
    {
        return this.zag;
    }

    public java.util.Set getRequiredScopes()
    {
        return this.zab;
    }

    public android.view.View getViewForPopups()
    {
        return this.zaf;
    }

    public final com.google.android.gms.signin.SignInOptions zaa()
    {
        return this.zai;
    }

    public final Integer zab()
    {
        return this.zaj;
    }

    public final String zac()
    {
        return this.zah;
    }

    public final java.util.Map zad()
    {
        return this.zad;
    }

    public final void zae(Integer p1)
    {
        this.zaj = p1;
        return;
    }
}
