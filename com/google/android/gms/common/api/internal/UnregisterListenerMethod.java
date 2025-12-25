package com.google.android.gms.common.api.internal;
public abstract class UnregisterListenerMethod {
    private final com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey zaa;

    public UnregisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey p1)
    {
        this.zaa = p1;
        return;
    }

    public com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey getListenerKey()
    {
        return this.zaa;
    }

    public abstract void unregisterListener();
}
