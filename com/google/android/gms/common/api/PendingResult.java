package com.google.android.gms.common.api;
public abstract class PendingResult {

    public PendingResult()
    {
        return;
    }

    public void addStatusListener(com.google.android.gms.common.api.PendingResult$StatusListener p1)
    {
        throw new UnsupportedOperationException();
    }

    public abstract com.google.android.gms.common.api.Result await();

    public abstract com.google.android.gms.common.api.Result await();

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback();

    public abstract void setResultCallback();

    public com.google.android.gms.common.api.TransformedResult then(com.google.android.gms.common.api.ResultTransform p1)
    {
        throw new UnsupportedOperationException();
    }
}
