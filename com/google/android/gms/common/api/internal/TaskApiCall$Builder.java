package com.google.android.gms.common.api.internal;
public class TaskApiCall$Builder {
    private com.google.android.gms.common.api.internal.RemoteCall zaa;
    private boolean zab;
    private com.google.android.gms.common.Feature[] zac;
    private int zad;

    private TaskApiCall$Builder()
    {
        this.zab = 1;
        this.zad = 0;
        return;
    }

    public synthetic TaskApiCall$Builder(com.google.android.gms.common.api.internal.zacw p1)
    {
        this.zab = 1;
        this.zad = 0;
        return;
    }

    public static bridge synthetic com.google.android.gms.common.api.internal.RemoteCall zaa(com.google.android.gms.common.api.internal.TaskApiCall$Builder p0)
    {
        return p0.zaa;
    }

    public com.google.android.gms.common.api.internal.TaskApiCall build()
    {
        com.google.android.gms.common.api.internal.zacv v0_2;
        if (this.zaa == null) {
            v0_2 = 0;
        } else {
            v0_2 = 1;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(v0_2, "execute parameter required");
        return new com.google.android.gms.common.api.internal.zacv(this, this.zac, this.zab, this.zad);
    }

    public com.google.android.gms.common.api.internal.TaskApiCall$Builder execute(com.google.android.gms.common.util.BiConsumer p2)
    {
        this.zaa = new com.google.android.gms.common.api.internal.zacu(p2);
        return this;
    }

    public com.google.android.gms.common.api.internal.TaskApiCall$Builder run(com.google.android.gms.common.api.internal.RemoteCall p1)
    {
        this.zaa = p1;
        return this;
    }

    public com.google.android.gms.common.api.internal.TaskApiCall$Builder setAutoResolveMissingFeatures(boolean p1)
    {
        this.zab = p1;
        return this;
    }

    public varargs com.google.android.gms.common.api.internal.TaskApiCall$Builder setFeatures(com.google.android.gms.common.Feature[] p1)
    {
        this.zac = p1;
        return this;
    }

    public com.google.android.gms.common.api.internal.TaskApiCall$Builder setMethodKey(int p1)
    {
        this.zad = p1;
        return this;
    }
}
