package com.google.android.gms.common.api.internal;
public final class zaf extends com.google.android.gms.common.api.internal.zad {
    public final com.google.android.gms.common.api.internal.zaci zab;

    public zaf(com.google.android.gms.common.api.internal.zaci p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        super(3, p3);
        super.zab = p2;
        return;
    }

    public final boolean zaa(com.google.android.gms.common.api.internal.zabq p1)
    {
        return this.zab.zaa.zab();
    }

    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq p1)
    {
        return this.zab.zaa.getRequiredFeatures();
    }

    public final void zac(com.google.android.gms.common.api.internal.zabq p4)
    {
        this.zab.zaa.registerListener(p4.zaf(), this.zaa);
        com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey v0_4 = this.zab.zaa.getListenerKey();
        if (v0_4 != null) {
            p4.zah().put(v0_4, this.zab);
        }
        return;
    }

    public final bridge synthetic void zag(com.google.android.gms.common.api.internal.zaad p1, boolean p2)
    {
        return;
    }
}
