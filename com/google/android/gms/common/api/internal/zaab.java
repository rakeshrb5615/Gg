package com.google.android.gms.common.api.internal;
final class zaab implements com.google.android.gms.common.api.PendingResult$StatusListener {
    final synthetic com.google.android.gms.common.api.internal.BasePendingResult zaa;
    final synthetic com.google.android.gms.common.api.internal.zaad zab;

    public zaab(com.google.android.gms.common.api.internal.zaad p1, com.google.android.gms.common.api.internal.BasePendingResult p2)
    {
        this.zab = p1;
        this.zaa = p2;
        return;
    }

    public final void onComplete(com.google.android.gms.common.api.Status p2)
    {
        com.google.android.gms.common.api.internal.zaad.zaa(this.zab).remove(this.zaa);
        return;
    }
}
