package com.google.android.gms.common.api;
public final class GoogleApiClient$Builder {
    private android.accounts.Account zaa;
    private final java.util.Set zab;
    private final java.util.Set zac;
    private int zad;
    private android.view.View zae;
    private String zaf;
    private String zag;
    private final java.util.Map zah;
    private final android.content.Context zai;
    private final java.util.Map zaj;
    private com.google.android.gms.common.api.internal.LifecycleActivity zak;
    private int zal;
    private com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener zam;
    private android.os.Looper zan;
    private com.google.android.gms.common.GoogleApiAvailability zao;
    private com.google.android.gms.common.api.Api$AbstractClientBuilder zap;
    private final java.util.ArrayList zaq;
    private final java.util.ArrayList zar;

    public GoogleApiClient$Builder(android.content.Context p3)
    {
        this.zab = new java.util.HashSet();
        this.zac = new java.util.HashSet();
        this.zah = new r.e(0);
        this.zaj = new r.e(0);
        this.zal = -1;
        this.zao = com.google.android.gms.common.GoogleApiAvailability.getInstance();
        this.zap = com.google.android.gms.signin.zad.zac;
        this.zaq = new java.util.ArrayList();
        this.zar = new java.util.ArrayList();
        this.zai = p3;
        this.zan = p3.getMainLooper();
        this.zaf = p3.getPackageName();
        this.zag = p3.getClass().getName();
        return;
    }

