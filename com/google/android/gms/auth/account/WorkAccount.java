package com.google.android.gms.auth.account;
public class WorkAccount {
    public static final com.google.android.gms.common.api.Api API;
    public static final com.google.android.gms.auth.account.WorkAccountApi WorkAccountApi;
    private static final com.google.android.gms.common.api.Api$ClientKey zza;
    private static final com.google.android.gms.common.api.Api$AbstractClientBuilder zzb;

    static WorkAccount()
    {
        com.google.android.gms.internal.auth.zzal v0_1 = new com.google.android.gms.common.api.Api$ClientKey();
        com.google.android.gms.auth.account.WorkAccount.zza = v0_1;
        com.google.android.gms.auth.account.zzf v1_1 = new com.google.android.gms.auth.account.zzf();
        com.google.android.gms.auth.account.WorkAccount.zzb = v1_1;
        com.google.android.gms.auth.account.WorkAccount.API = new com.google.android.gms.common.api.Api("WorkAccount.API", v1_1, v0_1);
        com.google.android.gms.auth.account.WorkAccount.WorkAccountApi = new com.google.android.gms.internal.auth.zzal();
        return;
    }

    private WorkAccount()
    {
        return;
    }

    public static com.google.android.gms.auth.account.WorkAccountClient getClient(android.app.Activity p1)
    {
        return new com.google.android.gms.auth.account.WorkAccountClient(p1);
    }

    public static com.google.android.gms.auth.account.WorkAccountClient getClient(android.content.Context p1)
    {
        return new com.google.android.gms.auth.account.WorkAccountClient(p1);
    }
}
