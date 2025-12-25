package com.google.android.gms.common.api.internal;
public abstract class DataHolderResult implements com.google.android.gms.common.api.Result, com.google.android.gms.common.api.Releasable {
    protected final com.google.android.gms.common.data.DataHolder mDataHolder;
    protected final com.google.android.gms.common.api.Status mStatus;

    public DataHolderResult(com.google.android.gms.common.data.DataHolder p3)
    {
        this(p3, new com.google.android.gms.common.api.Status(p3.getStatusCode()));
        return;
    }

    public DataHolderResult(com.google.android.gms.common.data.DataHolder p1, com.google.android.gms.common.api.Status p2)
    {
        this.mStatus = p2;
        this.mDataHolder = p1;
        return;
    }

    public com.google.android.gms.common.api.Status getStatus()
    {
        return this.mStatus;
    }

    public void release()
    {
        com.google.android.gms.common.data.DataHolder v0 = this.mDataHolder;
        if (v0 != null) {
            v0.close();
        }
        return;
    }
}
