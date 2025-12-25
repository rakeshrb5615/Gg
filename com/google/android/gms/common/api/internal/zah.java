package com.google.android.gms.common.api.internal;
public final class zah extends com.google.android.gms.common.api.internal.zad {
    public final com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey zab;

    public zah(com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey p2, com.google.android.gms.tasks.TaskCompletionSource p3)
    {
        super(4, p3);
        super.zab = p2;
        return;
    }

    public final boolean zaa(com.google.android.gms.common.api.internal.zabq p2)
    {
        int v2_5 = ((com.google.android.gms.common.api.internal.zaci) p2.zah().get(this.zab));
        if ((v2_5 == 0) || (!v2_5.zaa.zab())) {
            return 0;
        } else {
            return 1;
        }
    }

    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq p2)
    {
        com.google.android.gms.common.Feature[] v2_4 = ((com.google.android.gms.common.api.internal.zaci) p2.zah().get(this.zab));
        if (v2_4 != null) {
            return v2_4.zaa.getRequiredFeatures();
        } else {
            return 0;
        }
    }

    public final void zac(com.google.android.gms.common.api.internal.zabq p4)
    {
        Boolean v0_2 = ((com.google.android.gms.common.api.internal.zaci) p4.zah().remove(this.zab));
        if (v0_2 == null) {
            this.zaa.trySetResult(Boolean.FALSE);
            return;
        } else {
            v0_2.zab.unregisterListener(p4.zaf(), this.zaa);
            v0_2.zaa.clearListener();
            return;
        }
    }

    public final bridge synthetic void zag(com.google.android.gms.common.api.internal.zaad p1, boolean p2)
    {
        return;
    }
}
