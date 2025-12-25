package com.google.android.gms.common.internal;
public abstract class GmsClient extends com.google.android.gms.common.internal.BaseGmsClient implements com.google.android.gms.common.api.Api$Client, com.google.android.gms.common.internal.zaj {
    private static volatile java.util.concurrent.Executor zaa;
    private final com.google.android.gms.common.internal.ClientSettings zab;
    private final java.util.Set zac;
    private final android.accounts.Account zad;

    public GmsClient(android.content.Context p9, android.os.Handler p10, int p11, com.google.android.gms.common.internal.ClientSettings p12)
    {
        com.google.android.gms.common.internal.GmsClient v0_0 = super(p9, p10, com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(p9), com.google.android.gms.common.GoogleApiAvailability.getInstance(), p11, 0, 0);
        v0_0.zab = ((com.google.android.gms.common.internal.ClientSettings) com.google.android.gms.common.internal.Preconditions.checkNotNull(p12));
        v0_0.zad = p12.getAccount();
        v0_0.zac = super.zaa(p12.getAllRequestedScopes());
        return;
    }

    public GmsClient(android.content.Context p10, android.os.Looper p11, int p12, com.google.android.gms.common.internal.ClientSettings p13)
    {
        this(p10, p11, com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(p10), com.google.android.gms.common.GoogleApiAvailability.getInstance(), p12, p13, 0, 0);
        return;
    }

    public GmsClient(android.content.Context p1, android.os.Looper p2, int p3, com.google.android.gms.common.internal.ClientSettings p4, com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks p5, com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener p6)
    {
        this(p1, p2, p3, p4, p5, p6);
        return;
    }

    public GmsClient(android.content.Context p10, android.os.Looper p11, int p12, com.google.android.gms.common.internal.ClientSettings p13, com.google.android.gms.common.api.internal.ConnectionCallbacks p14, com.google.android.gms.common.api.internal.OnConnectionFailedListener p15)
    {
        this(p10, p11, com.google.android.gms.common.internal.GmsClientSupervisor.getInstance(p10), com.google.android.gms.common.GoogleApiAvailability.getInstance(), p12, p13, ((com.google.android.gms.common.api.internal.ConnectionCallbacks) com.google.android.gms.common.internal.Preconditions.checkNotNull(p14)), ((com.google.android.gms.common.api.internal.OnConnectionFailedListener) com.google.android.gms.common.internal.Preconditions.checkNotNull(p15)));
        return;
    }

    public GmsClient(android.content.Context p10, android.os.Looper p11, com.google.android.gms.common.internal.GmsClientSupervisor p12, com.google.android.gms.common.GoogleApiAvailability p13, int p14, com.google.android.gms.common.internal.ClientSettings p15, com.google.android.gms.common.api.internal.ConnectionCallbacks p16, com.google.android.gms.common.api.internal.OnConnectionFailedListener p17)
    {
        com.google.android.gms.common.internal.zah v6;
        android.accounts.Account v2_0 = 0;
        if (p16 != null) {
            v6 = new com.google.android.gms.common.internal.zah(p16);
        } else {
            v6 = 0;
        }
        if (p17 != null) {
            v2_0 = new com.google.android.gms.common.internal.zai(p17);
        }
        super(p10, p11, p12, p13, p14, v6, v2_0, p15.zac());
        super.zab = p15;
        super.zad = p15.getAccount();
        super.zac = super.zaa(p15.getAllRequestedScopes());
        return;
    }

    private final java.util.Set zaa(java.util.Set p4)
    {
        String v0_0 = this.validateScopes(p4);
        java.util.Iterator v1 = v0_0.iterator();
        while (v1.hasNext()) {
            if (!p4.contains(((com.google.android.gms.common.api.Scope) v1.next()))) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return v0_0;
    }

    public final android.accounts.Account getAccount()
    {
        return this.zad;
    }

    public java.util.concurrent.Executor getBindServiceExecutor()
    {
        return 0;
    }

    public final com.google.android.gms.common.internal.ClientSettings getClientSettings()
    {
        return this.zab;
    }

    public com.google.android.gms.common.Feature[] getRequiredFeatures()
    {
        com.google.android.gms.common.Feature[] v0_1 = new com.google.android.gms.common.Feature[0];
        return v0_1;
    }

    public final java.util.Set getScopes()
    {
        return this.zac;
    }

    public java.util.Set getScopesForConnectionlessNonSignIn()
    {
        if (!this.requiresSignIn()) {
            return java.util.Collections.EMPTY_SET;
        } else {
            return this.zac;
        }
    }

    public java.util.Set validateScopes(java.util.Set p1)
    {
        return p1;
    }
}
