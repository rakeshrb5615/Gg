package com.google.android.gms.common.api;
public abstract class TransformedResult {

    public TransformedResult()
    {
        return;
    }

    public abstract void andFinally();

    public abstract com.google.android.gms.common.api.TransformedResult then();
}
