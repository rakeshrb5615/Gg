package com.google.android.gms.common.api;
public final class BatchResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zaa;
    private final com.google.android.gms.common.api.PendingResult[] zab;

    public BatchResult(com.google.android.gms.common.api.Status p1, com.google.android.gms.common.api.PendingResult[] p2)
    {
        this.zaa = p1;
        this.zab = p2;
        return;
    }

    public com.google.android.gms.common.api.Status getStatus()
    {
        return this.zaa;
    }

    public com.google.android.gms.common.api.Result take(com.google.android.gms.common.api.BatchResultToken p4)
    {
        long v0_3;
        if (p4.mId >= this.zab.length) {
            v0_3 = 0;
        } else {
            v0_3 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_3, "The result token does not belong to this batch");
        return this.zab[p4.mId].await(0, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
