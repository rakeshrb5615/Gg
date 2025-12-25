package com.google.android.gms.common.api.internal;
public final synthetic class zacu implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.common.util.BiConsumer zaa;

    public synthetic zacu(com.google.android.gms.common.util.BiConsumer p1)
    {
        this.zaa = p1;
        return;
    }

    public final void accept(Object p2, Object p3)
    {
        this.zaa.accept(((com.google.android.gms.common.api.Api$AnyClient) p2), ((com.google.android.gms.tasks.TaskCompletionSource) p3));
        return;
    }
}
