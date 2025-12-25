package com.google.android.gms.auth.api.accounttransfer;
public class AccountTransferClient extends com.google.android.gms.common.api.GoogleApi {
    public static final synthetic int zza;
    private static final com.google.android.gms.common.api.Api$ClientKey zzb;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zzc;
    private static final com.google.android.gms.common.api.Api zzd;

    static AccountTransferClient()
    {
        com.google.android.gms.common.api.Api$ClientKey v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzb = v0_1;
        com.google.android.gms.auth.api.accounttransfer.zzb v1_1 = new com.google.android.gms.auth.api.accounttransfer.zzb();
        com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzc = v1_1;
        com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzd = new com.google.android.gms.common.api.Api("AccountTransfer.ACCOUNT_TRANSFER_API", v1_1, v0_1);
        return;
    }

    public AccountTransferClient(android.app.Activity p4, com.google.android.gms.auth.api.accounttransfer.zzr p5)
    {
        super(p4, com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzd, com.google.android.gms.auth.api.accounttransfer.zzr.zza, new com.google.android.gms.common.api.GoogleApi$Settings$Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
        return;
    }

    public AccountTransferClient(android.content.Context p4, com.google.android.gms.auth.api.accounttransfer.zzr p5)
    {
        super(p4, com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzd, com.google.android.gms.auth.api.accounttransfer.zzr.zza, new com.google.android.gms.common.api.GoogleApi$Settings$Builder().setMapper(new com.google.android.gms.common.api.internal.ApiExceptionMapper()).build());
        return;
    }

    public com.google.android.gms.tasks.Task getDeviceMetaData(String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        return this.doRead(new com.google.android.gms.auth.api.accounttransfer.zzg(this, 1608, new com.google.android.gms.internal.auth.zzaq(p3)));
    }

    public com.google.android.gms.tasks.Task notifyCompletion(String p2, int p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        return this.doWrite(new com.google.android.gms.auth.api.accounttransfer.zzi(this, 1610, new com.google.android.gms.internal.auth.zzav(p2, p3)));
    }

    public com.google.android.gms.tasks.Task retrieveData(String p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        return this.doRead(new com.google.android.gms.auth.api.accounttransfer.zze(this, 1607, new com.google.android.gms.internal.auth.zzax(p3)));
    }

    public com.google.android.gms.tasks.Task sendData(String p2, byte[] p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        return this.doWrite(new com.google.android.gms.auth.api.accounttransfer.zzc(this, 1606, new com.google.android.gms.internal.auth.zzaz(p2, p3)));
    }

    public com.google.android.gms.tasks.Task showUserChallenge(String p2, android.app.PendingIntent p3)
    {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p2);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(p3);
        return this.doWrite(new com.google.android.gms.auth.api.accounttransfer.zzh(this, 1609, new com.google.android.gms.internal.auth.zzbb(p2, p3)));
    }
}
