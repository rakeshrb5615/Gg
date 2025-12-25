package com.google.android.gms.common.api.internal;
public final class OptionalPendingResultImpl extends com.google.android.gms.common.api.OptionalPendingResult {
    private final com.google.android.gms.common.api.internal.BasePendingResult zaa;

    public OptionalPendingResultImpl(com.google.android.gms.common.api.PendingResult p1)
    {
        this.zaa = ((com.google.android.gms.common.api.internal.BasePendingResult) p1);
        return;
    }

    public final void addStatusListener(com.google.android.gms.common.api.PendingResult$StatusListener p2)
    {
        this.zaa.addStatusListener(p2);
        return;
    }

    public final com.google.android.gms.common.api.Result await()
    {
        return this.zaa.await();
    }

    public final com.google.android.gms.common.api.Result await(long p2, java.util.concurrent.TimeUnit p4)
    {
        return this.zaa.await(p2, p4);
    }

    public final void cancel()
    {
        this.zaa.cancel();
        return;
    }

    public final com.google.android.gms.common.api.Result get()
    {
        if (!this.zaa.isReady()) {
            throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
        } else {
            return this.zaa.await(0, java.util.concurrent.TimeUnit.MILLISECONDS);
        }
    }

    public final boolean isCanceled()
    {
        return this.zaa.isCanceled();
    }

    public final boolean isDone()
    {
        return this.zaa.isReady();
    }

    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback p2)
    {
        this.zaa.setResultCallback(p2);
        return;
    }

    public final void setResultCallback(com.google.android.gms.common.api.ResultCallback p2, long p3, java.util.concurrent.TimeUnit p5)
    {
        this.zaa.setResultCallback(p2, p3, p5);
        return;
    }

    public final com.google.android.gms.common.api.TransformedResult then(com.google.android.gms.common.api.ResultTransform p2)
    {
        return this.zaa.then(p2);
    }
}
