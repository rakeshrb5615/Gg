package com.google.android.gms.common.api;
public abstract class ResultTransform {

    public ResultTransform()
    {
        return;
    }

    public final com.google.android.gms.common.api.PendingResult createFailedResult(com.google.android.gms.common.api.Status p2)
    {
        return new com.google.android.gms.common.api.internal.zacp(p2);
    }

    public com.google.android.gms.common.api.Status onFailure(com.google.android.gms.common.api.Status p1)
    {
        return p1;
    }

    public abstract com.google.android.gms.common.api.PendingResult onSuccess();
}
