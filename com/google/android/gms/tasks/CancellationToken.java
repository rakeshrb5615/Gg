package com.google.android.gms.tasks;
public abstract class CancellationToken {

    public CancellationToken()
    {
        return;
    }

    public abstract boolean isCancellationRequested();

    public abstract com.google.android.gms.tasks.CancellationToken onCanceledRequested();
}
