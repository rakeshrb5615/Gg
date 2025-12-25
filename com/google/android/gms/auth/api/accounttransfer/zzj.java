package com.google.android.gms.auth.api.accounttransfer;
 class zzj extends com.google.android.gms.internal.auth.zzan {
    final com.google.android.gms.auth.api.accounttransfer.zzl zzb;

    public zzj(com.google.android.gms.auth.api.accounttransfer.zzl p1)
    {
        this.zzb = p1;
        return;
    }

    public final void zzd(com.google.android.gms.common.api.Status p3)
    {
        this.zzb.zzb.setException(new com.google.android.gms.auth.api.accounttransfer.AccountTransferException(p3));
        return;
    }
}
