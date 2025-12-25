package com.google.android.gms.common.api.internal;
final class zacv extends com.google.android.gms.common.api.internal.TaskApiCall {
    final synthetic com.google.android.gms.common.api.internal.TaskApiCall$Builder zaa;

    public zacv(com.google.android.gms.common.api.internal.TaskApiCall$Builder p1, com.google.android.gms.common.Feature[] p2, boolean p3, int p4)
    {
        this.zaa = p1;
        super(p2, p3, p4);
        return;
    }

    public final void doExecute(com.google.android.gms.common.api.Api$AnyClient p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        com.google.android.gms.common.api.internal.TaskApiCall$Builder.zaa(this.zaa).accept(p2, p3);
        return;
    }
}
