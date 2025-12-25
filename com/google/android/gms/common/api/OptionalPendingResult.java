package com.google.android.gms.common.api;
public abstract class OptionalPendingResult extends com.google.android.gms.common.api.PendingResult {

    public OptionalPendingResult()
    {
        return;
    }

    public abstract com.google.android.gms.common.api.Result get();

    public abstract boolean isDone();
}
