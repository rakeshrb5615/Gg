package com.google.android.gms.internal.auth;
final class zzae extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl {
    final synthetic String zza;

    public zzae(com.google.android.gms.internal.auth.zzal p1, com.google.android.gms.common.api.Api p2, com.google.android.gms.common.api.GoogleApiClient p3, String p4)
    {
        this.zza = p4;
        super(p2, p3);
        return;
    }

    public final synthetic com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status p3)
    {
        return new com.google.android.gms.internal.auth.zzai(p3, 0);
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p3)
    {
        ((com.google.android.gms.auth.account.zze) ((com.google.android.gms.internal.auth.zzam) p3).getService()).zzd(new com.google.android.gms.internal.auth.zzad(this), this.zza);
        return;
    }

    public final bridge synthetic void setResult(Object p1)
    {
        this.setResult(((com.google.android.gms.common.api.Result) p1));
        return;
    }
}
