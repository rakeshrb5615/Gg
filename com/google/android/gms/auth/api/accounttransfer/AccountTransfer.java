package com.google.android.gms.auth.api.accounttransfer;
public final class AccountTransfer {
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    public static final com.google.android.gms.common.api.Api zza;
    public static final com.google.android.gms.internal.auth.zzao zzb;
    public static final com.google.android.gms.internal.auth.zzao zzc;
    private static final com.google.android.gms.common.api.Api$ClientKey zzd;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zze;

    static AccountTransfer()
    {
        com.google.android.gms.internal.auth.zzao v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.auth.api.accounttransfer.AccountTransfer.zzd = v0_1;
        com.google.android.gms.auth.api.accounttransfer.zza v1_1 = new com.google.android.gms.auth.api.accounttransfer.zza();
        com.google.android.gms.auth.api.accounttransfer.AccountTransfer.zze = v1_1;
        com.google.android.gms.auth.api.accounttransfer.AccountTransfer.zza = new com.google.android.gms.common.api.Api("AccountTransfer.ACCOUNT_TRANSFER_API", v1_1, v0_1);
        com.google.android.gms.auth.api.accounttransfer.AccountTransfer.zzb = new com.google.android.gms.internal.auth.zzao();
        com.google.android.gms.auth.api.accounttransfer.AccountTransfer.zzc = new com.google.android.gms.internal.auth.zzao();
        return;
    }

    private AccountTransfer()
    {
        return;
    }

    public static com.google.android.gms.auth.api.accounttransfer.AccountTransferClient getAccountTransferClient(android.app.Activity p2)
    {
        return new com.google.android.gms.auth.api.accounttransfer.AccountTransferClient(p2, 0);
    }

    public static com.google.android.gms.auth.api.accounttransfer.AccountTransferClient getAccountTransferClient(android.content.Context p2)
    {
        return new com.google.android.gms.auth.api.accounttransfer.AccountTransferClient(p2, 0);
    }
}
