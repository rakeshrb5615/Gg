package com.google.android.gms.common.api;
public final class Batch$Builder {
    private final java.util.List zaa;
    private final com.google.android.gms.common.api.GoogleApiClient zab;

    public Batch$Builder(com.google.android.gms.common.api.GoogleApiClient p2)
    {
        this.zaa = new java.util.ArrayList();
        this.zab = p2;
        return;
    }

    public com.google.android.gms.common.api.BatchResultToken add(com.google.android.gms.common.api.PendingResult p3)
    {
        com.google.android.gms.common.api.BatchResultToken v0_1 = new com.google.android.gms.common.api.BatchResultToken(this.zaa.size());
        this.zaa.add(p3);
        return v0_1;
    }

    public com.google.android.gms.common.api.Batch build()
    {
        return new com.google.android.gms.common.api.Batch(this.zaa, this.zab, 0);
    }
}
