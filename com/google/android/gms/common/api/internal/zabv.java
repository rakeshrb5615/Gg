package com.google.android.gms.common.api.internal;
public final class zabv extends com.google.android.gms.common.api.internal.zaag {
    private final com.google.android.gms.common.api.GoogleApi zaa;

    public zabv(com.google.android.gms.common.api.GoogleApi p2)
    {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        super.zaa = p2;
        return;
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl enqueue(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        return this.zaa.doRead(p2);
    }

    public final com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl execute(com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl p2)
    {
        return this.zaa.doWrite(p2);
    }

    public final android.content.Context getContext()
    {
        return this.zaa.getApplicationContext();
    }

    public final android.os.Looper getLooper()
    {
        return this.zaa.getLooper();
    }

    public final void zao(com.google.android.gms.common.api.internal.zada p1)
    {
        return;
    }

    public final void zap(com.google.android.gms.common.api.internal.zada p1)
    {
        return;
    }
}
