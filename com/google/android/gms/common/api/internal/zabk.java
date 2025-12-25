package com.google.android.gms.common.api.internal;
public final synthetic class zabk implements java.util.concurrent.Executor {
    public final synthetic android.os.Handler zaa;

    public synthetic zabk(android.os.Handler p1)
    {
        this.zaa = p1;
        return;
    }

    public final void execute(Runnable p2)
    {
        this.zaa.post(p2);
        return;
    }
}
