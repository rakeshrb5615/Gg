package com.google.android.gms.common.api;
public abstract class GoogleApi implements com.google.android.gms.common.api.HasApiKey {
    protected final com.google.android.gms.common.api.internal.GoogleApiManager zaa;
    private final android.content.Context zab;
    private final String zac;
    private final com.google.android.gms.common.api.Api zad;
    private final com.google.android.gms.common.api.Api$ApiOptions zae;
    private final com.google.android.gms.common.api.internal.ApiKey zaf;
    private final android.os.Looper zag;
    private final int zah;
    private final com.google.android.gms.common.api.GoogleApiClient zai;
    private final com.google.android.gms.common.api.internal.StatusExceptionMapper zaj;

    public GoogleApi(android.app.Activity p7, com.google.android.gms.common.api.Api p8, com.google.android.gms.common.api.Api$ApiOptions p9, com.google.android.gms.common.api.GoogleApi$Settings p10)
    {
        this(p7, p7, p8, p9, p10);
        return;
    }

    public GoogleApi(android.app.Activity p2, com.google.android.gms.common.api.Api p3, com.google.android.gms.common.api.Api$ApiOptions p4, com.google.android.gms.common.api.internal.StatusExceptionMapper p5)
    {
        com.google.android.gms.common.api.GoogleApi$Settings$Builder v0_1 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder();
        v0_1.setMapper(p5);
        v0_1.setLooper(p2.getMainLooper());
        this(p2, p3, p4, v0_1.build());
        return;
    }

    private GoogleApi(android.content.Context p4, android.app.Activity p5, com.google.android.gms.common.api.Api p6, com.google.android.gms.common.api.Api$ApiOptions p7, com.google.android.gms.common.api.GoogleApi$Settings p8)
    {
        com.google.android.gms.common.api.internal.ApiKey v4_1;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4, "Null context is not permitted.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p6, "Api must not be null.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p8, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        android.content.Context v0_2 = ((android.content.Context) com.google.android.gms.common.internal.Preconditions.checkNotNull(p4.getApplicationContext(), "The provided context did not have an application context."));
        this.zab = v0_2;
        if (android.os.Build$VERSION.SDK_INT < 30) {
            v4_1 = this.getApiFallbackAttributionTag(p4);
        } else {
            v4_1 = p4.getAttributionTag();
        }
        this.zac = v4_1;
        this.zad = p6;
        this.zae = p7;
        this.zag = p8.zab;
        com.google.android.gms.common.api.internal.ApiKey v4_2 = com.google.android.gms.common.api.internal.ApiKey.getSharedApiKey(p6, p7, v4_1);
        this.zaf = v4_2;
        this.zai = new com.google.android.gms.common.api.internal.zabv(this);
        com.google.android.gms.common.api.internal.GoogleApiManager v6_3 = com.google.android.gms.common.api.internal.GoogleApiManager.zak(v0_2);
        this.zaa = v6_3;
        this.zah = v6_3.zaa();
        this.zaj = p8.zaa;
        if ((p5 != null) && ((!(p5 instanceof com.google.android.gms.common.api.GoogleApiActivity)) && (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()))) {
            com.google.android.gms.common.api.internal.zaae.zad(p5, v6_3, v4_2);
        }
        v6_3.zaz(this);
        return;
    }

    public GoogleApi(android.content.Context p2, com.google.android.gms.common.api.Api p3, com.google.android.gms.common.api.Api$ApiOptions p4, android.os.Looper p5, com.google.android.gms.common.api.internal.StatusExceptionMapper p6)
    {
        com.google.android.gms.common.api.GoogleApi$Settings$Builder v0_1 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder();
        v0_1.setLooper(p5);
        v0_1.setMapper(p6);
        this(p2, p3, p4, v0_1.build());
        return;
    }

    public GoogleApi(android.content.Context p7, com.google.android.gms.common.api.Api p8, com.google.android.gms.common.api.Api$ApiOptions p9, com.google.android.gms.common.api.GoogleApi$Settings p10)
    {
        this(p7, 0, p8, p9, p10);
        return;
    }

    public GoogleApi(android.content.Context p2, com.google.android.gms.common.api.Api p3, com.google.android.gms.common.api.Api$ApiOptions p4, com.google.android.gms.common.api.internal.StatusExceptionMapper p5)
    {
        com.google.android.gms.common.api.GoogleApi$Settings$Builder v0_1 = new com.google.android.gms.common.api.GoogleApi$Settings$Builder();
        v0_1.setMapper(p5);
        this(p2, p3, p4, v0_1.build());
        return;
    }

    private final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl zad(int p2, com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p3)
    {
        p3.zak();
        this.zaa.zau(this, p2, p3);
        return p3;
    }

    private final com.google.android.gms.tasks.Task zae(int p7, com.google.android.gms.common.api.internal.TaskApiCall p8)
    {
        com.google.android.gms.tasks.TaskCompletionSource v4_1 = new com.google.android.gms.tasks.TaskCompletionSource();
        this.zaa.zav(this, p7, p8, v4_1, this.zaj);
        return v4_1.getTask();
    }

    public com.google.android.gms.common.api.GoogleApiClient asGoogleApiClient()
    {
        return this.zai;
    }