    public GoogleApiClient$Builder(android.content.Context p1, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p2, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p3)
    {
        this(p1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Must provide a connected listener");
        this.zaq.add(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Must provide a connection failed listener");
        this.zar.add(p3);
        return;
    }

    private final varargs void zab(com.google.android.gms.common.api.Api p4, com.google.android.gms.common.api.Api$ApiOptions p5, com.google.android.gms.common.api.Scope[] p6)
    {
        java.util.HashSet v1_2 = new java.util.HashSet(((com.google.android.gms.common.api.Api$BaseClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4.zac(), "Base client builder must not be null")).getImpliedScopes(p5));
        java.util.Map v5_1 = p6.length;
        int v0_1 = 0;
        while (v0_1 < v5_1) {
            v1_2.add(p6[v0_1]);
            v0_1++;
        }
        this.zah.put(p4, new com.google.android.gms.common.internal.zab(v1_2));
        return;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder addApi(com.google.android.gms.common.api.Api p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Api must not be null");
        this.zaj.put(p3, 0);
        java.util.List v3_2 = ((com.google.android.gms.common.api.Api$BaseClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(p3.zac(), "Base client builder must not be null")).getImpliedScopes(0);
        this.zac.addAll(v3_2);
        this.zab.addAll(v3_2);
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder addApi(com.google.android.gms.common.api.Api p2, com.google.android.gms.common.api.Api$ApiOptions$HasOptions p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Api must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Null options are not permitted for this Api");
        this.zaj.put(p2, p3);
        java.util.List v2_3 = ((com.google.android.gms.common.api.Api$BaseClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(p2.zac(), "Base client builder must not be null")).getImpliedScopes(p3);
        this.zac.addAll(v2_3);
        this.zab.addAll(v2_3);
        return this;
    }

    public varargs com.google.android.gms.common.api.GoogleApiClient$Builder addApiIfAvailable(com.google.android.gms.common.api.Api p2, com.google.android.gms.common.api.Api$ApiOptions$HasOptions p3, com.google.android.gms.common.api.Scope[] p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Api must not be null");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Null options are not permitted for this Api");
        this.zaj.put(p2, p3);
        this.zab(p2, p3, p4);
        return this;
    }

    public varargs com.google.android.gms.common.api.GoogleApiClient$Builder addApiIfAvailable(com.google.android.gms.common.api.Api p3, com.google.android.gms.common.api.Scope[] p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3, "Api must not be null");
        this.zaj.put(p3, 0);
        this.zab(p3, 0, p4);
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder addConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Listener must not be null");
        this.zaq.add(p2);
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder addOnConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Listener must not be null");
        this.zar.add(p2);
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder addScope(com.google.android.gms.common.api.Scope p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Scope must not be null");
        this.zab.add(p2);
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient build()
    {
        com.google.android.gms.common.api.GoogleApiClient$Builder v1 = this;
        com.google.android.gms.common.internal.Preconditions.checkArgument((this.zaj.isEmpty() ^ 1), "must call addApi() to add at least one API");
        android.os.Looper v7_1 = this.zaa();
        IllegalStateException v0_1 = v7_1.zad();
        String v3_0 = 0;
        r.e v11_1 = new r.e(0);
        r.e v14_1 = new r.e(0);
        java.util.ArrayList v12_1 = new java.util.ArrayList();
        java.util.ArrayList v13_0 = this.zaj.keySet().iterator();
        com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener v16_0 = 0;
        com.google.android.gms.common.api.internal.zabe v15_0 = 0;
        while (v13_0.hasNext()) {
            com.google.android.gms.common.api.Api$Client v5_1;
            String v4_14 = ((com.google.android.gms.common.api.Api) v13_0.next());
            com.google.android.gms.common.internal.ClientSettings v8_1 = this.zaj.get(v4_14);
            if (v0_1.get(v4_14) == null) {
                v5_1 = 0;
            } else {
                v5_1 = 1;
            }
            v11_1.put(v4_14, Boolean.valueOf(v5_1));
            com.google.android.gms.common.api.internal.zat v9_1 = new com.google.android.gms.common.api.internal.zat(v4_14, v5_1);
            v12_1.add(v9_1);
            String v4_0 = ((com.google.android.gms.common.api.Api$AbstractClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(v4_14.zaa()));
            com.google.android.gms.common.api.internal.zabe v17_0 = v4_14;
            com.google.android.gms.common.api.Api$Client v5_6 = v4_0.buildClient(v1.zai, v1.zan, v7_1, v8_1, v9_1, v9_1);
            v14_1.put(v17_0.zab(), v5_6);
            if (v4_0.getPriority() == 1) {
                if (v8_1 == null) {
                    v16_0 = 0;
                } else {
                    v16_0 = 1;
                }
            }
            if (v5_6.providesSignIn()) {
                if (v15_0 != null) {
                    throw new IllegalStateException(g2.g.e(v17_0.zad(), " cannot be used with ", v15_0.zad()));
                } else {
                    v15_0 = v17_0;
                }
            }
        }
        if (v15_0 != null) {
            if (v16_0 != null) {
                throw new IllegalStateException(v1.a.l("With using ", v15_0.zad(), ", GamesOptions can only be specified within GoogleSignInOptions.Builder"));
            } else {
                if (this.zaa == null) {
                    v3_0 = 1;
                }
                com.google.android.gms.common.internal.Preconditions.checkState(v3_0, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[] {v15_0.zad()}));
                com.google.android.gms.common.internal.Preconditions.checkState(v1.zab.equals(v1.zac), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[] {v15_0.zad()}));
            }
        }
        String v4_12 = new com.google.android.gms.common.api.internal.zabe(this.zai, new java.util.concurrent.locks.ReentrantLock(), this.zan, v7_1, this.zao, this.zap, v11_1, this.zaq, this.zar, v14_1, this.zal, com.google.android.gms.common.api.internal.zabe.zad(v14_1.values(), 1), v12_1);
        com.google.android.gms.common.api.GoogleApiClient.zaq();
        com.google.android.gms.common.api.GoogleApiClient.zaq().add(v4_12);
        if (this.zal >= 0) {
            com.google.android.gms.common.api.internal.zak.zaa(this.zak).zad(this.zal, v4_12, this.zam);
        }
        return v4_12;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder enableAutoManage(androidx.fragment.app.j0 p3, int p4, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p5)
    {
        int v3_1;
        com.google.android.gms.common.api.internal.LifecycleActivity v0_1 = new com.google.android.gms.common.api.internal.LifecycleActivity(p3);
        if (p4 < 0) {
            v3_1 = 0;
        } else {
            v3_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v3_1, "clientId must be non-negative");
        this.zal = p4;
        this.zam = p5;
        this.zak = v0_1;
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder enableAutoManage(androidx.fragment.app.j0 p2, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p3)
    {
        this.enableAutoManage(p2, 0, p3);
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder setAccountName(String p3)
    {
        android.accounts.Account v3_1;
        if (p3 != null) {
            v3_1 = new android.accounts.Account(p3, "com.google");
        } else {
            v3_1 = 0;
        }
        this.zaa = v3_1;
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder setGravityForPopups(int p1)
    {
        this.zad = p1;
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder setHandler(android.os.Handler p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Handler must not be null");
        this.zan = p2.getLooper();
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder setViewForPopups(android.view.View p2)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "View must not be null");
        this.zae = p2;
        return this;
    }

    public com.google.android.gms.common.api.GoogleApiClient$Builder useDefaultAccount()
    {
        this.setAccountName("<<default account>>");
        return this;
    }

    public final com.google.android.gms.common.internal.ClientSettings zaa()
    {
        com.google.android.gms.signin.SignInOptions v0_0 = com.google.android.gms.signin.SignInOptions.zaa;
        android.accounts.Account v2_1 = com.google.android.gms.signin.zad.zag;
        if (this.zaj.containsKey(v2_1)) {
            v0_0 = ((com.google.android.gms.signin.SignInOptions) this.zaj.get(v2_1));
        }
        return new com.google.android.gms.common.internal.ClientSettings(this.zaa, this.zab, this.zah, this.zad, this.zae, this.zaf, this.zag, v0_0, 0);
    }
}
