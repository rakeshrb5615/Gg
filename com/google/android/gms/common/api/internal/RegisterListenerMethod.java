package com.google.android.gms.common.api.internal;
public abstract class RegisterListenerMethod {
    private final com.google.android.gms.common.api.internal.ListenerHolder zaa;
    private final com.google.android.gms.common.Feature[] zab;
    private final boolean zac;
    private final int zad;

    public RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder p3)
    {
        this(p3, 0, 0, 0);
        return;
    }

    public RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder p2, com.google.android.gms.common.Feature[] p3, boolean p4)
    {
        this(p2, p3, p4, 0);
        return;
    }

    public RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder p1, com.google.android.gms.common.Feature[] p2, boolean p3, int p4)
    {
        this.zaa = p1;
        this.zab = p2;
        this.zac = p3;
        this.zad = p4;
        return;
    }

    public void clearListener()
    {
        this.zaa.clear();
        return;
    }

    public com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey getListenerKey()
    {
        return this.zaa.getListenerKey();
    }

    public com.google.android.gms.common.Feature[] getRequiredFeatures()
    {
        return this.zab;
    }

    public abstract void registerListener();

    public final int zaa()
    {
        return this.zad;
    }

    public final boolean zab()
    {
        return this.zac;
    }
}
