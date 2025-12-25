package com.google.android.gms.common.api.internal;
public class StatusCallback extends com.google.android.gms.common.api.internal.IStatusCallback$Stub {
    private final com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder resultHolder;

    public StatusCallback(com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder p1)
    {
        this.resultHolder = p1;
        return;
    }

    public void onResult(com.google.android.gms.common.api.Status p2)
    {
        this.resultHolder.setResult(p2);
        return;
    }
}
