package com.google.android.gms.common.api.internal;
public final synthetic class zacb implements java.lang.Runnable {
    public final synthetic com.google.android.gms.common.api.internal.ListenerHolder zaa;
    public final synthetic com.google.android.gms.common.api.internal.ListenerHolder$Notifier zab;

    public synthetic zacb(com.google.android.gms.common.api.internal.ListenerHolder p1, com.google.android.gms.common.api.internal.ListenerHolder$Notifier p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public final void run()
    {
        this.zaa.zaa(this.zab);
        return;
    }
}
