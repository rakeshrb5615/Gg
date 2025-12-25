package com.google.android.gms.internal.auth;
final class zzac extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl {
    final synthetic boolean zza;

    public zzac(com.google.android.gms.internal.auth.zzal p1, com.google.android.gms.common.api.Api p2, com.google.android.gms.common.api.GoogleApiClient p3, boolean p4)
    {
        this.zza = p4;
        super(p2, p3);
        return;
    }

    public final com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status p2)
    {
        return new com.google.android.gms.internal.auth.zzaj(p2);
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p2)
    {
        ((com.google.android.gms.auth.account.zze) ((com.google.android.gms.internal.auth.zzam) p2).getService()).zzf(this.zza);
        this.setResult(new com.google.android.gms.internal.auth.zzaj(com.google.android.gms.common.api.Status.RESULT_SUCCESS));
        return;
    }

    public final bridge synthetic void setResult(Object p1)
    {
        this.setResult(((com.google.android.gms.common.api.Result) p1));
        return;
    }
}
