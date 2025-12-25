package com.google.android.gms.auth.api.accounttransfer;
abstract class zzl extends com.google.android.gms.common.api.internal.TaskApiCall {
    protected com.google.android.gms.tasks.TaskCompletionSource zzb;

    public synthetic zzl(int p2, com.google.android.gms.auth.api.accounttransfer.zzk p3)
    {
        super(0, 0, p2);
        return;
    }

    public final bridge synthetic void doExecute(com.google.android.gms.common.api.Api$AnyClient p1, com.google.android.gms.tasks.TaskCompletionSource p2)
    {
        this.zzb = p2;
        this.zza(((com.google.android.gms.internal.auth.zzau) ((com.google.android.gms.internal.auth.zzap) p1).getService()));
        return;
    }

    public abstract void zza();
}
