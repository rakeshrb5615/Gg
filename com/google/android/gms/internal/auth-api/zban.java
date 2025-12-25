package com.google.android.gms.internal.auth-api;
public final synthetic class zban implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth-api.zbaq zba;
    public final synthetic com.google.android.gms.auth.api.identity.AuthorizationRequest zbb;

    public synthetic zban(com.google.android.gms.internal.auth-api.zbaq p1, com.google.android.gms.auth.api.identity.AuthorizationRequest p2)
    {
        this.zba = p1;
        this.zbb = p2;
        return;
    }

    public final void accept(Object p4, Object p5)
    {
        ((com.google.android.gms.internal.auth-api.zbaa) ((com.google.android.gms.internal.auth-api.zbw) p4).getService()).zbc(new com.google.android.gms.internal.auth-api.zbap(this.zba, ((com.google.android.gms.tasks.TaskCompletionSource) p5)), ((com.google.android.gms.auth.api.identity.AuthorizationRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zbb)));
        return;
    }
}
