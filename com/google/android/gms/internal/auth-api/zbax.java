package com.google.android.gms.internal.auth-api;
public final synthetic class zbax implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth-api.zbbg zba;
    public final synthetic com.google.android.gms.auth.api.identity.BeginSignInRequest zbb;

    public synthetic zbax(com.google.android.gms.internal.auth-api.zbbg p1, com.google.android.gms.auth.api.identity.BeginSignInRequest p2)
    {
        this.zba = p1;
        this.zbb = p2;
        return;
    }

    public final void accept(Object p4, Object p5)
    {
        ((com.google.android.gms.internal.auth-api.zbam) ((com.google.android.gms.internal.auth-api.zbbh) p4).getService()).zbc(new com.google.android.gms.internal.auth-api.zbbc(this.zba, ((com.google.android.gms.tasks.TaskCompletionSource) p5)), ((com.google.android.gms.auth.api.identity.BeginSignInRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zbb)));
        return;
    }
}
