package com.google.android.gms.auth.account;
final class zzg implements com.google.android.gms.common.internal.PendingResultUtil$ResultConverter {

    public zzg(com.google.android.gms.auth.account.WorkAccountClient p1)
    {
        return;
    }

    public final synthetic Object convert(com.google.android.gms.common.api.Result p1)
    {
        return ((com.google.android.gms.auth.account.WorkAccountApi$AddAccountResult) p1).getAccount();
    }
}