    public com.google.android.gms.common.internal.ClientSettings$Builder createClientSettingsBuilder()
    {
        String v1_0;
        com.google.android.gms.common.internal.ClientSettings$Builder v0_1 = new com.google.android.gms.common.internal.ClientSettings$Builder();
        String v1_3 = this.zae;
        if (!(v1_3 instanceof com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions)) {
            String v1_14 = this.zae;
            if (!(v1_14 instanceof com.google.android.gms.common.api.Api$ApiOptions$HasAccountOptions)) {
                v1_0 = 0;
            } else {
                v1_0 = ((com.google.android.gms.common.api.Api$ApiOptions$HasAccountOptions) v1_14).getAccount();
            }
        } else {
            String v1_13 = ((com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions) v1_3).getGoogleSignInAccount();
            if (v1_13 == null) {
            } else {
                v1_0 = v1_13.getAccount();
            }
        }
        String v1_4;
        v0_1.zab(v1_0);
        String v1_2 = this.zae;
        if (!(v1_2 instanceof com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions)) {
            v1_4 = java.util.Collections.EMPTY_SET;
        } else {
            String v1_6 = ((com.google.android.gms.common.api.Api$ApiOptions$HasGoogleSignInAccountOptions) v1_2).getGoogleSignInAccount();
            if (v1_6 != null) {
                v1_4 = v1_6.getRequestedScopes();
            } else {
                v1_4 = java.util.Collections.EMPTY_SET;
            }
        }
        v0_1.zaa(v1_4);
        v0_1.zac(this.zab.getClass().getName());
        v0_1.setRealClientPackageName(this.zab.getPackageName());
        return v0_1;
    }

    public com.google.android.gms.tasks.Task disconnectService()
    {
        return this.zaa.zan(this);
    }

    public com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl doBestEffortWrite(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        this.zad(2, p2);
        return p2;
    }

    public com.google.android.gms.tasks.Task doBestEffortWrite(com.google.android.gms.common.api.internal.TaskApiCall p2)
    {
        return this.zae(2, p2);
    }

    public com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl doRead(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        this.zad(0, p2);
        return p2;
    }

    public com.google.android.gms.tasks.Task doRead(com.google.android.gms.common.api.internal.TaskApiCall p2)
    {
        return this.zae(0, p2);
    }

    public com.google.android.gms.tasks.Task doRegisterEventListener(com.google.android.gms.common.api.internal.RegisterListenerMethod p3, com.google.android.gms.common.api.internal.UnregisterListenerMethod p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(com.google.android.gms.common.internal.Objects.equal(p3.getListenerKey(), p4.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.zao(this, p3, p4, com.google.android.gms.common.api.zad.zaa);
    }

    public com.google.android.gms.tasks.Task doRegisterEventListener(com.google.android.gms.common.api.internal.RegistrationMethods p4)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4.register.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p4.zaa.getListenerKey(), "Listener has already been released.");
        return this.zaa.zao(this, p4.register, p4.zaa, p4.zab);
    }

    public com.google.android.gms.tasks.Task doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey p2)
    {
        return this.doUnregisterEventListener(p2, 0);
    }

    public com.google.android.gms.tasks.Task doUnregisterEventListener(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey p2, int p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2, "Listener key cannot be null.");
        return this.zaa.zap(this, p2, p3);
    }

    public com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl doWrite(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        this.zad(1, p2);
        return p2;
    }

    public com.google.android.gms.tasks.Task doWrite(com.google.android.gms.common.api.internal.TaskApiCall p2)
    {
        return this.zae(1, p2);
    }

    public String getApiFallbackAttributionTag(android.content.Context p1)
    {
        return 0;
    }

    public final com.google.android.gms.common.api.internal.ApiKey getApiKey()
    {
        return this.zaf;
    }

    public com.google.android.gms.common.api.Api$ApiOptions getApiOptions()
    {
        return this.zae;
    }

    public android.content.Context getApplicationContext()
    {
        return this.zab;
    }

    public String getContextAttributionTag()
    {
        return this.zac;
    }

    public String getContextFeatureId()
    {
        return this.zac;
    }

    public android.os.Looper getLooper()
    {
        return this.zag;
    }

    public com.google.android.gms.common.api.internal.ListenerHolder registerListener(Object p2, String p3)
    {
        return com.google.android.gms.common.api.internal.ListenerHolders.createListenerHolder(p2, this.zag, p3);
    }

    public final int zaa()
    {
        return this.zah;
    }

    public final com.google.android.gms.common.api.Api$Client zab(android.os.Looper p9, com.google.android.gms.common.api.internal.zabq p10)
    {
        com.google.android.gms.common.api.Api$Client v9_1 = ((com.google.android.gms.common.api.Api$AbstractClientBuilder) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad.zaa())).buildClient(this.zab, p9, this.createClientSettingsBuilder().build(), this.zae, p10, p10);
        String v10_1 = this.getContextAttributionTag();
        if ((v10_1 != null) && ((v9_1 instanceof com.google.android.gms.common.internal.BaseGmsClient))) {
            ((com.google.android.gms.common.internal.BaseGmsClient) v9_1).setAttributionTag(v10_1);
        }
        if ((v10_1 != null) && ((v9_1 instanceof com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient))) {
            ((com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient) v9_1).zac(v10_1);
        }
        return v9_1;
    }

    public final com.google.android.gms.common.api.internal.zact zac(android.content.Context p3, android.os.Handler p4)
    {
        return new com.google.android.gms.common.api.internal.zact(p3, p4, this.createClientSettingsBuilder().build());
    }
}
