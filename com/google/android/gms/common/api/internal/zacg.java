package com.google.android.gms.common.api.internal;
public final synthetic class zacg implements java.lang.Runnable {
    public final synthetic com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient zaa;
    public final synthetic android.os.IBinder zab;

    public synthetic zacg(com.google.android.gms.common.api.internal.NonGmsServiceBrokerClient p1, android.os.IBinder p2)
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
