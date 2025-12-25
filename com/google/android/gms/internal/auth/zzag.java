package com.google.android.gms.internal.auth;
final class zzag extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl {
    final synthetic android.accounts.Account zza;

    public zzag(com.google.android.gms.internal.auth.zzal p1, com.google.android.gms.common.api.Api p2, com.google.android.gms.common.api.GoogleApiClient p3, android.accounts.Account p4)
    {
        this.zza = p4;
        super(p2, p3);
        return;
    }

    public final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status p2)
    {
        return new com.google.android.gms.internal.auth.zzak(p2);
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p3)
    {
        ((com.google.android.gms.auth.account.zze) ((com.google.android.gms.internal.auth.zzam) p3).getService()).zze(new com.google.android.gms.internal.auth.zzaf(this), this.zza);
        return;
    }

    public final bridge synthetic void setResult(Object p1)
    {
        this.setResult(((com.google.android.gms.common.api.Result) p1));
        return;
    }
}
