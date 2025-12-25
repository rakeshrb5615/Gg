package com.google.android.gms.common.api.internal;
final class zaac implements com.google.android.gms.tasks.OnCompleteListener {
    final synthetic com.google.android.gms.tasks.TaskCompletionSource zaa;
    final synthetic com.google.android.gms.common.api.internal.zaad zab;

    public zaac(com.google.android.gms.common.api.internal.zaad p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zab = p1;
        this.zaa = p2;
        return;
    }

    public final void onComplete(com.google.android.gms.tasks.Task p2)
    {
        com.google.android.gms.common.api.internal.zaad.zab(this.zab).remove(this.zaa);
        return;
    }
}
