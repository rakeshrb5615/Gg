package com.google.android.gms.common.api.internal;
public abstract class PendingResultFacade extends com.google.android.gms.common.api.PendingResult {

    public final void addStatusListener(com.google.android.gms.common.api.PendingResult$StatusListener p1)
    {
        throw 0;
    }

    public final com.google.android.gms.common.api.Result await()
    {
        throw 0;
    }

    public final com.google.android.gms.common.api.Result await(long p1, java.util.concurrent.TimeUnit p3)
    {
        throw 0;
    }

    public final void cancel()
    {
        throw 0;
    }

    public final boolean isCanceled()
    {
        throw 0;
    }

    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback p1)
    {
        throw 0;
    }

    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback p1, long p2, java.util.concurrent.TimeUnit p4)
    {
        throw 0;
    }

    public final com.google.android.gms.common.api.TransformedResult then(com.google.android.gms.common.api.ResultTransform p1)
    {
        throw 0;
    }
}
