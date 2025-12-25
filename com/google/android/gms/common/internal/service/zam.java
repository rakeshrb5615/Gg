package com.google.android.gms.common.internal.service;
public final synthetic class zam implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.common.internal.TelemetryData zaa;

    public synthetic zam(com.google.android.gms.common.internal.TelemetryData p1)
    {
        this.zaa = p1;
        return;
    }

    public final void accept(Object p2, Object p3)
    {
        ((com.google.android.gms.common.internal.service.zai) ((com.google.android.gms.common.internal.service.zap) p2).getService()).zae(this.zaa);
        ((com.google.android.gms.tasks.TaskCompletionSource) p3).setResult(0);
        return;
    }
}
