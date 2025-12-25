package com.google.android.gms.internal.auth-api;
public final synthetic class zbba implements com.google.android.gms.common.api.internal.RemoteCall {
    public final synthetic com.google.android.gms.internal.auth-api.zbbg zba;
    public final synthetic com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest zbb;

    public synthetic zbba(com.google.android.gms.internal.auth-api.zbbg p1, com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest p2)
    {
        this.zba = p1;
        this.zbb = p2;
        return;
    }

    public final void accept(Object p3, Object p4)
    {
        this.zba.zba(this.zbb, ((com.google.android.gms.internal.auth-api.zbbh) p3), ((com.google.android.gms.tasks.TaskCompletionSource) p4));
        return;
    }
}
