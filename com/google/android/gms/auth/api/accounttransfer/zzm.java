package com.google.android.gms.auth.api.accounttransfer;
final class zzm extends com.google.android.gms.internal.auth.zzan {
    final synthetic com.google.android.gms.auth.api.accounttransfer.zzn zza;

    public zzm(com.google.android.gms.auth.api.accounttransfer.zzn p1)
    {
        this.zza = p1;
        return;
    }

    public final void zzd(com.google.android.gms.common.api.Status p3)
    {
        this.zza.zzb.setException(new com.google.android.gms.auth.api.accounttransfer.AccountTransferException(p3));
        return;
    }

    public final void zze()
    {
        this.zza.zzb.setResult(0);
        return;
    }
}
