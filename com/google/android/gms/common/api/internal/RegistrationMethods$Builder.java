package com.google.android.gms.common.api.internal;
public class RegistrationMethods$Builder {
    private com.google.android.gms.common.api.internal.RemoteCall zaa;
    private com.google.android.gms.common.api.internal.RemoteCall zab;
    private Runnable zac;
    private com.google.android.gms.common.api.internal.ListenerHolder zad;
    private com.google.android.gms.common.Feature[] zae;
    private boolean zaf;
    private int zag;

    private RegistrationMethods$Builder()
    {
        this.zac = com.google.android.gms.common.api.internal.zacj.zaa;
        this.zaf = 1;
        return;
    }

    public synthetic RegistrationMethods$Builder(com.google.android.gms.common.api.internal.zacm p1)
    {
        this.zac = com.google.android.gms.common.api.internal.zacj.zaa;
        this.zaf = 1;
        return;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.RemoteCall zaa(com.google.android.gms.common.api.internal.RegistrationMethods$Builder p0)
    {
        return p0.zaa;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.RemoteCall zab(com.google.android.gms.common.api.internal.RegistrationMethods$Builder p0)
    {
        return p0.zab;
    }

    public com.google.android.gms.common.api.internal.RegistrationMethods build()
    {
        Runnable v0_9;
        com.google.android.gms.common.api.internal.RegistrationMethods v1_0 = 0;
        if (this.zaa == null) {
            v0_9 = 0;
        } else {
            v0_9 = 1;
        }
        Runnable v0_1;
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_9, "Must set register function");
        if (this.zab == null) {
            v0_1 = 0;
        } else {
            v0_1 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_1, "Must set unregister function");
        if (this.zad != null) {
            v1_0 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v1_0, "Must set holder");
        return new com.google.android.gms.common.api.internal.RegistrationMethods(new com.google.android.gms.common.api.internal.zack(this, this.zad, this.zae, this.zaf, this.zag), new com.google.android.gms.common.api.internal.zacl(this, ((com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad.getListenerKey(), "Key must not be null"))), this.zac, 0);
    }

    public com.google.android.gms.common.api.internal.RegistrationMethods$Builder onConnectionSuspended(Runnable p1)
    {
        this.zac = p1;
        return this;
    }

    public com.google.android.gms.common.api.internal.RegistrationMethods$Builder register(com.google.android.gms.common.api.internal.RemoteCall p1)
    {
        this.zaa = p1;
        return this;
    }

    public com.google.android.gms.common.api.internal.RegistrationMethods$Builder setAutoResolveMissingFeatures(boolean p1)
    {
        this.zaf = p1;
        return this;
    }

    public varargs com.google.android.gms.common.api.internal.RegistrationMethods$Builder setFeatures(com.google.android.gms.common.Feature[] p1)
    {
        this.zae = p1;
        return this;
    }

    public com.google.android.gms.common.api.internal.RegistrationMethods$Builder setMethodKey(int p1)
    {
        this.zag = p1;
        return this;
    }

    public com.google.android.gms.common.api.internal.RegistrationMethods$Builder unregister(com.google.android.gms.common.api.internal.RemoteCall p1)
    {
        this.zab = p1;
        return this;
    }

    public com.google.android.gms.common.api.internal.RegistrationMethods$Builder withHolder(com.google.android.gms.common.api.internal.ListenerHolder p1)
    {
        this.zad = p1;
        return this;
    }
}
