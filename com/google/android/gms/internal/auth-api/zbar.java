package com.google.android.gms.internal.auth-api;
public final synthetic class zbar implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth-api.zbaw zba;
    public final synthetic com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest zbb;

    public synthetic zbar(com.google.android.gms.internal.auth-api.zbaw p1, com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest p2)
    {
        this.zba = p1;
        this.zbb = p2;
        return;
    }

    public final void accept(Object p4, Object p5)
    {
        ((com.google.android.gms.internal.auth-api.zbad) ((com.google.android.gms.internal.auth-api.zbx) p4).getService()).zbc(new com.google.android.gms.internal.auth-api.zbau(this.zba, ((com.google.android.gms.tasks.TaskCompletionSource) p5)), ((com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zbb)));
        return;
    }
}
