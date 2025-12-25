package com.google.android.gms.auth.api.signin;
public final class GoogleSignInOptions$Builder {
    private java.util.Set zaa;
    private boolean zab;
    private boolean zac;
    private boolean zad;
    private String zae;
    private android.accounts.Account zaf;
    private String zag;
    private java.util.Map zah;
    private String zai;

    public GoogleSignInOptions$Builder()
    {
        this.zaa = new java.util.HashSet();
        this.zah = new java.util.HashMap();
        return;
    }

    public GoogleSignInOptions$Builder(com.google.android.gms.auth.api.signin.GoogleSignInOptions p3)
    {
        this.zaa = new java.util.HashSet();
        this.zah = new java.util.HashMap();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        this.zaa = new java.util.HashSet(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zah(p3));
        this.zab = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zal(p3);
        this.zac = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaj(p3);
        this.zad = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zak(p3);
        this.zae = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zae(p3);
        this.zaf = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaa(p3);
        this.zag = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zac(p3);
        this.zah = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zai(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zag(p3));
        this.zai = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zad(p3);
        return;
    }

    private final String zaa(String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3);
        String v0_0 = this.zae;
        int v1 = 1;
        if ((v0_0 != null) && (!v0_0.equals(p3))) {
            v1 = 0;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1, "two different server client ids provided");
        return p3;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder addExtension(com.google.android.gms.auth.api.signin.GoogleSignInOptionsExtension p4)
    {
        if (this.zah.containsKey(Integer.valueOf(p4.getExtensionType()))) {
            throw new IllegalStateException("Only one extension per type may be added");
        } else {
            java.util.Map v0_1 = p4.getImpliedScopes();
            if (v0_1 != null) {
                this.zaa.addAll(v0_1);
            }
            this.zah.put(Integer.valueOf(p4.getExtensionType()), new com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable(p4));
            return this;
        }
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions build()
    {
        if (this.zaa.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zae)) {
            com.google.android.gms.auth.api.signin.GoogleSignInOptions v1_3 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.zad;
            if (this.zaa.contains(v1_3)) {
                this.zaa.remove(v1_3);
            }
        }
        if ((this.zad) && ((this.zaf == null) || (!this.zaa.isEmpty()))) {
            this.requestId();
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(this.zaa), this.zaf, this.zad, this.zab, this.zac, this.zae, this.zag, this.zah, this.zai, 0);
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder requestEmail()
    {
        this.zaa.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zab);
        return this;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder requestId()
    {
        this.zaa.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zac);
        return this;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder requestIdToken(String p2)
    {
        this.zad = 1;
        this.zaa(p2);
        this.zae = p2;
        return this;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder requestProfile()
    {
        this.zaa.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.zaa);
        return this;
    }

    public varargs com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder requestScopes(com.google.android.gms.common.api.Scope p2, com.google.android.gms.common.api.Scope[] p3)
    {
        this.zaa.add(p2);
        this.zaa.addAll(java.util.Arrays.asList(p3));
        return this;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder requestServerAuthCode(String p2)
    {
        this.requestServerAuthCode(p2, 0);
        return this;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder requestServerAuthCode(String p2, boolean p3)
    {
        this.zab = 1;
        this.zaa(p2);
        this.zae = p2;
        this.zac = p3;
        return this;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder setAccountName(String p3)
    {
        this.zaf = new android.accounts.Account(com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p3), "com.google");
        return this;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder setHostedDomain(String p1)
    {
        this.zag = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(p1);
        return this;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder setLogSessionId(String p1)
    {
        this.zai = p1;
        return this;
    }
}
