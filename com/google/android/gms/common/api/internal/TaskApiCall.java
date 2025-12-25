package com.google.android.gms.common.api.internal;
public abstract class TaskApiCall {
    private final com.google.android.gms.common.Feature[] zaa;
    private final boolean zab;
    private final int zac;

    public TaskApiCall()
    {
        this.zaa = 0;
        this.zab = 0;
        this.zac = 0;
        return;
    }

    public TaskApiCall(com.google.android.gms.common.Feature[] p2, boolean p3, int p4)
    {
        this.zaa = p2;
        int v0 = 0;
        if ((p2 != null) && (p3)) {
            v0 = 1;
        }
        this.zab = v0;
        this.zac = p4;
        return;
    }

    public static com.google.android.gms.common.api.internal.TaskApiCall$Builder builder()
    {
        return new com.google.android.gms.common.api.internal.TaskApiCall$Builder(0);
    }

    public abstract void doExecute();

    public boolean shouldAutoResolveMissingFeatures()
    {
        return this.zab;
    }

    public final int zaa()
    {
        return this.zac;
    }

    public final com.google.android.gms.common.Feature[] zab()
    {
        return this.zaa;
    }
}
